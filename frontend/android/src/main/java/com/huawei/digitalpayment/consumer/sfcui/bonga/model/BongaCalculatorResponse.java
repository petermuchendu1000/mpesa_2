package com.huawei.digitalpayment.consumer.sfcui.bonga.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/model/BongaCalculatorResponse;", "Landroid/os/Parcelable;", "amount", "", "points", "rate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getPoints", "getRate", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BongaCalculatorResponse implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<BongaCalculatorResponse> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    @SerializedName("amount")
    private final String amount;

    @SerializedName("points")
    private final String points;

    @SerializedName("rate")
    private final String rate;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BongaCalculatorResponse> {
        private static int component2 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BongaCalculatorResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            BongaCalculatorResponse bongaCalculatorResponse = new BongaCalculatorResponse(parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component2 + 107;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                return bongaCalculatorResponse;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public BongaCalculatorResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 53;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            BongaCalculatorResponse bongaCalculatorResponseCreateFromParcel = createFromParcel(parcel);
            int i4 = component2 + 71;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return bongaCalculatorResponseCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BongaCalculatorResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 29;
            int i4 = i3 % 128;
            copydefault = i4;
            BongaCalculatorResponse[] bongaCalculatorResponseArr = new BongaCalculatorResponse[i];
            if (i3 % 2 != 0) {
                int i5 = 75 / 0;
            }
            int i6 = i4 + 119;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return bongaCalculatorResponseArr;
        }

        @Override
        public BongaCalculatorResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 75;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            BongaCalculatorResponse[] bongaCalculatorResponseArrNewArray = newArray(i);
            int i5 = copydefault + 5;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 21 / 0;
            }
            return bongaCalculatorResponseArrNewArray;
        }
    }

    public BongaCalculatorResponse(String str, String str2, String str3) {
        this.amount = str;
        this.points = str2;
        this.rate = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BongaCalculatorResponse(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i3 = component2 + 93;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 % 2;
            }
            str2 = null;
        }
        if ((i & 4) != 0) {
            int i5 = copydefault + 105;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str3 = null;
        }
        this(str, str2, str3);
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = copydefault + 79;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.amount;
        if (i3 != 0) {
            int i4 = 80 / 0;
        }
        return str;
    }

    public final String getPoints() {
        int i = 2 % 2;
        int i2 = copydefault + 89;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.points;
        int i4 = i3 + 65;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 45 / 0;
        }
        return str;
    }

    public final String getRate() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 103;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.rate;
            int i4 = 97 / 0;
        } else {
            str = this.rate;
        }
        int i5 = i2 + 17;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 98 / 0;
        }
        return str;
    }

    static {
        int i = component1 + 71;
        component3 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public BongaCalculatorResponse() {
        this(null, null, null, 7, null);
    }

    public static BongaCalculatorResponse copy$default(BongaCalculatorResponse bongaCalculatorResponse, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        Object obj2 = null;
        if ((i & 1) != 0) {
            int i3 = copydefault + 61;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                String str4 = bongaCalculatorResponse.amount;
                throw null;
            }
            str = bongaCalculatorResponse.amount;
        }
        if ((i & 2) != 0) {
            int i4 = component2 + 53;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                str2 = bongaCalculatorResponse.points;
                int i5 = 2 / 0;
            } else {
                str2 = bongaCalculatorResponse.points;
            }
        }
        if ((i & 4) != 0) {
            int i6 = component2 + 95;
            copydefault = i6 % 128;
            if (i6 % 2 == 0) {
                String str5 = bongaCalculatorResponse.rate;
                obj2.hashCode();
                throw null;
            }
            str3 = bongaCalculatorResponse.rate;
        }
        return bongaCalculatorResponse.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 45;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.amount;
        if (i3 != 0) {
            int i4 = 97 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 115;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.points;
        int i5 = i3 + 55;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2 + 5;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.rate;
        if (i3 == 0) {
            int i4 = 60 / 0;
        }
        return str;
    }

    public final BongaCalculatorResponse copy(String amount, String points, String rate) {
        int i = 2 % 2;
        BongaCalculatorResponse bongaCalculatorResponse = new BongaCalculatorResponse(amount, points, rate);
        int i2 = copydefault + 75;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return bongaCalculatorResponse;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 85;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 21;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 31 / 0;
        }
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 69;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof BongaCalculatorResponse)) {
            return false;
        }
        BongaCalculatorResponse bongaCalculatorResponse = (BongaCalculatorResponse) other;
        if (!Intrinsics.areEqual(this.amount, bongaCalculatorResponse.amount)) {
            int i4 = copydefault + 101;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.points, bongaCalculatorResponse.points)) {
            return false;
        }
        if (Intrinsics.areEqual(this.rate, bongaCalculatorResponse.rate)) {
            return true;
        }
        int i6 = copydefault + 109;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.amount;
        if (str == null) {
            int i2 = component2 + 47;
            copydefault = i2 % 128;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.points;
        if (str2 == null) {
            int i3 = component2 + 27;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
            int i5 = copydefault + 91;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 / 5;
            }
        }
        String str3 = this.rate;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BongaCalculatorResponse(amount=" + this.amount + ", points=" + this.points + ", rate=" + this.rate + ")";
        int i2 = component2 + 9;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 53;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.amount);
        dest.writeString(this.points);
        dest.writeString(this.rate);
        int i4 = component2 + 39;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 15 / 0;
        }
    }
}
