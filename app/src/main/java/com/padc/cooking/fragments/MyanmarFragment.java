package com.padc.cooking.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.padc.cooking.CookingApp;
import com.padc.cooking.R;
import com.padc.cooking.adapters.FoodTypeVIewPagerAdapter;
import com.padc.cooking.adapters.RecipeRVAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyanmarFragment extends Fragment {

    @BindView(R.id.rv_myanmar_food)
    RecyclerView rvMynamarFood;

    private RecipeRVAdapter mAdapter;

    public MyanmarFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_myanmar, container, false);
        ButterKnife.bind(this,view);

        // recycler view setup and setup with Layout Manager
        rvMynamarFood.setHasFixedSize(true);
        rvMynamarFood.setLayoutManager(new LinearLayoutManager(CookingApp.getContext(),LinearLayoutManager.VERTICAL,false));

        // attach adapter in recycler view
        mAdapter = new RecipeRVAdapter();
        rvMynamarFood.setAdapter(mAdapter);

        return view;
    }

}
