package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/ExchangeRate;", "", "fromCurrency", "", "toCurrency", "rate", "Ljava/math/BigDecimal;", "timestamp", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;J)V", "getFromCurrency", "()Ljava/lang/String;", "getToCurrency", "getRate", "()Ljava/math/BigDecimal;", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExchangeRate {
    public static final int $stable = 0;
    private static int component2 = 0;
    private static int component4 = 1;
    private static int copy = 0;
    private static int equals = 1;
    private final String ShareDataUIState;
    private final String component1;
    private final BigDecimal component3;
    private final long copydefault;

    public ExchangeRate(String str, String str2, BigDecimal bigDecimal, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        this.ShareDataUIState = str;
        this.component1 = str2;
        this.component3 = bigDecimal;
        this.copydefault = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExchangeRate(String str, String str2, BigDecimal bigDecimal, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long j2;
        long jCurrentTimeMillis;
        if ((i & 8) != 0) {
            int i2 = component4 + 63;
            copy = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 8 / 0;
                jCurrentTimeMillis = System.currentTimeMillis();
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            int i4 = copy + 53;
            component4 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            j2 = jCurrentTimeMillis;
        } else {
            j2 = j;
        }
        this(str, str2, bigDecimal, j2);
    }

    public final String getFromCurrency() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 93;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ShareDataUIState;
        int i5 = i2 + 117;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getToCurrency() {
        int i = 2 % 2;
        int i2 = copy + 5;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        String str = this.component1;
        int i5 = i3 + 79;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 88 / 0;
        }
        return str;
    }

    public final BigDecimal getRate() {
        int i = 2 % 2;
        int i2 = copy + 9;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long getTimestamp() {
        int i = 2 % 2;
        int i2 = copy + 71;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        throw null;
    }

    static {
        int i = 1 + 47;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public static ExchangeRate copy$default(ExchangeRate exchangeRate, String str, String str2, BigDecimal bigDecimal, long j, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component4 + 73;
        int i4 = i3 % 128;
        copy = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            str = exchangeRate.ShareDataUIState;
        }
        String str3 = str;
        if ((i & 2) != 0) {
            str2 = exchangeRate.component1;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            bigDecimal = exchangeRate.component3;
        }
        BigDecimal bigDecimal2 = bigDecimal;
        if ((i & 8) != 0) {
            int i6 = i4 + 87;
            component4 = i6 % 128;
            int i7 = i6 % 2;
            j = exchangeRate.copydefault;
            if (i7 == 0) {
                int i8 = 36 / 0;
            }
        }
        return exchangeRate.copy(str3, str4, bigDecimal2, j);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = copy + 79;
        int i3 = i2 % 128;
        component4 = i3;
        if (i2 % 2 == 0) {
            str = this.ShareDataUIState;
            int i4 = 44 / 0;
        } else {
            str = this.ShareDataUIState;
        }
        int i5 = i3 + 1;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 78 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 91;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 65;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final BigDecimal component3() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 89;
        copy = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        BigDecimal bigDecimal = this.component3;
        int i4 = i2 + 99;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 77 / 0;
        }
        return bigDecimal;
    }

    public final long component4() {
        int i = 2 % 2;
        int i2 = copy + 71;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        int i3 = 99 / 0;
        return this.copydefault;
    }

    public final ExchangeRate copy(String fromCurrency, String toCurrency, BigDecimal rate, long timestamp) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(fromCurrency, "");
        Intrinsics.checkNotNullParameter(toCurrency, "");
        Intrinsics.checkNotNullParameter(rate, "");
        ExchangeRate exchangeRate = new ExchangeRate(fromCurrency, toCurrency, rate, timestamp);
        int i2 = component4 + 65;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return exchangeRate;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExchangeRate)) {
            int i2 = component4 + 101;
            copy = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        ExchangeRate exchangeRate = (ExchangeRate) other;
        if (Intrinsics.areEqual(this.ShareDataUIState, exchangeRate.ShareDataUIState)) {
            return !(Intrinsics.areEqual(this.component1, exchangeRate.component1) ^ true) && Intrinsics.areEqual(this.component3, exchangeRate.component3) && this.copydefault == exchangeRate.copydefault;
        }
        int i4 = copy + 101;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component4 + 37;
        copy = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.ShareDataUIState.hashCode() * 31) + this.component1.hashCode()) * 31) + this.component3.hashCode()) * 31) + Long.hashCode(this.copydefault);
        int i4 = copy + 37;
        component4 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 23 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ExchangeRate(fromCurrency=" + this.ShareDataUIState + ", toCurrency=" + this.component1 + ", rate=" + this.component3 + ", timestamp=" + this.copydefault + ')';
        int i2 = copy + 119;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
