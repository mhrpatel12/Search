package com.mihir.googlesearch.rest;

import com.google.gson.JsonElement;
import com.mihir.googlesearch.utils.Urls;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by mihir on 28-07-2019.
 */
public interface ApiCallInterface {

    @GET(Urls.searchMovies)
    Observable<JsonElement> searchMovies(
            @Query("q") String query,
            @Query("cx") String cx,
            @Query("key") String apiKey,
            @Query("start") int page);
}