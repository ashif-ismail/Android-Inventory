package me.ashif.mobileinventory.app;

import android.app.Activity;
import android.app.Application;

import me.ashif.mobileinventory.api.InventoryService;
import me.ashif.mobileinventory.di.components.DaggerInventoryAppComponent;
import me.ashif.mobileinventory.di.components.InventoryAppComponent;
import me.ashif.mobileinventory.di.modules.ContextModule;

/**
 * Created by Ashif on 5/4/17,April,2017
 * TechJini Solutions
 * Banglore,India
 */

public class InventoryApplication extends Application {

    private InventoryService mInventoryService;
    private InventoryAppComponent mComponent;

    public static InventoryApplication get(Activity activity) {
        return (InventoryApplication) activity.getApplication();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        mComponent = DaggerInventoryAppComponent.builder()
                .contextModule(new ContextModule(this))
                .build();

        mInventoryService = mComponent.getInventoryService();
    }

    public InventoryAppComponent component() {
        return mComponent;
    }
}
