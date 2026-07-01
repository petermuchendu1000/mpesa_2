package com.huawei.digitalpayment.consumer.fixeddata.data.model.accountBalances;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÇ\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H×\u0003J\t\u0010\u0019\u001a\u00020\u0014H×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountBalances/FibreAccountBalances;", "Landroid/os/Parcelable;", "totalProducts", "", "totalProratedBal", "productList", "", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountBalances/FibreProductItem;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTotalProducts", "()Ljava/lang/String;", "getTotalProratedBal", "getProductList", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FibreAccountBalances implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<FibreAccountBalances> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("productList")
    private final List<FibreProductItem> productList;

    @SerializedName("totalProducts")
    private final String totalProducts;

    @SerializedName("totalProratedBal")
    private final String totalProratedBal;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FibreAccountBalances> {
        private static int component1 = 1;
        private static int component2;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FibreAccountBalances createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i = 2 % 2;
            int i2 = component1 + 115;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                int i5 = 0;
                while (i5 != i4) {
                    int i6 = component2 + 59;
                    component1 = i6 % 128;
                    if (i6 % 2 == 0) {
                        arrayList2.add(FibreProductItem.CREATOR.createFromParcel(parcel));
                        i5 += 11;
                    } else {
                        arrayList2.add(FibreProductItem.CREATOR.createFromParcel(parcel));
                        i5++;
                    }
                }
                arrayList = arrayList2;
            }
            return new FibreAccountBalances(string, string2, arrayList);
        }

        @Override
        public FibreAccountBalances createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 27;
            component2 = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                createFromParcel(parcel);
                obj.hashCode();
                throw null;
            }
            FibreAccountBalances fibreAccountBalancesCreateFromParcel = createFromParcel(parcel);
            int i3 = component1 + 63;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                return fibreAccountBalancesCreateFromParcel;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FibreAccountBalances[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1;
            int i4 = i3 + 87;
            component2 = i4 % 128;
            FibreAccountBalances[] fibreAccountBalancesArr = new FibreAccountBalances[i];
            if (i4 % 2 != 0) {
                int i5 = 4 / 0;
            }
            int i6 = i3 + 101;
            component2 = i6 % 128;
            if (i6 % 2 == 0) {
                return fibreAccountBalancesArr;
            }
            throw null;
        }

        @Override
        public FibreAccountBalances[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 111;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                return newArray(i);
            }
            newArray(i);
            throw null;
        }
    }

    public FibreAccountBalances(String str, String str2, List<FibreProductItem> list) {
        this.totalProducts = str;
        this.totalProratedBal = str2;
        this.productList = list;
    }

    public final String getTotalProducts() {
        int i = 2 % 2;
        int i2 = component1 + 67;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.totalProducts;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getTotalProratedBal() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 91;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.totalProratedBal;
        int i5 = i3 + 47;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<FibreProductItem> getProductList() {
        int i = 2 % 2;
        int i2 = component1 + 69;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        List<FibreProductItem> list = this.productList;
        int i5 = i3 + 27;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    static {
        int i = component3 + 73;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static FibreAccountBalances copy$default(FibreAccountBalances fibreAccountBalances, String str, String str2, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 41;
        int i4 = i3 % 128;
        component1 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 39;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            str = fibreAccountBalances.totalProducts;
        }
        if ((i & 2) != 0) {
            int i8 = i4 + 107;
            ShareDataUIState = i8 % 128;
            if (i8 % 2 != 0) {
                String str3 = fibreAccountBalances.totalProratedBal;
                throw null;
            }
            str2 = fibreAccountBalances.totalProratedBal;
        }
        if ((i & 4) != 0) {
            list = fibreAccountBalances.productList;
        }
        return fibreAccountBalances.copy(str, str2, list);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 17;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.totalProducts;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 13;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.totalProratedBal;
        int i5 = i2 + 91;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 18 / 0;
        }
        return str;
    }

    public final List<FibreProductItem> component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 71;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        List<FibreProductItem> list = this.productList;
        int i5 = i2 + 15;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final FibreAccountBalances copy(String totalProducts, String totalProratedBal, List<FibreProductItem> productList) {
        int i = 2 % 2;
        FibreAccountBalances fibreAccountBalances = new FibreAccountBalances(totalProducts, totalProratedBal, productList);
        int i2 = ShareDataUIState + 53;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 72 / 0;
        }
        return fibreAccountBalances;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 51;
        ShareDataUIState = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof FibreAccountBalances)) {
            int i2 = ShareDataUIState + 15;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        FibreAccountBalances fibreAccountBalances = (FibreAccountBalances) other;
        if (!Intrinsics.areEqual(this.totalProducts, fibreAccountBalances.totalProducts)) {
            int i4 = ShareDataUIState + 61;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.totalProratedBal, fibreAccountBalances.totalProratedBal)) {
            int i6 = component1 + 85;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.productList, fibreAccountBalances.productList)) {
            return false;
        }
        int i8 = ShareDataUIState + 109;
        component1 = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.totalProducts;
        if (str == null) {
            int i2 = component1 + 67;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.totalProratedBal;
        if (str2 == null) {
            int i4 = component1 + 115;
            int i5 = i4 % 128;
            ShareDataUIState = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 29;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        List<FibreProductItem> list = this.productList;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FibreAccountBalances(totalProducts=" + this.totalProducts + ", totalProratedBal=" + this.totalProratedBal + ", productList=" + this.productList + ")";
        int i2 = ShareDataUIState + 5;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 23 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 == 0) {
            dest.writeString(this.totalProducts);
            dest.writeString(this.totalProratedBal);
            throw null;
        }
        dest.writeString(this.totalProducts);
        dest.writeString(this.totalProratedBal);
        List<FibreProductItem> list = this.productList;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<FibreProductItem> it = list.iterator();
        while (it.hasNext()) {
            int i4 = component1 + 91;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                it.next().writeToParcel(dest, flags);
                obj.hashCode();
                throw null;
            }
            it.next().writeToParcel(dest, flags);
        }
    }
}
