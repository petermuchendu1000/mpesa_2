package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.roamingcashout.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u000eH×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/roamingcashout/model/RoamingCashoutCurrency;", "Landroid/os/Parcelable;", "value", "", "currencyID", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getCurrencyID", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RoamingCashoutCurrency implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<RoamingCashoutCurrency> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component2;
    private static int component3;
    private final String currencyID;
    private final String value;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RoamingCashoutCurrency> {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final RoamingCashoutCurrency createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            RoamingCashoutCurrency roamingCashoutCurrency = new RoamingCashoutCurrency(parcel.readString(), parcel.readString());
            int i2 = component1 + 121;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return roamingCashoutCurrency;
        }

        @Override
        public RoamingCashoutCurrency createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 37;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            RoamingCashoutCurrency roamingCashoutCurrencyCreateFromParcel = createFromParcel(parcel);
            int i4 = ShareDataUIState + 15;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 77 / 0;
            }
            return roamingCashoutCurrencyCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final RoamingCashoutCurrency[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 27;
            component1 = i3 % 128;
            RoamingCashoutCurrency[] roamingCashoutCurrencyArr = new RoamingCashoutCurrency[i];
            if (i3 % 2 == 0) {
                int i4 = 97 / 0;
            }
            return roamingCashoutCurrencyArr;
        }

        @Override
        public RoamingCashoutCurrency[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 95;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                return newArray(i);
            }
            newArray(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public RoamingCashoutCurrency(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.value = str;
        this.currencyID = str2;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 77;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.value;
        int i5 = i2 + 91;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 54 / 0;
        }
        return str;
    }

    public final String getCurrencyID() {
        int i = 2 % 2;
        int i2 = component3 + 65;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.currencyID;
        int i5 = i3 + 125;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = component1 + 89;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public static RoamingCashoutCurrency copy$default(RoamingCashoutCurrency roamingCashoutCurrency, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = ShareDataUIState + 25;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            str = roamingCashoutCurrency.value;
        }
        if ((i & 2) != 0) {
            int i5 = ShareDataUIState + 55;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            str2 = roamingCashoutCurrency.currencyID;
        }
        return roamingCashoutCurrency.copy(str, str2);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 73;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.value;
            int i4 = 37 / 0;
        } else {
            str = this.value;
        }
        int i5 = i2 + 25;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3 + 35;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.currencyID;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final RoamingCashoutCurrency copy(String value, String currencyID) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(value, "");
        Intrinsics.checkNotNullParameter(currencyID, "");
        RoamingCashoutCurrency roamingCashoutCurrency = new RoamingCashoutCurrency(value, currencyID);
        int i2 = component3 + 15;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 95 / 0;
        }
        return roamingCashoutCurrency;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 115;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 83;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoamingCashoutCurrency)) {
            int i2 = ShareDataUIState + 125;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        RoamingCashoutCurrency roamingCashoutCurrency = (RoamingCashoutCurrency) other;
        if (Intrinsics.areEqual(this.value, roamingCashoutCurrency.value)) {
            return Intrinsics.areEqual(this.currencyID, roamingCashoutCurrency.currencyID);
        }
        int i4 = ShareDataUIState + 35;
        component3 = i4 % 128;
        return i4 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 33;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.value.hashCode() * 31) + this.currencyID.hashCode();
        int i4 = component3 + 35;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RoamingCashoutCurrency(value=" + this.value + ", currencyID=" + this.currencyID + ')';
        int i2 = component3 + 15;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 36 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 29;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.value);
        dest.writeString(this.currencyID);
        int i4 = component3 + 119;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }
}
