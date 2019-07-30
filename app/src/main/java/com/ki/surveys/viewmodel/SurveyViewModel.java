package com.ki.surveys.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.ki.surveys.SurveyApplication;
import com.ki.surveys.model.Survey;
import com.ki.surveys.repository.SurveyRepository;

import java.util.ArrayList;

public class SurveyViewModel extends ViewModel {

    private MutableLiveData<ArrayList<Survey>> mutableLiveData;
    private SurveyRepository surveyRepository;

    public void init(){
        if (mutableLiveData != null){
            return;
        }
        surveyRepository = SurveyRepository.getInstance();
        mutableLiveData = surveyRepository.getSurveyList(SurveyApplication.getTokenResponse().getAccessToken());

    }

    public LiveData<ArrayList<Survey>> getSurveyRepository() {
        return mutableLiveData;
    }

}
