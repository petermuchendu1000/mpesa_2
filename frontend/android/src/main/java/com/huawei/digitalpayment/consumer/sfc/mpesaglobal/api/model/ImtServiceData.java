package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u000eH×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/ImtServiceData;", "Landroid/os/Parcelable;", "key", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ImtServiceData implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ImtServiceData> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component2;
    private static int component3;

    @SerializedName("Key")
    private final String key;

    @SerializedName("Value")
    private final String value;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ImtServiceData> {
        private static int component2 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ImtServiceData createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            ImtServiceData imtServiceData = new ImtServiceData(parcel.readString(), parcel.readString());
            int i2 = copydefault + 85;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return imtServiceData;
            }
            throw null;
        }

        @Override
        public ImtServiceData createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 79;
            component2 = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                createFromParcel(parcel);
                obj.hashCode();
                throw null;
            }
            ImtServiceData imtServiceDataCreateFromParcel = createFromParcel(parcel);
            int i3 = copydefault + 111;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                return imtServiceDataCreateFromParcel;
            }
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ImtServiceData[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 111;
            copydefault = i3 % 128;
            ImtServiceData[] imtServiceDataArr = new ImtServiceData[i];
            if (i3 % 2 == 0) {
                int i4 = 87 / 0;
            }
            return imtServiceDataArr;
        }

        @Override
        public ImtServiceData[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 5;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            ImtServiceData[] imtServiceDataArrNewArray = newArray(i);
            if (i4 != 0) {
                int i5 = 25 / 0;
            }
            return imtServiceDataArrNewArray;
        }
    }

    public ImtServiceData(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.key = str;
        this.value = str2;
    }

    public final String getKey() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 101;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.key;
        int i5 = i3 + 97;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 0 / 0;
        }
        return str;
    }

    public final String getValue() {
        String str;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 57;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.value;
            int i4 = 0 / 0;
        } else {
            str = this.value;
        }
        int i5 = i2 + 9;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = component1 + 7;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static ImtServiceData copy$default(ImtServiceData imtServiceData, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 83;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            str = imtServiceData.key;
        }
        if ((i & 2) != 0) {
            int i5 = i3 + 119;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            str2 = imtServiceData.value;
        }
        return imtServiceData.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 27;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.key;
        int i5 = i2 + 21;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 19 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 115;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.value;
        int i5 = i2 + 35;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ImtServiceData copy(String key, String value) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(key, "");
        Intrinsics.checkNotNullParameter(value, "");
        ImtServiceData imtServiceData = new ImtServiceData(key, value);
        int i2 = ShareDataUIState + 123;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return imtServiceData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 27;
        ShareDataUIState = i2 % 128;
        return i2 % 2 == 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 59;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof ImtServiceData)) {
            int i4 = ShareDataUIState + 93;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 / 0;
            }
            return false;
        }
        ImtServiceData imtServiceData = (ImtServiceData) other;
        if (!Intrinsics.areEqual(this.key, imtServiceData.key)) {
            int i6 = component2 + 13;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.value, imtServiceData.value)) {
            return true;
        }
        int i8 = component2 + 87;
        ShareDataUIState = i8 % 128;
        return i8 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 67;
        ShareDataUIState = i2 % 128;
        int iHashCode = (i2 % 2 == 0 ? this.key.hashCode() * 122 : this.key.hashCode() * 31) + this.value.hashCode();
        int i3 = component2 + 75;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ImtServiceData(key=" + this.key + ", value=" + this.value + ')';
        int i2 = component2 + 7;
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
        int i = 2 % 2;
        int i2 = component2 + 83;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.key);
        dest.writeString(this.value);
        int i4 = ShareDataUIState + 81;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }
}
