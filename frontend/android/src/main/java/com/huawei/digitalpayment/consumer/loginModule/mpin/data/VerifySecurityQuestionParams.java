package com.huawei.digitalpayment.consumer.loginModule.mpin.data;

import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.ImtConstants;
import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/mpin/data/VerifySecurityQuestionParams;", "Lcom/huawei/http/BaseRequestParams;", "questionCode", "", ImtConstants.KEY_ANSWER, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getQuestionCode", "()Ljava/lang/String;", "getAnswer", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VerifySecurityQuestionParams extends BaseRequestParams {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private final String answer;
    private final String questionCode;

    public final String getAnswer() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 11;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.answer;
        int i5 = i2 + 47;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getQuestionCode() {
        int i = 2 % 2;
        int i2 = copydefault + 9;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.questionCode;
        int i4 = i3 + 49;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public VerifySecurityQuestionParams(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.questionCode = str;
        this.answer = str2;
    }

    public static VerifySecurityQuestionParams copy$default(VerifySecurityQuestionParams verifySecurityQuestionParams, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = copydefault + 93;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            str = verifySecurityQuestionParams.questionCode;
        }
        if ((i & 2) != 0) {
            int i5 = ShareDataUIState + 95;
            int i6 = i5 % 128;
            copydefault = i6;
            if (i5 % 2 == 0) {
                String str3 = verifySecurityQuestionParams.answer;
                throw null;
            }
            str2 = verifySecurityQuestionParams.answer;
            int i7 = i6 + 47;
            ShareDataUIState = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 3 / 3;
            }
        }
        return verifySecurityQuestionParams.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 55;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.questionCode;
        if (i3 == 0) {
            int i4 = 29 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 111;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.answer;
        if (i3 == 0) {
            int i4 = 8 / 0;
        }
        return str;
    }

    public final VerifySecurityQuestionParams copy(String questionCode, String answer) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(questionCode, "");
        Intrinsics.checkNotNullParameter(answer, "");
        VerifySecurityQuestionParams verifySecurityQuestionParams = new VerifySecurityQuestionParams(questionCode, answer);
        int i2 = copydefault + 115;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return verifySecurityQuestionParams;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerifySecurityQuestionParams)) {
            int i2 = copydefault + 13;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        VerifySecurityQuestionParams verifySecurityQuestionParams = (VerifySecurityQuestionParams) other;
        if (!Intrinsics.areEqual(this.questionCode, verifySecurityQuestionParams.questionCode)) {
            int i4 = ShareDataUIState + 11;
            copydefault = i4 % 128;
            return i4 % 2 == 0;
        }
        if (Intrinsics.areEqual(this.answer, verifySecurityQuestionParams.answer)) {
            return true;
        }
        int i5 = copydefault + 111;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 113;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.questionCode.hashCode() * 31) + this.answer.hashCode();
        int i4 = copydefault + 51;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "VerifySecurityQuestionParams(questionCode=" + this.questionCode + ", answer=" + this.answer + ")";
        int i2 = ShareDataUIState + 15;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 95 / 0;
        }
        return str;
    }
}
