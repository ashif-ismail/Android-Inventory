package me.ashif.mobileinventory.ui.homescreen;

import java.util.ArrayList;

import me.ashif.mobileinventory.model.pojo.HomeScreenListModel;

/**
 * Created by Ashif on 5/4/17,April,2017
 * TechJini Solutions
 * Banglore,India
 */

public interface HomeScreenContract {
    interface View {
        void initRecyclerView();
        void setDataToRecyclerView(ArrayList<HomeScreenListModel> homeScreenListModels);
    }

    interface Presenter {
        void populateFeautureList();
        void setOnCreate();
    }
}
