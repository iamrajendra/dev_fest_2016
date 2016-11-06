package com.example.rajendra.devfest;

import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView_picasssoImg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        * This code represent how image use image from network
        *
        *
        *
        * */
        imageView_picasssoImg = (ImageView) findViewById(R.id.img);
        Picasso.with(this).
// network url
        load("https://raw.githubusercontent.com/iamrajendra/dev_fest_2016/master/dev_fest.jpg").
// error placeholder
        error(R.drawable.ic_error_red_24dp).
// normal place holder
        placeholder(R.drawable.ic_photo_black_24dp).
// resize image
//        resize(200, 200).
//crop the image
//        centerCrop()


        into(imageView_picasssoImg, new Callback() {
    @Override
    public void onSuccess() {

    }

    @Override
    public void onError() {

    }
});



       /*
        * This code represent how image use image from disk
        *
        *
        *
        * */
        imageView_picasssoImg = (ImageView) findViewById(R.id.img);
        Picasso.with(this).
// network url
        load(R.drawable.github_image).
// error placeholder
        error(R.drawable.ic_error_red_24dp).
// normal place holder
        placeholder(R.drawable.ic_photo_black_24dp).
// resize image
//        resize(200, 200).
//crop the image
//        centerCrop()


        into(imageView_picasssoImg, new Callback() {
    @Override
    public void onSuccess() {

    }

    @Override
    public void onError() {

    }
});

      /*
        * This code represent how image use image from memory
        *
        *
        *
        * */
        imageView_picasssoImg = (ImageView) findViewById(R.id.img);
        Picasso.with(this).
// network url
        load(R.drawable.github_image).
// error placeholder
        error(R.drawable.ic_error_red_24dp).
// normal place holder
        placeholder(R.drawable.ic_photo_black_24dp).
// resize image
//        resize(200, 200).
//crop the image
//        centerCrop()


        into(imageView_picasssoImg, new Callback() {
    @Override
    public void onSuccess() {

    }

    @Override
    public void onError() {

    }
});


    }


}
