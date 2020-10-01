package com.diogomoreno.orama.handler;

import com.diogomoreno.orama.Config;
import com.diogomoreno.orama.services.OramaService;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitHandler {

    final OramaService oramaService;


    private static RetrofitHandler instance;

    public static RetrofitHandler getSingleton() {
        if(instance == null)
            instance = new RetrofitHandler();
        return instance;
    }

    public RetrofitHandler() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Config.BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        oramaService = retrofit.create(OramaService.class);
    }

    public OramaService getOramaService() {
        return oramaService;
    }
}
