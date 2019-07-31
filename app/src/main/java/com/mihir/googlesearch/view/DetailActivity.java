package com.mihir.googlesearch.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatImageView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.mihir.googlesearch.R;
import com.mihir.googlesearch.model.SearchResponse.Item;
import com.mihir.googlesearch.utils.Constant;

/**
 * Created by mihir on 28-07-2019.
 */
public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        if (getIntent() != null && getIntent().getParcelableExtra(Constant.ITEM) != null) {
            Item item = getIntent().getParcelableExtra(Constant.ITEM);
            if (item.getPagemap() != null && item.getPagemap().getCseImage() != null && !item.getPagemap().getCseImage().isEmpty()) {
                Glide.with(this).load(item.getPagemap().getCseImage().get(0).getSrc()).placeholder(R.drawable.placeholder).apply(RequestOptions.centerCropTransform()).into(((ImageView) findViewById(R.id.imgSearch)));
            }
            ((TextView) findViewById(R.id.txtTitle)).setText(item.getTitle());
            ((TextView) findViewById(R.id.txtSnippet)).setText(item.getSnippet());
        }
    }
}