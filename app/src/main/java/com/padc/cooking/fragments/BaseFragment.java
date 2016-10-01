package com.padc.cooking.fragments;


import android.support.v4.app.Fragment;

/**
 * Created by Su Su Oo on 30-Sep-16.
 */
public abstract class BaseFragment extends Fragment {

    @Override
    public void onStart() {
        super.onStart();
        onSendScreenHit();
    }

    protected abstract void onSendScreenHit();
}
