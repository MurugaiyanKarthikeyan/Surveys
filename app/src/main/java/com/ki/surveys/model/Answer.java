
package com.ki.surveys.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Answer {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("question_id")
    @Expose
    private String questionId;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("help_text")
    @Expose
    private Object helpText;
    @SerializedName("input_mask_placeholder")
    @Expose
    private Object inputMaskPlaceholder;
    @SerializedName("short_text")
    @Expose
    private String shortText;
    @SerializedName("is_mandatory")
    @Expose
    private Boolean isMandatory;
    @SerializedName("is_customer_first_name")
    @Expose
    private Boolean isCustomerFirstName;
    @SerializedName("is_customer_last_name")
    @Expose
    private Boolean isCustomerLastName;
    @SerializedName("is_customer_title")
    @Expose
    private Boolean isCustomerTitle;
    @SerializedName("is_customer_email")
    @Expose
    private Boolean isCustomerEmail;
    @SerializedName("prompt_custom_answer")
    @Expose
    private Boolean promptCustomAnswer;
    @SerializedName("weight")
    @Expose
    private Object weight;
    @SerializedName("display_order")
    @Expose
    private Integer displayOrder;
    @SerializedName("display_type")
    @Expose
    private String displayType;
    @SerializedName("input_mask")
    @Expose
    private Object inputMask;
    @SerializedName("date_constraint")
    @Expose
    private Object dateConstraint;
    @SerializedName("default_value")
    @Expose
    private Object defaultValue;
    @SerializedName("response_class")
    @Expose
    private String responseClass;
    @SerializedName("reference_identifier")
    @Expose
    private Object referenceIdentifier;
    @SerializedName("score")
    @Expose
    private Integer score;
    @SerializedName("alerts")
    @Expose
    private List<Object> alerts = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
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

    public Object getInputMaskPlaceholder() {
        return inputMaskPlaceholder;
    }

    public void setInputMaskPlaceholder(Object inputMaskPlaceholder) {
        this.inputMaskPlaceholder = inputMaskPlaceholder;
    }

    public String getShortText() {
        return shortText;
    }

    public void setShortText(String shortText) {
        this.shortText = shortText;
    }

    public Boolean getIsMandatory() {
        return isMandatory;
    }

    public void setIsMandatory(Boolean isMandatory) {
        this.isMandatory = isMandatory;
    }

    public Boolean getIsCustomerFirstName() {
        return isCustomerFirstName;
    }

    public void setIsCustomerFirstName(Boolean isCustomerFirstName) {
        this.isCustomerFirstName = isCustomerFirstName;
    }

    public Boolean getIsCustomerLastName() {
        return isCustomerLastName;
    }

    public void setIsCustomerLastName(Boolean isCustomerLastName) {
        this.isCustomerLastName = isCustomerLastName;
    }

    public Boolean getIsCustomerTitle() {
        return isCustomerTitle;
    }

    public void setIsCustomerTitle(Boolean isCustomerTitle) {
        this.isCustomerTitle = isCustomerTitle;
    }

    public Boolean getIsCustomerEmail() {
        return isCustomerEmail;
    }

    public void setIsCustomerEmail(Boolean isCustomerEmail) {
        this.isCustomerEmail = isCustomerEmail;
    }

    public Boolean getPromptCustomAnswer() {
        return promptCustomAnswer;
    }

    public void setPromptCustomAnswer(Boolean promptCustomAnswer) {
        this.promptCustomAnswer = promptCustomAnswer;
    }

    public Object getWeight() {
        return weight;
    }

    public void setWeight(Object weight) {
        this.weight = weight;
    }

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    public Object getInputMask() {
        return inputMask;
    }

    public void setInputMask(Object inputMask) {
        this.inputMask = inputMask;
    }

    public Object getDateConstraint() {
        return dateConstraint;
    }

    public void setDateConstraint(Object dateConstraint) {
        this.dateConstraint = dateConstraint;
    }

    public Object getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(Object defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getResponseClass() {
        return responseClass;
    }

    public void setResponseClass(String responseClass) {
        this.responseClass = responseClass;
    }

    public Object getReferenceIdentifier() {
        return referenceIdentifier;
    }

    public void setReferenceIdentifier(Object referenceIdentifier) {
        this.referenceIdentifier = referenceIdentifier;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public List<Object> getAlerts() {
        return alerts;
    }

    public void setAlerts(List<Object> alerts) {
        this.alerts = alerts;
    }

}
