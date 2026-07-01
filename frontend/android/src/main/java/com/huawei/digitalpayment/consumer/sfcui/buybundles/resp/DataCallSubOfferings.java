package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JI\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0019\u001a\u00020\u001aH\u0007J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH×\u0003J\t\u0010\u001f\u001a\u00020\u001aH×\u0001J\t\u0010 \u001a\u00020\u0003H×\u0001J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aH\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006&"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DataCallSubOfferings;", "Landroid/os/Parcelable;", "productRange", "", "rentalFee", "productType", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DataCallProduct;", "productRangeMin", "productRangeMax", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getProductRange", "()Ljava/lang/String;", "getRentalFee", "getProductType", "()Ljava/util/List;", "getProductRangeMin", "getProductRangeMax", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataCallSubOfferings implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<DataCallSubOfferings> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("productRange")
    private final String productRange;

    @SerializedName("productRangeMax")
    private final String productRangeMax;

    @SerializedName("productRangeMin")
    private final String productRangeMin;

    @SerializedName("productType")
    private final List<DataCallProduct> productType;

    @SerializedName("rentalFee")
    private final String rentalFee;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DataCallSubOfferings> {
        private static int component3 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DataCallSubOfferings createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i2 = component3 + 53;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                arrayList = null;
            } else {
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                int i5 = copydefault + 87;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 0;
                while (i7 != i4) {
                    int i8 = copydefault + 93;
                    component3 = i8 % 128;
                    if (i8 % 2 == 0) {
                        arrayList2.add(DataCallProduct.CREATOR.createFromParcel(parcel));
                        i7 += 27;
                    } else {
                        arrayList2.add(DataCallProduct.CREATOR.createFromParcel(parcel));
                        i7++;
                    }
                }
                arrayList = arrayList2;
            }
            return new DataCallSubOfferings(string, string2, arrayList, parcel.readString(), parcel.readString());
        }

        @Override
        public DataCallSubOfferings createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 47;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            DataCallSubOfferings dataCallSubOfferingsCreateFromParcel = createFromParcel(parcel);
            if (i3 == 0) {
                int i4 = 46 / 0;
            }
            int i5 = copydefault + 43;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return dataCallSubOfferingsCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DataCallSubOfferings[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 121;
            int i4 = i3 % 128;
            copydefault = i4;
            DataCallSubOfferings[] dataCallSubOfferingsArr = new DataCallSubOfferings[i];
            if (i3 % 2 != 0) {
                int i5 = 2 / 0;
            }
            int i6 = i4 + 91;
            component3 = i6 % 128;
            if (i6 % 2 != 0) {
                return dataCallSubOfferingsArr;
            }
            throw null;
        }

        @Override
        public DataCallSubOfferings[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 107;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            DataCallSubOfferings[] dataCallSubOfferingsArrNewArray = newArray(i);
            int i5 = component3 + 115;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return dataCallSubOfferingsArrNewArray;
        }
    }

    public DataCallSubOfferings(String str, String str2, List<DataCallProduct> list, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str4, "");
        this.productRange = str;
        this.rentalFee = str2;
        this.productType = list;
        this.productRangeMin = str3;
        this.productRangeMax = str4;
    }

    public final String getProductRange() {
        int i = 2 % 2;
        int i2 = component1 + 75;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.productRange;
        if (i3 == 0) {
            int i4 = 4 / 0;
        }
        return str;
    }

    public final String getRentalFee() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 27;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.rentalFee;
        int i4 = i2 + 71;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
        return str;
    }

    public final List<DataCallProduct> getProductType() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 79;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<DataCallProduct> list = this.productType;
        int i4 = i2 + 41;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final String getProductRangeMin() {
        int i = 2 % 2;
        int i2 = component2 + 45;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.productRangeMin;
        int i5 = i3 + 23;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getProductRangeMax() {
        int i = 2 % 2;
        int i2 = component2 + 69;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.productRangeMax;
        }
        throw null;
    }

    static {
        int i = component3 + 57;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DataCallSubOfferings copy$default(DataCallSubOfferings dataCallSubOfferings, String str, String str2, List list, String str3, String str4, int i, Object obj) {
        String str5;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component1 + 105;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                str = dataCallSubOfferings.productRange;
                int i4 = 87 / 0;
            } else {
                str = dataCallSubOfferings.productRange;
            }
        }
        String str6 = str;
        if ((i & 2) != 0) {
            int i5 = component1 + 119;
            int i6 = i5 % 128;
            component2 = i6;
            int i7 = i5 % 2;
            String str7 = dataCallSubOfferings.rentalFee;
            int i8 = i6 + 1;
            component1 = i8 % 128;
            int i9 = i8 % 2;
            str5 = str7;
        } else {
            str5 = str2;
        }
        if ((i & 4) != 0) {
            list = dataCallSubOfferings.productType;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            str3 = dataCallSubOfferings.productRangeMin;
            int i10 = component2 + 113;
            component1 = i10 % 128;
            int i11 = i10 % 2;
        }
        String str8 = str3;
        if ((i & 16) != 0) {
            str4 = dataCallSubOfferings.productRangeMax;
        }
        return dataCallSubOfferings.copy(str6, str5, list2, str8, str4);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 91;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.productRange;
        int i5 = i2 + 7;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        String str;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 5;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.rentalFee;
            int i4 = 64 / 0;
        } else {
            str = this.rentalFee;
        }
        int i5 = i2 + 31;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<DataCallProduct> component3() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 55;
        component2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        List<DataCallProduct> list = this.productType;
        int i4 = i2 + 97;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 7;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.productRangeMin;
        int i5 = i2 + 89;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component2 + 17;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.productRangeMax;
        int i5 = i3 + 57;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final DataCallSubOfferings copy(String productRange, String rentalFee, List<DataCallProduct> productType, String productRangeMin, String productRangeMax) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(productRangeMax, "");
        DataCallSubOfferings dataCallSubOfferings = new DataCallSubOfferings(productRange, rentalFee, productType, productRangeMin, productRangeMax);
        int i2 = component1 + 39;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return dataCallSubOfferings;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 21;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 61;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataCallSubOfferings)) {
            return false;
        }
        DataCallSubOfferings dataCallSubOfferings = (DataCallSubOfferings) other;
        if (!Intrinsics.areEqual(this.productRange, dataCallSubOfferings.productRange)) {
            int i2 = component2 + 61;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.rentalFee, dataCallSubOfferings.rentalFee)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.productType, dataCallSubOfferings.productType)) {
            int i4 = component2 + 83;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.productRangeMin, dataCallSubOfferings.productRangeMin)) {
            return Intrinsics.areEqual(this.productRangeMax, dataCallSubOfferings.productRangeMax);
        }
        int i6 = component1 + 93;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        String str;
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = component1 + 27;
        component2 = i2 % 128;
        int iHashCode3 = 0;
        int iHashCode4 = (i2 % 2 != 0 ? (str = this.productRange) != null : (str = this.productRange) != null) ? str.hashCode() : 0;
        String str2 = this.rentalFee;
        if (str2 == null) {
            int i3 = component2 + 87;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
            int i5 = component1 + 59;
            component2 = i5 % 128;
            int i6 = i5 % 2;
        }
        List<DataCallProduct> list = this.productType;
        if (list == null) {
            int i7 = component1 + 109;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = list.hashCode();
        }
        String str3 = this.productRangeMin;
        if (str3 != null) {
            iHashCode3 = str3.hashCode();
            int i9 = component1 + 31;
            component2 = i9 % 128;
            int i10 = i9 % 2;
        }
        return (((((((iHashCode4 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + this.productRangeMax.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DataCallSubOfferings(productRange=" + this.productRange + ", rentalFee=" + this.rentalFee + ", productType=" + this.productType + ", productRangeMin=" + this.productRangeMin + ", productRangeMax=" + this.productRangeMax + ")";
        int i2 = component2 + 57;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 81 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.productRange);
        dest.writeString(this.rentalFee);
        List<DataCallProduct> list = this.productType;
        if (list == null) {
            int i2 = component2 + 95;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<DataCallProduct> it = list.iterator();
            while (it.hasNext()) {
                int i4 = component2 + 89;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    it.next().writeToParcel(dest, flags);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.productRangeMin);
        dest.writeString(this.productRangeMax);
    }
}
