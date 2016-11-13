package com.example.rajendra.devfest.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.rajendra.devfest.R;
import com.example.rajendra.devfest.model.Food;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by rajendra on 13/11/16.
 */

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodHolderView> {

    private List<Food> foodList;
    private Activity activity;

    public FoodAdapter(List<Food> foodList, Activity activity) {
        this.foodList = foodList;
        this.activity = activity;
    }

    @Override
    public FoodHolderView onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(activity);
        View view = layoutInflater.inflate(R.layout.food_adapter, null);
        return new FoodHolderView(view);
    }

    @Override
    public void onBindViewHolder(FoodHolderView holder, int position) {
        holder.name.setText(foodList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }

    public class FoodHolderView extends RecyclerView.ViewHolder {
        public
        @BindView(R.id.name_tv)
        TextView name;
        public
        @BindView(R.id.price_tv)
        TextView price;

        public
        @BindView(R.id.description_tv)
        TextView description;

        public FoodHolderView(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
