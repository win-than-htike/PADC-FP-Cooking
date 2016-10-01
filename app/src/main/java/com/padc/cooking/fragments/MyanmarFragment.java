package com.padc.cooking.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padc.cooking.CookingApp;
import com.padc.cooking.R;
import com.padc.cooking.adapters.FoodDetailPagerAdapter;
import com.padc.cooking.adapters.RecipeRVAdapter;

import com.padc.cooking.views.holders.RecipeViewHolder;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyanmarFragment extends BaseFragment {


    @BindView(R.id.tabs)
    TabLayout tabFood;

    @BindView(R.id.pager)
    ViewPager ViewpagerFood;

    private RecipeViewHolder.RecipeItemController mController;



    private FoodDetailPagerAdapter mFoodPagerAdapter;

    public static MyanmarFragment newInstance(){
        MyanmarFragment fragment = new MyanmarFragment();
        return fragment;
    }



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mFoodPagerAdapter = new FoodDetailPagerAdapter(getChildFragmentManager());
        mFoodPagerAdapter.addTab(IngredientFragment.newInstance(), getString(R.string.ingredient));
        mFoodPagerAdapter.addTab(MethodFragment.newInstance(), getString(R.string.method));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_myanmar, container, false);
        ButterKnife.bind(this,view);

        ViewpagerFood.setAdapter(mFoodPagerAdapter);
        ViewpagerFood.setOffscreenPageLimit(mFoodPagerAdapter.getCount());

        tabFood.setupWithViewPager(ViewpagerFood);

        // recycler view setup and setup with Layout Manager
//        rvMynamarFood.setHasFixedSize(true);
//        rvMynamarFood.setLayoutManager(new LinearLayoutManager(CookingApp.getContext(),LinearLayoutManager.VERTICAL,false));


        return view;
    }


    @Override
    protected void onSendScreenHit() {

    }
}
