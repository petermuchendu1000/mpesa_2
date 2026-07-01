package com.huawei.digitalpayment.consumer.sfcui.profile.pinmanage.security;

import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.ImtConstants;
import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H×\u0003J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\t\u0010\u0013\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/pinmanage/security/QAItem;", "Lcom/huawei/http/BaseRequestParams;", "questionCode", "", ImtConstants.KEY_ANSWER, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getQuestionCode", "()Ljava/lang/String;", "getAnswer", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QAItem extends BaseRequestParams {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component3 = 0;
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
        int i3 = i2 + 55;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.answer;
        int i4 = i2 + 47;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getQuestionCode() {
        int i = 2 % 2;
        int i2 = copydefault + 81;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.questionCode;
        }
        throw null;
    }

    static {
        int i = 1 + 115;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static QAItem copy$default(QAItem qAItem, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 5;
        copydefault = i4 % 128;
        if (i4 % 2 != 0 && (i & 1) != 0) {
            str = qAItem.questionCode;
        }
        if ((i & 2) != 0) {
            int i5 = i3 + 43;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                String str3 = qAItem.answer;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str2 = qAItem.answer;
        }
        return qAItem.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 11;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.questionCode;
        int i5 = i3 + 67;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 41 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 111;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.answer;
        int i5 = i2 + 123;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final QAItem copy(String questionCode, String answer) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(questionCode, "");
        Intrinsics.checkNotNullParameter(answer, "");
        QAItem qAItem = new QAItem(questionCode, answer);
        int i2 = copydefault + 95;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return qAItem;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 35;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof QAItem)) {
            return false;
        }
        QAItem qAItem = (QAItem) other;
        if (!(!Intrinsics.areEqual(this.questionCode, qAItem.questionCode))) {
            return !(Intrinsics.areEqual(this.answer, qAItem.answer) ^ true);
        }
        int i4 = copydefault;
        int i5 = i4 + 113;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 107;
        ShareDataUIState = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 7;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.questionCode.hashCode() * 31) + this.answer.hashCode();
        int i4 = copydefault + 101;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "QAItem(questionCode=" + this.questionCode + ", answer=" + this.answer + ")";
        int i2 = ShareDataUIState + 33;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
