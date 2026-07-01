package com.mpesa.qrcode.model.dynamic;

import com.google.gson.annotations.SerializedName;

public class Rule {

    @SerializedName(alternate = {"RuleType"}, value = "ruleType")
    String ruleType;

    @SerializedName(alternate = {"RuleValue"}, value = "ruleValue")
    String ruleValue;

    public String getRuleType() {
        return this.ruleType;
    }

    public void setRuleType(String str) {
        this.ruleType = str;
    }

    public String getRuleValue() {
        return this.ruleValue;
    }

    public void setRuleValue(String str) {
        this.ruleValue = str;
    }
}
