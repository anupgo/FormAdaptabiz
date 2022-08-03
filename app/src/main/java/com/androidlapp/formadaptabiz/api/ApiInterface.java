package com.androidlapp.formadaptabiz.api;

import com.androidlapp.formadaptabiz.model.Details;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {

    @GET("getdata.php")
    Call<Details> fetchAllData();

    @FormUrlEncoded
    @POST("/insertdata.php")
    Call<Details> insertData(@Field("name ") String name,
                             @Field("email") String email,
                             @Field("phone") String phone,
                             @Field("gender") String gender,
                             @Field("description") String description);
}
