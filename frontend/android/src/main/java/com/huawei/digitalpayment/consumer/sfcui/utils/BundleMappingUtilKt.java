package com.huawei.digitalpayment.consumer.sfcui.utils;

import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.DataPackResp;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.SHookBundle;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.TunukiwaBundleResp;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.WithExpiryResp;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0007¨\u0006\b"}, d2 = {"toExpiryList", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/WithExpiryResp;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DataPackResp;", "operatorShortCode", "", "toWithExpiryResp", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/TunukiwaBundleResp;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/SHookBundle;", "ConsumerSfcUI_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BundleMappingUtilKt {
    private static int component1 = 0;
    private static int copydefault = 1;

    public static final WithExpiryResp access$toExpiryList(DataPackResp dataPackResp, String str) {
        int i = 2 % 2;
        int i2 = copydefault + 1;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        WithExpiryResp withExpiryRespComponent1 = component1(dataPackResp, str);
        int i4 = copydefault + 55;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return withExpiryRespComponent1;
        }
        throw null;
    }

    private static final WithExpiryResp component1(DataPackResp dataPackResp, String str) {
        int i = 2 % 2;
        WithExpiryResp withExpiryResp = new WithExpiryResp(dataPackResp.getItemDesc(), dataPackResp.getFinalPrice(), null, false, false, dataPackResp.getItemId(), dataPackResp.getExtPropertiesLang().getValidity(), str, null, null, null, null, null, null, 0, null, 65308, null);
        int i2 = component1 + 53;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return withExpiryResp;
        }
        throw null;
    }

    public static final WithExpiryResp toWithExpiryResp(TunukiwaBundleResp tunukiwaBundleResp) {
        String str;
        String str2;
        int i = 2 % 2;
        int i2 = component1 + 7;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tunukiwaBundleResp, "");
        String strExtractValidity = TunukiwaValidityExtractor.INSTANCE.extractValidity(tunukiwaBundleResp.getAppText());
        String appText = tunukiwaBundleResp.getAppText();
        if (appText == null) {
            int i4 = component1 + 33;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            str = "";
        } else {
            str = appText;
        }
        String offerPrice = tunukiwaBundleResp.getOfferPrice();
        if (offerPrice == null) {
            int i6 = copydefault + 9;
            component1 = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            str2 = "";
        } else {
            str2 = offerPrice;
        }
        String offerID = tunukiwaBundleResp.getOfferID();
        String str3 = offerID == null ? "" : offerID;
        String offerType = tunukiwaBundleResp.getOfferType();
        return new WithExpiryResp(str, str2, null, false, false, str3, strExtractValidity, null, offerType == null ? "" : offerType, Keys.BUNDLE_TYPE_TUNUKIWA, null, null, null, null, 0, null, 64668, null);
    }

    public static final WithExpiryResp toWithExpiryResp(SHookBundle sHookBundle) {
        String str;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sHookBundle, "");
        String productName = sHookBundle.getProductName();
        int productAmount = sHookBundle.getProductAmount();
        String productId = sHookBundle.getProductId();
        if (Intrinsics.areEqual(sHookBundle.getType(), "daily")) {
            int i2 = copydefault + 61;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 61 / 0;
            }
            str = "24hrs";
        } else if (Intrinsics.areEqual(sHookBundle.getType(), "monthly")) {
            str = "30 days";
        } else {
            int i4 = component1 + 123;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            str = "7 days";
        }
        return new WithExpiryResp(productName, String.valueOf(productAmount), null, false, false, productId, str, null, sHookBundle.getType(), Keys.BUNDLE_TYPE_SHOOK, null, null, null, null, 0, null, 64668, null);
    }
}
