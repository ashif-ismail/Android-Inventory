package me.ashif.mobileinventory.ui.homescreen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import me.ashif.mobileinventory.R;
import me.ashif.mobileinventory.model.pojo.HomeScreenListModel;

/**
 * Created by Ashif on 5/4/17,April,2017
 * TechJini Solutions
 * Banglore,India
 */

public class HomeScreenPresenter implements HomeScreenContract.Presenter {
    private HomeScreenContract.View mView;
    public HomeScreenPresenter(HomeScreenContract.View view) {
        mView = view;
    }

    @Override
    public void populateFeautureList() {
        List<HomeScreenListModel> screenListModels = Arrays.asList(
                new HomeScreenListModel("Stock Entry","Manage Details of new Stock", R.mipmap.ic_launcher),
                new HomeScreenListModel("Stock Entry","Manage Details of new Stock", R.mipmap.ic_launcher),
                new HomeScreenListModel("Stock Entry","Manage Details of new Stock", R.mipmap.ic_launcher),
                new HomeScreenListModel("Stock Entry","Manage Details of new Stock", R.mipmap.ic_launcher)
        );
    }

    @Override
    public void setOnCreate() {
        mView.initRecyclerView();
    }
}
