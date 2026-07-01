package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u000eH×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/sendtobank/BankComboValueItemAdditionalInfo;", "Landroid/os/Parcelable;", "key", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BankComboValueItemAdditionalInfo implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<BankComboValueItemAdditionalInfo> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;

    @SerializedName("Key")
    private final String key;

    @SerializedName("Value")
    private final String value;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BankComboValueItemAdditionalInfo> {
        private static int component2 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BankComboValueItemAdditionalInfo createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            BankComboValueItemAdditionalInfo bankComboValueItemAdditionalInfo = new BankComboValueItemAdditionalInfo(parcel.readString(), parcel.readString());
            int i2 = copydefault + 95;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return bankComboValueItemAdditionalInfo;
            }
            throw null;
        }

        @Override
        public BankComboValueItemAdditionalInfo createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 33;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            BankComboValueItemAdditionalInfo bankComboValueItemAdditionalInfoCreateFromParcel = createFromParcel(parcel);
            int i4 = copydefault + 125;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return bankComboValueItemAdditionalInfoCreateFromParcel;
            }
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BankComboValueItemAdditionalInfo[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 1;
            component2 = i3 % 128;
            BankComboValueItemAdditionalInfo[] bankComboValueItemAdditionalInfoArr = new BankComboValueItemAdditionalInfo[i];
            if (i3 % 2 != 0) {
                return bankComboValueItemAdditionalInfoArr;
            }
            throw null;
        }

        @Override
        public BankComboValueItemAdditionalInfo[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 31;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                return newArray(i);
            }
            newArray(i);
            throw null;
        }
    }

    public BankComboValueItemAdditionalInfo(String str, String str2) {
        this.key = str;
        this.value = str2;
    }

    public final String getKey() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 89;
        component2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.key;
        int i4 = i2 + 47;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = component2 + 99;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.value;
        int i5 = i3 + 27;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = ShareDataUIState + 19;
        copydefault = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static BankComboValueItemAdditionalInfo copy$default(BankComboValueItemAdditionalInfo bankComboValueItemAdditionalInfo, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component3 + 39;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            str = bankComboValueItemAdditionalInfo.key;
        }
        if ((i & 2) != 0) {
            int i5 = component2 + 15;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                String str3 = bankComboValueItemAdditionalInfo.value;
                throw null;
            }
            str2 = bankComboValueItemAdditionalInfo.value;
        }
        return bankComboValueItemAdditionalInfo.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 53;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.key;
        int i5 = i2 + 87;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 117;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.value;
        int i5 = i2 + 37;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 34 / 0;
        }
        return str;
    }

    public final BankComboValueItemAdditionalInfo copy(String key, String value) {
        int i = 2 % 2;
        BankComboValueItemAdditionalInfo bankComboValueItemAdditionalInfo = new BankComboValueItemAdditionalInfo(key, value);
        int i2 = component3 + 1;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return bankComboValueItemAdditionalInfo;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 19;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 63;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 65;
        int i4 = i3 % 128;
        component3 = i4;
        int i5 = i3 % 2;
        if (this == other) {
            int i6 = i2 + 75;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(other instanceof BankComboValueItemAdditionalInfo)) {
            int i8 = i4 + 107;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        BankComboValueItemAdditionalInfo bankComboValueItemAdditionalInfo = (BankComboValueItemAdditionalInfo) other;
        if (Intrinsics.areEqual(this.key, bankComboValueItemAdditionalInfo.key)) {
            return !(Intrinsics.areEqual(this.value, bankComboValueItemAdditionalInfo.value) ^ true);
        }
        int i10 = component3 + 85;
        component2 = i10 % 128;
        return i10 % 2 == 0;
    }

    public int hashCode() {
        String str;
        int iHashCode;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 89;
        component2 = i3 % 128;
        if (i3 % 2 != 0 ? (str = this.key) != null : (str = this.key) != null) {
            iHashCode = str.hashCode();
            int i4 = component2 + 15;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        } else {
            int i6 = i2 + 53;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            iHashCode = 0;
        }
        String str2 = this.value;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BankComboValueItemAdditionalInfo(key=" + this.key + ", value=" + this.value + ')';
        int i2 = component3 + 111;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 9;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.key);
        dest.writeString(this.value);
        int i4 = component2 + 67;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 67 / 0;
        }
    }
}
