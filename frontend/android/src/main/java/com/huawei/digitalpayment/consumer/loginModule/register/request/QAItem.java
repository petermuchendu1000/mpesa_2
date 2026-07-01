package com.huawei.digitalpayment.consumer.loginModule.register.request;

import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.ImtConstants;
import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/register/request/QAItem;", "Lcom/huawei/http/BaseRequestParams;", "questionCode", "", ImtConstants.KEY_ANSWER, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getQuestionCode", "()Ljava/lang/String;", "getAnswer", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QAItem extends BaseRequestParams {
    private static int component2 = 0;
    private static int copydefault = 1;
    private final String answer;
    private final String questionCode;

    public QAItem(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.questionCode = str;
        this.answer = str2;
    }

    public final String getAnswer() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 17;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.answer;
        int i4 = i2 + 7;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getQuestionCode() {
        int i = 2 % 2;
        int i2 = copydefault + 91;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.questionCode;
        int i5 = i3 + 71;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static QAItem copy$default(QAItem qAItem, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2 + 71;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 1) != 0) {
            str = qAItem.questionCode;
        }
        if ((i & 2) != 0) {
            str2 = qAItem.answer;
        }
        QAItem qAItemCopy = qAItem.copy(str, str2);
        int i5 = component2 + 5;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return qAItemCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 79;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.questionCode;
        int i5 = i3 + 113;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 81;
        copydefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.answer;
        int i4 = i2 + 105;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final QAItem copy(String questionCode, String answer) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(questionCode, "");
        Intrinsics.checkNotNullParameter(answer, "");
        QAItem qAItem = new QAItem(questionCode, answer);
        int i2 = component2 + 23;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return qAItem;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2 + 11;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof QAItem)) {
            int i5 = i3 + 31;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        QAItem qAItem = (QAItem) other;
        if ((!Intrinsics.areEqual(this.questionCode, qAItem.questionCode)) || !Intrinsics.areEqual(this.answer, qAItem.answer)) {
            return false;
        }
        int i7 = copydefault + 15;
        component2 = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 63;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.questionCode.hashCode() * 31) + this.answer.hashCode();
        int i4 = component2 + 57;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 53 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "QAItem(questionCode=" + this.questionCode + ", answer=" + this.answer + ")";
        int i2 = component2 + 13;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
