package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÇ\u0001¢\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0007J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H×\u0003J\t\u0010\u0019\u001a\u00020\u0015H×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DataCallProduct;", "Landroid/os/Parcelable;", "productId", "", "productTypes", "autoRenew", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getProductId", "()Ljava/lang/String;", "getProductTypes", "getAutoRenew", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DataCallProduct;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataCallProduct implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<DataCallProduct> CREATOR = new Creator();
    private static int component1 = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;

    @SerializedName("autoRenew")
    private final Boolean autoRenew;

    @SerializedName("productId")
    private final String productId;

    @SerializedName("productTypes")
    private final String productTypes;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DataCallProduct> {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DataCallProduct createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i2 = component2 + 25;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                int i4 = ShareDataUIState + 75;
                component2 = i4 % 128;
                int i5 = i4 % 2;
            }
            return new DataCallProduct(string, string2, boolValueOf);
        }

        @Override
        public DataCallProduct createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 25;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            DataCallProduct dataCallProductCreateFromParcel = createFromParcel(parcel);
            if (i3 != 0) {
                int i4 = 50 / 0;
            }
            return dataCallProductCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DataCallProduct[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 31;
            int i4 = i3 % 128;
            component2 = i4;
            int i5 = i3 % 2;
            DataCallProduct[] dataCallProductArr = new DataCallProduct[i];
            int i6 = i4 + 27;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 == 0) {
                return dataCallProductArr;
            }
            throw null;
        }

        @Override
        public DataCallProduct[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 107;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            DataCallProduct[] dataCallProductArrNewArray = newArray(i);
            if (i4 != 0) {
                int i5 = 47 / 0;
            }
            int i6 = ShareDataUIState + 81;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return dataCallProductArrNewArray;
        }
    }

    public DataCallProduct(String str, String str2, Boolean bool) {
        this.productId = str;
        this.productTypes = str2;
        this.autoRenew = bool;
    }

    public final String getProductId() {
        String str;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 39;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.productId;
            int i4 = 50 / 0;
        } else {
            str = this.productId;
        }
        int i5 = i2 + 105;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getProductTypes() {
        int i = 2 % 2;
        int i2 = component2 + 49;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.productTypes;
        int i5 = i3 + 35;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final Boolean getAutoRenew() {
        int i = 2 % 2;
        int i2 = component2 + 115;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Boolean bool = this.autoRenew;
        int i4 = i3 + 93;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    static {
        int i = component1 + 7;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static DataCallProduct copy$default(DataCallProduct dataCallProduct, String str, String str2, Boolean bool, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = copydefault + 67;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                String str3 = dataCallProduct.productId;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str = dataCallProduct.productId;
        }
        if ((i & 2) != 0) {
            str2 = dataCallProduct.productTypes;
            int i4 = copydefault + 123;
            component2 = i4 % 128;
            int i5 = i4 % 2;
        }
        if ((i & 4) != 0) {
            bool = dataCallProduct.autoRenew;
        }
        return dataCallProduct.copy(str, str2, bool);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 109;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.productId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 101;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.productTypes;
        int i5 = i2 + 53;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final Boolean component3() {
        int i = 2 % 2;
        int i2 = component2 + 11;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Boolean bool = this.autoRenew;
        int i4 = i3 + 117;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    public final DataCallProduct copy(String productId, String productTypes, Boolean autoRenew) {
        int i = 2 % 2;
        DataCallProduct dataCallProduct = new DataCallProduct(productId, productTypes, autoRenew);
        int i2 = copydefault + 53;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return dataCallProduct;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 83;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 47;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault + 113;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 63;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof DataCallProduct)) {
            return false;
        }
        DataCallProduct dataCallProduct = (DataCallProduct) other;
        return Intrinsics.areEqual(this.productId, dataCallProduct.productId) && Intrinsics.areEqual(this.productTypes, dataCallProduct.productTypes) && Intrinsics.areEqual(this.autoRenew, dataCallProduct.autoRenew);
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.productId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.productTypes;
        if (str2 == null) {
            int i2 = copydefault + 85;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
            int i4 = component2 + 77;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        }
        Boolean bool = this.autoRenew;
        int iHashCode3 = (((iHashCode2 * 31) + iHashCode) * 31) + (bool != null ? bool.hashCode() : 0);
        int i6 = component2 + 85;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        return iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DataCallProduct(productId=" + this.productId + ", productTypes=" + this.productTypes + ", autoRenew=" + this.autoRenew + ")";
        int i2 = component2 + 9;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.os.Parcel, java.lang.Object] */
    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        ?? BooleanValue;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.productId);
        dest.writeString(this.productTypes);
        Boolean bool = this.autoRenew;
        if (bool == null) {
            int i2 = component2 + 3;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            BooleanValue = 0;
        } else {
            dest.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        dest.writeInt(BooleanValue);
        int i4 = copydefault + 77;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
    }
}
