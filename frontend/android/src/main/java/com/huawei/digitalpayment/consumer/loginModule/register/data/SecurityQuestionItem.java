package com.huawei.digitalpayment.consumer.loginModule.register.data;

import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.ImtConstants;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/register/data/SecurityQuestionItem;", "Lcom/huawei/http/BaseResp;", "questionCode", "", "order", "", "questionName", "inputType", ImtConstants.KEY_ANSWER, "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getQuestionCode", "()Ljava/lang/String;", "getOrder", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getQuestionName", "getInputType", "getAnswer", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/digitalpayment/consumer/loginModule/register/data/SecurityQuestionItem;", "equals", "", "other", "", "hashCode", "toString", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SecurityQuestionItem extends BaseResp {
    private static int component1 = 1;
    private static int copydefault;
    private final String answer;
    private final String inputType;
    private final Integer order;
    private final String questionCode;
    private final String questionName;

    public final String getQuestionCode() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 61;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.questionCode;
        int i5 = i2 + 69;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer getOrder() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 11;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.order;
        int i5 = i2 + 19;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final String getQuestionName() {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.questionName;
        }
        throw null;
    }

    public final String getInputType() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault + 91;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            str = this.inputType;
            int i4 = 96 / 0;
        } else {
            str = this.inputType;
        }
        int i5 = i3 + 69;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAnswer() {
        int i = 2 % 2;
        int i2 = component1 + 67;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.answer;
        int i5 = i3 + 105;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public SecurityQuestionItem(String str, Integer num, String str2, String str3, String str4) {
        this.questionCode = str;
        this.order = num;
        this.questionName = str2;
        this.inputType = str3;
        this.answer = str4;
    }

    public static SecurityQuestionItem copy$default(SecurityQuestionItem securityQuestionItem, String str, Integer num, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1 + 27;
        int i4 = i3 % 128;
        copydefault = i4;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            str = securityQuestionItem.questionCode;
        }
        String str5 = str;
        if ((i & 2) != 0) {
            num = securityQuestionItem.order;
        }
        Integer num2 = num;
        if ((i & 4) != 0) {
            int i5 = i4 + 101;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            str2 = securityQuestionItem.questionName;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = securityQuestionItem.inputType;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            int i7 = component1 + 107;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            str4 = securityQuestionItem.answer;
        }
        return securityQuestionItem.copy(str5, num2, str6, str7, str4);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 71;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.questionCode;
        int i5 = i3 + 103;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer component2() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 21;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.order;
        int i5 = i2 + 123;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return num;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1 + 81;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.questionName;
        int i4 = i3 + 105;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component1 + 27;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.inputType;
        int i5 = i3 + 49;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 87;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.answer;
        int i5 = i2 + 55;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final SecurityQuestionItem copy(String questionCode, Integer order, String questionName, String inputType, String answer) {
        int i = 2 % 2;
        SecurityQuestionItem securityQuestionItem = new SecurityQuestionItem(questionCode, order, questionName, inputType, answer);
        int i2 = component1 + 123;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 19 / 0;
        }
        return securityQuestionItem;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 39;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            int i5 = i2 + 11;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (!(other instanceof SecurityQuestionItem)) {
            int i6 = i2 + 39;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        SecurityQuestionItem securityQuestionItem = (SecurityQuestionItem) other;
        if (!Intrinsics.areEqual(this.questionCode, securityQuestionItem.questionCode)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.order, securityQuestionItem.order)) {
            int i8 = component1 + 79;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.questionName, securityQuestionItem.questionName)) {
            int i10 = component1 + 41;
            copydefault = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.inputType, securityQuestionItem.inputType)) {
            return false;
        }
        if (Intrinsics.areEqual(this.answer, securityQuestionItem.answer)) {
            return true;
        }
        int i12 = component1 + 89;
        copydefault = i12 % 128;
        return i12 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.questionCode;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Integer num = this.order;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        String str2 = this.questionName;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.inputType;
        if (str3 == null) {
            int i2 = copydefault + 77;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 / 3;
            }
            iHashCode = 0;
        } else {
            iHashCode = str3.hashCode();
            int i4 = copydefault + 41;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        }
        String str4 = this.answer;
        return (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SecurityQuestionItem(questionCode=" + this.questionCode + ", order=" + this.order + ", questionName=" + this.questionName + ", inputType=" + this.inputType + ", answer=" + this.answer + ")";
        int i2 = copydefault + 33;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
