package com.ki.surveys.repository;


import androidx.lifecycle.MutableLiveData;

import com.ki.surveys.model.TokenResponse;
import com.ki.surveys.network.SurveysApi;
import com.ki.surveys.network.SurveysService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TokenRepository {

    private static TokenRepository tokenRepository;

    public static TokenRepository getInstance(){
        if (tokenRepository == null){
            tokenRepository = new TokenRepository();
        }
        return tokenRepository;
    }

    private SurveysService surveysService;

    public TokenRepository(){
        surveysService = SurveysApi.getClient().create(SurveysService.class);
    }

    public MutableLiveData<TokenResponse> getToken(){
        MutableLiveData<TokenResponse> tokenResponseMutableLiveData = new MutableLiveData<>();

        callSurveysApi().enqueue(new Callback<TokenResponse>() {
            @Override
            public void onResponse(Call<TokenResponse> call, Response<TokenResponse> response) {
                tokenResponseMutableLiveData.setValue(response.body());
            }

            @Override
            public void onFailure(Call<TokenResponse> call, Throwable t) {
                tokenResponseMutableLiveData.setValue(null);

            }
        });
        return tokenResponseMutableLiveData;
    }
    private Call<TokenResponse> callSurveysApi() {
        return surveysService.getToken(
                "password","carlos@nimbl3.com","antikera"

        );
    }
}
