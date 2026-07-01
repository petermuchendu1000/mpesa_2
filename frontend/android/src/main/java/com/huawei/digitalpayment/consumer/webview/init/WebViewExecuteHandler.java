package com.huawei.digitalpayment.consumer.webview.init;

import com.didi.drouter.api.DRouter;
import com.didi.drouter.router.Request;
import com.huawei.arouter.Router;
import com.huawei.arouter.executehandler.ExecuteHandler;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;

public class WebViewExecuteHandler extends ExecuteHandler {
    public static final String SCHEME_TERMS = "terms";
    private static int ShareDataUIState = 1;
    public static final String TERMS_PRE = "terms://";
    private static int component3;

    @Override
    public void handleRequest(Router router) {
        String str;
        int i = 2 % 2;
        if (router.getUri().getScheme() == null) {
            int i2 = ShareDataUIState + 125;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                getNext();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (getNext() != null) {
                getNext().handleRequest(router);
            }
            int i3 = component3 + 17;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 86 / 0;
                return;
            }
            return;
        }
        if (SCHEME_TERMS.equals(router.getUri().getScheme())) {
            int i5 = component3 + 5;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            str = RoutePathConstants.WEBVIEW_TERMS;
        } else {
            int i7 = ShareDataUIState + 121;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            str = RoutePathConstants.WEBVIEW;
        }
        copydefault(router, str);
        int i9 = component3 + 47;
        ShareDataUIState = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 9 / 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void copydefault(com.huawei.arouter.Router r8, java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.webview.init.WebViewExecuteHandler.copydefault(com.huawei.arouter.Router, java.lang.String):void");
    }

    private void component1(String str, Router router) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 71;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Request requestBuild = DRouter.build(str);
        fillRequest(router, requestBuild);
        process(router, requestBuild);
        requestBuild.start(router.getActivity(), router.getRouterCallback());
        int i4 = ShareDataUIState + 3;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
