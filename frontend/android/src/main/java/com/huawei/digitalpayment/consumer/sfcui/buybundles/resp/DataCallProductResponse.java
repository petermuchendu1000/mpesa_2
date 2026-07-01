package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JW\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\u001c\u001a\u00020\u001dH\u0007J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H×\u0003J\t\u0010\"\u001a\u00020\u001dH×\u0001J\t\u0010#\u001a\u00020\u0003H×\u0001J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dH\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006)"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DataCallProductResponse;", "Landroid/os/Parcelable;", "productCategory", "", "rentalFee", "subOfferings", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DataCallSubOfferings;", "productDescription", "productUnits", "productId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getProductCategory", "()Ljava/lang/String;", "getRentalFee", "getSubOfferings", "()Ljava/util/List;", "getProductDescription", "getProductUnits", "getProductId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataCallProductResponse implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<DataCallProductResponse> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("productCategory")
    private final String productCategory;

    @SerializedName("productDescription")
    private final String productDescription;

    @SerializedName("productId")
    private final String productId;

    @SerializedName("productUnits")
    private final String productUnits;

    @SerializedName("rentalFee")
    private final String rentalFee;

    @SerializedName("subOfferings")
    private final List<DataCallSubOfferings> subOfferings;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DataCallProductResponse> {
        private static int component1 = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DataCallProductResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i = 2 % 2;
            int i2 = component1 + 43;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                int i5 = component1 + 103;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 0;
                while (i7 != i4) {
                    int i8 = component3 + 117;
                    component1 = i8 % 128;
                    if (i8 % 2 != 0) {
                        arrayList2.add(DataCallSubOfferings.CREATOR.createFromParcel(parcel));
                        i7 += 70;
                    } else {
                        arrayList2.add(DataCallSubOfferings.CREATOR.createFromParcel(parcel));
                        i7++;
                    }
                    int i9 = component1 + 91;
                    component3 = i9 % 128;
                    int i10 = i9 % 2;
                }
                arrayList = arrayList2;
            }
            return new DataCallProductResponse(string, string2, arrayList, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override
        public DataCallProductResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 59;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            DataCallProductResponse dataCallProductResponseCreateFromParcel = createFromParcel(parcel);
            int i4 = component3 + 101;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return dataCallProductResponseCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DataCallProductResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1;
            int i4 = i3 + 103;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            DataCallProductResponse[] dataCallProductResponseArr = new DataCallProductResponse[i];
            int i6 = i3 + 123;
            component3 = i6 % 128;
            if (i6 % 2 != 0) {
                return dataCallProductResponseArr;
            }
            throw null;
        }

        @Override
        public DataCallProductResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 115;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            DataCallProductResponse[] dataCallProductResponseArrNewArray = newArray(i);
            int i5 = component1 + 65;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return dataCallProductResponseArrNewArray;
        }
    }

    public DataCallProductResponse(String str, String str2, List<DataCallSubOfferings> list, String str3, String str4, String str5) {
        this.productCategory = str;
        this.rentalFee = str2;
        this.subOfferings = list;
        this.productDescription = str3;
        this.productUnits = str4;
        this.productId = str5;
    }

    public final String getProductCategory() {
        int i = 2 % 2;
        int i2 = component2 + 93;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.productCategory;
        int i5 = i3 + 3;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getRentalFee() {
        int i = 2 % 2;
        int i2 = component2 + 67;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.rentalFee;
        int i5 = i3 + 29;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final List<DataCallSubOfferings> getSubOfferings() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 43;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        List<DataCallSubOfferings> list = this.subOfferings;
        int i5 = i2 + 63;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 14 / 0;
        }
        return list;
    }

    public final String getProductDescription() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 61;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.productDescription;
        int i5 = i2 + 83;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getProductUnits() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 123;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.productUnits;
        int i5 = i2 + 41;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getProductId() {
        int i = 2 % 2;
        int i2 = component2 + 9;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.productId;
        int i5 = i3 + 21;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 12 / 0;
        }
        return str;
    }

    static {
        int i = component3 + 93;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DataCallProductResponse copy$default(DataCallProductResponse dataCallProductResponse, String str, String str2, List list, String str3, String str4, String str5, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = copydefault + 125;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            str = dataCallProductResponse.productCategory;
        }
        String str6 = str;
        if ((i & 2) != 0) {
            str2 = dataCallProductResponse.rentalFee;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            list = dataCallProductResponse.subOfferings;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            str3 = dataCallProductResponse.productDescription;
        }
        String str8 = str3;
        if ((i & 16) != 0) {
            int i5 = component2 + 89;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                String str9 = dataCallProductResponse.productUnits;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str4 = dataCallProductResponse.productUnits;
        }
        String str10 = str4;
        if ((i & 32) != 0) {
            str5 = dataCallProductResponse.productId;
        }
        return dataCallProductResponse.copy(str6, str7, list2, str8, str10, str5);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = component2 + 9;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            str = this.productCategory;
            int i4 = 37 / 0;
        } else {
            str = this.productCategory;
        }
        int i5 = i3 + 37;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 99;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.rentalFee;
        int i5 = i3 + 71;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<DataCallSubOfferings> component3() {
        int i = 2 % 2;
        int i2 = component2 + 111;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        List<DataCallSubOfferings> list = this.subOfferings;
        if (i3 == 0) {
            int i4 = 26 / 0;
        }
        return list;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = copydefault + 17;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.productDescription;
        int i4 = i3 + 25;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component2 + 65;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.productUnits;
        int i5 = i3 + 15;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component2 + 123;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.productId;
        int i4 = i3 + 121;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final DataCallProductResponse copy(String productCategory, String rentalFee, List<DataCallSubOfferings> subOfferings, String productDescription, String productUnits, String productId) {
        int i = 2 % 2;
        DataCallProductResponse dataCallProductResponse = new DataCallProductResponse(productCategory, rentalFee, subOfferings, productDescription, productUnits, productId);
        int i2 = copydefault + 55;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return dataCallProductResponse;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 31;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 65;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 61 / 0;
        }
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataCallProductResponse)) {
            return false;
        }
        DataCallProductResponse dataCallProductResponse = (DataCallProductResponse) other;
        if (!Intrinsics.areEqual(this.productCategory, dataCallProductResponse.productCategory)) {
            int i2 = copydefault + 119;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.rentalFee, dataCallProductResponse.rentalFee)) {
            int i4 = copydefault + 111;
            component2 = i4 % 128;
            return i4 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.subOfferings, dataCallProductResponse.subOfferings)) {
            int i5 = component2 + 123;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.productDescription, dataCallProductResponse.productDescription)) {
            return false;
        }
        if (Intrinsics.areEqual(this.productUnits, dataCallProductResponse.productUnits)) {
            return Intrinsics.areEqual(this.productId, dataCallProductResponse.productId);
        }
        int i7 = copydefault + 21;
        component2 = i7 % 128;
        return i7 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 101;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.productCategory;
        if (str == null) {
            int i5 = i2 + 63;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.rentalFee;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        List<DataCallSubOfferings> list = this.subOfferings;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        String str3 = this.productDescription;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.productUnits;
        if (str4 == null) {
            int i7 = copydefault + 81;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str4.hashCode();
        }
        String str5 = this.productId;
        return (((((((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode2) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DataCallProductResponse(productCategory=" + this.productCategory + ", rentalFee=" + this.rentalFee + ", subOfferings=" + this.subOfferings + ", productDescription=" + this.productDescription + ", productUnits=" + this.productUnits + ", productId=" + this.productId + ")";
        int i2 = copydefault + 43;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.productCategory);
        dest.writeString(this.rentalFee);
        List<DataCallSubOfferings> list = this.subOfferings;
        if (list == null) {
            int i2 = component2 + 27;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<DataCallSubOfferings> it = list.iterator();
            while (!(!it.hasNext())) {
                int i4 = copydefault + 63;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    it.next().writeToParcel(dest, flags);
                    throw null;
                }
                it.next().writeToParcel(dest, flags);
                int i5 = copydefault + 59;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        dest.writeString(this.productDescription);
        dest.writeString(this.productUnits);
        dest.writeString(this.productId);
    }
}
