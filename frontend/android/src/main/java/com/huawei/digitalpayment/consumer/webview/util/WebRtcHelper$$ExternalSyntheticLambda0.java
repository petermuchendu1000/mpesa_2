package com.huawei.digitalpayment.consumer.webview.util;

import android.webkit.PermissionRequest;
import kotlin.BackHandlerKtBackHandler21invokeinlinedonDispose1;

public final class WebRtcHelper$$ExternalSyntheticLambda0 implements Runnable {
    private static int component2 = 0;
    private static int copydefault = 1;
    public final WebRtcHelper f$0;
    public final PermissionRequest f$1;

    public WebRtcHelper$$ExternalSyntheticLambda0(WebRtcHelper webRtcHelper, PermissionRequest permissionRequest) {
        this.f$0 = webRtcHelper;
        this.f$1 = permissionRequest;
    }

    public static void component2() {
        BackHandlerKtBackHandler21invokeinlinedonDispose1.component1[0] = Class.forName("io.reactivex.rxjava3.internal.observers.InnerQueuedObserver").getDeclaredField("ShareDataUIState");
    }

    @Override
    public final void run() {
        int i = 2 % 2;
        int i2 = copydefault + 83;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            WebRtcHelper.m12138$r8$lambda$H1n9uLErnKiqLRslS6xwTJxF7w(this.f$0, this.f$1);
            int i3 = 22 / 0;
        } else {
            WebRtcHelper.m12138$r8$lambda$H1n9uLErnKiqLRslS6xwTJxF7w(this.f$0, this.f$1);
        }
        int i4 = component2 + 1;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }
}
