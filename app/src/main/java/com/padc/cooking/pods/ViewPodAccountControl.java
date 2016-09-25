package com.padc.cooking.pods;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

import com.padc.cooking.R;
import com.padc.cooking.controllers.UserController;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ViewPodAccountControl extends FrameLayout {

    @BindView(R.id.vp_login_user)
    ViewPodLogin vpLoginUser;

    @BindView(R.id.vp_logout_user)
    ViewPodLogoutUser vpLogoutUser;

    public ViewPodAccountControl(Context context) {
        super(context);
    }

    public ViewPodAccountControl(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ViewPodAccountControl(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.bind(this, this);

//        EventBus eventBus = EventBus.getDefault();
//        if (!eventBus.isRegistered(this)) {
//            eventBus.register(this);
//        }
    }

    private void refreshUserLoginStatus() {
        boolean isUserLogin = false;
        vpLogoutUser.setVisibility(isUserLogin ? View.GONE : View.VISIBLE);
        vpLoginUser.setVisibility(isUserLogin ? View.VISIBLE : View.GONE);
//
//        if (isUserLogin) {
//            vpLoginUser.setData(UserModel.getInstance().getLoginUser());
//        }
    }

    public void setUserController(UserController userController) {
        vpLogoutUser.setController(userController);
        vpLoginUser.setController(userController);
    }

//    public void onEventMainThread(DataEvent.RefreshUserLoginStatusEvent event) {
//        refreshUserLoginStatus();
//    }
}
