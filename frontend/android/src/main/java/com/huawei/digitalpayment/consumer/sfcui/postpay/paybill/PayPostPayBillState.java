package com.huawei.digitalpayment.consumer.sfcui.postpay.paybill;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/postpay/paybill/PayPostPayBillState;", "", "accountNumber", "", "businessNumber", "amount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "getBusinessNumber", "getAmount", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PayPostPayBillState {
    public static final int $stable = 0;
    private static int component1 = 1;
    private static int component3 = 0;
    private static int component4 = 1;
    private static int equals;
    private final String ShareDataUIState;
    private final String component2;
    private final String copydefault;

    public PayPostPayBillState(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.component2 = str;
        this.copydefault = str2;
        this.ShareDataUIState = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PayPostPayBillState(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component4 + 49;
            equals = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 44 / 0;
            }
            int i4 = 2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i5 = component4;
            int i6 = i5 + 121;
            equals = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 7;
            equals = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 3 / 3;
            } else {
                int i10 = 2 % 2;
            }
            str2 = "";
        }
        this(str, str2, (i & 4) != 0 ? "" : str3);
    }

    public final String getAccountNumber() {
        int i = 2 % 2;
        int i2 = equals + 89;
        int i3 = i2 % 128;
        component4 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.component2;
        int i4 = i3 + 87;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getBusinessNumber() {
        int i = 2 % 2;
        int i2 = component4 + 85;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 31;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAmount() {
        String str;
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 87;
        equals = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.ShareDataUIState;
            int i4 = 95 / 0;
        } else {
            str = this.ShareDataUIState;
        }
        int i5 = i2 + 95;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = 1 + 37;
        component3 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public PayPostPayBillState() {
        this(null, null, null, 7, null);
    }

    public static PayPostPayBillState copy$default(PayPostPayBillState payPostPayBillState, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component4 + 9;
            equals = i3 % 128;
            int i4 = i3 % 2;
            str = payPostPayBillState.component2;
        }
        if ((i & 2) != 0) {
            int i5 = component4 + 79;
            equals = i5 % 128;
            int i6 = i5 % 2;
            str2 = payPostPayBillState.copydefault;
        }
        if ((i & 4) != 0) {
            int i7 = component4 + 123;
            int i8 = i7 % 128;
            equals = i8;
            if (i7 % 2 != 0) {
                str3 = payPostPayBillState.ShareDataUIState;
                int i9 = 42 / 0;
            } else {
                str3 = payPostPayBillState.ShareDataUIState;
            }
            int i10 = i8 + 61;
            component4 = i10 % 128;
            int i11 = i10 % 2;
        }
        return payPostPayBillState.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 55;
        equals = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 121;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 82 / 0;
        }
        return str;
    }

    public final String component2() {
        String str;
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 29;
        equals = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.copydefault;
            int i4 = 98 / 0;
        } else {
            str = this.copydefault;
        }
        int i5 = i2 + 49;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = equals + 19;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.ShareDataUIState;
        if (i3 == 0) {
            int i4 = 5 / 0;
        }
        return str;
    }

    public final PayPostPayBillState copy(String accountNumber, String businessNumber, String amount) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(accountNumber, "");
        Intrinsics.checkNotNullParameter(businessNumber, "");
        Intrinsics.checkNotNullParameter(amount, "");
        PayPostPayBillState payPostPayBillState = new PayPostPayBillState(accountNumber, businessNumber, amount);
        int i2 = component4 + 95;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return payPostPayBillState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof PayPostPayBillState)) {
            int i2 = equals + 81;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        PayPostPayBillState payPostPayBillState = (PayPostPayBillState) other;
        if (!Intrinsics.areEqual(this.component2, payPostPayBillState.component2) || !Intrinsics.areEqual(this.copydefault, payPostPayBillState.copydefault)) {
            return false;
        }
        if (Intrinsics.areEqual(this.ShareDataUIState, payPostPayBillState.ShareDataUIState)) {
            return true;
        }
        int i4 = equals + 109;
        component4 = i4 % 128;
        return i4 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = equals + 79;
        component4 = i2 % 128;
        return i2 % 2 == 0 ? (((r0 % 72) % this.copydefault.hashCode()) - 113) >>> this.ShareDataUIState.hashCode() : (((this.component2.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.ShareDataUIState.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PayPostPayBillState(accountNumber=" + this.component2 + ", businessNumber=" + this.copydefault + ", amount=" + this.ShareDataUIState + ")";
        int i2 = equals + 69;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
