package me.ashif.mobileinventory.di.components;

import dagger.Component;
import me.ashif.mobileinventory.api.InventoryService;
import me.ashif.mobileinventory.di.modules.InventoryAppModule;
import me.ashif.mobileinventory.di.scopes.PerApp;

/**
 * Created by Ashif on 5/4/17,April,2017
 * TechJini Solutions
 * Banglore,India
 */
@Component(modules = InventoryAppModule.class)
@PerApp
public interface InventoryAppComponent {
    InventoryService getInventoryService();
}
