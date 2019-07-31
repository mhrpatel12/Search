package com.mihir.googlesearch.view;

import android.arch.paging.PagedListAdapter;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mihir.googlesearch.R;
import com.mihir.googlesearch.databinding.ViewholderMovieBinding;
import com.mihir.googlesearch.model.SearchResponse.Item;

/**
 * Created by mihir on 28-07-2019.
 */

public class SearchAdapter extends PagedListAdapter<Item, SearchAdapter.MyViewHolder> {

    ItemTappedListener itemTappedListener;

    SearchAdapter(ItemTappedListener itemTappedListener) {
        super(Item.DIFF_CALLBACK);
        this.itemTappedListener = itemTappedListener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        ViewholderMovieBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.viewholder_movie, parent, false);

        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, int position) {
        holder.binding.setModel(getItem(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (itemTappedListener != null) {
                    itemTappedListener.itemTapped(getItem(position));
                }
            }
        });
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        ViewholderMovieBinding binding;

        MyViewHolder(ViewholderMovieBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

    }
}
