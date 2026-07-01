package com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.newspaper.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.constants.Keys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B_\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\r¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010!\u001a\u00020\u0004HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00110\rHÆ\u0003Jq\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\rHÇ\u0001J\b\u0010+\u001a\u00020\u0006H\u0007J\u0013\u0010,\u001a\u00020\u00042\b\u0010-\u001a\u0004\u0018\u00010.H×\u0003J\t\u0010/\u001a\u00020\u0006H×\u0001J\t\u00100\u001a\u00020\bH×\u0001J\u0018\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u0006H\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0016\u0010\n\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010\u000b\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u000f\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\r8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001e¨\u00066"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/Product;", "Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/IPublication;", "Landroid/os/Parcelable;", "customerSubscribed", "", "productId", "", "slug", "", "releaseCount", "productName", Keys.KEY_HEADER_URL, "productPackage", "", "Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/ProductPackage;", "lifeSpan", "latestRelease", "Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/LatestRelease;", "<init>", "(ZILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/util/List;)V", "getCustomerSubscribed", "()Z", "getProductId", "()I", "getSlug", "()Ljava/lang/String;", "getReleaseCount", "getProductName", "getAvatarUrl", "getProductPackage", "()Ljava/util/List;", "getLifeSpan", "getLatestRelease", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Product implements IPublication, Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Product> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName(Keys.KEY_HEADER_URL)
    private final String avatarUrl;

    @SerializedName("customerSubscribed")
    private final boolean customerSubscribed;

    @SerializedName("latestRelease")
    private final List<LatestRelease> latestRelease;

    @SerializedName("lifeSpan")
    private final int lifeSpan;

    @SerializedName("productId")
    private final int productId;

    @SerializedName("productName")
    private final String productName;

    @SerializedName("productPackage")
    private final List<ProductPackage> productPackage;

    @SerializedName("releaseCount")
    private final int releaseCount;

    @SerializedName("slug")
    private final String slug;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Product> {
        private static int component1 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Product createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i = 2 % 2;
            int i2 = copydefault + 121;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i4 = 0;
            boolean z = parcel.readInt() != 0;
            int i5 = parcel.readInt();
            String string = parcel.readString();
            int i6 = parcel.readInt();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i7 = component1 + 69;
                copydefault = i7 % 128;
                int i8 = i7 % 2;
                arrayList = null;
            } else {
                int i9 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i9);
                for (int i10 = 0; i10 != i9; i10++) {
                    arrayList2.add(ProductPackage.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            ArrayList arrayList3 = arrayList;
            int i11 = parcel.readInt();
            int i12 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i12);
            while (i4 != i12) {
                int i13 = copydefault + 83;
                component1 = i13 % 128;
                if (i13 % 2 == 0) {
                    arrayList4.add(LatestRelease.CREATOR.createFromParcel(parcel));
                    i4 += 45;
                } else {
                    arrayList4.add(LatestRelease.CREATOR.createFromParcel(parcel));
                    i4++;
                }
            }
            return new Product(z, i5, string, i6, string2, string3, arrayList3, i11, arrayList4);
        }

        @Override
        public Product createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 111;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Product productCreateFromParcel = createFromParcel(parcel);
            if (i3 == 0) {
                int i4 = 11 / 0;
            }
            int i5 = component1 + 51;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return productCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Product[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 23;
            component1 = i3 % 128;
            Product[] productArr = new Product[i];
            if (i3 % 2 != 0) {
                return productArr;
            }
            throw null;
        }

        @Override
        public Product[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 7;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            Product[] productArrNewArray = newArray(i);
            if (i4 == 0) {
                int i5 = 15 / 0;
            }
            int i6 = component1 + 113;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return productArrNewArray;
        }
    }

    public Product(boolean z, int i, String str, int i2, String str2, String str3, List<ProductPackage> list, int i3, List<LatestRelease> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.customerSubscribed = z;
        this.productId = i;
        this.slug = str;
        this.releaseCount = i2;
        this.productName = str2;
        this.avatarUrl = str3;
        this.productPackage = list;
        this.lifeSpan = i3;
        this.latestRelease = list2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Product(boolean z, int i, String str, int i2, String str2, String str3, List list, int i3, List list2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        List list3;
        if ((i4 & 64) != 0) {
            int i5 = component3 + 75;
            int i6 = i5 % 128;
            component2 = i6;
            if (i5 % 2 == 0) {
                throw null;
            }
            int i7 = i6 + 95;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            list3 = null;
        } else {
            list3 = list;
        }
        this(z, i, str, i2, str2, str3, list3, i3, list2);
    }

    public final boolean getCustomerSubscribed() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 61;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.customerSubscribed;
        int i5 = i2 + 15;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final int getProductId() {
        int i = 2 % 2;
        int i2 = component3 + 83;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.productId;
        if (i3 == 0) {
            int i5 = 54 / 0;
        }
        return i4;
    }

    public final String getSlug() {
        int i = 2 % 2;
        int i2 = component3 + 19;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.slug;
        int i5 = i3 + 27;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int getReleaseCount() {
        int i = 2 % 2;
        int i2 = component3 + 83;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.releaseCount;
        int i5 = i3 + 103;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    @Override
    public String getProductName() {
        int i = 2 % 2;
        int i2 = component3 + 21;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.productName;
        if (i3 == 0) {
            int i4 = 87 / 0;
        }
        return str;
    }

    @Override
    public String getAvatarUrl() {
        int i = 2 % 2;
        int i2 = component3 + 85;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.avatarUrl;
        }
        throw null;
    }

    @Override
    public List<ProductPackage> getProductPackage() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 85;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        List<ProductPackage> list = this.productPackage;
        int i4 = i2 + 57;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 41 / 0;
        }
        return list;
    }

    @Override
    public int getLifeSpan() {
        int i = 2 % 2;
        int i2 = component2 + 115;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = this.lifeSpan;
        int i6 = i3 + 123;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    @Override
    public List<LatestRelease> getLatestRelease() {
        int i = 2 % 2;
        int i2 = component3 + 105;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<LatestRelease> list = this.latestRelease;
        int i4 = i3 + 37;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    static {
        int i = component1 + 27;
        copydefault = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Product copy$default(Product product, boolean z, int i, String str, int i2, String str2, String str3, List list, int i3, List list2, int i4, Object obj) {
        String str4;
        String str5;
        List list3;
        List list4;
        int i5 = 2 % 2;
        int i6 = component2 + 93;
        int i7 = i6 % 128;
        component3 = i7;
        boolean z2 = (i6 % 2 == 0 ? (i4 & 1) == 0 : (i4 & 1) == 0) ? z : product.customerSubscribed;
        int i8 = (i4 & 2) != 0 ? product.productId : i;
        if ((i4 & 4) != 0) {
            int i9 = i7 + 11;
            component2 = i9 % 128;
            int i10 = i9 % 2;
            str4 = product.slug;
        } else {
            str4 = str;
        }
        int i11 = (i4 & 8) != 0 ? product.releaseCount : i2;
        String str6 = (i4 & 16) != 0 ? product.productName : str2;
        if ((i4 & 32) != 0) {
            int i12 = i7 + 41;
            component2 = i12 % 128;
            int i13 = i12 % 2;
            str5 = product.avatarUrl;
        } else {
            str5 = str3;
        }
        if ((i4 & 64) != 0) {
            int i14 = component2 + 109;
            component3 = i14 % 128;
            int i15 = i14 % 2;
            list3 = product.productPackage;
        } else {
            list3 = list;
        }
        int i16 = (i4 & 128) != 0 ? product.lifeSpan : i3;
        if ((i4 & 256) != 0) {
            int i17 = component3 + 57;
            component2 = i17 % 128;
            int i18 = i17 % 2;
            list4 = product.latestRelease;
        } else {
            list4 = list2;
        }
        return product.copy(z2, i8, str4, i11, str6, str5, list3, i16, list4);
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 9;
        component2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        boolean z = this.customerSubscribed;
        int i4 = i2 + 101;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 113;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = this.productId;
        int i5 = i2 + 31;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3 + 115;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.slug;
        int i4 = i3 + 21;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final int component4() {
        int i;
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 19;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            i = this.releaseCount;
            int i5 = 81 / 0;
        } else {
            i = this.releaseCount;
        }
        int i6 = i3 + 61;
        component3 = i6 % 128;
        if (i6 % 2 == 0) {
            return i;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component2 + 97;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.productName;
        if (i3 != 0) {
            int i4 = 1 / 0;
        }
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component3 + 89;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.avatarUrl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<ProductPackage> component7() {
        int i = 2 % 2;
        int i2 = component2 + 109;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.productPackage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int component8() {
        int i = 2 % 2;
        int i2 = component3 + 55;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = this.lifeSpan;
        int i6 = i3 + 91;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final List<LatestRelease> component9() {
        int i = 2 % 2;
        int i2 = component2 + 7;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.latestRelease;
        }
        throw null;
    }

    public final Product copy(boolean customerSubscribed, int productId, String slug, int releaseCount, String productName, String avatarUrl, List<ProductPackage> productPackage, int lifeSpan, List<LatestRelease> latestRelease) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(slug, "");
        Intrinsics.checkNotNullParameter(productName, "");
        Intrinsics.checkNotNullParameter(avatarUrl, "");
        Intrinsics.checkNotNullParameter(latestRelease, "");
        Product product = new Product(customerSubscribed, productId, slug, releaseCount, productName, avatarUrl, productPackage, lifeSpan, latestRelease);
        int i2 = component2 + 97;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return product;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 31;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 83;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 44 / 0;
        }
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof Product)) {
            return false;
        }
        Product product = (Product) other;
        if (this.customerSubscribed != product.customerSubscribed) {
            int i2 = component3 + 93;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (this.productId != product.productId) {
            int i4 = component2 + 47;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if ((!Intrinsics.areEqual(this.slug, product.slug)) || this.releaseCount != product.releaseCount) {
            return false;
        }
        if (Intrinsics.areEqual(this.productName, product.productName)) {
            if (!Intrinsics.areEqual(this.avatarUrl, product.avatarUrl)) {
                return false;
            }
            if (Intrinsics.areEqual(this.productPackage, product.productPackage)) {
                return this.lifeSpan == product.lifeSpan && Intrinsics.areEqual(this.latestRelease, product.latestRelease);
            }
            int i6 = component2 + 29;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = component2 + 107;
        int i9 = i8 % 128;
        component3 = i9;
        boolean z = i8 % 2 != 0;
        int i10 = i9 + 85;
        component2 = i10 % 128;
        int i11 = i10 % 2;
        return z;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = Boolean.hashCode(this.customerSubscribed);
        int iHashCode3 = Integer.hashCode(this.productId);
        int iHashCode4 = this.slug.hashCode();
        int iHashCode5 = Integer.hashCode(this.releaseCount);
        int iHashCode6 = this.productName.hashCode();
        int iHashCode7 = this.avatarUrl.hashCode();
        List<ProductPackage> list = this.productPackage;
        if (list == null) {
            int i2 = component3 + 69;
            component2 = i2 % 128;
            iHashCode = (i2 % 2 == 0 ? 0 : 1) ^ 1;
        } else {
            iHashCode = list.hashCode();
            int i3 = component3 + 83;
            component2 = i3 % 128;
            int i4 = i3 % 2;
        }
        int iHashCode8 = (((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode) * 31) + Integer.hashCode(this.lifeSpan)) * 31) + this.latestRelease.hashCode();
        int i5 = component2 + 29;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode8;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Product(customerSubscribed=" + this.customerSubscribed + ", productId=" + this.productId + ", slug=" + this.slug + ", releaseCount=" + this.releaseCount + ", productName=" + this.productName + ", avatarUrl=" + this.avatarUrl + ", productPackage=" + this.productPackage + ", lifeSpan=" + this.lifeSpan + ", latestRelease=" + this.latestRelease + ")";
        int i2 = component2 + 47;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeInt(this.customerSubscribed ? 1 : 0);
        dest.writeInt(this.productId);
        dest.writeString(this.slug);
        dest.writeInt(this.releaseCount);
        dest.writeString(this.productName);
        dest.writeString(this.avatarUrl);
        List<ProductPackage> list = this.productPackage;
        Object obj = null;
        if (list == null) {
            int i2 = component2 + 95;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                dest.writeInt(1);
            } else {
                dest.writeInt(0);
            }
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<ProductPackage> it = list.iterator();
            while (it.hasNext()) {
                int i3 = component3 + 119;
                component2 = i3 % 128;
                if (i3 % 2 == 0) {
                    it.next().writeToParcel(dest, flags);
                    throw null;
                }
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeInt(this.lifeSpan);
        List<LatestRelease> list2 = this.latestRelease;
        dest.writeInt(list2.size());
        Iterator<LatestRelease> it2 = list2.iterator();
        int i4 = component2 + 77;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        while (it2.hasNext()) {
            int i6 = component2 + 117;
            component3 = i6 % 128;
            if (i6 % 2 != 0) {
                it2.next().writeToParcel(dest, flags);
                obj.hashCode();
                throw null;
            }
            it2.next().writeToParcel(dest, flags);
        }
    }
}
