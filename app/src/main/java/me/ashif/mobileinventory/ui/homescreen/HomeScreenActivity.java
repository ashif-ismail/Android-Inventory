package me.ashif.mobileinventory.ui.homescreen;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import me.ashif.mobileinventory.R;
import me.ashif.mobileinventory.model.pojo.HomeScreenListModel;
import me.ashif.mobileinventory.ui.base.BaseActivity;

public class HomeScreenActivity extends BaseActivity implements HomeScreenContract.View {

    @Bind(R.id.list_feature) RecyclerView mRecyclerView;
    @Inject HomeScreenAdapter mAdapter;
    @Inject HomeScreenPresenter mPresenter;
    @Inject LinearLayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);
        ButterKnife.bind(this);
        mPresenter.setOnCreate();
    }

    @Override
    public void initRecyclerView() {
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.setPresenter(mPresenter);
    }

    @Override
    public void setDataToRecyclerView(ArrayList<HomeScreenListModel> homeScreenListModels) {

    }
}
