package com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\rHÆ\u0003J\t\u0010*\u001a\u00020\rHÆ\u0003J\t\u0010+\u001a\u00020\u0010HÆ\u0003Jm\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÇ\u0001J\b\u0010-\u001a\u00020\u0003H\u0007J\u0013\u0010.\u001a\u00020\u00102\b\u0010/\u001a\u0004\u0018\u000100H×\u0003J\t\u00101\u001a\u00020\u0003H×\u0001J\t\u00102\u001a\u00020\bH×\u0001J\u0018\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0003H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00068"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/model/DaimaProduct;", "Landroid/os/Parcelable;", "validityMonths", "", "priceKES", "", "priceBongaPoints", "description", "", "code", "benefit", "activeStatus", GriverCacheDao.COLUMN_CACHE_ID, "", "daimaOptionID", "new", "", "<init>", "(IDDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZ)V", "getValidityMonths", "()I", "getPriceKES", "()D", "getPriceBongaPoints", "getDescription", "()Ljava/lang/String;", "getCode", "getBenefit", "getActiveStatus", "getId", "()J", "getDaimaOptionID", "getNew", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DaimaProduct implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<DaimaProduct> CREATOR = new Creator();
    private static int component1 = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;

    @SerializedName("activeStatus")
    private final String activeStatus;

    @SerializedName("benefit")
    private final String benefit;

    @SerializedName("code")
    private final String code;

    @SerializedName("daimaOptionID")
    private final long daimaOptionID;

    @SerializedName("description")
    private final String description;

    @SerializedName(GriverCacheDao.COLUMN_CACHE_ID)
    private final long id;

    @SerializedName("new")
    private final boolean new;

    @SerializedName("priceBongaPoints")
    private final double priceBongaPoints;

    @SerializedName("priceKES")
    private final double priceKES;

    @SerializedName("validityMonths")
    private final int validityMonths;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DaimaProduct> {
        private static int component3 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DaimaProduct createFromParcel(Parcel parcel) {
            long j;
            boolean z;
            int i = 2 % 2;
            int i2 = copydefault + 25;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i4 = parcel.readInt();
            double d2 = parcel.readDouble();
            double d3 = parcel.readDouble();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            long j2 = parcel.readLong();
            long j3 = parcel.readLong();
            if (parcel.readInt() != 0) {
                int i5 = component3;
                int i6 = i5 + 109;
                j = j3;
                copydefault = i6 % 128;
                boolean z2 = i6 % 2 == 0;
                int i7 = i5 + 55;
                copydefault = i7 % 128;
                int i8 = i7 % 2;
                z = z2;
            } else {
                j = j3;
                int i9 = component3 + 113;
                copydefault = i9 % 128;
                int i10 = i9 % 2;
                z = false;
            }
            return new DaimaProduct(i4, d2, d3, string, string2, string3, string4, j2, j, z);
        }

        @Override
        public DaimaProduct createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 25;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            DaimaProduct daimaProductCreateFromParcel = createFromParcel(parcel);
            int i4 = copydefault + 39;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return daimaProductCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DaimaProduct[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 45;
            int i4 = i3 % 128;
            copydefault = i4;
            int i5 = i3 % 2;
            DaimaProduct[] daimaProductArr = new DaimaProduct[i];
            int i6 = i4 + 65;
            component3 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 44 / 0;
            }
            return daimaProductArr;
        }

        @Override
        public DaimaProduct[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 45;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                newArray(i);
                throw null;
            }
            DaimaProduct[] daimaProductArrNewArray = newArray(i);
            int i4 = copydefault + 71;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return daimaProductArrNewArray;
        }
    }

    public DaimaProduct(int i, double d2, double d3, String str, String str2, String str3, String str4, long j, long j2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.validityMonths = i;
        this.priceKES = d2;
        this.priceBongaPoints = d3;
        this.description = str;
        this.code = str2;
        this.benefit = str3;
        this.activeStatus = str4;
        this.id = j;
        this.daimaOptionID = j2;
        this.new = z;
    }

    public final int getValidityMonths() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 15;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.validityMonths;
        int i6 = i2 + 5;
        component3 = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public final double getPriceKES() {
        int i = 2 % 2;
        int i2 = component2 + 19;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.priceKES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final double getPriceBongaPoints() {
        int i = 2 % 2;
        int i2 = component3 + 97;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.priceBongaPoints;
        }
        throw null;
    }

    public final String getDescription() {
        int i = 2 % 2;
        int i2 = component3 + 11;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.description;
        if (i3 == 0) {
            int i4 = 19 / 0;
        }
        return str;
    }

    public final String getCode() {
        int i = 2 % 2;
        int i2 = component3 + 113;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.code;
        }
        throw null;
    }

    public final String getBenefit() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 97;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.benefit;
        int i5 = i2 + 57;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 39 / 0;
        }
        return str;
    }

    public final String getActiveStatus() {
        int i = 2 % 2;
        int i2 = component3 + 93;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.activeStatus;
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        return str;
    }

    public final long getId() {
        int i = 2 % 2;
        int i2 = component2 + 7;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        long j = this.id;
        int i5 = i3 + 9;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long getDaimaOptionID() {
        int i = 2 % 2;
        int i2 = component2 + 9;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        long j = this.daimaOptionID;
        int i5 = i3 + 5;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final boolean getNew() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 125;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z = this.new;
        int i4 = i2 + 23;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    static {
        int i = component1 + 45;
        copydefault = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static DaimaProduct copy$default(DaimaProduct daimaProduct, int i, double d2, double d3, String str, String str2, String str3, String str4, long j, long j2, boolean z, int i2, Object obj) {
        double d4;
        String str5;
        String str6;
        String str7;
        long j3;
        long j4;
        long j5;
        int i3 = 2 % 2;
        int i4 = (i2 & 1) != 0 ? daimaProduct.validityMonths : i;
        if ((i2 & 2) != 0) {
            int i5 = component3 + 115;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                d4 = daimaProduct.priceKES;
                int i6 = 95 / 0;
            } else {
                d4 = daimaProduct.priceKES;
            }
        } else {
            d4 = d2;
        }
        double d5 = (i2 & 4) != 0 ? daimaProduct.priceBongaPoints : d3;
        if ((i2 & 8) != 0) {
            str5 = daimaProduct.description;
            int i7 = component3 + 31;
            component2 = i7 % 128;
            int i8 = i7 % 2;
        } else {
            str5 = str;
        }
        String str8 = (i2 & 16) != 0 ? daimaProduct.code : str2;
        if ((i2 & 32) != 0) {
            str6 = daimaProduct.benefit;
            int i9 = component2 + 49;
            component3 = i9 % 128;
            int i10 = i9 % 2;
        } else {
            str6 = str3;
        }
        if ((i2 & 64) != 0) {
            int i11 = component2 + 9;
            component3 = i11 % 128;
            if (i11 % 2 != 0) {
                String str9 = daimaProduct.activeStatus;
                throw null;
            }
            str7 = daimaProduct.activeStatus;
        } else {
            str7 = str4;
        }
        if ((i2 & 128) != 0) {
            int i12 = component2 + 65;
            component3 = i12 % 128;
            int i13 = i12 % 2;
            j3 = daimaProduct.id;
        } else {
            j3 = j;
        }
        if ((i2 & 256) != 0) {
            int i14 = component2 + 107;
            component3 = i14 % 128;
            if (i14 % 2 != 0) {
                long j6 = daimaProduct.daimaOptionID;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            j4 = j3;
            j5 = daimaProduct.daimaOptionID;
        } else {
            j4 = j3;
            j5 = j2;
        }
        return daimaProduct.copy(i4, d4, d5, str5, str8, str6, str7, j4, j5, (i2 & 512) != 0 ? daimaProduct.new : z);
    }

    public final int component1() {
        int i = 2 % 2;
        int i2 = component2 + 3;
        int i3 = i2 % 128;
        component3 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = this.validityMonths;
        int i5 = i3 + 1;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    public final boolean component10() {
        int i = 2 % 2;
        int i2 = component3 + 95;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        boolean z = this.new;
        int i5 = i3 + 103;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final double component2() {
        int i = 2 % 2;
        int i2 = component2 + 93;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        double d2 = this.priceKES;
        int i5 = i3 + 117;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return d2;
    }

    public final double component3() {
        int i = 2 % 2;
        int i2 = component3 + 37;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.priceBongaPoints;
        }
        int i3 = 34 / 0;
        return this.priceBongaPoints;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 5;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.description;
        int i4 = i2 + 45;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component3 + 63;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.code;
        int i4 = i3 + 31;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 27 / 0;
        }
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component2 + 59;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.benefit;
        int i5 = i3 + 5;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 9;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.activeStatus;
        int i5 = i2 + 89;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final long component8() {
        int i = 2 % 2;
        int i2 = component2 + 89;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        long j = this.id;
        if (i4 != 0) {
            int i5 = 63 / 0;
        }
        int i6 = i3 + 115;
        component2 = i6 % 128;
        if (i6 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final long component9() {
        int i = 2 % 2;
        int i2 = component2 + 31;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        long j = this.daimaOptionID;
        int i5 = i3 + 41;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final DaimaProduct copy(int validityMonths, double priceKES, double priceBongaPoints, String description, String code, String benefit, String activeStatus, long id, long daimaOptionID, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(description, "");
        Intrinsics.checkNotNullParameter(code, "");
        Intrinsics.checkNotNullParameter(benefit, "");
        Intrinsics.checkNotNullParameter(activeStatus, "");
        DaimaProduct daimaProduct = new DaimaProduct(validityMonths, priceKES, priceBongaPoints, description, code, benefit, activeStatus, id, daimaOptionID, z);
        int i2 = component2 + 115;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return daimaProduct;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 35;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 25;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof DaimaProduct)) {
            return false;
        }
        DaimaProduct daimaProduct = (DaimaProduct) other;
        if (this.validityMonths != daimaProduct.validityMonths) {
            int i2 = component3 + 61;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (Double.compare(this.priceKES, daimaProduct.priceKES) != 0) {
            int i3 = component2 + 75;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (Double.compare(this.priceBongaPoints, daimaProduct.priceBongaPoints) != 0 || !Intrinsics.areEqual(this.description, daimaProduct.description) || !Intrinsics.areEqual(this.code, daimaProduct.code) || !Intrinsics.areEqual(this.benefit, daimaProduct.benefit)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.activeStatus, daimaProduct.activeStatus)) {
            int i5 = component2 + 13;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (this.id != daimaProduct.id) {
            return false;
        }
        if (this.daimaOptionID == daimaProduct.daimaOptionID) {
            return this.new == daimaProduct.new;
        }
        int i7 = component2 + 57;
        component3 = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 55;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((((Integer.hashCode(this.validityMonths) * 31) + Double.hashCode(this.priceKES)) * 31) + Double.hashCode(this.priceBongaPoints)) * 31) + this.description.hashCode()) * 31) + this.code.hashCode()) * 31) + this.benefit.hashCode()) * 31) + this.activeStatus.hashCode()) * 31) + Long.hashCode(this.id)) * 31) + Long.hashCode(this.daimaOptionID)) * 31) + Boolean.hashCode(this.new);
        int i4 = component3 + 121;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DaimaProduct(validityMonths=" + this.validityMonths + ", priceKES=" + this.priceKES + ", priceBongaPoints=" + this.priceBongaPoints + ", description=" + this.description + ", code=" + this.code + ", benefit=" + this.benefit + ", activeStatus=" + this.activeStatus + ", id=" + this.id + ", daimaOptionID=" + this.daimaOptionID + ", new=" + this.new + ")";
        int i2 = component3 + 89;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 89;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeInt(this.validityMonths);
        dest.writeDouble(this.priceKES);
        dest.writeDouble(this.priceBongaPoints);
        dest.writeString(this.description);
        dest.writeString(this.code);
        dest.writeString(this.benefit);
        dest.writeString(this.activeStatus);
        dest.writeLong(this.id);
        dest.writeLong(this.daimaOptionID);
        dest.writeInt(this.new ? 1 : 0);
        int i4 = component3 + 125;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }
}
