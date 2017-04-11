package me.ashif.mobileinventory.app;

import android.app.Application;

import me.ashif.mobileinventory.di.dagger.DaggerInjectorImpl;

/**
 * Created by Ashif on 5/4/17,April,2017
 * TechJini Solutions
 * Banglore,India
 */

public class InventoryApplication extends Application {

    private static DaggerInjectorImpl sDaggerInjector;

    public InventoryApplication() {
        initDagger();
    }

    public void initDagger() {
        getDaggerInjector().init(this);
    }

    public DaggerInjectorImpl getDaggerInjector() {
        if (sDaggerInjector == null) {
            sDaggerInjector = new DaggerInjectorImpl();
        }
        return sDaggerInjector;
    }
}
