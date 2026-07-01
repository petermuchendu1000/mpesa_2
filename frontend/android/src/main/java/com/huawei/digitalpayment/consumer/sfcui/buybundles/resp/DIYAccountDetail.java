package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DIYAccountDetail;", "Landroid/os/Parcelable;", "data", "", "mins", Keys.BUNDLE_TYPE_SMS, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getData", "()Ljava/lang/String;", "getMins", "getSms", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DIYAccountDetail implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<DIYAccountDetail> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    @SerializedName("data")
    private final String data;

    @SerializedName("mins")
    private final String mins;

    @SerializedName(Keys.BUNDLE_TYPE_SMS)
    private final String sms;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DIYAccountDetail> {
        private static int component2 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DIYAccountDetail createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            DIYAccountDetail dIYAccountDetail = new DIYAccountDetail(parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = copydefault + 75;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return dIYAccountDetail;
            }
            throw null;
        }

        @Override
        public DIYAccountDetail createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 5;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                createFromParcel(parcel);
                throw null;
            }
            DIYAccountDetail dIYAccountDetailCreateFromParcel = createFromParcel(parcel);
            int i3 = copydefault + 91;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            return dIYAccountDetailCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DIYAccountDetail[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 115;
            copydefault = i3 % 128;
            DIYAccountDetail[] dIYAccountDetailArr = new DIYAccountDetail[i];
            if (i3 % 2 == 0) {
                return dIYAccountDetailArr;
            }
            throw null;
        }

        @Override
        public DIYAccountDetail[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 23;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            DIYAccountDetail[] dIYAccountDetailArrNewArray = newArray(i);
            int i5 = component2 + 61;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return dIYAccountDetailArrNewArray;
        }
    }

    public DIYAccountDetail(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.data = str;
        this.mins = str2;
        this.sms = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DIYAccountDetail(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = copydefault + 81;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            str = "";
        }
        if ((i & 2) != 0) {
            int i3 = copydefault + 37;
            int i4 = i3 % 128;
            component2 = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 11;
            copydefault = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 4 % 4;
            } else {
                int i8 = 2 % 2;
            }
            str2 = "";
        }
        if ((i & 4) != 0) {
            int i9 = 2 % 2;
            str3 = "";
        }
        this(str, str2, str3);
    }

    public final String getData() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 71;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.data;
        int i4 = i2 + 117;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getMins() {
        int i = 2 % 2;
        int i2 = copydefault + 99;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.mins;
        int i4 = i3 + 43;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getSms() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 83;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.sms;
        int i5 = i2 + 25;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = component3 + 81;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public DIYAccountDetail() {
        this(null, null, null, 7, null);
    }

    public static DIYAccountDetail copy$default(DIYAccountDetail dIYAccountDetail, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component2 + 119;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            str = dIYAccountDetail.data;
        }
        if ((i & 2) != 0) {
            int i5 = component2 + 61;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                String str4 = dIYAccountDetail.mins;
                throw null;
            }
            str2 = dIYAccountDetail.mins;
        }
        if ((i & 4) != 0) {
            str3 = dIYAccountDetail.sms;
        }
        return dIYAccountDetail.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 7;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.data;
        int i5 = i2 + 33;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 101;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.mins;
        int i5 = i3 + 77;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault + 35;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.sms;
        int i5 = i3 + 113;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final DIYAccountDetail copy(String data, String mins, String sms) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(data, "");
        Intrinsics.checkNotNullParameter(mins, "");
        Intrinsics.checkNotNullParameter(sms, "");
        DIYAccountDetail dIYAccountDetail = new DIYAccountDetail(data, mins, sms);
        int i2 = copydefault + 79;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return dIYAccountDetail;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 81;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 17;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2 + 71;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof DIYAccountDetail)) {
            int i5 = i3 + 71;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        DIYAccountDetail dIYAccountDetail = (DIYAccountDetail) other;
        if (!Intrinsics.areEqual(this.data, dIYAccountDetail.data)) {
            int i7 = component2 + 17;
            copydefault = i7 % 128;
            if (i7 % 2 != 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(this.mins, dIYAccountDetail.mins)) {
            return false;
        }
        if (Intrinsics.areEqual(this.sms, dIYAccountDetail.sms)) {
            int i8 = component2 + 27;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
            return true;
        }
        int i10 = component2 + 85;
        copydefault = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 73;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.data.hashCode() * 31) + this.mins.hashCode()) * 31) + this.sms.hashCode();
        int i4 = copydefault + 109;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DIYAccountDetail(data=" + this.data + ", mins=" + this.mins + ", sms=" + this.sms + ")";
        int i2 = copydefault + 101;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 17;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.data);
        dest.writeString(this.mins);
        dest.writeString(this.sms);
        int i4 = copydefault + 25;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }
}
