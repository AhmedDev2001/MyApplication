package com.example.myapplication.Interface;

import com.example.myapplication.model.Iconbetteridea;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface IconbetterIdeaFromServiecs {
    @GET
    Call<Iconbetteridea>getIconBetterIdeaUrl(@Url String url);
}
