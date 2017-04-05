package me.ashif.mobileinventory.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Ashif on 5/4/17,April,2017
 * TechJini Solutions
 * Banglore,India
 */

public class SharedPrefUtils {
    private static final String INVENTORY_USER_PREF = "INVENTORY_USER_PREF";

    public static void storeString(String name, String data, Context context) {
        SharedPreferences preferences = context.getSharedPreferences(INVENTORY_USER_PREF, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(name, data);
        editor.apply();
    }

    public static String fetchString(String name, Context context) {
        SharedPreferences preferences = context.getSharedPreferences(INVENTORY_USER_PREF, Context.MODE_PRIVATE);
        return preferences.getString(name, "");
    }

    public static void storeInt(String name, int data, Context context) {
        SharedPreferences preferences = context.getSharedPreferences(INVENTORY_USER_PREF, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt(name, data);
        editor.apply();
    }

    public static int fetchInt(String name, Context context) {
        SharedPreferences preferences = context.getSharedPreferences(INVENTORY_USER_PREF, Context.MODE_PRIVATE);
        return preferences.getInt(name, -1);
    }

    public static void storeBoolean(String name, boolean data, Context context) {
        SharedPreferences preferences = context.getSharedPreferences(INVENTORY_USER_PREF, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean(name, data);
        editor.apply();
    }

    public static boolean fetchBoolean(String name, Context context) {
        SharedPreferences preferences = context.getSharedPreferences(INVENTORY_USER_PREF, Context.MODE_PRIVATE);
        return preferences.getBoolean(name, false);
    }

    public static void removeKey(String key, Context context) {
        SharedPreferences preferences = context.getSharedPreferences(INVENTORY_USER_PREF, Context.MODE_PRIVATE);
        preferences.edit().remove(key).apply();
    }

    public static void clearUserPreference(Context context) {
        SharedPreferences preferences = context.getSharedPreferences(INVENTORY_USER_PREF, Context.MODE_PRIVATE);
        preferences.edit().clear().apply();
    }
}
