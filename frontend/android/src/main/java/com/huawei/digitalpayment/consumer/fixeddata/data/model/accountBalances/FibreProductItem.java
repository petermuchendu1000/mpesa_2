package com.huawei.digitalpayment.consumer.fixeddata.data.model.accountBalances;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\u0019\u001a\u00020\u001aH\u0007J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH×\u0003J\t\u0010\u001f\u001a\u00020\u001aH×\u0001J\t\u0010 \u001a\u00020\u0003H×\u0001J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aH\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006&"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountBalances/FibreProductItem;", "Landroid/os/Parcelable;", "offeringId", "", "purchaseSeq", "openDay", "endDay", "rentAmount", "proratedBal", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOfferingId", "()Ljava/lang/String;", "getPurchaseSeq", "getOpenDay", "getEndDay", "getRentAmount", "getProratedBal", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FibreProductItem implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<FibreProductItem> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("endDay")
    private final String endDay;

    @SerializedName("offeringId")
    private final String offeringId;

    @SerializedName("openDay")
    private final String openDay;

    @SerializedName("proratedBal")
    private final String proratedBal;

    @SerializedName("purchaseSeq")
    private final String purchaseSeq;

    @SerializedName("rentAmount")
    private final String rentAmount;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FibreProductItem> {
        private static int component1 = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FibreProductItem createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            FibreProductItem fibreProductItem = new FibreProductItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component3 + 79;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return fibreProductItem;
            }
            throw null;
        }

        @Override
        public FibreProductItem createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 63;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FibreProductItem[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 75;
            int i4 = i3 % 128;
            component1 = i4;
            FibreProductItem[] fibreProductItemArr = new FibreProductItem[i];
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i4 + 87;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return fibreProductItemArr;
        }

        @Override
        public FibreProductItem[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 105;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            FibreProductItem[] fibreProductItemArrNewArray = newArray(i);
            int i5 = component3 + 99;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return fibreProductItemArrNewArray;
        }
    }

    public FibreProductItem(String str, String str2, String str3, String str4, String str5, String str6) {
        this.offeringId = str;
        this.purchaseSeq = str2;
        this.openDay = str3;
        this.endDay = str4;
        this.rentAmount = str5;
        this.proratedBal = str6;
    }

    public final String getOfferingId() {
        int i = 2 % 2;
        int i2 = component3 + 17;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.offeringId;
        }
        throw null;
    }

    public final String getPurchaseSeq() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 39;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.purchaseSeq;
        int i5 = i2 + 35;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getOpenDay() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 19;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.openDay;
        int i5 = i2 + 117;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getEndDay() {
        int i = 2 % 2;
        int i2 = component3 + 55;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.endDay;
        int i5 = i3 + 21;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getRentAmount() {
        int i = 2 % 2;
        int i2 = component3 + 51;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.rentAmount;
        if (i3 == 0) {
            int i4 = 63 / 0;
        }
        return str;
    }

    public final String getProratedBal() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 69;
        component2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.proratedBal;
        int i4 = i2 + 31;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    static {
        int i = ShareDataUIState + 77;
        copydefault = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static FibreProductItem copy$default(FibreProductItem fibreProductItem, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = fibreProductItem.offeringId;
        }
        String str7 = str;
        if ((i & 2) != 0) {
            str2 = fibreProductItem.purchaseSeq;
            int i3 = component2 + 63;
            component3 = i3 % 128;
            int i4 = i3 % 2;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = fibreProductItem.openDay;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = fibreProductItem.endDay;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = fibreProductItem.rentAmount;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = fibreProductItem.proratedBal;
            int i5 = component2 + 93;
            component3 = i5 % 128;
            int i6 = i5 % 2;
        }
        return fibreProductItem.copy(str7, str8, str9, str10, str11, str6);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 5;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.offeringId;
        int i5 = i2 + 49;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 65;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.purchaseSeq;
        int i5 = i3 + 67;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 101;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.openDay;
        int i5 = i2 + 17;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 16 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 7;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.endDay;
        int i5 = i2 + 59;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component3 + 69;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.rentAmount;
        int i5 = i3 + 117;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component3 + 21;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.proratedBal;
        }
        throw null;
    }

    public final FibreProductItem copy(String offeringId, String purchaseSeq, String openDay, String endDay, String rentAmount, String proratedBal) {
        int i = 2 % 2;
        FibreProductItem fibreProductItem = new FibreProductItem(offeringId, purchaseSeq, openDay, endDay, rentAmount, proratedBal);
        int i2 = component2 + 23;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return fibreProductItem;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 13;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 73;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3 + 61;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof FibreProductItem)) {
            return false;
        }
        FibreProductItem fibreProductItem = (FibreProductItem) other;
        if (!Intrinsics.areEqual(this.offeringId, fibreProductItem.offeringId)) {
            int i3 = component2 + 103;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.purchaseSeq, fibreProductItem.purchaseSeq) || !Intrinsics.areEqual(this.openDay, fibreProductItem.openDay) || !Intrinsics.areEqual(this.endDay, fibreProductItem.endDay)) {
            return false;
        }
        if (Intrinsics.areEqual(this.rentAmount, fibreProductItem.rentAmount)) {
            return Intrinsics.areEqual(this.proratedBal, fibreProductItem.proratedBal);
        }
        int i5 = component3 + 107;
        component2 = i5 % 128;
        return i5 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        String str = this.offeringId;
        if (str == null) {
            int i2 = component3 + 7;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.purchaseSeq;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.openDay;
        if (str3 == null) {
            int i4 = component3 + 13;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str3.hashCode();
        }
        String str4 = this.endDay;
        if (str4 == null) {
            int i6 = component2 + 87;
            component3 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 5 % 5;
            }
            iHashCode3 = 0;
        } else {
            iHashCode3 = str4.hashCode();
        }
        String str5 = this.rentAmount;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.proratedBal;
        return (((((((((iHashCode * 31) + iHashCode4) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode5) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FibreProductItem(offeringId=" + this.offeringId + ", purchaseSeq=" + this.purchaseSeq + ", openDay=" + this.openDay + ", endDay=" + this.endDay + ", rentAmount=" + this.rentAmount + ", proratedBal=" + this.proratedBal + ")";
        int i2 = component3 + 65;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 71;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.offeringId);
        dest.writeString(this.purchaseSeq);
        dest.writeString(this.openDay);
        dest.writeString(this.endDay);
        dest.writeString(this.rentAmount);
        dest.writeString(this.proratedBal);
        int i4 = component2 + 11;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
