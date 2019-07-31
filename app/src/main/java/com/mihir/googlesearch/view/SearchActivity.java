package com.mihir.googlesearch.view;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import com.mihir.googlesearch.MyApplication;
import com.mihir.googlesearch.R;
import com.mihir.googlesearch.databinding.MainActivityBinding;
import com.mihir.googlesearch.model.SearchResponse.Item;
import com.mihir.googlesearch.rest.ViewModelFactory;
import com.mihir.googlesearch.utils.Constant;
import com.mihir.googlesearch.viewmodel.PagingMovieViewModel;

import java.util.Objects;

import javax.inject.Inject;

/**
 * Created by mihir on 28-07-2019.
 */
public class SearchActivity extends AppCompatActivity implements ItemTappedListener {

    @Inject
    ViewModelFactory viewModelFactory;
    PagingMovieViewModel viewModel;

    MainActivityBinding binding;
    SearchAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.main_activity);
        ((MyApplication) getApplication()).getAppComponent().doInjection(this);
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(PagingMovieViewModel.class);
        init();

        if (getIntent() != null && !TextUtils.isEmpty(getIntent().getStringExtra(Constant.SEARCH_QUERY))) {
            viewModel.replaceSubscription(SearchActivity.this, getIntent().getStringExtra(Constant.SEARCH_QUERY));
            viewModel.getListLiveData().observe(SearchActivity.this, adapter::submitList);
            ((TextView) findViewById(R.id.txtQuery)).setText(getIntent().getStringExtra(Constant.SEARCH_QUERY));
        }
    }

    private void init() {

        binding.list.setLayoutManager(new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false));
        adapter = new SearchAdapter(this);
        binding.list.setAdapter(adapter);

        if (!Constant.checkInternetConnection(this)) {
            Snackbar.make(findViewById(android.R.id.content), Constant.CHECK_NETWORK_ERROR, Snackbar.LENGTH_SHORT)
                    .show();
        }

        viewModel.getListLiveData().observe(this, adapter::submitList);

        viewModel.getProgressLoadStatus().observe(this, status -> {
            if (Objects.requireNonNull(status).equalsIgnoreCase(Constant.LOADING)) {
                binding.progress.setVisibility(View.VISIBLE);
            } else if (status.equalsIgnoreCase(Constant.LOADED)) {
                binding.progress.setVisibility(View.GONE);
            }
        });

    }

    @Override
    public void itemTapped(Item item) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(Constant.ITEM, item);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_from_right, R.anim.exit_to_left);
    }
}