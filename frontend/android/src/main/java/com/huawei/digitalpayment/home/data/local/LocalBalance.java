package com.huawei.digitalpayment.home.data.local;

import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/home/data/local/LocalBalance;", "Lcom/huawei/http/BaseResp;", "balance", "", "unitType", "amountDisplay", "currency", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBalance", "()Ljava/lang/String;", "getUnitType", "getAmountDisplay", "getCurrency", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LocalBalance extends BaseResp {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private final String amountDisplay;
    private final String balance;
    private final String currency;
    private final String unitType;

    /* JADX WARN: Illegal instructions before constructor call */
    public LocalBalance(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = ShareDataUIState + 103;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i5 = component2 + 87;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str2 = null;
        }
        str3 = (i & 4) != 0 ? null : str3;
        if ((i & 8) != 0) {
            int i8 = component2 + 11;
            ShareDataUIState = i8 % 128;
            if (i8 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str4 = null;
        }
        this(str, str2, str3, str4);
    }

    public final String getBalance() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 87;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.balance;
        int i5 = i3 + 103;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getUnitType() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 71;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.unitType;
        }
        throw null;
    }

    public final String getAmountDisplay() {
        int i = 2 % 2;
        int i2 = component2 + 9;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.amountDisplay;
        }
        throw null;
    }

    public final String getCurrency() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 51;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.currency;
        int i5 = i2 + 63;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public LocalBalance(String str, String str2, String str3, String str4) {
        this.balance = str;
        this.unitType = str2;
        this.amountDisplay = str3;
        this.currency = str4;
    }

    public LocalBalance() {
        this(null, null, null, null, 15, null);
    }

    public static LocalBalance copy$default(LocalBalance localBalance, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 75;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 69;
            component2 = i6 % 128;
            if (i6 % 2 == 0) {
                str = localBalance.balance;
                int i7 = 87 / 0;
            } else {
                str = localBalance.balance;
            }
        }
        if ((i & 2) != 0) {
            str2 = localBalance.unitType;
        }
        if ((i & 4) != 0) {
            int i8 = i3 + 65;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            str3 = localBalance.amountDisplay;
            int i10 = i3 + 63;
            component2 = i10 % 128;
            int i11 = i10 % 2;
        }
        if ((i & 8) != 0) {
            int i12 = i3 + 67;
            component2 = i12 % 128;
            int i13 = i12 % 2;
            str4 = localBalance.currency;
        }
        return localBalance.copy(str, str2, str3, str4);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 87;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.balance;
        int i5 = i2 + 31;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 119;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.unitType;
        int i5 = i3 + 81;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 11 / 0;
        }
        return str;
    }

    public final String component3() {
        String str;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 73;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.amountDisplay;
            int i4 = 97 / 0;
        } else {
            str = this.amountDisplay;
        }
        int i5 = i2 + 3;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 31;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.currency;
            int i4 = 85 / 0;
        } else {
            str = this.currency;
        }
        int i5 = i2 + 13;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final LocalBalance copy(String balance, String unitType, String amountDisplay, String currency) {
        int i = 2 % 2;
        LocalBalance localBalance = new LocalBalance(balance, unitType, amountDisplay, currency);
        int i2 = ShareDataUIState + 53;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return localBalance;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2 + 95;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalBalance)) {
            return false;
        }
        LocalBalance localBalance = (LocalBalance) other;
        if (!Intrinsics.areEqual(this.balance, localBalance.balance)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.unitType, localBalance.unitType))) {
            return Intrinsics.areEqual(this.amountDisplay, localBalance.amountDisplay) && Intrinsics.areEqual(this.currency, localBalance.currency);
        }
        int i4 = ShareDataUIState + 51;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.home.data.local.LocalBalance.ShareDataUIState
            int r2 = r1 + 85
            int r3 = r2 % 128
            com.huawei.digitalpayment.home.data.local.LocalBalance.component2 = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L16
            java.lang.String r2 = r7.balance
            if (r2 != 0) goto L28
            r2 = r3
            goto L1b
        L16:
            java.lang.String r2 = r7.balance
            if (r2 != 0) goto L27
            r2 = r4
        L1b:
            int r1 = r1 + 97
            int r5 = r1 % 128
            com.huawei.digitalpayment.home.data.local.LocalBalance.component2 = r5
            int r1 = r1 % r0
            if (r1 != 0) goto L25
            goto L2e
        L25:
            r3 = r4
            goto L2e
        L27:
            r3 = r4
        L28:
            int r1 = r2.hashCode()
            r2 = r3
            r3 = r1
        L2e:
            java.lang.String r1 = r7.unitType
            if (r1 != 0) goto L3d
            int r1 = com.huawei.digitalpayment.home.data.local.LocalBalance.ShareDataUIState
            int r1 = r1 + 41
            int r5 = r1 % 128
            com.huawei.digitalpayment.home.data.local.LocalBalance.component2 = r5
            int r1 = r1 % r0
            r1 = r4
            goto L4a
        L3d:
            int r1 = r1.hashCode()
            int r5 = com.huawei.digitalpayment.home.data.local.LocalBalance.component2
            int r5 = r5 + 11
            int r6 = r5 % 128
            com.huawei.digitalpayment.home.data.local.LocalBalance.ShareDataUIState = r6
            int r5 = r5 % r0
        L4a:
            java.lang.String r5 = r7.amountDisplay
            if (r5 != 0) goto L58
            int r5 = com.huawei.digitalpayment.home.data.local.LocalBalance.ShareDataUIState
            int r5 = r5 + 71
            int r6 = r5 % 128
            com.huawei.digitalpayment.home.data.local.LocalBalance.component2 = r6
            int r5 = r5 % r0
            goto L5c
        L58:
            int r4 = r5.hashCode()
        L5c:
            java.lang.String r0 = r7.currency
            if (r0 != 0) goto L61
            goto L65
        L61:
            int r2 = r0.hashCode()
        L65:
            int r3 = r3 * 31
            int r3 = r3 + r1
            int r3 = r3 * 31
            int r3 = r3 + r4
            int r3 = r3 * 31
            int r3 = r3 + r2
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.home.data.local.LocalBalance.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LocalBalance(balance=" + this.balance + ", unitType=" + this.unitType + ", amountDisplay=" + this.amountDisplay + ", currency=" + this.currency + ")";
        int i2 = ShareDataUIState + 67;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
