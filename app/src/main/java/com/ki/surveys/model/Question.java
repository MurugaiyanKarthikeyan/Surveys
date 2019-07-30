
package com.ki.surveys.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Question {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("help_text")
    @Expose
    private Object helpText;
    @SerializedName("display_order")
    @Expose
    private Integer displayOrder;
    @SerializedName("short_text")
    @Expose
    private String shortText;
    @SerializedName("pick")
    @Expose
    private String pick;
    @SerializedName("display_type")
    @Expose
    private String displayType;
    @SerializedName("is_mandatory")
    @Expose
    private Boolean isMandatory;
    @SerializedName("correct_answer_id")
    @Expose
    private Object correctAnswerId;
    @SerializedName("facebook_profile")
    @Expose
    private Object facebookProfile;
    @SerializedName("twitter_profile")
    @Expose
    private Object twitterProfile;
    @SerializedName("image_url")
    @Expose
    private Object imageUrl;
    @SerializedName("cover_image_url")
    @Expose
    private String coverImageUrl;
    @SerializedName("cover_image_opacity")
    @Expose
    private Double coverImageOpacity;
    @SerializedName("cover_background_color")
    @Expose
    private Object coverBackgroundColor;
    @SerializedName("is_shareable_on_facebook")
    @Expose
    private Boolean isShareableOnFacebook;
    @SerializedName("is_shareable_on_twitter")
    @Expose
    private Boolean isShareableOnTwitter;
    @SerializedName("font_face")
    @Expose
    private Object fontFace;
    @SerializedName("font_size")
    @Expose
    private Object fontSize;
    @SerializedName("tag_list")
    @Expose
    private String tagList;
    @SerializedName("answers")
    @Expose
    private List<Answer> answers = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Object getHelpText() {
        return helpText;
    }

    public void setHelpText(Object helpText) {
        this.helpText = helpText;
    }

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    public String getShortText() {
        return shortText;
    }

    public void setShortText(String shortText) {
        this.shortText = shortText;
    }

    public String getPick() {
        return pick;
    }

    public void setPick(String pick) {
        this.pick = pick;
    }

    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    public Boolean getIsMandatory() {
        return isMandatory;
    }

    public void setIsMandatory(Boolean isMandatory) {
        this.isMandatory = isMandatory;
    }

    public Object getCorrectAnswerId() {
        return correctAnswerId;
    }

    public void setCorrectAnswerId(Object correctAnswerId) {
        this.correctAnswerId = correctAnswerId;
    }

    public Object getFacebookProfile() {
        return facebookProfile;
    }

    public void setFacebookProfile(Object facebookProfile) {
        this.facebookProfile = facebookProfile;
    }

    public Object getTwitterProfile() {
        return twitterProfile;
    }

    public void setTwitterProfile(Object twitterProfile) {
        this.twitterProfile = twitterProfile;
    }

    public Object getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Object imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCoverImageUrl() {
        return coverImageUrl;
    }

    public void setCoverImageUrl(String coverImageUrl) {
        this.coverImageUrl = coverImageUrl;
    }

    public Double getCoverImageOpacity() {
        return coverImageOpacity;
    }

    public void setCoverImageOpacity(Double coverImageOpacity) {
        this.coverImageOpacity = coverImageOpacity;
    }

    public Object getCoverBackgroundColor() {
        return coverBackgroundColor;
    }

    public void setCoverBackgroundColor(Object coverBackgroundColor) {
        this.coverBackgroundColor = coverBackgroundColor;
    }

    public Boolean getIsShareableOnFacebook() {
        return isShareableOnFacebook;
    }

    public void setIsShareableOnFacebook(Boolean isShareableOnFacebook) {
        this.isShareableOnFacebook = isShareableOnFacebook;
    }

    public Boolean getIsShareableOnTwitter() {
        return isShareableOnTwitter;
    }

    public void setIsShareableOnTwitter(Boolean isShareableOnTwitter) {
        this.isShareableOnTwitter = isShareableOnTwitter;
    }

    public Object getFontFace() {
        return fontFace;
    }

    public void setFontFace(Object fontFace) {
        this.fontFace = fontFace;
    }

    public Object getFontSize() {
        return fontSize;
    }

    public void setFontSize(Object fontSize) {
        this.fontSize = fontSize;
    }

    public String getTagList() {
        return tagList;
    }

    public void setTagList(String tagList) {
        this.tagList = tagList;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

}
