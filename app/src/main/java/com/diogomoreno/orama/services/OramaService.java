package com.diogomoreno.orama.services;

import com.diogomoreno.orama.entities.FundResource;


import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface OramaService {

    @GET("json/fund_detail_full.json?serializ%20er=fund_detail_full")
    Observable<List<FundResource>> getFundResource();
}
