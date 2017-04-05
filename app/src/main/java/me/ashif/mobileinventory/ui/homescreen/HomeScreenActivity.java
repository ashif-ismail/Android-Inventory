package me.ashif.mobileinventory.ui.homescreen;

import android.os.Bundle;

import me.ashif.mobileinventory.BaseActivity;
import me.ashif.mobileinventory.R;

public class HomeScreenActivity extends BaseActivity implements HomeScreenContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);
    }
}
