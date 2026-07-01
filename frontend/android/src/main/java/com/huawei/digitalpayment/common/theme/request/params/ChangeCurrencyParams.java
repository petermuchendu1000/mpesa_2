package com.huawei.digitalpayment.common.theme.request.params;

import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/request/params/ChangeCurrencyParams;", "Lcom/huawei/http/BaseRequestParams;", "newCurrency", "", "<init>", "(Ljava/lang/String;)V", "getNewCurrency", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChangeCurrencyParams extends BaseRequestParams {
    private static int component1 = 0;
    private static int component2 = 1;
    private final String newCurrency;

    public final String getNewCurrency() {
        int i = 2 % 2;
        int i2 = component1 + 9;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.newCurrency;
        if (i3 == 0) {
            int i4 = 36 / 0;
        }
        return str;
    }

    public ChangeCurrencyParams(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.newCurrency = str;
    }

    public static ChangeCurrencyParams copy$default(ChangeCurrencyParams changeCurrencyParams, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1 + 65;
        component2 = i3 % 128;
        int i4 = i & 1;
        if (i3 % 2 != 0 ? i4 != 0 : i4 != 0) {
            str = changeCurrencyParams.newCurrency;
        }
        ChangeCurrencyParams changeCurrencyParamsCopy = changeCurrencyParams.copy(str);
        int i5 = component1 + 97;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return changeCurrencyParamsCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 89;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.newCurrency;
        int i5 = i3 + 71;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final ChangeCurrencyParams copy(String newCurrency) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(newCurrency, "");
        ChangeCurrencyParams changeCurrencyParams = new ChangeCurrencyParams(newCurrency);
        int i2 = component1 + 115;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 53 / 0;
        }
        return changeCurrencyParams;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2 + 81;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 17;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (other instanceof ChangeCurrencyParams) {
            if (Intrinsics.areEqual(this.newCurrency, ((ChangeCurrencyParams) other).newCurrency)) {
                return true;
            }
            int i7 = component2 + 113;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = i3 + 81;
        component2 = i9 % 128;
        boolean z = !(i9 % 2 != 0);
        int i10 = i3 + 9;
        component2 = i10 % 128;
        if (i10 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 41;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.newCurrency;
        if (i3 != 0) {
            return str.hashCode();
        }
        str.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ChangeCurrencyParams(newCurrency=" + this.newCurrency + ")";
        int i2 = component2 + 57;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
