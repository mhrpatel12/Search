package com.mihir.googlesearch.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by mihir on 28-07-2019.
 */

public class Constant {

    public final static String LOADING = "Loading";
    public final static String LOADED = "Loaded";
    public final static String CHECK_NETWORK_ERROR = "Check your network connection.";
    public final static String API_KEY = "AIzaSyCIjxAB5-8nEEhIx0fN9UHg1VgJGny2Im4";
    public final static String CX = "011476162607576381860:ra4vmliv9ti";

    public static boolean checkInternetConnection(Context context) {
        ConnectivityManager connectivity = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivity == null) {
            return false;
        } else {
            NetworkInfo[] info = connectivity.getAllNetworkInfo();
            if (info != null) {
                for (NetworkInfo anInfo : info) {
                    if (anInfo.getState() == NetworkInfo.State.CONNECTED) {
                        return true;
                    }
                }
            }
        }
        return false;
    }


    public final static String ITEM = "item";
    public final static String SEARCH_QUERY = "query";

}