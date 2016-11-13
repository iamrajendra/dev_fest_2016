package com.example.rajendra.devfest;

import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.example.rajendra.devfest.adapter.FoodAdapter;
import com.example.rajendra.devfest.adapter.MoviesAdapater;
import com.example.rajendra.devfest.model.BreakFastMenu;
import com.example.rajendra.devfest.model.Movie;
import com.example.rajendra.devfest.rest.APInterface;
import com.example.rajendra.devfest.rest.APiClient;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    public
    @BindView(R.id.mainactivity_foodList_rv)
    RecyclerView recyclerView_foodList;
    private FoodAdapter foodAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        recyclerView_foodList.setLayoutManager(new LinearLayoutManager(this));

        APInterface apiInterface = APiClient.getClient(false).create(APInterface.class);
        Call<BreakFastMenu> breakFastMenuCall = apiInterface.getXml();
        breakFastMenuCall.enqueue(new retrofit2.Callback<BreakFastMenu>() {
            @Override
            public void onResponse(Call<BreakFastMenu> call, Response<BreakFastMenu> response) {
                foodAdapter = new FoodAdapter(response.body().getFoodList(), MainActivity.this);
                recyclerView_foodList.setAdapter(foodAdapter);
            }

            @Override
            public void onFailure(Call<BreakFastMenu> call, Throwable t) {

            }
        });


    }


}
