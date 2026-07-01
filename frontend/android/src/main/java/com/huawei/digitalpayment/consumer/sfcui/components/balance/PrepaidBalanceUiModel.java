package com.huawei.digitalpayment.consumer.sfcui.components.balance;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H×\u0003J\t\u0010\u0014\u001a\u00020\u0015H×\u0001J\t\u0010\u0016\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/PrepaidBalanceUiModel;", "Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/BalanceItem;", "balanceName", "", "remainingBalance", "expiryDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBalanceName", "()Ljava/lang/String;", "getRemainingBalance", "getExpiryDate", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PrepaidBalanceUiModel implements BalanceItem {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component1 = 37 % 128;
    private static int equals = 1;
    private static int getAsAtTimestamp;
    private final String component2;
    private final String component3;
    private final String copydefault;

    public PrepaidBalanceUiModel(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.copydefault = str;
        this.component3 = str2;
        this.component2 = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PrepaidBalanceUiModel(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = getAsAtTimestamp + 53;
            equals = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i3 = 2 % 2;
            str = "";
        }
        str2 = (i & 2) != 0 ? "" : str2;
        if ((i & 4) != 0) {
            int i4 = getAsAtTimestamp + 51;
            equals = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            int i5 = 2 % 2;
            str3 = "";
        }
        this(str, str2, str3);
    }

    public final String getBalanceName() {
        int i = 2 % 2;
        int i2 = equals + 5;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 67;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getRemainingBalance() {
        String str;
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 83;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.component3;
            int i4 = 2 / 0;
        } else {
            str = this.component3;
        }
        int i5 = i2 + 21;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getExpiryDate() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 57;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 103;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        if (37 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public PrepaidBalanceUiModel() {
        this(null, null, null, 7, null);
    }

    public static PrepaidBalanceUiModel copy$default(PrepaidBalanceUiModel prepaidBalanceUiModel, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals + 51;
        int i4 = i3 % 128;
        getAsAtTimestamp = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 75;
            equals = i6 % 128;
            if (i6 % 2 == 0) {
                str = prepaidBalanceUiModel.copydefault;
                int i7 = 66 / 0;
            } else {
                str = prepaidBalanceUiModel.copydefault;
            }
        }
        if ((i & 2) != 0) {
            str2 = prepaidBalanceUiModel.component3;
            int i8 = i4 + 3;
            equals = i8 % 128;
            int i9 = i8 % 2;
        }
        if ((i & 4) != 0) {
            str3 = prepaidBalanceUiModel.component2;
        }
        return prepaidBalanceUiModel.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 103;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 21;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 13;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 27;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = equals + 51;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        String str = this.component2;
        int i5 = i3 + 51;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 22 / 0;
        }
        return str;
    }

    public final PrepaidBalanceUiModel copy(String balanceName, String remainingBalance, String expiryDate) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(balanceName, "");
        Intrinsics.checkNotNullParameter(remainingBalance, "");
        Intrinsics.checkNotNullParameter(expiryDate, "");
        PrepaidBalanceUiModel prepaidBalanceUiModel = new PrepaidBalanceUiModel(balanceName, remainingBalance, expiryDate);
        int i2 = getAsAtTimestamp + 77;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return prepaidBalanceUiModel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((!(r6 instanceof com.huawei.digitalpayment.consumer.sfcui.components.balance.PrepaidBalanceUiModel)) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r6 = (com.huawei.digitalpayment.consumer.sfcui.components.balance.PrepaidBalanceUiModel) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.copydefault, r6.copydefault) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.components.balance.PrepaidBalanceUiModel.getAsAtTimestamp + 1;
        com.huawei.digitalpayment.consumer.sfcui.components.balance.PrepaidBalanceUiModel.equals = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.component3, r6.component3) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.components.balance.PrepaidBalanceUiModel.getAsAtTimestamp + 3;
        r1 = r6 % 128;
        com.huawei.digitalpayment.consumer.sfcui.components.balance.PrepaidBalanceUiModel.equals = r1;
        r6 = r6 % 2;
        r1 = r1 + 81;
        com.huawei.digitalpayment.consumer.sfcui.components.balance.PrepaidBalanceUiModel.getAsAtTimestamp = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.component2, r6.component2) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
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
            int r1 = com.huawei.digitalpayment.consumer.sfcui.components.balance.PrepaidBalanceUiModel.equals
            int r1 = r1 + 79
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.components.balance.PrepaidBalanceUiModel.getAsAtTimestamp = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L15
            r1 = 6
            int r1 = r1 / r3
            if (r5 != r6) goto L18
            goto L17
        L15:
            if (r5 != r6) goto L18
        L17:
            return r2
        L18:
            boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.sfcui.components.balance.PrepaidBalanceUiModel
            r1 = r1 ^ r2
            if (r1 == 0) goto L1e
            return r3
        L1e:
            com.huawei.digitalpayment.consumer.sfcui.components.balance.PrepaidBalanceUiModel r6 = (com.huawei.digitalpayment.consumer.sfcui.components.balance.PrepaidBalanceUiModel) r6
            java.lang.String r1 = r5.copydefault
            java.lang.String r4 = r6.copydefault
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L33
            int r6 = com.huawei.digitalpayment.consumer.sfcui.components.balance.PrepaidBalanceUiModel.getAsAtTimestamp
            int r6 = r6 + r2
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.components.balance.PrepaidBalanceUiModel.equals = r1
            int r6 = r6 % r0
            return r3
        L33:
            java.lang.String r1 = r5.component3
            java.lang.String r4 = r6.component3
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L4e
            int r6 = com.huawei.digitalpayment.consumer.sfcui.components.balance.PrepaidBalanceUiModel.getAsAtTimestamp
            int r6 = r6 + 3
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.components.balance.PrepaidBalanceUiModel.equals = r1
            int r6 = r6 % r0
            int r1 = r1 + 81
            int r6 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.components.balance.PrepaidBalanceUiModel.getAsAtTimestamp = r6
            int r1 = r1 % r0
            return r3
        L4e:
            java.lang.String r0 = r5.component2
            java.lang.String r6 = r6.component2
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r6)
            if (r6 != 0) goto L59
            return r3
        L59:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.components.balance.PrepaidBalanceUiModel.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = equals + 105;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.copydefault.hashCode() * 31) + this.component3.hashCode()) * 31) + this.component2.hashCode();
        int i4 = equals + 81;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PrepaidBalanceUiModel(balanceName=" + this.copydefault + ", remainingBalance=" + this.component3 + ", expiryDate=" + this.component2 + ")";
        int i2 = getAsAtTimestamp + 93;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
