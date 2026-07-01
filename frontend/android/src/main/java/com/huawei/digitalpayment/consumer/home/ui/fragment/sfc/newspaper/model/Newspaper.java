package com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.newspaper.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.constants.Keys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u009b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0011\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u00103\u001a\u00020\u0004HÆ\u0003J\t\u00104\u001a\u00020\u0004HÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J\t\u00106\u001a\u00020\tHÆ\u0003J\t\u00107\u001a\u00020\u000bHÆ\u0003J\t\u00108\u001a\u00020\u0004HÆ\u0003J\t\u00109\u001a\u00020\u0004HÆ\u0003J\t\u0010:\u001a\u00020\u0004HÆ\u0003J\t\u0010;\u001a\u00020\u0004HÆ\u0003J\t\u0010<\u001a\u00020\u0011HÆ\u0003J\t\u0010=\u001a\u00020\u0004HÆ\u0003J\t\u0010>\u001a\u00020\u0004HÆ\u0003J\t\u0010?\u001a\u00020\u0004HÆ\u0003J\u0011\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0003J\t\u0010A\u001a\u00020\u0011HÆ\u0003J\u0011\u0010B\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0016HÆ\u0003J¹\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00112\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0016HÇ\u0001J\b\u0010D\u001a\u00020\u0011H\u0007J\u0013\u0010E\u001a\u00020\t2\b\u0010F\u001a\u0004\u0018\u00010GH×\u0003J\t\u0010H\u001a\u00020\u0011H×\u0001J\t\u0010I\u001a\u00020\u0004H×\u0001J\u0018\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020\u0011H\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001eR\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0016\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0016\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR\u0016\u0010\u0013\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001eR\u0016\u0010\u0014\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001eR\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0016\u0010\u0018\u001a\u00020\u00118\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010+R\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00168\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00100¨\u0006O"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/Newspaper;", "Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/IPublication;", "Landroid/os/Parcelable;", "baseUrl", "", "featuredImage", "optimizedAttributes", "Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/OptimizedAttributes;", "optimizedStatus", "", FirebaseAnalytics.Param.PRICE, "", "productId", "releaseDate", "releaseId", "releaseName", "releaseStatus", "", "releaseValue", "productName", Keys.KEY_HEADER_URL, "productPackage", "", "Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/ProductPackage;", "lifeSpan", "latestRelease", "Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/LatestRelease;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/OptimizedAttributes;ZDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/util/List;)V", "getBaseUrl", "()Ljava/lang/String;", "getFeaturedImage", "getOptimizedAttributes", "()Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/OptimizedAttributes;", "getOptimizedStatus", "()Z", "getPrice", "()D", "getProductId", "getReleaseDate", "getReleaseId", "getReleaseName", "getReleaseStatus", "()I", "getReleaseValue", "getProductName", "getAvatarUrl", "getProductPackage", "()Ljava/util/List;", "getLifeSpan", "getLatestRelease", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Newspaper implements IPublication, Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Newspaper> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 1;
    private static int copydefault;

    @SerializedName(Keys.KEY_HEADER_URL)
    private final String avatarUrl;

    @SerializedName("baseUrl")
    private final String baseUrl;

    @SerializedName("featuredImage")
    private final String featuredImage;

    @SerializedName("latestRelease")
    private final List<LatestRelease> latestRelease;

    @SerializedName("lifeSpan")
    private final int lifeSpan;

    @SerializedName("optimizedAttributes")
    private final OptimizedAttributes optimizedAttributes;

    @SerializedName("optimizedStatus")
    private final boolean optimizedStatus;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private final double price;

    @SerializedName("productId")
    private final String productId;

    @SerializedName("productName")
    private final String productName;

    @SerializedName("productPackage")
    private final List<ProductPackage> productPackage;

    @SerializedName("releaseDate")
    private final String releaseDate;

    @SerializedName("releaseId")
    private final String releaseId;

    @SerializedName("releaseName")
    private final String releaseName;

    @SerializedName("releaseStatus")
    private final int releaseStatus;

    @SerializedName("releaseValue")
    private final String releaseValue;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Newspaper> {
        private static int ShareDataUIState = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Newspaper createFromParcel(Parcel parcel) {
            boolean z;
            ArrayList arrayList;
            int i;
            ArrayList arrayList2;
            ArrayList arrayList3;
            String str;
            int i2 = 2 % 2;
            int i3 = copydefault + 111;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            OptimizedAttributes optimizedAttributesCreateFromParcel = OptimizedAttributes.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i5 = ShareDataUIState + 55;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                z = true;
            } else {
                z = false;
            }
            double d2 = parcel.readDouble();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            int i7 = parcel.readInt();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i8 = copydefault + 97;
                ShareDataUIState = i8 % 128;
                if (i8 % 2 == 0) {
                    throw null;
                }
                arrayList = null;
            } else {
                int i9 = parcel.readInt();
                arrayList = new ArrayList(i9);
                int i10 = 0;
                while (i10 != i9) {
                    arrayList.add(ProductPackage.CREATOR.createFromParcel(parcel));
                    i10++;
                    i9 = i9;
                }
            }
            ArrayList arrayList4 = arrayList;
            int i11 = parcel.readInt();
            if (parcel.readInt() == 0) {
                i = i11;
                str = string7;
                arrayList2 = null;
                arrayList3 = arrayList4;
            } else {
                int i12 = parcel.readInt();
                i = i11;
                arrayList2 = new ArrayList(i12);
                arrayList3 = arrayList4;
                int i13 = 0;
                while (i13 != i12) {
                    int i14 = i12;
                    int i15 = ShareDataUIState + 55;
                    String str2 = string7;
                    copydefault = i15 % 128;
                    if (i15 % 2 != 0) {
                        arrayList2.add(LatestRelease.CREATOR.createFromParcel(parcel));
                        i13 += 37;
                    } else {
                        arrayList2.add(LatestRelease.CREATOR.createFromParcel(parcel));
                        i13++;
                    }
                    string7 = str2;
                    i12 = i14;
                }
                str = string7;
            }
            return new Newspaper(string, string2, optimizedAttributesCreateFromParcel, z, d2, string3, string4, string5, string6, i7, str, string8, string9, arrayList3, i, arrayList2);
        }

        @Override
        public Newspaper createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 47;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Newspaper[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 93;
            ShareDataUIState = i3 % 128;
            Newspaper[] newspaperArr = new Newspaper[i];
            if (i3 % 2 != 0) {
                return newspaperArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public Newspaper[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 37;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            Newspaper[] newspaperArrNewArray = newArray(i);
            if (i4 != 0) {
                int i5 = 65 / 0;
            }
            int i6 = copydefault + 19;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 != 0) {
                return newspaperArrNewArray;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public Newspaper(String str, String str2, OptimizedAttributes optimizedAttributes, boolean z, double d2, String str3, String str4, String str5, String str6, int i, String str7, String str8, String str9, List<ProductPackage> list, int i2, List<LatestRelease> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(optimizedAttributes, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.baseUrl = str;
        this.featuredImage = str2;
        this.optimizedAttributes = optimizedAttributes;
        this.optimizedStatus = z;
        this.price = d2;
        this.productId = str3;
        this.releaseDate = str4;
        this.releaseId = str5;
        this.releaseName = str6;
        this.releaseStatus = i;
        this.releaseValue = str7;
        this.productName = str8;
        this.avatarUrl = str9;
        this.productPackage = list;
        this.lifeSpan = i2;
        this.latestRelease = list2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Newspaper(String str, String str2, OptimizedAttributes optimizedAttributes, boolean z, double d2, String str3, String str4, String str5, String str6, int i, String str7, String str8, String str9, List list, int i2, List list2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        List list3;
        List list4;
        Object obj = null;
        if ((i3 & 8192) != 0) {
            int i4 = component2 + 15;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            list3 = null;
        } else {
            list3 = list;
        }
        if ((i3 & 32768) != 0) {
            int i5 = component2 + 79;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            list4 = null;
        } else {
            list4 = list2;
        }
        this(str, str2, optimizedAttributes, z, d2, str3, str4, str5, str6, i, str7, str8, str9, list3, i2, list4);
    }

    public final String getBaseUrl() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 99;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.baseUrl;
        int i4 = i2 + 53;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getFeaturedImage() {
        String str;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 59;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.featuredImage;
            int i4 = 51 / 0;
        } else {
            str = this.featuredImage;
        }
        int i5 = i2 + 101;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 87 / 0;
        }
        return str;
    }

    public final OptimizedAttributes getOptimizedAttributes() {
        int i = 2 % 2;
        int i2 = component2 + 51;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        OptimizedAttributes optimizedAttributes = this.optimizedAttributes;
        if (i3 != 0) {
            int i4 = 90 / 0;
        }
        return optimizedAttributes;
    }

    public final boolean getOptimizedStatus() {
        int i = 2 % 2;
        int i2 = component2 + 85;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        boolean z = this.optimizedStatus;
        int i5 = i3 + 1;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final double getPrice() {
        double d2;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 113;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            d2 = this.price;
            int i4 = 53 / 0;
        } else {
            d2 = this.price;
        }
        int i5 = i2 + 33;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return d2;
    }

    public final String getProductId() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 45;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.productId;
        int i5 = i2 + 115;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getReleaseDate() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 117;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.releaseDate;
        int i4 = i2 + 113;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getReleaseId() {
        int i = 2 % 2;
        int i2 = component2 + 33;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.releaseId;
        }
        throw null;
    }

    public final String getReleaseName() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 17;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.releaseName;
        int i5 = i2 + 71;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getReleaseStatus() {
        int i = 2 % 2;
        int i2 = component2 + 23;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = this.releaseStatus;
        int i6 = i3 + 65;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String getReleaseValue() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 63;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.releaseValue;
        int i5 = i2 + 17;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override
    public String getProductName() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 27;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.productName;
        int i5 = i2 + 105;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override
    public String getAvatarUrl() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 13;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.avatarUrl;
            int i4 = 87 / 0;
        } else {
            str = this.avatarUrl;
        }
        int i5 = i2 + 65;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override
    public List<ProductPackage> getProductPackage() {
        int i = 2 % 2;
        int i2 = component2 + 113;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        List<ProductPackage> list = this.productPackage;
        int i5 = i3 + 1;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    @Override
    public int getLifeSpan() {
        int i = 2 % 2;
        int i2 = component2 + 57;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.lifeSpan;
        if (i3 != 0) {
            int i5 = 93 / 0;
        }
        return i4;
    }

    @Override
    public List<LatestRelease> getLatestRelease() {
        int i = 2 % 2;
        int i2 = component2 + 29;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        List<LatestRelease> list = this.latestRelease;
        int i5 = i3 + 45;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    static {
        int i = ShareDataUIState + 43;
        component1 = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Newspaper copy$default(Newspaper newspaper, String str, String str2, OptimizedAttributes optimizedAttributes, boolean z, double d2, String str3, String str4, String str5, String str6, int i, String str7, String str8, String str9, List list, int i2, List list2, int i3, Object obj) {
        String str10;
        int i4;
        String str11;
        String str12;
        String str13;
        int i5 = 2 % 2;
        String str14 = (i3 & 1) != 0 ? newspaper.baseUrl : str;
        String str15 = (i3 & 2) != 0 ? newspaper.featuredImage : str2;
        OptimizedAttributes optimizedAttributes2 = (i3 & 4) != 0 ? newspaper.optimizedAttributes : optimizedAttributes;
        boolean z2 = (i3 & 8) != 0 ? newspaper.optimizedStatus : z;
        double d3 = (i3 & 16) != 0 ? newspaper.price : d2;
        String str16 = (i3 & 32) != 0 ? newspaper.productId : str3;
        if ((i3 & 64) != 0) {
            int i6 = copydefault + 11;
            component2 = i6 % 128;
            if (i6 % 2 == 0) {
                String str17 = newspaper.releaseDate;
                throw null;
            }
            str10 = newspaper.releaseDate;
        } else {
            str10 = str4;
        }
        String str18 = (i3 & 128) != 0 ? newspaper.releaseId : str5;
        String str19 = (i3 & 256) != 0 ? newspaper.releaseName : str6;
        if ((i3 & 512) != 0) {
            int i7 = copydefault + 89;
            component2 = i7 % 128;
            if (i7 % 2 == 0) {
                i4 = newspaper.releaseStatus;
                int i8 = 84 / 0;
            } else {
                i4 = newspaper.releaseStatus;
            }
        } else {
            i4 = i;
        }
        if ((i3 & 1024) != 0) {
            int i9 = component2 + 89;
            copydefault = i9 % 128;
            int i10 = i9 % 2;
            str11 = newspaper.releaseValue;
        } else {
            str11 = str7;
        }
        if ((i3 & 2048) != 0) {
            int i11 = component2 + 115;
            str12 = str11;
            copydefault = i11 % 128;
            if (i11 % 2 != 0) {
                String str20 = newspaper.productName;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str13 = newspaper.productName;
        } else {
            str12 = str11;
            str13 = str8;
        }
        return newspaper.copy(str14, str15, optimizedAttributes2, z2, d3, str16, str10, str18, str19, i4, str12, str13, (i3 & 4096) != 0 ? newspaper.avatarUrl : str9, (i3 & 8192) != 0 ? newspaper.productPackage : list, (i3 & 16384) != 0 ? newspaper.lifeSpan : i2, (i3 & 32768) != 0 ? newspaper.latestRelease : list2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 13;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.baseUrl;
        int i5 = i3 + 39;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int component10() {
        int i = 2 % 2;
        int i2 = copydefault + 47;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.releaseStatus;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = component2 + 9;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.releaseValue;
        int i5 = i3 + 63;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component12() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 15;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.productName;
        int i5 = i2 + 31;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component13() {
        int i = 2 % 2;
        int i2 = copydefault + 33;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.avatarUrl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<ProductPackage> component14() {
        int i = 2 % 2;
        int i2 = component2 + 3;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.productPackage;
        }
        throw null;
    }

    public final int component15() {
        int i = 2 % 2;
        int i2 = copydefault + 31;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.lifeSpan;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<LatestRelease> component16() {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        List<LatestRelease> list = this.latestRelease;
        int i5 = i3 + 11;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 99;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.featuredImage;
        int i5 = i3 + 71;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final OptimizedAttributes component3() {
        int i = 2 % 2;
        int i2 = copydefault + 21;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        OptimizedAttributes optimizedAttributes = this.optimizedAttributes;
        int i5 = i3 + 9;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return optimizedAttributes;
    }

    public final boolean component4() {
        int i = 2 % 2;
        int i2 = copydefault + 47;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.optimizedStatus;
        int i4 = i3 + 71;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final double component5() {
        int i = 2 % 2;
        int i2 = copydefault + 71;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        double d2 = this.price;
        int i5 = i3 + 77;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return d2;
        }
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = copydefault + 31;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.productId;
        }
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = copydefault + 9;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.releaseDate;
        int i5 = i3 + 75;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = component2 + 33;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.releaseId;
        int i5 = i3 + 1;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 35;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.releaseName;
        int i5 = i2 + 105;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 73 / 0;
        }
        return str;
    }

    public final Newspaper copy(String baseUrl, String featuredImage, OptimizedAttributes optimizedAttributes, boolean optimizedStatus, double price, String productId, String releaseDate, String releaseId, String releaseName, int releaseStatus, String releaseValue, String productName, String avatarUrl, List<ProductPackage> productPackage, int lifeSpan, List<LatestRelease> latestRelease) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(baseUrl, "");
        Intrinsics.checkNotNullParameter(featuredImage, "");
        Intrinsics.checkNotNullParameter(optimizedAttributes, "");
        Intrinsics.checkNotNullParameter(productId, "");
        Intrinsics.checkNotNullParameter(releaseDate, "");
        Intrinsics.checkNotNullParameter(releaseId, "");
        Intrinsics.checkNotNullParameter(releaseName, "");
        Intrinsics.checkNotNullParameter(releaseValue, "");
        Intrinsics.checkNotNullParameter(productName, "");
        Intrinsics.checkNotNullParameter(avatarUrl, "");
        Newspaper newspaper = new Newspaper(baseUrl, featuredImage, optimizedAttributes, optimizedStatus, price, productId, releaseDate, releaseId, releaseName, releaseStatus, releaseValue, productName, avatarUrl, productPackage, lifeSpan, latestRelease);
        int i2 = copydefault + 3;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return newspaper;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 43;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof Newspaper)) {
            return false;
        }
        Newspaper newspaper = (Newspaper) other;
        if (!Intrinsics.areEqual(this.baseUrl, newspaper.baseUrl)) {
            int i2 = component2 + 67;
            copydefault = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.featuredImage, newspaper.featuredImage) || !Intrinsics.areEqual(this.optimizedAttributes, newspaper.optimizedAttributes) || this.optimizedStatus != newspaper.optimizedStatus || Double.compare(this.price, newspaper.price) != 0 || !Intrinsics.areEqual(this.productId, newspaper.productId)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.releaseDate, newspaper.releaseDate)) {
            int i3 = component2 + 89;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(this.releaseId, newspaper.releaseId)) {
            int i4 = component2 + 81;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.releaseName, newspaper.releaseName)) {
            int i6 = copydefault + 59;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.releaseStatus != newspaper.releaseStatus || !Intrinsics.areEqual(this.releaseValue, newspaper.releaseValue) || !Intrinsics.areEqual(this.productName, newspaper.productName) || !Intrinsics.areEqual(this.avatarUrl, newspaper.avatarUrl)) {
            return false;
        }
        if (Intrinsics.areEqual(this.productPackage, newspaper.productPackage)) {
            return this.lifeSpan == newspaper.lifeSpan && Intrinsics.areEqual(this.latestRelease, newspaper.latestRelease);
        }
        int i8 = component2 + 35;
        copydefault = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int iHashCode = this.baseUrl.hashCode();
        int iHashCode2 = this.featuredImage.hashCode();
        int iHashCode3 = this.optimizedAttributes.hashCode();
        int iHashCode4 = Boolean.hashCode(this.optimizedStatus);
        int iHashCode5 = Double.hashCode(this.price);
        int iHashCode6 = this.productId.hashCode();
        int iHashCode7 = this.releaseDate.hashCode();
        int iHashCode8 = this.releaseId.hashCode();
        int iHashCode9 = this.releaseName.hashCode();
        int iHashCode10 = Integer.hashCode(this.releaseStatus);
        int iHashCode11 = this.releaseValue.hashCode();
        int iHashCode12 = this.productName.hashCode();
        int iHashCode13 = this.avatarUrl.hashCode();
        List<ProductPackage> list = this.productPackage;
        int iHashCode14 = 0;
        int iHashCode15 = list == null ? 0 : list.hashCode();
        int iHashCode16 = Integer.hashCode(this.lifeSpan);
        List<LatestRelease> list2 = this.latestRelease;
        if (list2 == null) {
            int i2 = copydefault + 109;
            component2 = i2 % 128;
            int i3 = i2 % 2;
        } else {
            iHashCode14 = list2.hashCode();
            int i4 = component2 + 49;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        }
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode14;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Newspaper(baseUrl=" + this.baseUrl + ", featuredImage=" + this.featuredImage + ", optimizedAttributes=" + this.optimizedAttributes + ", optimizedStatus=" + this.optimizedStatus + ", price=" + this.price + ", productId=" + this.productId + ", releaseDate=" + this.releaseDate + ", releaseId=" + this.releaseId + ", releaseName=" + this.releaseName + ", releaseStatus=" + this.releaseStatus + ", releaseValue=" + this.releaseValue + ", productName=" + this.productName + ", avatarUrl=" + this.avatarUrl + ", productPackage=" + this.productPackage + ", lifeSpan=" + this.lifeSpan + ", latestRelease=" + this.latestRelease + ")";
        int i2 = component2 + 89;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 8 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 69;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.baseUrl);
        dest.writeString(this.featuredImage);
        this.optimizedAttributes.writeToParcel(dest, flags);
        dest.writeInt(this.optimizedStatus ? 1 : 0);
        dest.writeDouble(this.price);
        dest.writeString(this.productId);
        dest.writeString(this.releaseDate);
        dest.writeString(this.releaseId);
        dest.writeString(this.releaseName);
        dest.writeInt(this.releaseStatus);
        dest.writeString(this.releaseValue);
        dest.writeString(this.productName);
        dest.writeString(this.avatarUrl);
        List<ProductPackage> list = this.productPackage;
        if (list == null) {
            dest.writeInt(0);
            int i4 = copydefault + 69;
            component2 = i4 % 128;
            int i5 = i4 % 2;
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<ProductPackage> it = list.iterator();
            while (it.hasNext()) {
                int i6 = copydefault + 111;
                component2 = i6 % 128;
                if (i6 % 2 == 0) {
                    it.next().writeToParcel(dest, flags);
                    throw null;
                }
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeInt(this.lifeSpan);
        List<LatestRelease> list2 = this.latestRelease;
        if (list2 == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list2.size());
        Iterator<LatestRelease> it2 = list2.iterator();
        while (it2.hasNext()) {
            int i7 = component2 + 91;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            it2.next().writeToParcel(dest, flags);
        }
    }
}
