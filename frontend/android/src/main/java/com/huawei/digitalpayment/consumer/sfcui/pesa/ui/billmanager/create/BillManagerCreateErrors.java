package com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.create;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0003H×\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/create/BillManagerCreateErrors;", "", "billName", "", "paybillNumber", "accountNumber", "amount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBillName", "()Ljava/lang/String;", "getPaybillNumber", "getAccountNumber", "getAmount", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BillManagerCreateErrors {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int copy = 1;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 1;
    private final String component1;
    private final String component2;
    private final String component3;
    private final String copydefault;

    public BillManagerCreateErrors(String str, String str2, String str3, String str4) {
        this.component3 = str;
        this.copydefault = str2;
        this.component2 = str3;
        this.component1 = str4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BillManagerCreateErrors(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = copy + 89;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i4 = copy + 37;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            str2 = null;
        }
        if ((i & 4) != 0) {
            int i5 = getAsAtTimestamp + 99;
            copy = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            int i6 = 2 % 2;
            str3 = null;
        }
        if ((i & 8) != 0) {
            int i7 = copy + 13;
            getAsAtTimestamp = i7 % 128;
            int i8 = i7 % 2;
            str4 = null;
        }
        this(str, str2, str3, str4);
    }

    public final String getBillName() {
        int i = 2 % 2;
        int i2 = copy + 101;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component3;
        }
        throw null;
    }

    public final String getPaybillNumber() {
        int i = 2 % 2;
        int i2 = copy + 109;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 61;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getAccountNumber() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 31;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 123;
        int i3 = i2 % 128;
        copy = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.component1;
        int i4 = i3 + 107;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    static {
        int i = 1 + 11;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            int i2 = 99 / 0;
        }
    }

    public BillManagerCreateErrors() {
        this(null, null, null, null, 15, null);
    }

    public static BillManagerCreateErrors copy$default(BillManagerCreateErrors billManagerCreateErrors, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy + 67;
        int i4 = i3 % 128;
        getAsAtTimestamp = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            str = billManagerCreateErrors.component3;
        }
        if ((i & 2) != 0) {
            int i6 = i4 + 19;
            copy = i6 % 128;
            int i7 = i6 % 2;
            str2 = billManagerCreateErrors.copydefault;
        }
        if ((i & 4) != 0) {
            str3 = billManagerCreateErrors.component2;
        }
        if ((i & 8) != 0) {
            int i8 = copy + 31;
            getAsAtTimestamp = i8 % 128;
            if (i8 % 2 != 0) {
                String str5 = billManagerCreateErrors.component1;
                throw null;
            }
            str4 = billManagerCreateErrors.component1;
        }
        return billManagerCreateErrors.copy(str, str2, str3, str4);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 33;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component3;
        int i5 = i2 + 109;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copy + 121;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        String str = this.copydefault;
        if (i3 != 0) {
            int i4 = 50 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copy + 91;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        String str = this.component2;
        int i5 = i3 + 105;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 97;
        copy = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.component1;
        int i4 = i2 + 39;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final BillManagerCreateErrors copy(String billName, String paybillNumber, String accountNumber, String amount) {
        int i = 2 % 2;
        BillManagerCreateErrors billManagerCreateErrors = new BillManagerCreateErrors(billName, paybillNumber, accountNumber, amount);
        int i2 = copy + 107;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        return billManagerCreateErrors;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = getAsAtTimestamp;
            int i3 = i2 + 97;
            copy = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 27;
            copy = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof BillManagerCreateErrors)) {
            return false;
        }
        BillManagerCreateErrors billManagerCreateErrors = (BillManagerCreateErrors) other;
        if (Intrinsics.areEqual(this.component3, billManagerCreateErrors.component3)) {
            return Intrinsics.areEqual(this.copydefault, billManagerCreateErrors.copydefault) && Intrinsics.areEqual(this.component2, billManagerCreateErrors.component2) && Intrinsics.areEqual(this.component1, billManagerCreateErrors.component1);
        }
        int i7 = getAsAtTimestamp + 115;
        copy = i7 % 128;
        if (i7 % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.create.BillManagerCreateErrors.getAsAtTimestamp
            int r2 = r1 + 99
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.create.BillManagerCreateErrors.copy = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L16
            java.lang.String r2 = r7.component3
            if (r2 != 0) goto L28
            r2 = r3
            goto L1b
        L16:
            java.lang.String r2 = r7.component3
            if (r2 != 0) goto L27
            r2 = r4
        L1b:
            int r1 = r1 + 55
            int r5 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.create.BillManagerCreateErrors.copy = r5
            int r1 = r1 % r0
            if (r1 != 0) goto L25
            goto L2e
        L25:
            r3 = r4
            goto L2e
        L27:
            r3 = r4
        L28:
            int r1 = r2.hashCode()
            r2 = r3
            r3 = r1
        L2e:
            java.lang.String r1 = r7.copydefault
            if (r1 != 0) goto L3d
            int r1 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.create.BillManagerCreateErrors.getAsAtTimestamp
            int r1 = r1 + 25
            int r5 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.create.BillManagerCreateErrors.copy = r5
            int r1 = r1 % r0
            r1 = r4
            goto L41
        L3d:
            int r1 = r1.hashCode()
        L41:
            java.lang.String r5 = r7.component2
            if (r5 != 0) goto L4f
            int r5 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.create.BillManagerCreateErrors.getAsAtTimestamp
            int r5 = r5 + 59
        L49:
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.create.BillManagerCreateErrors.copy = r6
            int r5 = r5 % r0
            goto L58
        L4f:
            int r4 = r5.hashCode()
            int r5 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.create.BillManagerCreateErrors.getAsAtTimestamp
            int r5 = r5 + 73
            goto L49
        L58:
            java.lang.String r0 = r7.component1
            if (r0 != 0) goto L5d
            goto L61
        L5d:
            int r2 = r0.hashCode()
        L61:
            int r3 = r3 * 31
            int r3 = r3 + r1
            int r3 = r3 * 31
            int r3 = r3 + r4
            int r3 = r3 * 31
            int r3 = r3 + r2
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.create.BillManagerCreateErrors.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BillManagerCreateErrors(billName=" + this.component3 + ", paybillNumber=" + this.copydefault + ", accountNumber=" + this.component2 + ", amount=" + this.component1 + ")";
        int i2 = copy + 83;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
