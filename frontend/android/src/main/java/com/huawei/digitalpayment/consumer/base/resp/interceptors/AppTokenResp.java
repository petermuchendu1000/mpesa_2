package com.huawei.digitalpayment.consumer.base.resp.interceptors;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/interceptors/AppTokenResp;", "", "effectiveDate", "", "errorCode", "errorMsg", "errorSolution", "expirationDate", "token", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", "getEffectiveDate", "()Ljava/lang/String;", "getErrorCode", "()Ljava/lang/Object;", "getErrorMsg", "getErrorSolution", "getExpirationDate", "getToken", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppTokenResp {
    private static int ShareDataUIState = 1;
    private static int component1;

    @SerializedName("effectiveDate")
    private final String effectiveDate;

    @SerializedName("errorCode")
    private final Object errorCode;

    @SerializedName("errorMsg")
    private final Object errorMsg;

    @SerializedName("errorSolution")
    private final Object errorSolution;

    @SerializedName("expirationDate")
    private final String expirationDate;

    @SerializedName("token")
    private final String token;

    public AppTokenResp(String str, Object obj, Object obj2, Object obj3, String str2, String str3) {
        this.effectiveDate = str;
        this.errorCode = obj;
        this.errorMsg = obj2;
        this.errorSolution = obj3;
        this.expirationDate = str2;
        this.token = str3;
    }

    public final String getEffectiveDate() {
        int i = 2 % 2;
        int i2 = component1 + 71;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.effectiveDate;
        if (i3 == 0) {
            int i4 = 16 / 0;
        }
        return str;
    }

    public final Object getErrorCode() {
        int i = 2 % 2;
        int i2 = component1 + 31;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Object obj = this.errorCode;
        int i5 = i3 + 91;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return obj;
    }

    public final Object getErrorMsg() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 103;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = this.errorMsg;
        int i5 = i2 + 91;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return obj;
    }

    public final Object getErrorSolution() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 97;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Object obj = this.errorSolution;
        int i4 = i2 + 65;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return obj;
    }

    public final String getExpirationDate() {
        int i = 2 % 2;
        int i2 = component1 + 1;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.expirationDate;
        int i5 = i3 + 71;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getToken() {
        int i = 2 % 2;
        int i2 = component1 + 125;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.token;
        int i5 = i3 + 51;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static AppTokenResp copy$default(AppTokenResp appTokenResp, String str, Object obj, Object obj2, Object obj3, String str2, String str3, int i, Object obj4) {
        int i2 = 2 % 2;
        int i3 = component1 + 103;
        int i4 = i3 % 128;
        ShareDataUIState = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 39;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            str = appTokenResp.effectiveDate;
        }
        String str4 = str;
        if ((i & 2) != 0) {
            obj = appTokenResp.errorCode;
        }
        Object obj5 = obj;
        if ((i & 4) != 0) {
            obj2 = appTokenResp.errorMsg;
        }
        Object obj6 = obj2;
        if ((i & 8) != 0) {
            int i8 = component1 + 85;
            ShareDataUIState = i8 % 128;
            int i9 = i8 % 2;
            obj3 = appTokenResp.errorSolution;
        }
        Object obj7 = obj3;
        if ((i & 16) != 0) {
            str2 = appTokenResp.expirationDate;
        }
        String str5 = str2;
        if ((i & 32) != 0) {
            str3 = appTokenResp.token;
        }
        return appTokenResp.copy(str4, obj5, obj6, obj7, str5, str3);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            str = this.effectiveDate;
            int i4 = 59 / 0;
        } else {
            str = this.effectiveDate;
        }
        int i5 = i3 + 71;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final Object component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 19;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = this.errorCode;
        int i5 = i2 + 71;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return obj;
    }

    public final Object component3() {
        int i = 2 % 2;
        int i2 = component1 + 55;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object obj2 = this.errorMsg;
        int i4 = i3 + 121;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return obj2;
    }

    public final Object component4() {
        int i = 2 % 2;
        int i2 = component1 + 71;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object obj2 = this.errorSolution;
        int i4 = i3 + 85;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 68 / 0;
        }
        return obj2;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component1 + 73;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.expirationDate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 13;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.token;
        }
        throw null;
    }

    public final AppTokenResp copy(String effectiveDate, Object errorCode, Object errorMsg, Object errorSolution, String expirationDate, String token) {
        int i = 2 % 2;
        AppTokenResp appTokenResp = new AppTokenResp(effectiveDate, errorCode, errorMsg, errorSolution, expirationDate, token);
        int i2 = ShareDataUIState + 105;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return appTokenResp;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppTokenResp)) {
            int i2 = component1 + 87;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        AppTokenResp appTokenResp = (AppTokenResp) other;
        if (!Intrinsics.areEqual(this.effectiveDate, appTokenResp.effectiveDate)) {
            int i4 = ShareDataUIState + 1;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.errorCode, appTokenResp.errorCode)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.errorMsg, appTokenResp.errorMsg)) {
            int i6 = component1 + 37;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.errorSolution, appTokenResp.errorSolution) || !Intrinsics.areEqual(this.expirationDate, appTokenResp.expirationDate)) {
            return false;
        }
        if (Intrinsics.areEqual(this.token, appTokenResp.token)) {
            return true;
        }
        int i8 = ShareDataUIState + 55;
        component1 = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.effectiveDate;
        int iHashCode2 = 1;
        if (str == null) {
            int i2 = component1 + 1;
            ShareDataUIState = i2 % 128;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        Object obj = this.errorCode;
        int iHashCode3 = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.errorMsg;
        if (obj2 == null) {
            int i3 = ShareDataUIState + 13;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                iHashCode2 = 0;
            }
        } else {
            iHashCode2 = obj2.hashCode();
        }
        Object obj3 = this.errorSolution;
        int iHashCode4 = obj3 == null ? 0 : obj3.hashCode();
        String str2 = this.expirationDate;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.token;
        return (((((((((iHashCode * 31) + iHashCode3) * 31) + iHashCode2) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AppTokenResp(effectiveDate=" + this.effectiveDate + ", errorCode=" + this.errorCode + ", errorMsg=" + this.errorMsg + ", errorSolution=" + this.errorSolution + ", expirationDate=" + this.expirationDate + ", token=" + this.token + ")";
        int i2 = component1 + 107;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
