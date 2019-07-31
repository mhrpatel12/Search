package com.mihir.googlesearch.di;

import com.mihir.googlesearch.view.SearchActivity;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {UtilsModule.class})
@Singleton
public interface AppComponent {

    void doInjection(SearchActivity searchActivity);

}
