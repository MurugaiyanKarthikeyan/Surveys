package com.ki.surveys.utils;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;

import com.ki.surveys.SurveyApplication;

public class NetworkUtil {

    /***
     * Checks for the network connection
     *
     * @return
     */
    public static boolean hasNetwork() {
        ConnectivityManager manager = SurveyApplication.getInstance().getConnectivityManager();
        WifiManager wifiManager = SurveyApplication.getInstance().getWifiManager();

        NetworkInfo netInfo = manager.getActiveNetworkInfo();
        if ((netInfo != null && netInfo.isConnected())
                || (wifiManager != null && wifiManager.isWifiEnabled())) {
            return true;
        } else {
            return false;
        }
    }
}
