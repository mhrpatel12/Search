package com.mihir.googlesearch.view;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.mihir.googlesearch.R;

/**
 * Created by mihir on 28-07-2019.
 */
public class ImageBinder {

    @BindingAdapter({"imageURL"})
    public static void loadImage(ImageView img, String imageUrl) {
//        Glide.with(img.getContext()).load("https://image.tmdb.org/t/p/w342" + imageUrl).placeholder(R.drawable.placeholder).into(img);
        Glide.with(img.getContext()).load(imageUrl).placeholder(R.drawable.placeholder).into(img);
    }
}
