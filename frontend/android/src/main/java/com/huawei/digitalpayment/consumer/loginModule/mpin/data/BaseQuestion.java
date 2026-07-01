package com.huawei.digitalpayment.consumer.loginModule.mpin.data;

import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.ImtConstants;
import com.huawei.http.BaseRequestParams;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/mpin/data/BaseQuestion;", "Lcom/huawei/http/BaseRequestParams;", "questionCode", "", "questionName", ImtConstants.KEY_ANSWER, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getQuestionCode", "()Ljava/lang/String;", "getQuestionName", "getAnswer", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BaseQuestion extends BaseRequestParams {
    private static int component2 = 1;
    private static int copydefault;
    private final List<String> answer;
    private final String questionCode;
    private final String questionName;

    public final String getQuestionCode() {
        int i = 2 % 2;
        int i2 = component2 + 11;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.questionCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getQuestionName() {
        int i = 2 % 2;
        int i2 = copydefault + 87;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.questionName;
        }
        throw null;
    }

    public final List<String> getAnswer() {
        int i = 2 % 2;
        int i2 = copydefault + 73;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.answer;
        }
        throw null;
    }

    public BaseQuestion(String str, String str2, List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.questionCode = str;
        this.questionName = str2;
        this.answer = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static BaseQuestion copy$default(BaseQuestion baseQuestion, String str, String str2, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 13;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 81;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            str = baseQuestion.questionCode;
        }
        Object obj2 = null;
        if ((i & 2) != 0) {
            int i8 = i3 + 25;
            copydefault = i8 % 128;
            if (i8 % 2 != 0) {
                String str3 = baseQuestion.questionName;
                obj2.hashCode();
                throw null;
            }
            str2 = baseQuestion.questionName;
        }
        if ((i & 4) != 0) {
            int i9 = copydefault + 57;
            component2 = i9 % 128;
            if (i9 % 2 == 0) {
                List<String> list2 = baseQuestion.answer;
                obj2.hashCode();
                throw null;
            }
            list = baseQuestion.answer;
        }
        BaseQuestion baseQuestionCopy = baseQuestion.copy(str, str2, list);
        int i10 = copydefault + 85;
        component2 = i10 % 128;
        int i11 = i10 % 2;
        return baseQuestionCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 43;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.questionCode;
        int i4 = i2 + 91;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault + 69;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.questionName;
        }
        throw null;
    }

    public final List<String> component3() {
        int i = 2 % 2;
        int i2 = component2 + 45;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        List<String> list = this.answer;
        int i5 = i3 + 95;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final BaseQuestion copy(String questionCode, String questionName, List<String> answer) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(questionCode, "");
        Intrinsics.checkNotNullParameter(questionName, "");
        Intrinsics.checkNotNullParameter(answer, "");
        BaseQuestion baseQuestion = new BaseQuestion(questionCode, questionName, answer);
        int i2 = component2 + 103;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return baseQuestion;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseQuestion)) {
            int i2 = component2 + 117;
            copydefault = i2 % 128;
            return i2 % 2 != 0;
        }
        BaseQuestion baseQuestion = (BaseQuestion) other;
        if (!Intrinsics.areEqual(this.questionCode, baseQuestion.questionCode)) {
            int i3 = copydefault + 59;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.questionName, baseQuestion.questionName)) {
            return Intrinsics.areEqual(this.answer, baseQuestion.answer);
        }
        int i5 = copydefault + 89;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 115;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.questionCode.hashCode();
        return i3 != 0 ? (((iHashCode << 19) % this.questionName.hashCode()) << 48) - this.answer.hashCode() : (((iHashCode * 31) + this.questionName.hashCode()) * 31) + this.answer.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BaseQuestion(questionCode=" + this.questionCode + ", questionName=" + this.questionName + ", answer=" + this.answer + ")";
        int i2 = component2 + 1;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
