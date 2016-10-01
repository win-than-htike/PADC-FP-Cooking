package com.padc.cooking.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.padc.cooking.CookingApp;
import com.padc.cooking.R;
import com.padc.cooking.adapters.FoodDetailPagerAdapter;
import com.padc.cooking.fragments.IngredientFragment;
import com.padc.cooking.fragments.MethodFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Su Su Oo on 11-Sep-16.
 */
public class FoodDetailActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.fab)
    FloatingActionButton fab;
    @BindView(R.id.tabs)
    TabLayout tabs;
    @BindView(R.id.pager)
    ViewPager pager;

    FoodDetailPagerAdapter adapter;
    CharSequence Titles[]={"TAB 1","TAB 2"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

//        FragmentManager fragmentManager=getSupportFragmentManager();
//        adapter =  new FoodDetailPagerAdapter(fragmentManager);
//        adapter.addTab(IngredientFragment.newInstance(), getString(R.string.ingredient));
//        adapter.addTab(MethodFragment.newInstance(), getString(R.string.method));
//
//        pager.setAdapter(adapter);
//        pager.setOffscreenPageLimit(adapter.getCount());
//        tabs.setupWithViewPager(pager);

//        setUpTabs();
        setUpClick();
    }

    void setUpClick(){
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with yougr own action", Snackbar.LENGTH_LONG).setAction("Action", null).show();
            }
        });
    }

//    void setUpTabs(){
//        FragmentManager fragmentManager=getSupportFragmentManager();
//        adapter =  new FoodDetailPagerAdapter(fragmentManager);
//        adapter.addTab(IngredientFragment.newInstance(), getString(R.string.ingredient));
//        adapter.addTab(MethodFragment.newInstance(), getString(R.string.method));
//        pager.setAdapter(adapter);
//        tabs.setupWithViewPager(pager);
//        setupTabIcons();
//    }

//    private void setupTabIcons() {
//        tabs.getTabAt(0).setIcon(R.mipmap.ic_launcher);
//        tabs.getTabAt(1).setIcon(R.mipmap.ic_launcher);
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public static Intent newIntent() {
        Intent intent = new Intent(CookingApp.getContext(), FoodDetailActivity.class);
//        intent.putExtra(IE_NAVIGATE_TO, navigateTo);
        return intent;
    }
}
