package com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.newspaper.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0003H\u0007J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H×\u0003J\t\u0010\u0015\u001a\u00020\u0003H×\u0001J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0003H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/Publications;", "Landroid/os/Parcelable;", "productCount", "", "products", "", "Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/Product;", "<init>", "(ILjava/util/List;)V", "getProductCount", "()I", "getProducts", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Publications implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Publications> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 1;
    private static int copydefault;

    @SerializedName("productCount")
    private final int productCount;

    @SerializedName("products")
    private final List<Product> products;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Publications> {
        private static int component2 = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Publications createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i3);
            int i4 = 0;
            while (i4 != i3) {
                int i5 = component2 + 53;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                arrayList.add(Product.CREATOR.createFromParcel(parcel));
                i4++;
                int i7 = component3 + 27;
                component2 = i7 % 128;
                int i8 = i7 % 2;
            }
            return new Publications(i2, arrayList);
        }

        @Override
        public Publications createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 39;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Publications publicationsCreateFromParcel = createFromParcel(parcel);
            int i4 = component2 + 117;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return publicationsCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Publications[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3;
            int i4 = i3 + 3;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            Publications[] publicationsArr = new Publications[i];
            int i6 = i3 + 11;
            component2 = i6 % 128;
            if (i6 % 2 == 0) {
                return publicationsArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public Publications[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 7;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            Publications[] publicationsArrNewArray = newArray(i);
            int i5 = component2 + 119;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                return publicationsArrNewArray;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public Publications(int i, List<Product> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.productCount = i;
        this.products = list;
    }

    public final int getProductCount() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 25;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.productCount;
        int i6 = i2 + 107;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final List<Product> getProducts() {
        int i = 2 % 2;
        int i2 = copydefault + 83;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        List<Product> list = this.products;
        int i5 = i3 + 123;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    static {
        int i = component2 + 119;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            int i2 = 76 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Publications copy$default(Publications publications, int i, List list, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = component1 + 81;
        int i5 = i4 % 128;
        copydefault = i5;
        int i6 = i4 % 2;
        if ((i2 & 1) != 0) {
            int i7 = i5 + 41;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            i = publications.productCount;
        }
        if ((i2 & 2) != 0) {
            int i9 = component1 + 111;
            copydefault = i9 % 128;
            int i10 = i9 % 2;
            list = publications.products;
        }
        return publications.copy(i, list);
    }

    public final int component1() {
        int i = 2 % 2;
        int i2 = component1 + 73;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = this.productCount;
        int i6 = i3 + 99;
        component1 = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<Product> component2() {
        int i = 2 % 2;
        int i2 = component1 + 113;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        List<Product> list = this.products;
        int i5 = i3 + 69;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Publications copy(int productCount, List<Product> products) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(products, "");
        Publications publications = new Publications(productCount, products);
        int i2 = copydefault + 33;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return publications;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 45;
        component1 = i3 % 128;
        int i4 = (i3 % 2 == 0 ? 0 : 1) ^ 1;
        int i5 = i2 + 107;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 67;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(!(other instanceof Publications))) {
            Publications publications = (Publications) other;
            return this.productCount == publications.productCount && Intrinsics.areEqual(this.products, publications.products);
        }
        int i4 = i2 + 11;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 51;
        component1 = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (Integer.hashCode(this.productCount) - 89) >>> this.products.hashCode() : (Integer.hashCode(this.productCount) * 31) + this.products.hashCode();
        int i3 = copydefault + 51;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Publications(productCount=" + this.productCount + ", products=" + this.products + ")";
        int i2 = copydefault + 105;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeInt(this.productCount);
        List<Product> list = this.products;
        dest.writeInt(list.size());
        Iterator<Product> it = list.iterator();
        while (!(!it.hasNext())) {
            int i2 = component1 + 111;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            it.next().writeToParcel(dest, flags);
        }
        int i4 = component1 + 5;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }
}
