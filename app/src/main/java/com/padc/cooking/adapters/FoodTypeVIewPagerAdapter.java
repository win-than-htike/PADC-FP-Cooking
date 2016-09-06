package com.padc.cooking.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by winthanhtike on 9/5/16.
 */
public class FoodTypeVIewPagerAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> mFragmentList = new ArrayList<>();
    private List<String> mTitle = new ArrayList<>();

    public FoodTypeVIewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }


    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitle.get(position);
    }

    // add Fragment and Tabs title to Fragment List and String List
    public void addFragment(Fragment fragment,String titile){
        mFragmentList.add(fragment);
        mTitle.add(titile);
    }

}
