package me.ashif.mobileinventory.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by Ashif on 5/4/17,April,2017
 * TechJini Solutions
 * Banglore,India
 */

public class NetworkUtil {
    public static boolean isConnectionAvailable(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
            return networkInfo != null && networkInfo.isConnectedOrConnecting();
        } catch (Exception e) {
            return false;
        }
    }
}
