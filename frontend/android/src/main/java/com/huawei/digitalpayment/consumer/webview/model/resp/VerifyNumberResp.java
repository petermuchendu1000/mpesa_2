package com.huawei.digitalpayment.consumer.webview.model.resp;

import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/webview/model/resp/VerifyNumberResp;", "Lcom/huawei/http/BaseResp;", KeysConstants.SHORT_CODE, "", "publicName", "msisdn", "customerType", "avatar", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getShortCode", "()Ljava/lang/String;", "getPublicName", "getMsisdn", "getCustomerType", "getAvatar", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerWebviewModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VerifyNumberResp extends BaseResp {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private final String avatar;
    private final String customerType;
    private final String msisdn;
    private final String publicName;
    private final String shortCode;

    public final String getShortCode() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 21;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.shortCode;
        int i5 = i2 + 125;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 28 / 0;
        }
        return str;
    }

    public final String getPublicName() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 61;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.publicName;
        int i5 = i2 + 25;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 63;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.msisdn;
        int i4 = i2 + 85;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getCustomerType() {
        int i = 2 % 2;
        int i2 = component1 + 33;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.customerType;
        int i4 = i3 + 49;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getAvatar() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 17;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.avatar;
        int i5 = i2 + 77;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public VerifyNumberResp(String str, String str2, String str3, String str4, String str5) {
        this.shortCode = str;
        this.publicName = str2;
        this.msisdn = str3;
        this.customerType = str4;
        this.avatar = str5;
    }

    public static VerifyNumberResp copy$default(VerifyNumberResp verifyNumberResp, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = ShareDataUIState + 123;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            str = verifyNumberResp.shortCode;
        }
        String str6 = str;
        if ((i & 2) != 0) {
            int i5 = component1 + 105;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            str2 = verifyNumberResp.publicName;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            int i7 = component1 + 105;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
            str3 = verifyNumberResp.msisdn;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = verifyNumberResp.customerType;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = verifyNumberResp.avatar;
        }
        return verifyNumberResp.copy(str6, str7, str8, str9, str5);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 65;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.shortCode;
        int i4 = i3 + 33;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 37;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.publicName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 113;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.msisdn;
        int i5 = i3 + 43;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 1;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.customerType;
        int i5 = i3 + 29;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 15;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.avatar;
        int i5 = i2 + 75;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final VerifyNumberResp copy(String shortCode, String publicName, String msisdn, String customerType, String avatar) {
        int i = 2 % 2;
        VerifyNumberResp verifyNumberResp = new VerifyNumberResp(shortCode, publicName, msisdn, customerType, avatar);
        int i2 = component1 + 35;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return verifyNumberResp;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerifyNumberResp)) {
            int i2 = ShareDataUIState + 67;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        VerifyNumberResp verifyNumberResp = (VerifyNumberResp) other;
        if (Intrinsics.areEqual(this.shortCode, verifyNumberResp.shortCode) && Intrinsics.areEqual(this.publicName, verifyNumberResp.publicName)) {
            if (!Intrinsics.areEqual(this.msisdn, verifyNumberResp.msisdn)) {
                int i4 = ShareDataUIState;
                int i5 = i4 + 103;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i4 + 43;
                component1 = i7 % 128;
                if (i7 % 2 != 0) {
                    return false;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!Intrinsics.areEqual(this.customerType, verifyNumberResp.customerType)) {
                int i8 = ShareDataUIState + 107;
                component1 = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 0 / 0;
                }
                return false;
            }
            if (!(!Intrinsics.areEqual(this.avatar, verifyNumberResp.avatar))) {
                return true;
            }
            int i10 = component1 + 49;
            ShareDataUIState = i10 % 128;
            if (i10 % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        String str = this.shortCode;
        int iHashCode4 = 0;
        if (str == null) {
            int i2 = ShareDataUIState + 101;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.publicName;
        if (str2 == null) {
            int i4 = ShareDataUIState + 107;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.msisdn;
        if (str3 == null) {
            int i6 = ShareDataUIState + 37;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str3.hashCode();
            int i8 = ShareDataUIState + 25;
            component1 = i8 % 128;
            int i9 = i8 % 2;
        }
        String str4 = this.customerType;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.avatar;
        if (str5 != null) {
            iHashCode4 = str5.hashCode();
            int i10 = component1 + 11;
            ShareDataUIState = i10 % 128;
            int i11 = i10 % 2;
        }
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode5) * 31) + iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "VerifyNumberResp(shortCode=" + this.shortCode + ", publicName=" + this.publicName + ", msisdn=" + this.msisdn + ", customerType=" + this.customerType + ", avatar=" + this.avatar + ")";
        int i2 = component1 + 67;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
