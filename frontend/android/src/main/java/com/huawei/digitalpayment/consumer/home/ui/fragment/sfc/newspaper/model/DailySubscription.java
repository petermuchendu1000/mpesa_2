package com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.newspaper.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b&\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003Jw\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÇ\u0001J\b\u0010.\u001a\u00020\nH\u0007J\u0013\u0010/\u001a\u00020\u00072\b\u00100\u001a\u0004\u0018\u000101H×\u0003J\t\u00102\u001a\u00020\nH×\u0001J\t\u00103\u001a\u00020\u0003H×\u0001J\u0018\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\nH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0016\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014¨\u00069"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/DailySubscription;", "Landroid/os/Parcelable;", "baseUrl", "", "optimizedAttributes", "Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/OptimizedAttributes;", "optimizedStatus", "", FirebaseAnalytics.Param.PRICE, "productId", "", "productName", "productType", "releaseDate", "releaseId", "releaseName", "releaseValue", "<init>", "(Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/OptimizedAttributes;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getBaseUrl", "()Ljava/lang/String;", "getOptimizedAttributes", "()Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/OptimizedAttributes;", "getOptimizedStatus", "()Z", "getPrice", "getProductId", "()I", "getProductName", "getProductType", "getReleaseDate", "getReleaseId", "getReleaseName", "getReleaseValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DailySubscription implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<DailySubscription> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;

    @SerializedName("baseUrl")
    private final String baseUrl;

    @SerializedName("optimizedAttributes")
    private final OptimizedAttributes optimizedAttributes;

    @SerializedName("optimizedStatus")
    private final boolean optimizedStatus;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private final String price;

    @SerializedName("productId")
    private final int productId;

    @SerializedName("productName")
    private final String productName;

    @SerializedName("productType")
    private final String productType;

    @SerializedName("releaseDate")
    private final String releaseDate;

    @SerializedName("releaseId")
    private final int releaseId;

    @SerializedName("releaseName")
    private final String releaseName;

    @SerializedName("releaseValue")
    private final String releaseValue;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DailySubscription> {
        private static int component1 = 1;
        private static int component2;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DailySubscription createFromParcel(Parcel parcel) {
            boolean z;
            int i = 2 % 2;
            int i2 = component2 + 115;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            OptimizedAttributes optimizedAttributesCreateFromParcel = OptimizedAttributes.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i4 = component1;
                int i5 = i4 + 79;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i4 + 109;
                component2 = i7 % 128;
                int i8 = i7 % 2;
                z = true;
            } else {
                z = false;
            }
            return new DailySubscription(string, optimizedAttributesCreateFromParcel, z, parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override
        public DailySubscription createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 81;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            DailySubscription dailySubscriptionCreateFromParcel = createFromParcel(parcel);
            int i4 = component2 + 81;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                return dailySubscriptionCreateFromParcel;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DailySubscription[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2;
            int i4 = i3 + 11;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            DailySubscription[] dailySubscriptionArr = new DailySubscription[i];
            int i6 = i3 + 79;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return dailySubscriptionArr;
        }

        @Override
        public DailySubscription[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 5;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                return newArray(i);
            }
            newArray(i);
            throw null;
        }
    }

    public DailySubscription(String str, OptimizedAttributes optimizedAttributes, boolean z, String str2, int i, String str3, String str4, String str5, int i2, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(optimizedAttributes, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.baseUrl = str;
        this.optimizedAttributes = optimizedAttributes;
        this.optimizedStatus = z;
        this.price = str2;
        this.productId = i;
        this.productName = str3;
        this.productType = str4;
        this.releaseDate = str5;
        this.releaseId = i2;
        this.releaseName = str6;
        this.releaseValue = str7;
    }

    public final String getBaseUrl() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 111;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.baseUrl;
        int i5 = i2 + 111;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final OptimizedAttributes getOptimizedAttributes() {
        int i = 2 % 2;
        int i2 = component3 + 91;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.optimizedAttributes;
        }
        throw null;
    }

    public final boolean getOptimizedStatus() {
        int i = 2 % 2;
        int i2 = component3 + 77;
        int i3 = i2 % 128;
        component2 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        boolean z = this.optimizedStatus;
        int i4 = i3 + 75;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    public final String getPrice() {
        int i = 2 % 2;
        int i2 = component2 + 93;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.price;
        }
        throw null;
    }

    public final int getProductId() {
        int i = 2 % 2;
        int i2 = component3 + 29;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = this.productId;
        int i6 = i3 + 107;
        component3 = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getProductName() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 59;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.productName;
        int i4 = i2 + 21;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getProductType() {
        int i = 2 % 2;
        int i2 = component3 + 13;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.productType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getReleaseDate() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 89;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.releaseDate;
        int i5 = i2 + 3;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final int getReleaseId() {
        int i = 2 % 2;
        int i2 = component2 + 87;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = this.releaseId;
        int i6 = i3 + 113;
        component2 = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getReleaseName() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 21;
        component2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.releaseName;
        int i4 = i2 + 109;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getReleaseValue() {
        int i = 2 % 2;
        int i2 = component3 + 63;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.releaseValue;
        }
        throw null;
    }

    static {
        int i = ShareDataUIState + 19;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public static DailySubscription copy$default(DailySubscription dailySubscription, String str, OptimizedAttributes optimizedAttributes, boolean z, String str2, int i, String str3, String str4, String str5, int i2, String str6, String str7, int i3, Object obj) {
        boolean z2;
        String str8;
        String str9;
        int i4 = 2 % 2;
        String str10 = (i3 & 1) != 0 ? dailySubscription.baseUrl : str;
        OptimizedAttributes optimizedAttributes2 = (i3 & 2) != 0 ? dailySubscription.optimizedAttributes : optimizedAttributes;
        Object obj2 = null;
        if ((i3 & 4) != 0) {
            int i5 = component3 + 5;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                boolean z3 = dailySubscription.optimizedStatus;
                throw null;
            }
            z2 = dailySubscription.optimizedStatus;
        } else {
            z2 = z;
        }
        String str11 = (i3 & 8) != 0 ? dailySubscription.price : str2;
        int i6 = (i3 & 16) != 0 ? dailySubscription.productId : i;
        if ((i3 & 32) != 0) {
            int i7 = component3 + 57;
            component2 = i7 % 128;
            if (i7 % 2 == 0) {
                String str12 = dailySubscription.productName;
                obj2.hashCode();
                throw null;
            }
            str8 = dailySubscription.productName;
        } else {
            str8 = str3;
        }
        String str13 = (i3 & 64) != 0 ? dailySubscription.productType : str4;
        String str14 = (i3 & 128) != 0 ? dailySubscription.releaseDate : str5;
        int i8 = (i3 & 256) != 0 ? dailySubscription.releaseId : i2;
        if ((i3 & 512) != 0) {
            int i9 = component2 + 119;
            component3 = i9 % 128;
            int i10 = i9 % 2;
            str9 = dailySubscription.releaseName;
        } else {
            str9 = str6;
        }
        return dailySubscription.copy(str10, optimizedAttributes2, z2, str11, i6, str8, str13, str14, i8, str9, (i3 & 1024) != 0 ? dailySubscription.releaseValue : str7);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 37;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.baseUrl;
        int i4 = i2 + 7;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 125;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.releaseName;
        int i5 = i2 + 79;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 1 / 0;
        }
        return str;
    }

    public final String component11() {
        String str;
        int i = 2 % 2;
        int i2 = component2 + 37;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            str = this.releaseValue;
            int i4 = 73 / 0;
        } else {
            str = this.releaseValue;
        }
        int i5 = i3 + 123;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final OptimizedAttributes component2() {
        int i = 2 % 2;
        int i2 = component3 + 15;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        OptimizedAttributes optimizedAttributes = this.optimizedAttributes;
        int i5 = i3 + 81;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return optimizedAttributes;
        }
        throw null;
    }

    public final boolean component3() {
        int i = 2 % 2;
        int i2 = component3 + 25;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.optimizedStatus;
        int i4 = i3 + 29;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component3 + 111;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.price;
        int i5 = i3 + 45;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int component5() {
        int i = 2 % 2;
        int i2 = component2 + 105;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.productId;
        }
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 23;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.productName;
        int i5 = i2 + 55;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component3 + 61;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.productType;
        int i5 = i3 + 71;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = component3 + 19;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.releaseDate;
        int i5 = i3 + 63;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int component9() {
        int i = 2 % 2;
        int i2 = component3 + 115;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = this.releaseId;
        int i6 = i3 + 1;
        component3 = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public final DailySubscription copy(String baseUrl, OptimizedAttributes optimizedAttributes, boolean optimizedStatus, String price, int productId, String productName, String productType, String releaseDate, int releaseId, String releaseName, String releaseValue) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(baseUrl, "");
        Intrinsics.checkNotNullParameter(optimizedAttributes, "");
        Intrinsics.checkNotNullParameter(price, "");
        Intrinsics.checkNotNullParameter(productName, "");
        Intrinsics.checkNotNullParameter(productType, "");
        Intrinsics.checkNotNullParameter(releaseDate, "");
        Intrinsics.checkNotNullParameter(releaseName, "");
        Intrinsics.checkNotNullParameter(releaseValue, "");
        DailySubscription dailySubscription = new DailySubscription(baseUrl, optimizedAttributes, optimizedStatus, price, productId, productName, productType, releaseDate, releaseId, releaseName, releaseValue);
        int i2 = component2 + 23;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return dailySubscription;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 9;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 65;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailySubscription)) {
            int i2 = component3 + 119;
            component2 = i2 % 128;
            return i2 % 2 == 0;
        }
        DailySubscription dailySubscription = (DailySubscription) other;
        if (!Intrinsics.areEqual(this.baseUrl, dailySubscription.baseUrl) || !Intrinsics.areEqual(this.optimizedAttributes, dailySubscription.optimizedAttributes) || this.optimizedStatus != dailySubscription.optimizedStatus) {
            return false;
        }
        if (!Intrinsics.areEqual(this.price, dailySubscription.price)) {
            int i3 = component2 + 91;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (this.productId != dailySubscription.productId) {
            int i5 = component3 + 101;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.productName, dailySubscription.productName)) {
            int i7 = component2 + 57;
            component3 = i7 % 128;
            if (i7 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.productType, dailySubscription.productType)) {
            int i8 = component3 + 29;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.releaseDate, dailySubscription.releaseDate)) {
            int i10 = component3 + 61;
            component2 = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (this.releaseId == dailySubscription.releaseId) {
            return Intrinsics.areEqual(this.releaseName, dailySubscription.releaseName) && Intrinsics.areEqual(this.releaseValue, dailySubscription.releaseValue);
        }
        int i12 = component2 + 117;
        component3 = i12 % 128;
        return i12 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 31;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((((((this.baseUrl.hashCode() * 31) + this.optimizedAttributes.hashCode()) * 31) + Boolean.hashCode(this.optimizedStatus)) * 31) + this.price.hashCode()) * 31) + Integer.hashCode(this.productId)) * 31) + this.productName.hashCode()) * 31) + this.productType.hashCode()) * 31) + this.releaseDate.hashCode()) * 31) + Integer.hashCode(this.releaseId)) * 31) + this.releaseName.hashCode()) * 31) + this.releaseValue.hashCode();
        int i4 = component3 + 65;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DailySubscription(baseUrl=" + this.baseUrl + ", optimizedAttributes=" + this.optimizedAttributes + ", optimizedStatus=" + this.optimizedStatus + ", price=" + this.price + ", productId=" + this.productId + ", productName=" + this.productName + ", productType=" + this.productType + ", releaseDate=" + this.releaseDate + ", releaseId=" + this.releaseId + ", releaseName=" + this.releaseName + ", releaseValue=" + this.releaseValue + ")";
        int i2 = component2 + 123;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 55;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.baseUrl);
        this.optimizedAttributes.writeToParcel(dest, flags);
        dest.writeInt(this.optimizedStatus ? 1 : 0);
        dest.writeString(this.price);
        dest.writeInt(this.productId);
        dest.writeString(this.productName);
        dest.writeString(this.productType);
        dest.writeString(this.releaseDate);
        dest.writeInt(this.releaseId);
        dest.writeString(this.releaseName);
        dest.writeString(this.releaseValue);
        int i4 = component2 + 25;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }
}
