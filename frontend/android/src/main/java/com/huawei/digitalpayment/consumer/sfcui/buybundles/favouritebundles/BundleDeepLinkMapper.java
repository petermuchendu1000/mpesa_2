package com.huawei.digitalpayment.consumer.sfcui.buybundles.favouritebundles;

import android.os.Bundle;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import com.huawei.digitalpayment.consumer.sfcui.constants.RoutePathConstant;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/favouritebundles/BundleDeepLinkMapper;", "", "<init>", "()V", "deepLinkToRouteMap", "", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/favouritebundles/BundleNavigation;", "getRoute", "deepLink", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BundleDeepLinkMapper {
    public static final int $stable;
    public static final BundleDeepLinkMapper INSTANCE = new BundleDeepLinkMapper();
    private static int ShareDataUIState = 0;
    private static final Map<String, BundleNavigation> component1;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    private BundleDeepLinkMapper() {
    }

    static {
        Object obj = null;
        Bundle bundle = new Bundle();
        bundle.putString(Keys.KEY_BUNDLE_TYPE, Keys.BUNDLE_TYPE_TUNUKIWA);
        Unit unit = Unit.INSTANCE;
        Bundle bundle2 = new Bundle();
        bundle2.putString(Keys.KEY_BUNDLE_TYPE, Keys.BUNDLE_TYPE_TUNUKIWA);
        Unit unit2 = Unit.INSTANCE;
        component1 = MapsKt.mapOf(TuplesKt.to("mysafaricom://no-expiry-bundles", new BundleNavigation(RoutePathConstant.SFC_NO_EXPIRY_BUNDLES, null, 2, null)), TuplesKt.to("mysafaricom://monthly-bundles", new BundleNavigation(RoutePathConstant.SFC_GO_MONTHLY_BUNDLE, null, 2, null)), TuplesKt.to("mysafaricom://tunukiwa-bundle", new BundleNavigation(RoutePathConstant.SFC_TUNUKIWA_BUNDLES, bundle)), TuplesKt.to("mysafaricom://sms-bundles", new BundleNavigation(RoutePathConstant.SFC_SMS_BUNDLES, null, 2, null)), TuplesKt.to("mysafaricom://entertainment-bundles", new BundleNavigation(RoutePathConstant.SFC_ENTERTAINMENT_BUNDLES, null, 2, null)), TuplesKt.to("mysafaricom://all-in-one-bundles", new BundleNavigation(RoutePathConstant.SFC_ALL_IN_ONE_BUNDLE, null, 2, null)), TuplesKt.to("mysafaricom://daily-bundles", new BundleNavigation(RoutePathConstant.SFC_WITH_EXPIRY_ONLY, null, 2, null)), TuplesKt.to("mysafaricom://weekly-bundles", new BundleNavigation(RoutePathConstant.SFC_WITH_EXPIRY_ONLY, null, 2, null)), TuplesKt.to("mysafaricom://data-manager", new BundleNavigation("/sfcModule/manageAndViewData", null, 2, null)), TuplesKt.to("mysafaricom://data-sharing", new BundleNavigation(RoutePathConstant.SFC_SHARE_DATA, null, 2, null)), TuplesKt.to("mysafaricom://unica-products", new BundleNavigation(RoutePathConstant.SFC_TUNUKIWA_BUNDLES, bundle2)));
        $stable = 8;
        int i = component2 + 105;
        component3 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final BundleNavigation getRoute(String deepLink) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 119;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        BundleNavigation bundleNavigation = component1.get(deepLink);
        int i4 = ShareDataUIState + 9;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return bundleNavigation;
        }
        throw null;
    }
}
