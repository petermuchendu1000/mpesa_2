package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/BalanceInfo;", "", "balance", "", "currency", "isOutdated", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getBalance", "()Ljava/lang/String;", "getCurrency", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BalanceInfo {
    public static final int $stable = 0;
    private static int component2 = 0;
    private static int component4 = 1;
    private static int copydefault = 107 % 128;
    private static int equals;
    private final String ShareDataUIState;
    private final String component1;
    private final boolean component3;

    public BalanceInfo(String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.ShareDataUIState = str;
        this.component1 = str2;
        this.component3 = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BalanceInfo(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            int i2 = component4;
            int i3 = i2 + 67;
            equals = i3 % 128;
            boolean z2 = i3 % 2 != 0;
            int i4 = i2 + 5;
            equals = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            z = z2;
        }
        this(str, str2, z);
    }

    public final String getBalance() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 21;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ShareDataUIState;
        int i5 = i2 + 7;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getCurrency() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 111;
        equals = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 103;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean isOutdated() {
        boolean z;
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 75;
        component4 = i3 % 128;
        if (i3 % 2 == 0) {
            z = this.component3;
            int i4 = 99 / 0;
        } else {
            z = this.component3;
        }
        int i5 = i2 + 121;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 29 / 0;
        }
        return z;
    }

    static {
        if (107 % 2 == 0) {
            throw null;
        }
    }

    public static BalanceInfo copy$default(BalanceInfo balanceInfo, String str, String str2, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = balanceInfo.ShareDataUIState;
        }
        if ((i & 2) != 0) {
            int i3 = equals + 85;
            component4 = i3 % 128;
            if (i3 % 2 == 0) {
                str2 = balanceInfo.component1;
                int i4 = 61 / 0;
            } else {
                str2 = balanceInfo.component1;
            }
        }
        if ((i & 4) != 0) {
            z = balanceInfo.component3;
        }
        BalanceInfo balanceInfoCopy = balanceInfo.copy(str, str2, z);
        int i5 = equals + 95;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 78 / 0;
        }
        return balanceInfoCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component4 + 39;
        int i3 = i2 % 128;
        equals = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.ShareDataUIState;
        int i4 = i3 + 91;
        component4 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 42 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component4 + 85;
        int i3 = i2 % 128;
        equals = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.component1;
        int i4 = i3 + 57;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final boolean component3() {
        int i = 2 % 2;
        int i2 = component4 + 51;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final BalanceInfo copy(String balance, String currency, boolean isOutdated) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(balance, "");
        Intrinsics.checkNotNullParameter(currency, "");
        BalanceInfo balanceInfo = new BalanceInfo(balance, currency, isOutdated);
        int i2 = component4 + 105;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return balanceInfo;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component4 + 117;
            equals = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(other instanceof BalanceInfo)) {
            return false;
        }
        BalanceInfo balanceInfo = (BalanceInfo) other;
        if ((!Intrinsics.areEqual(this.ShareDataUIState, balanceInfo.ShareDataUIState)) || !Intrinsics.areEqual(this.component1, balanceInfo.component1)) {
            return false;
        }
        if (this.component3 == balanceInfo.component3) {
            return true;
        }
        int i3 = equals + 49;
        component4 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 14 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component4 + 121;
        equals = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.ShareDataUIState.hashCode() * 31) + this.component1.hashCode()) * 31) + Boolean.hashCode(this.component3);
        int i4 = equals + 97;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BalanceInfo(balance=" + this.ShareDataUIState + ", currency=" + this.component1 + ", isOutdated=" + this.component3 + ')';
        int i2 = component4 + 3;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
