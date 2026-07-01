package com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.newspaper.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.constants.Keys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u000eHÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003Jw\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÇ\u0001J\b\u0010.\u001a\u00020\u000eH\u0007J\u0013\u0010/\u001a\u00020\u00062\b\u00100\u001a\u0004\u0018\u000101H×\u0003J\t\u00102\u001a\u00020\u000eH×\u0001J\t\u00103\u001a\u00020\u0003H×\u0001J\u0018\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u000eH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014¨\u00069"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/LatestRelease;", "Landroid/os/Parcelable;", Keys.KEY_HEADER_URL, "", "baseUrl", "customerSubscribed", "", "optimizedStatus", FirebaseAnalytics.Param.PRICE, "", "productId", "productName", "releaseDate", "releaseId", "", "releaseName", "releaseValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getAvatarUrl", "()Ljava/lang/String;", "getBaseUrl", "getCustomerSubscribed", "()Z", "getOptimizedStatus", "getPrice", "()D", "getProductId", "getProductName", "getReleaseDate", "getReleaseId", "()I", "getReleaseName", "getReleaseValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LatestRelease implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<LatestRelease> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 1;
    private static int component3;

    @SerializedName(Keys.KEY_HEADER_URL)
    private final String avatarUrl;

    @SerializedName("baseUrl")
    private final String baseUrl;

    @SerializedName("customerSubscribed")
    private final boolean customerSubscribed;

    @SerializedName("optimizedStatus")
    private final boolean optimizedStatus;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private final double price;

    @SerializedName("productId")
    private final String productId;

    @SerializedName("productName")
    private final String productName;

    @SerializedName("releaseDate")
    private final String releaseDate;

    @SerializedName("releaseId")
    private final int releaseId;

    @SerializedName("releaseName")
    private final String releaseName;

    @SerializedName("releaseValue")
    private final String releaseValue;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LatestRelease> {
        private static int component3 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final LatestRelease createFromParcel(Parcel parcel) {
            boolean z;
            int i = 2 % 2;
            int i2 = copydefault + 117;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                int i4 = copydefault + 7;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                z = false;
            }
            if (parcel.readInt() != 0) {
                int i6 = component3 + 61;
                copydefault = i6 % 128;
                if (i6 % 2 == 0) {
                    z2 = true;
                }
            }
            return new LatestRelease(string, string2, z, z2, parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override
        public LatestRelease createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 125;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            LatestRelease latestReleaseCreateFromParcel = createFromParcel(parcel);
            int i4 = copydefault + 47;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                return latestReleaseCreateFromParcel;
            }
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final LatestRelease[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 11;
            component3 = i3 % 128;
            LatestRelease[] latestReleaseArr = new LatestRelease[i];
            if (i3 % 2 != 0) {
                return latestReleaseArr;
            }
            throw null;
        }

        @Override
        public LatestRelease[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 117;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            LatestRelease[] latestReleaseArrNewArray = newArray(i);
            int i5 = component3 + 3;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 56 / 0;
            }
            return latestReleaseArrNewArray;
        }
    }

    public LatestRelease(String str, String str2, boolean z, boolean z2, double d2, String str3, String str4, String str5, int i, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.avatarUrl = str;
        this.baseUrl = str2;
        this.customerSubscribed = z;
        this.optimizedStatus = z2;
        this.price = d2;
        this.productId = str3;
        this.productName = str4;
        this.releaseDate = str5;
        this.releaseId = i;
        this.releaseName = str6;
        this.releaseValue = str7;
    }

    public final String getAvatarUrl() {
        int i = 2 % 2;
        int i2 = component2 + 41;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.avatarUrl;
        int i4 = i3 + 47;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getBaseUrl() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 31;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.baseUrl;
        int i5 = i2 + 43;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean getCustomerSubscribed() {
        int i = 2 % 2;
        int i2 = component2 + 21;
        int i3 = i2 % 128;
        component3 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        boolean z = this.customerSubscribed;
        int i4 = i3 + 77;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean getOptimizedStatus() {
        boolean z;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 7;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            z = this.optimizedStatus;
            int i4 = 11 / 0;
        } else {
            z = this.optimizedStatus;
        }
        int i5 = i2 + 81;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 98 / 0;
        }
        return z;
    }

    public final double getPrice() {
        int i = 2 % 2;
        int i2 = component2 + 95;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.price;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getProductId() {
        int i = 2 % 2;
        int i2 = component3 + 81;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.productId;
        int i5 = i3 + 107;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getProductName() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 9;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.productName;
        int i5 = i2 + 37;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 19 / 0;
        }
        return str;
    }

    public final String getReleaseDate() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 125;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.releaseDate;
        int i4 = i2 + 75;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
        return str;
    }

    public final int getReleaseId() {
        int i;
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 89;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            i = this.releaseId;
            int i5 = 52 / 0;
        } else {
            i = this.releaseId;
        }
        int i6 = i3 + 7;
        component2 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 15 / 0;
        }
        return i;
    }

    public final String getReleaseName() {
        int i = 2 % 2;
        int i2 = component2 + 61;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.releaseName;
        int i5 = i3 + 1;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 1 / 0;
        }
        return str;
    }

    public final String getReleaseValue() {
        int i = 2 % 2;
        int i2 = component3 + 111;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.releaseValue;
        if (i3 == 0) {
            int i4 = 5 / 0;
        }
        return str;
    }

    static {
        int i = ShareDataUIState + 123;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static LatestRelease copy$default(LatestRelease latestRelease, String str, String str2, boolean z, boolean z2, double d2, String str3, String str4, String str5, int i, String str6, String str7, int i2, Object obj) {
        String str8;
        String str9;
        boolean z3;
        String str10;
        String str11;
        String str12;
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = component2 + 47;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            str8 = latestRelease.avatarUrl;
        } else {
            str8 = str;
        }
        Object obj2 = null;
        if ((i2 & 2) != 0) {
            int i6 = component3 + 91;
            component2 = i6 % 128;
            if (i6 % 2 == 0) {
                String str13 = latestRelease.baseUrl;
                obj2.hashCode();
                throw null;
            }
            str9 = latestRelease.baseUrl;
        } else {
            str9 = str2;
        }
        if ((i2 & 4) != 0) {
            int i7 = component2 + 9;
            component3 = i7 % 128;
            if (i7 % 2 != 0) {
                boolean z4 = latestRelease.customerSubscribed;
                throw null;
            }
            z3 = latestRelease.customerSubscribed;
        } else {
            z3 = z;
        }
        boolean z5 = (i2 & 8) != 0 ? latestRelease.optimizedStatus : z2;
        double d3 = (i2 & 16) != 0 ? latestRelease.price : d2;
        if ((i2 & 32) != 0) {
            str10 = latestRelease.productId;
            int i8 = component2 + 33;
            component3 = i8 % 128;
            int i9 = i8 % 2;
        } else {
            str10 = str3;
        }
        String str14 = (i2 & 64) != 0 ? latestRelease.productName : str4;
        if ((i2 & 128) != 0) {
            int i10 = component3 + 89;
            component2 = i10 % 128;
            if (i10 % 2 == 0) {
                str11 = latestRelease.releaseDate;
                int i11 = 99 / 0;
            } else {
                str11 = latestRelease.releaseDate;
            }
        } else {
            str11 = str5;
        }
        int i12 = (i2 & 256) != 0 ? latestRelease.releaseId : i;
        String str15 = (i2 & 512) != 0 ? latestRelease.releaseName : str6;
        if ((i2 & 1024) != 0) {
            int i13 = component3 + 103;
            component2 = i13 % 128;
            if (i13 % 2 == 0) {
                str12 = latestRelease.releaseValue;
                int i14 = 43 / 0;
            } else {
                str12 = latestRelease.releaseValue;
            }
        } else {
            str12 = str7;
        }
        return latestRelease.copy(str8, str9, z3, z5, d3, str10, str14, str11, i12, str15, str12);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 5;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.avatarUrl;
        int i4 = i2 + 29;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 57 / 0;
        }
        return str;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = component2 + 47;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.releaseName;
        int i5 = i3 + 101;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 59 / 0;
        }
        return str;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 27;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.releaseValue;
        int i5 = i2 + 27;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 74 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3 + 17;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.baseUrl;
        int i5 = i3 + 47;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean component3() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 65;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.customerSubscribed;
        int i5 = i2 + 89;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean component4() {
        int i = 2 % 2;
        int i2 = component3 + 21;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.optimizedStatus;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final double component5() {
        int i = 2 % 2;
        int i2 = component3 + 37;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.price;
        }
        int i3 = 41 / 0;
        return this.price;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 1;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.productId;
        int i4 = i2 + 51;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 81;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.productName;
        int i4 = i2 + 21;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 17;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.releaseDate;
        int i5 = i2 + 73;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 37 / 0;
        }
        return str;
    }

    public final int component9() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 15;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.releaseId;
        int i6 = i2 + 15;
        component3 = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public final LatestRelease copy(String avatarUrl, String baseUrl, boolean customerSubscribed, boolean optimizedStatus, double price, String productId, String productName, String releaseDate, int releaseId, String releaseName, String releaseValue) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(avatarUrl, "");
        Intrinsics.checkNotNullParameter(baseUrl, "");
        Intrinsics.checkNotNullParameter(productId, "");
        Intrinsics.checkNotNullParameter(productName, "");
        Intrinsics.checkNotNullParameter(releaseDate, "");
        Intrinsics.checkNotNullParameter(releaseName, "");
        Intrinsics.checkNotNullParameter(releaseValue, "");
        LatestRelease latestRelease = new LatestRelease(avatarUrl, baseUrl, customerSubscribed, optimizedStatus, price, productId, productName, releaseDate, releaseId, releaseName, releaseValue);
        int i2 = component3 + 61;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return latestRelease;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 51;
        component3 = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2 + 69;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 41;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 35 / 0;
            }
            return true;
        }
        if (!(other instanceof LatestRelease)) {
            int i7 = i3 + 105;
            int i8 = i7 % 128;
            component2 = i8;
            int i9 = i7 % 2;
            int i10 = i8 + 67;
            component3 = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        LatestRelease latestRelease = (LatestRelease) other;
        if (!Intrinsics.areEqual(this.avatarUrl, latestRelease.avatarUrl) || (!Intrinsics.areEqual(this.baseUrl, latestRelease.baseUrl)) || this.customerSubscribed != latestRelease.customerSubscribed || this.optimizedStatus != latestRelease.optimizedStatus || Double.compare(this.price, latestRelease.price) != 0 || !Intrinsics.areEqual(this.productId, latestRelease.productId) || !Intrinsics.areEqual(this.productName, latestRelease.productName)) {
            return false;
        }
        if (Intrinsics.areEqual(this.releaseDate, latestRelease.releaseDate)) {
            return this.releaseId == latestRelease.releaseId && Intrinsics.areEqual(this.releaseName, latestRelease.releaseName) && Intrinsics.areEqual(this.releaseValue, latestRelease.releaseValue);
        }
        int i12 = component3 + 79;
        component2 = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 35;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((((((this.avatarUrl.hashCode() * 31) + this.baseUrl.hashCode()) * 31) + Boolean.hashCode(this.customerSubscribed)) * 31) + Boolean.hashCode(this.optimizedStatus)) * 31) + Double.hashCode(this.price)) * 31) + this.productId.hashCode()) * 31) + this.productName.hashCode()) * 31) + this.releaseDate.hashCode()) * 31) + Integer.hashCode(this.releaseId)) * 31) + this.releaseName.hashCode()) * 31) + this.releaseValue.hashCode();
        int i4 = component3 + 55;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LatestRelease(avatarUrl=" + this.avatarUrl + ", baseUrl=" + this.baseUrl + ", customerSubscribed=" + this.customerSubscribed + ", optimizedStatus=" + this.optimizedStatus + ", price=" + this.price + ", productId=" + this.productId + ", productName=" + this.productName + ", releaseDate=" + this.releaseDate + ", releaseId=" + this.releaseId + ", releaseName=" + this.releaseName + ", releaseValue=" + this.releaseValue + ")";
        int i2 = component3 + 85;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 23;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.avatarUrl);
        dest.writeString(this.baseUrl);
        dest.writeInt(this.customerSubscribed ? 1 : 0);
        dest.writeInt(this.optimizedStatus ? 1 : 0);
        dest.writeDouble(this.price);
        dest.writeString(this.productId);
        dest.writeString(this.productName);
        dest.writeString(this.releaseDate);
        dest.writeInt(this.releaseId);
        dest.writeString(this.releaseName);
        dest.writeString(this.releaseValue);
        int i4 = component2 + 85;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }
}
