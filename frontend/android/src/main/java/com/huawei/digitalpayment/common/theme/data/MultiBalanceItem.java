package com.huawei.digitalpayment.common.theme.data;

import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JV\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0006HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006#"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/data/MultiBalanceItem;", "Lcom/huawei/http/BaseResp;", "accountBalanceNameDisplay", "", "amountDisplay", "order", "", "balanceId", "currency", "unit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccountBalanceNameDisplay", "()Ljava/lang/String;", "getAmountDisplay", "getOrder", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBalanceId", "getCurrency", "getUnit", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/digitalpayment/common/theme/data/MultiBalanceItem;", "equals", "", "other", "", "hashCode", "toString", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MultiBalanceItem extends BaseResp {
    private static int component1 = 1;
    private static int component3;
    private final String accountBalanceNameDisplay;
    private final String amountDisplay;
    private final String balanceId;
    private final String currency;
    private final Integer order;
    private final String unit;

    /* JADX WARN: Illegal instructions before constructor call */
    public MultiBalanceItem(String str, String str2, Integer num, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str6;
        String str7 = null;
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i3 = component1 + 25;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            str6 = null;
        } else {
            str6 = str2;
        }
        if ((i & 4) != 0) {
            int i6 = component1 + 27;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            num = 0;
        }
        Integer num2 = num;
        String str8 = (i & 8) != 0 ? null : str3;
        String str9 = (i & 16) != 0 ? null : str4;
        if ((i & 32) != 0) {
            int i8 = component3 + 25;
            component1 = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 94 / 0;
            }
        } else {
            str7 = str5;
        }
        this(str, str6, num2, str8, str9, str7);
    }

    public final String getAccountBalanceNameDisplay() {
        int i = 2 % 2;
        int i2 = component3 + 89;
        int i3 = i2 % 128;
        component1 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.accountBalanceNameDisplay;
        int i4 = i3 + 97;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getAmountDisplay() {
        int i = 2 % 2;
        int i2 = component3 + 55;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.amountDisplay;
        if (i3 == 0) {
            int i4 = 71 / 0;
        }
        return str;
    }

    public final Integer getOrder() {
        int i = 2 % 2;
        int i2 = component1 + 51;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Integer num = this.order;
        int i5 = i3 + 53;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        throw null;
    }

    public final String getBalanceId() {
        int i = 2 % 2;
        int i2 = component3 + 61;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.balanceId;
        int i5 = i3 + 105;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getCurrency() {
        String str;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 65;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.currency;
            int i4 = 54 / 0;
        } else {
            str = this.currency;
        }
        int i5 = i2 + 111;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 85 / 0;
        }
        return str;
    }

    public final String getUnit() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 87;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.unit;
        int i4 = i2 + 101;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 50 / 0;
        }
        return str;
    }

    public MultiBalanceItem(String str, String str2, Integer num, String str3, String str4, String str5) {
        this.accountBalanceNameDisplay = str;
        this.amountDisplay = str2;
        this.order = num;
        this.balanceId = str3;
        this.currency = str4;
        this.unit = str5;
    }

    public MultiBalanceItem() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static MultiBalanceItem copy$default(MultiBalanceItem multiBalanceItem, String str, String str2, Integer num, String str3, String str4, String str5, int i, Object obj) {
        String str6;
        Integer num2;
        String str7;
        String str8;
        int i2 = 2 % 2;
        int i3 = component1;
        int i4 = i3 + 57;
        component3 = i4 % 128;
        String str9 = (i4 % 2 == 0 && (i & 1) != 0) ? multiBalanceItem.accountBalanceNameDisplay : str;
        if ((i & 2) != 0) {
            int i5 = i3 + 75;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            str6 = multiBalanceItem.amountDisplay;
        } else {
            str6 = str2;
        }
        if ((i & 4) != 0) {
            int i7 = component3 + 47;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            num2 = multiBalanceItem.order;
        } else {
            num2 = num;
        }
        String str10 = (i & 8) != 0 ? multiBalanceItem.balanceId : str3;
        Object obj2 = null;
        if ((i & 16) != 0) {
            int i9 = component1 + 77;
            component3 = i9 % 128;
            if (i9 % 2 != 0) {
                String str11 = multiBalanceItem.currency;
                obj2.hashCode();
                throw null;
            }
            str7 = multiBalanceItem.currency;
        } else {
            str7 = str4;
        }
        if ((i & 32) != 0) {
            int i10 = component3 + 65;
            component1 = i10 % 128;
            if (i10 % 2 == 0) {
                String str12 = multiBalanceItem.unit;
                obj2.hashCode();
                throw null;
            }
            str8 = multiBalanceItem.unit;
        } else {
            str8 = str5;
        }
        return multiBalanceItem.copy(str9, str6, num2, str10, str7, str8);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 97;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.accountBalanceNameDisplay;
        int i5 = i3 + 91;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 23;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.amountDisplay;
        int i5 = i2 + 39;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer component3() {
        int i = 2 % 2;
        int i2 = component3 + 9;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.order;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component1 + 75;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.balanceId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component3 + 51;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.currency;
        int i5 = i3 + 105;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 85 / 0;
        }
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 71;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.unit;
        int i5 = i2 + 81;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final MultiBalanceItem copy(String accountBalanceNameDisplay, String amountDisplay, Integer order, String balanceId, String currency, String unit) {
        int i = 2 % 2;
        MultiBalanceItem multiBalanceItem = new MultiBalanceItem(accountBalanceNameDisplay, amountDisplay, order, balanceId, currency, unit);
        int i2 = component1 + 97;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return multiBalanceItem;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3 + 95;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiBalanceItem)) {
            return false;
        }
        MultiBalanceItem multiBalanceItem = (MultiBalanceItem) other;
        if (!Intrinsics.areEqual(this.accountBalanceNameDisplay, multiBalanceItem.accountBalanceNameDisplay) || !Intrinsics.areEqual(this.amountDisplay, multiBalanceItem.amountDisplay) || !Intrinsics.areEqual(this.order, multiBalanceItem.order) || !Intrinsics.areEqual(this.balanceId, multiBalanceItem.balanceId) || !Intrinsics.areEqual(this.currency, multiBalanceItem.currency)) {
            return false;
        }
        if (Intrinsics.areEqual(this.unit, multiBalanceItem.unit)) {
            int i3 = component3 + 11;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        int i5 = component3 + 67;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        String str = this.accountBalanceNameDisplay;
        int iHashCode4 = 0;
        if (str == null) {
            int i2 = component3 + 63;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.amountDisplay;
        if (str2 == null) {
            int i4 = component3 + 103;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        Integer num = this.order;
        int iHashCode5 = num == null ? 0 : num.hashCode();
        String str3 = this.balanceId;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.currency;
        if (str4 == null) {
            int i6 = component3 + 9;
            component1 = i6 % 128;
            iHashCode3 = i6 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode3 = str4.hashCode();
        }
        String str5 = this.unit;
        if (str5 == null) {
            int i7 = component1 + 11;
            component3 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 4 / 4;
            }
        } else {
            iHashCode4 = str5.hashCode();
        }
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode3) * 31) + iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MultiBalanceItem(accountBalanceNameDisplay=" + this.accountBalanceNameDisplay + ", amountDisplay=" + this.amountDisplay + ", order=" + this.order + ", balanceId=" + this.balanceId + ", currency=" + this.currency + ", unit=" + this.unit + ")";
        int i2 = component3 + 95;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
