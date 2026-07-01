package com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.newspaper.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÇ\u0001J\b\u0010\u0017\u001a\u00020\u0006H\u0007J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH×\u0003J\t\u0010\u001c\u001a\u00020\u0006H×\u0001J\t\u0010\u001d\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0006H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006#"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/ProductPackage;", "Landroid/os/Parcelable;", "currency", "", "frequency", "packageId", "", FirebaseAnalytics.Param.PRICE, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;ID)V", "getCurrency", "()Ljava/lang/String;", "getFrequency", "getPackageId", "()I", "getPrice", "()D", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProductPackage implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ProductPackage> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName("currency")
    private final String currency;

    @SerializedName("frequency")
    private final String frequency;

    @SerializedName("packageId")
    private final int packageId;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private final double price;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ProductPackage> {
        private static int component1 = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ProductPackage createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            ProductPackage productPackage = new ProductPackage(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readDouble());
            int i2 = component3 + 83;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return productPackage;
        }

        @Override
        public ProductPackage createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 107;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            ProductPackage productPackageCreateFromParcel = createFromParcel(parcel);
            if (i3 != 0) {
                int i4 = 22 / 0;
            }
            return productPackageCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ProductPackage[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3;
            int i4 = i3 + 7;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            ProductPackage[] productPackageArr = new ProductPackage[i];
            int i6 = i3 + 97;
            component1 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 97 / 0;
            }
            return productPackageArr;
        }

        @Override
        public ProductPackage[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 67;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                return newArray(i);
            }
            newArray(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public ProductPackage(String str, String str2, int i, double d2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.currency = str;
        this.frequency = str2;
        this.packageId = i;
        this.price = d2;
    }

    public final String getCurrency() {
        int i = 2 % 2;
        int i2 = copydefault + 101;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.currency;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getFrequency() {
        int i = 2 % 2;
        int i2 = component3 + 91;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.frequency;
        int i5 = i3 + 109;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int getPackageId() {
        int i = 2 % 2;
        int i2 = component3 + 125;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.packageId;
        if (i3 != 0) {
            int i5 = 38 / 0;
        }
        return i4;
    }

    public final double getPrice() {
        int i = 2 % 2;
        int i2 = component3 + 77;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        double d2 = this.price;
        int i5 = i3 + 95;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return d2;
    }

    static {
        int i = component2 + 51;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ProductPackage copy$default(ProductPackage productPackage, String str, String str2, int i, double d2, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = copydefault;
        int i5 = i4 + 79;
        component3 = i5 % 128;
        if (i5 % 2 != 0 && (i2 & 1) != 0) {
            int i6 = i4 + 101;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            str = productPackage.currency;
        }
        String str3 = str;
        if ((i2 & 2) != 0) {
            int i8 = i4 + 109;
            component3 = i8 % 128;
            int i9 = i8 % 2;
            str2 = productPackage.frequency;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            int i10 = component3 + 83;
            copydefault = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = productPackage.packageId;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            i = productPackage.packageId;
        }
        int i12 = i;
        if ((i2 & 8) != 0) {
            int i13 = component3 + 41;
            copydefault = i13 % 128;
            int i14 = i13 % 2;
            d2 = productPackage.price;
        }
        return productPackage.copy(str3, str4, i12, d2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 75;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.currency;
        int i4 = i2 + 91;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 107;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.frequency;
        int i5 = i2 + 5;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int component3() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 123;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.packageId;
        int i6 = i2 + 91;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final double component4() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 19;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        double d2 = this.price;
        int i5 = i2 + 79;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return d2;
    }

    public final ProductPackage copy(String currency, String frequency, int packageId, double price) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(currency, "");
        Intrinsics.checkNotNullParameter(frequency, "");
        ProductPackage productPackage = new ProductPackage(currency, frequency, packageId, price);
        int i2 = component3 + 35;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return productPackage;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 19;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductPackage)) {
            int i2 = copydefault + 53;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 111;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                return false;
            }
            throw null;
        }
        ProductPackage productPackage = (ProductPackage) other;
        if (!Intrinsics.areEqual(this.currency, productPackage.currency) || !Intrinsics.areEqual(this.frequency, productPackage.frequency) || this.packageId != productPackage.packageId) {
            return false;
        }
        if (Double.compare(this.price, productPackage.price) != 0) {
            int i6 = component3 + 79;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = copydefault + 109;
        component3 = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 101;
        copydefault = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (((((this.currency.hashCode() >> 33) * this.frequency.hashCode()) >> 28) % Integer.hashCode(this.packageId)) >> 85) >>> Double.hashCode(this.price) : (((((this.currency.hashCode() * 31) + this.frequency.hashCode()) * 31) + Integer.hashCode(this.packageId)) * 31) + Double.hashCode(this.price);
        int i3 = component3 + 57;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ProductPackage(currency=" + this.currency + ", frequency=" + this.frequency + ", packageId=" + this.packageId + ", price=" + this.price + ")";
        int i2 = component3 + 95;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 0 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.currency);
        dest.writeString(this.frequency);
        dest.writeInt(this.packageId);
        dest.writeDouble(this.price);
        int i4 = component3 + 85;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }
}
