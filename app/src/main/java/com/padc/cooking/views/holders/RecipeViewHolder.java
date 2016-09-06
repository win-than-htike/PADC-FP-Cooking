package com.padc.cooking.views.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.padc.cooking.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by winthanhtike on 9/6/16.
 */
public class RecipeViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.iv_food)
    ImageView ivFoodImage;

    @BindView(R.id.tv_food_name)
    TextView tvFoodName;

    public RecipeViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);

    }

    public void dataBind(){

    }


}
