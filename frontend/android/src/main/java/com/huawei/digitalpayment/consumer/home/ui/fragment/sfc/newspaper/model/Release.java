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

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\b\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010%\u001a\u00020\u0004HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\t\u0010)\u001a\u00020\u0004HÆ\u0003J\t\u0010*\u001a\u00020\u0004HÆ\u0003J\t\u0010+\u001a\u00020\u0004HÆ\u0003J\t\u0010,\u001a\u00020\u0004HÆ\u0003J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\bHÆ\u0003J\t\u0010.\u001a\u00020\u000bHÆ\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u008b\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bHÇ\u0001J\b\u00101\u001a\u00020\u000bH\u0007J\u0013\u00102\u001a\u00020\u00062\b\u00103\u001a\u0004\u0018\u000104H×\u0003J\t\u00105\u001a\u00020\u000bH×\u0001J\t\u00106\u001a\u00020\u0004H×\u0001J\u0018\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u000bH\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0016\u0010\u000e\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0016\u0010\u000f\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0016\u0010\u0012\u001a\u00020\u000b8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001b¨\u0006<"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/Release;", "Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/IPublication;", "Landroid/os/Parcelable;", "bannerUrl", "", "customerSubscribed", "", "otherReleases", "", "Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/LatestRelease;", "productId", "", "releaseCount", "slug", "productName", Keys.KEY_HEADER_URL, "productPackage", "Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/ProductPackage;", "lifeSpan", "latestRelease", "<init>", "(Ljava/lang/String;ZLjava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/util/List;)V", "getBannerUrl", "()Ljava/lang/String;", "getCustomerSubscribed", "()Z", "getOtherReleases", "()Ljava/util/List;", "getProductId", "()I", "getReleaseCount", "getSlug", "getProductName", "getAvatarUrl", "getProductPackage", "getLifeSpan", "getLatestRelease", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Release implements IPublication, Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Release> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component2;
    private static int copydefault;

    @SerializedName(Keys.KEY_HEADER_URL)
    private final String avatarUrl;

    @SerializedName("bannerUrl")
    private final String bannerUrl;

    @SerializedName("customerSubscribed")
    private final boolean customerSubscribed;

    @SerializedName("latestRelease")
    private final List<LatestRelease> latestRelease;

    @SerializedName("lifeSpan")
    private final int lifeSpan;

    @SerializedName("otherReleases")
    private final List<LatestRelease> otherReleases;

    @SerializedName("productId")
    private final int productId;

    @SerializedName("productName")
    private final String productName;

    @SerializedName("productPackage")
    private final List<ProductPackage> productPackage;

    @SerializedName("releaseCount")
    private final String releaseCount;

    @SerializedName("slug")
    private final String slug;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Release> {
        private static int component3 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Release createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            boolean z = parcel.readInt() != 0;
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            int i3 = component3 + 119;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 3 % 2;
            }
            for (int i5 = 0; i5 != i2; i5++) {
                arrayList2.add(LatestRelease.CREATOR.createFromParcel(parcel));
            }
            ArrayList arrayList3 = arrayList2;
            int i6 = parcel.readInt();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i7 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    arrayList4.add(ProductPackage.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList4;
            }
            ArrayList arrayList5 = arrayList;
            int i9 = parcel.readInt();
            int i10 = parcel.readInt();
            ArrayList arrayList6 = new ArrayList(i10);
            int i11 = component3 + 119;
            copydefault = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 0;
            while (i13 != i10) {
                int i14 = copydefault + 99;
                int i15 = i10;
                component3 = i14 % 128;
                int i16 = i14 % 2;
                LatestRelease latestReleaseCreateFromParcel = LatestRelease.CREATOR.createFromParcel(parcel);
                if (i16 == 0) {
                    arrayList6.add(latestReleaseCreateFromParcel);
                    i13 += 97;
                } else {
                    arrayList6.add(latestReleaseCreateFromParcel);
                    i13++;
                }
                i10 = i15;
            }
            return new Release(string, z, arrayList3, i6, string2, string3, string4, string5, arrayList5, i9, arrayList6);
        }

        @Override
        public Release createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 55;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Release releaseCreateFromParcel = createFromParcel(parcel);
            int i4 = copydefault + 123;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                return releaseCreateFromParcel;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Release[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 9;
            copydefault = i3 % 128;
            Release[] releaseArr = new Release[i];
            if (i3 % 2 != 0) {
                int i4 = 13 / 0;
            }
            return releaseArr;
        }

        @Override
        public Release[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 99;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            Release[] releaseArrNewArray = newArray(i);
            int i5 = copydefault + 87;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                return releaseArrNewArray;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public Release(String str, boolean z, List<LatestRelease> list, int i, String str2, String str3, String str4, String str5, List<ProductPackage> list2, int i2, List<LatestRelease> list3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list3, "");
        this.bannerUrl = str;
        this.customerSubscribed = z;
        this.otherReleases = list;
        this.productId = i;
        this.releaseCount = str2;
        this.slug = str3;
        this.productName = str4;
        this.avatarUrl = str5;
        this.productPackage = list2;
        this.lifeSpan = i2;
        this.latestRelease = list3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Release(String str, boolean z, List list, int i, String str2, String str3, String str4, String str5, List list2, int i2, List list3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        List list4;
        if ((i3 & 256) != 0) {
            int i4 = ShareDataUIState;
            int i5 = i4 + 53;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 39;
            copydefault = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 2 % 2;
            }
            list4 = null;
        } else {
            list4 = list2;
        }
        this(str, z, list, i, str2, str3, str4, str5, list4, i2, list3);
    }

    public final String getBannerUrl() {
        int i = 2 % 2;
        int i2 = copydefault + 47;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.bannerUrl;
        int i5 = i3 + 91;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean getCustomerSubscribed() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 21;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.customerSubscribed;
        int i5 = i2 + 109;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 46 / 0;
        }
        return z;
    }

    public final List<LatestRelease> getOtherReleases() {
        List<LatestRelease> list;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 29;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            list = this.otherReleases;
            int i4 = 0 / 0;
        } else {
            list = this.otherReleases;
        }
        int i5 = i2 + 71;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getProductId() {
        int i = 2 % 2;
        int i2 = copydefault + 5;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = this.productId;
        int i6 = i3 + 25;
        copydefault = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public final String getReleaseCount() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 67;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.releaseCount;
        int i5 = i2 + 43;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getSlug() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.slug;
        int i5 = i3 + 69;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override
    public String getProductName() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 65;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.productName;
        int i4 = i2 + 83;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    @Override
    public String getAvatarUrl() {
        int i = 2 % 2;
        int i2 = copydefault + 117;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.avatarUrl;
        int i5 = i3 + 45;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public List<ProductPackage> getProductPackage() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 43;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        List<ProductPackage> list = this.productPackage;
        int i5 = i3 + 17;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    @Override
    public int getLifeSpan() {
        int i = 2 % 2;
        int i2 = copydefault + 53;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.lifeSpan;
        int i5 = i3 + 43;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    @Override
    public List<LatestRelease> getLatestRelease() {
        int i = 2 % 2;
        int i2 = copydefault + 61;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.latestRelease;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component2 + 47;
        component1 = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Release copy$default(Release release, String str, boolean z, List list, int i, String str2, String str3, String str4, String str5, List list2, int i2, List list3, int i3, Object obj) {
        boolean z2;
        List list4;
        int i4;
        String str6;
        int i5;
        int i6 = 2 % 2;
        String str7 = (i3 & 1) != 0 ? release.bannerUrl : str;
        if ((i3 & 2) != 0) {
            z2 = release.customerSubscribed;
            int i7 = ShareDataUIState + 53;
            copydefault = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 3 / 2;
            }
        } else {
            z2 = z;
        }
        if ((i3 & 4) != 0) {
            int i9 = ShareDataUIState + 15;
            copydefault = i9 % 128;
            int i10 = i9 % 2;
            list4 = release.otherReleases;
        } else {
            list4 = list;
        }
        if ((i3 & 8) != 0) {
            int i11 = ShareDataUIState + 17;
            copydefault = i11 % 128;
            if (i11 % 2 != 0) {
                i4 = release.productId;
                int i12 = 14 / 0;
            } else {
                i4 = release.productId;
            }
        } else {
            i4 = i;
        }
        if ((i3 & 16) != 0) {
            int i13 = ShareDataUIState + 87;
            copydefault = i13 % 128;
            if (i13 % 2 != 0) {
                str6 = release.releaseCount;
                int i14 = 36 / 0;
            } else {
                str6 = release.releaseCount;
            }
        } else {
            str6 = str2;
        }
        String str8 = (i3 & 32) != 0 ? release.slug : str3;
        String str9 = (i3 & 64) != 0 ? release.productName : str4;
        String str10 = (i3 & 128) != 0 ? release.avatarUrl : str5;
        List list5 = (i3 & 256) != 0 ? release.productPackage : list2;
        if ((i3 & 512) != 0) {
            i5 = release.lifeSpan;
            int i15 = copydefault + 71;
            ShareDataUIState = i15 % 128;
            int i16 = i15 % 2;
        } else {
            i5 = i2;
        }
        return release.copy(str7, z2, list4, i4, str6, str8, str9, str10, list5, i5, (i3 & 1024) != 0 ? release.latestRelease : list3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.bannerUrl;
        }
        throw null;
    }

    public final int component10() {
        int i = 2 % 2;
        int i2 = copydefault + 119;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = this.lifeSpan;
        int i5 = i3 + 3;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 48 / 0;
        }
        return i4;
    }

    public final List<LatestRelease> component11() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 31;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        List<LatestRelease> list = this.latestRelease;
        int i5 = i2 + 101;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 107;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        boolean z = this.customerSubscribed;
        int i5 = i3 + 51;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final List<LatestRelease> component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 31;
        copydefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        List<LatestRelease> list = this.otherReleases;
        int i4 = i2 + 109;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return list;
        }
        obj.hashCode();
        throw null;
    }

    public final int component4() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 57;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.productId;
        int i6 = i2 + 85;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 40 / 0;
        }
        return i5;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 99;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.releaseCount;
        int i5 = i2 + 63;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = copydefault + 39;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.slug;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 15;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.productName;
        int i5 = i3 + 25;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = copydefault + 117;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.avatarUrl;
        int i4 = i3 + 77;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 26 / 0;
        }
        return str;
    }

    public final List<ProductPackage> component9() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 111;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        List<ProductPackage> list = this.productPackage;
        int i5 = i3 + 93;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final Release copy(String bannerUrl, boolean customerSubscribed, List<LatestRelease> otherReleases, int productId, String releaseCount, String slug, String productName, String avatarUrl, List<ProductPackage> productPackage, int lifeSpan, List<LatestRelease> latestRelease) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bannerUrl, "");
        Intrinsics.checkNotNullParameter(otherReleases, "");
        Intrinsics.checkNotNullParameter(releaseCount, "");
        Intrinsics.checkNotNullParameter(slug, "");
        Intrinsics.checkNotNullParameter(productName, "");
        Intrinsics.checkNotNullParameter(avatarUrl, "");
        Intrinsics.checkNotNullParameter(latestRelease, "");
        Release release = new Release(bannerUrl, customerSubscribed, otherReleases, productId, releaseCount, slug, productName, avatarUrl, productPackage, lifeSpan, latestRelease);
        int i2 = ShareDataUIState + 67;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return release;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 63;
        ShareDataUIState = i2 % 128;
        return i2 % 2 == 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof Release)) {
            return false;
        }
        Release release = (Release) other;
        if (!Intrinsics.areEqual(this.bannerUrl, release.bannerUrl)) {
            int i2 = copydefault + 15;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (this.customerSubscribed != release.customerSubscribed) {
            int i4 = ShareDataUIState + 39;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.otherReleases, release.otherReleases)) {
            int i6 = ShareDataUIState + 7;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.productId != release.productId) {
            return false;
        }
        if (!Intrinsics.areEqual(this.releaseCount, release.releaseCount)) {
            int i8 = copydefault + 89;
            ShareDataUIState = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.slug, release.slug)) {
            int i10 = ShareDataUIState + 73;
            copydefault = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.productName, release.productName) || (!Intrinsics.areEqual(this.avatarUrl, release.avatarUrl)) || !Intrinsics.areEqual(this.productPackage, release.productPackage) || this.lifeSpan != release.lifeSpan) {
            return false;
        }
        if (Intrinsics.areEqual(this.latestRelease, release.latestRelease)) {
            return true;
        }
        int i12 = copydefault + 29;
        ShareDataUIState = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 30 / 0;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.bannerUrl.hashCode();
        int iHashCode3 = Boolean.hashCode(this.customerSubscribed);
        int iHashCode4 = this.otherReleases.hashCode();
        int iHashCode5 = Integer.hashCode(this.productId);
        int iHashCode6 = this.releaseCount.hashCode();
        int iHashCode7 = this.slug.hashCode();
        int iHashCode8 = this.productName.hashCode();
        int iHashCode9 = this.avatarUrl.hashCode();
        List<ProductPackage> list = this.productPackage;
        if (list == null) {
            int i4 = copydefault + 69;
            ShareDataUIState = i4 % 128;
            iHashCode = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = list.hashCode();
        }
        return (((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode) * 31) + Integer.hashCode(this.lifeSpan)) * 31) + this.latestRelease.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Release(bannerUrl=" + this.bannerUrl + ", customerSubscribed=" + this.customerSubscribed + ", otherReleases=" + this.otherReleases + ", productId=" + this.productId + ", releaseCount=" + this.releaseCount + ", slug=" + this.slug + ", productName=" + this.productName + ", avatarUrl=" + this.avatarUrl + ", productPackage=" + this.productPackage + ", lifeSpan=" + this.lifeSpan + ", latestRelease=" + this.latestRelease + ")";
        int i2 = copydefault + 93;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        Iterator<LatestRelease> it;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 != 0) {
            dest.writeString(this.bannerUrl);
            dest.writeInt(this.customerSubscribed ? 1 : 0);
            List<LatestRelease> list = this.otherReleases;
            dest.writeInt(list.size());
            it = list.iterator();
            int i4 = 54 / 0;
        } else {
            dest.writeString(this.bannerUrl);
            dest.writeInt(this.customerSubscribed ? 1 : 0);
            List<LatestRelease> list2 = this.otherReleases;
            dest.writeInt(list2.size());
            it = list2.iterator();
        }
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
            int i5 = copydefault + 17;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
        }
        dest.writeInt(this.productId);
        dest.writeString(this.releaseCount);
        dest.writeString(this.slug);
        dest.writeString(this.productName);
        dest.writeString(this.avatarUrl);
        List<ProductPackage> list3 = this.productPackage;
        if (list3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list3.size());
            Iterator<ProductPackage> it2 = list3.iterator();
            while (it2.hasNext()) {
                int i7 = copydefault + 43;
                ShareDataUIState = i7 % 128;
                int i8 = i7 % 2;
                it2.next().writeToParcel(dest, flags);
            }
        }
        dest.writeInt(this.lifeSpan);
        List<LatestRelease> list4 = this.latestRelease;
        dest.writeInt(list4.size());
        Iterator<LatestRelease> it3 = list4.iterator();
        while (it3.hasNext()) {
            int i9 = ShareDataUIState + 101;
            copydefault = i9 % 128;
            if (i9 % 2 != 0) {
                it3.next().writeToParcel(dest, flags);
                int i10 = 7 / 0;
            } else {
                it3.next().writeToParcel(dest, flags);
            }
        }
    }
}
