package com.mihir.googlesearch.movie_datasource;

import android.arch.lifecycle.MutableLiveData;
import android.arch.paging.DataSource;

import com.mihir.googlesearch.model.SearchResponse.Item;
import com.mihir.googlesearch.rest.Repository;

import io.reactivex.disposables.CompositeDisposable;


/**
 * Created by mihir on 28-07-2019.
 */
public class SearchDataSourceFactory extends DataSource.Factory<Integer, Item> {

    private MutableLiveData<SearchDataSourceClass> liveData;
    private Repository repository;
    private CompositeDisposable compositeDisposable;
    public String query;

    public SearchDataSourceFactory(Repository repository, CompositeDisposable compositeDisposable) {
        this.repository = repository;
        this.compositeDisposable = compositeDisposable;
        liveData = new MutableLiveData<>();
    }

    public MutableLiveData<SearchDataSourceClass> getMutableLiveData() {
        return liveData;
    }

    @Override
    public DataSource<Integer, Item> create() {
        SearchDataSourceClass dataSourceClass = new SearchDataSourceClass(repository, query, compositeDisposable);
        liveData.postValue(dataSourceClass);
        return dataSourceClass;
    }
}