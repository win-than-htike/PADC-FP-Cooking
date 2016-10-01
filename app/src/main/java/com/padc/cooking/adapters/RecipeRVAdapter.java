package com.padc.cooking.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padc.cooking.CookingApp;
import com.padc.cooking.R;

import com.padc.cooking.data.models.VO.RecipeVO;
import com.padc.cooking.views.holders.RecipeViewHolder;

import java.util.List;

/**
 * Created by winthanhtike on 9/6/16.
 */
public class RecipeRVAdapter extends RecyclerView.Adapter<RecipeViewHolder> {

    private LayoutInflater mInflater;
    private List<RecipeVO> mRecipeList;
    private RecipeViewHolder.RecipeItemController mControllerRecipeItem;


    public RecipeRVAdapter(List<RecipeVO> recipeList, RecipeViewHolder.RecipeItemController controllerRecipeItem) {
        mInflater = LayoutInflater.from(CookingApp.getContext());
        mRecipeList = recipeList;
        mControllerRecipeItem = controllerRecipeItem;
    }


    @Override
    public RecipeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.list_item_card, parent, false);
        return new RecipeViewHolder(itemView, mControllerRecipeItem);
    }

    @Override
    public void onBindViewHolder(RecipeViewHolder holder, int position) {
//        holder.bindData(mRecipeList.get(position));
        holder.bindData();
    }

    @Override
    public int getItemCount() {
//        return mRecipeList.size();
        return 4;
    }
}
