package com.huawei.digitalpayment.consumer.fixeddata.domain.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÇ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001b\u001a\u00020\u0007H×\u0001J\t\u0010\u001c\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/PaymentPeriod;", "", "title", "", "normalPrice", "discountedPrice", "numMonths", "", "isSelected", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V", "getTitle", "()Ljava/lang/String;", "getNormalPrice", "getDiscountedPrice", "getNumMonths", "()I", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PaymentPeriod {
    public static final int $stable = 0;
    private static int component4 = 0;
    private static int copy = 0;
    private static int equals = 1;
    private static int getAsAtTimestamp = 1;
    private final String ShareDataUIState;
    private final String component1;
    private final int component2;
    private final String component3;
    private final boolean copydefault;

    public PaymentPeriod(String str, String str2, String str3, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.component1 = str;
        this.ShareDataUIState = str2;
        this.component3 = str3;
        this.component2 = i;
        this.copydefault = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PaymentPeriod(String str, String str2, String str3, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 4) != 0) {
            int i3 = getAsAtTimestamp + 65;
            copy = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 98 / 0;
            }
            int i5 = 2 % 2;
            str3 = "";
        }
        this(str, str2, str3, i, z);
    }

    public final String getTitle() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 13;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 121;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getNormalPrice() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 11;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.ShareDataUIState;
        int i5 = i3 + 101;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getDiscountedPrice() {
        int i = 2 % 2;
        int i2 = copy + 55;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 7;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int getNumMonths() {
        int i = 2 % 2;
        int i2 = copy + 101;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component2;
        }
        throw null;
    }

    public final boolean isSelected() {
        int i = 2 % 2;
        int i2 = copy + 65;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        boolean z = this.copydefault;
        int i5 = i3 + 83;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 82 / 0;
        }
        return z;
    }

    static {
        int i = 1 + 87;
        component4 = i % 128;
        int i2 = i % 2;
    }

    public static PaymentPeriod copy$default(PaymentPeriod paymentPeriod, String str, String str2, String str3, int i, boolean z, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = copy + 103;
        int i5 = i4 % 128;
        getAsAtTimestamp = i5;
        if (i4 % 2 != 0 && (i2 & 1) != 0) {
            str = paymentPeriod.component1;
        }
        String str4 = str;
        if ((i2 & 2) != 0) {
            str2 = paymentPeriod.ShareDataUIState;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            int i6 = i5 + 5;
            copy = i6 % 128;
            int i7 = i6 % 2;
            str3 = paymentPeriod.component3;
        }
        String str6 = str3;
        Object obj2 = null;
        if ((i2 & 8) != 0) {
            int i8 = copy + 11;
            getAsAtTimestamp = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = paymentPeriod.component2;
                throw null;
            }
            i = paymentPeriod.component2;
        }
        int i10 = i;
        if ((i2 & 16) != 0) {
            int i11 = getAsAtTimestamp + 111;
            copy = i11 % 128;
            if (i11 % 2 != 0) {
                boolean z2 = paymentPeriod.copydefault;
                obj2.hashCode();
                throw null;
            }
            z = paymentPeriod.copydefault;
        }
        return paymentPeriod.copy(str4, str5, str6, i10, z);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 53;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component1;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 93;
        copy = i2 % 128;
        int i3 = i2 % 2;
        String str = this.ShareDataUIState;
        if (i3 != 0) {
            int i4 = 18 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 65;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component3;
        int i5 = i2 + 93;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final int component4() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 79;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        int i5 = this.component2;
        int i6 = i3 + 9;
        getAsAtTimestamp = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final boolean component5() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 43;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        boolean z = this.copydefault;
        int i5 = i3 + 3;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final PaymentPeriod copy(String title, String normalPrice, String discountedPrice, int numMonths, boolean isSelected) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(title, "");
        Intrinsics.checkNotNullParameter(normalPrice, "");
        Intrinsics.checkNotNullParameter(discountedPrice, "");
        PaymentPeriod paymentPeriod = new PaymentPeriod(title, normalPrice, discountedPrice, numMonths, isSelected);
        int i2 = copy + 41;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return paymentPeriod;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof com.huawei.digitalpayment.consumer.fixeddata.domain.model.PaymentPeriod) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r6 = (com.huawei.digitalpayment.consumer.fixeddata.domain.model.PaymentPeriod) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.component1, r6.component1)) == true) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.ShareDataUIState, r6.ShareDataUIState) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.component3, r6.component3) == true) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.fixeddata.domain.model.PaymentPeriod.getAsAtTimestamp + 119;
        com.huawei.digitalpayment.consumer.fixeddata.domain.model.PaymentPeriod.copy = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if ((r6 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        if (r5.component2 == r6.component2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.fixeddata.domain.model.PaymentPeriod.copy + 49;
        com.huawei.digitalpayment.consumer.fixeddata.domain.model.PaymentPeriod.getAsAtTimestamp = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        if ((r6 % 2) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0064, code lost:
    
        if (r5.copydefault == r6.copydefault) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.fixeddata.domain.model.PaymentPeriod.copy + 89;
        com.huawei.digitalpayment.consumer.fixeddata.domain.model.PaymentPeriod.getAsAtTimestamp = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.fixeddata.domain.model.PaymentPeriod.copy + 71;
        com.huawei.digitalpayment.consumer.fixeddata.domain.model.PaymentPeriod.getAsAtTimestamp = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.fixeddata.domain.model.PaymentPeriod.copy + 119;
        com.huawei.digitalpayment.consumer.fixeddata.domain.model.PaymentPeriod.getAsAtTimestamp = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0083, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.fixeddata.domain.model.PaymentPeriod.getAsAtTimestamp
            int r1 = r1 + 41
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.fixeddata.domain.model.PaymentPeriod.copy = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L16
            r1 = 76
            int r1 = r1 / r3
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r2
        L19:
            boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.fixeddata.domain.model.PaymentPeriod
            if (r1 != 0) goto L1e
            return r3
        L1e:
            com.huawei.digitalpayment.consumer.fixeddata.domain.model.PaymentPeriod r6 = (com.huawei.digitalpayment.consumer.fixeddata.domain.model.PaymentPeriod) r6
            java.lang.String r1 = r5.component1
            java.lang.String r4 = r6.component1
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            r1 = r1 ^ r2
            if (r1 == r2) goto L7a
            java.lang.String r1 = r5.ShareDataUIState
            java.lang.String r4 = r6.ShareDataUIState
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L36
            return r3
        L36:
            java.lang.String r1 = r5.component3
            java.lang.String r4 = r6.component3
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 == r2) goto L4d
            int r6 = com.huawei.digitalpayment.consumer.fixeddata.domain.model.PaymentPeriod.getAsAtTimestamp
            int r6 = r6 + 119
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.fixeddata.domain.model.PaymentPeriod.copy = r1
            int r6 = r6 % r0
            if (r6 == 0) goto L4c
            return r2
        L4c:
            return r3
        L4d:
            int r1 = r5.component2
            int r4 = r6.component2
            if (r1 == r4) goto L60
            int r6 = com.huawei.digitalpayment.consumer.fixeddata.domain.model.PaymentPeriod.copy
            int r6 = r6 + 49
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.fixeddata.domain.model.PaymentPeriod.getAsAtTimestamp = r1
            int r6 = r6 % r0
            if (r6 != 0) goto L5f
            return r2
        L5f:
            return r3
        L60:
            boolean r1 = r5.copydefault
            boolean r6 = r6.copydefault
            if (r1 == r6) goto L70
            int r6 = com.huawei.digitalpayment.consumer.fixeddata.domain.model.PaymentPeriod.copy
            int r6 = r6 + 89
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.fixeddata.domain.model.PaymentPeriod.getAsAtTimestamp = r1
            int r6 = r6 % r0
            return r3
        L70:
            int r6 = com.huawei.digitalpayment.consumer.fixeddata.domain.model.PaymentPeriod.copy
            int r6 = r6 + 71
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.fixeddata.domain.model.PaymentPeriod.getAsAtTimestamp = r1
            int r6 = r6 % r0
            return r2
        L7a:
            int r6 = com.huawei.digitalpayment.consumer.fixeddata.domain.model.PaymentPeriod.copy
            int r6 = r6 + 119
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.fixeddata.domain.model.PaymentPeriod.getAsAtTimestamp = r1
            int r6 = r6 % r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.domain.model.PaymentPeriod.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copy + 111;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.component1.hashCode() * 31) + this.ShareDataUIState.hashCode()) * 31) + this.component3.hashCode()) * 31) + Integer.hashCode(this.component2)) * 31) + Boolean.hashCode(this.copydefault);
        int i4 = getAsAtTimestamp + 123;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 88 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PaymentPeriod(title=" + this.component1 + ", normalPrice=" + this.ShareDataUIState + ", discountedPrice=" + this.component3 + ", numMonths=" + this.component2 + ", isSelected=" + this.copydefault + ")";
        int i2 = copy + 125;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
