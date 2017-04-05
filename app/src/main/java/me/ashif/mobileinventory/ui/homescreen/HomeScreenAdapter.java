package me.ashif.mobileinventory.ui.homescreen;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import me.ashif.mobileinventory.R;
import me.ashif.mobileinventory.model.pojo.HomeScreenListModel;
import me.ashif.mobileinventory.utils.ToastUtils;

/**
 * Created by Ashif on 5/4/17,April,2017
 * TechJini Solutions
 * Banglore,India
 */

public class HomeScreenAdapter extends RecyclerView.Adapter<HomeScreenAdapter.HomeScreenViewHolder> {

    private ArrayList<HomeScreenListModel> listModels;
    private HomeScreenPresenter mPresenter;


    @Override
    public HomeScreenViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_homelist, parent, false);
        return new HomeScreenViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(HomeScreenViewHolder holder, int position) {
        holder.bind(position);
    }


    @Override
    public int getItemCount() {
        return listModels.size();
    }

    public void setFeatureList(ArrayList<HomeScreenListModel> listModels) {
        this.listModels = listModels;
        notifyDataSetChanged();
    }

    public void setPresenter(HomeScreenPresenter presenter) {
        mPresenter = presenter;
    }

    public class HomeScreenViewHolder extends RecyclerView.ViewHolder{

        @Bind(R.id.card_stock_entry) CardView mParentCard;
        @Bind(R.id.text_stock_entry) TextView mHeaderText;
        @Bind(R.id.text_stock_details) TextView mDetailText;
        @Bind(R.id.imageView) ImageView mImageView;

        public HomeScreenViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }

        public void bind(int position) {
            HomeScreenListModel model = listModels.get(position);
            mHeaderText.setText(model.getHeaderText());
            mDetailText.setText(model.getDetailText());
        }
    }
}
