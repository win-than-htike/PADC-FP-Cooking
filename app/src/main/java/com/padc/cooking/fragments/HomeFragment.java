package com.padc.cooking.fragments;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padc.cooking.R;
import com.padc.cooking.adapters.FoodTypeVIewPagerAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A placeholder fragment containing a simple view.
 */
public class HomeFragment extends Fragment {

    @BindView(R.id.vp_food_type)
    ViewPager mViewPagerFoodType;

    @BindView(R.id.tabs_food_type)
    TabLayout mTabsFoodType;

    public HomeFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this,rootView);

        // setup View Pager
        mViewPagerFoodType.setOffscreenPageLimit(2);
        setupViewPager(mViewPagerFoodType);

        // setup View Pager with Tabs
        mTabsFoodType.setupWithViewPager(mViewPagerFoodType);

        return rootView;
    }

    private void setupViewPager(ViewPager mViewPagerFoodType) {

        // add Fragment to View Pager Adapter
        FoodTypeVIewPagerAdapter foodTypePagerAdapter = new FoodTypeVIewPagerAdapter(getFragmentManager());
        foodTypePagerAdapter.addFragment(new MyanmarFragment(),"Myanmar Food");
        foodTypePagerAdapter.addFragment(new ChineseFragment(),"Chinese Food");

        // setup with adapter
        mViewPagerFoodType.setAdapter(foodTypePagerAdapter);

    }
}
