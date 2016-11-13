package com.example.rajendra.devfest.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by rajendra on 13/11/16.
 */

public class APiClient {
//    public static final String BASE_URL = "http://www.omdbapi.com/?s=Batman&page=2";
public static final String BASE_URL = "http://www.omdbapi.com";
    private static Retrofit retrofit = null;


    public static Retrofit getClient() {
        if (retrofit == null) {

            retrofit = new Retrofit

                    .Builder()
                    .baseUrl(BASE_URL)

                    .addConverterFactory(GsonConverterFactory.create())

                    .build();
        }


        return retrofit;

    }
}