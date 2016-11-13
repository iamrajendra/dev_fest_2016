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

import com.example.rajendra.devfest.adapter.MoviesAdapater;
import com.example.rajendra.devfest.model.Movie;
import com.example.rajendra.devfest.rest.APInterface;
import com.example.rajendra.devfest.rest.APiClient;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    public   @BindView  (R.id.mainactivity_movieList_rv) RecyclerView recyclerView_movieList;
    private MoviesAdapater moviesAdapater;
    private String Tag="MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        recyclerView_movieList.setLayoutManager(new LinearLayoutManager(this));
        APInterface apiService =
                APiClient.getClient().create(APInterface.class);
      Call<Movie> movieCall =apiService.getMovies("Batman","2");
        movieCall.enqueue(new retrofit2.Callback<Movie>() {
            @Override
            public void onResponse(Call<Movie> call, Response<Movie> response) {
                moviesAdapater = new MoviesAdapater(response.body().getSearch(),MainActivity.this);
                recyclerView_movieList.setAdapter(moviesAdapater);
            }

            @Override
            public void onFailure(Call<Movie> call, Throwable t) {
                Log.e(Tag, "On Failure "+t);
            }
        });



    }

}
