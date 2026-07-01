package com.huawei.digitalpayment.consumer.sfcui.buybundles;

import com.huawei.digitalpayment.consumer.base.reporting.BuyBundlesEvent;
import com.huawei.digitalpayment.consumer.fixeddata.presentation.FixedDataNavKeys;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.WithExpiryResp;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u001a\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002¨\u0006\n"}, d2 = {"toBuyBundlesEvent", "Lcom/huawei/digitalpayment/consumer/base/reporting/BuyBundlesEvent;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/WithExpiryResp;", "paymentType", "", "msisdn", "successful", "", "bundleTypeDisplayName", "bundleType", "ConsumerSfcUI_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BuyBundlesEventExtKt {
    private static int ShareDataUIState = 1;
    private static int component1;

    public static BuyBundlesEvent toBuyBundlesEvent$default(WithExpiryResp withExpiryResp, String str, String str2, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1;
        int i4 = i3 + 83;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 4) != 0) {
            int i6 = i3 + 125;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        }
        return toBuyBundlesEvent(withExpiryResp, str, str2, z);
    }

    public static final BuyBundlesEvent toBuyBundlesEvent(WithExpiryResp withExpiryResp, String str, String str2, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(withExpiryResp, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        BuyBundlesEvent buyBundlesEventCreate = BuyBundlesEvent.INSTANCE.create("data", withExpiryResp.getTitle(), withExpiryResp.getAmount(), ShareDataUIState(withExpiryResp.getBundleType()) + " | " + withExpiryResp.getValidity(), str, str2, z);
        int i2 = ShareDataUIState + 43;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return buyBundlesEventCreate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final String ShareDataUIState(String str) {
        int i;
        int i2;
        int i3 = 2 % 2;
        switch (str.hashCode()) {
            case -1554147289:
                return !str.equals(Keys.BUNDLE_TYPE_OFA_MOTO) ? str : "Ofa Moto";
            case -1303452463:
                if (str.equals(Keys.BUNDLE_TYPE_FRESH_FRIDAY)) {
                    return Keys.BUNDLE_TYPE_FRESH_FRIDAY;
                }
                i = component1 + 45;
                i2 = i % 128;
                break;
            case -957848003:
                return !str.equals(Keys.BUNDLE_TYPE_SHOOK) ? str : "S-Hook";
            case 99476:
                return !str.equals(Keys.BUNDLE_TYPE_DIY) ? str : "Easy Talk Bundles";
            case 114009:
                return !str.equals(Keys.BUNDLE_TYPE_SMS) ? str : "SMS Bundles";
            case 3176890:
                if (str.equals(Keys.BUNDLE_TYPE_GO_5G)) {
                    return "Go 5G";
                }
                i = component1 + 73;
                i2 = i % 128;
                break;
            case 26835120:
                return !str.equals(Keys.BUNDLE_TYPE_TUNUKIWA) ? str : "Tunukiwa";
            case 253944404:
                return !str.equals(Keys.BUNDLE_TYPE_NO_EXPIRY) ? str : "No Expiry Bundle";
            case 500006792:
                return !str.equals("entertainment") ? str : "Entertainment Bundles";
            case 1366973465:
                return !str.equals(Keys.BUNDLE_TYPE_ROAMING) ? str : "Roaming Bundles";
            case 1777749472:
                if (str.equals(Keys.BUNDLE_TYPE_ALL_IN_ONE)) {
                    return "All in One Monthly Bundle";
                }
                int i4 = ShareDataUIState + 9;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    return str;
                }
                int i5 = 5 / 2;
                return str;
            case 1783852441:
                return !str.equals(Keys.BUNDLE_TYPE_WITH_EXPIRY) ? str : "With Expiry Bundle";
            case 1788911222:
                return !str.equals(Keys.BUNDLE_TYPE_DATA_ONLY) ? str : FixedDataNavKeys.UNLIMITED_DATA_ONLY;
            case 2064805518:
                return !str.equals(Keys.BUNDLE_TYPE_INTERNATIONAL) ? str : "International Bundles";
            default:
                return str;
        }
        ShareDataUIState = i2;
        int i6 = i % 2;
        return str;
    }
}
