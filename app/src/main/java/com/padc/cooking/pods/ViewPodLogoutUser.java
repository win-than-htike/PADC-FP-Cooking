package com.padc.cooking.pods;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

import com.padc.cooking.R;
import com.padc.cooking.controllers.BaseController;
import com.padc.cooking.controllers.UserController;
import com.padc.cooking.controllers.ViewController;

import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * Created by aung on 7/6/16.
 */
public class ViewPodLogoutUser extends RelativeLayout implements ViewController {

    private UserController mController;

    public ViewPodLogoutUser(Context context) {
        super(context);
    }

    public ViewPodLogoutUser(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ViewPodLogoutUser(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.bind(this, this);
    }

    @OnClick(R.id.btn_login)
    public void onTapLogin(View view) {
        mController.onTapLogin();
    }

    @OnClick(R.id.btn_register)
    public void onTapRegister(View view) {
        mController.onTapRegister();
    }

    @Override
    public void setController(BaseController controller) {
        mController = (UserController) controller;
    }


}
