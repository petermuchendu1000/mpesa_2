package com.huawei.digitalpayment.consumer.base.resp;

import com.huawei.digitalpayment.home.data.local.LocalBalance;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/LocalMpesaFulizaBalance;", "", "localBalance", "Lcom/huawei/digitalpayment/home/data/local/LocalBalance;", "fulizaBalance", "Lcom/huawei/digitalpayment/consumer/base/resp/LocalFulizaBance;", "<init>", "(Lcom/huawei/digitalpayment/home/data/local/LocalBalance;Lcom/huawei/digitalpayment/consumer/base/resp/LocalFulizaBance;)V", "getLocalBalance", "()Lcom/huawei/digitalpayment/home/data/local/LocalBalance;", "setLocalBalance", "(Lcom/huawei/digitalpayment/home/data/local/LocalBalance;)V", "getFulizaBalance", "()Lcom/huawei/digitalpayment/consumer/base/resp/LocalFulizaBance;", "setFulizaBalance", "(Lcom/huawei/digitalpayment/consumer/base/resp/LocalFulizaBance;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LocalMpesaFulizaBalance {
    private static int component1 = 1;
    private static int copydefault;
    private LocalFulizaBance fulizaBalance;
    private LocalBalance localBalance;

    public LocalMpesaFulizaBalance(LocalBalance localBalance, LocalFulizaBance localFulizaBance) {
        Intrinsics.checkNotNullParameter(localBalance, "");
        Intrinsics.checkNotNullParameter(localFulizaBance, "");
        this.localBalance = localBalance;
        this.fulizaBalance = localFulizaBance;
    }

    public final LocalBalance getLocalBalance() {
        int i = 2 % 2;
        int i2 = copydefault + 115;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        LocalBalance localBalance = this.localBalance;
        int i5 = i3 + 1;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return localBalance;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setLocalBalance(LocalBalance localBalance) {
        int i = 2 % 2;
        int i2 = component1 + 59;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(localBalance, "");
            this.localBalance = localBalance;
            int i3 = 23 / 0;
        } else {
            Intrinsics.checkNotNullParameter(localBalance, "");
            this.localBalance = localBalance;
        }
        int i4 = copydefault + 21;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
    }

    public final LocalFulizaBance getFulizaBalance() {
        int i = 2 % 2;
        int i2 = copydefault + 67;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        LocalFulizaBance localFulizaBance = this.fulizaBalance;
        int i5 = i3 + 93;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return localFulizaBance;
    }

    public final void setFulizaBalance(LocalFulizaBance localFulizaBance) {
        int i = 2 % 2;
        int i2 = component1 + 67;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(localFulizaBance, "");
            this.fulizaBalance = localFulizaBance;
        } else {
            Intrinsics.checkNotNullParameter(localFulizaBance, "");
            this.fulizaBalance = localFulizaBance;
            throw null;
        }
    }

    public static LocalMpesaFulizaBalance copy$default(LocalMpesaFulizaBalance localMpesaFulizaBalance, LocalBalance localBalance, LocalFulizaBance localFulizaBance, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = copydefault + 31;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            localBalance = localMpesaFulizaBalance.localBalance;
        }
        if ((i & 2) != 0) {
            int i5 = copydefault + 83;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            localFulizaBance = localMpesaFulizaBalance.fulizaBalance;
        }
        LocalMpesaFulizaBalance localMpesaFulizaBalanceCopy = localMpesaFulizaBalance.copy(localBalance, localFulizaBance);
        int i7 = copydefault + 111;
        component1 = i7 % 128;
        int i8 = i7 % 2;
        return localMpesaFulizaBalanceCopy;
    }

    public final LocalBalance component1() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 73;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        LocalBalance localBalance = this.localBalance;
        int i5 = i2 + 15;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return localBalance;
    }

    public final LocalFulizaBance component2() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 55;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        LocalFulizaBance localFulizaBance = this.fulizaBalance;
        int i5 = i2 + 41;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 86 / 0;
        }
        return localFulizaBance;
    }

    public final LocalMpesaFulizaBalance copy(LocalBalance localBalance, LocalFulizaBance fulizaBalance) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(localBalance, "");
        Intrinsics.checkNotNullParameter(fulizaBalance, "");
        LocalMpesaFulizaBalance localMpesaFulizaBalance = new LocalMpesaFulizaBalance(localBalance, fulizaBalance);
        int i2 = component1 + 111;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return localMpesaFulizaBalance;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalMpesaFulizaBalance)) {
            int i2 = component1 + 25;
            copydefault = i2 % 128;
            return i2 % 2 != 0;
        }
        LocalMpesaFulizaBalance localMpesaFulizaBalance = (LocalMpesaFulizaBalance) other;
        if (!Intrinsics.areEqual(this.localBalance, localMpesaFulizaBalance.localBalance)) {
            int i3 = component1 + 13;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.fulizaBalance, localMpesaFulizaBalance.fulizaBalance)) {
            return true;
        }
        int i5 = copydefault + 23;
        component1 = i5 % 128;
        return i5 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 83;
        component1 = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (this.localBalance.hashCode() >>> 40) * this.fulizaBalance.hashCode() : (this.localBalance.hashCode() * 31) + this.fulizaBalance.hashCode();
        int i3 = component1 + 97;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LocalMpesaFulizaBalance(localBalance=" + this.localBalance + ", fulizaBalance=" + this.fulizaBalance + ")";
        int i2 = component1 + 57;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
