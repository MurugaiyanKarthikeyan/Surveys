package com.ki.surveys.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SurveyTest {
    private Survey survey;
    @Before
    public void setUp()  {
        survey = new Survey();
        survey.setTitle("Surveys");
        survey.setDescription("Welcome");
        survey.setCoverImageUrl("http://url.com");

    }


    @Test
    public void surveyTitle_String_Set_As_Surveys_ReturnsTrue() {
        assertEquals("Surveys",survey.getTitle());
    }

    @Test
    public void surveyDescription_String__Set_As_Welcome_ReturnsTrue() {
        assertEquals("Welcome",survey.getDescription());
    }

    @Test
    public void surveyTitle_String_NotEquals_Welcome_ReturnsTrue() {
        assertNotEquals("i",survey.getTitle());
    }
    @Test
    public void surveyTitle_String_Not_Null_ReturnsTrue() {
        assertNotNull("",survey.getTitle());
    }

    @After
    public void tearDown()  {
        survey = null;
    }
}