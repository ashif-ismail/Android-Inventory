package me.ashif.mobileinventory.di.modules;

import android.content.Context;

import dagger.Module;
import dagger.Provides;
import me.ashif.mobileinventory.di.scopes.PerApp;

/**
 * Created by Ashif on 5/4/17,April,2017
 * TechJini Solutions
 * Banglore,India
 */

@Module
public class ContextModule {
    private final Context context;

    public ContextModule(Context context) {
        this.context = context;
    }

    @Provides
    @PerApp
    public Context providesContext() {
        return context;
    }
}
