package com.huawei.digitalpayment.consumer.base.resp.interceptors;

import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.base.constants.KeysConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/interceptors/BrowserCtrlInfo;", "", "authAccessUrl", KeysConstants.KEY_MERCH_CODE, com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants.PREPAY_ID, "urlAuthType", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "getAuthAccessUrl", "()Ljava/lang/Object;", "getMerchCode", "getPrepayId", "getUrlAuthType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BrowserCtrlInfo {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;

    @SerializedName("auth_access_url")
    private final Object authAccessUrl;

    @SerializedName("merch_code")
    private final Object merchCode;

    @SerializedName("prepay_id")
    private final Object prepayId;

    @SerializedName("url_auth_type")
    private final Object urlAuthType;

    public BrowserCtrlInfo(Object obj, Object obj2, Object obj3, Object obj4) {
        this.authAccessUrl = obj;
        this.merchCode = obj2;
        this.prepayId = obj3;
        this.urlAuthType = obj4;
    }

    public final Object getAuthAccessUrl() {
        Object obj;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 1;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            obj = this.authAccessUrl;
            int i4 = 9 / 0;
        } else {
            obj = this.authAccessUrl;
        }
        int i5 = i2 + 71;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return obj;
        }
        throw null;
    }

    public final Object getMerchCode() {
        int i = 2 % 2;
        int i2 = copydefault + 107;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object obj2 = this.merchCode;
        int i4 = i3 + 15;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 17 / 0;
        }
        return obj2;
    }

    public final Object getPrepayId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 5;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Object obj = this.prepayId;
        int i4 = i3 + 15;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return obj;
    }

    public final Object getUrlAuthType() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 19;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj = this.urlAuthType;
        if (i3 == 0) {
            int i4 = 81 / 0;
        }
        return obj;
    }

    public static BrowserCtrlInfo copy$default(BrowserCtrlInfo browserCtrlInfo, Object obj, Object obj2, Object obj3, Object obj4, int i, Object obj5) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            obj = browserCtrlInfo.authAccessUrl;
        }
        if ((i & 2) != 0) {
            obj2 = browserCtrlInfo.merchCode;
            int i3 = ShareDataUIState + 45;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 5 / 5;
            }
        }
        if ((i & 4) != 0) {
            int i5 = copydefault + 55;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            obj3 = browserCtrlInfo.prepayId;
        }
        if ((i & 8) != 0) {
            obj4 = browserCtrlInfo.urlAuthType;
        }
        return browserCtrlInfo.copy(obj, obj2, obj3, obj4);
    }

    public final Object component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 91;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.authAccessUrl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Object component2() {
        int i = 2 % 2;
        int i2 = copydefault + 11;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Object obj = this.merchCode;
        if (i3 != 0) {
            int i4 = 63 / 0;
        }
        return obj;
    }

    public final Object component3() {
        int i = 2 % 2;
        int i2 = copydefault + 17;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object obj2 = this.prepayId;
        int i4 = i3 + 107;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return obj2;
    }

    public final Object component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 57;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.urlAuthType;
        }
        throw null;
    }

    public final BrowserCtrlInfo copy(Object authAccessUrl, Object merchCode, Object prepayId, Object urlAuthType) {
        int i = 2 % 2;
        BrowserCtrlInfo browserCtrlInfo = new BrowserCtrlInfo(authAccessUrl, merchCode, prepayId, urlAuthType);
        int i2 = copydefault + 39;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return browserCtrlInfo;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrowserCtrlInfo)) {
            int i2 = ShareDataUIState;
            int i3 = i2 + 33;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 29;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        BrowserCtrlInfo browserCtrlInfo = (BrowserCtrlInfo) other;
        if (!Intrinsics.areEqual(this.authAccessUrl, browserCtrlInfo.authAccessUrl) || !Intrinsics.areEqual(this.merchCode, browserCtrlInfo.merchCode) || !Intrinsics.areEqual(this.prepayId, browserCtrlInfo.prepayId)) {
            return false;
        }
        if (Intrinsics.areEqual(this.urlAuthType, browserCtrlInfo.urlAuthType)) {
            return true;
        }
        int i7 = ShareDataUIState + 83;
        copydefault = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 89;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        Object obj = this.authAccessUrl;
        if (obj == null) {
            int i5 = i2 + 111;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = obj.hashCode();
        }
        Object obj2 = this.merchCode;
        if (obj2 == null) {
            int i7 = copydefault + 85;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = obj2.hashCode();
        }
        Object obj3 = this.prepayId;
        if (obj3 == null) {
            int i9 = ShareDataUIState + 119;
            copydefault = i9 % 128;
            int i10 = i9 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = obj3.hashCode();
        }
        Object obj4 = this.urlAuthType;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (obj4 != null ? obj4.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BrowserCtrlInfo(authAccessUrl=" + this.authAccessUrl + ", merchCode=" + this.merchCode + ", prepayId=" + this.prepayId + ", urlAuthType=" + this.urlAuthType + ")";
        int i2 = copydefault + 105;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
