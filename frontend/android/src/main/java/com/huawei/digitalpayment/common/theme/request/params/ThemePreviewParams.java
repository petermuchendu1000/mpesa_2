package com.huawei.digitalpayment.common.theme.request.params;

import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/request/params/ThemePreviewParams;", "Lcom/huawei/http/BaseRequestParams;", "qrCode", "", "<init>", "(Ljava/lang/String;)V", "getQrCode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ThemePreviewParams extends BaseRequestParams {
    private static int ShareDataUIState = 1;
    private static int component3;
    private final String qrCode;

    public ThemePreviewParams(String str) {
        this.qrCode = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ThemePreviewParams(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = ShareDataUIState;
            int i3 = i2 + 45;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 61;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            str = null;
        }
        this(str);
    }

    public final String getQrCode() {
        int i = 2 % 2;
        int i2 = component3 + 77;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.qrCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ThemePreviewParams() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static ThemePreviewParams copy$default(ThemePreviewParams themePreviewParams, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = ShareDataUIState;
            int i4 = i3 + 111;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            String str2 = themePreviewParams.qrCode;
            int i6 = i3 + 101;
            component3 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 4 % 3;
            }
            str = str2;
        }
        ThemePreviewParams themePreviewParamsCopy = themePreviewParams.copy(str);
        int i8 = component3 + 45;
        ShareDataUIState = i8 % 128;
        int i9 = i8 % 2;
        return themePreviewParamsCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 75;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.qrCode;
        int i5 = i3 + 17;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final ThemePreviewParams copy(String qrCode) {
        int i = 2 % 2;
        ThemePreviewParams themePreviewParams = new ThemePreviewParams(qrCode);
        int i2 = component3 + 93;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return themePreviewParams;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 87;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (other instanceof ThemePreviewParams) {
            return Intrinsics.areEqual(this.qrCode, ((ThemePreviewParams) other).qrCode);
        }
        int i4 = component3 + 125;
        int i5 = i4 % 128;
        ShareDataUIState = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 27;
        component3 = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.qrCode;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i2 = component3 + 95;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = component3 + 77;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ThemePreviewParams(qrCode=" + this.qrCode + ")";
        int i2 = component3 + 101;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
