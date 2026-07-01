package com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle;

import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0015\u001a\u00020\u0016H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/bundle/OfferCategory;", "", GriverCacheDao.COLUMN_CACHE_ID, "", "name", "isSelected", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getName", "()Z", "setSelected", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OfferCategory {
    public static final int $stable = 8;
    private static int component1 = 0;
    private static int component3 = 77 % 128;
    private static int copy = 0;
    private static int equals = 1;
    private boolean ShareDataUIState;
    private final String component2;
    private final String copydefault;

    public OfferCategory(String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.component2 = str;
        this.copydefault = str2;
        this.ShareDataUIState = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OfferCategory(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            int i2 = copy;
            int i3 = i2 + 59;
            equals = i3 % 128;
            boolean z2 = i3 % 2 == 0;
            int i4 = i2 + 85;
            equals = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            z = z2;
        }
        this(str, str2, z);
    }

    public final String getId() {
        String str;
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 57;
        copy = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.component2;
            int i4 = 12 / 0;
        } else {
            str = this.component2;
        }
        int i5 = i2 + 15;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = equals + 29;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return this.copydefault;
        }
        throw null;
    }

    public final boolean isSelected() {
        int i = 2 % 2;
        int i2 = copy + 73;
        int i3 = i2 % 128;
        equals = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.ShareDataUIState;
        int i4 = i3 + 35;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final void setSelected(boolean z) {
        int i = 2 % 2;
        int i2 = copy + 123;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        this.ShareDataUIState = z;
        int i5 = i3 + 97;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    static {
        int i = 77 % 2;
    }

    public static OfferCategory copy$default(OfferCategory offerCategory, String str, String str2, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals + 99;
        int i4 = i3 % 128;
        copy = i4;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            str = offerCategory.component2;
        }
        if ((i & 2) != 0) {
            int i5 = i4 + 57;
            equals = i5 % 128;
            if (i5 % 2 == 0) {
                String str3 = offerCategory.copydefault;
                throw null;
            }
            str2 = offerCategory.copydefault;
        }
        if ((i & 4) != 0) {
            int i6 = i4 + 39;
            equals = i6 % 128;
            int i7 = i6 % 2;
            z = offerCategory.ShareDataUIState;
        }
        return offerCategory.copy(str, str2, z);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copy + 125;
        equals = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component2;
        if (i3 == 0) {
            int i4 = 52 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 93;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.copydefault;
        int i4 = i2 + 55;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final boolean component3() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 7;
        equals = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.ShareDataUIState;
        int i5 = i2 + 51;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final OfferCategory copy(String id, String name, boolean isSelected) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(id, "");
        Intrinsics.checkNotNullParameter(name, "");
        OfferCategory offerCategory = new OfferCategory(id, name, isSelected);
        int i2 = equals + 43;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return offerCategory;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle.OfferCategory) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r6 = r1 + 117;
        com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle.OfferCategory.copy = r6 % 128;
        r6 = r6 % 2;
        r1 = r1 + 77;
        com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle.OfferCategory.copy = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if ((r1 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        r6 = 26 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        r6 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle.OfferCategory) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.component2, r6.component2)) == true) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.copydefault, r6.copydefault)) == true) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        if (r5.ShareDataUIState == r6.ShareDataUIState) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle.OfferCategory.equals + 125;
        com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle.OfferCategory.copy = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle.OfferCategory.copy + 81;
        com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle.OfferCategory.equals = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle.OfferCategory.copy + 73;
        com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle.OfferCategory.equals = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
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
            int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle.OfferCategory.equals
            int r2 = r1 + 59
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle.OfferCategory.copy = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L16
            r2 = 46
            int r2 = r2 / r4
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r3
        L19:
            boolean r2 = r6 instanceof com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle.OfferCategory
            if (r2 != 0) goto L31
            int r6 = r1 + 117
            int r2 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle.OfferCategory.copy = r2
            int r6 = r6 % r0
            int r1 = r1 + 77
            int r6 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle.OfferCategory.copy = r6
            int r1 = r1 % r0
            if (r1 == 0) goto L30
            r6 = 26
            int r6 = r6 / r4
        L30:
            return r4
        L31:
            com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle.OfferCategory r6 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle.OfferCategory) r6
            java.lang.String r1 = r5.component2
            java.lang.String r2 = r6.component2
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            r1 = r1 ^ r3
            if (r1 == r3) goto L64
            java.lang.String r1 = r5.copydefault
            java.lang.String r2 = r6.copydefault
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            r1 = r1 ^ r3
            if (r1 == r3) goto L5a
            boolean r1 = r5.ShareDataUIState
            boolean r6 = r6.ShareDataUIState
            if (r1 == r6) goto L59
            int r6 = com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle.OfferCategory.equals
            int r6 = r6 + 125
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle.OfferCategory.copy = r1
            int r6 = r6 % r0
            return r4
        L59:
            return r3
        L5a:
            int r6 = com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle.OfferCategory.copy
            int r6 = r6 + 81
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle.OfferCategory.equals = r1
            int r6 = r6 % r0
            return r4
        L64:
            int r6 = com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle.OfferCategory.copy
            int r6 = r6 + 73
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle.OfferCategory.equals = r1
            int r6 = r6 % r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle.OfferCategory.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copy + 125;
        equals = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (((this.component2.hashCode() % 29) << this.copydefault.hashCode()) >>> 56) << Boolean.hashCode(this.ShareDataUIState) : (((this.component2.hashCode() * 31) + this.copydefault.hashCode()) * 31) + Boolean.hashCode(this.ShareDataUIState);
        int i3 = equals + 3;
        copy = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OfferCategory(id=" + this.component2 + ", name=" + this.copydefault + ", isSelected=" + this.ShareDataUIState + ")";
        int i2 = copy + 85;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
