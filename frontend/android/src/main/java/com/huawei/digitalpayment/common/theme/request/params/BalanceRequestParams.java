package com.huawei.digitalpayment.common.theme.request.params;

import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/request/params/BalanceRequestParams;", "Lcom/huawei/http/BaseRequestParams;", "currency", "", "<init>", "(Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BalanceRequestParams extends BaseRequestParams {
    private static int ShareDataUIState = 1;
    private static int component2;
    private final String currency;

    public BalanceRequestParams(String str) {
        this.currency = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BalanceRequestParams(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component2 + 107;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i4 = i3 + 47;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str = null;
        }
        this(str);
    }

    public final String getCurrency() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.currency;
        if (i3 != 0) {
            int i4 = 76 / 0;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BalanceRequestParams() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static BalanceRequestParams copy$default(BalanceRequestParams balanceRequestParams, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 99;
        int i4 = i3 % 128;
        component2 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 101;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            str = balanceRequestParams.currency;
        }
        return balanceRequestParams.copy(str);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 57;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.currency;
        int i5 = i2 + 71;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final BalanceRequestParams copy(String currency) {
        int i = 2 % 2;
        BalanceRequestParams balanceRequestParams = new BalanceRequestParams(currency);
        int i2 = component2 + 67;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return balanceRequestParams;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 3;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            int i5 = i2 + 21;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (other instanceof BalanceRequestParams) {
            return Intrinsics.areEqual(this.currency, ((BalanceRequestParams) other).currency);
        }
        int i7 = i2 + 87;
        component2 = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 51;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.currency;
        if (str != null) {
            return str.hashCode();
        }
        int i5 = i3 + 125;
        int i6 = i5 % 128;
        ShareDataUIState = i6;
        int i7 = i5 % 2 == 0 ? 1 : 0;
        int i8 = i6 + 75;
        component2 = i8 % 128;
        int i9 = i8 % 2;
        return i7;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BalanceRequestParams(currency=" + this.currency + ")";
        int i2 = component2 + 77;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
