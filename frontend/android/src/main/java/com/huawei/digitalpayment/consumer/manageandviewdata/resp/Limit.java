package com.huawei.digitalpayment.consumer.manageandviewdata.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jc\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010#\u001a\u00020$H\u0007J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H×\u0003J\t\u0010)\u001a\u00020$H×\u0001J\t\u0010*\u001a\u00020\u0003H×\u0001J\u0018\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020$H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0013R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000eR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000eR \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0013¨\u00060"}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/resp/Limit;", "Landroid/os/Parcelable;", "type", "", TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY, "name", "setLimit", "usage", "startDate", "endDate", "currentLimit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getCategory", "getName", "getSetLimit", "setSetLimit", "(Ljava/lang/String;)V", "getUsage", "setUsage", "getStartDate", "getEndDate", "getCurrentLimit", "setCurrentLimit", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Limit implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Limit> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;

    @SerializedName(TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY)
    private final String category;

    @SerializedName("currentLimit")
    private String currentLimit;

    @SerializedName("endDate")
    private final String endDate;

    @SerializedName("limitType")
    private final String name;

    @SerializedName("setLimit")
    private String setLimit;

    @SerializedName("beginDate")
    private final String startDate;

    @SerializedName("type")
    private final String type;

    @SerializedName("usedAmount")
    private String usage;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Limit> {
        private static int component1 = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Limit createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            Limit limit = new Limit(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component1 + 65;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return limit;
        }

        @Override
        public Limit createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 45;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Limit limitCreateFromParcel = createFromParcel(parcel);
            int i4 = component1 + 117;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return limitCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Limit[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 111;
            int i4 = i3 % 128;
            component1 = i4;
            Limit[] limitArr = new Limit[i];
            if (i3 % 2 == 0) {
                int i5 = 38 / 0;
            }
            int i6 = i4 + 3;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return limitArr;
        }

        @Override
        public Limit[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 107;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            Limit[] limitArrNewArray = newArray(i);
            if (i4 != 0) {
                int i5 = 80 / 0;
            }
            return limitArrNewArray;
        }
    }

    public Limit(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.type = str;
        this.category = str2;
        this.name = str3;
        this.setLimit = str4;
        this.usage = str5;
        this.startDate = str6;
        this.endDate = str7;
        this.currentLimit = str8;
    }

    public final String getType() {
        int i = 2 % 2;
        int i2 = component2 + 111;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.type;
        if (i3 != 0) {
            int i4 = 6 / 0;
        }
        return str;
    }

    public final String getCategory() {
        int i = 2 % 2;
        int i2 = component2 + 61;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.category;
        }
        throw null;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = component2 + 101;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.name;
        int i5 = i3 + 63;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getSetLimit() {
        int i = 2 % 2;
        int i2 = component2 + 113;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.setLimit;
        int i5 = i3 + 53;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setSetLimit(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 1;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.setLimit = str;
        int i5 = i3 + 25;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getUsage() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 13;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.usage;
        int i4 = i2 + 19;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void setUsage(String str) {
        int i = 2 % 2;
        int i2 = component2 + 45;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.usage = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getStartDate() {
        int i = 2 % 2;
        int i2 = copydefault + 71;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.startDate;
        int i5 = i3 + 19;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getEndDate() {
        int i = 2 % 2;
        int i2 = component2 + 33;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.endDate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getCurrentLimit() {
        int i = 2 % 2;
        int i2 = component2 + 71;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.currentLimit;
        }
        throw null;
    }

    public final void setCurrentLimit(String str) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 27;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.currentLimit = str;
        int i5 = i2 + 117;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    static {
        int i = ShareDataUIState + 1;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static Limit copy$default(Limit limit, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str9 = limit.type;
            int i3 = copydefault + 67;
            component2 = i3 % 128;
            int i4 = i3 % 2;
        } else {
            str9 = str;
        }
        if ((i & 2) != 0) {
            int i5 = component2 + 97;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                str10 = limit.category;
                int i6 = 37 / 0;
            } else {
                str10 = limit.category;
            }
        } else {
            str10 = str2;
        }
        if ((i & 4) != 0) {
            int i7 = copydefault + 117;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            str11 = limit.name;
        } else {
            str11 = str3;
        }
        String str14 = (i & 8) != 0 ? limit.setLimit : str4;
        String str15 = (i & 16) != 0 ? limit.usage : str5;
        String str16 = (i & 32) != 0 ? limit.startDate : str6;
        if ((i & 64) != 0) {
            str12 = limit.endDate;
            int i9 = component2 + 15;
            copydefault = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 2 % 4;
            }
        } else {
            str12 = str7;
        }
        if ((i & 128) != 0) {
            int i11 = copydefault + 59;
            component2 = i11 % 128;
            int i12 = i11 % 2;
            str13 = limit.currentLimit;
        } else {
            str13 = str8;
        }
        return limit.copy(str9, str10, str11, str14, str15, str16, str12, str13);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 99;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.type;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 123;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.category;
        int i5 = i2 + 9;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 58 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 69;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.name;
        int i5 = i2 + 73;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 115;
        copydefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.setLimit;
        int i4 = i2 + 61;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = copydefault + 117;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.usage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 105;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.startDate;
        int i5 = i2 + 107;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 11 / 0;
        }
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 3;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.endDate;
        int i5 = i2 + 45;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = component2 + 53;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.currentLimit;
        int i5 = i3 + 119;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Limit copy(String type, String category, String name, String setLimit, String usage, String startDate, String endDate, String currentLimit) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(type, "");
        Intrinsics.checkNotNullParameter(category, "");
        Intrinsics.checkNotNullParameter(name, "");
        Limit limit = new Limit(type, category, name, setLimit, usage, startDate, endDate, currentLimit);
        int i2 = copydefault + 87;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return limit;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 73;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 3;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 115;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof Limit)) {
            return false;
        }
        Limit limit = (Limit) other;
        if (!Intrinsics.areEqual(this.type, limit.type)) {
            int i4 = copydefault + 55;
            component2 = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.category, limit.category) || !Intrinsics.areEqual(this.name, limit.name) || (!Intrinsics.areEqual(this.setLimit, limit.setLimit)) || !Intrinsics.areEqual(this.usage, limit.usage) || !Intrinsics.areEqual(this.startDate, limit.startDate)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.endDate, limit.endDate)) {
            int i5 = component2 + 111;
            copydefault = i5 % 128;
            return i5 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.currentLimit, limit.currentLimit)) {
            return true;
        }
        int i6 = component2 + 39;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = copydefault + 109;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode3 = this.type.hashCode();
        int iHashCode4 = this.category.hashCode();
        int iHashCode5 = this.name.hashCode();
        String str = this.setLimit;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.usage;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.startDate;
        if (str3 == null) {
            int i4 = copydefault + 109;
            component2 = i4 % 128;
            iHashCode = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str3.hashCode();
        }
        String str4 = this.endDate;
        if (str4 == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = str4.hashCode();
            int i5 = copydefault + 51;
            component2 = i5 % 128;
            int i6 = i5 % 2;
        }
        String str5 = this.currentLimit;
        return (((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode) * 31) + iHashCode2) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Limit(type=" + this.type + ", category=" + this.category + ", name=" + this.name + ", setLimit=" + this.setLimit + ", usage=" + this.usage + ", startDate=" + this.startDate + ", endDate=" + this.endDate + ", currentLimit=" + this.currentLimit + ")";
        int i2 = component2 + 125;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 121;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.type);
        dest.writeString(this.category);
        dest.writeString(this.name);
        dest.writeString(this.setLimit);
        dest.writeString(this.usage);
        dest.writeString(this.startDate);
        dest.writeString(this.endDate);
        dest.writeString(this.currentLimit);
        int i4 = copydefault + 65;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }
}
