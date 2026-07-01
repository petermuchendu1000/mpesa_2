package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.roamingcashout.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u000eH×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/roamingcashout/model/RoamingCashoutId;", "Landroid/os/Parcelable;", "value", "", "schemeName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getSchemeName", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RoamingCashoutId implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<RoamingCashoutId> CREATOR = new Creator();
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault;
    private final String schemeName;
    private final String value;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RoamingCashoutId> {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final RoamingCashoutId createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            RoamingCashoutId roamingCashoutId = new RoamingCashoutId(parcel.readString(), parcel.readString());
            int i2 = ShareDataUIState + 113;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return roamingCashoutId;
        }

        @Override
        public RoamingCashoutId createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 15;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            RoamingCashoutId roamingCashoutIdCreateFromParcel = createFromParcel(parcel);
            int i4 = component1 + 73;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return roamingCashoutIdCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final RoamingCashoutId[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 15;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            int i5 = i3 % 2;
            RoamingCashoutId[] roamingCashoutIdArr = new RoamingCashoutId[i];
            int i6 = i4 + 101;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return roamingCashoutIdArr;
        }

        @Override
        public RoamingCashoutId[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 71;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                return newArray(i);
            }
            newArray(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public RoamingCashoutId(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.value = str;
        this.schemeName = str2;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 95;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.value;
        int i4 = i2 + 39;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getSchemeName() {
        int i = 2 % 2;
        int i2 = component2 + 27;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.schemeName;
        }
        throw null;
    }

    static {
        int i = component3 + 87;
        copydefault = i % 128;
        if (i % 2 != 0) {
            int i2 = 82 / 0;
        }
    }

    public static RoamingCashoutId copy$default(RoamingCashoutId roamingCashoutId, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 25;
        component1 = i4 % 128;
        if (i4 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            str = roamingCashoutId.value;
        }
        if ((i & 2) != 0) {
            int i5 = i3 + 109;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            str2 = roamingCashoutId.schemeName;
            if (i6 == 0) {
                int i7 = 8 / 0;
            }
        }
        return roamingCashoutId.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 97;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.value;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 5;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.schemeName;
        int i5 = i2 + 21;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final RoamingCashoutId copy(String value, String schemeName) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(value, "");
        Intrinsics.checkNotNullParameter(schemeName, "");
        RoamingCashoutId roamingCashoutId = new RoamingCashoutId(value, schemeName);
        int i2 = component2 + 9;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return roamingCashoutId;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 27;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 45;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 88 / 0;
        }
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2 + 37;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoamingCashoutId)) {
            return false;
        }
        RoamingCashoutId roamingCashoutId = (RoamingCashoutId) other;
        if (!Intrinsics.areEqual(this.value, roamingCashoutId.value)) {
            int i4 = component1 + 45;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.schemeName, roamingCashoutId.schemeName)) {
            return true;
        }
        int i6 = component2 + 83;
        component1 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 60 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 123;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.value.hashCode() * 31) + this.schemeName.hashCode();
        int i4 = component1 + 121;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RoamingCashoutId(value=" + this.value + ", schemeName=" + this.schemeName + ')';
        int i2 = component2 + 57;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 115;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.value);
        dest.writeString(this.schemeName);
        int i4 = component1 + 5;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }
}
