package com.huawei.digitalpayment.home.request;

import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/home/request/HomeThemeDetailParams;", "Lcom/huawei/http/BaseRequestParams;", "themeId", "", "themeVersion", "", "initiatorMsisdn", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getThemeId", "()Ljava/lang/String;", "getThemeVersion", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getInitiatorMsisdn", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/huawei/digitalpayment/home/request/HomeThemeDetailParams;", "equals", "", "other", "", "hashCode", "toString", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HomeThemeDetailParams extends BaseRequestParams {
    private static int component3 = 1;
    private static int copydefault;
    private final String initiatorMsisdn;
    private final String themeId;
    private final Integer themeVersion;

    /* JADX WARN: Illegal instructions before constructor call */
    public HomeThemeDetailParams(String str, Integer num, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            int i2 = component3 + 109;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i3 = 2 % 2;
            str2 = null;
        }
        this(str, num, str2);
    }

    public final String getThemeId() {
        int i = 2 % 2;
        int i2 = component3 + 77;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.themeId;
        }
        throw null;
    }

    public final Integer getThemeVersion() {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        int i3 = i2 % 128;
        component3 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Integer num = this.themeVersion;
        int i4 = i3 + 1;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return num;
        }
        obj.hashCode();
        throw null;
    }

    public final String getInitiatorMsisdn() {
        int i = 2 % 2;
        int i2 = component3 + 63;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.initiatorMsisdn;
        int i4 = i3 + 61;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public HomeThemeDetailParams(String str, Integer num, String str2) {
        this.themeId = str;
        this.themeVersion = num;
        this.initiatorMsisdn = str2;
    }

    public static HomeThemeDetailParams copy$default(HomeThemeDetailParams homeThemeDetailParams, String str, Integer num, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = homeThemeDetailParams.themeId;
            int i3 = copydefault + 95;
            component3 = i3 % 128;
            int i4 = i3 % 2;
        }
        if ((i & 2) != 0) {
            num = homeThemeDetailParams.themeVersion;
        }
        if ((i & 4) != 0) {
            str2 = homeThemeDetailParams.initiatorMsisdn;
        }
        HomeThemeDetailParams homeThemeDetailParamsCopy = homeThemeDetailParams.copy(str, num, str2);
        int i5 = component3 + 43;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return homeThemeDetailParamsCopy;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 109;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.themeId;
        int i5 = i2 + 19;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final Integer component2() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 23;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.themeVersion;
        int i5 = i2 + 41;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 117;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.initiatorMsisdn;
        int i5 = i2 + 35;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final HomeThemeDetailParams copy(String themeId, Integer themeVersion, String initiatorMsisdn) {
        int i = 2 % 2;
        HomeThemeDetailParams homeThemeDetailParams = new HomeThemeDetailParams(themeId, themeVersion, initiatorMsisdn);
        int i2 = copydefault + 31;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return homeThemeDetailParams;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 71;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            int i5 = i2 + 99;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof HomeThemeDetailParams)) {
            int i7 = i2 + 121;
            copydefault = i7 % 128;
            if (i7 % 2 == 0) {
                return false;
            }
            throw null;
        }
        HomeThemeDetailParams homeThemeDetailParams = (HomeThemeDetailParams) other;
        if (!Intrinsics.areEqual(this.themeId, homeThemeDetailParams.themeId)) {
            return false;
        }
        if (Intrinsics.areEqual(this.themeVersion, homeThemeDetailParams.themeVersion)) {
            return Intrinsics.areEqual(this.initiatorMsisdn, homeThemeDetailParams.initiatorMsisdn);
        }
        int i8 = copydefault + 77;
        component3 = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 43 / 0;
        }
        return false;
    }

    public int hashCode() {
        String str;
        int iHashCode;
        int i = 2 % 2;
        int i2 = component3 + 117;
        copydefault = i2 % 128;
        int iHashCode2 = (i2 % 2 == 0 ? (str = this.themeId) != null : (str = this.themeId) != null) ? str.hashCode() : 0;
        Integer num = this.themeVersion;
        if (num == null) {
            int i3 = component3 + 109;
            int i4 = i3 % 128;
            copydefault = i4;
            iHashCode = i3 % 2 != 0 ? 1 : 0;
            int i5 = i4 + 9;
            component3 = i5 % 128;
            int i6 = i5 % 2;
        } else {
            iHashCode = num.hashCode();
        }
        String str2 = this.initiatorMsisdn;
        return (((iHashCode2 * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "HomeThemeDetailParams(themeId=" + this.themeId + ", themeVersion=" + this.themeVersion + ", initiatorMsisdn=" + this.initiatorMsisdn + ")";
        int i2 = copydefault + 87;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
