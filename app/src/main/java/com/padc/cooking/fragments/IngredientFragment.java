package com.padc.cooking.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.padc.cooking.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Su Su Oo on 11-Sep-16.
 */
public class IngredientFragment extends Fragment {

    @BindView(R.id.meal)
    ImageView meal;

    public static Fragment newInstance(Context context) {
        IngredientFragment f = new IngredientFragment();
        return f;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_ingredient, null);
        setUpView(root);
        return root;
    }

    void setUpView(ViewGroup root) {
        ButterKnife.bind(this, root);
        setUPList();
    }

    void setUPList() {
        meal.setImageResource(R.drawable.meal);

    }
}
