package com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.BuyAirtimeTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\rHÆ\u0003JO\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rHÇ\u0001J\b\u0010$\u001a\u00020\bH\u0007J\u0013\u0010%\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010'H×\u0003J\t\u0010(\u001a\u00020\bH×\u0001J\t\u0010)\u001a\u00020\u0003H×\u0001J\u0018\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\bH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006/"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/model/DaimaProductsBundleMpesaPurchaseRequest;", "Landroid/os/Parcelable;", "sponsorMsisdn", "", "beneficiaryMsisdn", "daimaOptionID", "", "paymentOptionID", "", "hasOkoa", "", "okoaAmount", BuyAirtimeTypes.MPESA, "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/model/DaimaProductsMpesaCredentials;", "<init>", "(Ljava/lang/String;Ljava/lang/String;JIZILcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/model/DaimaProductsMpesaCredentials;)V", "getSponsorMsisdn", "()Ljava/lang/String;", "getBeneficiaryMsisdn", "getDaimaOptionID", "()J", "getPaymentOptionID", "()I", "getHasOkoa", "()Z", "getOkoaAmount", "getMpesa", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/model/DaimaProductsMpesaCredentials;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DaimaProductsBundleMpesaPurchaseRequest implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<DaimaProductsBundleMpesaPurchaseRequest> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("beneficiaryMsisdn")
    private final String beneficiaryMsisdn;

    @SerializedName("daimaOptionID")
    private final long daimaOptionID;

    @SerializedName("hasOkoa")
    private final boolean hasOkoa;

    @SerializedName(BuyAirtimeTypes.MPESA)
    private final DaimaProductsMpesaCredentials mpesa;

    @SerializedName("okoaAmount")
    private final int okoaAmount;

    @SerializedName("paymentOptionID")
    private final int paymentOptionID;

    @SerializedName("sponsorMsisdn")
    private final String sponsorMsisdn;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DaimaProductsBundleMpesaPurchaseRequest> {
        private static int component1 = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DaimaProductsBundleMpesaPurchaseRequest createFromParcel(Parcel parcel) {
            boolean z;
            int i = 2 % 2;
            int i2 = component3 + 69;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i3 != 0) {
                parcel.readString();
                parcel.readString();
                parcel.readLong();
                parcel.readInt();
                parcel.readInt();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            long j = parcel.readLong();
            int i4 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                int i5 = component1 + 75;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                z = false;
            }
            DaimaProductsBundleMpesaPurchaseRequest daimaProductsBundleMpesaPurchaseRequest = new DaimaProductsBundleMpesaPurchaseRequest(string, string2, j, i4, z, parcel.readInt(), DaimaProductsMpesaCredentials.CREATOR.createFromParcel(parcel));
            int i7 = component1 + 49;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            return daimaProductsBundleMpesaPurchaseRequest;
        }

        @Override
        public DaimaProductsBundleMpesaPurchaseRequest createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 31;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            DaimaProductsBundleMpesaPurchaseRequest daimaProductsBundleMpesaPurchaseRequestCreateFromParcel = createFromParcel(parcel);
            if (i3 != 0) {
                int i4 = 10 / 0;
            }
            int i5 = component3 + 115;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return daimaProductsBundleMpesaPurchaseRequestCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DaimaProductsBundleMpesaPurchaseRequest[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3;
            int i4 = i3 + 95;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            DaimaProductsBundleMpesaPurchaseRequest[] daimaProductsBundleMpesaPurchaseRequestArr = new DaimaProductsBundleMpesaPurchaseRequest[i];
            int i6 = i3 + 81;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return daimaProductsBundleMpesaPurchaseRequestArr;
        }

        @Override
        public DaimaProductsBundleMpesaPurchaseRequest[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 73;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            DaimaProductsBundleMpesaPurchaseRequest[] daimaProductsBundleMpesaPurchaseRequestArrNewArray = newArray(i);
            int i5 = component1 + 113;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return daimaProductsBundleMpesaPurchaseRequestArrNewArray;
        }
    }

    public DaimaProductsBundleMpesaPurchaseRequest(String str, String str2, long j, int i, boolean z, int i2, DaimaProductsMpesaCredentials daimaProductsMpesaCredentials) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(daimaProductsMpesaCredentials, "");
        this.sponsorMsisdn = str;
        this.beneficiaryMsisdn = str2;
        this.daimaOptionID = j;
        this.paymentOptionID = i;
        this.hasOkoa = z;
        this.okoaAmount = i2;
        this.mpesa = daimaProductsMpesaCredentials;
    }

    public final String getSponsorMsisdn() {
        int i = 2 % 2;
        int i2 = copydefault + 93;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.sponsorMsisdn;
        if (i3 != 0) {
            int i4 = 39 / 0;
        }
        return str;
    }

    public final String getBeneficiaryMsisdn() {
        String str;
        int i = 2 % 2;
        int i2 = component3 + 121;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            str = this.beneficiaryMsisdn;
            int i4 = 80 / 0;
        } else {
            str = this.beneficiaryMsisdn;
        }
        int i5 = i3 + 19;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final long getDaimaOptionID() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 89;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        long j = this.daimaOptionID;
        int i4 = i2 + 21;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 94 / 0;
        }
        return j;
    }

    public final int getPaymentOptionID() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 109;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.paymentOptionID;
        int i6 = i2 + 101;
        copydefault = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 22 / 0;
        }
        return i5;
    }

    public final boolean getHasOkoa() {
        int i = 2 % 2;
        int i2 = component3 + 59;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.hasOkoa;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getOkoaAmount() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 17;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.okoaAmount;
        int i6 = i2 + 85;
        copydefault = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final DaimaProductsMpesaCredentials getMpesa() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 119;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        DaimaProductsMpesaCredentials daimaProductsMpesaCredentials = this.mpesa;
        int i5 = i2 + 11;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return daimaProductsMpesaCredentials;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component2 + 13;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            int i2 = 5 / 0;
        }
    }

    public static DaimaProductsBundleMpesaPurchaseRequest copy$default(DaimaProductsBundleMpesaPurchaseRequest daimaProductsBundleMpesaPurchaseRequest, String str, String str2, long j, int i, boolean z, int i2, DaimaProductsMpesaCredentials daimaProductsMpesaCredentials, int i3, Object obj) {
        String str3;
        int i4;
        int i5 = 2 % 2;
        Object obj2 = null;
        if ((i3 & 1) != 0) {
            int i6 = copydefault + 107;
            component3 = i6 % 128;
            if (i6 % 2 != 0) {
                String str4 = daimaProductsBundleMpesaPurchaseRequest.sponsorMsisdn;
                obj2.hashCode();
                throw null;
            }
            str3 = daimaProductsBundleMpesaPurchaseRequest.sponsorMsisdn;
        } else {
            str3 = str;
        }
        String str5 = (i3 & 2) != 0 ? daimaProductsBundleMpesaPurchaseRequest.beneficiaryMsisdn : str2;
        long j2 = (i3 & 4) != 0 ? daimaProductsBundleMpesaPurchaseRequest.daimaOptionID : j;
        if ((i3 & 8) != 0) {
            int i7 = component3 + 5;
            copydefault = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = daimaProductsBundleMpesaPurchaseRequest.paymentOptionID;
                obj2.hashCode();
                throw null;
            }
            i4 = daimaProductsBundleMpesaPurchaseRequest.paymentOptionID;
        } else {
            i4 = i;
        }
        return daimaProductsBundleMpesaPurchaseRequest.copy(str3, str5, j2, i4, (i3 & 16) != 0 ? daimaProductsBundleMpesaPurchaseRequest.hasOkoa : z, (i3 & 32) != 0 ? daimaProductsBundleMpesaPurchaseRequest.okoaAmount : i2, (i3 & 64) != 0 ? daimaProductsBundleMpesaPurchaseRequest.mpesa : daimaProductsMpesaCredentials);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 79;
        int i3 = i2 % 128;
        component3 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.sponsorMsisdn;
        int i4 = i3 + 121;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault + 29;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.beneficiaryMsisdn;
        int i5 = i3 + 33;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long component3() {
        int i = 2 % 2;
        int i2 = copydefault + 21;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        long j = this.daimaOptionID;
        int i5 = i3 + 63;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int component4() {
        int i = 2 % 2;
        int i2 = component3 + 99;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.paymentOptionID;
        if (i3 == 0) {
            int i5 = 7 / 0;
        }
        return i4;
    }

    public final boolean component5() {
        int i = 2 % 2;
        int i2 = component3 + 51;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.hasOkoa;
        int i4 = i3 + 57;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 78 / 0;
        }
        return z;
    }

    public final int component6() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 49;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = this.okoaAmount;
        int i5 = i2 + 11;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    public final DaimaProductsMpesaCredentials component7() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 83;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        DaimaProductsMpesaCredentials daimaProductsMpesaCredentials = this.mpesa;
        int i5 = i2 + 79;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return daimaProductsMpesaCredentials;
    }

    public final DaimaProductsBundleMpesaPurchaseRequest copy(String sponsorMsisdn, String beneficiaryMsisdn, long daimaOptionID, int paymentOptionID, boolean hasOkoa, int okoaAmount, DaimaProductsMpesaCredentials mpesa) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sponsorMsisdn, "");
        Intrinsics.checkNotNullParameter(beneficiaryMsisdn, "");
        Intrinsics.checkNotNullParameter(mpesa, "");
        DaimaProductsBundleMpesaPurchaseRequest daimaProductsBundleMpesaPurchaseRequest = new DaimaProductsBundleMpesaPurchaseRequest(sponsorMsisdn, beneficiaryMsisdn, daimaOptionID, paymentOptionID, hasOkoa, okoaAmount, mpesa);
        int i2 = component3 + 49;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 15 / 0;
        }
        return daimaProductsBundleMpesaPurchaseRequest;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 113;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 111;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 31 / 0;
        }
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 33;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof DaimaProductsBundleMpesaPurchaseRequest)) {
            int i7 = i3 + 67;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        DaimaProductsBundleMpesaPurchaseRequest daimaProductsBundleMpesaPurchaseRequest = (DaimaProductsBundleMpesaPurchaseRequest) other;
        if (Intrinsics.areEqual(this.sponsorMsisdn, daimaProductsBundleMpesaPurchaseRequest.sponsorMsisdn)) {
            return Intrinsics.areEqual(this.beneficiaryMsisdn, daimaProductsBundleMpesaPurchaseRequest.beneficiaryMsisdn) && this.daimaOptionID == daimaProductsBundleMpesaPurchaseRequest.daimaOptionID && this.paymentOptionID == daimaProductsBundleMpesaPurchaseRequest.paymentOptionID && this.hasOkoa == daimaProductsBundleMpesaPurchaseRequest.hasOkoa && this.okoaAmount == daimaProductsBundleMpesaPurchaseRequest.okoaAmount && Intrinsics.areEqual(this.mpesa, daimaProductsBundleMpesaPurchaseRequest.mpesa);
        }
        int i9 = copydefault;
        int i10 = i9 + 111;
        component3 = i10 % 128;
        int i11 = i10 % 2;
        int i12 = i9 + 77;
        component3 = i12 % 128;
        if (i12 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 5;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((this.sponsorMsisdn.hashCode() * 31) + this.beneficiaryMsisdn.hashCode()) * 31) + Long.hashCode(this.daimaOptionID)) * 31) + Integer.hashCode(this.paymentOptionID)) * 31) + Boolean.hashCode(this.hasOkoa)) * 31) + Integer.hashCode(this.okoaAmount)) * 31) + this.mpesa.hashCode();
        int i4 = copydefault + 125;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DaimaProductsBundleMpesaPurchaseRequest(sponsorMsisdn=" + this.sponsorMsisdn + ", beneficiaryMsisdn=" + this.beneficiaryMsisdn + ", daimaOptionID=" + this.daimaOptionID + ", paymentOptionID=" + this.paymentOptionID + ", hasOkoa=" + this.hasOkoa + ", okoaAmount=" + this.okoaAmount + ", mpesa=" + this.mpesa + ")";
        int i2 = component3 + 47;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 97;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.sponsorMsisdn);
        dest.writeString(this.beneficiaryMsisdn);
        dest.writeLong(this.daimaOptionID);
        dest.writeInt(this.paymentOptionID);
        dest.writeInt(this.hasOkoa ? 1 : 0);
        dest.writeInt(this.okoaAmount);
        this.mpesa.writeToParcel(dest, flags);
        int i4 = copydefault + 33;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
