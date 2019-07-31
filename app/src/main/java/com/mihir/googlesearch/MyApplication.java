package com.mihir.googlesearch;

import android.app.Application;
import android.content.Context;

import com.mihir.googlesearch.di.AppComponent;
import com.mihir.googlesearch.di.DaggerAppComponent;
import com.mihir.googlesearch.di.UtilsModule;


/**
 * Created by mihir on 28-07-2019.
 */

public class MyApplication extends Application {
    AppComponent appComponent;
    Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        appComponent = DaggerAppComponent.builder().utilsModule(new UtilsModule()).build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    @Override
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}