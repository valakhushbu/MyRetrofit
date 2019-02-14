package com.example.pc.spinnerex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.pc.spinnerex.Exam.Data;
import com.example.pc.spinnerex.Exam.Example;
import com.example.pc.spinnerex.Exam.JsonResponce;
import com.example.pc.spinnerex.Exam.Movie;
import com.example.pc.spinnerex.Exam.Movie_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainPage extends AppCompatActivity {
  
    private ArrayList<Movie> movieList ;
    private RecyclerView recyclerView;
    private MainPageAdapter mAdapter;
    private ApiInterface aPiInterface;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        img = findViewById(R.id.img);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerviewiew);

                mAdapter = new MainPageAdapter(movieList,MainPage.this);
                RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
                recyclerView.setLayoutManager(new GridLayoutManager(MainPage.this, 2));
                recyclerView.setItemAnimator(new DefaultItemAnimator());

                aPiInterface = ApiClient.getApiClient().create(ApiInterface.class);

                retrofit2.Call<Example> call = aPiInterface.getData_();

                call.enqueue(new Callback<Example>() {
                    @Override
                    public void onResponse(retrofit2.Call<Example> call, Response<Example> response) {

                        Example jsonResponse =  response.body();
                      //  Glide.with(MainPage.this).load("url").into(img);
                        Glide.with(MainPage.this).load(jsonResponse.getData().getMovie().getImage()).into(img);
                        // movieList = new ArrayList<>(Arrays.asList(jsonResponse.getAndroid(.............................................
                        // )));
                        ArrayList<Movie> movieList = (ArrayList<Movie>) jsonResponse.getData().getMovies();
                        mAdapter=new MainPageAdapter(movieList,MainPage.this);
                        recyclerView.setAdapter(mAdapter);

                        Toast.makeText(MainPage.this,"success"+img,Toast.LENGTH_SHORT).show();

                        Log.d("","fail"+mAdapter);
                    }

                    @Override
                    public void onFailure(Call<Example> call, Throwable t) {
                        Toast.makeText(MainPage.this,"fail",Toast.LENGTH_SHORT).show();
                    }
                });

    }
}
