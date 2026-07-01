package com.huawei.digitalpayment.consumer.base.resp.interceptors;

import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.base.resp.ReferenceDataUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b+\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¥\u0001\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013¨\u00064"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/interceptors/FlatH5TokenReq;", "", "appid", "", "authIdentifier", "authIdentifierType", "authLimit", "authMerchCode", ReferenceDataUtils.AuthentiationTypeParam, "callbackInfo", "resourceType", "tradeType", "method", "nonceStr", "timestamp", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppid", "()Ljava/lang/String;", "getAuthIdentifier", "getAuthIdentifierType", "getAuthLimit", "getAuthMerchCode", "getAuthType", "getCallbackInfo", "getResourceType", "getTradeType", "getMethod", "getNonceStr", "getTimestamp", "getVersion", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FlatH5TokenReq {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;

    @SerializedName("appid")
    private final String appid;

    @SerializedName("auth_identifier")
    private final String authIdentifier;

    @SerializedName("auth_identifier_type")
    private final String authIdentifierType;

    @SerializedName("auth_limit")
    private final String authLimit;

    @SerializedName("auth_merch_code")
    private final String authMerchCode;

    @SerializedName("auth_type")
    private final String authType;

    @SerializedName("callback_info")
    private final String callbackInfo;

    @SerializedName("method")
    private final String method;

    @SerializedName("nonce_str")
    private final String nonceStr;

    @SerializedName("resource_type")
    private final String resourceType;

    @SerializedName("timestamp")
    private final String timestamp;

    @SerializedName("trade_type")
    private final String tradeType;

    @SerializedName("version")
    private final String version;

    public FlatH5TokenReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        this.appid = str;
        this.authIdentifier = str2;
        this.authIdentifierType = str3;
        this.authLimit = str4;
        this.authMerchCode = str5;
        this.authType = str6;
        this.callbackInfo = str7;
        this.resourceType = str8;
        this.tradeType = str9;
        this.method = str10;
        this.nonceStr = str11;
        this.timestamp = str12;
        this.version = str13;
    }

    public final String getAppid() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 67;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.appid;
        int i5 = i3 + 53;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAuthIdentifier() {
        String str;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 7;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.authIdentifier;
            int i4 = 37 / 0;
        } else {
            str = this.authIdentifier;
        }
        int i5 = i2 + 81;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAuthIdentifierType() {
        int i = 2 % 2;
        int i2 = component2 + 5;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.authIdentifierType;
        int i5 = i3 + 19;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAuthLimit() {
        int i = 2 % 2;
        int i2 = component2 + 15;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.authLimit;
        }
        throw null;
    }

    public final String getAuthMerchCode() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 13;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.authMerchCode;
        int i5 = i2 + 109;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 83 / 0;
        }
        return str;
    }

    public final String getAuthType() {
        int i = 2 % 2;
        int i2 = component2 + 19;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.authType;
        int i4 = i3 + 19;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getCallbackInfo() {
        int i = 2 % 2;
        int i2 = component2 + 39;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.callbackInfo;
        int i5 = i3 + 87;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getResourceType() {
        int i = 2 % 2;
        int i2 = component2 + 61;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.resourceType;
        int i5 = i3 + 73;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 90 / 0;
        }
        return str;
    }

    public final String getTradeType() {
        int i = 2 % 2;
        int i2 = component2 + 7;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.tradeType;
        int i5 = i3 + 49;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 28 / 0;
        }
        return str;
    }

    public final String getMethod() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 17;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.method;
        int i4 = i2 + 93;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getNonceStr() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 95;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.nonceStr;
            int i4 = 34 / 0;
        } else {
            str = this.nonceStr;
        }
        int i5 = i2 + 21;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getTimestamp() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 37;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.timestamp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getVersion() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 103;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.version;
        int i4 = i2 + 9;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public static FlatH5TokenReq copy$default(FlatH5TokenReq flatH5TokenReq, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, Object obj) {
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component2 + 33;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            str14 = flatH5TokenReq.appid;
        } else {
            str14 = str;
        }
        Object obj2 = null;
        if ((i & 2) != 0) {
            int i5 = component2 + 21;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                String str21 = flatH5TokenReq.authIdentifier;
                throw null;
            }
            str15 = flatH5TokenReq.authIdentifier;
        } else {
            str15 = str2;
        }
        String str22 = (i & 4) != 0 ? flatH5TokenReq.authIdentifierType : str3;
        String str23 = (i & 8) != 0 ? flatH5TokenReq.authLimit : str4;
        if ((i & 16) != 0) {
            str16 = flatH5TokenReq.authMerchCode;
            int i6 = component2 + 11;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
        } else {
            str16 = str5;
        }
        String str24 = (i & 32) != 0 ? flatH5TokenReq.authType : str6;
        if ((i & 64) != 0) {
            int i8 = ShareDataUIState + 95;
            component2 = i8 % 128;
            if (i8 % 2 == 0) {
                String str25 = flatH5TokenReq.callbackInfo;
                obj2.hashCode();
                throw null;
            }
            str17 = flatH5TokenReq.callbackInfo;
        } else {
            str17 = str7;
        }
        if ((i & 128) != 0) {
            int i9 = component2 + 81;
            ShareDataUIState = i9 % 128;
            int i10 = i9 % 2;
            str18 = flatH5TokenReq.resourceType;
        } else {
            str18 = str8;
        }
        if ((i & 256) != 0) {
            int i11 = ShareDataUIState + 123;
            component2 = i11 % 128;
            if (i11 % 2 == 0) {
                String str26 = flatH5TokenReq.tradeType;
                throw null;
            }
            str19 = flatH5TokenReq.tradeType;
        } else {
            str19 = str9;
        }
        String str27 = (i & 512) != 0 ? flatH5TokenReq.method : str10;
        String str28 = (i & 1024) != 0 ? flatH5TokenReq.nonceStr : str11;
        if ((i & 2048) != 0) {
            int i12 = component2 + 33;
            ShareDataUIState = i12 % 128;
            int i13 = i12 % 2;
            str20 = flatH5TokenReq.timestamp;
            if (i13 != 0) {
                int i14 = 3 / 0;
            }
        } else {
            str20 = str12;
        }
        return flatH5TokenReq.copy(str14, str15, str22, str23, str16, str24, str17, str18, str19, str27, str28, str20, (i & 4096) != 0 ? flatH5TokenReq.version : str13);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 57;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.appid;
        int i5 = i2 + 1;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = component2 + 71;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.method;
        if (i3 != 0) {
            int i4 = 85 / 0;
        }
        return str;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 19;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.nonceStr;
        int i4 = i3 + 45;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component12() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 71;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.timestamp;
        int i5 = i2 + 105;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 66 / 0;
        }
        return str;
    }

    public final String component13() {
        int i = 2 % 2;
        int i2 = component2 + 3;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.version;
        int i4 = i3 + 111;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 72 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 121;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.authIdentifier;
        int i5 = i3 + 117;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.authIdentifierType;
        int i5 = i3 + 121;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 43;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.authLimit;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 67;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.authMerchCode;
        int i4 = i2 + 125;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        int i3 = i2 % 128;
        component2 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.authType;
        int i4 = i3 + 43;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.callbackInfo;
        if (i3 == 0) {
            int i4 = 56 / 0;
        }
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 67;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.resourceType;
        int i5 = i2 + 121;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 59;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.tradeType;
        int i5 = i3 + 105;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 10 / 0;
        }
        return str;
    }

    public final FlatH5TokenReq copy(String appid, String authIdentifier, String authIdentifierType, String authLimit, String authMerchCode, String authType, String callbackInfo, String resourceType, String tradeType, String method, String nonceStr, String timestamp, String version) {
        int i = 2 % 2;
        FlatH5TokenReq flatH5TokenReq = new FlatH5TokenReq(appid, authIdentifier, authIdentifierType, authLimit, authMerchCode, authType, callbackInfo, resourceType, tradeType, method, nonceStr, timestamp, version);
        int i2 = ShareDataUIState + 107;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return flatH5TokenReq;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlatH5TokenReq)) {
            return false;
        }
        FlatH5TokenReq flatH5TokenReq = (FlatH5TokenReq) other;
        if (!Intrinsics.areEqual(this.appid, flatH5TokenReq.appid)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.authIdentifier, flatH5TokenReq.authIdentifier)) {
            int i2 = ShareDataUIState + 47;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.authIdentifierType, flatH5TokenReq.authIdentifierType)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.authLimit, flatH5TokenReq.authLimit)) {
            int i4 = ShareDataUIState + 51;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.authMerchCode, flatH5TokenReq.authMerchCode)) {
            int i6 = ShareDataUIState + 33;
            component2 = i6 % 128;
            return i6 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.authType, flatH5TokenReq.authType) || !Intrinsics.areEqual(this.callbackInfo, flatH5TokenReq.callbackInfo)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.resourceType, flatH5TokenReq.resourceType)) {
            int i7 = ShareDataUIState + 95;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.tradeType, flatH5TokenReq.tradeType)) {
            int i9 = ShareDataUIState + 49;
            component2 = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.method, flatH5TokenReq.method) || !Intrinsics.areEqual(this.nonceStr, flatH5TokenReq.nonceStr)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.timestamp, flatH5TokenReq.timestamp))) {
            return Intrinsics.areEqual(this.version, flatH5TokenReq.version);
        }
        int i11 = ShareDataUIState + 105;
        component2 = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i = 2 % 2;
        String str = this.appid;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.authIdentifier;
        if (str2 == null) {
            int i2 = ShareDataUIState + 25;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.authIdentifierType;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.authLimit;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.authMerchCode;
        if (str5 == null) {
            int i4 = ShareDataUIState + 119;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str5.hashCode();
        }
        String str6 = this.authType;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.callbackInfo;
        int iHashCode9 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.resourceType;
        int iHashCode10 = 1;
        if (str8 == null) {
            int i6 = ShareDataUIState + 71;
            component2 = i6 % 128;
            iHashCode3 = i6 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode3 = str8.hashCode();
        }
        String str9 = this.tradeType;
        if (str9 == null) {
            int i7 = ShareDataUIState + 49;
            component2 = i7 % 128;
            if (i7 % 2 != 0) {
                iHashCode10 = 0;
            }
        } else {
            iHashCode10 = str9.hashCode();
        }
        String str10 = this.method;
        int iHashCode11 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.nonceStr;
        int iHashCode12 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.timestamp;
        if (str12 == null) {
            int i8 = ShareDataUIState + 65;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str12.hashCode();
        }
        String str13 = this.version;
        return (((((((((((((((((((((((iHashCode5 * 31) + iHashCode) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode2) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode3) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode4) * 31) + (str13 != null ? str13.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FlatH5TokenReq(appid=" + this.appid + ", authIdentifier=" + this.authIdentifier + ", authIdentifierType=" + this.authIdentifierType + ", authLimit=" + this.authLimit + ", authMerchCode=" + this.authMerchCode + ", authType=" + this.authType + ", callbackInfo=" + this.callbackInfo + ", resourceType=" + this.resourceType + ", tradeType=" + this.tradeType + ", method=" + this.method + ", nonceStr=" + this.nonceStr + ", timestamp=" + this.timestamp + ", version=" + this.version + ")";
        int i2 = component2 + 79;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
