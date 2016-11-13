package com.example.rajendra.devfest.rest;

import org.xmlpull.v1.XmlPullParserFactory;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okio.Timeout;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

/**
 * Created by rajendra on 13/11/16.
 */

public class APiClient {
    public static final String BASE_API = "http://www.w3schools.com/";
public static final String BASE_URL = "http://www.omdbapi.com";
    private static Retrofit retrofit = null;

    public static Retrofit getClient(boolean flag) {
        final OkHttpClient okHttpClient = new OkHttpClient();
       /* okHttpClient.setReadTimeout(60, TimeUnit.SECONDS);
        okHttpClient.setConnectTimeout(60, TimeUnit.SECONDS);
*/
        okHttpClient.newBuilder().readTimeout(60,TimeUnit.SECONDS);
        okHttpClient.newBuilder().connectTimeout(60, TimeUnit.SECONDS);
        if (flag) {
            if (retrofit == null) {

                retrofit = new Retrofit

                        .Builder()
                        .baseUrl(BASE_URL)
                        .client(okHttpClient)

                        .addConverterFactory(GsonConverterFactory.create())

                        .build();
            }


            return retrofit;

        }else
        {

            if (retrofit == null) {

                retrofit = new Retrofit

                        .Builder()
                        .baseUrl(BASE_API)
                        .client(okHttpClient)
                        .addConverterFactory(SimpleXmlConverterFactory.create())

                        .build();
            }


            return retrofit;
        }
    }
}