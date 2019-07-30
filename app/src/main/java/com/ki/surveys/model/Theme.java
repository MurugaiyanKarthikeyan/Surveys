
package com.ki.surveys.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Theme {

    @SerializedName("color_active")
    @Expose
    private String colorActive;
    @SerializedName("color_inactive")
    @Expose
    private String colorInactive;
    @SerializedName("color_question")
    @Expose
    private String colorQuestion;
    @SerializedName("color_answer_normal")
    @Expose
    private String colorAnswerNormal;
    @SerializedName("color_answer_inactive")
    @Expose
    private String colorAnswerInactive;

    public String getColorActive() {
        return colorActive;
    }

    public void setColorActive(String colorActive) {
        this.colorActive = colorActive;
    }

    public String getColorInactive() {
        return colorInactive;
    }

    public void setColorInactive(String colorInactive) {
        this.colorInactive = colorInactive;
    }

    public String getColorQuestion() {
        return colorQuestion;
    }

    public void setColorQuestion(String colorQuestion) {
        this.colorQuestion = colorQuestion;
    }

    public String getColorAnswerNormal() {
        return colorAnswerNormal;
    }

    public void setColorAnswerNormal(String colorAnswerNormal) {
        this.colorAnswerNormal = colorAnswerNormal;
    }

    public String getColorAnswerInactive() {
        return colorAnswerInactive;
    }

    public void setColorAnswerInactive(String colorAnswerInactive) {
        this.colorAnswerInactive = colorAnswerInactive;
    }

}
