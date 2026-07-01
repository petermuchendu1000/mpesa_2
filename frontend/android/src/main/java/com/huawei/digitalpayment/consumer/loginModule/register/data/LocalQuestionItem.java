package com.huawei.digitalpayment.consumer.loginModule.register.data;

import com.huawei.digitalpayment.consumer.baselib.dialog.SingleSelectBean;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002BA\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u001a\u001a\u00020\u0004H\u0016J\t\u0010\u001b\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0016JP\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\tHÖ\u0001J\t\u0010'\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\n\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006("}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/register/data/LocalQuestionItem;", "Lcom/huawei/digitalpayment/consumer/baselib/dialog/SingleSelectBean;", "Lcom/huawei/http/BaseResp;", "code", "", "name", "inputType", "pattern", "order", "", "isCheck", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getCode", "()Ljava/lang/String;", "getName", "getInputType", "getPattern", "getOrder", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Ljava/lang/Boolean;", "setCheck", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getShowContext", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/huawei/digitalpayment/consumer/loginModule/register/data/LocalQuestionItem;", "equals", "other", "", "hashCode", "toString", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LocalQuestionItem extends BaseResp implements SingleSelectBean {
    private static int ShareDataUIState = 1;
    private static int component3;
    private final String code;
    private final String inputType;
    private Boolean isCheck;
    private final String name;
    private final Integer order;
    private final String pattern;

    public final String getCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.code;
        int i5 = i3 + 11;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 19;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.name;
        int i5 = i3 + 37;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getInputType() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 109;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            str = this.inputType;
            int i4 = 65 / 0;
        } else {
            str = this.inputType;
        }
        int i5 = i3 + 51;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getPattern() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 73;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.pattern;
        }
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LocalQuestionItem(String str, String str2, String str3, String str4, Integer num, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Integer num2;
        Boolean bool2;
        if ((i & 16) != 0) {
            int i2 = ShareDataUIState + 123;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            num2 = 0;
        } else {
            num2 = num;
        }
        if ((i & 32) != 0) {
            int i5 = ShareDataUIState + 121;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            bool2 = false;
        } else {
            bool2 = bool;
        }
        this(str, str2, str3, str4, num2, bool2);
    }

    public final Integer getOrder() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 109;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.order;
        int i5 = i2 + 71;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        throw null;
    }

    public final Boolean isCheck() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 27;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.isCheck;
        int i5 = i2 + 43;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return bool;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setCheck(Boolean bool) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 3;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.isCheck = bool;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 21;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public LocalQuestionItem(String str, String str2, String str3, String str4, Integer num, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.code = str;
        this.name = str2;
        this.inputType = str3;
        this.pattern = str4;
        this.order = num;
        this.isCheck = bool;
    }

    @Override
    public String getShowContext() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.name;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static LocalQuestionItem copy$default(LocalQuestionItem localQuestionItem, String str, String str2, String str3, String str4, Integer num, Boolean bool, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = localQuestionItem.code;
        }
        String str5 = str;
        if ((i & 2) != 0) {
            str2 = localQuestionItem.name;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = localQuestionItem.inputType;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            int i3 = ShareDataUIState + 37;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            str4 = localQuestionItem.pattern;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            int i5 = component3 + 93;
            int i6 = i5 % 128;
            ShareDataUIState = i6;
            if (i5 % 2 == 0) {
                Integer num2 = localQuestionItem.order;
                throw null;
            }
            num = localQuestionItem.order;
            int i7 = i6 + 1;
            component3 = i7 % 128;
            int i8 = i7 % 2;
        }
        Integer num3 = num;
        if ((i & 32) != 0) {
            int i9 = ShareDataUIState + 9;
            component3 = i9 % 128;
            if (i9 % 2 != 0) {
                Boolean bool2 = localQuestionItem.isCheck;
                throw null;
            }
            bool = localQuestionItem.isCheck;
        }
        return localQuestionItem.copy(str5, str6, str7, str8, num3, bool);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 75;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.code;
        int i5 = i3 + 125;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3 + 89;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.name;
        int i5 = i3 + 41;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.inputType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 53;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.pattern;
        int i4 = i2 + 119;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 6 / 0;
        }
        return str;
    }

    public final Integer component5() {
        int i = 2 % 2;
        int i2 = component3 + 113;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Integer num = this.order;
        int i5 = i3 + 35;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Boolean component6() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 31;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Boolean bool = this.isCheck;
        int i4 = i2 + 55;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    public final LocalQuestionItem copy(String code, String name, String inputType, String pattern, Integer order, Boolean isCheck) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(code, "");
        Intrinsics.checkNotNullParameter(name, "");
        Intrinsics.checkNotNullParameter(inputType, "");
        LocalQuestionItem localQuestionItem = new LocalQuestionItem(code, name, inputType, pattern, order, isCheck);
        int i2 = component3 + 57;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return localQuestionItem;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 103;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalQuestionItem)) {
            int i4 = i2 + 125;
            component3 = i4 % 128;
            boolean z = i4 % 2 != 0;
            int i5 = i2 + 123;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }
        LocalQuestionItem localQuestionItem = (LocalQuestionItem) other;
        if (!Intrinsics.areEqual(this.code, localQuestionItem.code) || !Intrinsics.areEqual(this.name, localQuestionItem.name)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.inputType, localQuestionItem.inputType)) {
            int i7 = ShareDataUIState + 39;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.pattern, localQuestionItem.pattern)) {
            int i9 = ShareDataUIState + 109;
            component3 = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.order, localQuestionItem.order)) {
            int i11 = ShareDataUIState + 75;
            component3 = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.isCheck, localQuestionItem.isCheck)) {
            return true;
        }
        int i13 = ShareDataUIState + 5;
        component3 = i13 % 128;
        return i13 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.code.hashCode();
        int iHashCode3 = this.name.hashCode();
        int iHashCode4 = this.inputType.hashCode();
        String str = this.pattern;
        int iHashCode5 = 0;
        if (str == null) {
            int i2 = ShareDataUIState + 115;
            component3 = i2 % 128;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        Integer num = this.order;
        int iHashCode6 = num == null ? 0 : num.hashCode();
        Boolean bool = this.isCheck;
        if (bool != null) {
            iHashCode5 = bool.hashCode();
            int i3 = component3 + 109;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = (((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode6) * 31) + iHashCode5;
        int i6 = ShareDataUIState + 63;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LocalQuestionItem(code=" + this.code + ", name=" + this.name + ", inputType=" + this.inputType + ", pattern=" + this.pattern + ", order=" + this.order + ", isCheck=" + this.isCheck + ")";
        int i2 = component3 + 123;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
