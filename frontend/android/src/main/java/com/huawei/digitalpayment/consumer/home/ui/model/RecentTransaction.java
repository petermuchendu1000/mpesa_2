package com.huawei.digitalpayment.consumer.home.ui.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JO\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001f\u001a\u00020 H×\u0001J\t\u0010!\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\""}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/model/RecentTransaction;", "", "orderId", "", "oppositeName", "transTypeDisplay", "amountDisplay", "transTime", "currency", "logo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOrderId", "()Ljava/lang/String;", "getOppositeName", "getTransTypeDisplay", "getAmountDisplay", "getTransTime", "getCurrency", "getLogo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecentTransaction {
    public static final int $stable = 0;
    private static int equals = 0;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 1;
    private static int hashCode = 1;
    private final String ShareDataUIState;
    private final String component1;
    private final String component2;
    private final String component3;
    private final String component4;
    private final String copy;
    private final String copydefault;

    public RecentTransaction(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.ShareDataUIState = str;
        this.component3 = str2;
        this.component4 = str3;
        this.copydefault = str4;
        this.copy = str5;
        this.component2 = str6;
        this.component1 = str7;
    }

    public final String getOrderId() {
        int i = 2 % 2;
        int i2 = hashCode + 111;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.ShareDataUIState;
        int i4 = i3 + 29;
        hashCode = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 58 / 0;
        }
        return str;
    }

    public final String getOppositeName() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 123;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 5;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getTransTypeDisplay() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 87;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        String str = this.component4;
        int i5 = i3 + 75;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getAmountDisplay() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 5;
        int i3 = i2 % 128;
        hashCode = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.copydefault;
        int i4 = i3 + 15;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getTransTime() {
        String str;
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 115;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.copy;
            int i4 = 88 / 0;
        } else {
            str = this.copy;
        }
        int i5 = i2 + 87;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 12 / 0;
        }
        return str;
    }

    public final String getCurrency() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 3;
        hashCode = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.component2;
        int i4 = i2 + 47;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getLogo() {
        int i = 2 % 2;
        int i2 = hashCode + 7;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        String str = this.component1;
        int i5 = i3 + 119;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = 1 + 29;
        equals = i % 128;
        if (i % 2 != 0) {
            int i2 = 28 / 0;
        }
    }

    public static RecentTransaction copy$default(RecentTransaction recentTransaction, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        String str8;
        String str9;
        String str10;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = hashCode + 81;
            int i4 = i3 % 128;
            getAsAtTimestamp = i4;
            if (i3 % 2 != 0) {
                str8 = recentTransaction.ShareDataUIState;
                int i5 = 30 / 0;
            } else {
                str8 = recentTransaction.ShareDataUIState;
            }
            int i6 = i4 + 73;
            hashCode = i6 % 128;
            int i7 = i6 % 2;
        } else {
            str8 = str;
        }
        String str11 = (i & 2) != 0 ? recentTransaction.component3 : str2;
        Object obj2 = null;
        if ((i & 4) != 0) {
            int i8 = hashCode + 43;
            getAsAtTimestamp = i8 % 128;
            if (i8 % 2 != 0) {
                String str12 = recentTransaction.component4;
                obj2.hashCode();
                throw null;
            }
            str9 = recentTransaction.component4;
        } else {
            str9 = str3;
        }
        String str13 = (i & 8) != 0 ? recentTransaction.copydefault : str4;
        String str14 = (i & 16) != 0 ? recentTransaction.copy : str5;
        if ((i & 32) != 0) {
            int i9 = hashCode + 31;
            getAsAtTimestamp = i9 % 128;
            if (i9 % 2 != 0) {
                String str15 = recentTransaction.component2;
                obj2.hashCode();
                throw null;
            }
            str10 = recentTransaction.component2;
        } else {
            str10 = str6;
        }
        return recentTransaction.copy(str8, str11, str9, str13, str14, str10, (i & 64) != 0 ? recentTransaction.component1 : str7);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 61;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        String str = this.ShareDataUIState;
        int i5 = i3 + 105;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 47;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component3;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 49;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.component4;
        int i4 = i2 + 53;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 9;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 31;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 35;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copy;
        int i5 = i2 + 89;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 67;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.component2;
        int i4 = i2 + 23;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 65 / 0;
        }
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 19;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        String str = this.component1;
        int i5 = i3 + 15;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final RecentTransaction copy(String orderId, String oppositeName, String transTypeDisplay, String amountDisplay, String transTime, String currency, String logo) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(orderId, "");
        Intrinsics.checkNotNullParameter(oppositeName, "");
        Intrinsics.checkNotNullParameter(transTypeDisplay, "");
        Intrinsics.checkNotNullParameter(amountDisplay, "");
        Intrinsics.checkNotNullParameter(transTime, "");
        Intrinsics.checkNotNullParameter(currency, "");
        Intrinsics.checkNotNullParameter(logo, "");
        RecentTransaction recentTransaction = new RecentTransaction(orderId, oppositeName, transTypeDisplay, amountDisplay, transTime, currency, logo);
        int i2 = hashCode + 43;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 82 / 0;
        }
        return recentTransaction;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = getAsAtTimestamp + 123;
            hashCode = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(other instanceof RecentTransaction)) {
            return false;
        }
        RecentTransaction recentTransaction = (RecentTransaction) other;
        if ((!Intrinsics.areEqual(this.ShareDataUIState, recentTransaction.ShareDataUIState)) || !Intrinsics.areEqual(this.component3, recentTransaction.component3) || !Intrinsics.areEqual(this.component4, recentTransaction.component4)) {
            return false;
        }
        if (Intrinsics.areEqual(this.copydefault, recentTransaction.copydefault)) {
            return Intrinsics.areEqual(this.copy, recentTransaction.copy) && Intrinsics.areEqual(this.component2, recentTransaction.component2) && Intrinsics.areEqual(this.component1, recentTransaction.component1);
        }
        int i3 = getAsAtTimestamp + 101;
        hashCode = i3 % 128;
        return i3 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = hashCode + 3;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((this.ShareDataUIState.hashCode() * 31) + this.component3.hashCode()) * 31) + this.component4.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.copy.hashCode()) * 31) + this.component2.hashCode()) * 31) + this.component1.hashCode();
        int i4 = hashCode + 7;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RecentTransaction(orderId=" + this.ShareDataUIState + ", oppositeName=" + this.component3 + ", transTypeDisplay=" + this.component4 + ", amountDisplay=" + this.copydefault + ", transTime=" + this.copy + ", currency=" + this.component2 + ", logo=" + this.component1 + ")";
        int i2 = hashCode + 5;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
