package com.huawei.digitalpayment.consumer.miniapps.extension;

import com.alibaba.griver.api.ui.splash.GriverSplashFragmentExtension;
import com.huawei.digitalpayment.consumer.miniapps.ui.SfcMiniAppSplashFragment;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/miniapps/extension/SfcSplashFragmentExtension;", "Lcom/alibaba/griver/api/ui/splash/GriverSplashFragmentExtension;", "<init>", "()V", "createSplashFragment", "Lcom/alibaba/griver/api/ui/splash/GriverSplashFragmentExtension$AbstractSplashFragment;", "ConsumerSfcAliPayMiniApps_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SfcSplashFragmentExtension implements GriverSplashFragmentExtension {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 1;

    @Override
    public GriverSplashFragmentExtension.AbstractSplashFragment createSplashFragment() {
        int i = 2 % 2;
        SfcMiniAppSplashFragment sfcMiniAppSplashFragment = new SfcMiniAppSplashFragment();
        int i2 = component3 + 33;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return sfcMiniAppSplashFragment;
    }

    static {
        int i = 1 + 27;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }
}
