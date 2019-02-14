package com.example.pc.spinnerex;

import com.example.pc.spinnerex.Exam.Data;
import com.example.pc.spinnerex.Exam.Example;
import com.example.pc.spinnerex.Exam.JsonResponce;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface ApiInterface {

    @GET("bins/fdypk")
   // Call<JsonResponce> getData();
    Call<Example> getData_();

}
