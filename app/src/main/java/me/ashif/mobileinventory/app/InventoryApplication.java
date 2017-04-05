package me.ashif.mobileinventory.app;

import android.app.Activity;
import android.app.Application;

/**
 * Created by Ashif on 5/4/17,April,2017
 * TechJini Solutions
 * Banglore,India
 */

public class InventoryApplication extends Application {

    public static InventoryApplication get(Activity activity) {
        return (InventoryApplication) activity.getApplication();
    }

    @Override
    public void onCreate() {
        super.onCreate();

    }
}
