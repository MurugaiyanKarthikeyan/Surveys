package com.ki.surveys;


import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;

import com.ki.surveys.model.TokenResponse;

public class SurveyApplication extends Application {
    private static volatile SurveyApplication mInstance;
    private Context mContext;
    private static ConnectivityManager sManager = null;
    private static WifiManager sWifiManager = null;

    public static boolean isIsTokenFetched() {
        return isTokenFetched;
    }

    public static void setIsTokenFetched(boolean isTokenFetched) {
        SurveyApplication.isTokenFetched = isTokenFetched;
    }

    private static boolean isTokenFetched;
    public static TokenResponse getTokenResponse() {
        return tokenResponse;
    }

    public static void setTokenResponse(TokenResponse tokenResponse) {
        SurveyApplication.tokenResponse = tokenResponse;
    }

    private static TokenResponse tokenResponse;


    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        mContext = getApplicationContext();
    }
    public synchronized static SurveyApplication getInstance() {
        if (mInstance == null) { //if there is no instance available... create new one
            synchronized (SurveyApplication.class) {
                if (mInstance == null) mInstance = new SurveyApplication();
            }
        }
        return mInstance;
    }
    public  ConnectivityManager getConnectivityManager() {
        if (null == sManager)
            sManager = (ConnectivityManager) getInstance().getSystemService(Context.CONNECTIVITY_SERVICE);
        return sManager;
    }

    public  WifiManager getWifiManager() {
        if (null == sWifiManager)
            sWifiManager = (WifiManager) getInstance().getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        return sWifiManager;
    }

    public Context getContext() {
        return getInstance().mContext;
    }
}

