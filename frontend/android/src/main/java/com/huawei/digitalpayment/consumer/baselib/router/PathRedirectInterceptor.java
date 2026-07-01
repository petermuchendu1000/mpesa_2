package com.huawei.digitalpayment.consumer.baselib.router;

import android.net.Uri;
import android.text.TextUtils;
import com.didi.drouter.router.IRouterInterceptor;
import com.didi.drouter.router.Request;
import com.huawei.common.safe.SafeUri;
import com.huawei.common.util.L;

public class PathRedirectInterceptor implements IRouterInterceptor {
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static final String component3 = "PathRedirectInterceptor";

    @Override
    public void handle(Request request) {
        int i = 2 % 2;
        int i2 = component1 + 23;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        request.setRedirect(component1(request.getUri()).toString());
        try {
            request.getInterceptor().onContinue();
        } catch (Exception e) {
            L.d(component3, "handle exception " + e.getMessage());
        }
        int i4 = component1 + 91;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private Uri component1(Uri uri) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String path = uri.getPath();
        String redirectPath = RouterRedirectManager.getRedirectPath(path);
        if (TextUtils.isEmpty(redirectPath)) {
            return uri;
        }
        L.d(component3, path + " mapping to " + redirectPath);
        Uri uri2 = SafeUri.parse(redirectPath);
        int i4 = ShareDataUIState + 49;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return uri2;
    }
}
