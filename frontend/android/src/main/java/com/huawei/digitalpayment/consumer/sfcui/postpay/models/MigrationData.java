package com.huawei.digitalpayment.consumer.sfcui.postpay.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u000eH×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/MigrationData;", "Landroid/os/Parcelable;", "key", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MigrationData implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<MigrationData> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int copydefault = 1;

    @SerializedName("key")
    private final String key;

    @SerializedName("value")
    private final String value;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MigrationData> {
        private static int component2 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final MigrationData createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            MigrationData migrationData = new MigrationData(parcel.readString(), parcel.readString());
            int i2 = copydefault + 95;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return migrationData;
        }

        @Override
        public MigrationData createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 7;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            MigrationData migrationDataCreateFromParcel = createFromParcel(parcel);
            if (i3 == 0) {
                int i4 = 55 / 0;
            }
            int i5 = component2 + 53;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return migrationDataCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final MigrationData[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault;
            int i4 = i3 + 11;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            MigrationData[] migrationDataArr = new MigrationData[i];
            int i6 = i3 + 35;
            component2 = i6 % 128;
            if (i6 % 2 != 0) {
                return migrationDataArr;
            }
            throw null;
        }

        @Override
        public MigrationData[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 1;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            MigrationData[] migrationDataArrNewArray = newArray(i);
            int i5 = copydefault + 35;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                return migrationDataArrNewArray;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public MigrationData(String str, String str2) {
        this.key = str;
        this.value = str2;
    }

    public final String getKey() {
        int i = 2 % 2;
        int i2 = component2 + 21;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.key;
        }
        throw null;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.value;
        }
        throw null;
    }

    static {
        int i = copydefault + 107;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static MigrationData copy$default(MigrationData migrationData, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = migrationData.key;
            int i3 = component2 + 71;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
        }
        if ((i & 2) != 0) {
            int i5 = component2 + 53;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            str2 = migrationData.value;
        }
        return migrationData.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 9;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.key;
        int i4 = i3 + 89;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 59;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.value;
        int i5 = i2 + 103;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final MigrationData copy(String key, String value) {
        int i = 2 % 2;
        MigrationData migrationData = new MigrationData(key, value);
        int i2 = ShareDataUIState + 17;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return migrationData;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 39;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 63;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 95;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof MigrationData)) {
            int i5 = i2 + 25;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.key, ((MigrationData) other).key)) {
            int i7 = ShareDataUIState + 63;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.value, r6.value))) {
            return true;
        }
        int i9 = component2 + 23;
        ShareDataUIState = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.key;
        if (str == null) {
            int i2 = component2 + 57;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.value;
        int iHashCode2 = (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        int i4 = component2 + 27;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode2;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MigrationData(key=" + this.key + ", value=" + this.value + ")";
        int i2 = ShareDataUIState + 23;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 65;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.key);
        dest.writeString(this.value);
        int i4 = component2 + 97;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }
}
