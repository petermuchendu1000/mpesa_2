package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0003j\b\u0012\u0004\u0012\u00020\u0002`\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/MakeUrBundleValidation;", "Lkotlin/collections/ArrayList;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/MakeUrBundleValidationItem;", "Ljava/util/ArrayList;", "<init>", "()V", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MakeUrBundleValidation extends ArrayList<MakeUrBundleValidationItem> {
    public static final int $stable = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 103 % 128;
    private static int copydefault;

    public boolean contains(MakeUrBundleValidationItem makeUrBundleValidationItem) {
        int i = 2 % 2;
        int i2 = component1 + 101;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        boolean zContains = super.contains((Object) makeUrBundleValidationItem);
        int i4 = component2 + 5;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return zContains;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final boolean contains(Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 35;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        if (!(!(obj instanceof MakeUrBundleValidationItem))) {
            return contains((MakeUrBundleValidationItem) obj);
        }
        int i5 = i3 + 17;
        component2 = i5 % 128;
        return i5 % 2 == 0;
    }

    public int getSize() {
        int i = 2 % 2;
        int i2 = component1 + 33;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int size = super.size();
        int i4 = component1 + 123;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return size;
        }
        throw null;
    }

    public int indexOf(MakeUrBundleValidationItem makeUrBundleValidationItem) {
        int i = 2 % 2;
        int i2 = component2 + 111;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            super.indexOf((Object) makeUrBundleValidationItem);
            throw null;
        }
        int iIndexOf = super.indexOf((Object) makeUrBundleValidationItem);
        int i3 = component1 + 35;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return iIndexOf;
    }

    @Override
    public final int indexOf(Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 105;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            boolean z = obj instanceof MakeUrBundleValidationItem;
            throw null;
        }
        if (!(obj instanceof MakeUrBundleValidationItem)) {
            int i4 = i3 + 25;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return -1;
            }
            throw null;
        }
        int iIndexOf = indexOf((MakeUrBundleValidationItem) obj);
        int i5 = component2 + 45;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return iIndexOf;
        }
        throw null;
    }

    public int lastIndexOf(MakeUrBundleValidationItem makeUrBundleValidationItem) {
        int i = 2 % 2;
        int i2 = component1 + 99;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return super.lastIndexOf((Object) makeUrBundleValidationItem);
        }
        super.lastIndexOf((Object) makeUrBundleValidationItem);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if ((r1 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        return lastIndexOf((com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.MakeUrBundleValidationItem) r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if ((r5 instanceof com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.MakeUrBundleValidationItem) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if ((r5 instanceof com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.MakeUrBundleValidationItem) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = r1 + 59;
        com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.MakeUrBundleValidation.component1 = r1 % 128;
     */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int lastIndexOf(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.MakeUrBundleValidation.component2
            int r2 = r1 + 61
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.MakeUrBundleValidation.component1 = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L17
            boolean r2 = r5 instanceof com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.MakeUrBundleValidationItem
            r3 = 51
            int r3 = r3 / 0
            if (r2 != 0) goto L28
            goto L1b
        L17:
            boolean r2 = r5 instanceof com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.MakeUrBundleValidationItem
            if (r2 != 0) goto L28
        L1b:
            int r1 = r1 + 59
            int r5 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.MakeUrBundleValidation.component1 = r5
            int r1 = r1 % r0
            if (r1 != 0) goto L26
            r5 = -1
            return r5
        L26:
            r5 = 0
            throw r5
        L28:
            com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.MakeUrBundleValidationItem r5 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.MakeUrBundleValidationItem) r5
            int r5 = r4.lastIndexOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.MakeUrBundleValidation.lastIndexOf(java.lang.Object):int");
    }

    @Override
    public final MakeUrBundleValidationItem remove(int i) {
        int i2 = 2 % 2;
        int i3 = component1 + 15;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        MakeUrBundleValidationItem makeUrBundleValidationItemRemoveAt = removeAt(i);
        int i5 = component1 + 55;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return makeUrBundleValidationItemRemoveAt;
    }

    public boolean remove(MakeUrBundleValidationItem makeUrBundleValidationItem) {
        int i = 2 % 2;
        int i2 = component1 + 43;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        boolean zRemove = super.remove((Object) makeUrBundleValidationItem);
        if (i3 == 0) {
            int i4 = 86 / 0;
        }
        int i5 = component2 + 43;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return zRemove;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        r5 = null;
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if ((r5 instanceof com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.MakeUrBundleValidationItem) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if ((!(r5 instanceof com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.MakeUrBundleValidationItem)) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        r5 = remove((com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.MakeUrBundleValidationItem) r5);
        r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.MakeUrBundleValidation.component2 + 9;
        com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.MakeUrBundleValidation.component1 = r1 % 128;
     */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.MakeUrBundleValidation.component1
            int r1 = r1 + 103
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.MakeUrBundleValidation.component2 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L17
            boolean r1 = r5 instanceof com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.MakeUrBundleValidationItem
            r3 = 11
            int r3 = r3 / r2
            if (r1 != 0) goto L1d
            goto L34
        L17:
            boolean r1 = r5 instanceof com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.MakeUrBundleValidationItem
            r3 = 1
            r1 = r1 ^ r3
            if (r1 == r3) goto L34
        L1d:
            com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.MakeUrBundleValidationItem r5 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.MakeUrBundleValidationItem) r5
            boolean r5 = r4.remove(r5)
            int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.MakeUrBundleValidation.component2
            int r1 = r1 + 9
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.MakeUrBundleValidation.component1 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L2f
            return r5
        L2f:
            r5 = 0
            r5.hashCode()
            throw r5
        L34:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.MakeUrBundleValidation.remove(java.lang.Object):boolean");
    }

    public MakeUrBundleValidationItem removeAt(int i) {
        int i2 = 2 % 2;
        int i3 = component2 + 31;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        MakeUrBundleValidationItem makeUrBundleValidationItem = (MakeUrBundleValidationItem) super.remove(i);
        int i5 = component2 + 99;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 12 / 0;
        }
        return makeUrBundleValidationItem;
    }

    @Override
    public final int size() {
        int i = 2 % 2;
        int i2 = component2 + 119;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            getSize();
            throw null;
        }
        int size = getSize();
        int i3 = component2 + 49;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return size;
    }

    static {
        if (103 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
