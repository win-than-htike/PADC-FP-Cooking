package com.padc.cooking.fragments;



import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padc.cooking.CookingApp;
import com.padc.cooking.R;
import com.padc.cooking.VO.MarketListVO;
import com.padc.cooking.adapters.MarketRVAdapter;
import com.padc.cooking.views.holders.MarketViewHolder;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class MarketListActivityFragment extends Fragment {


    @BindView(R.id.rv_markets)
    RecyclerView rvMarkets;

    private MarketRVAdapter mMarketRVAdapter;

    private MarketViewHolder.ControllerMarketItem controllerMarketItem;

    public static MarketListActivityFragment newInstance() {
        MarketListActivityFragment fragment = new MarketListActivityFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        View rootView =inflater.inflate(R.layout.fragment_market_list_activity,container,false);
        ButterKnife.bind(this, rootView);

        ArrayList<MarketListVO> dummyDatas = new ArrayList<>();

        dummyDatas.add(new MarketListVO("Name", "Address", 2));

        mMarketRVAdapter = new MarketRVAdapter(dummyDatas, controllerMarketItem);
        rvMarkets.setAdapter(mMarketRVAdapter);
        rvMarkets.setLayoutManager(new GridLayoutManager(CookingApp.getContext(),1));
        return rootView;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        controllerMarketItem = (MarketViewHolder.ControllerMarketItem) context;
    }
}
