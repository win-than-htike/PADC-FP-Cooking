package com.padc.cooking.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.padc.cooking.R;
import com.padc.cooking.VO.MarketListVO;

import com.padc.cooking.controllers.UserController;
import com.padc.cooking.data.models.VO.RecipeVO;
import com.padc.cooking.fragments.MarketListActivityFragment;
import com.padc.cooking.fragments.MyanmarFragment;
import com.padc.cooking.pods.ViewPodAccountControl;
import com.padc.cooking.views.holders.MarketViewHolder;
import com.padc.cooking.views.holders.RecipeViewHolder;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,
        RecipeViewHolder.RecipeItemController,
        MarketViewHolder.ControllerMarketItem,
        UserController {

    ViewPodAccountControl viewPodAccountControl;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this, this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        if (savedInstanceState == null) {
            MyanmarFragment myanmarFragment = MyanmarFragment.newInstance();
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fl_container, myanmarFragment, "Home")
                    .commit();
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        viewPodAccountControl = (ViewPodAccountControl) navigationView.getHeaderView(0);
        viewPodAccountControl.setUserController(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main2, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_reciepe) {
            navigateToReciepe();
        } else if (id == R.id.nav_market) {
            navigateToMarket();
        } else if (id == R.id.nav_news) {

        } else if (id == R.id.nav_fav) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void navigateToMarket() {
        MarketListActivityFragment fragment = new MarketListActivityFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fl_container, fragment, "Market")
                .commit();
    }

    private void navigateToReciepe() {
        getSupportActionBar().setTitle("Recipes");
        MyanmarFragment myanmarFragment = MyanmarFragment.newInstance();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fl_container, myanmarFragment, "Home")
                .commit();
    }



    public void onTapFoodItem() {

        startActivity(FoodDetailActivity.newIntent());


    }

    @Override
    public void onTapMarket(MarketListVO market) {
        startActivity(MarketActivity.newIntent());
    }

    @Override
    public void onTapLogin() {
        Intent intent = LoginActivity.newIntent();
        startActivity(intent);
    }


    @Override
    public void onTapRegister() {

    }

    @Override
    public void onTapLogout() {

    }

    @Override
    public void onNavigateUserProfile() {

    }

    @Override
    public void onTapArticle(RecipeVO mRecipe) {

    }
}
