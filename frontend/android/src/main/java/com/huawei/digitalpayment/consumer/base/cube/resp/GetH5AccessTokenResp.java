package com.huawei.digitalpayment.consumer.base.cube.resp;

import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/cube/resp/GetH5AccessTokenResp;", "Lcom/huawei/http/BaseResp;", "url", "", "accessToken", "appId", "tradeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getAccessToken", "getAppId", "getTradeType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetH5AccessTokenResp extends BaseResp {
    private static int component1 = 1;
    private static int component2;
    private final String accessToken;
    private final String appId;
    private final String tradeType;
    private final String url;

    public final String getUrl() {
        int i = 2 % 2;
        int i2 = component2 + 13;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.url;
        int i5 = i3 + 7;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getAccessToken() {
        int i = 2 % 2;
        int i2 = component1 + 75;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.accessToken;
        int i5 = i3 + 49;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getAppId() {
        int i = 2 % 2;
        int i2 = component2 + 3;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.appId;
        int i5 = i3 + 57;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getTradeType() {
        int i = 2 % 2;
        int i2 = component2 + 117;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.tradeType;
        int i5 = i3 + 43;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public GetH5AccessTokenResp(String str, String str2, String str3, String str4) {
        this.url = str;
        this.accessToken = str2;
        this.appId = str3;
        this.tradeType = str4;
    }

    public static GetH5AccessTokenResp copy$default(GetH5AccessTokenResp getH5AccessTokenResp, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1 + 87;
        int i4 = i3 % 128;
        component2 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 27;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            str = getH5AccessTokenResp.url;
            if (i7 == 0) {
                int i8 = 73 / 0;
            }
        }
        if ((i & 2) != 0) {
            str2 = getH5AccessTokenResp.accessToken;
        }
        if ((i & 4) != 0) {
            int i9 = component1;
            int i10 = i9 + 35;
            component2 = i10 % 128;
            int i11 = i10 % 2;
            String str5 = getH5AccessTokenResp.appId;
            int i12 = i9 + 47;
            component2 = i12 % 128;
            int i13 = i12 % 2;
            str3 = str5;
        }
        if ((i & 8) != 0) {
            str4 = getH5AccessTokenResp.tradeType;
            int i14 = component1 + 121;
            component2 = i14 % 128;
            int i15 = i14 % 2;
        }
        return getH5AccessTokenResp.copy(str, str2, str3, str4);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 1;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.url;
        int i5 = i3 + 89;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 33;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.accessToken;
        int i4 = i2 + 83;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 10 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1 + 97;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.appId;
        int i4 = i3 + 115;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component4() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 67;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            str = this.tradeType;
            int i4 = 24 / 0;
        } else {
            str = this.tradeType;
        }
        int i5 = i3 + 105;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final GetH5AccessTokenResp copy(String url, String accessToken, String appId, String tradeType) {
        int i = 2 % 2;
        GetH5AccessTokenResp getH5AccessTokenResp = new GetH5AccessTokenResp(url, accessToken, appId, tradeType);
        int i2 = component1 + 95;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 39 / 0;
        }
        return getH5AccessTokenResp;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1 + 79;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == other) {
            int i4 = i3 + 37;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (!(other instanceof GetH5AccessTokenResp)) {
            return false;
        }
        GetH5AccessTokenResp getH5AccessTokenResp = (GetH5AccessTokenResp) other;
        if (!Intrinsics.areEqual(this.url, getH5AccessTokenResp.url)) {
            int i6 = component2 + 97;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.accessToken, getH5AccessTokenResp.accessToken)) {
            return Intrinsics.areEqual(this.appId, getH5AccessTokenResp.appId) && Intrinsics.areEqual(this.tradeType, getH5AccessTokenResp.tradeType);
        }
        int i8 = component1 + 35;
        component2 = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component2 + 87;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.url;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.accessToken;
        if (str2 == null) {
            int i4 = component1 + 71;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.appId;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.tradeType;
        return (((((iHashCode2 * 31) + iHashCode) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GetH5AccessTokenResp(url=" + this.url + ", accessToken=" + this.accessToken + ", appId=" + this.appId + ", tradeType=" + this.tradeType + ")";
        int i2 = component2 + 13;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
