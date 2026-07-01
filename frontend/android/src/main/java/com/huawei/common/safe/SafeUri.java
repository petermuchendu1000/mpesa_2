package com.huawei.common.safe;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.util.L;
import java.util.Collections;
import java.util.Set;

public class SafeUri {
    public static Uri parse(String str) {
        try {
            return Uri.parse(str);
        } catch (Exception e) {
            L.d("SafeUri", "parse uriString error: " + e.getMessage());
            return null;
        }
    }

    public static Set<String> getQueryParameterNames(Uri uri) {
        if (uri == null) {
            return Collections.emptySet();
        }
        try {
            return uri.getQueryParameterNames();
        } catch (Exception e) {
            L.d("SafeUri", "uri getQueryParameterNames  error: " + e.getMessage());
            return Collections.emptySet();
        }
    }

    public static String getQueryParameter(Uri uri, String str) {
        if (uri == null) {
            return null;
        }
        try {
            return uri.getQueryParameter(str);
        } catch (Exception e) {
            L.d("SafeUri", "uri getQueryParameter  error: " + e.getMessage());
            return null;
        }
    }

    public static String getHost(String str) {
        Uri uri = parse(str != null ? str.replace(AUScreenAdaptTool.PREFIX_ID, "%40") : null);
        if (uri == null || !RouteUtils.SCHEME_MACLE.equals(uri.getScheme())) {
            return null;
        }
        String host = uri.getHost();
        if (TextUtils.isEmpty(host)) {
            return null;
        }
        return host;
    }
}
