package me.ashif.mobileinventory.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Ashif on 5/4/17,April,2017
 * TechJini Solutions
 * Banglore,India
 */

public class ToastUtils {
    private static Toast sToast;

    public static void showToast(Context context, String text) {
        if (sToast != null) {
            sToast.cancel();
        }
        sToast = Toast.makeText(context, text, Toast.LENGTH_LONG);
        sToast.show();
    }
}
