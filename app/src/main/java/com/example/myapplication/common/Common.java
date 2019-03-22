package com.example.myapplication.common;

import com.example.myapplication.Interface.IconbetterIdeaFromServiecs;
import com.example.myapplication.Interface.NewsServies;
import com.example.myapplication.Remote.IconbetterClient;
import com.example.myapplication.Remote.RetrofitClient;

public class Common {
    private static  final String BASE_URL="https://newsapi.org/";
    private static  final String API_KEY="5ebdc92a23fb46c988c333b0f386db19";

    private static NewsServies getNewsServices(){
        return RetrofitClient.getRetrofitClient(BASE_URL).create(NewsServies.class);
    }
    private static IconbetterIdeaFromServiecs geticonbetter(){
        return IconbetterClient.getRetrofitClient().create(IconbetterIdeaFromServiecs.class);
    }
}
