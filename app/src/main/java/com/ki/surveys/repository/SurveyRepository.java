package com.ki.surveys.repository;

import androidx.lifecycle.MutableLiveData;

import com.ki.surveys.model.Survey;
import com.ki.surveys.network.SurveysApi;
import com.ki.surveys.network.SurveysService;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SurveyRepository {

    private static SurveyRepository surveyRepository;

    public static SurveyRepository getInstance(){
        if (surveyRepository == null){
            surveyRepository = new SurveyRepository();
        }
        return surveyRepository;
    }

    private SurveysService surveysService;

    private SurveyRepository(){
        surveysService = SurveysApi.getClient().create(SurveysService.class);

    }



    public MutableLiveData<ArrayList<Survey>> getSurveyList(String accessToken){
        MutableLiveData<ArrayList<Survey>> surveyListMutableLiveData = new MutableLiveData<>();
        callSurveysApi(accessToken).enqueue(new Callback<ArrayList<Survey>>() {
            @Override
            public void onResponse(Call<ArrayList<Survey>> call, Response<ArrayList<Survey>> response) {
                surveyListMutableLiveData.setValue(response.body());
            }

            @Override
            public void onFailure(Call<ArrayList<Survey>> call, Throwable t) {
                surveyListMutableLiveData.setValue(null);
            }
        });
        return surveyListMutableLiveData;
    }

    private Call<ArrayList<Survey>> callSurveysApi(String accessToken) {
        return surveysService.getSurveys(
                accessToken
        );
    }
}
