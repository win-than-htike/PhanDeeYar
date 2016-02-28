package com.studyjam.phandeeyar;

import android.app.Application;
import android.content.Context;

/**
 * Created by winthanhtike on 2/27/16.
 */
public class PhandeeyarApp extends Application{

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