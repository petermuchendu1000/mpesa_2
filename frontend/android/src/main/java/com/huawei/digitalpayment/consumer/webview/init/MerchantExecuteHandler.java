package com.huawei.digitalpayment.consumer.webview.init;

import android.net.Uri;
import android.os.Bundle;
import com.didi.drouter.api.DRouter;
import com.didi.drouter.router.Request;
import com.huawei.arouter.Router;
import com.huawei.arouter.executehandler.ExecuteHandler;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import java.util.Map;

public class MerchantExecuteHandler extends ExecuteHandler {
    private static int component1 = 1;
    private static int component3;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handleRequest(com.huawei.arouter.Router r8) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.webview.init.MerchantExecuteHandler.handleRequest(com.huawei.arouter.Router):void");
    }

    private void component2(Uri uri, Router router) {
        int i = 2 % 2;
        Request requestBuild = DRouter.build(RoutePathConstants.WEB_VIEW_DISPATCHER);
        fillRequest(router, requestBuild);
        Bundle bundle = requestBuild.extra;
        if (bundle == null) {
            bundle = new Bundle();
            int i2 = component1 + 95;
            component3 = i2 % 128;
            int i3 = i2 % 2;
        }
        Map<String, String> params = router.getParams();
        if (params != null && !params.isEmpty()) {
            int i4 = component1 + 37;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                params.entrySet().iterator();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            for (Map.Entry<String, String> entry : params.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
        }
        requestBuild.putExtra("queryParams", addWebViewUrlQuery(bundle, uri));
        requestBuild.start(router.getActivity());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String addWebViewUrlQuery(android.os.Bundle r7, android.net.Uri r8) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.webview.init.MerchantExecuteHandler.addWebViewUrlQuery(android.os.Bundle, android.net.Uri):java.lang.String");
    }
}
