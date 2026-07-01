package com.huawei.digitalpayment.consumer.sfcui.sambaza.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012J8\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÇ\u0001¢\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u0006H\u0007J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H×\u0003J\t\u0010!\u001a\u00020\u0006H×\u0001J\t\u0010\"\u001a\u00020\u0003H×\u0001J\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0006H\u0007R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006("}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/resp/FetchSambazaAccount;", "Landroid/os/Parcelable;", "accountName", "", "accountType", "transferLimit", "", "currentBalance", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;)V", "getAccountName", "()Ljava/lang/String;", "setAccountName", "(Ljava/lang/String;)V", "getAccountType", "getTransferLimit", "()I", "getCurrentBalance", "()Ljava/lang/Integer;", "setCurrentBalance", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;)Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/resp/FetchSambazaAccount;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchSambazaAccount implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<FetchSambazaAccount> CREATOR = new Creator();
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName("accountName")
    private String accountName;

    @SerializedName("accountType")
    private final String accountType;

    @SerializedName("currentBalance")
    private Integer currentBalance;

    @SerializedName("transferLimit")
    private final int transferLimit;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FetchSambazaAccount> {
        private static int component3 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FetchSambazaAccount createFromParcel(Parcel parcel) {
            Integer numValueOf;
            int i = 2 % 2;
            int i2 = component3 + 43;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i4 = parcel.readInt();
            if (parcel.readInt() == 0) {
                int i5 = component3 + 59;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new FetchSambazaAccount(string, string2, i4, numValueOf);
        }

        @Override
        public FetchSambazaAccount createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 85;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            FetchSambazaAccount fetchSambazaAccountCreateFromParcel = createFromParcel(parcel);
            int i4 = copydefault + 47;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                return fetchSambazaAccountCreateFromParcel;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FetchSambazaAccount[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault;
            int i4 = i3 + 89;
            component3 = i4 % 128;
            FetchSambazaAccount[] fetchSambazaAccountArr = new FetchSambazaAccount[i];
            if (i4 % 2 != 0) {
                throw null;
            }
            int i5 = i3 + 21;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return fetchSambazaAccountArr;
        }

        @Override
        public FetchSambazaAccount[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 37;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            FetchSambazaAccount[] fetchSambazaAccountArrNewArray = newArray(i);
            int i5 = copydefault + 21;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return fetchSambazaAccountArrNewArray;
        }
    }

    public FetchSambazaAccount(String str, String str2, int i, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.accountName = str;
        this.accountType = str2;
        this.transferLimit = i;
        this.currentBalance = num;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FetchSambazaAccount(String str, String str2, int i, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 8) != 0) {
            int i3 = copydefault + 117;
            int i4 = i3 % 128;
            component3 = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 31;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 4 % 2;
            } else {
                int i8 = 2 % 2;
            }
            num = null;
        }
        this(str, str2, i, num);
    }

    public final String getAccountName() {
        int i = 2 % 2;
        int i2 = component3 + 69;
        int i3 = i2 % 128;
        copydefault = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.accountName;
        int i4 = i3 + 87;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final void setAccountName(String str) {
        int i = 2 % 2;
        int i2 = component3 + 99;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.accountName = str;
        int i4 = copydefault + 21;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 19 / 0;
        }
    }

    public final String getAccountType() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 75;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.accountType;
        int i4 = i2 + 39;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
        return str;
    }

    public final int getTransferLimit() {
        int i = 2 % 2;
        int i2 = copydefault + 33;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.transferLimit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer getCurrentBalance() {
        int i = 2 % 2;
        int i2 = component3 + 99;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.currentBalance;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setCurrentBalance(Integer num) {
        int i = 2 % 2;
        int i2 = component3 + 57;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.currentBalance = num;
        int i5 = i3 + 59;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    static {
        int i = component1 + 59;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public static FetchSambazaAccount copy$default(FetchSambazaAccount fetchSambazaAccount, String str, String str2, int i, Integer num, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            str = fetchSambazaAccount.accountName;
        }
        if ((i2 & 2) != 0) {
            int i4 = copydefault + 125;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            str2 = fetchSambazaAccount.accountType;
        }
        if ((i2 & 4) != 0) {
            int i6 = component3 + 35;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            i = fetchSambazaAccount.transferLimit;
        }
        if ((i2 & 8) != 0) {
            num = fetchSambazaAccount.currentBalance;
            int i8 = component3 + 19;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
        }
        FetchSambazaAccount fetchSambazaAccountCopy = fetchSambazaAccount.copy(str, str2, i, num);
        int i10 = copydefault + 51;
        component3 = i10 % 128;
        int i11 = i10 % 2;
        return fetchSambazaAccountCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 81;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.accountName;
        int i5 = i3 + 71;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 15 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3 + 7;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.accountType;
        int i5 = i3 + 111;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 66 / 0;
        }
        return str;
    }

    public final int component3() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 101;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.transferLimit;
        int i6 = i2 + 23;
        copydefault = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 57 / 0;
        }
        return i5;
    }

    public final Integer component4() {
        int i = 2 % 2;
        int i2 = copydefault + 57;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.currentBalance;
        if (i3 == 0) {
            int i4 = 67 / 0;
        }
        return num;
    }

    public final FetchSambazaAccount copy(String accountName, String accountType, int transferLimit, Integer currentBalance) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(accountName, "");
        Intrinsics.checkNotNullParameter(accountType, "");
        FetchSambazaAccount fetchSambazaAccount = new FetchSambazaAccount(accountName, accountType, transferLimit, currentBalance);
        int i2 = component3 + 107;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return fetchSambazaAccount;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 115;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 67;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 44 / 0;
        }
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof FetchSambazaAccount)) {
            int i2 = copydefault + 63;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        FetchSambazaAccount fetchSambazaAccount = (FetchSambazaAccount) other;
        if (!Intrinsics.areEqual(this.accountName, fetchSambazaAccount.accountName) || !Intrinsics.areEqual(this.accountType, fetchSambazaAccount.accountType)) {
            return false;
        }
        if (this.transferLimit != fetchSambazaAccount.transferLimit) {
            int i4 = component3 + 107;
            copydefault = i4 % 128;
            return i4 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.currentBalance, fetchSambazaAccount.currentBalance)) {
            return true;
        }
        int i5 = copydefault + 29;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = copydefault + 61;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            this.accountName.hashCode();
            this.accountType.hashCode();
            Integer.hashCode(this.transferLimit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode2 = this.accountName.hashCode();
        int iHashCode3 = this.accountType.hashCode();
        int iHashCode4 = Integer.hashCode(this.transferLimit);
        Integer num = this.currentBalance;
        if (num == null) {
            int i3 = component3 + 65;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
        }
        return (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FetchSambazaAccount(accountName=" + this.accountName + ", accountType=" + this.accountType + ", transferLimit=" + this.transferLimit + ", currentBalance=" + this.currentBalance + ")";
        int i2 = component3 + 29;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int iIntValue;
        int i = 2 % 2;
        int i2 = copydefault + 75;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.accountName);
        dest.writeString(this.accountType);
        dest.writeInt(this.transferLimit);
        Integer num = this.currentBalance;
        if (num == null) {
            int i4 = component3 + 119;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
    }
}
