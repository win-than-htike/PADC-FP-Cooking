package com.padc.cooking.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.padc.cooking.R;
import com.padc.cooking.VO.MarketListVO;
import com.padc.cooking.adapters.MarketRVAdapter;

import java.util.ArrayList;

public class MarketActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market);
    }
}