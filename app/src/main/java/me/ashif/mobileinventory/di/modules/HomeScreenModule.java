package me.ashif.mobileinventory.di.modules;

import android.support.v7.widget.LinearLayoutManager;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;
import me.ashif.mobileinventory.di.scopes.PerActivity;
import me.ashif.mobileinventory.ui.homescreen.HomeScreenActivity;
import me.ashif.mobileinventory.ui.homescreen.HomeScreenAdapter;
import me.ashif.mobileinventory.ui.homescreen.HomeScreenPresenter;

/**
 * Created by Ashif on 5/4/17,April,2017
 * TechJini Solutions
 * Banglore,India
 */
@Module
public class HomeScreenModule {

    @Inject
    public HomeScreenActivity homeScreenActivity;

    public HomeScreenModule(HomeScreenActivity homeScreenActivity) {
        this.homeScreenActivity = homeScreenActivity;
    }

    @Provides
    @PerActivity
    public HomeScreenPresenter providesPresenter(){
        return new HomeScreenPresenter(homeScreenActivity);
    }

    @Provides
    @PerActivity
    public LinearLayoutManager providesLinearLayoutManager(){
        return new LinearLayoutManager(homeScreenActivity,LinearLayoutManager.VERTICAL,false);
    }

    @PerActivity
    @Provides
    public HomeScreenAdapter providesHomeScreenAdapter(){
        return new HomeScreenAdapter();
    }
}
