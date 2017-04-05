package me.ashif.mobileinventory.ui.base;

import android.os.Bundle;

/**
 * Created by Ashif on 5/4/17,April,2017
 * TechJini Solutions
 * Banglore,India
 */

public interface BaseContract {
    interface View {

    }

    interface Presenter {
        void saveUIState(Bundle outState);

        void restoreUIState(Bundle savedInstanceState);

        void registerForEvents();

        void unregisterForEvents();
    }
}
