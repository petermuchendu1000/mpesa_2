package com.huawei.digitalpayment.consumer.base.resp;

import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0099\u0001\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u00061"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/BalanceItem;", "", "unitType", "", "accountTypeNameDisplay", "amount", "unit", "accountTypeAlias", "accountTypeName", "amountDisplay", "currency", "accountBalanceNameDisplay", KeysConstants.KEY_FORWARD, "order", "balanceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUnitType", "()Ljava/lang/String;", "getAccountTypeNameDisplay", "getAmount", "getUnit", "getAccountTypeAlias", "getAccountTypeName", "getAmountDisplay", "getCurrency", "getAccountBalanceNameDisplay", "getForward", "getOrder", "getBalanceId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BalanceItem {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private final String accountBalanceNameDisplay;
    private final String accountTypeAlias;
    private final String accountTypeName;
    private final String accountTypeNameDisplay;
    private final String amount;
    private final String amountDisplay;
    private final String balanceId;
    private final String currency;
    private final String forward;
    private final String order;
    private final String unit;
    private final String unitType;

    public BalanceItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.unitType = str;
        this.accountTypeNameDisplay = str2;
        this.amount = str3;
        this.unit = str4;
        this.accountTypeAlias = str5;
        this.accountTypeName = str6;
        this.amountDisplay = str7;
        this.currency = str8;
        this.accountBalanceNameDisplay = str9;
        this.forward = str10;
        this.order = str11;
        this.balanceId = str12;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BalanceItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            str13 = null;
        } else {
            str13 = str;
        }
        if ((i & 2) != 0) {
            int i3 = component1 + 41;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            str14 = null;
        } else {
            str14 = str2;
        }
        if ((i & 4) != 0) {
            int i4 = ShareDataUIState + 33;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 82 / 0;
            }
            str15 = null;
        } else {
            str15 = str3;
        }
        String str21 = (i & 8) != 0 ? null : str4;
        if ((i & 16) != 0) {
            int i6 = 2 % 2;
            str16 = null;
        } else {
            str16 = str5;
        }
        if ((i & 32) != 0) {
            int i7 = ShareDataUIState + 103;
            component1 = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 43 / 0;
            }
            str17 = null;
        } else {
            str17 = str6;
        }
        if ((i & 64) != 0) {
            int i9 = 2 % 2;
            str18 = null;
        } else {
            str18 = str7;
        }
        if ((i & 128) != 0) {
            int i10 = 2 % 2;
            str19 = null;
        } else {
            str19 = str8;
        }
        if ((i & 256) != 0) {
            int i11 = 2 % 2;
            str20 = null;
        } else {
            str20 = str9;
        }
        this(str13, str14, str15, str21, str16, str17, str18, str19, str20, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) == 0 ? str12 : null);
    }

    public final String getUnitType() {
        int i = 2 % 2;
        int i2 = component1 + 9;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.unitType;
        int i5 = i3 + 29;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getAccountTypeNameDisplay() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 1;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.accountTypeNameDisplay;
        int i5 = i2 + 15;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.amount;
        int i5 = i3 + 11;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getUnit() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 69;
        ShareDataUIState = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.unit;
        int i4 = i2 + 83;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getAccountTypeAlias() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 111;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.accountTypeAlias;
        int i5 = i3 + 23;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 90 / 0;
        }
        return str;
    }

    public final String getAccountTypeName() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 93;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.accountTypeName;
        int i5 = i2 + 67;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAmountDisplay() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            str = this.amountDisplay;
            int i4 = 10 / 0;
        } else {
            str = this.amountDisplay;
        }
        int i5 = i3 + 7;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 76 / 0;
        }
        return str;
    }

    public final String getCurrency() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 85;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.currency;
        }
        throw null;
    }

    public final String getAccountBalanceNameDisplay() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 37;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            str = this.accountBalanceNameDisplay;
            int i4 = 54 / 0;
        } else {
            str = this.accountBalanceNameDisplay;
        }
        int i5 = i3 + 93;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getForward() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.forward;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getOrder() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 57;
        int i3 = i2 % 128;
        component1 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.order;
        int i4 = i3 + 39;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getBalanceId() {
        int i = 2 % 2;
        int i2 = component1 + 3;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.balanceId;
        int i5 = i3 + 77;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public BalanceItem() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public static BalanceItem copy$default(BalanceItem balanceItem, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, Object obj) {
        String str13;
        String str14;
        String str15;
        String str16;
        int i2 = 2 % 2;
        String str17 = (i & 1) != 0 ? balanceItem.unitType : str;
        String str18 = (i & 2) != 0 ? balanceItem.accountTypeNameDisplay : str2;
        if ((i & 4) != 0) {
            int i3 = component1 + 119;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            str13 = balanceItem.amount;
        } else {
            str13 = str3;
        }
        String str19 = (i & 8) != 0 ? balanceItem.unit : str4;
        String str20 = (i & 16) != 0 ? balanceItem.accountTypeAlias : str5;
        String str21 = (i & 32) != 0 ? balanceItem.accountTypeName : str6;
        String str22 = (i & 64) != 0 ? balanceItem.amountDisplay : str7;
        if ((i & 128) != 0) {
            int i5 = component1 + 67;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            str14 = balanceItem.currency;
        } else {
            str14 = str8;
        }
        if ((i & 256) != 0) {
            str15 = balanceItem.accountBalanceNameDisplay;
            int i7 = component1 + 51;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
        } else {
            str15 = str9;
        }
        String str23 = (i & 512) != 0 ? balanceItem.forward : str10;
        if ((i & 1024) != 0) {
            int i9 = ShareDataUIState + 117;
            component1 = i9 % 128;
            int i10 = i9 % 2;
            str16 = balanceItem.order;
            if (i10 == 0) {
                int i11 = 40 / 0;
            }
        } else {
            str16 = str11;
        }
        return balanceItem.copy(str17, str18, str13, str19, str20, str21, str22, str14, str15, str23, str16, (i & 2048) != 0 ? balanceItem.balanceId : str12);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 69;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.unitType;
        int i5 = i3 + 125;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 3;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.forward;
        int i5 = i2 + 65;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 113;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.order;
        int i5 = i2 + 111;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component12() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 103;
        int i3 = i2 % 128;
        component1 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.balanceId;
        int i4 = i3 + 81;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 1;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.accountTypeNameDisplay;
        int i5 = i2 + 119;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1 + 49;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.amount;
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component1 + 7;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.unit;
        int i5 = i3 + 87;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 99;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.accountTypeAlias;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component6() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 119;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            str = this.accountTypeName;
            int i4 = 63 / 0;
        } else {
            str = this.accountTypeName;
        }
        int i5 = i3 + 59;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.amountDisplay;
        int i5 = i3 + 27;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 85;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.currency;
        int i5 = i3 + 15;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = component1 + 95;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.accountBalanceNameDisplay;
        int i5 = i3 + 113;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final BalanceItem copy(String unitType, String accountTypeNameDisplay, String amount, String unit, String accountTypeAlias, String accountTypeName, String amountDisplay, String currency, String accountBalanceNameDisplay, String forward, String order, String balanceId) {
        int i = 2 % 2;
        BalanceItem balanceItem = new BalanceItem(unitType, accountTypeNameDisplay, amount, unit, accountTypeAlias, accountTypeName, amountDisplay, currency, accountBalanceNameDisplay, forward, order, balanceId);
        int i2 = component1 + 111;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return balanceItem;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof BalanceItem)) {
            return false;
        }
        BalanceItem balanceItem = (BalanceItem) other;
        if (!Intrinsics.areEqual(this.unitType, balanceItem.unitType) || !Intrinsics.areEqual(this.accountTypeNameDisplay, balanceItem.accountTypeNameDisplay) || !Intrinsics.areEqual(this.amount, balanceItem.amount) || !Intrinsics.areEqual(this.unit, balanceItem.unit)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.accountTypeAlias, balanceItem.accountTypeAlias)) {
            int i2 = component1;
            int i3 = i2 + 75;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 29;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.accountTypeName, balanceItem.accountTypeName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.amountDisplay, balanceItem.amountDisplay)) {
            int i7 = component1 + 67;
            ShareDataUIState = i7 % 128;
            return i7 % 2 != 0;
        }
        Object obj = null;
        if (!Intrinsics.areEqual(this.currency, balanceItem.currency)) {
            int i8 = component1 + 73;
            ShareDataUIState = i8 % 128;
            if (i8 % 2 == 0) {
                return false;
            }
            obj.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(this.accountBalanceNameDisplay, balanceItem.accountBalanceNameDisplay) || (!Intrinsics.areEqual(this.forward, balanceItem.forward)) || !Intrinsics.areEqual(this.order, balanceItem.order)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.balanceId, balanceItem.balanceId)) {
            int i9 = component1 + 65;
            ShareDataUIState = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        int i11 = component1 + 3;
        ShareDataUIState = i11 % 128;
        if (i11 % 2 == 0) {
            return true;
        }
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i = 2 % 2;
        String str = this.unitType;
        if (str == null) {
            int i2 = ShareDataUIState + 67;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.accountTypeNameDisplay;
        if (str2 == null) {
            int i4 = component1 + 51;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.amount;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.unit;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.accountTypeAlias;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.accountTypeName;
        if (str6 == null) {
            int i6 = ShareDataUIState + 81;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str6.hashCode();
        }
        String str7 = this.amountDisplay;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.currency;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.accountBalanceNameDisplay;
        int iHashCode10 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.forward;
        int iHashCode11 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.order;
        if (str11 == null) {
            int i8 = ShareDataUIState + 59;
            component1 = i8 % 128;
            iHashCode4 = i8 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode4 = str11.hashCode();
        }
        String str12 = this.balanceId;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode3) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode4) * 31) + (str12 != null ? str12.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BalanceItem(unitType=" + this.unitType + ", accountTypeNameDisplay=" + this.accountTypeNameDisplay + ", amount=" + this.amount + ", unit=" + this.unit + ", accountTypeAlias=" + this.accountTypeAlias + ", accountTypeName=" + this.accountTypeName + ", amountDisplay=" + this.amountDisplay + ", currency=" + this.currency + ", accountBalanceNameDisplay=" + this.accountBalanceNameDisplay + ", forward=" + this.forward + ", order=" + this.order + ", balanceId=" + this.balanceId + ")";
        int i2 = component1 + 75;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
