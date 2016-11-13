package com.example.rajendra.devfest.adapter;

import android.app.Activity;
import android.graphics.Movie;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.rajendra.devfest.R;

import java.util.List;

/**
 * Created by rajendra on 13/11/16.
 */

public class MoviesAdapater extends RecyclerView.Adapter<MoviesAdapater.MoviesAdapter> {
    private List<com.example.rajendra.devfest.model.Movie.Search> movie_list;

    public MoviesAdapater(List<com.example.rajendra.devfest.model.Movie.Search> movie_list, Activity activity) {
        this.movie_list = movie_list;
        this.activity = activity;
    }

    private Activity activity;

    @Override
    public MoviesAdapter onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = activity.getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.movies_adapter, null);
        return new MoviesAdapter(view);
    }

    @Override
    public void onBindViewHolder(MoviesAdapter holder, int position) {
        holder.textView_title.setText(movie_list.get(position).getTitle());
        holder.textView_type.setText(movie_list.get(position).getType());
        holder.textView_year.setText(movie_list.get(position).getYear());
    }

    @Override
    public int getItemCount() {
        return movie_list.size();
    }

    public class MoviesAdapter extends RecyclerView.ViewHolder {
        private TextView textView_title;
        private TextView textView_year;
        private TextView textView_type;

        public MoviesAdapter(View itemView) {
            super(itemView);
            textView_title = (TextView) itemView.findViewById(R.id.movie_adapter_title);
            textView_year = (TextView) itemView.findViewById(R.id.movie_adapter_year);
            textView_type = (TextView) itemView.findViewById(R.id.movie_adapter_type);
        }
    }
}
