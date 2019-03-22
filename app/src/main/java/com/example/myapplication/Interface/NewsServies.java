package com.example.myapplication.Interface;

import com.example.myapplication.model.Wibesite;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NewsServies {
    @GET("v2/top-headlines?country=sa&category=technology&apiKey=5ebdc92a23fb46c988c333b0f386db19")
    Call<Wibesite> getSources();

}
