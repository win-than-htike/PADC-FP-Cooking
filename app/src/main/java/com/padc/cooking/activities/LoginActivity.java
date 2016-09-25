package com.padc.cooking.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.padc.cooking.CookingApp;
import com.padc.cooking.R;
import com.padc.cooking.adapters.LoginPagerAdapter;

/**
 * Created by Su Su Oo on 18-Sep-16.
 */
public class LoginActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    private static final String IE_NAVIGATE_TO = "IE_NAVIGATE_TO";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_main);

        //Adding toolbar to the activity
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Initializing the tablayout
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);

        //Adding the tabs using addTab() method
        tabLayout.addTab(tabLayout.newTab().setText("SignUp"));
        tabLayout.addTab(tabLayout.newTab().setText("Login"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        //Initializing viewPager
        viewPager = (ViewPager) findViewById(R.id.view_pager);

        //Creating our pager adapter
        LoginPagerAdapter adapter = new LoginPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());

        viewPager.setAdapter(adapter);


        tabLayout.setOnTabSelectedListener(this);




    }

    public static Intent newIntent() {
        Intent intent = new Intent(CookingApp.getContext(), LoginActivity.class);
        //intent.putExtra(IE_NAVIGATE_TO, navigateTo);
        return intent;
    }


    @Override
    public void onTabSelected(TabLayout.Tab tab) {

        viewPager.setCurrentItem(tab.getPosition());

    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}
