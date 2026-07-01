package com.huawei.digitalpayment.consumer.sfcui.bonga.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u000eH×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/model/BongaBalanceResponse;", "Landroid/os/Parcelable;", "amount", "", "points", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getPoints", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BongaBalanceResponse implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<BongaBalanceResponse> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault;

    @SerializedName("amount")
    private final String amount;

    @SerializedName("points")
    private final String points;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BongaBalanceResponse> {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BongaBalanceResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            BongaBalanceResponse bongaBalanceResponse = new BongaBalanceResponse(parcel.readString(), parcel.readString());
            int i2 = ShareDataUIState + 11;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return bongaBalanceResponse;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public BongaBalanceResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 101;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            BongaBalanceResponse bongaBalanceResponseCreateFromParcel = createFromParcel(parcel);
            if (i3 != 0) {
                int i4 = 75 / 0;
            }
            int i5 = ShareDataUIState + 55;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return bongaBalanceResponseCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BongaBalanceResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 77;
            int i4 = i3 % 128;
            component2 = i4;
            BongaBalanceResponse[] bongaBalanceResponseArr = new BongaBalanceResponse[i];
            if (i3 % 2 == 0) {
                int i5 = 68 / 0;
            }
            int i6 = i4 + 121;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 48 / 0;
            }
            return bongaBalanceResponseArr;
        }

        @Override
        public BongaBalanceResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 109;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                return newArray(i);
            }
            newArray(i);
            throw null;
        }
    }

    public BongaBalanceResponse(String str, String str2) {
        this.amount = str;
        this.points = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BongaBalanceResponse(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = ShareDataUIState + 125;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
            str = null;
        }
        if ((i & 2) != 0) {
            int i4 = ShareDataUIState + 113;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            str2 = null;
        }
        this(str, str2);
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 117;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.amount;
        int i4 = i3 + 63;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getPoints() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 49;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.points;
        int i5 = i3 + 117;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = copydefault + 5;
        component2 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BongaBalanceResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static BongaBalanceResponse copy$default(BongaBalanceResponse bongaBalanceResponse, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1 + 51;
        int i4 = i3 % 128;
        ShareDataUIState = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 55;
            int i7 = i6 % 128;
            component1 = i7;
            int i8 = i6 % 2;
            String str3 = bongaBalanceResponse.amount;
            int i9 = i7 + 87;
            ShareDataUIState = i9 % 128;
            int i10 = i9 % 2;
            str = str3;
        }
        if ((i & 2) != 0) {
            str2 = bongaBalanceResponse.points;
        }
        BongaBalanceResponse bongaBalanceResponseCopy = bongaBalanceResponse.copy(str, str2);
        int i11 = ShareDataUIState + 31;
        component1 = i11 % 128;
        int i12 = i11 % 2;
        return bongaBalanceResponseCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 9;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.amount;
        int i4 = i3 + 55;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        String str;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 107;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.points;
            int i4 = 58 / 0;
        } else {
            str = this.points;
        }
        int i5 = i2 + 47;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final BongaBalanceResponse copy(String amount, String points) {
        int i = 2 % 2;
        BongaBalanceResponse bongaBalanceResponse = new BongaBalanceResponse(amount, points);
        int i2 = ShareDataUIState + 17;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return bongaBalanceResponse;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 41;
        component1 = i3 % 128;
        int i4 = i3 % 2 != 0 ? 1 : 0;
        int i5 = i2 + 37;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1 + 3;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 17;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof BongaBalanceResponse)) {
            int i7 = i3 + 17;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        BongaBalanceResponse bongaBalanceResponse = (BongaBalanceResponse) other;
        if (!Intrinsics.areEqual(this.amount, bongaBalanceResponse.amount)) {
            return false;
        }
        if (Intrinsics.areEqual(this.points, bongaBalanceResponse.points)) {
            return true;
        }
        int i9 = ShareDataUIState + 63;
        component1 = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        String str;
        int iHashCode;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 43;
        component1 = i2 % 128;
        int iHashCode2 = 0;
        if (i2 % 2 == 0 ? (str = this.amount) != null : (str = this.amount) != null) {
            iHashCode = str.hashCode();
            int i3 = component1 + 119;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 3 / 3;
            }
        } else {
            iHashCode = 0;
        }
        String str2 = this.points;
        if (str2 == null) {
            int i5 = component1 + 81;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
        } else {
            iHashCode2 = str2.hashCode();
        }
        return (iHashCode * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BongaBalanceResponse(amount=" + this.amount + ", points=" + this.points + ")";
        int i2 = component1 + 45;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 21;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.amount);
        dest.writeString(this.points);
        int i4 = component1 + 37;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }
}
