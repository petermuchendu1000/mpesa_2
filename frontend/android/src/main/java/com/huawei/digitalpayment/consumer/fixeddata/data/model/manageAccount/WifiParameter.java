package com.huawei.digitalpayment.consumer.fixeddata.data.model.manageAccount;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u000eH×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/manageAccount/WifiParameter;", "Landroid/os/Parcelable;", "name", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WifiParameter implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<WifiParameter> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component2;
    private static int copydefault;

    @SerializedName("Name")
    private final String name;

    @SerializedName("Value")
    private final String value;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<WifiParameter> {
        private static int component1 = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final WifiParameter createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            WifiParameter wifiParameter = new WifiParameter(parcel.readString(), parcel.readString());
            int i2 = component1 + 3;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return wifiParameter;
            }
            throw null;
        }

        @Override
        public WifiParameter createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 3;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final WifiParameter[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 85;
            int i4 = i3 % 128;
            component3 = i4;
            WifiParameter[] wifiParameterArr = new WifiParameter[i];
            if (i3 % 2 != 0) {
                int i5 = 34 / 0;
            }
            int i6 = i4 + 85;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return wifiParameterArr;
        }

        @Override
        public WifiParameter[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 53;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                return newArray(i);
            }
            newArray(i);
            throw null;
        }
    }

    public WifiParameter(String str, String str2) {
        this.name = str;
        this.value = str2;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 43;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.name;
        int i5 = i2 + 119;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 83;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.value;
        int i4 = i2 + 31;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 16 / 0;
        }
        return str;
    }

    static {
        int i = component2 + 67;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static WifiParameter copy$default(WifiParameter wifiParameter, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault;
        int i4 = i3 + 49;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0 && (i & 1) != 0) {
            int i5 = i3 + 53;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            str = wifiParameter.name;
            int i7 = i3 + 97;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
        }
        if ((i & 2) != 0) {
            str2 = wifiParameter.value;
        }
        return wifiParameter.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 17;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.name;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 21;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.value;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final WifiParameter copy(String name, String value) {
        int i = 2 % 2;
        WifiParameter wifiParameter = new WifiParameter(name, value);
        int i2 = copydefault + 57;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return wifiParameter;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 29;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof WifiParameter)) {
            return false;
        }
        WifiParameter wifiParameter = (WifiParameter) other;
        if (!Intrinsics.areEqual(this.name, wifiParameter.name)) {
            int i2 = ShareDataUIState + 23;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.value, wifiParameter.value)) {
            int i4 = ShareDataUIState + 53;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = ShareDataUIState + 17;
        copydefault = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.name;
        if (str == null) {
            int i2 = ShareDataUIState + 75;
            copydefault = i2 % 128;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.value;
        int iHashCode2 = (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        int i3 = copydefault + 57;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "WifiParameter(name=" + this.name + ", value=" + this.value + ")";
        int i2 = ShareDataUIState + 7;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 63;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 == 0) {
            dest.writeString(this.name);
            dest.writeString(this.value);
            throw null;
        }
        dest.writeString(this.name);
        dest.writeString(this.value);
        int i4 = ShareDataUIState + 17;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }
}
