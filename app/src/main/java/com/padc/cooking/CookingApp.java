package com.padc.cooking;

import android.app.Application;
import android.content.Context;

/**
 * Created by winthanhtike on 9/4/16.
 */
public class CookingApp extends Application{

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
