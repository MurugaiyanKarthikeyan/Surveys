
package com.ki.surveys.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Survey {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("access_code_prompt")
    @Expose
    private Object accessCodePrompt;
    @SerializedName("thank_email_above_threshold")
    @Expose
    private String thankEmailAboveThreshold;
    @SerializedName("thank_email_below_threshold")
    @Expose
    private String thankEmailBelowThreshold;
    @SerializedName("footer_content")
    @Expose
    private String footerContent;
    @SerializedName("is_active")
    @Expose
    private Boolean isActive;
    @SerializedName("cover_image_url")
    @Expose
    private String coverImageUrl;
    @SerializedName("cover_background_color")
    @Expose
    private Object coverBackgroundColor;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("active_at")
    @Expose
    private String activeAt;
    @SerializedName("inactive_at")
    @Expose
    private Object inactiveAt;
    @SerializedName("survey_version")
    @Expose
    private Integer surveyVersion;
    @SerializedName("short_url")
    @Expose
    private String shortUrl;
    @SerializedName("language_list")
    @Expose
    private List<String> languageList = null;
    @SerializedName("default_language")
    @Expose
    private String defaultLanguage;
    @SerializedName("tag_list")
    @Expose
    private String tagList;
    @SerializedName("is_access_code_required")
    @Expose
    private Boolean isAccessCodeRequired;
    @SerializedName("is_access_code_valid_required")
    @Expose
    private Boolean isAccessCodeValidRequired;
    @SerializedName("access_code_validation")
    @Expose
    private String accessCodeValidation;
    @SerializedName("theme")
    @Expose
    private Theme theme;
    @SerializedName("questions")
    @Expose
    private List<Question> questions = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getAccessCodePrompt() {
        return accessCodePrompt;
    }

    public void setAccessCodePrompt(Object accessCodePrompt) {
        this.accessCodePrompt = accessCodePrompt;
    }

    public String getThankEmailAboveThreshold() {
        return thankEmailAboveThreshold;
    }

    public void setThankEmailAboveThreshold(String thankEmailAboveThreshold) {
        this.thankEmailAboveThreshold = thankEmailAboveThreshold;
    }

    public String getThankEmailBelowThreshold() {
        return thankEmailBelowThreshold;
    }

    public void setThankEmailBelowThreshold(String thankEmailBelowThreshold) {
        this.thankEmailBelowThreshold = thankEmailBelowThreshold;
    }

    public String getFooterContent() {
        return footerContent;
    }

    public void setFooterContent(String footerContent) {
        this.footerContent = footerContent;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public String getCoverImageUrl() {
        return coverImageUrl;
    }

    public void setCoverImageUrl(String coverImageUrl) {
        this.coverImageUrl = coverImageUrl;
    }

    public Object getCoverBackgroundColor() {
        return coverBackgroundColor;
    }

    public void setCoverBackgroundColor(Object coverBackgroundColor) {
        this.coverBackgroundColor = coverBackgroundColor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getActiveAt() {
        return activeAt;
    }

    public void setActiveAt(String activeAt) {
        this.activeAt = activeAt;
    }

    public Object getInactiveAt() {
        return inactiveAt;
    }

    public void setInactiveAt(Object inactiveAt) {
        this.inactiveAt = inactiveAt;
    }

    public Integer getSurveyVersion() {
        return surveyVersion;
    }

    public void setSurveyVersion(Integer surveyVersion) {
        this.surveyVersion = surveyVersion;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public List<String> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(List<String> languageList) {
        this.languageList = languageList;
    }

    public String getDefaultLanguage() {
        return defaultLanguage;
    }

    public void setDefaultLanguage(String defaultLanguage) {
        this.defaultLanguage = defaultLanguage;
    }

    public String getTagList() {
        return tagList;
    }

    public void setTagList(String tagList) {
        this.tagList = tagList;
    }

    public Boolean getIsAccessCodeRequired() {
        return isAccessCodeRequired;
    }

    public void setIsAccessCodeRequired(Boolean isAccessCodeRequired) {
        this.isAccessCodeRequired = isAccessCodeRequired;
    }

    public Boolean getIsAccessCodeValidRequired() {
        return isAccessCodeValidRequired;
    }

    public void setIsAccessCodeValidRequired(Boolean isAccessCodeValidRequired) {
        this.isAccessCodeValidRequired = isAccessCodeValidRequired;
    }

    public String getAccessCodeValidation() {
        return accessCodeValidation;
    }

    public void setAccessCodeValidation(String accessCodeValidation) {
        this.accessCodeValidation = accessCodeValidation;
    }

    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

}
