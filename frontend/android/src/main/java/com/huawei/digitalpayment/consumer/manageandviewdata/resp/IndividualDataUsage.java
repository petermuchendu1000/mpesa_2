package com.huawei.digitalpayment.consumer.manageandviewdata.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/resp/IndividualDataUsage;", "Landroid/os/Parcelable;", "dateHour", "", "totalUsage", "serviceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDateHour", "()Ljava/lang/String;", "getTotalUsage", "getServiceId", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IndividualDataUsage implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<IndividualDataUsage> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName("dateHour")
    private final String dateHour;

    @SerializedName("serviceId")
    private final String serviceId;

    @SerializedName("totalUsage")
    private final String totalUsage;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IndividualDataUsage> {
        private static int component3 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final IndividualDataUsage createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            IndividualDataUsage individualDataUsage = new IndividualDataUsage(parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component3 + 13;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return individualDataUsage;
        }

        @Override
        public IndividualDataUsage createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 59;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            IndividualDataUsage individualDataUsageCreateFromParcel = createFromParcel(parcel);
            int i4 = component3 + 105;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return individualDataUsageCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final IndividualDataUsage[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 59;
            int i4 = i3 % 128;
            copydefault = i4;
            int i5 = i3 % 2;
            IndividualDataUsage[] individualDataUsageArr = new IndividualDataUsage[i];
            int i6 = i4 + 77;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return individualDataUsageArr;
        }

        @Override
        public IndividualDataUsage[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 41;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            IndividualDataUsage[] individualDataUsageArrNewArray = newArray(i);
            int i5 = component3 + 109;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return individualDataUsageArrNewArray;
        }
    }

    public IndividualDataUsage(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.dateHour = str;
        this.totalUsage = str2;
        this.serviceId = str3;
    }

    public final String getDateHour() {
        int i = 2 % 2;
        int i2 = component3 + 121;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.dateHour;
        int i5 = i3 + 13;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getTotalUsage() {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.totalUsage;
        if (i3 == 0) {
            int i4 = 31 / 0;
        }
        return str;
    }

    public final String getServiceId() {
        int i = 2 % 2;
        int i2 = component3 + 105;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.serviceId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component1 + 11;
        component2 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static IndividualDataUsage copy$default(IndividualDataUsage individualDataUsage, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault + 35;
        int i4 = i3 % 128;
        component3 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 109;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            str = individualDataUsage.dateHour;
        }
        if ((i & 2) != 0) {
            int i8 = copydefault + 101;
            component3 = i8 % 128;
            if (i8 % 2 == 0) {
                str2 = individualDataUsage.totalUsage;
                int i9 = 3 / 0;
            } else {
                str2 = individualDataUsage.totalUsage;
            }
        }
        if ((i & 4) != 0) {
            str3 = individualDataUsage.serviceId;
        }
        return individualDataUsage.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 119;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.dateHour;
        if (i3 != 0) {
            int i4 = 53 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault + 89;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.totalUsage;
        }
        throw null;
    }

    public final String component3() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 89;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.serviceId;
            int i4 = 22 / 0;
        } else {
            str = this.serviceId;
        }
        int i5 = i2 + 65;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final IndividualDataUsage copy(String dateHour, String totalUsage, String serviceId) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dateHour, "");
        Intrinsics.checkNotNullParameter(totalUsage, "");
        IndividualDataUsage individualDataUsage = new IndividualDataUsage(dateHour, totalUsage, serviceId);
        int i2 = copydefault + 37;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return individualDataUsage;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 23;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 81;
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
            return true;
        }
        if (!(other instanceof IndividualDataUsage)) {
            return false;
        }
        IndividualDataUsage individualDataUsage = (IndividualDataUsage) other;
        if (!Intrinsics.areEqual(this.dateHour, individualDataUsage.dateHour)) {
            int i2 = component3 + 1;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.totalUsage, individualDataUsage.totalUsage)) {
            int i4 = copydefault + 11;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.serviceId, individualDataUsage.serviceId)) {
            return true;
        }
        int i6 = copydefault + 107;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 125;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            this.dateHour.hashCode();
            this.totalUsage.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.dateHour.hashCode();
        int iHashCode2 = this.totalUsage.hashCode();
        String str = this.serviceId;
        int iHashCode3 = (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
        int i3 = component3 + 59;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 73 / 0;
        }
        return iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "IndividualDataUsage(dateHour=" + this.dateHour + ", totalUsage=" + this.totalUsage + ", serviceId=" + this.serviceId + ")";
        int i2 = copydefault + 77;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 7;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.dateHour);
        dest.writeString(this.totalUsage);
        dest.writeString(this.serviceId);
        if (i3 == 0) {
            int i4 = 98 / 0;
        }
    }
}
