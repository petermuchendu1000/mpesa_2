package com.huawei.digitalpayment.consumer.baselib.cube.resp;

import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/cube/resp/GetH5AccessTokenResp;", "Lcom/huawei/http/BaseResp;", "url", "", "accessToken", "appId", "tradeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getAccessToken", "getAppId", "getTradeType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GetH5AccessTokenResp extends BaseResp {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    private final String accessToken;
    private final String appId;
    private final String tradeType;
    private final String url;

    public final String getUrl() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 43;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.url;
        int i5 = i3 + 23;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAccessToken() {
        int i = 2 % 2;
        int i2 = copydefault + 119;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.accessToken;
        int i5 = i3 + 55;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 59 / 0;
        }
        return str;
    }

    public final String getAppId() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 67;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.appId;
        int i4 = i2 + 119;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getTradeType() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 25;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.tradeType;
        int i5 = i2 + 69;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public GetH5AccessTokenResp(String str, String str2, String str3, String str4) {
        this.url = str;
        this.accessToken = str2;
        this.appId = str3;
        this.tradeType = str4;
    }

    public static GetH5AccessTokenResp copy$default(GetH5AccessTokenResp getH5AccessTokenResp, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = copydefault + 79;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                str = getH5AccessTokenResp.url;
                int i4 = 41 / 0;
            } else {
                str = getH5AccessTokenResp.url;
            }
        }
        if ((i & 2) != 0) {
            str2 = getH5AccessTokenResp.accessToken;
        }
        if ((i & 4) != 0) {
            str3 = getH5AccessTokenResp.appId;
        }
        if ((i & 8) != 0) {
            int i5 = copydefault + 3;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                String str5 = getH5AccessTokenResp.tradeType;
                throw null;
            }
            str4 = getH5AccessTokenResp.tradeType;
        }
        return getH5AccessTokenResp.copy(str, str2, str3, str4);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 47;
        ShareDataUIState = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.url;
        int i4 = i2 + 71;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.accessToken;
        if (i3 == 0) {
            int i4 = 94 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 71;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.appId;
        if (i3 != 0) {
            int i4 = 55 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 125;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.tradeType;
        int i5 = i2 + 123;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final GetH5AccessTokenResp copy(String url, String accessToken, String appId, String tradeType) {
        int i = 2 % 2;
        GetH5AccessTokenResp getH5AccessTokenResp = new GetH5AccessTokenResp(url, accessToken, appId, tradeType);
        int i2 = copydefault + 91;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return getH5AccessTokenResp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 91;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof GetH5AccessTokenResp)) {
            return false;
        }
        GetH5AccessTokenResp getH5AccessTokenResp = (GetH5AccessTokenResp) other;
        if (!Intrinsics.areEqual(this.url, getH5AccessTokenResp.url)) {
            int i4 = ShareDataUIState + 117;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.accessToken, getH5AccessTokenResp.accessToken)) {
            return false;
        }
        if (Intrinsics.areEqual(this.appId, getH5AccessTokenResp.appId)) {
            if (Intrinsics.areEqual(this.tradeType, getH5AccessTokenResp.tradeType)) {
                return true;
            }
            int i6 = copydefault + 33;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = ShareDataUIState;
        int i9 = i8 + 93;
        copydefault = i9 % 128;
        int i10 = i9 % 2;
        int i11 = i8 + 91;
        copydefault = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 9;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.url;
        int iHashCode3 = 0;
        if (str == null) {
            int i5 = i2 + 111;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.accessToken;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.appId;
        if (str3 == null) {
            int i7 = ShareDataUIState + 15;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str3.hashCode();
        }
        String str4 = this.tradeType;
        if (str4 == null) {
            int i9 = copydefault + 113;
            ShareDataUIState = i9 % 128;
            int i10 = i9 % 2;
        } else {
            iHashCode3 = str4.hashCode();
        }
        return (((((iHashCode * 31) + iHashCode4) * 31) + iHashCode2) * 31) + iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GetH5AccessTokenResp(url=" + this.url + ", accessToken=" + this.accessToken + ", appId=" + this.appId + ", tradeType=" + this.tradeType + ")";
        int i2 = ShareDataUIState + 117;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
