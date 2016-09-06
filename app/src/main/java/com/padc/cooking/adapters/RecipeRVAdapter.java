package com.padc.cooking.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padc.cooking.CookingApp;
import com.padc.cooking.R;
import com.padc.cooking.views.holders.RecipeViewHolder;

/**
 * Created by winthanhtike on 9/6/16.
 */
public class RecipeRVAdapter extends RecyclerView.Adapter<RecipeViewHolder> {

    private LayoutInflater inflater;

    public RecipeRVAdapter() {
            inflater = LayoutInflater.from(CookingApp.getContext());
    }

    @Override
    public RecipeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item_card,parent,false);
        return new RecipeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecipeViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 6;
    }
}
