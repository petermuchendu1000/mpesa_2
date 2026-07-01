package com.huawei.digitalpayment.consumer.loginModule.mpin.data;

import com.huawei.digitalpayment.consumer.loginModule.register.data.AnswerValidate;
import com.huawei.digitalpayment.consumer.loginModule.register.data.SecurityQuestionItem;
import com.huawei.http.BaseResp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/mpin/data/GetSecurityQuestionResp;", "Lcom/huawei/http/BaseResp;", "questions", "", "Lcom/huawei/digitalpayment/consumer/loginModule/register/data/SecurityQuestionItem;", "answerFieldValidateConfig", "Lcom/huawei/digitalpayment/consumer/loginModule/register/data/AnswerValidate;", "<init>", "(Ljava/util/List;Lcom/huawei/digitalpayment/consumer/loginModule/register/data/AnswerValidate;)V", "getQuestions", "()Ljava/util/List;", "getAnswerFieldValidateConfig", "()Lcom/huawei/digitalpayment/consumer/loginModule/register/data/AnswerValidate;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GetSecurityQuestionResp extends BaseResp {
    private static int ShareDataUIState = 1;
    private static int component2;
    private final AnswerValidate answerFieldValidateConfig;
    private final List<SecurityQuestionItem> questions;

    public final List<SecurityQuestionItem> getQuestions() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 23;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<SecurityQuestionItem> list = this.questions;
        int i4 = i2 + 73;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final AnswerValidate getAnswerFieldValidateConfig() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 13;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        AnswerValidate answerValidate = this.answerFieldValidateConfig;
        int i4 = i3 + 85;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return answerValidate;
    }

    public GetSecurityQuestionResp(List<SecurityQuestionItem> list, AnswerValidate answerValidate) {
        this.questions = list;
        this.answerFieldValidateConfig = answerValidate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static GetSecurityQuestionResp copy$default(GetSecurityQuestionResp getSecurityQuestionResp, List list, AnswerValidate answerValidate, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 57;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            list = getSecurityQuestionResp.questions;
            int i6 = i3 + 23;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
        }
        if ((i & 2) != 0) {
            answerValidate = getSecurityQuestionResp.answerFieldValidateConfig;
            int i8 = i3 + 67;
            ShareDataUIState = i8 % 128;
            int i9 = i8 % 2;
        }
        return getSecurityQuestionResp.copy(list, answerValidate);
    }

    public final List<SecurityQuestionItem> component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 5;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        List<SecurityQuestionItem> list = this.questions;
        int i5 = i3 + 123;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final AnswerValidate component2() {
        int i = 2 % 2;
        int i2 = component2 + 65;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        AnswerValidate answerValidate = this.answerFieldValidateConfig;
        int i5 = i3 + 81;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 86 / 0;
        }
        return answerValidate;
    }

    public final GetSecurityQuestionResp copy(List<SecurityQuestionItem> questions, AnswerValidate answerFieldValidateConfig) {
        int i = 2 % 2;
        GetSecurityQuestionResp getSecurityQuestionResp = new GetSecurityQuestionResp(questions, answerFieldValidateConfig);
        int i2 = component2 + 71;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return getSecurityQuestionResp;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetSecurityQuestionResp)) {
            int i2 = ShareDataUIState + 65;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        GetSecurityQuestionResp getSecurityQuestionResp = (GetSecurityQuestionResp) other;
        if (!Intrinsics.areEqual(this.questions, getSecurityQuestionResp.questions) || !Intrinsics.areEqual(this.answerFieldValidateConfig, getSecurityQuestionResp.answerFieldValidateConfig)) {
            return false;
        }
        int i4 = component2 + 111;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public int hashCode() {
        List<SecurityQuestionItem> list;
        int i = 2 % 2;
        int i2 = component2 + 33;
        ShareDataUIState = i2 % 128;
        int iHashCode = 0;
        int iHashCode2 = (i2 % 2 != 0 ? (list = this.questions) != null : (list = this.questions) != null) ? list.hashCode() : 0;
        AnswerValidate answerValidate = this.answerFieldValidateConfig;
        if (answerValidate != null) {
            iHashCode = answerValidate.hashCode();
            int i3 = ShareDataUIState + 125;
            component2 = i3 % 128;
            int i4 = i3 % 2;
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GetSecurityQuestionResp(questions=" + this.questions + ", answerFieldValidateConfig=" + this.answerFieldValidateConfig + ")";
        int i2 = component2 + 15;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 39 / 0;
        }
        return str;
    }
}
