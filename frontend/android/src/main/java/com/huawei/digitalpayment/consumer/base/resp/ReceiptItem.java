package com.huawei.digitalpayment.consumer.base.resp;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/ReceiptItem;", "", "label", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "setLabel", "(Ljava/lang/String;)V", "getValue", "setValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReceiptItem {
    private static int component2 = 1;
    private static int copydefault;
    private String label;
    private String value;

    public ReceiptItem(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.label = str;
        this.value = str2;
    }

    public final String getLabel() {
        int i = 2 % 2;
        int i2 = component2 + 111;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.label;
        int i5 = i3 + 9;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final void setLabel(String str) {
        int i = 2 % 2;
        int i2 = component2 + 13;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.label = str;
        int i4 = component2 + 23;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 47;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.value;
        int i4 = i2 + 9;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void setValue(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 105;
        component2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.value = str;
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.value = str;
        int i3 = copydefault + 121;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static ReceiptItem copy$default(ReceiptItem receiptItem, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2 + 65;
        int i4 = i3 % 128;
        copydefault = i4;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            str = receiptItem.label;
            int i5 = i4 + 39;
            component2 = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((i & 2) != 0) {
            int i7 = component2 + 123;
            copydefault = i7 % 128;
            if (i7 % 2 != 0) {
                String str3 = receiptItem.value;
                throw null;
            }
            str2 = receiptItem.value;
        }
        return receiptItem.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 69;
        copydefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.label;
        int i4 = i2 + 15;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 109;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.value;
        int i5 = i2 + 39;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final ReceiptItem copy(String label, String value) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(label, "");
        Intrinsics.checkNotNullParameter(value, "");
        ReceiptItem receiptItem = new ReceiptItem(label, value);
        int i2 = copydefault + 33;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return receiptItem;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if ((r6 instanceof com.huawei.digitalpayment.consumer.base.resp.ReceiptItem) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r6 = (com.huawei.digitalpayment.consumer.base.resp.ReceiptItem) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.label, r6.label) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.value, r6.value) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.base.resp.ReceiptItem.copydefault + 31;
        com.huawei.digitalpayment.consumer.base.resp.ReceiptItem.component2 = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if ((r6 % 2) != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        r6 = 30 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r1 = r1 + 9;
        com.huawei.digitalpayment.consumer.base.resp.ReceiptItem.copydefault = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
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
            int r1 = com.huawei.digitalpayment.consumer.base.resp.ReceiptItem.component2
            int r2 = r1 + 101
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.base.resp.ReceiptItem.copydefault = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L16
            r2 = 69
            int r2 = r2 / r4
            if (r5 != r6) goto L20
            goto L18
        L16:
            if (r5 != r6) goto L20
        L18:
            int r1 = r1 + 9
            int r6 = r1 % 128
            com.huawei.digitalpayment.consumer.base.resp.ReceiptItem.copydefault = r6
            int r1 = r1 % r0
            return r3
        L20:
            boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.base.resp.ReceiptItem
            if (r1 != 0) goto L25
            return r4
        L25:
            com.huawei.digitalpayment.consumer.base.resp.ReceiptItem r6 = (com.huawei.digitalpayment.consumer.base.resp.ReceiptItem) r6
            java.lang.String r1 = r5.label
            java.lang.String r2 = r6.label
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 == 0) goto L3d
            java.lang.String r0 = r5.value
            java.lang.String r6 = r6.value
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r6)
            if (r6 != 0) goto L3c
            return r4
        L3c:
            return r3
        L3d:
            int r6 = com.huawei.digitalpayment.consumer.base.resp.ReceiptItem.copydefault
            int r6 = r6 + 31
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.base.resp.ReceiptItem.component2 = r1
            int r6 = r6 % r0
            if (r6 != 0) goto L4b
            r6 = 30
            int r6 = r6 / r4
        L4b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.resp.ReceiptItem.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 117;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.label.hashCode() * 31) + this.value.hashCode();
        int i4 = copydefault + 75;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ReceiptItem(label=" + this.label + ", value=" + this.value + ")";
        int i2 = component2 + 29;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
