package com.ki.surveys.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.ki.surveys.model.TokenResponse;
import com.ki.surveys.repository.TokenRepository;

public class TokenViewModel extends ViewModel {

    private MutableLiveData<TokenResponse> mutableLiveData;
    private TokenRepository tokenRepository;

    public void init(){
        if (mutableLiveData != null){
            return;
        }
        tokenRepository = TokenRepository.getInstance();
        mutableLiveData = tokenRepository.getToken();

    }

    public LiveData<TokenResponse> getTokenRepository() {
        return mutableLiveData;
    }

}
