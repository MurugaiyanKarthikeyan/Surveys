package com.ki.surveys.view;

import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import com.ki.surveys.R;

import org.hamcrest.Matchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
@RunWith(AndroidJUnit4.class)
@LargeTest
public class SurveyActivityTest {


    @Rule
    public ActivityTestRule<SurveyActivity> activityRule =
            new ActivityTestRule<>(SurveyActivity.class);

    @Test
    public void isToolbarTitleSetAsSurveys() {
        onView(withId(R.id.tv_heading)).check(matches(withText("Surveys")));
    }
    @Test
    public void isProgressBarLoadingOnScreen() {
        onView(withId(R.id.progressBar)).check(matches(isDisplayed()));
    }
    @Test
    public void isTakeSurveyButtonVisibilityGone() {
        onView(Matchers.allOf(ViewMatchers.withText("Take the survey"))).check(ViewAssertions.matches(ViewMatchers.withEffectiveVisibility(ViewMatchers.Visibility.GONE)));
    }
}