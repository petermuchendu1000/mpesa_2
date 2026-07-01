package com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003JO\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\nHÇ\u0001J\b\u0010\"\u001a\u00020\bH\u0007J\u0013\u0010#\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010%H×\u0003J\t\u0010&\u001a\u00020\bH×\u0001J\t\u0010'\u001a\u00020\u0003H×\u0001J\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\bH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017¨\u0006-"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/model/DaimaProductsBundlePurchaseRequest;", "Landroid/os/Parcelable;", "sponsorMsisdn", "", "beneficiaryMsisdn", "daimaOptionID", "", "paymentOptionID", "", "hasOkoa", "", "okoaAmount", "autoRenew", "<init>", "(Ljava/lang/String;Ljava/lang/String;JIZIZ)V", "getSponsorMsisdn", "()Ljava/lang/String;", "getBeneficiaryMsisdn", "getDaimaOptionID", "()J", "getPaymentOptionID", "()I", "getHasOkoa", "()Z", "getOkoaAmount", "getAutoRenew", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DaimaProductsBundlePurchaseRequest implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<DaimaProductsBundlePurchaseRequest> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    @SerializedName("autoRenew")
    private final boolean autoRenew;

    @SerializedName("beneficiaryMsisdn")
    private final String beneficiaryMsisdn;

    @SerializedName("daimaOptionID")
    private final long daimaOptionID;

    @SerializedName("hasOkoa")
    private final boolean hasOkoa;

    @SerializedName("okoaAmount")
    private final int okoaAmount;

    @SerializedName("paymentOptionID")
    private final int paymentOptionID;

    @SerializedName("sponsorMsisdn")
    private final String sponsorMsisdn;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DaimaProductsBundlePurchaseRequest> {
        private static int ShareDataUIState = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DaimaProductsBundlePurchaseRequest createFromParcel(Parcel parcel) {
            boolean z;
            int i = 2 % 2;
            int i2 = component3 + 79;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i3 == 0) {
                parcel.readString();
                parcel.readString();
                parcel.readLong();
                parcel.readInt();
                parcel.readInt();
                throw null;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            long j = parcel.readLong();
            int i4 = parcel.readInt();
            boolean z2 = parcel.readInt() != 0;
            int i5 = parcel.readInt();
            if (parcel.readInt() != 0) {
                int i6 = component3 + 89;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                z = true;
            } else {
                z = false;
            }
            return new DaimaProductsBundlePurchaseRequest(string, string2, j, i4, z2, i5, z);
        }

        @Override
        public DaimaProductsBundlePurchaseRequest createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 29;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            DaimaProductsBundlePurchaseRequest daimaProductsBundlePurchaseRequestCreateFromParcel = createFromParcel(parcel);
            int i4 = component3 + 55;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 75 / 0;
            }
            return daimaProductsBundlePurchaseRequestCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DaimaProductsBundlePurchaseRequest[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3;
            int i4 = i3 + 75;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            DaimaProductsBundlePurchaseRequest[] daimaProductsBundlePurchaseRequestArr = new DaimaProductsBundlePurchaseRequest[i];
            int i6 = i3 + 45;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 70 / 0;
            }
            return daimaProductsBundlePurchaseRequestArr;
        }

        @Override
        public DaimaProductsBundlePurchaseRequest[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 75;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                return newArray(i);
            }
            newArray(i);
            throw null;
        }
    }

    public DaimaProductsBundlePurchaseRequest(String str, String str2, long j, int i, boolean z, int i2, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.sponsorMsisdn = str;
        this.beneficiaryMsisdn = str2;
        this.daimaOptionID = j;
        this.paymentOptionID = i;
        this.hasOkoa = z;
        this.okoaAmount = i2;
        this.autoRenew = z2;
    }

    public final String getSponsorMsisdn() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 17;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.sponsorMsisdn;
        int i5 = i2 + 45;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 51 / 0;
        }
        return str;
    }

    public final String getBeneficiaryMsisdn() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 17;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.beneficiaryMsisdn;
        int i5 = i2 + 123;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long getDaimaOptionID() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 85;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        long j = this.daimaOptionID;
        int i5 = i3 + 125;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final int getPaymentOptionID() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 27;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.paymentOptionID;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean getHasOkoa() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 115;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.hasOkoa;
        int i5 = i2 + 25;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final int getOkoaAmount() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = this.okoaAmount;
        int i5 = i3 + 1;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final boolean getAutoRenew() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.autoRenew;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component1 + 33;
        copydefault = i % 128;
        if (i % 2 == 0) {
            int i2 = 42 / 0;
        }
    }

    public static DaimaProductsBundlePurchaseRequest copy$default(DaimaProductsBundlePurchaseRequest daimaProductsBundlePurchaseRequest, String str, String str2, long j, int i, boolean z, int i2, boolean z2, int i3, Object obj) {
        String str3;
        long j2;
        int i4;
        int i5 = 2 % 2;
        int i6 = component3;
        int i7 = i6 + 77;
        ShareDataUIState = i7 % 128;
        int i8 = i7 % 2;
        String str4 = (i3 & 1) != 0 ? daimaProductsBundlePurchaseRequest.sponsorMsisdn : str;
        if ((i3 & 2) != 0) {
            int i9 = i6 + 75;
            ShareDataUIState = i9 % 128;
            int i10 = i9 % 2;
            str3 = daimaProductsBundlePurchaseRequest.beneficiaryMsisdn;
        } else {
            str3 = str2;
        }
        if ((i3 & 4) != 0) {
            int i11 = i6 + 35;
            ShareDataUIState = i11 % 128;
            int i12 = i11 % 2;
            j2 = daimaProductsBundlePurchaseRequest.daimaOptionID;
        } else {
            j2 = j;
        }
        if ((i3 & 8) != 0) {
            int i13 = ShareDataUIState + 95;
            component3 = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = daimaProductsBundlePurchaseRequest.paymentOptionID;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            i4 = daimaProductsBundlePurchaseRequest.paymentOptionID;
        } else {
            i4 = i;
        }
        return daimaProductsBundlePurchaseRequest.copy(str4, str3, j2, i4, (i3 & 16) != 0 ? daimaProductsBundlePurchaseRequest.hasOkoa : z, (i3 & 32) != 0 ? daimaProductsBundlePurchaseRequest.okoaAmount : i2, (i3 & 64) != 0 ? daimaProductsBundlePurchaseRequest.autoRenew : z2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 13;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.sponsorMsisdn;
        int i4 = i3 + 23;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 91;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.beneficiaryMsisdn;
        int i5 = i2 + 65;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final long component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 103;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        long j = this.daimaOptionID;
        int i5 = i3 + 13;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 71;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = this.paymentOptionID;
        int i6 = i3 + 71;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public final boolean component5() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 63;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.hasOkoa;
        int i5 = i2 + 57;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final int component6() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.okoaAmount;
        if (i3 == 0) {
            int i5 = 89 / 0;
        }
        return i4;
    }

    public final boolean component7() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 5;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.autoRenew;
        int i5 = i2 + 87;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final DaimaProductsBundlePurchaseRequest copy(String sponsorMsisdn, String beneficiaryMsisdn, long daimaOptionID, int paymentOptionID, boolean hasOkoa, int okoaAmount, boolean autoRenew) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sponsorMsisdn, "");
        Intrinsics.checkNotNullParameter(beneficiaryMsisdn, "");
        DaimaProductsBundlePurchaseRequest daimaProductsBundlePurchaseRequest = new DaimaProductsBundlePurchaseRequest(sponsorMsisdn, beneficiaryMsisdn, daimaOptionID, paymentOptionID, hasOkoa, okoaAmount, autoRenew);
        int i2 = component3 + 67;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return daimaProductsBundlePurchaseRequest;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 3;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 121;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 57;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof DaimaProductsBundlePurchaseRequest)) {
            return false;
        }
        DaimaProductsBundlePurchaseRequest daimaProductsBundlePurchaseRequest = (DaimaProductsBundlePurchaseRequest) other;
        if (!Intrinsics.areEqual(this.sponsorMsisdn, daimaProductsBundlePurchaseRequest.sponsorMsisdn)) {
            int i4 = ShareDataUIState + 111;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.beneficiaryMsisdn, daimaProductsBundlePurchaseRequest.beneficiaryMsisdn)) {
            int i6 = ShareDataUIState + 45;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.daimaOptionID != daimaProductsBundlePurchaseRequest.daimaOptionID || this.paymentOptionID != daimaProductsBundlePurchaseRequest.paymentOptionID) {
            return false;
        }
        if (this.hasOkoa != daimaProductsBundlePurchaseRequest.hasOkoa) {
            int i8 = component3 + 57;
            ShareDataUIState = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.okoaAmount != daimaProductsBundlePurchaseRequest.okoaAmount) {
            return false;
        }
        if (this.autoRenew == daimaProductsBundlePurchaseRequest.autoRenew) {
            return true;
        }
        int i10 = component3 + 43;
        ShareDataUIState = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 113;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((this.sponsorMsisdn.hashCode() * 31) + this.beneficiaryMsisdn.hashCode()) * 31) + Long.hashCode(this.daimaOptionID)) * 31) + Integer.hashCode(this.paymentOptionID)) * 31) + Boolean.hashCode(this.hasOkoa)) * 31) + Integer.hashCode(this.okoaAmount)) * 31) + Boolean.hashCode(this.autoRenew);
        int i4 = component3 + 35;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DaimaProductsBundlePurchaseRequest(sponsorMsisdn=" + this.sponsorMsisdn + ", beneficiaryMsisdn=" + this.beneficiaryMsisdn + ", daimaOptionID=" + this.daimaOptionID + ", paymentOptionID=" + this.paymentOptionID + ", hasOkoa=" + this.hasOkoa + ", okoaAmount=" + this.okoaAmount + ", autoRenew=" + this.autoRenew + ")";
        int i2 = ShareDataUIState + 97;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.sponsorMsisdn);
        dest.writeString(this.beneficiaryMsisdn);
        dest.writeLong(this.daimaOptionID);
        dest.writeInt(this.paymentOptionID);
        dest.writeInt(this.hasOkoa ? 1 : 0);
        dest.writeInt(this.okoaAmount);
        dest.writeInt(this.autoRenew ? 1 : 0);
        int i4 = component3 + 1;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }
}
