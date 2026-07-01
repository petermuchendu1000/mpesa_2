package com.huawei.digitalpayment.consumer.fixeddata.data.model.accountBalances;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001dB!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountBalances/FibreAccountBalancesPayload;", "Landroid/os/Parcelable;", "accountId", "", "productList", "", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountBalances/FibreAccountBalancesPayload$Product;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getAccountId", "()Ljava/lang/String;", "getProductList", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Product", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FibreAccountBalancesPayload implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<FibreAccountBalancesPayload> CREATOR = new Creator();
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName("accountId")
    private final String accountId;

    @SerializedName("productList")
    private final List<Product> productList;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FibreAccountBalancesPayload> {
        private static int component1 = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FibreAccountBalancesPayload createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                int i3 = component1 + 53;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 0;
                while (i5 != i2) {
                    int i6 = component3 + 77;
                    component1 = i6 % 128;
                    if (i6 % 2 == 0) {
                        arrayList2.add(Product.CREATOR.createFromParcel(parcel));
                        i5 += 21;
                    } else {
                        arrayList2.add(Product.CREATOR.createFromParcel(parcel));
                        i5++;
                    }
                }
                arrayList = arrayList2;
            }
            return new FibreAccountBalancesPayload(string, arrayList);
        }

        @Override
        public FibreAccountBalancesPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 83;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            FibreAccountBalancesPayload fibreAccountBalancesPayloadCreateFromParcel = createFromParcel(parcel);
            int i4 = component3 + 123;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return fibreAccountBalancesPayloadCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FibreAccountBalancesPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 53;
            int i4 = i3 % 128;
            component1 = i4;
            FibreAccountBalancesPayload[] fibreAccountBalancesPayloadArr = new FibreAccountBalancesPayload[i];
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i4 + 113;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return fibreAccountBalancesPayloadArr;
        }

        @Override
        public FibreAccountBalancesPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 81;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            FibreAccountBalancesPayload[] fibreAccountBalancesPayloadArrNewArray = newArray(i);
            if (i4 != 0) {
                int i5 = 35 / 0;
            }
            return fibreAccountBalancesPayloadArrNewArray;
        }
    }

    public FibreAccountBalancesPayload(String str, List<Product> list) {
        this.accountId = str;
        this.productList = list;
    }

    public final String getAccountId() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 71;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.accountId;
        int i4 = i2 + 85;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 31 / 0;
        }
        return str;
    }

    public final List<Product> getProductList() {
        int i = 2 % 2;
        int i2 = copydefault + 71;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.productList;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component2 + 107;
        component3 = i % 128;
        if (i % 2 == 0) {
            int i2 = 92 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static FibreAccountBalancesPayload copy$default(FibreAccountBalancesPayload fibreAccountBalancesPayload, String str, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault;
        int i4 = i3 + 73;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            str = fibreAccountBalancesPayload.accountId;
            int i6 = i3 + 103;
            component1 = i6 % 128;
            int i7 = i6 % 2;
        }
        if ((i & 2) != 0) {
            list = fibreAccountBalancesPayload.productList;
        }
        return fibreAccountBalancesPayload.copy(str, list);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 83;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.accountId;
        int i5 = i3 + 11;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 76 / 0;
        }
        return str;
    }

    public final List<Product> component2() {
        List<Product> list;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 91;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            list = this.productList;
            int i4 = 40 / 0;
        } else {
            list = this.productList;
        }
        int i5 = i2 + 25;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u000bH×\u0001J\t\u0010\u0011\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bH\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountBalances/FibreAccountBalancesPayload$Product;", "Landroid/os/Parcelable;", "offeringId", "", "<init>", "(Ljava/lang/String;)V", "getOfferingId", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Product implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Product> CREATOR = new Creator();
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component3 = 1;
        private static int copydefault;

        @SerializedName("offeringId")
        private final String offeringId;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Product> {
            private static int component1 = 1;
            private static int component2;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Product createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                Product product = new Product(parcel.readString());
                int i2 = component1 + 23;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                return product;
            }

            @Override
            public Product createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component1 + 41;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Product productCreateFromParcel = createFromParcel(parcel);
                int i4 = component2 + 107;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return productCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Product[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component2 + 63;
                int i4 = i3 % 128;
                component1 = i4;
                int i5 = i3 % 2;
                Product[] productArr = new Product[i];
                int i6 = i4 + 55;
                component2 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 59 / 0;
                }
                return productArr;
            }

            @Override
            public Product[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component1 + 17;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                Product[] productArrNewArray = newArray(i);
                int i5 = component1 + 9;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                return productArrNewArray;
            }
        }

        public Product(String str) {
            this.offeringId = str;
        }

        public final String getOfferingId() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 85;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.offeringId;
            int i5 = i2 + 39;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        static {
            int i = copydefault + 83;
            ShareDataUIState = i % 128;
            int i2 = i % 2;
        }

        public static Product copy$default(Product product, String str, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                int i3 = component3 + 67;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                str = product.offeringId;
            }
            Product productCopy = product.copy(str);
            int i5 = component1 + 113;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                return productCopy;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = component1 + 67;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            String str = this.offeringId;
            int i5 = i3 + 97;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final Product copy(String offeringId) {
            int i = 2 % 2;
            Product product = new Product(offeringId);
            int i2 = component1 + 117;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 63 / 0;
            }
            return product;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component1 + 17;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 125;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof Product)) {
                int i2 = component3 + 89;
                component1 = i2 % 128;
                return i2 % 2 != 0;
            }
            if (Intrinsics.areEqual(this.offeringId, ((Product) other).offeringId)) {
                int i3 = component3 + 51;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    return true;
                }
                throw null;
            }
            int i4 = component3 + 3;
            int i5 = i4 % 128;
            component1 = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 41;
            component3 = i7 % 128;
            if (i7 % 2 != 0) {
                return false;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component1 + 19;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            String str = this.offeringId;
            if (str == null) {
                return 0;
            }
            int iHashCode = str.hashCode();
            int i4 = component3 + 43;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Product(offeringId=" + this.offeringId + ")";
            int i2 = component1 + 51;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component3 + 119;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeString(this.offeringId);
            int i4 = component3 + 55;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public final FibreAccountBalancesPayload copy(String accountId, List<Product> productList) {
        int i = 2 % 2;
        FibreAccountBalancesPayload fibreAccountBalancesPayload = new FibreAccountBalancesPayload(accountId, productList);
        int i2 = copydefault + 19;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return fibreAccountBalancesPayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 89;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 45;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component1;
            int i3 = i2 + 99;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 43;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof FibreAccountBalancesPayload)) {
            int i7 = copydefault + 103;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.accountId, ((FibreAccountBalancesPayload) other).accountId)) {
            int i9 = copydefault + 81;
            component1 = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.productList, r6.productList)) {
            return false;
        }
        int i11 = copydefault + 103;
        component1 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 49 / 0;
        }
        return true;
    }

    public int hashCode() {
        String str;
        int iHashCode;
        int i = 2 % 2;
        int i2 = copydefault + 75;
        component1 = i2 % 128;
        int iHashCode2 = 0;
        if (i2 % 2 == 0) {
            str = this.accountId;
            iHashCode = 1;
            if (str != null) {
                iHashCode2 = 1;
                iHashCode = iHashCode2;
                iHashCode2 = str.hashCode();
            }
        } else {
            str = this.accountId;
            if (str == null) {
                iHashCode = 0;
            } else {
                iHashCode = iHashCode2;
                iHashCode2 = str.hashCode();
            }
        }
        List<Product> list = this.productList;
        if (list == null) {
            int i3 = component1 + 47;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
        } else {
            iHashCode = list.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FibreAccountBalancesPayload(accountId=" + this.accountId + ", productList=" + this.productList + ")";
        int i2 = component1 + 101;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 9 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.accountId);
        List<Product> list = this.productList;
        if (list == null) {
            int i2 = component1 + 103;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                dest.writeInt(1);
                return;
            } else {
                dest.writeInt(0);
                return;
            }
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<Product> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
            int i3 = copydefault + 107;
            component1 = i3 % 128;
            int i4 = i3 % 2;
        }
    }
}
