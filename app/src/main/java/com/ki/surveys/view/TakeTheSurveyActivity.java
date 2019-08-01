package com.ki.surveys.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.ki.surveys.R;

public class TakeTheSurveyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_the_survey);
    }

    public void onBackArrow(View view) {
        onBackPressed();
        finish();
    }
}
