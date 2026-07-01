package com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u000bH×\u0001J\t\u0010\u0011\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/FamilyConnectCheckStatusPayload;", "Landroid/os/Parcelable;", "sponsorMsisdn", "", "<init>", "(Ljava/lang/String;)V", "getSponsorMsisdn", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FamilyConnectCheckStatusPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<FamilyConnectCheckStatusPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;

    @SerializedName("sponsorMsisdn")
    private final String sponsorMsisdn;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FamilyConnectCheckStatusPayload> {
        private static int ShareDataUIState = 1;
        private static int component2;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FamilyConnectCheckStatusPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            FamilyConnectCheckStatusPayload familyConnectCheckStatusPayload = new FamilyConnectCheckStatusPayload(parcel.readString());
            int i2 = ShareDataUIState + 55;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return familyConnectCheckStatusPayload;
        }

        @Override
        public FamilyConnectCheckStatusPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 35;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FamilyConnectCheckStatusPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 47;
            int i4 = i3 % 128;
            component2 = i4;
            FamilyConnectCheckStatusPayload[] familyConnectCheckStatusPayloadArr = new FamilyConnectCheckStatusPayload[i];
            if (i3 % 2 != 0) {
                throw null;
            }
            int i5 = i4 + 107;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return familyConnectCheckStatusPayloadArr;
        }

        @Override
        public FamilyConnectCheckStatusPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 17;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                return newArray(i);
            }
            newArray(i);
            throw null;
        }
    }

    public FamilyConnectCheckStatusPayload(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sponsorMsisdn = str;
    }

    public final String getSponsorMsisdn() {
        int i = 2 % 2;
        int i2 = component3 + 37;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.sponsorMsisdn;
        if (i3 != 0) {
            int i4 = 44 / 0;
        }
        return str;
    }

    static {
        int i = component2 + 59;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static FamilyConnectCheckStatusPayload copy$default(FamilyConnectCheckStatusPayload familyConnectCheckStatusPayload, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 5;
        component3 = i4 % 128;
        if (i4 % 2 != 0 && (i & 1) != 0) {
            int i5 = i3 + 87;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                String str2 = familyConnectCheckStatusPayload.sponsorMsisdn;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str = familyConnectCheckStatusPayload.sponsorMsisdn;
        }
        return familyConnectCheckStatusPayload.copy(str);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 53;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.sponsorMsisdn;
        int i4 = i2 + 99;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final FamilyConnectCheckStatusPayload copy(String sponsorMsisdn) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sponsorMsisdn, "");
        FamilyConnectCheckStatusPayload familyConnectCheckStatusPayload = new FamilyConnectCheckStatusPayload(sponsorMsisdn);
        int i2 = ShareDataUIState + 79;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return familyConnectCheckStatusPayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 121;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 43;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r5 instanceof com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectCheckStatusPayload) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r4.sponsorMsisdn, ((com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectCheckStatusPayload) r5).sponsorMsisdn)) == true) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        r5 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectCheckStatusPayload.ShareDataUIState + 107;
        com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectCheckStatusPayload.component3 = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r4 == r5) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r4 == r5) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectCheckStatusPayload.ShareDataUIState
            int r1 = r1 + 97
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectCheckStatusPayload.component3 = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L16
            r1 = 57
            int r1 = r1 / r2
            if (r4 != r5) goto L19
            goto L18
        L16:
            if (r4 != r5) goto L19
        L18:
            return r3
        L19:
            boolean r1 = r5 instanceof com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectCheckStatusPayload
            if (r1 != 0) goto L1e
            return r2
        L1e:
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectCheckStatusPayload r5 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectCheckStatusPayload) r5
            java.lang.String r1 = r4.sponsorMsisdn
            java.lang.String r5 = r5.sponsorMsisdn
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
            r5 = r5 ^ r3
            if (r5 == r3) goto L2c
            return r3
        L2c:
            int r5 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectCheckStatusPayload.ShareDataUIState
            int r5 = r5 + 107
            int r1 = r5 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectCheckStatusPayload.component3 = r1
            int r5 = r5 % r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectCheckStatusPayload.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 103;
        ShareDataUIState = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.sponsorMsisdn.hashCode();
            throw null;
        }
        int iHashCode = this.sponsorMsisdn.hashCode();
        int i3 = ShareDataUIState + 119;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FamilyConnectCheckStatusPayload(sponsorMsisdn=" + this.sponsorMsisdn + ")";
        int i2 = ShareDataUIState + 111;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 48 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 101;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.sponsorMsisdn);
        int i4 = ShareDataUIState + 99;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }
}
