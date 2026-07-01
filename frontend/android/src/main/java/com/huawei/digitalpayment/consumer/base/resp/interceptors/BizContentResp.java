package com.huawei.digitalpayment.consumer.base.resp.interceptors;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÆ\u0003JQ\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006\""}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/interceptors/BizContentResp;", "", "accessToken", "", "appid", "browserCtrlInfo", "Lcom/huawei/digitalpayment/consumer/base/resp/interceptors/BrowserCtrlInfo;", "merchEntryUrl", "registeredTime", "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/base/resp/interceptors/BrowserCtrlInfo;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", "getAccessToken", "()Ljava/lang/String;", "getAppid", "getBrowserCtrlInfo", "()Lcom/huawei/digitalpayment/consumer/base/resp/interceptors/BrowserCtrlInfo;", "getMerchEntryUrl", "getRegisteredTime", "()Ljava/lang/Object;", "getStatus", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BizContentResp {
    private static int component1 = 0;
    private static int component3 = 1;

    @SerializedName("access_token")
    private final String accessToken;

    @SerializedName("appid")
    private final String appid;

    @SerializedName("browser_ctrl_info")
    private final BrowserCtrlInfo browserCtrlInfo;

    @SerializedName("merch_entry_url")
    private final String merchEntryUrl;

    @SerializedName("registered_time")
    private final Object registeredTime;

    @SerializedName("status")
    private final Object status;

    public BizContentResp(String str, String str2, BrowserCtrlInfo browserCtrlInfo, String str3, Object obj, Object obj2) {
        this.accessToken = str;
        this.appid = str2;
        this.browserCtrlInfo = browserCtrlInfo;
        this.merchEntryUrl = str3;
        this.registeredTime = obj;
        this.status = obj2;
    }

    public final String getAccessToken() {
        int i = 2 % 2;
        int i2 = component3 + 21;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.accessToken;
        int i4 = i3 + 21;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getAppid() {
        int i = 2 % 2;
        int i2 = component1 + 77;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.appid;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final BrowserCtrlInfo getBrowserCtrlInfo() {
        int i = 2 % 2;
        int i2 = component1 + 47;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.browserCtrlInfo;
        }
        throw null;
    }

    public final String getMerchEntryUrl() {
        int i = 2 % 2;
        int i2 = component1 + 23;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.merchEntryUrl;
        int i5 = i3 + 33;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Object getRegisteredTime() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 11;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Object obj = this.registeredTime;
        int i4 = i2 + 63;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 29 / 0;
        }
        return obj;
    }

    public final Object getStatus() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 67;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Object obj = this.status;
        int i4 = i2 + 65;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 12 / 0;
        }
        return obj;
    }

    public static BizContentResp copy$default(BizContentResp bizContentResp, String str, String str2, BrowserCtrlInfo browserCtrlInfo, String str3, Object obj, Object obj2, int i, Object obj3) {
        String str4;
        BrowserCtrlInfo browserCtrlInfo2;
        String str5;
        Object obj4;
        int i2 = 2 % 2;
        int i3 = component3 + 87;
        int i4 = i3 % 128;
        component1 = i4;
        if (i3 % 2 == 0 ? (i & 1) == 0 : (i & 1) == 0) {
            str4 = str;
        } else {
            int i5 = i4 + 33;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            str4 = bizContentResp.accessToken;
            int i7 = i4 + 11;
            component3 = i7 % 128;
            int i8 = i7 % 2;
        }
        String str6 = (i & 2) != 0 ? bizContentResp.appid : str2;
        if ((i & 4) != 0) {
            browserCtrlInfo2 = bizContentResp.browserCtrlInfo;
            int i9 = i4 + 81;
            component3 = i9 % 128;
            int i10 = i9 % 2;
        } else {
            browserCtrlInfo2 = browserCtrlInfo;
        }
        if ((i & 8) != 0) {
            int i11 = i4 + 71;
            component3 = i11 % 128;
            if (i11 % 2 == 0) {
                String str7 = bizContentResp.merchEntryUrl;
                Object obj5 = null;
                obj5.hashCode();
                throw null;
            }
            str5 = bizContentResp.merchEntryUrl;
        } else {
            str5 = str3;
        }
        if ((i & 16) != 0) {
            obj4 = bizContentResp.registeredTime;
            int i12 = i4 + 37;
            component3 = i12 % 128;
            int i13 = i12 % 2;
        } else {
            obj4 = obj;
        }
        return bizContentResp.copy(str4, str6, browserCtrlInfo2, str5, obj4, (i & 32) != 0 ? bizContentResp.status : obj2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 93;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.accessToken;
        int i4 = i2 + 87;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 11;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.appid;
        }
        throw null;
    }

    public final BrowserCtrlInfo component3() {
        int i = 2 % 2;
        int i2 = component3 + 11;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        BrowserCtrlInfo browserCtrlInfo = this.browserCtrlInfo;
        int i5 = i3 + 29;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return browserCtrlInfo;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 9;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.merchEntryUrl;
        int i5 = i2 + 53;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Object component5() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 93;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = this.registeredTime;
        int i5 = i2 + 31;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return obj;
        }
        throw null;
    }

    public final Object component6() {
        int i = 2 % 2;
        int i2 = component1 + 85;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Object obj = this.status;
        int i5 = i3 + 1;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return obj;
    }

    public final BizContentResp copy(String accessToken, String appid, BrowserCtrlInfo browserCtrlInfo, String merchEntryUrl, Object registeredTime, Object status) {
        int i = 2 % 2;
        BizContentResp bizContentResp = new BizContentResp(accessToken, appid, browserCtrlInfo, merchEntryUrl, registeredTime, status);
        int i2 = component3 + 61;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return bizContentResp;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1 + 15;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof BizContentResp)) {
            return false;
        }
        BizContentResp bizContentResp = (BizContentResp) other;
        if (!Intrinsics.areEqual(this.accessToken, bizContentResp.accessToken) || !Intrinsics.areEqual(this.appid, bizContentResp.appid) || !Intrinsics.areEqual(this.browserCtrlInfo, bizContentResp.browserCtrlInfo) || !Intrinsics.areEqual(this.merchEntryUrl, bizContentResp.merchEntryUrl) || !Intrinsics.areEqual(this.registeredTime, bizContentResp.registeredTime)) {
            return false;
        }
        if (Intrinsics.areEqual(this.status, bizContentResp.status)) {
            return true;
        }
        int i4 = component1 + 13;
        component3 = i4 % 128;
        return i4 % 2 == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[PHI: r1 r3
  0x001c: PHI (r1v17 java.lang.String) = (r1v4 java.lang.String), (r1v19 java.lang.String) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]
  0x001c: PHI (r3v5 int) = (r3v0 int), (r3v6 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a A[PHI: r3
  0x001a: PHI (r3v1 int) = (r3v0 int), (r3v6 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.base.resp.interceptors.BizContentResp.component1
            int r1 = r1 + 15
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.base.resp.interceptors.BizContentResp.component3 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L15
            java.lang.String r1 = r9.accessToken
            r3 = 1
            if (r1 != 0) goto L1c
            goto L1a
        L15:
            java.lang.String r1 = r9.accessToken
            r3 = r2
            if (r1 != 0) goto L1c
        L1a:
            r1 = r2
            goto L20
        L1c:
            int r1 = r1.hashCode()
        L20:
            java.lang.String r4 = r9.appid
            if (r4 != 0) goto L2f
            int r4 = com.huawei.digitalpayment.consumer.base.resp.interceptors.BizContentResp.component3
            int r4 = r4 + 55
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.base.resp.interceptors.BizContentResp.component1 = r5
            int r4 = r4 % r0
            r4 = r2
            goto L33
        L2f:
            int r4 = r4.hashCode()
        L33:
            com.huawei.digitalpayment.consumer.base.resp.interceptors.BrowserCtrlInfo r5 = r9.browserCtrlInfo
            if (r5 != 0) goto L42
            int r5 = com.huawei.digitalpayment.consumer.base.resp.interceptors.BizContentResp.component1
            int r5 = r5 + 85
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.base.resp.interceptors.BizContentResp.component3 = r6
            int r5 = r5 % r0
            r5 = r2
            goto L4f
        L42:
            int r5 = r5.hashCode()
            int r6 = com.huawei.digitalpayment.consumer.base.resp.interceptors.BizContentResp.component3
            int r6 = r6 + 49
            int r7 = r6 % 128
            com.huawei.digitalpayment.consumer.base.resp.interceptors.BizContentResp.component1 = r7
            int r6 = r6 % r0
        L4f:
            java.lang.String r6 = r9.merchEntryUrl
            if (r6 != 0) goto L55
            r6 = r2
            goto L59
        L55:
            int r6 = r6.hashCode()
        L59:
            java.lang.Object r7 = r9.registeredTime
            if (r7 != 0) goto L67
            int r7 = com.huawei.digitalpayment.consumer.base.resp.interceptors.BizContentResp.component1
            int r7 = r7 + 69
            int r8 = r7 % 128
            com.huawei.digitalpayment.consumer.base.resp.interceptors.BizContentResp.component3 = r8
            int r7 = r7 % r0
            goto L6b
        L67:
            int r2 = r7.hashCode()
        L6b:
            java.lang.Object r0 = r9.status
            if (r0 != 0) goto L70
            goto L74
        L70:
            int r3 = r0.hashCode()
        L74:
            int r1 = r1 * 31
            int r1 = r1 + r4
            int r1 = r1 * 31
            int r1 = r1 + r5
            int r1 = r1 * 31
            int r1 = r1 + r6
            int r1 = r1 * 31
            int r1 = r1 + r2
            int r1 = r1 * 31
            int r1 = r1 + r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.resp.interceptors.BizContentResp.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BizContentResp(accessToken=" + this.accessToken + ", appid=" + this.appid + ", browserCtrlInfo=" + this.browserCtrlInfo + ", merchEntryUrl=" + this.merchEntryUrl + ", registeredTime=" + this.registeredTime + ", status=" + this.status + ")";
        int i2 = component3 + 85;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
