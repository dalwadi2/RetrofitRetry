package com.samcom.retrofitretry.network;


import com.samcom.retrofitretry.network.response.Sample;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {


    @GET(AppConfig.URL.URL_SAMPLE)
    Call<Sample> VIDEO_NOTY_CALL();

}
