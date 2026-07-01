package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H×\u0003J\t\u0010\u0019\u001a\u00020\u0014H×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/OtherBundlesAirtimePayload;", "Landroid/os/Parcelable;", "productId", "", "sponsorMsisdn", "buyFor", "beneficiaryMsisdn", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getProductId", "()Ljava/lang/String;", "getSponsorMsisdn", "getBuyFor", "getBeneficiaryMsisdn", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OtherBundlesAirtimePayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<OtherBundlesAirtimePayload> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("beneficiaryMsisdn")
    private final String beneficiaryMsisdn;

    @SerializedName("buyFor")
    private final String buyFor;

    @SerializedName("productId")
    private final String productId;

    @SerializedName("sponsorMsisdn")
    private final String sponsorMsisdn;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OtherBundlesAirtimePayload> {
        private static int ShareDataUIState = 1;
        private static int component1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final OtherBundlesAirtimePayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            OtherBundlesAirtimePayload otherBundlesAirtimePayload = new OtherBundlesAirtimePayload(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component1 + 37;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 24 / 0;
            }
            return otherBundlesAirtimePayload;
        }

        @Override
        public OtherBundlesAirtimePayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 63;
            ShareDataUIState = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                createFromParcel(parcel);
                obj.hashCode();
                throw null;
            }
            OtherBundlesAirtimePayload otherBundlesAirtimePayloadCreateFromParcel = createFromParcel(parcel);
            int i3 = component1 + 25;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                return otherBundlesAirtimePayloadCreateFromParcel;
            }
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final OtherBundlesAirtimePayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 35;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            int i5 = i3 % 2;
            OtherBundlesAirtimePayload[] otherBundlesAirtimePayloadArr = new OtherBundlesAirtimePayload[i];
            int i6 = i4 + 57;
            component1 = i6 % 128;
            if (i6 % 2 == 0) {
                return otherBundlesAirtimePayloadArr;
            }
            throw null;
        }

        @Override
        public OtherBundlesAirtimePayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 117;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            OtherBundlesAirtimePayload[] otherBundlesAirtimePayloadArrNewArray = newArray(i);
            int i5 = component1 + 81;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                return otherBundlesAirtimePayloadArrNewArray;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public OtherBundlesAirtimePayload(String str, String str2, String str3, String str4) {
        this.productId = str;
        this.sponsorMsisdn = str2;
        this.buyFor = str3;
        this.beneficiaryMsisdn = str4;
    }

    public final String getProductId() {
        int i = 2 % 2;
        int i2 = copydefault + 71;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.productId;
        int i5 = i3 + 45;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 8 / 0;
        }
        return str;
    }

    public final String getSponsorMsisdn() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 95;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.sponsorMsisdn;
        int i5 = i2 + 95;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getBuyFor() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 5;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.buyFor;
        int i5 = i2 + 47;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getBeneficiaryMsisdn() {
        int i = 2 % 2;
        int i2 = copydefault + 63;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.beneficiaryMsisdn;
        int i5 = i3 + 9;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = component2 + 81;
        component3 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static OtherBundlesAirtimePayload copy$default(OtherBundlesAirtimePayload otherBundlesAirtimePayload, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 37;
        int i4 = i3 % 128;
        copydefault = i4;
        if (i3 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            str = otherBundlesAirtimePayload.productId;
        }
        if ((i & 2) != 0) {
            str2 = otherBundlesAirtimePayload.sponsorMsisdn;
        }
        if ((i & 4) != 0) {
            str3 = otherBundlesAirtimePayload.buyFor;
            int i5 = i4 + 13;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((i & 8) != 0) {
            int i7 = i4 + 83;
            ShareDataUIState = i7 % 128;
            if (i7 % 2 != 0) {
                String str5 = otherBundlesAirtimePayload.beneficiaryMsisdn;
                throw null;
            }
            str4 = otherBundlesAirtimePayload.beneficiaryMsisdn;
        }
        OtherBundlesAirtimePayload otherBundlesAirtimePayloadCopy = otherBundlesAirtimePayload.copy(str, str2, str3, str4);
        int i8 = copydefault + 53;
        ShareDataUIState = i8 % 128;
        int i9 = i8 % 2;
        return otherBundlesAirtimePayloadCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 77;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.productId;
        int i5 = i3 + 13;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 3;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.sponsorMsisdn;
        int i5 = i2 + 37;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault + 109;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.buyFor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = copydefault + 5;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.beneficiaryMsisdn;
        int i5 = i3 + 57;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final OtherBundlesAirtimePayload copy(String productId, String sponsorMsisdn, String buyFor, String beneficiaryMsisdn) {
        int i = 2 % 2;
        OtherBundlesAirtimePayload otherBundlesAirtimePayload = new OtherBundlesAirtimePayload(productId, sponsorMsisdn, buyFor, beneficiaryMsisdn);
        int i2 = copydefault + 79;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return otherBundlesAirtimePayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 103;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 113;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 9 / 0;
        }
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof OtherBundlesAirtimePayload)) {
            int i2 = copydefault;
            int i3 = i2 + 67;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 37;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        OtherBundlesAirtimePayload otherBundlesAirtimePayload = (OtherBundlesAirtimePayload) other;
        if (!Intrinsics.areEqual(this.productId, otherBundlesAirtimePayload.productId)) {
            int i7 = copydefault + 115;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.sponsorMsisdn, otherBundlesAirtimePayload.sponsorMsisdn) || (!Intrinsics.areEqual(this.buyFor, otherBundlesAirtimePayload.buyFor))) {
            return false;
        }
        if (Intrinsics.areEqual(this.beneficiaryMsisdn, otherBundlesAirtimePayload.beneficiaryMsisdn)) {
            return true;
        }
        int i9 = ShareDataUIState + 105;
        copydefault = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[PHI: r1 r3
  0x001c: PHI (r1v13 java.lang.String) = (r1v4 java.lang.String), (r1v15 java.lang.String) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]
  0x001c: PHI (r3v5 int) = (r3v0 int), (r3v6 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a A[PHI: r3
  0x001a: PHI (r3v1 int) = (r3v0 int), (r3v6 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OtherBundlesAirtimePayload.ShareDataUIState
            int r1 = r1 + 35
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OtherBundlesAirtimePayload.copydefault = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L15
            java.lang.String r1 = r7.productId
            r3 = 1
            if (r1 != 0) goto L1c
            goto L1a
        L15:
            java.lang.String r1 = r7.productId
            r3 = r2
            if (r1 != 0) goto L1c
        L1a:
            r1 = r2
            goto L20
        L1c:
            int r1 = r1.hashCode()
        L20:
            java.lang.String r4 = r7.sponsorMsisdn
            if (r4 != 0) goto L2f
            int r4 = com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OtherBundlesAirtimePayload.copydefault
            int r4 = r4 + 59
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OtherBundlesAirtimePayload.ShareDataUIState = r5
            int r4 = r4 % r0
            r4 = r2
            goto L33
        L2f:
            int r4 = r4.hashCode()
        L33:
            java.lang.String r5 = r7.buyFor
            if (r5 != 0) goto L38
            goto L3c
        L38:
            int r2 = r5.hashCode()
        L3c:
            java.lang.String r5 = r7.beneficiaryMsisdn
            if (r5 != 0) goto L4e
            int r5 = com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OtherBundlesAirtimePayload.ShareDataUIState
            int r5 = r5 + 95
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OtherBundlesAirtimePayload.copydefault = r6
            int r5 = r5 % r0
            if (r5 != 0) goto L52
            int r0 = r0 % 4
            goto L52
        L4e:
            int r3 = r5.hashCode()
        L52:
            int r1 = r1 * 31
            int r1 = r1 + r4
            int r1 = r1 * 31
            int r1 = r1 + r2
            int r1 = r1 * 31
            int r1 = r1 + r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OtherBundlesAirtimePayload.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OtherBundlesAirtimePayload(productId=" + this.productId + ", sponsorMsisdn=" + this.sponsorMsisdn + ", buyFor=" + this.buyFor + ", beneficiaryMsisdn=" + this.beneficiaryMsisdn + ")";
        int i2 = ShareDataUIState + 61;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 38 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 3;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.productId);
        dest.writeString(this.sponsorMsisdn);
        dest.writeString(this.buyFor);
        dest.writeString(this.beneficiaryMsisdn);
        int i4 = ShareDataUIState + 19;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }
}
