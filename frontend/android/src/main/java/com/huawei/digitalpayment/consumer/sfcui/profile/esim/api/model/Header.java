package com.huawei.digitalpayment.consumer.sfcui.profile.esim.api.model;

import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÇ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001d\u001a\u00020\u0006H×\u0001J\t\u0010\u001e\u001a\u00020\u0003H×\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/api/model/Header;", "", Keys.KEY_CUSTOMER_MESSAGE, "", "requestRefId", "responseCode", "", "responseMessage", "timestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getCustomerMessage", "()Ljava/lang/String;", "getRequestRefId", "getResponseCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getResponseMessage", "getTimestamp", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/api/model/Header;", "equals", "", "other", "hashCode", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Header {
    public static final int $stable = 0;
    private static int component4 = 1;
    private static int copy = 23 % 128;
    private static int equals;
    private static int getRequestBeneficiariesState;

    @SerializedName("responseCode")
    private final Integer ShareDataUIState;

    @SerializedName("responseMessage")
    private final String component1;

    @SerializedName("timestamp")
    private final String component2;

    @SerializedName(Keys.KEY_CUSTOMER_MESSAGE)
    private final String component3;

    @SerializedName("requestRefId")
    private final String copydefault;

    public Header(String str, String str2, Integer num, String str3, String str4) {
        this.component3 = str;
        this.copydefault = str2;
        this.ShareDataUIState = num;
        this.component1 = str3;
        this.component2 = str4;
    }

    public final String getCustomerMessage() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 69;
        equals = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component3;
        int i5 = i2 + 3;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getRequestRefId() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 49;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 17;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final Integer getResponseCode() {
        int i = 2 % 2;
        int i2 = component4 + 71;
        int i3 = i2 % 128;
        equals = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Integer num = this.ShareDataUIState;
        int i4 = i3 + 111;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    public final String getResponseMessage() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 83;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 49;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getTimestamp() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 55;
        equals = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 121;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 88 / 0;
        }
        return str;
    }

    static {
        if (23 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static Header copy$default(Header header, String str, String str2, Integer num, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component4;
        int i4 = i3 + 125;
        equals = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            str = header.component3;
        }
        String str5 = str;
        if ((i & 2) != 0) {
            int i6 = i3 + 51;
            equals = i6 % 128;
            if (i6 % 2 != 0) {
                String str6 = header.copydefault;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str2 = header.copydefault;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            int i7 = equals + 91;
            component4 = i7 % 128;
            int i8 = i7 % 2;
            num = header.ShareDataUIState;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            str3 = header.component1;
        }
        String str8 = str3;
        if ((i & 16) != 0) {
            str4 = header.component2;
            int i9 = component4 + 111;
            equals = i9 % 128;
            int i10 = i9 % 2;
        }
        return header.copy(str5, str7, num2, str8, str4);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 81;
        equals = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component3;
        int i5 = i2 + 7;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 30 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 95;
        equals = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 75;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final Integer component3() {
        int i = 2 % 2;
        int i2 = component4 + 93;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        Integer num = this.ShareDataUIState;
        int i5 = i3 + 119;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 25;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 91;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component4 + 61;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Header copy(String customerMessage, String requestRefId, Integer responseCode, String responseMessage, String timestamp) {
        int i = 2 % 2;
        Header header = new Header(customerMessage, requestRefId, responseCode, responseMessage, timestamp);
        int i2 = component4 + 11;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            return header;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof com.huawei.digitalpayment.consumer.sfcui.profile.esim.api.model.Header) == true) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r6 = (com.huawei.digitalpayment.consumer.sfcui.profile.esim.api.model.Header) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.component3, r6.component3) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.copydefault, r6.copydefault) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.ShareDataUIState, r6.ShareDataUIState)) == true) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.component1, r6.component1) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.component2, r6.component2) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.api.model.Header.component4 + 25;
        com.huawei.digitalpayment.consumer.sfcui.profile.esim.api.model.Header.equals = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        if ((r6 % 2) == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0064, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.api.model.Header.equals + 43;
        com.huawei.digitalpayment.consumer.sfcui.profile.esim.api.model.Header.component4 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.api.model.Header.equals
            int r1 = r1 + 5
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.esim.api.model.Header.component4 = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L16
            r1 = 17
            int r1 = r1 / r3
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r2
        L19:
            boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.sfcui.profile.esim.api.model.Header
            if (r1 == r2) goto L1e
            return r3
        L1e:
            com.huawei.digitalpayment.consumer.sfcui.profile.esim.api.model.Header r6 = (com.huawei.digitalpayment.consumer.sfcui.profile.esim.api.model.Header) r6
            java.lang.String r1 = r5.component3
            java.lang.String r4 = r6.component3
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 == 0) goto L64
            java.lang.String r1 = r5.copydefault
            java.lang.String r4 = r6.copydefault
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L35
            return r3
        L35:
            java.lang.Integer r1 = r5.ShareDataUIState
            java.lang.Integer r4 = r6.ShareDataUIState
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            r1 = r1 ^ r2
            if (r1 == r2) goto L57
            java.lang.String r0 = r5.component1
            java.lang.String r1 = r6.component1
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L4b
            return r3
        L4b:
            java.lang.String r0 = r5.component2
            java.lang.String r6 = r6.component2
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r6)
            if (r6 != 0) goto L56
            return r3
        L56:
            return r2
        L57:
            int r6 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.api.model.Header.component4
            int r6 = r6 + 25
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.esim.api.model.Header.equals = r1
            int r6 = r6 % r0
            if (r6 == 0) goto L63
            return r2
        L63:
            return r3
        L64:
            int r6 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.api.model.Header.equals
            int r6 = r6 + 43
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.esim.api.model.Header.component4 = r1
            int r6 = r6 % r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.esim.api.model.Header.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = component4 + 33;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        if (str == null) {
            int i5 = i3 + 77;
            component4 = i5 % 128;
            iHashCode = i5 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.copydefault;
        if (str2 == null) {
            int i6 = equals;
            int i7 = i6 + 117;
            component4 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i6 + 81;
            component4 = i9 % 128;
            int i10 = i9 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        Integer num = this.ShareDataUIState;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        String str3 = this.component1;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.component2;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Header(customerMessage=" + this.component3 + ", requestRefId=" + this.copydefault + ", responseCode=" + this.ShareDataUIState + ", responseMessage=" + this.component1 + ", timestamp=" + this.component2 + ")";
        int i2 = equals + 69;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
