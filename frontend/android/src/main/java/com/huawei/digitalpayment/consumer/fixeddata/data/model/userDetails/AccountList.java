package com.huawei.digitalpayment.consumer.fixeddata.data.model.userDetails;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/userDetails/AccountList;", "Landroid/os/Parcelable;", "lastMile", "", "accounts", "", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/userDetails/Account;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getLastMile", "()Ljava/lang/String;", "getAccounts", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AccountList implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<AccountList> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    @SerializedName("accounts")
    private final List<Account> accounts;

    @SerializedName("lastMile")
    private final String lastMile;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AccountList> {
        private static int component2 = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final AccountList createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                int i4 = component3 + 57;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                arrayList.add(Account.CREATOR.createFromParcel(parcel));
            }
            AccountList accountList = new AccountList(string, arrayList);
            int i6 = component3 + 41;
            component2 = i6 % 128;
            if (i6 % 2 != 0) {
                return accountList;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public AccountList createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 25;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                createFromParcel(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            AccountList accountListCreateFromParcel = createFromParcel(parcel);
            int i3 = component3 + 71;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            return accountListCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final AccountList[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2;
            int i4 = i3 + 121;
            component3 = i4 % 128;
            AccountList[] accountListArr = new AccountList[i];
            if (i4 % 2 != 0) {
                throw null;
            }
            int i5 = i3 + 81;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return accountListArr;
        }

        @Override
        public AccountList[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 5;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                return newArray(i);
            }
            newArray(i);
            throw null;
        }
    }

    public AccountList(String str, List<Account> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.lastMile = str;
        this.accounts = list;
    }

    public final String getLastMile() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 43;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.lastMile;
        int i5 = i2 + 51;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<Account> getAccounts() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        List<Account> list = this.accounts;
        int i5 = i3 + 61;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    static {
        int i = component3 + 117;
        component1 = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AccountList copy$default(AccountList accountList, String str, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 39;
        int i4 = i3 % 128;
        copydefault = i4;
        if (i3 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            int i5 = i4 + 29;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            str = accountList.lastMile;
            int i7 = i4 + 47;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
        }
        if ((i & 2) != 0) {
            int i9 = ShareDataUIState + 47;
            copydefault = i9 % 128;
            if (i9 % 2 == 0) {
                list = accountList.accounts;
                int i10 = 12 / 0;
            } else {
                list = accountList.accounts;
            }
        }
        return accountList.copy(str, list);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 105;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.lastMile;
        int i5 = i2 + 107;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<Account> component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 9;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        List<Account> list = this.accounts;
        int i5 = i2 + 41;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final AccountList copy(String lastMile, List<Account> accounts) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(lastMile, "");
        Intrinsics.checkNotNullParameter(accounts, "");
        AccountList accountList = new AccountList(lastMile, accounts);
        int i2 = copydefault + 65;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return accountList;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 21;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 99;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 39;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof AccountList)) {
            return false;
        }
        AccountList accountList = (AccountList) other;
        if (!Intrinsics.areEqual(this.lastMile, accountList.lastMile)) {
            int i4 = ShareDataUIState + 67;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.accounts, accountList.accounts)) {
            return true;
        }
        int i6 = copydefault + 31;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 3;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.lastMile.hashCode() * 31) + this.accounts.hashCode();
        int i4 = copydefault + 5;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AccountList(lastMile=" + this.lastMile + ", accounts=" + this.accounts + ")";
        int i2 = ShareDataUIState + 53;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 85;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 != 0) {
            dest.writeString(this.lastMile);
            List<Account> list = this.accounts;
            dest.writeInt(list.size());
            list.iterator();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        dest.writeString(this.lastMile);
        List<Account> list2 = this.accounts;
        dest.writeInt(list2.size());
        Iterator<Account> it = list2.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        int i4 = copydefault + 119;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }
}
