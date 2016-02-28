package com.studyjam.phandeeyar;

import android.app.Application;
import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.studyjam.phandeeyar.data.DataManager;
import com.studyjam.phandeeyar.data.voc.EventVO;
import com.studyjam.phandeeyar.utils.JsonUtils;

import org.json.JSONException;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by winthanhtike on 2/27/16.
 */
public class PhandeeyarApp extends Application{

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();

        context = getApplicationContext();

        DataManager.getInstance().loadEventList();

    }

    public static Context getContext() {
        return context;
    }


}
