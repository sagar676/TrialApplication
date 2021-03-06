package com.example.heni.MyApp.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.heni.MyApp.R;
import com.example.heni.MyApp.models.Post;
import com.example.heni.MyApp.utilities.CommonRecyclerItem;
import com.example.heni.MyApp.viewholders.PostViewHolder;

import java.util.List;

/**
 * Created by heni on 12/7/17.
 */

public class PostAdapter extends RecyclerView.Adapter {

    Context context;
    Post postList;
    LayoutInflater layoutInflater;
    List<CommonRecyclerItem> recyclerItems;

    public PostAdapter(Context context,List<CommonRecyclerItem> recyclerItems){
        this.context = context;
        this.recyclerItems = recyclerItems;
        this.layoutInflater = LayoutInflater.from(context);
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = layoutInflater.inflate(R.layout.vh_post_item, parent, false);
        return new PostViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((PostViewHolder) holder).bindItem(recyclerItems.get(position));
    }

    @Override
    public int getItemCount() {
        return recyclerItems.size();
    }

    @Override
    public int getItemViewType(int position) {
        return recyclerItems.get(position).getItemType().getId();
    }

    public List<CommonRecyclerItem> getRecyclerItems() {
        return recyclerItems;
    }

    public void setRecyclerItems(List<CommonRecyclerItem> recyclerItems) {
        this.recyclerItems = recyclerItems;
    }


}
