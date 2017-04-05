package me.ashif.mobileinventory.ui.homescreen;

import android.os.Bundle;

import butterknife.ButterKnife;
import me.ashif.mobileinventory.R;
import me.ashif.mobileinventory.ui.base.BaseActivity;

public class HomeScreenActivity extends BaseActivity implements HomeScreenContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);
        ButterKnife.bind(this);
    }
}
