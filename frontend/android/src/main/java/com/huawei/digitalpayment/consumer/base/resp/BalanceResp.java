package com.huawei.digitalpayment.consumer.base.resp;

import com.huawei.http.BaseResp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/BalanceResp;", "Lcom/huawei/http/BaseResp;", "balances", "", "Lcom/huawei/digitalpayment/consumer/base/resp/BalanceItem;", "<init>", "(Ljava/util/List;)V", "getBalances", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BalanceResp extends BaseResp {
    private static int component3 = 0;
    private static int copydefault = 1;
    private final List<BalanceItem> balances;

    public final List<BalanceItem> getBalances() {
        int i = 2 % 2;
        int i2 = component3 + 1;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        List<BalanceItem> list = this.balances;
        int i5 = i3 + 19;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public BalanceResp(List<BalanceItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.balances = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static BalanceResp copy$default(BalanceResp balanceResp, List list, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component3 + 39;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                list = balanceResp.balances;
                int i4 = 64 / 0;
            } else {
                list = balanceResp.balances;
            }
        }
        BalanceResp balanceRespCopy = balanceResp.copy(list);
        int i5 = component3 + 61;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return balanceRespCopy;
    }

    public final List<BalanceItem> component1() {
        int i = 2 % 2;
        int i2 = component3 + 37;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        List<BalanceItem> list = this.balances;
        if (i3 == 0) {
            int i4 = 4 / 0;
        }
        return list;
    }

    public final BalanceResp copy(List<BalanceItem> balances) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(balances, "");
        BalanceResp balanceResp = new BalanceResp(balances);
        int i2 = copydefault + 27;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 72 / 0;
        }
        return balanceResp;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 103;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (other instanceof BalanceResp) {
            return Intrinsics.areEqual(this.balances, ((BalanceResp) other).balances);
        }
        int i4 = i2 + 17;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 27;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.balances.hashCode();
        int i4 = copydefault + 1;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BalanceResp(balances=" + this.balances + ")";
        int i2 = component3 + 33;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
