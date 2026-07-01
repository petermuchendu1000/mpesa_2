package com.huawei.digitalpayment.home.request;

import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/home/request/HomeThemePreviewParams;", "Lcom/huawei/http/BaseRequestParams;", "qrCode", "", "<init>", "(Ljava/lang/String;)V", "getQrCode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HomeThemePreviewParams extends BaseRequestParams {
    private static int component2 = 0;
    private static int copydefault = 1;
    private final String qrCode;

    public final String getQrCode() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 123;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.qrCode;
        int i5 = i2 + 105;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public HomeThemePreviewParams(String str) {
        this.qrCode = str;
    }

    public static HomeThemePreviewParams copy$default(HomeThemePreviewParams homeThemePreviewParams, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 109;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 39;
            copydefault = i6 % 128;
            if (i6 % 2 == 0) {
                String str2 = homeThemePreviewParams.qrCode;
                throw null;
            }
            str = homeThemePreviewParams.qrCode;
        }
        return homeThemePreviewParams.copy(str);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 27;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.qrCode;
        int i5 = i2 + 1;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final HomeThemePreviewParams copy(String qrCode) {
        int i = 2 % 2;
        HomeThemePreviewParams homeThemePreviewParams = new HomeThemePreviewParams(qrCode);
        int i2 = copydefault + 95;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return homeThemePreviewParams;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeThemePreviewParams)) {
            int i2 = copydefault + 113;
            component2 = i2 % 128;
            return i2 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.qrCode, ((HomeThemePreviewParams) other).qrCode)) {
            return true;
        }
        int i3 = copydefault + 125;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 55;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.qrCode;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i3 = copydefault + 109;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "HomeThemePreviewParams(qrCode=" + this.qrCode + ")";
        int i2 = component2 + 31;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
