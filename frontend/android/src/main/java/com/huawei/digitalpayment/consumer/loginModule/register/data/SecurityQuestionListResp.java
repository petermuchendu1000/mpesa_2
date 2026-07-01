package com.huawei.digitalpayment.consumer.loginModule.register.data;

import com.huawei.http.BaseResp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J8\u0010\u0015\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/register/data/SecurityQuestionListResp;", "Lcom/huawei/http/BaseResp;", "questionItemList", "", "Lcom/huawei/digitalpayment/consumer/loginModule/register/data/SecurityQuestionItem;", "questionCount", "", "answerFieldValidateConfig", "Lcom/huawei/digitalpayment/consumer/loginModule/register/data/AnswerValidate;", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Lcom/huawei/digitalpayment/consumer/loginModule/register/data/AnswerValidate;)V", "getQuestionItemList", "()Ljava/util/List;", "getQuestionCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAnswerFieldValidateConfig", "()Lcom/huawei/digitalpayment/consumer/loginModule/register/data/AnswerValidate;", "component1", "component2", "component3", "copy", "(Ljava/util/List;Ljava/lang/Integer;Lcom/huawei/digitalpayment/consumer/loginModule/register/data/AnswerValidate;)Lcom/huawei/digitalpayment/consumer/loginModule/register/data/SecurityQuestionListResp;", "equals", "", "other", "", "hashCode", "toString", "", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SecurityQuestionListResp extends BaseResp {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private final AnswerValidate answerFieldValidateConfig;
    private final Integer questionCount;
    private final List<SecurityQuestionItem> questionItemList;

    public final List<SecurityQuestionItem> getQuestionItemList() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 77;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        List<SecurityQuestionItem> list = this.questionItemList;
        int i5 = i2 + 7;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final Integer getQuestionCount() {
        int i = 2 % 2;
        int i2 = component1 + 121;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.questionCount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final AnswerValidate getAnswerFieldValidateConfig() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 83;
        component1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        AnswerValidate answerValidate = this.answerFieldValidateConfig;
        int i4 = i2 + 65;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return answerValidate;
        }
        obj.hashCode();
        throw null;
    }

    public SecurityQuestionListResp(List<SecurityQuestionItem> list, Integer num, AnswerValidate answerValidate) {
        this.questionItemList = list;
        this.questionCount = num;
        this.answerFieldValidateConfig = answerValidate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SecurityQuestionListResp copy$default(SecurityQuestionListResp securityQuestionListResp, List list, Integer num, AnswerValidate answerValidate, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 91;
        int i4 = i3 % 128;
        component1 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 17;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            list = securityQuestionListResp.questionItemList;
        }
        if ((i & 2) != 0) {
            int i8 = ShareDataUIState + 59;
            component1 = i8 % 128;
            int i9 = i8 % 2;
            num = securityQuestionListResp.questionCount;
        }
        if ((i & 4) != 0) {
            answerValidate = securityQuestionListResp.answerFieldValidateConfig;
        }
        return securityQuestionListResp.copy(list, num, answerValidate);
    }

    public final List<SecurityQuestionItem> component1() {
        List<SecurityQuestionItem> list;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 121;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            list = this.questionItemList;
            int i4 = 10 / 0;
        } else {
            list = this.questionItemList;
        }
        int i5 = i2 + 113;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final Integer component2() {
        int i = 2 % 2;
        int i2 = component1 + 57;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.questionCount;
        if (i3 != 0) {
            int i4 = 80 / 0;
        }
        return num;
    }

    public final AnswerValidate component3() {
        int i = 2 % 2;
        int i2 = component1 + 29;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.answerFieldValidateConfig;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SecurityQuestionListResp copy(List<SecurityQuestionItem> questionItemList, Integer questionCount, AnswerValidate answerFieldValidateConfig) {
        int i = 2 % 2;
        SecurityQuestionListResp securityQuestionListResp = new SecurityQuestionListResp(questionItemList, questionCount, answerFieldValidateConfig);
        int i2 = ShareDataUIState + 119;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return securityQuestionListResp;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 59;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof SecurityQuestionListResp)) {
            int i5 = i2 + 99;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        SecurityQuestionListResp securityQuestionListResp = (SecurityQuestionListResp) other;
        if (!Intrinsics.areEqual(this.questionItemList, securityQuestionListResp.questionItemList) || !Intrinsics.areEqual(this.questionCount, securityQuestionListResp.questionCount)) {
            return false;
        }
        if (Intrinsics.areEqual(this.answerFieldValidateConfig, securityQuestionListResp.answerFieldValidateConfig)) {
            return true;
        }
        int i7 = component1 + 19;
        ShareDataUIState = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 11;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        List<SecurityQuestionItem> list = this.questionItemList;
        if (list == null) {
            int i5 = i3 + 31;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = list.hashCode();
        }
        Integer num = this.questionCount;
        if (num == null) {
            int i7 = component1 + 113;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = num.hashCode();
        }
        AnswerValidate answerValidate = this.answerFieldValidateConfig;
        return (((iHashCode * 31) + iHashCode2) * 31) + (answerValidate != null ? answerValidate.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SecurityQuestionListResp(questionItemList=" + this.questionItemList + ", questionCount=" + this.questionCount + ", answerFieldValidateConfig=" + this.answerFieldValidateConfig + ")";
        int i2 = component1 + 109;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
