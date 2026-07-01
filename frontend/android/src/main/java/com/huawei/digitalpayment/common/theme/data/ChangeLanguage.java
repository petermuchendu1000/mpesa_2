package com.huawei.digitalpayment.common.theme.data;

import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u0018\u001a\u00020\tHÆ\u0003JH\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/common/theme/data/ChangeLanguage;", "Lcom/huawei/http/BaseResp;", "color", "", "size", "", "marginStart", "marginEnd", "isShow", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Z)V", "getColor", "()Ljava/lang/String;", "getSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMarginStart", "getMarginEnd", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Z)Lcom/huawei/digitalpayment/common/theme/data/ChangeLanguage;", "equals", "other", "", "hashCode", "toString", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChangeLanguage extends BaseResp {
    private static int ShareDataUIState = 1;
    private static int component1;
    private final String color;
    private final boolean isShow;
    private final Integer marginEnd;
    private final Integer marginStart;
    private final Integer size;

    /* JADX WARN: Illegal instructions before constructor call */
    public ChangeLanguage(String str, Integer num, Integer num2, Integer num3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Integer num4;
        Integer num5;
        Integer num6 = null;
        String str2 = (i & 1) != 0 ? null : str;
        if ((i & 2) != 0) {
            int i2 = 2 % 2;
            num4 = null;
        } else {
            num4 = num;
        }
        if ((i & 4) != 0) {
            int i3 = ShareDataUIState + 11;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            num5 = null;
        } else {
            num5 = num2;
        }
        if ((i & 8) != 0) {
            int i5 = component1 + 97;
            int i6 = i5 % 128;
            ShareDataUIState = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 67;
            component1 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
        } else {
            num6 = num3;
        }
        this(str2, num4, num5, num6, (i & 16) != 0 ? false : z);
    }

    public final String getColor() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 25;
        component1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.color;
        int i4 = i2 + 121;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final Integer getSize() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.size;
        if (i3 != 0) {
            int i4 = 78 / 0;
        }
        return num;
    }

    public final Integer getMarginStart() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 117;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.marginStart;
        int i5 = i2 + 123;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer getMarginEnd() {
        int i = 2 % 2;
        int i2 = component1 + 65;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer num = this.marginEnd;
        int i4 = i3 + 93;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    public final boolean isShow() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 113;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.isShow;
        int i5 = i2 + 109;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public ChangeLanguage(String str, Integer num, Integer num2, Integer num3, boolean z) {
        this.color = str;
        this.size = num;
        this.marginStart = num2;
        this.marginEnd = num3;
        this.isShow = z;
    }

    public ChangeLanguage() {
        this(null, null, null, null, false, 31, null);
    }

    public static ChangeLanguage copy$default(ChangeLanguage changeLanguage, String str, Integer num, Integer num2, Integer num3, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 39;
        component1 = i4 % 128;
        if (i4 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            str = changeLanguage.color;
            int i5 = i3 + 51;
            component1 = i5 % 128;
            int i6 = i5 % 2;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            int i7 = i3 + 73;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            Integer num4 = changeLanguage.size;
            if (i8 != 0) {
                int i9 = 60 / 0;
            }
            num = num4;
        }
        Integer num5 = num;
        if ((i & 4) != 0) {
            num2 = changeLanguage.marginStart;
        }
        Integer num6 = num2;
        if ((i & 8) != 0) {
            num3 = changeLanguage.marginEnd;
        }
        Integer num7 = num3;
        if ((i & 16) != 0) {
            z = changeLanguage.isShow;
        }
        return changeLanguage.copy(str2, num5, num6, num7, z);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 15;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.color;
        int i5 = i3 + 61;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 95;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.size;
        int i5 = i2 + 115;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return num;
        }
        throw null;
    }

    public final Integer component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 103;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.marginStart;
        int i5 = i2 + 69;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer component4() {
        int i = 2 % 2;
        int i2 = component1 + 49;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Integer num = this.marginEnd;
        int i5 = i3 + 103;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component5() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 83;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z = this.isShow;
        int i4 = i2 + 49;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final ChangeLanguage copy(String color, Integer size, Integer marginStart, Integer marginEnd, boolean isShow) {
        int i = 2 % 2;
        ChangeLanguage changeLanguage = new ChangeLanguage(color, size, marginStart, marginEnd, isShow);
        int i2 = ShareDataUIState + 41;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return changeLanguage;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1 + 85;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 95;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 51 / 0;
            }
            return true;
        }
        if (!(other instanceof ChangeLanguage)) {
            int i7 = i3 + 67;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        ChangeLanguage changeLanguage = (ChangeLanguage) other;
        if (!Intrinsics.areEqual(this.color, changeLanguage.color)) {
            int i9 = component1 + 7;
            ShareDataUIState = i9 % 128;
            return i9 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.size, changeLanguage.size)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.marginStart, changeLanguage.marginStart)) {
            int i10 = ShareDataUIState + 57;
            component1 = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.marginEnd, changeLanguage.marginEnd))) {
            return this.isShow == changeLanguage.isShow;
        }
        int i12 = ShareDataUIState + 69;
        component1 = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.color;
        if (str == null) {
            int i2 = ShareDataUIState + 75;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        Integer num = this.size;
        if (num == null) {
            int i4 = ShareDataUIState + 39;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = num.hashCode();
            int i6 = ShareDataUIState + 1;
            component1 = i6 % 128;
            int i7 = i6 % 2;
        }
        Integer num2 = this.marginStart;
        int iHashCode3 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.marginEnd;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num3 != null ? num3.hashCode() : 0)) * 31) + Boolean.hashCode(this.isShow);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ChangeLanguage(color=" + this.color + ", size=" + this.size + ", marginStart=" + this.marginStart + ", marginEnd=" + this.marginEnd + ", isShow=" + this.isShow + ")";
        int i2 = component1 + 97;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
