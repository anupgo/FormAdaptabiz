package com.androidlapp.formadaptabiz.api;


import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public final class RestClient {
    private static final String BASE_URL = "http://cnb.way2sim.com/";

    private static Retrofit retrofit = null;

    /**
     * Prevent instantiation
     */
    private RestClient() {
    }

    /**
     * Gets api interface.
     *
     * @return object of ApiInterface
     */
    public static ApiInterface getApiInterface() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(ApiInterface.class);
    }


}
