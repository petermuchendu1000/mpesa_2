package com.huawei.digitalpayment.common.theme.init;

import com.alipay.iap.android.wallet.foundation.deeplink.DeeplinkService;
import com.huawei.customer.digitalpayment.scan.handler.CodeScanProcessHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/init/ThemeScanProcessHandler;", "Lcom/huawei/customer/digitalpayment/scan/handler/CodeScanProcessHandler;", "<init>", "()V", "processResultFromLocal", "", "scanActivity", "Landroidx/fragment/app/FragmentActivity;", "result", "", "Companion", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ThemeScanProcessHandler extends CodeScanProcessHandler {

    public static final Companion INSTANCE = new Companion(null);
    public static final String QRCODE = "qrCode";
    private static final String ShareDataUIState = "themePreview://";
    private static int component1 = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean processResultFromLocal(androidx.fragment.app.FragmentActivity r5, java.lang.String r6) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.common.theme.init.ThemeScanProcessHandler.component2
            int r1 = r1 + 93
            int r2 = r1 % 128
            com.huawei.digitalpayment.common.theme.init.ThemeScanProcessHandler.copydefault = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L15
            r1 = 74
            int r1 = r1 / r2
            if (r6 == 0) goto L3c
            goto L17
        L15:
            if (r6 == 0) goto L3c
        L17:
            java.lang.String r1 = "themePreview://"
            r3 = 0
            boolean r1 = kotlin.text.StringsKt.startsWith$default(r6, r1, r2, r0, r3)
            if (r1 == 0) goto L3c
            android.os.Bundle r1 = new android.os.Bundle
            r2 = 1
            r1.<init>(r2)
            java.lang.String r3 = "qrCode"
            r1.putString(r3, r6)
            android.app.Activity r5 = (android.app.Activity) r5
            java.lang.String r6 = "/mainModule/previewTheme"
            com.huawei.arouter.RouteUtils.routeWithExecute(r5, r6, r1)
            int r5 = com.huawei.digitalpayment.common.theme.init.ThemeScanProcessHandler.component2
            int r5 = r5 + 31
            int r6 = r5 % 128
            com.huawei.digitalpayment.common.theme.init.ThemeScanProcessHandler.copydefault = r6
            int r5 = r5 % r0
            return r2
        L3c:
            boolean r5 = super.processResultFromLocal(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.common.theme.init.ThemeScanProcessHandler.processResultFromLocal(androidx.fragment.app.FragmentActivity, java.lang.String):boolean");
    }

    static {
        int i = component1 + 67;
        component3 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/init/ThemeScanProcessHandler$Companion;", "", "<init>", "()V", DeeplinkService.Scene.SCHEME, "", "QRCODE", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
