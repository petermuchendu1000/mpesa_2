package com.huawei.digitalpayment.common.theme.request.params;

import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/request/params/ThemeQuerySkinParams;", "Lcom/huawei/http/BaseRequestParams;", "count", "", "startNum", "<init>", "(II)V", "getCount", "()I", "setCount", "(I)V", "getStartNum", "setStartNum", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ThemeQuerySkinParams extends BaseRequestParams {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private int count;
    private int startNum;

    /* JADX WARN: Illegal instructions before constructor call */
    public ThemeQuerySkinParams(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i3 & 1) != 0) {
            int i4 = ShareDataUIState + 109;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            i = 20;
        }
        if ((i3 & 2) != 0) {
            int i7 = ShareDataUIState + 103;
            component2 = i7 % 128;
            i2 = i7 % 2 == 0 ? 1 : 0;
            int i8 = 2 % 2;
        }
        this(i, i2);
    }

    public final int getCount() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 57;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.count;
        int i6 = i2 + 73;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final void setCount(int i) {
        int i2 = 2 % 2;
        int i3 = component2 + 71;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.count = i;
        if (i4 != 0) {
            int i5 = 42 / 0;
        }
    }

    public final int getStartNum() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 75;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.startNum;
        if (i3 == 0) {
            int i5 = 56 / 0;
        }
        return i4;
    }

    public final void setStartNum(int i) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 39;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        this.startNum = i;
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 65;
        component2 = i6 % 128;
        int i7 = i6 % 2;
    }

    public ThemeQuerySkinParams(int i, int i2) {
        this.count = i;
        this.startNum = i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ThemeQuerySkinParams() {
        int i = 0;
        this(i, i, 3, null);
    }

    public static ThemeQuerySkinParams copy$default(ThemeQuerySkinParams themeQuerySkinParams, int i, int i2, int i3, Object obj) {
        int i4 = 2 % 2;
        int i5 = ShareDataUIState;
        int i6 = i5 + 77;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        if ((i3 & 1) != 0) {
            int i8 = i5 + 81;
            int i9 = i8 % 128;
            component2 = i9;
            int i10 = i8 % 2;
            int i11 = themeQuerySkinParams.count;
            int i12 = i9 + 25;
            ShareDataUIState = i12 % 128;
            int i13 = i12 % 2;
            i = i11;
        }
        if ((i3 & 2) != 0) {
            int i14 = ShareDataUIState + 115;
            component2 = i14 % 128;
            int i15 = i14 % 2;
            i2 = themeQuerySkinParams.startNum;
        }
        return themeQuerySkinParams.copy(i, i2);
    }

    public final int component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 69;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.count;
        int i6 = i2 + 53;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int component2() {
        int i;
        int i2 = 2 % 2;
        int i3 = component2 + 53;
        int i4 = i3 % 128;
        ShareDataUIState = i4;
        if (i3 % 2 != 0) {
            i = this.startNum;
            int i5 = 96 / 0;
        } else {
            i = this.startNum;
        }
        int i6 = i4 + 73;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public final ThemeQuerySkinParams copy(int count, int startNum) {
        int i = 2 % 2;
        ThemeQuerySkinParams themeQuerySkinParams = new ThemeQuerySkinParams(count, startNum);
        int i2 = component2 + 5;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return themeQuerySkinParams;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 123;
            component2 = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(other instanceof ThemeQuerySkinParams)) {
            int i3 = component2 + 45;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        ThemeQuerySkinParams themeQuerySkinParams = (ThemeQuerySkinParams) other;
        if (this.count != themeQuerySkinParams.count) {
            int i5 = component2 + 107;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (this.startNum == themeQuerySkinParams.startNum) {
            return true;
        }
        int i7 = component2 + 103;
        ShareDataUIState = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 9;
        component2 = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (Integer.hashCode(this.count) << 73) % Integer.hashCode(this.startNum) : (Integer.hashCode(this.count) * 31) + Integer.hashCode(this.startNum);
        int i3 = ShareDataUIState + 69;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ThemeQuerySkinParams(count=" + this.count + ", startNum=" + this.startNum + ")";
        int i2 = component2 + 89;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
