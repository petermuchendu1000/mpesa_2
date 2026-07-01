package com.huawei.digitalpayment.consumer.sfcui.buybundles.searchbundles;

import com.huawei.digitalpayment.consumer.sfcui.api.FavouriteBundlesService;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle.Bundle;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/BundleSection;", "", "name", "", FavouriteBundlesService.BUNDLES_PARAM, "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/bundle/Bundle;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getBundles", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BundleSection {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component2 = 0;
    private static int component3 = 119 % 128;
    private static int equals = 1;
    private final String component1;
    private final List<Bundle> copydefault;

    public BundleSection(String str, List<Bundle> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.component1 = str;
        this.copydefault = list;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 91;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 53;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final List<Bundle> getBundles() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 59;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        List<Bundle> list = this.copydefault;
        int i5 = i3 + 73;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 58 / 0;
        }
        return list;
    }

    static {
        if (119 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static BundleSection copy$default(BundleSection bundleSection, String str, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals;
        int i4 = i3 + 113;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            str = bundleSection.component1;
            int i5 = i3 + 21;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((i & 2) != 0) {
            list = bundleSection.copydefault;
        }
        return bundleSection.copy(str, list);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 41;
        equals = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 125;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<Bundle> component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 39;
        equals = i3 % 128;
        int i4 = i3 % 2;
        List<Bundle> list = this.copydefault;
        int i5 = i2 + 41;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final BundleSection copy(String name, List<Bundle> bundles) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(name, "");
        Intrinsics.checkNotNullParameter(bundles, "");
        BundleSection bundleSection = new BundleSection(name, bundles);
        int i2 = ShareDataUIState + 89;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return bundleSection;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (other instanceof BundleSection) {
            BundleSection bundleSection = (BundleSection) other;
            if (Intrinsics.areEqual(this.component1, bundleSection.component1)) {
                return Intrinsics.areEqual(this.copydefault, bundleSection.copydefault);
            }
            int i2 = equals + 5;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = equals + 79;
        int i5 = i4 % 128;
        ShareDataUIState = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 105;
        equals = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 35 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 99;
        equals = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.component1.hashCode();
        return i3 == 0 ? (iHashCode / 61) - this.copydefault.hashCode() : (iHashCode * 31) + this.copydefault.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BundleSection(name=" + this.component1 + ", bundles=" + this.copydefault + ")";
        int i2 = equals + 37;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
