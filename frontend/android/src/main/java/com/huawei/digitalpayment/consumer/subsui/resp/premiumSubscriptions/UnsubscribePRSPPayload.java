package com.huawei.digitalpayment.consumer.subsui.resp.premiumSubscriptions;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/subsui/resp/premiumSubscriptions/UnsubscribePRSPPayload;", "Landroid/os/Parcelable;", "cpId", "", "msisdn", "offerCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCpId", "()Ljava/lang/String;", "getMsisdn", "getOfferCode", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcMySubscriptionsUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UnsubscribePRSPPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<UnsubscribePRSPPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component3;
    private static int copydefault;

    @SerializedName("cpId")
    private final String cpId;

    @SerializedName("msisdn")
    private final String msisdn;

    @SerializedName("offerCode")
    private final String offerCode;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UnsubscribePRSPPayload> {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final UnsubscribePRSPPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            UnsubscribePRSPPayload unsubscribePRSPPayload = new UnsubscribePRSPPayload(parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = ShareDataUIState + 103;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return unsubscribePRSPPayload;
        }

        @Override
        public UnsubscribePRSPPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 93;
            ShareDataUIState = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                createFromParcel(parcel);
                obj.hashCode();
                throw null;
            }
            UnsubscribePRSPPayload unsubscribePRSPPayloadCreateFromParcel = createFromParcel(parcel);
            int i3 = ShareDataUIState + 71;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                return unsubscribePRSPPayloadCreateFromParcel;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final UnsubscribePRSPPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 19;
            int i4 = i3 % 128;
            component1 = i4;
            int i5 = i3 % 2;
            UnsubscribePRSPPayload[] unsubscribePRSPPayloadArr = new UnsubscribePRSPPayload[i];
            int i6 = i4 + 103;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return unsubscribePRSPPayloadArr;
        }

        @Override
        public UnsubscribePRSPPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 95;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            UnsubscribePRSPPayload[] unsubscribePRSPPayloadArrNewArray = newArray(i);
            int i5 = component1 + 53;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                return unsubscribePRSPPayloadArrNewArray;
            }
            throw null;
        }
    }

    public UnsubscribePRSPPayload(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.cpId = str;
        this.msisdn = str2;
        this.offerCode = str3;
    }

    public final String getCpId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 95;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.cpId;
        int i5 = i3 + 35;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 85;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.msisdn;
        }
        throw null;
    }

    public final String getOfferCode() {
        int i = 2 % 2;
        int i2 = copydefault + 75;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.offerCode;
        if (i3 == 0) {
            int i4 = 51 / 0;
        }
        return str;
    }

    static {
        int i = component3 + 59;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static UnsubscribePRSPPayload copy$default(UnsubscribePRSPPayload unsubscribePRSPPayload, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault;
        int i4 = i3 + 35;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 45;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            str = unsubscribePRSPPayload.cpId;
        }
        if ((i & 2) != 0) {
            int i8 = ShareDataUIState + 49;
            copydefault = i8 % 128;
            if (i8 % 2 != 0) {
                String str4 = unsubscribePRSPPayload.msisdn;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str2 = unsubscribePRSPPayload.msisdn;
        }
        if ((i & 4) != 0) {
            str3 = unsubscribePRSPPayload.offerCode;
        }
        return unsubscribePRSPPayload.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 89;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.cpId;
        int i4 = i3 + 77;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 15;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.msisdn;
        int i5 = i2 + 77;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 65;
        ShareDataUIState = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.offerCode;
        int i4 = i2 + 69;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final UnsubscribePRSPPayload copy(String cpId, String msisdn, String offerCode) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(cpId, "");
        Intrinsics.checkNotNullParameter(msisdn, "");
        Intrinsics.checkNotNullParameter(offerCode, "");
        UnsubscribePRSPPayload unsubscribePRSPPayload = new UnsubscribePRSPPayload(cpId, msisdn, offerCode);
        int i2 = ShareDataUIState + 103;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return unsubscribePRSPPayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 67;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof com.huawei.digitalpayment.consumer.subsui.resp.premiumSubscriptions.UnsubscribePRSPPayload) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r1 = r1 + 97;
        com.huawei.digitalpayment.consumer.subsui.resp.premiumSubscriptions.UnsubscribePRSPPayload.copydefault = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if ((r1 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        r6 = (com.huawei.digitalpayment.consumer.subsui.resp.premiumSubscriptions.UnsubscribePRSPPayload) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.cpId, r6.cpId)) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.subsui.resp.premiumSubscriptions.UnsubscribePRSPPayload.ShareDataUIState + 125;
        com.huawei.digitalpayment.consumer.subsui.resp.premiumSubscriptions.UnsubscribePRSPPayload.copydefault = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.msisdn, r6.msisdn) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.offerCode, r6.offerCode) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.subsui.resp.premiumSubscriptions.UnsubscribePRSPPayload.ShareDataUIState + 15;
        com.huawei.digitalpayment.consumer.subsui.resp.premiumSubscriptions.UnsubscribePRSPPayload.copydefault = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if ((r6 % 2) == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return true;
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
            int r1 = com.huawei.digitalpayment.consumer.subsui.resp.premiumSubscriptions.UnsubscribePRSPPayload.ShareDataUIState
            int r2 = r1 + 69
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.subsui.resp.premiumSubscriptions.UnsubscribePRSPPayload.copydefault = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L16
            r2 = 88
            int r2 = r2 / r4
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r3
        L19:
            boolean r2 = r6 instanceof com.huawei.digitalpayment.consumer.subsui.resp.premiumSubscriptions.UnsubscribePRSPPayload
            if (r2 != 0) goto L29
            int r1 = r1 + 97
            int r6 = r1 % 128
            com.huawei.digitalpayment.consumer.subsui.resp.premiumSubscriptions.UnsubscribePRSPPayload.copydefault = r6
            int r1 = r1 % r0
            if (r1 != 0) goto L27
            return r4
        L27:
            r6 = 0
            throw r6
        L29:
            com.huawei.digitalpayment.consumer.subsui.resp.premiumSubscriptions.UnsubscribePRSPPayload r6 = (com.huawei.digitalpayment.consumer.subsui.resp.premiumSubscriptions.UnsubscribePRSPPayload) r6
            java.lang.String r1 = r5.cpId
            java.lang.String r2 = r6.cpId
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            r1 = r1 ^ r3
            if (r1 == 0) goto L40
            int r6 = com.huawei.digitalpayment.consumer.subsui.resp.premiumSubscriptions.UnsubscribePRSPPayload.ShareDataUIState
            int r6 = r6 + 125
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.subsui.resp.premiumSubscriptions.UnsubscribePRSPPayload.copydefault = r1
            int r6 = r6 % r0
            return r4
        L40:
            java.lang.String r1 = r5.msisdn
            java.lang.String r2 = r6.msisdn
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L4b
            return r4
        L4b:
            java.lang.String r1 = r5.offerCode
            java.lang.String r6 = r6.offerCode
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
            if (r6 != 0) goto L62
            int r6 = com.huawei.digitalpayment.consumer.subsui.resp.premiumSubscriptions.UnsubscribePRSPPayload.ShareDataUIState
            int r6 = r6 + 15
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.subsui.resp.premiumSubscriptions.UnsubscribePRSPPayload.copydefault = r1
            int r6 = r6 % r0
            if (r6 == 0) goto L61
            return r3
        L61:
            return r4
        L62:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.subsui.resp.premiumSubscriptions.UnsubscribePRSPPayload.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 93;
        copydefault = i2 % 128;
        return i2 % 2 != 0 ? (((r0 >>> 1) % this.msisdn.hashCode()) - 69) - this.offerCode.hashCode() : (((this.cpId.hashCode() * 31) + this.msisdn.hashCode()) * 31) + this.offerCode.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UnsubscribePRSPPayload(cpId=" + this.cpId + ", msisdn=" + this.msisdn + ", offerCode=" + this.offerCode + ")";
        int i2 = ShareDataUIState + 35;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 107;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.cpId);
        dest.writeString(this.msisdn);
        dest.writeString(this.offerCode);
        int i4 = copydefault + 59;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 9 / 0;
        }
    }
}
