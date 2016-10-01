package com.padc.cooking.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.padc.cooking.R;
import com.padc.cooking.adapters.FoodDetailPagerAdapter;
import com.padc.cooking.adapters.RecipeRVAdapter;
import com.padc.cooking.data.models.RecipeModel;
import com.padc.cooking.data.models.VO.RecipeVO;
import com.padc.cooking.views.holders.RecipeViewHolder;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Su Su Oo on 11-Sep-16.
 */
public class IngredientFragment extends BaseFragment {

   @BindView(R.id.tv_food_ingredient)
   TextView tv_food_ingredient;
       public static IngredientFragment newInstance(){
        IngredientFragment fragment = new IngredientFragment();
        return fragment;
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_ingredient, container, false);
        ButterKnife.bind(this, rootView);
        tv_food_ingredient.setText("bhgagjakhgaog");


        return rootView;


    }

    @Override
    protected void onSendScreenHit() {

    }
}
