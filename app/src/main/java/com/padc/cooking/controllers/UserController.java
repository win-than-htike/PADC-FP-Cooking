package com.padc.cooking.controllers;

/**
 * Created by Su Su Oo on 25-Sep-16.
 */
public interface UserController extends BaseController {
    void onTapLogin();
    void onTapRegister();
    void onTapLogout();
    void onNavigateUserProfile();
}
