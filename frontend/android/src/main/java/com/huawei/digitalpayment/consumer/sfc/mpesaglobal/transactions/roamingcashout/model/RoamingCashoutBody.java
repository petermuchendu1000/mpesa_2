package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H×\u0003J\t\u0010\u0019\u001a\u00020\u0014H×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/model/RoamingCashoutBody;", "Landroid/os/Parcelable;", "agentNumber", "", "amount", "currencyFrom", "currencyTo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAgentNumber", "()Ljava/lang/String;", "getAmount", "getCurrencyFrom", "getCurrencyTo", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RoamingCashoutBody implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<RoamingCashoutBody> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 1;
    private static int copydefault;
    private final String agentNumber;
    private final String amount;
    private final String currencyFrom;
    private final String currencyTo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RoamingCashoutBody> {
        private static int component2 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final RoamingCashoutBody createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            RoamingCashoutBody roamingCashoutBody = new RoamingCashoutBody(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component2 + 107;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return roamingCashoutBody;
        }

        @Override
        public RoamingCashoutBody createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 23;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                createFromParcel(parcel);
                throw null;
            }
            RoamingCashoutBody roamingCashoutBodyCreateFromParcel = createFromParcel(parcel);
            int i3 = component2 + 45;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 95 / 0;
            }
            return roamingCashoutBodyCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final RoamingCashoutBody[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2;
            int i4 = i3 + 109;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            RoamingCashoutBody[] roamingCashoutBodyArr = new RoamingCashoutBody[i];
            int i6 = i3 + 35;
            copydefault = i6 % 128;
            if (i6 % 2 == 0) {
                return roamingCashoutBodyArr;
            }
            throw null;
        }

        @Override
        public RoamingCashoutBody[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 17;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            RoamingCashoutBody[] roamingCashoutBodyArrNewArray = newArray(i);
            int i5 = component2 + 19;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                return roamingCashoutBodyArrNewArray;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public RoamingCashoutBody(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.agentNumber = str;
        this.amount = str2;
        this.currencyFrom = str3;
        this.currencyTo = str4;
    }

    public final String getAgentNumber() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 13;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.agentNumber;
        int i4 = i2 + 95;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 53;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.amount;
        int i5 = i2 + 69;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getCurrencyFrom() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 121;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.currencyFrom;
        int i5 = i2 + 87;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getCurrencyTo() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 125;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.currencyTo;
        int i5 = i2 + 103;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = ShareDataUIState + 95;
        component1 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static RoamingCashoutBody copy$default(RoamingCashoutBody roamingCashoutBody, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = copydefault + 49;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                str = roamingCashoutBody.agentNumber;
                int i4 = 21 / 0;
            } else {
                str = roamingCashoutBody.agentNumber;
            }
        }
        if ((i & 2) != 0) {
            str2 = roamingCashoutBody.amount;
        }
        if ((i & 4) != 0) {
            int i5 = copydefault + 47;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                str3 = roamingCashoutBody.currencyFrom;
                int i6 = 22 / 0;
            } else {
                str3 = roamingCashoutBody.currencyFrom;
            }
        }
        if ((i & 8) != 0) {
            int i7 = copydefault + 117;
            int i8 = i7 % 128;
            component2 = i8;
            if (i7 % 2 == 0) {
                str4 = roamingCashoutBody.currencyTo;
                int i9 = 57 / 0;
            } else {
                str4 = roamingCashoutBody.currencyTo;
            }
            int i10 = i8 + 111;
            copydefault = i10 % 128;
            int i11 = i10 % 2;
        }
        return roamingCashoutBody.copy(str, str2, str3, str4);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 99;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.agentNumber;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 17;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.amount;
        int i4 = i3 + 81;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault + 21;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.currencyFrom;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 49;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.currencyTo;
        int i5 = i2 + 57;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 87 / 0;
        }
        return str;
    }

    public final RoamingCashoutBody copy(String agentNumber, String amount, String currencyFrom, String currencyTo) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(agentNumber, "");
        Intrinsics.checkNotNullParameter(amount, "");
        Intrinsics.checkNotNullParameter(currencyFrom, "");
        Intrinsics.checkNotNullParameter(currencyTo, "");
        RoamingCashoutBody roamingCashoutBody = new RoamingCashoutBody(agentNumber, amount, currencyFrom, currencyTo);
        int i2 = component2 + 51;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return roamingCashoutBody;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 111;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 77;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof RoamingCashoutBody)) {
            int i4 = copydefault + 123;
            component2 = i4 % 128;
            return i4 % 2 == 0;
        }
        RoamingCashoutBody roamingCashoutBody = (RoamingCashoutBody) other;
        if (!Intrinsics.areEqual(this.agentNumber, roamingCashoutBody.agentNumber)) {
            int i5 = copydefault + 85;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.amount, roamingCashoutBody.amount) || !Intrinsics.areEqual(this.currencyFrom, roamingCashoutBody.currencyFrom)) {
            return false;
        }
        if (Intrinsics.areEqual(this.currencyTo, roamingCashoutBody.currencyTo)) {
            int i7 = component2 + 111;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }
        int i9 = copydefault + 37;
        component2 = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 85;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.agentNumber.hashCode() * 31) + this.amount.hashCode()) * 31) + this.currencyFrom.hashCode()) * 31) + this.currencyTo.hashCode();
        int i4 = copydefault + 11;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RoamingCashoutBody(agentNumber=" + this.agentNumber + ", amount=" + this.amount + ", currencyFrom=" + this.currencyFrom + ", currencyTo=" + this.currencyTo + ')';
        int i2 = component2 + 83;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 3;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        String str = this.agentNumber;
        if (i3 == 0) {
            dest.writeString(str);
            dest.writeString(this.amount);
            dest.writeString(this.currencyFrom);
            dest.writeString(this.currencyTo);
            return;
        }
        dest.writeString(str);
        dest.writeString(this.amount);
        dest.writeString(this.currencyFrom);
        dest.writeString(this.currencyTo);
        throw null;
    }
}
