package com.huawei.digitalpayment.consumer.sfcui.bonga.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u000bH×\u0001J\t\u0010\u0011\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bH\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/model/BongaCalculatorPointsPayload;", "Landroid/os/Parcelable;", "points", "", "<init>", "(Ljava/lang/String;)V", "getPoints", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BongaCalculatorPointsPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<BongaCalculatorPointsPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int copydefault = 1;

    @SerializedName("points")
    private final String points;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BongaCalculatorPointsPayload> {
        private static int component3 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BongaCalculatorPointsPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            BongaCalculatorPointsPayload bongaCalculatorPointsPayload = new BongaCalculatorPointsPayload(parcel.readString());
            int i2 = component3 + 51;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return bongaCalculatorPointsPayload;
        }

        @Override
        public BongaCalculatorPointsPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 53;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            BongaCalculatorPointsPayload bongaCalculatorPointsPayloadCreateFromParcel = createFromParcel(parcel);
            int i4 = copydefault + 99;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return bongaCalculatorPointsPayloadCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BongaCalculatorPointsPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3;
            int i4 = i3 + 79;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            BongaCalculatorPointsPayload[] bongaCalculatorPointsPayloadArr = new BongaCalculatorPointsPayload[i];
            int i6 = i3 + 47;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                return bongaCalculatorPointsPayloadArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public BongaCalculatorPointsPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 11;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            BongaCalculatorPointsPayload[] bongaCalculatorPointsPayloadArrNewArray = newArray(i);
            int i5 = component3 + 41;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return bongaCalculatorPointsPayloadArrNewArray;
        }
    }

    public BongaCalculatorPointsPayload(String str) {
        this.points = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BongaCalculatorPointsPayload(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component2;
            int i3 = i2 + 15;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 88 / 0;
            }
            int i5 = i2 + 111;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            str = null;
        }
        this(str);
    }

    public final String getPoints() {
        int i = 2 % 2;
        int i2 = copydefault + 109;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.points;
        if (i3 != 0) {
            int i4 = 27 / 0;
        }
        return str;
    }

    static {
        int i = component1 + 43;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BongaCalculatorPointsPayload() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static BongaCalculatorPointsPayload copy$default(BongaCalculatorPointsPayload bongaCalculatorPointsPayload, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault + 53;
        int i4 = i3 % 128;
        component2 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 51;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            str = bongaCalculatorPointsPayload.points;
        }
        return bongaCalculatorPointsPayload.copy(str);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 85;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.points;
        int i4 = i3 + 45;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final BongaCalculatorPointsPayload copy(String points) {
        int i = 2 % 2;
        BongaCalculatorPointsPayload bongaCalculatorPointsPayload = new BongaCalculatorPointsPayload(points);
        int i2 = copydefault + 113;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return bongaCalculatorPointsPayload;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 27;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 113;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof BongaCalculatorPointsPayload)) {
            int i2 = component2 + 71;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.points, ((BongaCalculatorPointsPayload) other).points)) {
            return true;
        }
        int i4 = copydefault + 101;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 69 / 0;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.points;
        if (str == null) {
            int i2 = copydefault + 95;
            component2 = i2 % 128;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        int i3 = component2 + 9;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BongaCalculatorPointsPayload(points=" + this.points + ")";
        int i2 = copydefault + 79;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 53;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.points);
        int i4 = copydefault + 109;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
