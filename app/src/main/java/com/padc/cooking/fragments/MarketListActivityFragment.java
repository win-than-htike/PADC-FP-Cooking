package com.padc.cooking.fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.padc.cooking.CookingApp;
import com.padc.cooking.R;
import com.padc.cooking.VO.MarketListVO;
import com.padc.cooking.adapters.MarketRVAdapter;
import com.padc.cooking.views.holders.MarketViewHolder;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class MarketListActivityFragment extends android.app.Fragment {


    @BindView(R.id.rv_markets)
    RecyclerView rvMarkets;

    private MarketRVAdapter mMarketRVAdapter;

    private MarketViewHolder.ControllerAttractionItem controllerAttractionItem;



    public static MarketListActivityFragment newInstance() {
        MarketListActivityFragment fragment = new MarketListActivityFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        View rootView =inflater.inflate(R.layout.fragment_market_list_activity,container,false);
        ButterKnife.bind(this, rootView);

        mMarketRVAdapter = new MarketRVAdapter(null,controllerAttractionItem);
        rvMarkets.setAdapter(mMarketRVAdapter);
        rvMarkets.setLayoutManager(new GridLayoutManager(CookingApp.getContext(),1));
        return rootView;
    }

}
