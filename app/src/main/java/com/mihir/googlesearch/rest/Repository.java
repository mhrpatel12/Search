package com.mihir.googlesearch.rest;

import com.google.gson.JsonElement;
import com.mihir.googlesearch.utils.Constant;

import io.reactivex.Observable;

/**
 * Created by mihir on 28-07-2019.
 */

public class Repository {

    private ApiCallInterface apiCallInterface;

    public Repository(ApiCallInterface apiCallInterface) {
        this.apiCallInterface = apiCallInterface;
    }

    /*
     * method to call search api
     * */
    public Observable<JsonElement> searchMovies(String query, int index) {
        return apiCallInterface.searchMovies(query, Constant.CX, Constant.API_KEY, index + 1);
    }
}