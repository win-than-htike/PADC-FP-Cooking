package com.padc.cooking.views.holders;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.padc.cooking.CookingApp;
import com.padc.cooking.R;
import com.padc.cooking.activities.FoodDetailActivity;
import com.padc.cooking.controllers.BaseController;

import com.padc.cooking.data.models.VO.RecipeVO;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by winthanhtike on 9/6/16.
 */
public class RecipeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    @BindView(R.id.iv_food)
    ImageView ivFoodImage;

    @BindView(R.id.tv_food_name)
    TextView tvFoodName;

    private RecipeItemController mRecipeController;
    private RecipeVO mRecipe;

    public RecipeViewHolder(View itemView, RecipeItemController controller) {
        super(itemView);
        ButterKnife.bind(this, itemView);
        itemView.setOnClickListener(this);
        mRecipeController = controller;
    }

//    public void bindData(RecipeVO recipe)
    public void bindData( ) {
//        mRecipe = recipe;

//        Log.d(CookingApp.TAG, recipe.getRecipe_name());

//        tvFoodName.setText(recipe.getRecipe_name());
        tvFoodName.setText("Pork Curry");
        int img = R.drawable.buu_thee;
        Glide.with(ivFoodImage.getContext())
                .load(img)
                .centerCrop()
                .placeholder(R.drawable.buu_thee)
                .error(R.drawable.buu_thee)
                .into(ivFoodImage);
    }


    @Override
    public void onClick(View view) {
//        mRecipeController.onTapArticle(mRecipe);
        Intent intentRecipe = FoodDetailActivity.newIntent();
        intentRecipe.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        CookingApp.getContext().startActivity(intentRecipe);
    }

    public interface RecipeItemController extends BaseController {
        void onTapArticle(RecipeVO mRecipe);
    }

}
