package com.huawei.digitalpayment.common.theme.request.params;

import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/request/params/CommissionRequestParams;", "Lcom/huawei/http/BaseRequestParams;", "currency", "", "<init>", "(Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CommissionRequestParams extends BaseRequestParams {
    private static int component3 = 1;
    private static int copydefault;
    private final String currency;

    public CommissionRequestParams(String str) {
        this.currency = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CommissionRequestParams(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component3 + 93;
            copydefault = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i3 = 2 % 2;
            str = null;
        }
        this(str);
    }

    public final String getCurrency() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 25;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.currency;
        int i4 = i2 + 29;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CommissionRequestParams() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static CommissionRequestParams copy$default(CommissionRequestParams commissionRequestParams, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault + 81;
        int i4 = i3 % 128;
        component3 = i4;
        int i5 = i & 1;
        if (i3 % 2 != 0 ? i5 != 0 : i5 != 0) {
            str = commissionRequestParams.currency;
            int i6 = i4 + 69;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
        }
        return commissionRequestParams.copy(str);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 115;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.currency;
        int i5 = i2 + 71;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final CommissionRequestParams copy(String currency) {
        int i = 2 % 2;
        CommissionRequestParams commissionRequestParams = new CommissionRequestParams(currency);
        int i2 = component3 + 47;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 86 / 0;
        }
        return commissionRequestParams;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 97;
            component3 = i2 % 128;
            return i2 % 2 != 0;
        }
        if (other instanceof CommissionRequestParams) {
            return Intrinsics.areEqual(this.currency, ((CommissionRequestParams) other).currency);
        }
        int i3 = component3 + 17;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 55;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.currency;
        if (str != null) {
            return str.hashCode();
        }
        int i4 = i2 + 79;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return 0;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CommissionRequestParams(currency=" + this.currency + ")";
        int i2 = copydefault + 25;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
