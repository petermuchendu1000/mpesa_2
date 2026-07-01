package com.huawei.image.glide;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.Objects;

public class Base64Mode implements Serializable {
    public static final String CONSUMER_AVATAR = "customer-avatar";
    public static final String MERCHANT_PHOTO = "merchant-photo";
    public static final String OPERATOR_AVATAR = "operator-avatar";
    private String bizType;
    private String docId;
    private String fileContent;

    public Base64Mode(String str) {
        this.docId = str;
    }

    public Base64Mode(String str, String str2) {
        this.docId = str;
        this.bizType = str2;
    }

    public static Base64Mode getConsumerMode(String str) {
        return new Base64Mode(str, CONSUMER_AVATAR);
    }

    public static Base64Mode getPartnerMode(String str) {
        return new Base64Mode(str, OPERATOR_AVATAR);
    }

    public String getDocId() {
        return this.docId;
    }

    public void setDocId(String str) {
        this.docId = str;
    }

    public String getFileContent() {
        return this.fileContent;
    }

    public void setFileContent(String str) {
        this.fileContent = str;
    }

    public String getBizType() {
        return TextUtils.isEmpty(this.bizType) ? OPERATOR_AVATAR : this.bizType;
    }

    public void setBizType(String str) {
        this.bizType = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Base64Mode base64Mode = (Base64Mode) obj;
        return TextUtils.equals(this.docId, base64Mode.docId) && TextUtils.equals(this.bizType, base64Mode.bizType);
    }

    public int hashCode() {
        return Objects.hash(this.docId, this.bizType);
    }
}
