package com.huawei.digitalpayment.consumer.base.resp.interceptors;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/interceptors/AppSecretReq;", "", "appSecret", "", "<init>", "(Ljava/lang/String;)V", "getAppSecret", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppSecretReq {
    private static int component2 = 0;
    private static int component3 = 1;

    @SerializedName("appSecret")
    private final String appSecret;

    public AppSecretReq(String str) {
        this.appSecret = str;
    }

    public final String getAppSecret() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 69;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.appSecret;
        int i5 = i2 + 91;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 35 / 0;
        }
        return str;
    }

    public static AppSecretReq copy$default(AppSecretReq appSecretReq, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 117;
        component3 = i4 % 128;
        int i5 = i & 1;
        if (i4 % 2 != 0 ? i5 != 0 : i5 != 0) {
            int i6 = i3 + 9;
            component3 = i6 % 128;
            if (i6 % 2 == 0) {
                String str2 = appSecretReq.appSecret;
                throw null;
            }
            str = appSecretReq.appSecret;
        }
        return appSecretReq.copy(str);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 79;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.appSecret;
        int i4 = i2 + 85;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 11 / 0;
        }
        return str;
    }

    public final AppSecretReq copy(String appSecret) {
        int i = 2 % 2;
        AppSecretReq appSecretReq = new AppSecretReq(appSecret);
        int i2 = component2 + 15;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return appSecretReq;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppSecretReq)) {
            int i2 = component3 + 21;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 66 / 0;
            }
            return false;
        }
        if (Intrinsics.areEqual(this.appSecret, ((AppSecretReq) other).appSecret)) {
            int i4 = component2 + 7;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                return true;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = component3;
        int i6 = i5 + 7;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i5 + 71;
        component2 = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 59;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.appSecret;
        if (str == null) {
            return 0;
        }
        int iHashCode = str.hashCode();
        int i3 = component3 + 117;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 3 % 5;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AppSecretReq(appSecret=" + this.appSecret + ")";
        int i2 = component3 + 17;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
