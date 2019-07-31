package com.mihir.googlesearch.viewmodel;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Transformations;
import android.arch.lifecycle.ViewModel;
import android.arch.paging.LivePagedListBuilder;
import android.arch.paging.PagedList;

import com.mihir.googlesearch.model.SearchResponse.Item;
import com.mihir.googlesearch.movie_datasource.SearchDataSourceClass;
import com.mihir.googlesearch.movie_datasource.SearchDataSourceFactory;
import com.mihir.googlesearch.rest.Repository;

import io.reactivex.disposables.CompositeDisposable;


/**
 * Created by mihir on 28-07-2019.
 */
public class PagingMovieViewModel extends ViewModel {

    private SearchDataSourceFactory searchDataSourceFactory;
    private LiveData<PagedList<Item>> listLiveData;

    private LiveData<String> progressLoadStatus = new MutableLiveData<>();
    private CompositeDisposable compositeDisposable = new CompositeDisposable();

    public PagingMovieViewModel(Repository repository) {
        searchDataSourceFactory = new SearchDataSourceFactory(repository, compositeDisposable);
        initializePaging();
    }

    private String query = "";

    private void initializePaging() {

        PagedList.Config pagedListConfig =
                new PagedList.Config.Builder()
                        .setEnablePlaceholders(true)
                        .setInitialLoadSizeHint(10)
                        .setPageSize(10).build();

        searchDataSourceFactory.query = query;
        listLiveData = new LivePagedListBuilder<>(searchDataSourceFactory, pagedListConfig)
                .build();

        progressLoadStatus = Transformations.switchMap(searchDataSourceFactory.getMutableLiveData(), SearchDataSourceClass::getProgressLiveStatus);

    }

    public void replaceSubscription(LifecycleOwner lifecycleOwner, String query) {
        this.query = query;
        listLiveData.removeObservers(lifecycleOwner);
        initializePaging();
    }

    public LiveData<String> getProgressLoadStatus() {
        return progressLoadStatus;
    }

    public LiveData<PagedList<Item>> getListLiveData() {
        return listLiveData;
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        compositeDisposable.clear();
    }
}