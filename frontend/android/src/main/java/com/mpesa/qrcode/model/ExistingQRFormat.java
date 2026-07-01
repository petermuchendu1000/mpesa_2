package com.mpesa.qrcode.model;

import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;

public class ExistingQRFormat {
    String amount;
    String billCcy;
    String billExprDt;
    String billPayOpt;
    String billReference;
    String billRsv01;

    @SerializedName(alternate = {"OpType", "optype"}, value = "opType")
    String opType;
    String orgName;

    @SerializedName(alternate = {KeysConstants.SHORT_CODE}, value = "shortcode")
    String shortCode;
    String till;

    public String getOpType() {
        return this.opType;
    }

    public void setOpType(String str) {
        this.opType = str;
    }

    public String getShortCode() {
        return this.shortCode;
    }

    public void setShortCode(String str) {
        this.shortCode = str;
    }

    public String getTill() {
        return this.till;
    }

    public void setTill(String str) {
        this.till = str;
    }

    public String getBillReference() {
        return this.billReference;
    }

    public void setBillReference(String str) {
        this.billReference = str;
    }

    public String getAmount() {
        return this.amount;
    }

    public void setAmount(String str) {
        this.amount = str;
    }

    public String getBillCcy() {
        return this.billCcy;
    }

    public void setBillCcy(String str) {
        this.billCcy = str;
    }

    public String getBillExprDt() {
        return this.billExprDt;
    }

    public void setBillExprDt(String str) {
        this.billExprDt = str;
    }

    public String getBillPayOpt() {
        return this.billPayOpt;
    }

    public void setBillPayOpt(String str) {
        this.billPayOpt = str;
    }

    public String getBillRsv01() {
        return this.billRsv01;
    }

    public void setBillRsv01(String str) {
        this.billRsv01 = str;
    }

    public String getOrgName() {
        return this.orgName;
    }

    public void setOrgName(String str) {
        this.orgName = str;
    }
}
