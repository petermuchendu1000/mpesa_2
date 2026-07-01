package com.huawei.digitalpayment.consumer.loginModule.mpin.data;

import com.huawei.http.BaseRequestParams;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/mpin/data/VerifyBaseQuestionParams;", "Lcom/huawei/http/BaseRequestParams;", "baseQuestions", "", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/data/BaseQuestion;", "<init>", "(Ljava/util/List;)V", "getBaseQuestions", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VerifyBaseQuestionParams extends BaseRequestParams {
    private static int component2 = 0;
    private static int component3 = 1;
    private final List<BaseQuestion> baseQuestions;

    public final List<BaseQuestion> getBaseQuestions() {
        int i = 2 % 2;
        int i2 = component2 + 99;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.baseQuestions;
        }
        throw null;
    }

    public VerifyBaseQuestionParams(List<BaseQuestion> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.baseQuestions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static VerifyBaseQuestionParams copy$default(VerifyBaseQuestionParams verifyBaseQuestionParams, List list, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component2 + 81;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                list = verifyBaseQuestionParams.baseQuestions;
                int i4 = 89 / 0;
            } else {
                list = verifyBaseQuestionParams.baseQuestions;
            }
        }
        VerifyBaseQuestionParams verifyBaseQuestionParamsCopy = verifyBaseQuestionParams.copy(list);
        int i5 = component2 + 5;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return verifyBaseQuestionParamsCopy;
    }

    public final List<BaseQuestion> component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 71;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        List<BaseQuestion> list = this.baseQuestions;
        int i5 = i2 + 55;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final VerifyBaseQuestionParams copy(List<BaseQuestion> baseQuestions) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(baseQuestions, "");
        VerifyBaseQuestionParams verifyBaseQuestionParams = new VerifyBaseQuestionParams(baseQuestions);
        int i2 = component3 + 105;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return verifyBaseQuestionParams;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerifyBaseQuestionParams)) {
            int i2 = component2 + 55;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.baseQuestions, ((VerifyBaseQuestionParams) other).baseQuestions)) {
            return true;
        }
        int i4 = component3 + 25;
        component2 = i4 % 128;
        return i4 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 31;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        List<BaseQuestion> list = this.baseQuestions;
        if (i3 == 0) {
            return list.hashCode();
        }
        list.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "VerifyBaseQuestionParams(baseQuestions=" + this.baseQuestions + ")";
        int i2 = component3 + 89;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
