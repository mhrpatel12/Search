package com.mihir.googlesearch.movie_datasource;

import android.annotation.SuppressLint;
import android.arch.lifecycle.MutableLiveData;
import android.arch.paging.PageKeyedDataSource;
import android.support.annotation.NonNull;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.mihir.googlesearch.model.SearchResponse.Item;
import com.mihir.googlesearch.model.SearchResponse.SearchResponse;
import com.mihir.googlesearch.utils.Constant;
import com.mihir.googlesearch.rest.Repository;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by mihir on 28-07-2019.
 */
public class SearchDataSourceClass extends PageKeyedDataSource<Integer, Item> {

    private Repository repository;
    private int sourceIndex;
    private MutableLiveData<String> progressLiveStatus;
    private CompositeDisposable compositeDisposable;
    private String query;
    private long results = 0;

    SearchDataSourceClass(Repository repository, String query, CompositeDisposable compositeDisposable) {
        this.repository = repository;
        this.query = query;
        this.compositeDisposable = compositeDisposable;
        progressLiveStatus = new MutableLiveData<>();
    }


    public MutableLiveData<String> getProgressLiveStatus() {
        return progressLiveStatus;
    }

    @SuppressLint("CheckResult")
    @Override
    public void loadInitial(@NonNull LoadInitialParams<Integer> params, @NonNull LoadInitialCallback<Integer, Item> callback) {

        repository.searchMovies(query, sourceIndex)
                .doOnSubscribe(disposable ->
                {
                    compositeDisposable.add(disposable);
                    progressLiveStatus.postValue(Constant.LOADING);
                })
                .subscribe(
                        (JsonElement result) ->
                        {
                            progressLiveStatus.postValue(Constant.LOADED);

                            SearchResponse moviesResponse = new Gson().fromJson(result, SearchResponse.class);
                            if (!moviesResponse.getItems().isEmpty()) {
                                results = results + moviesResponse.getQueries().getRequest().get(0).getCount();
                                sourceIndex++;
                                callback.onResult(moviesResponse.getItems(), null, results >= Long.parseLong(moviesResponse.getSearchInformation().getTotalResults()) ? null : sourceIndex);
                            }
                        },
                        throwable ->
                                progressLiveStatus.postValue(Constant.LOADED)

                );

    }

    @Override
    public void loadBefore(@NonNull LoadParams<Integer> params, @NonNull LoadCallback<Integer, Item> callback) {

    }

    @SuppressLint("CheckResult")
    @Override
    public void loadAfter(@NonNull LoadParams<Integer> params, @NonNull LoadCallback<Integer, Item> callback) {

        repository.searchMovies(query, params.key)
                .doOnSubscribe(disposable ->
                {
                    compositeDisposable.add(disposable);
                    progressLiveStatus.postValue(Constant.LOADING);
                })
                .subscribe((JsonElement result) -> {
                            progressLiveStatus.postValue(Constant.LOADED);
                            SearchResponse moviesResponse = new Gson().fromJson(result, SearchResponse.class);
                            results = results + moviesResponse.getQueries().getRequest().get(0).getCount();
                            if (!moviesResponse.getItems().isEmpty()) {
                                callback.onResult(moviesResponse.getItems(), results >= Long.parseLong(moviesResponse.getSearchInformation().getTotalResults()) ? null : params.key + 1);
                            }
                        },
                        throwable ->
                                progressLiveStatus.postValue(Constant.LOADED)
                );
    }
}