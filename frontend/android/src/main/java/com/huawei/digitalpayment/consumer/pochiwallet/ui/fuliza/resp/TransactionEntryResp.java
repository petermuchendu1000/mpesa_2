package com.huawei.digitalpayment.consumer.pochiwallet.ui.fuliza.resp;

import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.checkout.ui.activity.PayResultActivity;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JY\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H×\u0003J\t\u0010#\u001a\u00020$H×\u0001J\t\u0010%\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006&"}, d2 = {"Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/fuliza/resp/TransactionEntryResp;", "Ljava/io/Serializable;", "Currency", "", PayResultActivity.KEY_TIME, "BusinessScope", "TransactionType", "AccessFee", "Principal", "Interest", "TransactionAmount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "getTransactionTime", "getBusinessScope", "getTransactionType", "getAccessFee", "getPrincipal", "getInterest", "getTransactionAmount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcPochiWallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TransactionEntryResp implements Serializable {
    public static final int $stable = 0;
    private static int component1 = 35 % 128;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("AccessFee")
    private final String AccessFee;

    @SerializedName("BusinessScope")
    private final String BusinessScope;

    @SerializedName("Currency")
    private final String Currency;

    @SerializedName("Interest")
    private final String Interest;

    @SerializedName("Principal")
    private final String Principal;

    @SerializedName("TransactionAmount")
    private final String TransactionAmount;

    @SerializedName(PayResultActivity.KEY_TIME)
    private final String TransactionTime;

    @SerializedName("TransactionType")
    private final String TransactionType;

    public TransactionEntryResp(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.Currency = str;
        this.TransactionTime = str2;
        this.BusinessScope = str3;
        this.TransactionType = str4;
        this.AccessFee = str5;
        this.Principal = str6;
        this.Interest = str7;
        this.TransactionAmount = str8;
    }

    public final String getCurrency() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault + 61;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            str = this.Currency;
            int i4 = 33 / 0;
        } else {
            str = this.Currency;
        }
        int i5 = i3 + 37;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getTransactionTime() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 45;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.TransactionTime;
        int i5 = i2 + 123;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getBusinessScope() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 99;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.BusinessScope;
        int i5 = i2 + 47;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 78 / 0;
        }
        return str;
    }

    public final String getTransactionType() {
        int i = 2 % 2;
        int i2 = copydefault + 85;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.TransactionType;
        if (i3 != 0) {
            int i4 = 4 / 0;
        }
        return str;
    }

    public final String getAccessFee() {
        int i = 2 % 2;
        int i2 = component2 + 13;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.AccessFee;
        int i5 = i3 + 59;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getPrincipal() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 117;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.Principal;
        int i4 = i2 + 65;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getInterest() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 5;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.Interest;
        int i5 = i2 + 69;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getTransactionAmount() {
        int i = 2 % 2;
        int i2 = copydefault + 49;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.TransactionAmount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        if (35 % 2 == 0) {
            int i = 50 / 0;
        }
    }

    public static TransactionEntryResp copy$default(TransactionEntryResp transactionEntryResp, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        String str9;
        String str10;
        String str11;
        String str12;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component2 + 31;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            str9 = transactionEntryResp.Currency;
        } else {
            str9 = str;
        }
        String str13 = (i & 2) != 0 ? transactionEntryResp.TransactionTime : str2;
        if ((i & 4) != 0) {
            int i5 = component2 + 51;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                String str14 = transactionEntryResp.BusinessScope;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str10 = transactionEntryResp.BusinessScope;
        } else {
            str10 = str3;
        }
        String str15 = (i & 8) != 0 ? transactionEntryResp.TransactionType : str4;
        if ((i & 16) != 0) {
            str11 = transactionEntryResp.AccessFee;
            int i6 = component2 + 103;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
        } else {
            str11 = str5;
        }
        if ((i & 32) != 0) {
            int i8 = copydefault + 103;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            str12 = transactionEntryResp.Principal;
            if (i9 != 0) {
                int i10 = 97 / 0;
            }
        } else {
            str12 = str6;
        }
        return transactionEntryResp.copy(str9, str13, str10, str15, str11, str12, (i & 64) != 0 ? transactionEntryResp.Interest : str7, (i & 128) != 0 ? transactionEntryResp.TransactionAmount : str8);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 55;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.Currency;
        int i5 = i2 + 93;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 123;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.TransactionTime;
        int i5 = i2 + 121;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 11 / 0;
        }
        return str;
    }

    public final String component3() {
        String str;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 9;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.BusinessScope;
            int i4 = 24 / 0;
        } else {
            str = this.BusinessScope;
        }
        int i5 = i2 + 45;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 28 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2 + 41;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.TransactionType;
        int i4 = i3 + 93;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 63 / 0;
        }
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component2 + 99;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.AccessFee;
        int i5 = i3 + 35;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component2 + 7;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.Principal;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = copydefault + 7;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.Interest;
        int i4 = i3 + 117;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 115;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.TransactionAmount;
        int i5 = i2 + 75;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final TransactionEntryResp copy(String Currency, String TransactionTime, String BusinessScope, String TransactionType, String AccessFee, String Principal, String Interest, String TransactionAmount) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(Currency, "");
        Intrinsics.checkNotNullParameter(TransactionTime, "");
        Intrinsics.checkNotNullParameter(BusinessScope, "");
        Intrinsics.checkNotNullParameter(TransactionType, "");
        Intrinsics.checkNotNullParameter(AccessFee, "");
        Intrinsics.checkNotNullParameter(Principal, "");
        Intrinsics.checkNotNullParameter(Interest, "");
        Intrinsics.checkNotNullParameter(TransactionAmount, "");
        TransactionEntryResp transactionEntryResp = new TransactionEntryResp(Currency, TransactionTime, BusinessScope, TransactionType, AccessFee, Principal, Interest, TransactionAmount);
        int i2 = copydefault + 3;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return transactionEntryResp;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2 + 1;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionEntryResp)) {
            return false;
        }
        TransactionEntryResp transactionEntryResp = (TransactionEntryResp) other;
        if (!Intrinsics.areEqual(this.Currency, transactionEntryResp.Currency) || !Intrinsics.areEqual(this.TransactionTime, transactionEntryResp.TransactionTime)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.BusinessScope, transactionEntryResp.BusinessScope)) {
            int i3 = component2 + 1;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.TransactionType, transactionEntryResp.TransactionType)) {
            int i5 = copydefault + 3;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if ((!Intrinsics.areEqual(this.AccessFee, transactionEntryResp.AccessFee)) || (!Intrinsics.areEqual(this.Principal, transactionEntryResp.Principal))) {
            return false;
        }
        if (!Intrinsics.areEqual(this.Interest, transactionEntryResp.Interest)) {
            int i7 = copydefault + 41;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.TransactionAmount, transactionEntryResp.TransactionAmount)) {
            return true;
        }
        int i9 = component2 + 77;
        copydefault = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 121;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((this.Currency.hashCode() * 31) + this.TransactionTime.hashCode()) * 31) + this.BusinessScope.hashCode()) * 31) + this.TransactionType.hashCode()) * 31) + this.AccessFee.hashCode()) * 31) + this.Principal.hashCode()) * 31) + this.Interest.hashCode()) * 31) + this.TransactionAmount.hashCode();
        int i4 = copydefault + 61;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TransactionEntryResp(Currency=" + this.Currency + ", TransactionTime=" + this.TransactionTime + ", BusinessScope=" + this.BusinessScope + ", TransactionType=" + this.TransactionType + ", AccessFee=" + this.AccessFee + ", Principal=" + this.Principal + ", Interest=" + this.Interest + ", TransactionAmount=" + this.TransactionAmount + ")";
        int i2 = component2 + 7;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
