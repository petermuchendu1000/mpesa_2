package com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model;

import com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/BundleWithLimit;", "", "bundle", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/bundle/Bundle;", "limit", "", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/bundle/Bundle;Ljava/lang/String;)V", "getBundle", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/bundle/Bundle;", "getLimit", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BundleWithLimit {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component3 = 0;
    private static int copydefault = 1;
    private static int getRequestBeneficiariesState = 1;
    private final String component1;
    private final Bundle component2;

    public BundleWithLimit(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(bundle, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.component2 = bundle;
        this.component1 = str;
    }

    public final Bundle getBundle() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 107;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Bundle bundle = this.component2;
        int i4 = i2 + 105;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return bundle;
    }

    public final String getLimit() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 67;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 57;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 0 / 0;
        }
        return str;
    }

    static {
        int i = 1 + 49;
        component3 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static BundleWithLimit copy$default(BundleWithLimit bundleWithLimit, Bundle bundle, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 97;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 29;
            getRequestBeneficiariesState = i6 % 128;
            if (i6 % 2 == 0) {
                Bundle bundle2 = bundleWithLimit.component2;
                throw null;
            }
            bundle = bundleWithLimit.component2;
        }
        if ((i & 2) != 0) {
            str = bundleWithLimit.component1;
        }
        return bundleWithLimit.copy(bundle, str);
    }

    public final Bundle component1() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 51;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 1;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 29;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final BundleWithLimit copy(Bundle bundle, String limit) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bundle, "");
        Intrinsics.checkNotNullParameter(limit, "");
        BundleWithLimit bundleWithLimit = new BundleWithLimit(bundle, limit);
        int i2 = getRequestBeneficiariesState + 37;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return bundleWithLimit;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof BundleWithLimit)) {
            int i2 = ShareDataUIState + 95;
            int i3 = i2 % 128;
            getRequestBeneficiariesState = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 117;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        BundleWithLimit bundleWithLimit = (BundleWithLimit) other;
        if (!Intrinsics.areEqual(this.component2, bundleWithLimit.component2)) {
            int i7 = getRequestBeneficiariesState + 107;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.component1, bundleWithLimit.component1)) {
            return true;
        }
        int i9 = getRequestBeneficiariesState;
        int i10 = i9 + 37;
        ShareDataUIState = i10 % 128;
        int i11 = i10 % 2;
        int i12 = i9 + 107;
        ShareDataUIState = i12 % 128;
        if (i12 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 89;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.component2.hashCode() * 31) + this.component1.hashCode();
        int i4 = ShareDataUIState + 59;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BundleWithLimit(bundle=" + this.component2 + ", limit=" + this.component1 + ")";
        int i2 = ShareDataUIState + 107;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
