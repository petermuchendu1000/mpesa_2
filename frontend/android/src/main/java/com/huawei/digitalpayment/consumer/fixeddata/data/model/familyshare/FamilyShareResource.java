package com.huawei.digitalpayment.consumer.fixeddata.data.model.familyshare;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0086\u0001\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\tHÇ\u0001¢\u0006\u0002\u0010(J\b\u0010)\u001a\u00020*H\u0007J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H×\u0003J\t\u0010/\u001a\u00020*H×\u0001J\t\u00100\u001a\u00020\u0003H×\u0001J\u0018\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020*H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u001a\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001c\u0010\u0017¨\u00066"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/familyshare/FamilyShareResource;", "Landroid/os/Parcelable;", "relationKey", "", "resourceType", "shareLimitMB", "measureUnit", "limitCycleType", "usageAmountMB", "", "startTime", "endTime", "shareLimitMinutes", "usageAmountMinutes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "getRelationKey", "()Ljava/lang/String;", "getResourceType", "getShareLimitMB", "getMeasureUnit", "getLimitCycleType", "getUsageAmountMB", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getStartTime", "getEndTime", "getShareLimitMinutes", "getUsageAmountMinutes", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/familyshare/FamilyShareResource;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FamilyShareResource implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<FamilyShareResource> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName("endTime")
    private final String endTime;

    @SerializedName("limitCycleType")
    private final String limitCycleType;

    @SerializedName("measureUnit")
    private final String measureUnit;

    @SerializedName("relationKey")
    private final String relationKey;

    @SerializedName("resourceType")
    private final String resourceType;

    @SerializedName("shareLimitMB")
    private final String shareLimitMB;

    @SerializedName("shareLimitMinutes")
    private final String shareLimitMinutes;

    @SerializedName("startTime")
    private final String startTime;

    @SerializedName("usageAmountMB")
    private final Double usageAmountMB;

    @SerializedName("usageAmountMinutes")
    private final Double usageAmountMinutes;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FamilyShareResource> {
        private static int ShareDataUIState = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FamilyShareResource createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 47;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Double dValueOf = null;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i3 != 0) {
                parcel.readString();
                parcel.readString();
                parcel.readString();
                parcel.readString();
                parcel.readString();
                parcel.readInt();
                throw null;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i4 = copydefault + 97;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0) {
                    dValueOf.hashCode();
                    throw null;
                }
            } else {
                dValueOf = Double.valueOf(parcel.readDouble());
            }
            return new FamilyShareResource(string, string2, string3, string4, string5, dValueOf2, string6, string7, string8, dValueOf);
        }

        @Override
        public FamilyShareResource createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 9;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            FamilyShareResource familyShareResourceCreateFromParcel = createFromParcel(parcel);
            int i4 = ShareDataUIState + 73;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return familyShareResourceCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FamilyShareResource[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 61;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            FamilyShareResource[] familyShareResourceArr = new FamilyShareResource[i];
            if (i3 % 2 == 0) {
                throw null;
            }
            int i5 = i4 + 41;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return familyShareResourceArr;
        }

        @Override
        public FamilyShareResource[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 49;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            FamilyShareResource[] familyShareResourceArrNewArray = newArray(i);
            int i5 = copydefault + 45;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return familyShareResourceArrNewArray;
        }
    }

    public FamilyShareResource(String str, String str2, String str3, String str4, String str5, Double d2, String str6, String str7, String str8, Double d3) {
        this.relationKey = str;
        this.resourceType = str2;
        this.shareLimitMB = str3;
        this.measureUnit = str4;
        this.limitCycleType = str5;
        this.usageAmountMB = d2;
        this.startTime = str6;
        this.endTime = str7;
        this.shareLimitMinutes = str8;
        this.usageAmountMinutes = d3;
    }

    public final String getRelationKey() {
        int i = 2 % 2;
        int i2 = copydefault + 9;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.relationKey;
        int i5 = i3 + 29;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getResourceType() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 23;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.resourceType;
        }
        throw null;
    }

    public final String getShareLimitMB() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 113;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.shareLimitMB;
        int i5 = i2 + 23;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getMeasureUnit() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 91;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.measureUnit;
        int i5 = i3 + 125;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getLimitCycleType() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 1;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.limitCycleType;
        int i5 = i2 + 15;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Double getUsageAmountMB() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 79;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Double d2 = this.usageAmountMB;
        int i5 = i3 + 49;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return d2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getStartTime() {
        int i = 2 % 2;
        int i2 = copydefault + 73;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.startTime;
        int i4 = i3 + 97;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 59 / 0;
        }
        return str;
    }

    public final String getEndTime() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 1;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.endTime;
        }
        throw null;
    }

    public final String getShareLimitMinutes() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 117;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.shareLimitMinutes;
        int i5 = i2 + 93;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 76 / 0;
        }
        return str;
    }

    public final Double getUsageAmountMinutes() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 103;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        Double d2 = this.usageAmountMinutes;
        int i5 = i2 + 75;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return d2;
    }

    static {
        int i = component3 + 27;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static FamilyShareResource copy$default(FamilyShareResource familyShareResource, String str, String str2, String str3, String str4, String str5, Double d2, String str6, String str7, String str8, Double d3, int i, Object obj) {
        String str9;
        String str10;
        Double d4;
        String str11;
        String str12;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = copydefault + 93;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                str9 = familyShareResource.relationKey;
                int i4 = 77 / 0;
            } else {
                str9 = familyShareResource.relationKey;
            }
        } else {
            str9 = str;
        }
        String str13 = (i & 2) != 0 ? familyShareResource.resourceType : str2;
        String str14 = (i & 4) != 0 ? familyShareResource.shareLimitMB : str3;
        Object obj2 = null;
        if ((i & 8) != 0) {
            int i5 = copydefault + 79;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                String str15 = familyShareResource.measureUnit;
                throw null;
            }
            str10 = familyShareResource.measureUnit;
        } else {
            str10 = str4;
        }
        String str16 = (i & 16) != 0 ? familyShareResource.limitCycleType : str5;
        if ((i & 32) != 0) {
            d4 = familyShareResource.usageAmountMB;
            int i6 = ShareDataUIState + 61;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
        } else {
            d4 = d2;
        }
        if ((i & 64) != 0) {
            int i8 = copydefault + 33;
            ShareDataUIState = i8 % 128;
            int i9 = i8 % 2;
            str11 = familyShareResource.startTime;
        } else {
            str11 = str6;
        }
        String str17 = (i & 128) != 0 ? familyShareResource.endTime : str7;
        if ((i & 256) != 0) {
            int i10 = ShareDataUIState + 107;
            copydefault = i10 % 128;
            if (i10 % 2 != 0) {
                String str18 = familyShareResource.shareLimitMinutes;
                obj2.hashCode();
                throw null;
            }
            str12 = familyShareResource.shareLimitMinutes;
        } else {
            str12 = str8;
        }
        FamilyShareResource familyShareResourceCopy = familyShareResource.copy(str9, str13, str14, str10, str16, d4, str11, str17, str12, (i & 512) != 0 ? familyShareResource.usageAmountMinutes : d3);
        int i11 = ShareDataUIState + 73;
        copydefault = i11 % 128;
        int i12 = i11 % 2;
        return familyShareResourceCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.relationKey;
        }
        throw null;
    }

    public final Double component10() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 43;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Double d2 = this.usageAmountMinutes;
        int i5 = i2 + 45;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return d2;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 61;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.resourceType;
        int i4 = i2 + 81;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 71 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault + 113;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.shareLimitMB;
        int i5 = i3 + 47;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 30 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 17;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.measureUnit;
        int i5 = i3 + 81;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.limitCycleType;
        }
        throw null;
    }

    public final Double component6() {
        int i = 2 % 2;
        int i2 = copydefault + 125;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Double d2 = this.usageAmountMB;
        if (i3 == 0) {
            int i4 = 36 / 0;
        }
        return d2;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.startTime;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = copydefault + 105;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.endTime;
        if (i3 == 0) {
            int i4 = 93 / 0;
        }
        return str;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 59;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.shareLimitMinutes;
        int i5 = i2 + 27;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final FamilyShareResource copy(String relationKey, String resourceType, String shareLimitMB, String measureUnit, String limitCycleType, Double usageAmountMB, String startTime, String endTime, String shareLimitMinutes, Double usageAmountMinutes) {
        int i = 2 % 2;
        FamilyShareResource familyShareResource = new FamilyShareResource(relationKey, resourceType, shareLimitMB, measureUnit, limitCycleType, usageAmountMB, startTime, endTime, shareLimitMinutes, usageAmountMinutes);
        int i2 = copydefault + 5;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 11 / 0;
        }
        return familyShareResource;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 105;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 23;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof FamilyShareResource)) {
            int i2 = ShareDataUIState + 71;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        FamilyShareResource familyShareResource = (FamilyShareResource) other;
        if (!(!Intrinsics.areEqual(this.relationKey, familyShareResource.relationKey))) {
            if (!Intrinsics.areEqual(this.resourceType, familyShareResource.resourceType)) {
                int i4 = copydefault + 45;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if ((!Intrinsics.areEqual(this.shareLimitMB, familyShareResource.shareLimitMB)) || !Intrinsics.areEqual(this.measureUnit, familyShareResource.measureUnit)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.limitCycleType, familyShareResource.limitCycleType)) {
                int i6 = copydefault + 29;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (!Intrinsics.areEqual((Object) this.usageAmountMB, (Object) familyShareResource.usageAmountMB) || !Intrinsics.areEqual(this.startTime, familyShareResource.startTime)) {
                return false;
            }
            if (!(!Intrinsics.areEqual(this.endTime, familyShareResource.endTime))) {
                if (!Intrinsics.areEqual(this.shareLimitMinutes, familyShareResource.shareLimitMinutes)) {
                    return false;
                }
                if (Intrinsics.areEqual((Object) this.usageAmountMinutes, (Object) familyShareResource.usageAmountMinutes)) {
                    return true;
                }
                int i8 = copydefault + 101;
                ShareDataUIState = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            int i10 = ShareDataUIState + 105;
            copydefault = i10 % 128;
            if (i10 % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        String str = this.relationKey;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.resourceType;
        if (str2 == null) {
            int i2 = ShareDataUIState + 53;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.shareLimitMB;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.measureUnit;
        if (str4 == null) {
            int i4 = copydefault + 59;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str4.hashCode();
            int i6 = ShareDataUIState + 73;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
        }
        String str5 = this.limitCycleType;
        if (str5 == null) {
            int i8 = copydefault + 43;
            int i9 = i8 % 128;
            ShareDataUIState = i9;
            int i10 = i8 % 2;
            int i11 = i9 + 41;
            copydefault = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 4 / 2;
            }
            iHashCode3 = 0;
        } else {
            iHashCode3 = str5.hashCode();
        }
        Double d2 = this.usageAmountMB;
        int iHashCode6 = d2 == null ? 0 : d2.hashCode();
        String str6 = this.startTime;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.endTime;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.shareLimitMinutes;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        Double d3 = this.usageAmountMinutes;
        return (((((((((((((((((iHashCode4 * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (d3 != null ? d3.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FamilyShareResource(relationKey=" + this.relationKey + ", resourceType=" + this.resourceType + ", shareLimitMB=" + this.shareLimitMB + ", measureUnit=" + this.measureUnit + ", limitCycleType=" + this.limitCycleType + ", usageAmountMB=" + this.usageAmountMB + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", shareLimitMinutes=" + this.shareLimitMinutes + ", usageAmountMinutes=" + this.usageAmountMinutes + ")";
        int i2 = ShareDataUIState + 43;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.relationKey);
        dest.writeString(this.resourceType);
        dest.writeString(this.shareLimitMB);
        dest.writeString(this.measureUnit);
        dest.writeString(this.limitCycleType);
        Double d2 = this.usageAmountMB;
        if (d2 == null) {
            int i2 = ShareDataUIState + 125;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d2.doubleValue());
        }
        dest.writeString(this.startTime);
        dest.writeString(this.endTime);
        dest.writeString(this.shareLimitMinutes);
        Double d3 = this.usageAmountMinutes;
        if (d3 == null) {
            int i4 = ShareDataUIState + 59;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d3.doubleValue());
        }
        int i6 = ShareDataUIState + 111;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
    }
}
