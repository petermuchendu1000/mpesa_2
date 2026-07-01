package com.huawei.digitalpayment.consumer.sfcui.buybundles.entertainmentbundles.model;

import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÇ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001b\u001a\u00020\u0003H×\u0001J\t\u0010\u001c\u001a\u00020\u001dH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/entertainmentbundles/model/EntertainmentBundle;", "", "icon", "", "supportingIcon", "title", "description", GriverCacheDao.COLUMN_CACHE_ID, "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/entertainmentbundles/model/BundleId;", "<init>", "(IIIILcom/huawei/digitalpayment/consumer/sfcui/buybundles/entertainmentbundles/model/BundleId;)V", "getIcon", "()I", "getSupportingIcon", "getTitle", "getDescription", "getId", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/entertainmentbundles/model/BundleId;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EntertainmentBundle {
    public static final int $stable = 0;
    private static int component4 = 0;
    private static int copy = 1;
    private static int equals = 121 % 128;
    private static int getAsAtTimestamp;
    private final int ShareDataUIState;
    private final BundleId component1;
    private final int component2;
    private final int component3;
    private final int copydefault;

    public EntertainmentBundle(int i, int i2, int i3, int i4, BundleId bundleId) {
        Intrinsics.checkNotNullParameter(bundleId, "");
        this.ShareDataUIState = i;
        this.component3 = i2;
        this.component2 = i3;
        this.copydefault = i4;
        this.component1 = bundleId;
    }

    public final int getIcon() {
        int i = 2 % 2;
        int i2 = copy + 91;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.ShareDataUIState;
        if (i3 != 0) {
            int i5 = 28 / 0;
        }
        return i4;
    }

    public final int getSupportingIcon() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 111;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        int i5 = this.component3;
        int i6 = i3 + 65;
        getAsAtTimestamp = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getTitle() {
        int i;
        int i2 = 2 % 2;
        int i3 = copy;
        int i4 = i3 + 77;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            i = this.component2;
            int i5 = 9 / 0;
        } else {
            i = this.component2;
        }
        int i6 = i3 + 77;
        getAsAtTimestamp = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public final int getDescription() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 43;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        int i5 = this.copydefault;
        int i6 = i3 + 77;
        getAsAtTimestamp = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final BundleId getId() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 87;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        BundleId bundleId = this.component1;
        int i5 = i3 + 99;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return bundleId;
    }

    static {
        int i = 121 % 2;
    }

    public static EntertainmentBundle copy$default(EntertainmentBundle entertainmentBundle, int i, int i2, int i3, int i4, BundleId bundleId, int i5, Object obj) {
        int i6 = 2 % 2;
        int i7 = copy;
        int i8 = i7 + 107;
        getAsAtTimestamp = i8 % 128;
        if (i8 % 2 == 0 && (i5 & 1) != 0) {
            i = entertainmentBundle.ShareDataUIState;
        }
        int i9 = i;
        if ((i5 & 2) != 0) {
            i2 = entertainmentBundle.component3;
            int i10 = i7 + 95;
            getAsAtTimestamp = i10 % 128;
            int i11 = i10 % 2;
        }
        int i12 = i2;
        if ((i5 & 4) != 0) {
            i3 = entertainmentBundle.component2;
            int i13 = getAsAtTimestamp + 117;
            copy = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 3 / 2;
            }
        }
        int i15 = i3;
        if ((i5 & 8) != 0) {
            i4 = entertainmentBundle.copydefault;
        }
        int i16 = i4;
        if ((i5 & 16) != 0) {
            bundleId = entertainmentBundle.component1;
        }
        return entertainmentBundle.copy(i9, i12, i15, i16, bundleId);
    }

    public final int component1() {
        int i = 2 % 2;
        int i2 = copy + 61;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.ShareDataUIState;
        if (i3 != 0) {
            int i5 = 71 / 0;
        }
        return i4;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 61;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.component3;
        int i6 = i2 + 55;
        getAsAtTimestamp = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int component3() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 53;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component2;
        }
        throw null;
    }

    public final int component4() {
        int i = 2 % 2;
        int i2 = copy + 55;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        int i5 = this.copydefault;
        int i6 = i3 + 97;
        copy = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 0 / 0;
        }
        return i5;
    }

    public final BundleId component5() {
        int i = 2 % 2;
        int i2 = copy + 69;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        BundleId bundleId = this.component1;
        if (i3 != 0) {
            int i4 = 78 / 0;
        }
        return bundleId;
    }

    public final EntertainmentBundle copy(int icon, int supportingIcon, int title, int description, BundleId id) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(id, "");
        EntertainmentBundle entertainmentBundle = new EntertainmentBundle(icon, supportingIcon, title, description, id);
        int i2 = getAsAtTimestamp + 39;
        copy = i2 % 128;
        int i3 = i2 % 2;
        return entertainmentBundle;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copy + 107;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof EntertainmentBundle)) {
            return false;
        }
        EntertainmentBundle entertainmentBundle = (EntertainmentBundle) other;
        if (this.ShareDataUIState != entertainmentBundle.ShareDataUIState || this.component3 != entertainmentBundle.component3) {
            return false;
        }
        if (this.component2 != entertainmentBundle.component2) {
            int i4 = copy + 3;
            getAsAtTimestamp = i4 % 128;
            return i4 % 2 != 0;
        }
        if (this.copydefault != entertainmentBundle.copydefault) {
            return false;
        }
        if (this.component1 == entertainmentBundle.component1) {
            return true;
        }
        int i5 = getAsAtTimestamp + 13;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copy + 31;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((Integer.hashCode(this.ShareDataUIState) * 31) + Integer.hashCode(this.component3)) * 31) + Integer.hashCode(this.component2)) * 31) + Integer.hashCode(this.copydefault)) * 31) + this.component1.hashCode();
        int i4 = copy + 111;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EntertainmentBundle(icon=" + this.ShareDataUIState + ", supportingIcon=" + this.component3 + ", title=" + this.component2 + ", description=" + this.copydefault + ", id=" + this.component1 + ")";
        int i2 = copy + 85;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
