package com.huawei.digitalpayment.home.data.source.remote;

import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/home/data/source/remote/RemoteBalance;", "Lcom/huawei/http/BaseResp;", "amount", "", "unitType", "amountDisplay", "currency", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getUnitType", "getAmountDisplay", "getCurrency", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RemoteBalance extends BaseResp {
    private static int component2 = 0;
    private static int copydefault = 1;
    private final String amount;
    private final String amountDisplay;
    private final String currency;
    private final String unitType;

    public final String getAmount() {
        String str;
        int i = 2 % 2;
        int i2 = component2 + 65;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            str = this.amount;
            int i4 = 50 / 0;
        } else {
            str = this.amount;
        }
        int i5 = i3 + 109;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getUnitType() {
        int i = 2 % 2;
        int i2 = component2 + 87;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.unitType;
        }
        throw null;
    }

    public final String getAmountDisplay() {
        int i = 2 % 2;
        int i2 = copydefault + 117;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.amountDisplay;
        }
        throw null;
    }

    public final String getCurrency() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 47;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.currency;
        int i5 = i2 + 61;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 17 / 0;
        }
        return str;
    }

    public RemoteBalance(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.amount = str;
        this.unitType = str2;
        this.amountDisplay = str3;
        this.currency = str4;
    }

    public static RemoteBalance copy$default(RemoteBalance remoteBalance, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2 + 27;
        int i4 = i3 % 128;
        copydefault = i4;
        if (i3 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            int i5 = i4 + 119;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                str = remoteBalance.amount;
                int i6 = 10 / 0;
            } else {
                str = remoteBalance.amount;
            }
        }
        if ((i & 2) != 0) {
            int i7 = i4 + 35;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            str2 = remoteBalance.unitType;
            if (i8 != 0) {
                int i9 = 23 / 0;
            }
        }
        if ((i & 4) != 0) {
            int i10 = component2 + 107;
            copydefault = i10 % 128;
            int i11 = i10 % 2;
            str3 = remoteBalance.amountDisplay;
        }
        if ((i & 8) != 0) {
            int i12 = copydefault + 103;
            component2 = i12 % 128;
            int i13 = i12 % 2;
            str4 = remoteBalance.currency;
        }
        RemoteBalance remoteBalanceCopy = remoteBalance.copy(str, str2, str3, str4);
        int i14 = copydefault + 39;
        component2 = i14 % 128;
        if (i14 % 2 == 0) {
            return remoteBalanceCopy;
        }
        throw null;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 13;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.amount;
        if (i3 == 0) {
            int i4 = 99 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 105;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.unitType;
        int i5 = i2 + 87;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2 + 75;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.amountDisplay;
        if (i3 == 0) {
            int i4 = 27 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2 + 41;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.currency;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final RemoteBalance copy(String amount, String unitType, String amountDisplay, String currency) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(amount, "");
        Intrinsics.checkNotNullParameter(unitType, "");
        Intrinsics.checkNotNullParameter(amountDisplay, "");
        Intrinsics.checkNotNullParameter(currency, "");
        RemoteBalance remoteBalance = new RemoteBalance(amount, unitType, amountDisplay, currency);
        int i2 = copydefault + 63;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return remoteBalance;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if ((r6 instanceof com.huawei.digitalpayment.home.data.source.remote.RemoteBalance) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r6 = (com.huawei.digitalpayment.home.data.source.remote.RemoteBalance) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.amount, r6.amount)) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        r6 = com.huawei.digitalpayment.home.data.source.remote.RemoteBalance.copydefault + 109;
        com.huawei.digitalpayment.home.data.source.remote.RemoteBalance.component2 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.unitType, r6.unitType) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.amountDisplay, r6.amountDisplay) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        r6 = com.huawei.digitalpayment.home.data.source.remote.RemoteBalance.component2;
        r1 = r6 + 83;
        com.huawei.digitalpayment.home.data.source.remote.RemoteBalance.copydefault = r1 % 128;
        r1 = r1 % 2;
        r6 = r6 + 91;
        com.huawei.digitalpayment.home.data.source.remote.RemoteBalance.copydefault = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.currency, r6.currency) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        r6 = com.huawei.digitalpayment.home.data.source.remote.RemoteBalance.copydefault + 17;
        com.huawei.digitalpayment.home.data.source.remote.RemoteBalance.component2 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r1 = r1 + 67;
        com.huawei.digitalpayment.home.data.source.remote.RemoteBalance.copydefault = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.home.data.source.remote.RemoteBalance.component2
            int r2 = r1 + 101
            int r3 = r2 % 128
            com.huawei.digitalpayment.home.data.source.remote.RemoteBalance.copydefault = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L16
            r2 = 68
            int r2 = r2 / r4
            if (r5 != r6) goto L20
            goto L18
        L16:
            if (r5 != r6) goto L20
        L18:
            int r1 = r1 + 67
            int r6 = r1 % 128
            com.huawei.digitalpayment.home.data.source.remote.RemoteBalance.copydefault = r6
            int r1 = r1 % r0
            return r3
        L20:
            boolean r1 = r6 instanceof com.huawei.digitalpayment.home.data.source.remote.RemoteBalance
            if (r1 != 0) goto L25
            return r4
        L25:
            com.huawei.digitalpayment.home.data.source.remote.RemoteBalance r6 = (com.huawei.digitalpayment.home.data.source.remote.RemoteBalance) r6
            java.lang.String r1 = r5.amount
            java.lang.String r2 = r6.amount
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            r1 = r1 ^ r3
            if (r1 == 0) goto L3c
            int r6 = com.huawei.digitalpayment.home.data.source.remote.RemoteBalance.copydefault
            int r6 = r6 + 109
            int r1 = r6 % 128
            com.huawei.digitalpayment.home.data.source.remote.RemoteBalance.component2 = r1
            int r6 = r6 % r0
            return r4
        L3c:
            java.lang.String r1 = r5.unitType
            java.lang.String r2 = r6.unitType
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L47
            return r4
        L47:
            java.lang.String r1 = r5.amountDisplay
            java.lang.String r2 = r6.amountDisplay
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L62
            int r6 = com.huawei.digitalpayment.home.data.source.remote.RemoteBalance.component2
            int r1 = r6 + 83
            int r2 = r1 % 128
            com.huawei.digitalpayment.home.data.source.remote.RemoteBalance.copydefault = r2
            int r1 = r1 % r0
            int r6 = r6 + 91
            int r1 = r6 % 128
            com.huawei.digitalpayment.home.data.source.remote.RemoteBalance.copydefault = r1
            int r6 = r6 % r0
            return r4
        L62:
            java.lang.String r1 = r5.currency
            java.lang.String r6 = r6.currency
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
            if (r6 != 0) goto L76
            int r6 = com.huawei.digitalpayment.home.data.source.remote.RemoteBalance.copydefault
            int r6 = r6 + 17
            int r1 = r6 % 128
            com.huawei.digitalpayment.home.data.source.remote.RemoteBalance.component2 = r1
            int r6 = r6 % r0
            return r4
        L76:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.home.data.source.remote.RemoteBalance.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 45;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.amount.hashCode() * 31) + this.unitType.hashCode()) * 31) + this.amountDisplay.hashCode()) * 31) + this.currency.hashCode();
        int i4 = component2 + 27;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RemoteBalance(amount=" + this.amount + ", unitType=" + this.unitType + ", amountDisplay=" + this.amountDisplay + ", currency=" + this.currency + ")";
        int i2 = copydefault + 91;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
