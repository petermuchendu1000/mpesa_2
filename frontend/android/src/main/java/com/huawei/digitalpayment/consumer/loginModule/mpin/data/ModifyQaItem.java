package com.huawei.digitalpayment.consumer.loginModule.mpin.data;

import com.huawei.http.BaseRequestParams;

public class ModifyQaItem extends BaseRequestParams {
    private static int component1 = 1;
    private static int copydefault;
    private String answer;
    private String newQuestionCode;
    private String oldQuestionCode;

    public String getOldQuestionCode() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 61;
        component1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.oldQuestionCode;
        int i4 = i2 + 89;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public void setOldQuestionCode(String str) {
        int i = 2 % 2;
        int i2 = component1 + 111;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.oldQuestionCode = str;
        if (i3 != 0) {
            throw null;
        }
    }

    public String getNewQuestionCode() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 103;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.newQuestionCode;
        int i5 = i2 + 51;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setNewQuestionCode(String str) {
        int i = 2 % 2;
        int i2 = component1 + 101;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.newQuestionCode = str;
        int i5 = i3 + 33;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public String getAnswer() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 63;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.answer;
        int i5 = i2 + 79;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 29 / 0;
        }
        return str;
    }

    public void setAnswer(String str) {
        int i = 2 % 2;
        int i2 = component1 + 49;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.answer = str;
        if (i4 != 0) {
            int i5 = 16 / 0;
        }
        int i6 = i3 + 99;
        component1 = i6 % 128;
        int i7 = i6 % 2;
    }
}
