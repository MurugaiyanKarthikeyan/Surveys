package com.ki.surveys.network;



import com.ki.surveys.model.Survey;
import com.ki.surveys.model.TokenResponse;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;


public interface SurveysService {

    @GET("surveys.json")
    Call<ArrayList<Survey>> getSurveys(
            @Query("access_token") String token
    );


    @FormUrlEncoded
    @POST("oauth/token")
    Call<TokenResponse>  getToken(
            @Field("grant_type") String grantType,
            @Field("username") String username,
            @Field("password") String password
    );

}
