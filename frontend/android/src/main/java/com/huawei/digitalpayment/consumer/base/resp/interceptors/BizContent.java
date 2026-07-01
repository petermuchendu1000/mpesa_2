package com.huawei.digitalpayment.consumer.base.resp.interceptors;

import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.base.resp.ReferenceDataUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003Ju\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006("}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/interceptors/BizContent;", "", "appid", "", "authIdentifier", "authIdentifierType", "authLimit", "authMerchCode", ReferenceDataUtils.AuthentiationTypeParam, "callbackInfo", "resourceType", "tradeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppid", "()Ljava/lang/String;", "getAuthIdentifier", "getAuthIdentifierType", "getAuthLimit", "getAuthMerchCode", "getAuthType", "getCallbackInfo", "getResourceType", "getTradeType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BizContent {
    private static int component1 = 1;
    private static int component3;

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

    @SerializedName("resource_type")
    private final String resourceType;

    @SerializedName("trade_type")
    private final String tradeType;

    public BizContent(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.appid = str;
        this.authIdentifier = str2;
        this.authIdentifierType = str3;
        this.authLimit = str4;
        this.authMerchCode = str5;
        this.authType = str6;
        this.callbackInfo = str7;
        this.resourceType = str8;
        this.tradeType = str9;
    }

    public final String getAppid() {
        int i = 2 % 2;
        int i2 = component1 + 109;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.appid;
        int i5 = i3 + 47;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getAuthIdentifier() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 57;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.authIdentifier;
        int i4 = i2 + 27;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getAuthIdentifierType() {
        int i = 2 % 2;
        int i2 = component3 + 19;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.authIdentifierType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getAuthLimit() {
        int i = 2 % 2;
        int i2 = component3 + 47;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.authLimit;
        if (i3 == 0) {
            int i4 = 79 / 0;
        }
        return str;
    }

    public final String getAuthMerchCode() {
        int i = 2 % 2;
        int i2 = component3 + 111;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.authMerchCode;
        int i5 = i3 + 59;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAuthType() {
        String str;
        int i = 2 % 2;
        int i2 = component3 + 113;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            str = this.authType;
            int i4 = 92 / 0;
        } else {
            str = this.authType;
        }
        int i5 = i3 + 9;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getCallbackInfo() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 49;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.callbackInfo;
        int i5 = i2 + 119;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getResourceType() {
        int i = 2 % 2;
        int i2 = component1 + 33;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.resourceType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getTradeType() {
        int i = 2 % 2;
        int i2 = component1 + 101;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.tradeType;
        if (i3 != 0) {
            int i4 = 34 / 0;
        }
        return str;
    }

    public static BizContent copy$default(BizContent bizContent, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        int i2 = 2 % 2;
        Object obj2 = null;
        if ((i & 1) != 0) {
            int i3 = component1 + 7;
            component3 = i3 % 128;
            if (i3 % 2 != 0) {
                String str15 = bizContent.appid;
                obj2.hashCode();
                throw null;
            }
            str10 = bizContent.appid;
        } else {
            str10 = str;
        }
        if ((i & 2) != 0) {
            int i4 = component3 + 57;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            str11 = bizContent.authIdentifier;
        } else {
            str11 = str2;
        }
        if ((i & 4) != 0) {
            int i6 = component3 + 13;
            component1 = i6 % 128;
            if (i6 % 2 == 0) {
                String str16 = bizContent.authIdentifierType;
                throw null;
            }
            str12 = bizContent.authIdentifierType;
        } else {
            str12 = str3;
        }
        if ((i & 8) != 0) {
            int i7 = component3 + 9;
            component1 = i7 % 128;
            if (i7 % 2 == 0) {
                String str17 = bizContent.authLimit;
                throw null;
            }
            str13 = bizContent.authLimit;
        } else {
            str13 = str4;
        }
        String str18 = (i & 16) != 0 ? bizContent.authMerchCode : str5;
        if ((i & 32) != 0) {
            int i8 = component1 + 21;
            component3 = i8 % 128;
            if (i8 % 2 != 0) {
                String str19 = bizContent.authType;
                throw null;
            }
            str14 = bizContent.authType;
        } else {
            str14 = str6;
        }
        return bizContent.copy(str10, str11, str12, str13, str18, str14, (i & 64) != 0 ? bizContent.callbackInfo : str7, (i & 128) != 0 ? bizContent.resourceType : str8, (i & 256) != 0 ? bizContent.tradeType : str9);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 79;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.appid;
        int i5 = i2 + 123;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 92 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 91;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.authIdentifier;
        int i5 = i2 + 85;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 111;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.authIdentifierType;
        int i5 = i2 + 35;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        String str;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 69;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.authLimit;
            int i4 = 59 / 0;
        } else {
            str = this.authLimit;
        }
        int i5 = i2 + 3;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 21;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.authMerchCode;
        int i5 = i2 + 23;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component1 + 57;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.authType;
        }
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component3 + 13;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.callbackInfo;
        int i5 = i3 + 25;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 77 / 0;
        }
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = component3 + 85;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.resourceType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = component1 + 9;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.tradeType;
        if (i3 != 0) {
            int i4 = 50 / 0;
        }
        return str;
    }

    public final BizContent copy(String appid, String authIdentifier, String authIdentifierType, String authLimit, String authMerchCode, String authType, String callbackInfo, String resourceType, String tradeType) {
        int i = 2 % 2;
        BizContent bizContent = new BizContent(appid, authIdentifier, authIdentifierType, authLimit, authMerchCode, authType, callbackInfo, resourceType, tradeType);
        int i2 = component3 + 85;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return bizContent;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component3 + 107;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof BizContent)) {
            int i4 = component3 + 47;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        BizContent bizContent = (BizContent) other;
        if (!Intrinsics.areEqual(this.appid, bizContent.appid)) {
            int i6 = component1 + 95;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.authIdentifier, bizContent.authIdentifier)) {
            int i8 = component3 + 111;
            component1 = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.authIdentifierType, bizContent.authIdentifierType)) {
            int i10 = component3 + 35;
            component1 = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.authLimit, bizContent.authLimit) || !Intrinsics.areEqual(this.authMerchCode, bizContent.authMerchCode) || !Intrinsics.areEqual(this.authType, bizContent.authType) || !Intrinsics.areEqual(this.callbackInfo, bizContent.callbackInfo)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.resourceType, bizContent.resourceType)) {
            int i12 = component3 + 35;
            component1 = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.tradeType, bizContent.tradeType)) {
            return true;
        }
        int i14 = component1 + 83;
        component3 = i14 % 128;
        int i15 = i14 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int iHashCode6;
        int i = 2 % 2;
        String str = this.appid;
        if (str == null) {
            int i2 = component1 + 79;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.authIdentifier;
        if (str2 == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
            int i4 = component3 + 59;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        }
        String str3 = this.authIdentifierType;
        if (str3 == null) {
            int i6 = component3 + 47;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str3.hashCode();
        }
        String str4 = this.authLimit;
        if (str4 == null) {
            int i8 = component3 + 113;
            component1 = i8 % 128;
            int i9 = i8 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str4.hashCode();
        }
        String str5 = this.authMerchCode;
        if (str5 == null) {
            int i10 = component1 + 107;
            component3 = i10 % 128;
            int i11 = i10 % 2;
            iHashCode5 = 0;
        } else {
            iHashCode5 = str5.hashCode();
        }
        String str6 = this.authType;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.callbackInfo;
        int iHashCode8 = 1;
        if (str7 == null) {
            int i12 = component3 + 111;
            component1 = i12 % 128;
            iHashCode6 = i12 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode6 = str7.hashCode();
        }
        String str8 = this.resourceType;
        if (str8 == null) {
            int i13 = component1 + 11;
            component3 = i13 % 128;
            if (i13 % 2 == 0) {
                iHashCode8 = 0;
            }
        } else {
            iHashCode8 = str8.hashCode();
        }
        String str9 = this.tradeType;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode7) * 31) + iHashCode6) * 31) + iHashCode8) * 31) + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BizContent(appid=" + this.appid + ", authIdentifier=" + this.authIdentifier + ", authIdentifierType=" + this.authIdentifierType + ", authLimit=" + this.authLimit + ", authMerchCode=" + this.authMerchCode + ", authType=" + this.authType + ", callbackInfo=" + this.callbackInfo + ", resourceType=" + this.resourceType + ", tradeType=" + this.tradeType + ")";
        int i2 = component3 + 117;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
