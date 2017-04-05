package me.ashif.mobileinventory.di.components;

import dagger.Component;
import me.ashif.mobileinventory.di.modules.HomeScreenModule;
import me.ashif.mobileinventory.di.scopes.PerActivity;
import me.ashif.mobileinventory.ui.homescreen.HomeScreenActivity;
import me.ashif.mobileinventory.ui.homescreen.HomeScreenAdapter;

/**
 * Created by Ashif on 5/4/17,April,2017
 * TechJini Solutions
 * Banglore,India
 */
@Component(modules = HomeScreenModule.class)
@PerActivity
public interface HomeScreenComponent {
    void inject(HomeScreenActivity homeScreenActivity);
}
