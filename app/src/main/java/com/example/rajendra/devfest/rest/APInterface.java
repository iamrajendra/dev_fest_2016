package com.example.rajendra.devfest.rest;

import com.example.rajendra.devfest.model.Movie;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by rajendra on 13/11/16.
 */

public interface APInterface {
@GET("/")
   public Call<Movie> getMovies(@Query("s") String batman,@Query("page") String s);

}
