package com.huawei.digitalpayment.home.init;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.alipay.iap.android.wallet.foundation.deeplink.DeeplinkService;
import com.huawei.arouter.RouteUtils;
import com.huawei.customer.digitalpayment.scan.handler.CodeScanProcessHandler;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/home/init/HomeScanProcessHandler;", "Lcom/huawei/customer/digitalpayment/scan/handler/CodeScanProcessHandler;", "<init>", "()V", "processResultFromLocal", "", "scanActivity", "Landroidx/fragment/app/FragmentActivity;", "result", "", "Companion", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HomeScanProcessHandler extends CodeScanProcessHandler {

    public static final Companion INSTANCE;
    public static final String QRCODE = "qrCode";
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static final String component2 = "themePreview://";
    private static int component3 = 0;
    private static int copydefault = 1;

    @Override
    public boolean processResultFromLocal(FragmentActivity scanActivity, String result) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        if (result != null && StringsKt.startsWith$default(result, component2, false, 2, (Object) null)) {
            Bundle bundle = new Bundle(1);
            bundle.putString("qrCode", result);
            RouteUtils.routeWithExecute(scanActivity, RoutePathConstants.THEME_PREVIEW, bundle);
            return true;
        }
        boolean zProcessResultFromLocal = super.processResultFromLocal(scanActivity, result);
        int i4 = component3 + 69;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return zProcessResultFromLocal;
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        int i = component1 + 71;
        copydefault = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/home/init/HomeScanProcessHandler$Companion;", "", "<init>", "()V", DeeplinkService.Scene.SCHEME, "", "QRCODE", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
