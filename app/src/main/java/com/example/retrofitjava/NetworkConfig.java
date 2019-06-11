package com.example.retrofitjava;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkConfig {
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl( new Api() {
                @Override
                public Call<List<Pojo>> getAllData() {
                    return null;
                }
            }.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}
