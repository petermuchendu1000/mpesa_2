package com.huawei.digitalpayment.common.theme.data;

import com.huawei.http.BaseResp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/data/QueryMultiBalanceResp;", "Lcom/huawei/http/BaseResp;", "balances", "", "Lcom/huawei/digitalpayment/common/theme/data/MultiBalanceItem;", "<init>", "(Ljava/util/List;)V", "getBalances", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryMultiBalanceResp extends BaseResp {
    private static int component2 = 1;
    private static int component3;
    private final List<MultiBalanceItem> balances;

    /* JADX WARN: Illegal instructions before constructor call */
    public QueryMultiBalanceResp(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component2 + 103;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 61 / 0;
            }
            int i4 = 2 % 2;
            list = null;
        }
        this(list);
    }

    public final List<MultiBalanceItem> getBalances() {
        int i = 2 % 2;
        int i2 = component3 + 125;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        List<MultiBalanceItem> list = this.balances;
        int i5 = i3 + 79;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public QueryMultiBalanceResp(List<MultiBalanceItem> list) {
        this.balances = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QueryMultiBalanceResp() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static QueryMultiBalanceResp copy$default(QueryMultiBalanceResp queryMultiBalanceResp, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2 + 103;
        int i4 = i3 % 128;
        component3 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 35;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            list = queryMultiBalanceResp.balances;
            if (i7 == 0) {
                int i8 = 71 / 0;
            }
        }
        return queryMultiBalanceResp.copy(list);
    }

    public final List<MultiBalanceItem> component1() {
        List<MultiBalanceItem> list;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 95;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            list = this.balances;
            int i4 = 46 / 0;
        } else {
            list = this.balances;
        }
        int i5 = i2 + 87;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final QueryMultiBalanceResp copy(List<MultiBalanceItem> balances) {
        int i = 2 % 2;
        QueryMultiBalanceResp queryMultiBalanceResp = new QueryMultiBalanceResp(balances);
        int i2 = component2 + 109;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return queryMultiBalanceResp;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component3 + 111;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (other instanceof QueryMultiBalanceResp) {
            return Intrinsics.areEqual(this.balances, ((QueryMultiBalanceResp) other).balances);
        }
        int i4 = component2 + 73;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 11;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        List<MultiBalanceItem> list = this.balances;
        if (list != null) {
            return list.hashCode();
        }
        int i4 = i3 + 19;
        component2 = i4 % 128;
        return 1 ^ (i4 % 2 == 0 ? 0 : 1);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "QueryMultiBalanceResp(balances=" + this.balances + ")";
        int i2 = component2 + 67;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
