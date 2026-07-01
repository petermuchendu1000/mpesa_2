package com.huawei.digitalpayment.consumer.loginModule.mpin.data;

import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/mpin/data/BaseQuestionItem;", "Lcom/huawei/http/BaseResp;", "questionCode", "", "order", "", "questionName", "type", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getQuestionCode", "()Ljava/lang/String;", "getOrder", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getQuestionName", "getType", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/digitalpayment/consumer/loginModule/mpin/data/BaseQuestionItem;", "equals", "", "other", "", "hashCode", "toString", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BaseQuestionItem extends BaseResp {
    private static int component1 = 1;
    private static int copydefault;
    private final Integer order;
    private final String questionCode;
    private final String questionName;
    private final String type;

    public final String getQuestionCode() {
        int i = 2 % 2;
        int i2 = copydefault + 23;
        int i3 = i2 % 128;
        component1 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.questionCode;
        int i4 = i3 + 69;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final Integer getOrder() {
        int i = 2 % 2;
        int i2 = copydefault + 17;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        Integer num = this.order;
        int i5 = i3 + 89;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final String getQuestionName() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 123;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.questionName;
        int i5 = i2 + 89;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 40 / 0;
        }
        return str;
    }

    public final String getType() {
        int i = 2 % 2;
        int i2 = component1 + 121;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.type;
        int i4 = i3 + 13;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 31 / 0;
        }
        return str;
    }

    public BaseQuestionItem(String str, Integer num, String str2, String str3) {
        this.questionCode = str;
        this.order = num;
        this.questionName = str2;
        this.type = str3;
    }

    public static BaseQuestionItem copy$default(BaseQuestionItem baseQuestionItem, String str, Integer num, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = baseQuestionItem.questionCode;
        }
        if ((i & 2) != 0) {
            num = baseQuestionItem.order;
        }
        if ((i & 4) != 0) {
            int i3 = component1 + 119;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            str2 = baseQuestionItem.questionName;
        }
        if ((i & 8) != 0) {
            int i5 = component1 + 25;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            str3 = baseQuestionItem.type;
        }
        return baseQuestionItem.copy(str, num, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 41;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.questionCode;
        int i4 = i3 + 15;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final Integer component2() {
        int i = 2 % 2;
        int i2 = component1 + 47;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.order;
        if (i3 != 0) {
            int i4 = 16 / 0;
        }
        return num;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 29;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.questionName;
        int i5 = i2 + 69;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 3;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.type;
        int i5 = i2 + 67;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final BaseQuestionItem copy(String questionCode, Integer order, String questionName, String type) {
        int i = 2 % 2;
        BaseQuestionItem baseQuestionItem = new BaseQuestionItem(questionCode, order, questionName, type);
        int i2 = copydefault + 75;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return baseQuestionItem;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault + 85;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseQuestionItem)) {
            int i4 = i3 + 107;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        BaseQuestionItem baseQuestionItem = (BaseQuestionItem) other;
        if (!Intrinsics.areEqual(this.questionCode, baseQuestionItem.questionCode)) {
            int i6 = copydefault + 61;
            component1 = i6 % 128;
            return i6 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.order, baseQuestionItem.order)) {
            int i7 = copydefault + 95;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.questionName, baseQuestionItem.questionName)) {
            return false;
        }
        if (Intrinsics.areEqual(this.type, baseQuestionItem.type)) {
            return true;
        }
        int i9 = component1 + 13;
        copydefault = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component1 + 87;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.questionCode;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Integer num = this.order;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        String str2 = this.questionName;
        if (str2 == null) {
            int i4 = component1 + 31;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
            int i6 = copydefault + 41;
            component1 = i6 % 128;
            int i7 = i6 % 2;
        }
        String str3 = this.type;
        return (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BaseQuestionItem(questionCode=" + this.questionCode + ", order=" + this.order + ", questionName=" + this.questionName + ", type=" + this.type + ")";
        int i2 = copydefault + 53;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
