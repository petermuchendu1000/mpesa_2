package com.huawei.digitalpayment.consumer.sfcui.profile.pinmanage.security;

import com.huawei.digitalpayment.consumer.baselib.dialog.SingleSelectBean;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0018\u001a\u00020\u0004H\u0016J\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0004HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0014JD\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÇ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\"H×\u0003J\t\u0010#\u001a\u00020\bH×\u0001J\t\u0010$\u001a\u00020\u0004H×\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\t\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006%"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/pinmanage/security/LocalQuestionItem;", "Lcom/huawei/digitalpayment/consumer/baselib/dialog/SingleSelectBean;", "Lcom/huawei/http/BaseResp;", "code", "", "name", "inputType", "order", "", "isCheck", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getCode", "()Ljava/lang/String;", "getName", "getInputType", "getOrder", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Ljava/lang/Boolean;", "setCheck", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getShowContext", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/huawei/digitalpayment/consumer/sfcui/profile/pinmanage/security/LocalQuestionItem;", "equals", "other", "", "hashCode", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LocalQuestionItem extends BaseResp implements SingleSelectBean {
    public static final int $stable = 8;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;
    private final String code;
    private final String inputType;
    private Boolean isCheck;
    private final String name;
    private final Integer order;

    public final String getCode() {
        int i = 2 % 2;
        int i2 = component3 + 115;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.code;
        int i5 = i3 + 95;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = component3 + 115;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.name;
        int i5 = i3 + 87;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getInputType() {
        int i = 2 % 2;
        int i2 = copydefault + 7;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.inputType;
        }
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LocalQuestionItem(String str, String str2, String str3, Integer num, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 8) != 0) {
            num = 0;
            int i2 = copydefault + 19;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 5 / 2;
            } else {
                int i4 = 2 % 2;
            }
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            int i5 = component3 + 107;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            bool = false;
            int i7 = copydefault + 7;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
        }
        this(str, str2, str3, num2, bool);
    }

    public final Integer getOrder() {
        int i = 2 % 2;
        int i2 = component3 + 109;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Integer num = this.order;
        int i5 = i3 + 9;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 74 / 0;
        }
        return num;
    }

    public final Boolean isCheck() {
        int i = 2 % 2;
        int i2 = component3 + 101;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = this.isCheck;
        if (i3 != 0) {
            int i4 = 88 / 0;
        }
        return bool;
    }

    public final void setCheck(Boolean bool) {
        int i = 2 % 2;
        int i2 = copydefault + 69;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.isCheck = bool;
        int i5 = i3 + 39;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 59 / 0;
        }
    }

    public LocalQuestionItem(String str, String str2, String str3, Integer num, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.code = str;
        this.name = str2;
        this.inputType = str3;
        this.order = num;
        this.isCheck = bool;
    }

    @Override
    public String getShowContext() {
        int i = 2 % 2;
        int i2 = copydefault + 67;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.name;
        int i5 = i3 + 15;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = 1 + 25;
        component1 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static LocalQuestionItem copy$default(LocalQuestionItem localQuestionItem, String str, String str2, String str3, Integer num, Boolean bool, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault;
        int i4 = i3 + 59;
        component3 = i4 % 128;
        if (i4 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            int i5 = i3 + 41;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                str = localQuestionItem.code;
                int i6 = 50 / 0;
            } else {
                str = localQuestionItem.code;
            }
        }
        String str4 = str;
        if ((i & 2) != 0) {
            int i7 = i3 + 65;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            str2 = localQuestionItem.name;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = localQuestionItem.inputType;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            num = localQuestionItem.order;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            int i9 = component3 + 17;
            copydefault = i9 % 128;
            if (i9 % 2 != 0) {
                Boolean bool2 = localQuestionItem.isCheck;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            bool = localQuestionItem.isCheck;
        }
        return localQuestionItem.copy(str4, str5, str6, num2, bool);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 37;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.code;
        int i5 = i2 + 47;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3 + 93;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.name;
        if (i3 != 0) {
            int i4 = 99 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 17;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.inputType;
        int i5 = i2 + 11;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer component4() {
        int i = 2 % 2;
        int i2 = component3 + 105;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.order;
        if (i3 != 0) {
            int i4 = 20 / 0;
        }
        return num;
    }

    public final Boolean component5() {
        int i = 2 % 2;
        int i2 = copydefault + 1;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.isCheck;
        }
        throw null;
    }

    public final LocalQuestionItem copy(String code, String name, String inputType, Integer order, Boolean isCheck) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(code, "");
        Intrinsics.checkNotNullParameter(name, "");
        Intrinsics.checkNotNullParameter(inputType, "");
        LocalQuestionItem localQuestionItem = new LocalQuestionItem(code, name, inputType, order, isCheck);
        int i2 = component3 + 49;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return localQuestionItem;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 123;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof LocalQuestionItem)) {
            return false;
        }
        LocalQuestionItem localQuestionItem = (LocalQuestionItem) other;
        if (!Intrinsics.areEqual(this.code, localQuestionItem.code)) {
            int i4 = copydefault + 13;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.name, localQuestionItem.name)) {
            return Intrinsics.areEqual(this.inputType, localQuestionItem.inputType) && Intrinsics.areEqual(this.order, localQuestionItem.order) && Intrinsics.areEqual(this.isCheck, localQuestionItem.isCheck);
        }
        int i6 = component3 + 71;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component3 + 53;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.code.hashCode();
        int iHashCode3 = this.name.hashCode();
        int iHashCode4 = this.inputType.hashCode();
        Integer num = this.order;
        int iHashCode5 = 0;
        if (num == null) {
            int i4 = copydefault + 75;
            int i5 = i4 % 128;
            component3 = i5;
            iHashCode = i4 % 2 == 0 ? 1 : 0;
            int i6 = i5 + 31;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
        } else {
            iHashCode = num.hashCode();
        }
        Boolean bool = this.isCheck;
        if (bool == null) {
            int i8 = copydefault + 125;
            component3 = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 5 % 5;
            }
        } else {
            iHashCode5 = bool.hashCode();
        }
        return (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode5;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LocalQuestionItem(code=" + this.code + ", name=" + this.name + ", inputType=" + this.inputType + ", order=" + this.order + ", isCheck=" + this.isCheck + ")";
        int i2 = component3 + 89;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
