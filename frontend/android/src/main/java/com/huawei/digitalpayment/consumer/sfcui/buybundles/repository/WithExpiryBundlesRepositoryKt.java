package com.huawei.digitalpayment.consumer.sfcui.buybundles.repository;

import com.huawei.digitalpayment.consumer.base.database.entities.productcatalog.WithExpiryBundleEntity;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.SubBundles;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u001a\f\u0010\u0006\u001a\u00020\u0002*\u00020\u0001H\u0002¨\u0006\u0007"}, d2 = {"toEntity", "Lcom/huawei/digitalpayment/consumer/base/database/entities/productcatalog/WithExpiryBundleEntity;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/SubBundles;", "packageName", "", "childHeading", "toSubBundle", "ConsumerSfcUI_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class WithExpiryBundlesRepositoryKt {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;

    public static final WithExpiryBundleEntity access$toEntity(SubBundles subBundles, String str, String str2) {
        int i = 2 % 2;
        int i2 = component2 + 13;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        WithExpiryBundleEntity withExpiryBundleEntityShareDataUIState = ShareDataUIState(subBundles, str, str2);
        int i4 = component2 + 107;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 47 / 0;
        }
        return withExpiryBundleEntityShareDataUIState;
    }

    public static final SubBundles access$toSubBundle(WithExpiryBundleEntity withExpiryBundleEntity) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 37;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        SubBundles subBundlesCopydefault = copydefault(withExpiryBundleEntity);
        int i4 = ShareDataUIState + 5;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
        return subBundlesCopydefault;
    }

    private static final WithExpiryBundleEntity ShareDataUIState(SubBundles subBundles, String str, String str2) {
        String str3;
        boolean z;
        boolean zBooleanValue;
        int i = 2 % 2;
        String productName = subBundles.getProductName();
        if (productName == null) {
            int i2 = ShareDataUIState + 19;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            str3 = "";
        } else {
            str3 = productName;
        }
        String productId = subBundles.getProductId();
        Intrinsics.checkNotNull(productId);
        Integer productAmount = subBundles.getProductAmount();
        int iIntValue = productAmount != null ? productAmount.intValue() : 0;
        String productUnits = subBundles.getProductUnits();
        String str4 = productUnits == null ? "" : productUnits;
        Boolean autoRenew = subBundles.getAutoRenew();
        if (autoRenew != null) {
            int i3 = component2 + 61;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                zBooleanValue = autoRenew.booleanValue();
                int i4 = 48 / 0;
            } else {
                zBooleanValue = autoRenew.booleanValue();
            }
            z = zBooleanValue;
        } else {
            z = false;
        }
        return new WithExpiryBundleEntity(str, str2, str3, productId, iIntValue, str4, z, "", subBundles.getLimit());
    }

    private static final SubBundles copydefault(WithExpiryBundleEntity withExpiryBundleEntity) {
        int i = 2 % 2;
        String productName = withExpiryBundleEntity.getProductName();
        String productId = withExpiryBundleEntity.getProductId();
        int productAmount = withExpiryBundleEntity.getProductAmount();
        String productUnits = withExpiryBundleEntity.getProductUnits();
        boolean autoRenew = withExpiryBundleEntity.getAutoRenew();
        SubBundles subBundles = new SubBundles(productName, productId, Integer.valueOf(productAmount), productUnits, Boolean.valueOf(autoRenew), null, null, withExpiryBundleEntity.getLimit());
        int i2 = component2 + 5;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return subBundles;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
