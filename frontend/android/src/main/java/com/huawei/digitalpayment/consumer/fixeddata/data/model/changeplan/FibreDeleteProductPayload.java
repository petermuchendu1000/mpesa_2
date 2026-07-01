package com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.Product;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreDeleteProductPayload;", "Landroid/os/Parcelable;", "accountId", "", "productList", "", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountDetails/Product;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getAccountId", "()Ljava/lang/String;", "getProductList", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FibreDeleteProductPayload implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<FibreDeleteProductPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 1;
    private static int copydefault;

    @SerializedName("accountId")
    private final String accountId;

    @SerializedName("productList")
    private final List<Product> productList;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FibreDeleteProductPayload> {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FibreDeleteProductPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = ShareDataUIState + 47;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 0;
            while (i5 != i2) {
                int i6 = component1 + 11;
                ShareDataUIState = i6 % 128;
                if (i6 % 2 != 0) {
                    arrayList.add(Product.CREATOR.createFromParcel(parcel));
                    i5 += 96;
                } else {
                    arrayList.add(Product.CREATOR.createFromParcel(parcel));
                    i5++;
                }
            }
            return new FibreDeleteProductPayload(string, arrayList);
        }

        @Override
        public FibreDeleteProductPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 41;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            FibreDeleteProductPayload fibreDeleteProductPayloadCreateFromParcel = createFromParcel(parcel);
            if (i3 != 0) {
                int i4 = 54 / 0;
            }
            int i5 = component1 + 125;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return fibreDeleteProductPayloadCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FibreDeleteProductPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState;
            int i4 = i3 + 45;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            FibreDeleteProductPayload[] fibreDeleteProductPayloadArr = new FibreDeleteProductPayload[i];
            int i6 = i3 + 47;
            component1 = i6 % 128;
            if (i6 % 2 != 0) {
                return fibreDeleteProductPayloadArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public FibreDeleteProductPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 37;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            FibreDeleteProductPayload[] fibreDeleteProductPayloadArrNewArray = newArray(i);
            int i5 = ShareDataUIState + 65;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                return fibreDeleteProductPayloadArrNewArray;
            }
            throw null;
        }
    }

    public FibreDeleteProductPayload(String str, List<Product> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.accountId = str;
        this.productList = list;
    }

    public final String getAccountId() {
        int i = 2 % 2;
        int i2 = component1 + 69;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.accountId;
        int i5 = i3 + 67;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<Product> getProductList() {
        int i = 2 % 2;
        int i2 = component1 + 23;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.productList;
        }
        throw null;
    }

    static {
        int i = component2 + 31;
        copydefault = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static FibreDeleteProductPayload copy$default(FibreDeleteProductPayload fibreDeleteProductPayload, String str, List list, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component1 + 123;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            int i5 = i3 % 2;
            str = fibreDeleteProductPayload.accountId;
            int i6 = i4 + 37;
            component1 = i6 % 128;
            int i7 = i6 % 2;
        }
        if ((i & 2) != 0) {
            int i8 = component1 + 91;
            ShareDataUIState = i8 % 128;
            if (i8 % 2 != 0) {
                List<Product> list2 = fibreDeleteProductPayload.productList;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            list = fibreDeleteProductPayload.productList;
        }
        return fibreDeleteProductPayload.copy(str, list);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 31;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.accountId;
        int i5 = i3 + 27;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<Product> component2() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 111;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        List<Product> list = this.productList;
        int i5 = i2 + 41;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final FibreDeleteProductPayload copy(String accountId, List<Product> productList) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(accountId, "");
        Intrinsics.checkNotNullParameter(productList, "");
        FibreDeleteProductPayload fibreDeleteProductPayload = new FibreDeleteProductPayload(accountId, productList);
        int i2 = ShareDataUIState + 93;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return fibreDeleteProductPayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 111;
        ShareDataUIState = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component1 + 53;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof FibreDeleteProductPayload)) {
            return false;
        }
        FibreDeleteProductPayload fibreDeleteProductPayload = (FibreDeleteProductPayload) other;
        if (!Intrinsics.areEqual(this.accountId, fibreDeleteProductPayload.accountId)) {
            return false;
        }
        if (Intrinsics.areEqual(this.productList, fibreDeleteProductPayload.productList)) {
            return true;
        }
        int i4 = ShareDataUIState + 37;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 72 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 27;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.accountId.hashCode() * 31) + this.productList.hashCode();
        int i4 = component1 + 101;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FibreDeleteProductPayload(accountId=" + this.accountId + ", productList=" + this.productList + ")";
        int i2 = component1 + 7;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.accountId);
        List<Product> list = this.productList;
        dest.writeInt(list.size());
        Iterator<Product> it = list.iterator();
        while (!(!it.hasNext())) {
            int i2 = component1 + 71;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            it.next().writeToParcel(dest, flags);
        }
        int i4 = ShareDataUIState + 119;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }
}
