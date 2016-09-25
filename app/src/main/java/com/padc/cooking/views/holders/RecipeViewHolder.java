package com.padc.cooking.views.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.padc.cooking.R;
import com.padc.cooking.controllers.FoodItemController;

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

    private FoodItemController mController;

    public RecipeViewHolder(View itemView, final FoodItemController controller) {
        super(itemView);
        ButterKnife.bind(this,itemView);
        mController = controller;
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                controller.onTapFoodItem();
            }
        });


    }

    public void dataBind(){


    }


}
