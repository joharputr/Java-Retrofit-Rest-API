package com.example.retrofitjava;

import android.app.Application;

import java.util.List;

import retrofit2.Call;

public class App extends Application {
    public static Api api = new Api() {
        @Override
        public Call<List<Pojo>> getAllData() {
            return null;
        }
    };
    public static NetworkConfig network = new NetworkConfig();

    @Override
    public void onCreate() {
        super.onCreate();
        api = network.retrofit.create(Api.class);

    }
}
