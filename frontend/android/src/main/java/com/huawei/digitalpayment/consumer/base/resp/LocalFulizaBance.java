package com.huawei.digitalpayment.consumer.base.resp;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/LocalFulizaBance;", "", "fulizaStatus", "", "balance", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFulizaStatus", "()Ljava/lang/String;", "getBalance", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LocalFulizaBance {
    private static int component3 = 0;
    private static int copydefault = 1;
    private final String balance;
    private final String fulizaStatus;

    public LocalFulizaBance(String str, String str2) {
        this.fulizaStatus = str;
        this.balance = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LocalFulizaBance(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = component3 + 49;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                str = "Inactive";
                int i3 = 2 % 2;
            } else {
                throw null;
            }
        }
        if ((i & 2) != 0) {
            int i4 = component3 + 63;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = 2 % 2;
            str2 = null;
        }
        this(str, str2);
    }

    public final String getFulizaStatus() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 35;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.fulizaStatus;
            int i4 = 51 / 0;
        } else {
            str = this.fulizaStatus;
        }
        int i5 = i2 + 25;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getBalance() {
        int i = 2 % 2;
        int i2 = component3 + 125;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.balance;
        if (i3 == 0) {
            int i4 = 8 / 0;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LocalFulizaBance() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static LocalFulizaBance copy$default(LocalFulizaBance localFulizaBance, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault;
        int i4 = i3 + 5;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 59;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            str = localFulizaBance.fulizaStatus;
        }
        if ((i & 2) != 0) {
            str2 = localFulizaBance.balance;
        }
        LocalFulizaBance localFulizaBanceCopy = localFulizaBance.copy(str, str2);
        int i8 = copydefault + 23;
        component3 = i8 % 128;
        if (i8 % 2 == 0) {
            return localFulizaBanceCopy;
        }
        throw null;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 47;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.fulizaStatus;
        int i5 = i3 + 99;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault + 45;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.balance;
        }
        throw null;
    }

    public final LocalFulizaBance copy(String fulizaStatus, String balance) {
        int i = 2 % 2;
        LocalFulizaBance localFulizaBance = new LocalFulizaBance(fulizaStatus, balance);
        int i2 = copydefault + 11;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return localFulizaBance;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalFulizaBance)) {
            int i2 = copydefault + 101;
            component3 = i2 % 128;
            return i2 % 2 != 0;
        }
        LocalFulizaBance localFulizaBance = (LocalFulizaBance) other;
        if (!Intrinsics.areEqual(this.fulizaStatus, localFulizaBance.fulizaStatus)) {
            return false;
        }
        if (Intrinsics.areEqual(this.balance, localFulizaBance.balance)) {
            return true;
        }
        int i3 = component3 + 97;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        String str;
        int iHashCode;
        int i = 2 % 2;
        int i2 = component3 + 73;
        int i3 = i2 % 128;
        copydefault = i3;
        int iHashCode2 = 0;
        if (i2 % 2 == 0) {
            str = this.fulizaStatus;
            iHashCode = 1;
            if (str != null) {
                iHashCode2 = 1;
                iHashCode = iHashCode2;
                iHashCode2 = str.hashCode();
            }
            int i4 = i3 + 119;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        } else {
            str = this.fulizaStatus;
            if (str == null) {
                iHashCode = 0;
                int i42 = i3 + 119;
                component3 = i42 % 128;
                int i52 = i42 % 2;
            }
            iHashCode = iHashCode2;
            iHashCode2 = str.hashCode();
        }
        String str2 = this.balance;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LocalFulizaBance(fulizaStatus=" + this.fulizaStatus + ", balance=" + this.balance + ")";
        int i2 = copydefault + 109;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
