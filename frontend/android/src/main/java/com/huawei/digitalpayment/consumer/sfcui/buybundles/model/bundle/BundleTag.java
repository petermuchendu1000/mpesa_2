package com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ$\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0016\u001a\u00020\u0003H×\u0001J\t\u0010\u0017\u001a\u00020\u0018H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/bundle/BundleTag;", "", "icon", "", "color", "Landroidx/compose/ui/graphics/Color;", "<init>", "(IJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getIcon", "()I", "getColor-0d7_KjU", "()J", "J", "component1", "component2", "component2-0d7_KjU", "copy", "copy-4WTKRHQ", "(IJ)Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/bundle/BundleTag;", "equals", "", "other", "hashCode", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BundleTag {
    public static final int $stable = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int copy = 1;
    private static int copydefault;
    private final long ShareDataUIState;
    private final int component3;

    private BundleTag(int i, long j) {
        this.component3 = i;
        this.ShareDataUIState = j;
    }

    public final int getIcon() {
        int i = 2 % 2;
        int i2 = copy + 41;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component3;
        }
        throw null;
    }

    public final long m11350getColor0d7_KjU() {
        int i = 2 % 2;
        int i2 = component2 + 99;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ShareDataUIState;
        }
        int i3 = 33 / 0;
        return this.ShareDataUIState;
    }

    static {
        int i = 1 + 39;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public BundleTag(int i, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, j);
    }

    public static BundleTag m11347copy4WTKRHQ$default(BundleTag bundleTag, int i, long j, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            i = bundleTag.component3;
        }
        if ((i2 & 2) != 0) {
            int i4 = copy;
            int i5 = i4 + 85;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            long j2 = bundleTag.ShareDataUIState;
            int i7 = i4 + 69;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            j = j2;
        }
        return bundleTag.m11349copy4WTKRHQ(i, j);
    }

    public final int component1() {
        int i = 2 % 2;
        int i2 = copy + 125;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long m11348component20d7_KjU() {
        int i = 2 % 2;
        int i2 = component2 + 85;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ShareDataUIState;
        }
        throw null;
    }

    public final BundleTag m11349copy4WTKRHQ(int icon, long color) {
        int i = 2 % 2;
        BundleTag bundleTag = new BundleTag(icon, color, null);
        int i2 = copy + 53;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return bundleTag;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (other instanceof BundleTag) {
            BundleTag bundleTag = (BundleTag) other;
            return this.component3 == bundleTag.component3 && Color.m6055equalsimpl0(this.ShareDataUIState, bundleTag.ShareDataUIState);
        }
        int i2 = copy;
        int i3 = i2 + 51;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 107;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 79 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 89;
        copy = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (Integer.hashCode(this.component3) - 32) >>> Color.m6061hashCodeimpl(this.ShareDataUIState) : (Integer.hashCode(this.component3) * 31) + Color.m6061hashCodeimpl(this.ShareDataUIState);
        int i3 = copy + 115;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BundleTag(icon=" + this.component3 + ", color=" + Color.m6062toStringimpl(this.ShareDataUIState) + ")";
        int i2 = copy + 57;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
