package com.huawei.digitalpayment.common.theme.data;

import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\u0010¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/common/theme/data/BalanceResp;", "Lcom/huawei/http/BaseResp;", "unitType", "", "amount", "unit", "amountDisplay", "currency", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUnitType", "()Ljava/lang/String;", "getAmount", "getUnit", "getAmountDisplay", "setAmountDisplay", "(Ljava/lang/String;)V", "getCurrency", "setCurrency", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BalanceResp extends BaseResp {
    private static int ShareDataUIState = 1;
    private static int component3;
    private final String amount;
    private String amountDisplay;
    private String currency;
    private final String unit;
    private final String unitType;

    /* JADX WARN: Illegal instructions before constructor call */
    public BalanceResp(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str6;
        String str7;
        if ((i & 1) != 0) {
            int i2 = ShareDataUIState + 3;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i5 = ShareDataUIState + 77;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                str.hashCode();
                throw null;
            }
            str6 = null;
        } else {
            str6 = str2;
        }
        if ((i & 4) != 0) {
            int i6 = component3 + 117;
            int i7 = i6 % 128;
            ShareDataUIState = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 17;
            component3 = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            str7 = null;
        } else {
            str7 = str3;
        }
        this(str, str6, str7, (i & 8) != 0 ? null : str4, (i & 16) == 0 ? str5 : null);
    }

    public final String getUnitType() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 95;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.unitType;
        int i5 = i3 + 115;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 39;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.amount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getUnit() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 3;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.unit;
        int i5 = i2 + 57;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAmountDisplay() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 41;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.amountDisplay;
        int i5 = i2 + 83;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final void setAmountDisplay(String str) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 121;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.amountDisplay = str;
        if (i4 == 0) {
            int i5 = 73 / 0;
        }
        int i6 = i2 + 71;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
    }

    public final String getCurrency() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 65;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.currency;
        int i4 = i2 + 31;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void setCurrency(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 7;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.currency = str;
        int i5 = i2 + 57;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 65 / 0;
        }
    }

    public BalanceResp(String str, String str2, String str3, String str4, String str5) {
        this.unitType = str;
        this.amount = str2;
        this.unit = str3;
        this.amountDisplay = str4;
        this.currency = str5;
    }

    public BalanceResp() {
        this(null, null, null, null, null, 31, null);
    }

    public static BalanceResp copy$default(BalanceResp balanceResp, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component3 + 17;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            str = balanceResp.unitType;
        }
        String str6 = str;
        if ((i & 2) != 0) {
            str2 = balanceResp.amount;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = balanceResp.unit;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            int i5 = component3 + 53;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                String str9 = balanceResp.amountDisplay;
                throw null;
            }
            str4 = balanceResp.amountDisplay;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = balanceResp.currency;
        }
        return balanceResp.copy(str6, str7, str8, str10, str5);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = component3 + 39;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            str = this.unitType;
            int i4 = 48 / 0;
        } else {
            str = this.unitType;
        }
        int i5 = i3 + 11;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 27;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.amount;
        int i4 = i3 + 101;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 17 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 93;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.unit;
        int i4 = i2 + 33;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 66 / 0;
        }
        return str;
    }

    public final String component4() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 9;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.amountDisplay;
            int i4 = 92 / 0;
        } else {
            str = this.amountDisplay;
        }
        int i5 = i2 + 43;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 51;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.currency;
        int i5 = i3 + 1;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final BalanceResp copy(String unitType, String amount, String unit, String amountDisplay, String currency) {
        int i = 2 % 2;
        BalanceResp balanceResp = new BalanceResp(unitType, amount, unit, amountDisplay, currency);
        int i2 = component3 + 43;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return balanceResp;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 81;
            component3 = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(other instanceof BalanceResp)) {
            int i3 = ShareDataUIState + 63;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        BalanceResp balanceResp = (BalanceResp) other;
        if (!Intrinsics.areEqual(this.unitType, balanceResp.unitType)) {
            int i5 = ShareDataUIState;
            int i6 = i5 + 49;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 23;
            component3 = i8 % 128;
            if (i8 % 2 == 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(this.amount, balanceResp.amount) || !Intrinsics.areEqual(this.unit, balanceResp.unit)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.amountDisplay, balanceResp.amountDisplay)) {
            int i9 = ShareDataUIState + 29;
            component3 = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.currency, balanceResp.currency)) {
            return true;
        }
        int i11 = ShareDataUIState + 35;
        component3 = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        String str = this.unitType;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.amount;
        if (str2 == null) {
            int i2 = ShareDataUIState + 77;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.unit;
        if (str3 == null) {
            int i4 = ShareDataUIState + 31;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str3.hashCode();
        }
        String str4 = this.amountDisplay;
        if (str4 == null) {
            int i6 = ShareDataUIState + 35;
            component3 = i6 % 128;
            iHashCode3 = i6 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode3 = str4.hashCode();
        }
        String str5 = this.currency;
        int iHashCode5 = (((((((iHashCode4 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str5 != null ? str5.hashCode() : 0);
        int i7 = component3 + 19;
        ShareDataUIState = i7 % 128;
        if (i7 % 2 != 0) {
            return iHashCode5;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BalanceResp(unitType=" + this.unitType + ", amount=" + this.amount + ", unit=" + this.unit + ", amountDisplay=" + this.amountDisplay + ", currency=" + this.currency + ")";
        int i2 = component3 + 105;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
