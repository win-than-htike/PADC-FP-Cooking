package com.padc.cooking.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.padc.cooking.fragments.Login_Fragment;
import com.padc.cooking.fragments.SignUp_Fragment;

/**
 * Created by Su Su Oo on 18-Sep-16.
 */
public class LoginPagerAdapter extends FragmentStatePagerAdapter {

    int tabCount;
    public LoginPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount=tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                SignUp_Fragment fragment_sign_up = new SignUp_Fragment();
                return fragment_sign_up;
            case 1:
                Login_Fragment fragment_login = new Login_Fragment();
                return fragment_login;

            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return tabCount;
    }
}
