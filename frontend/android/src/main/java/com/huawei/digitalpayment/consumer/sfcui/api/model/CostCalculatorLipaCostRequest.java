package com.huawei.digitalpayment.consumer.sfcui.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\b\u0010\u0012\u001a\u00020\u0003H\u0007J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H×\u0003J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\t\u0010\u0018\u001a\u00020\u0005H×\u0001J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0003H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/api/model/CostCalculatorLipaCostRequest;", "Landroid/os/Parcelable;", "amount", "", "partyA", "", "partyB", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getAmount", "()I", "getPartyA", "()Ljava/lang/String;", "getPartyB", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CostCalculatorLipaCostRequest implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<CostCalculatorLipaCostRequest> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component2;
    private static int component3;

    @SerializedName("amount")
    private final int amount;

    @SerializedName("partyA")
    private final String partyA;

    @SerializedName("partyB")
    private final String partyB;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CostCalculatorLipaCostRequest> {
        private static int component1 = 0;
        private static int component2 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final CostCalculatorLipaCostRequest createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            CostCalculatorLipaCostRequest costCalculatorLipaCostRequest = new CostCalculatorLipaCostRequest(parcel.readInt(), parcel.readString(), parcel.readString());
            int i2 = component2 + 25;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                return costCalculatorLipaCostRequest;
            }
            throw null;
        }

        @Override
        public CostCalculatorLipaCostRequest createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 57;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            CostCalculatorLipaCostRequest costCalculatorLipaCostRequestCreateFromParcel = createFromParcel(parcel);
            if (i3 == 0) {
                int i4 = 86 / 0;
            }
            int i5 = component1 + 125;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return costCalculatorLipaCostRequestCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final CostCalculatorLipaCostRequest[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 99;
            int i4 = i3 % 128;
            component2 = i4;
            CostCalculatorLipaCostRequest[] costCalculatorLipaCostRequestArr = new CostCalculatorLipaCostRequest[i];
            if (i3 % 2 == 0) {
                throw null;
            }
            int i5 = i4 + 23;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return costCalculatorLipaCostRequestArr;
        }

        @Override
        public CostCalculatorLipaCostRequest[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 23;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                return newArray(i);
            }
            newArray(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public CostCalculatorLipaCostRequest(int i, String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.amount = i;
        this.partyA = str;
        this.partyB = str2;
    }

    public final int getAmount() {
        int i = 2 % 2;
        int i2 = component2 + 85;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.amount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getPartyA() {
        int i = 2 % 2;
        int i2 = component2 + 65;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.partyA;
        int i5 = i3 + 93;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getPartyB() {
        int i = 2 % 2;
        int i2 = component2 + 73;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.partyB;
        int i4 = i3 + 33;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    static {
        int i = component3 + 121;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public static CostCalculatorLipaCostRequest copy$default(CostCalculatorLipaCostRequest costCalculatorLipaCostRequest, int i, String str, String str2, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = component1 + 17;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        if ((i2 & 1) != 0) {
            i = costCalculatorLipaCostRequest.amount;
        }
        if ((i2 & 2) != 0) {
            str = costCalculatorLipaCostRequest.partyA;
        }
        if ((i2 & 4) != 0) {
            str2 = costCalculatorLipaCostRequest.partyB;
        }
        CostCalculatorLipaCostRequest costCalculatorLipaCostRequestCopy = costCalculatorLipaCostRequest.copy(i, str, str2);
        int i6 = component1 + 113;
        component2 = i6 % 128;
        if (i6 % 2 == 0) {
            return costCalculatorLipaCostRequestCopy;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final int component1() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 25;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = this.amount;
        int i5 = i2 + 117;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 20 / 0;
        }
        return i4;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 85;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.partyA;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1 + 89;
        int i3 = i2 % 128;
        component2 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.partyB;
        int i4 = i3 + 111;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final CostCalculatorLipaCostRequest copy(int amount, String partyA, String partyB) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(partyA, "");
        Intrinsics.checkNotNullParameter(partyB, "");
        CostCalculatorLipaCostRequest costCalculatorLipaCostRequest = new CostCalculatorLipaCostRequest(amount, partyA, partyB);
        int i2 = component1 + 93;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return costCalculatorLipaCostRequest;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 109;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 67;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1 + 29;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof CostCalculatorLipaCostRequest)) {
            return false;
        }
        CostCalculatorLipaCostRequest costCalculatorLipaCostRequest = (CostCalculatorLipaCostRequest) other;
        if (this.amount != costCalculatorLipaCostRequest.amount) {
            return false;
        }
        if (!Intrinsics.areEqual(this.partyA, costCalculatorLipaCostRequest.partyA)) {
            int i4 = component1 + 29;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 0 / 0;
            }
            return false;
        }
        if (Intrinsics.areEqual(this.partyB, costCalculatorLipaCostRequest.partyB)) {
            return true;
        }
        int i6 = component1 + 21;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 41;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((Integer.hashCode(this.amount) * 31) + this.partyA.hashCode()) * 31) + this.partyB.hashCode();
        int i4 = component1 + 107;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 93 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CostCalculatorLipaCostRequest(amount=" + this.amount + ", partyA=" + this.partyA + ", partyB=" + this.partyB + ")";
        int i2 = component1 + 125;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 45;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 == 0) {
            dest.writeInt(this.amount);
            dest.writeString(this.partyA);
            dest.writeString(this.partyB);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        dest.writeInt(this.amount);
        dest.writeString(this.partyA);
        dest.writeString(this.partyB);
        int i4 = component2 + 61;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }
}
