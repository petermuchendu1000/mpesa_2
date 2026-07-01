package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H×\u0003J\t\u0010\u001a\u001a\u00020\u001bH×\u0001J\t\u0010\u001c\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/BuyBundleWithMpesa;", "Ljava/io/Serializable;", "productId", "", "sponsorMsisdn", "buyFor", "beneficiaryMsisdn", "amount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getProductId", "()Ljava/lang/String;", "getSponsorMsisdn", "getBuyFor", "getBeneficiaryMsisdn", "getAmount", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BuyBundleWithMpesa implements Serializable {
    public static final int $stable = 0;
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component3;
    private static int copydefault;
    private final String amount;
    private final String beneficiaryMsisdn;
    private final String buyFor;
    private final String productId;
    private final String sponsorMsisdn;

    public BuyBundleWithMpesa(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.productId = str;
        this.sponsorMsisdn = str2;
        this.buyFor = str3;
        this.beneficiaryMsisdn = str4;
        this.amount = str5;
    }

    public final String getProductId() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 69;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.productId;
        int i5 = i2 + 73;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getSponsorMsisdn() {
        int i = 2 % 2;
        int i2 = copydefault + 25;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.sponsorMsisdn;
        int i5 = i3 + 9;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getBuyFor() {
        int i = 2 % 2;
        int i2 = component1 + 33;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.buyFor;
        int i5 = i3 + 1;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getBeneficiaryMsisdn() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 17;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.beneficiaryMsisdn;
        int i5 = i2 + 105;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 85;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.amount;
        int i4 = i2 + 23;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    static {
        int i = 1 + 113;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static BuyBundleWithMpesa copy$default(BuyBundleWithMpesa buyBundleWithMpesa, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        String str6;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = buyBundleWithMpesa.productId;
        }
        String str7 = str;
        if ((i & 2) != 0) {
            str2 = buyBundleWithMpesa.sponsorMsisdn;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            int i3 = component1 + 25;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                String str9 = buyBundleWithMpesa.buyFor;
                throw null;
            }
            str3 = buyBundleWithMpesa.buyFor;
        }
        String str10 = str3;
        if ((i & 8) != 0) {
            int i4 = component1 + 69;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                str6 = buyBundleWithMpesa.beneficiaryMsisdn;
                int i5 = 45 / 0;
            } else {
                str6 = buyBundleWithMpesa.beneficiaryMsisdn;
            }
            str4 = str6;
        }
        String str11 = str4;
        if ((i & 16) != 0) {
            int i6 = component1 + 105;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            str5 = buyBundleWithMpesa.amount;
        }
        return buyBundleWithMpesa.copy(str7, str8, str10, str11, str5);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 115;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.productId;
        int i5 = i2 + 25;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 67;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.sponsorMsisdn;
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1 + 33;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.buyFor;
        int i5 = i3 + 91;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component1 + 49;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.beneficiaryMsisdn;
        int i5 = i3 + 29;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 63 / 0;
        }
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = copydefault + 29;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.amount;
        }
        throw null;
    }

    public final BuyBundleWithMpesa copy(String productId, String sponsorMsisdn, String buyFor, String beneficiaryMsisdn, String amount) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(productId, "");
        Intrinsics.checkNotNullParameter(sponsorMsisdn, "");
        Intrinsics.checkNotNullParameter(buyFor, "");
        Intrinsics.checkNotNullParameter(beneficiaryMsisdn, "");
        Intrinsics.checkNotNullParameter(amount, "");
        BuyBundleWithMpesa buyBundleWithMpesa = new BuyBundleWithMpesa(productId, sponsorMsisdn, buyFor, beneficiaryMsisdn, amount);
        int i2 = copydefault + 1;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return buyBundleWithMpesa;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        if ((r6 instanceof com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.BuyBundleWithMpesa) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        r6 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.BuyBundleWithMpesa) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.productId, r6.productId) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.sponsorMsisdn, r6.sponsorMsisdn) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.BuyBundleWithMpesa.component1 + 59;
        com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.BuyBundleWithMpesa.copydefault = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.buyFor, r6.buyFor) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.beneficiaryMsisdn, r6.beneficiaryMsisdn)) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.amount, r6.amount) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
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
            int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.BuyBundleWithMpesa.component1
            int r1 = r1 + 5
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.BuyBundleWithMpesa.copydefault = r2
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
            boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.BuyBundleWithMpesa
            if (r1 != 0) goto L1d
            return r3
        L1d:
            com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.BuyBundleWithMpesa r6 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.BuyBundleWithMpesa) r6
            java.lang.String r1 = r5.productId
            java.lang.String r4 = r6.productId
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L2a
            return r3
        L2a:
            java.lang.String r1 = r5.sponsorMsisdn
            java.lang.String r4 = r6.sponsorMsisdn
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L3e
            int r6 = com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.BuyBundleWithMpesa.component1
            int r6 = r6 + 59
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.BuyBundleWithMpesa.copydefault = r1
            int r6 = r6 % r0
            return r3
        L3e:
            java.lang.String r0 = r5.buyFor
            java.lang.String r1 = r6.buyFor
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L49
            return r3
        L49:
            java.lang.String r0 = r5.beneficiaryMsisdn
            java.lang.String r1 = r6.beneficiaryMsisdn
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            r0 = r0 ^ r2
            if (r0 == 0) goto L55
            return r3
        L55:
            java.lang.String r0 = r5.amount
            java.lang.String r6 = r6.amount
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r6)
            if (r6 != 0) goto L60
            return r3
        L60:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.BuyBundleWithMpesa.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.productId.hashCode() * 31) + this.sponsorMsisdn.hashCode()) * 31) + this.buyFor.hashCode()) * 31) + this.beneficiaryMsisdn.hashCode()) * 31) + this.amount.hashCode();
        int i4 = copydefault + 107;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BuyBundleWithMpesa(productId=" + this.productId + ", sponsorMsisdn=" + this.sponsorMsisdn + ", buyFor=" + this.buyFor + ", beneficiaryMsisdn=" + this.beneficiaryMsisdn + ", amount=" + this.amount + ")";
        int i2 = component1 + 15;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 18 / 0;
        }
        return str;
    }
}
