package com.ki.surveys.view;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import com.ki.surveys.R;
import com.ki.surveys.SurveyApplication;
import com.ki.surveys.model.Survey;
import com.ki.surveys.viewmodel.SurveyViewModel;
import com.ki.surveys.viewmodel.TokenViewModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;


public class SurveyActivity extends AppCompatActivity {
    private ArrayList<Survey> surveyArrayList = new ArrayList<>();
    CustomViewPager customViewPager;
    ViewPagerAdapter viewPagerAdapter;
    LinearLayout linearLayout;
    ProgressBar progressBar;
    private int dotsCount;
    private ImageView[] dots;
    Button btn;
    int currentPage = 0;
    Timer timer;
    final long DELAY_MS = 1000;
    final long PERIOD_MS = 3000;
    Context context;

    boolean isDataLoaded;

    SurveyViewModel surveyViewModel;
    TokenViewModel tokenViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);
        this.context = this;
        progressBar = findViewById(R.id.progressBar);
        customViewPager = findViewById(R.id.view_pager);
        linearLayout = findViewById(R.id.ll_slider_dots);
        btn=findViewById(R.id.btn_Take_Survey);
        initTokenData();

    }

    private void initTokenData() {
        tokenViewModel = ViewModelProviders.of(this).get(TokenViewModel.class);
        tokenViewModel.init();
        tokenViewModel.getTokenRepository().observe(this, tokenResponse -> {
            SurveyApplication.setTokenResponse(tokenResponse);
            initSurveyData();

        });
    }
    private void initSurveyData() {
        surveyViewModel = ViewModelProviders.of(this).get(SurveyViewModel.class);
        surveyViewModel.init();
        surveyViewModel.getSurveyRepository().observe(this, surveyResponse -> {
            List<Survey> surveyList = surveyResponse;
            Log.d("surveyList.size",""+surveyList.size());
            surveyArrayList.addAll(surveyList);
            progressBar.setVisibility(View.GONE);
            btn.setVisibility(View.VISIBLE);
            initView(surveyArrayList);

        });
    }

    private void initView(ArrayList<Survey> surveyArrayList) {
        viewPagerAdapter = new ViewPagerAdapter(this, surveyArrayList);

        customViewPager.setAdapter(viewPagerAdapter);
        isDataLoaded =true;
        dotsCount = viewPagerAdapter.getCount();
        dots = new ImageView[dotsCount];
        for (int i = 0; i < dotsCount; i++) {

            dots[i] = new ImageView(this);
            dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.non_active_dot));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(0, 10, 0, 10);

            linearLayout.addView(dots[i], params);

        }

        dots[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));

        customViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                for (int i = 0; i < dotsCount; i++) {
                    dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.non_active_dot));
                }

                dots[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {

                if (currentPage == dotsCount) {
                    currentPage = 0;
                }
                customViewPager.setCurrentItem(currentPage++, true);
            }
        };

        timer = new Timer();
        timer.schedule(new TimerTask() { // task to be scheduled

            @Override
            public void run() {
                handler.post(Update);
            }
        }, DELAY_MS, PERIOD_MS);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    public void onRefreshList(View view) {
        Toast.makeText(getApplicationContext(),"Refresh clicked",Toast.LENGTH_LONG).show();
        if(isDataLoaded){
            reloadSurveyList();
        }
    }

    private void reloadSurveyList() {
        surveyViewModel.getSurveyRepository().observe(this, surveyResponse -> {
            List<Survey> surveyList = surveyResponse;
            surveyArrayList.addAll(surveyList);
            viewPagerAdapter.setData(surveyArrayList);
            viewPagerAdapter.notifyDataSetChanged();
            customViewPager.invalidate();


        });

    }


}
