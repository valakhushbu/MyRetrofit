package com.example.pc.spinnerex;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.pc.spinnerex.Exam.Movie;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class MainPageAdapter extends RecyclerView.Adapter<MainPageAdapter.MyViewHolder> {

    private ArrayList<Movie> moviesList;
    private Context context;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        ImageView image;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.moviename);
            image = (ImageView) view.findViewById(R.id.movieimage);
        }
    }

    public MainPageAdapter(ArrayList<Movie> moviesList, Context context) {
        this.moviesList = moviesList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.main_page_data, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        Movie movie = moviesList.get(position);
        holder.title.setText(movie.getName());
        Glide.with(context).load(movie.getImage()).into(holder.image);
        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.image.setDrawingCacheEnabled(true);
                Bitmap b= holder.image.getDrawingCache();
                Intent i = new Intent(context, SecondActivity.class);
                i.putExtra("Bitmap", b);
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }
}