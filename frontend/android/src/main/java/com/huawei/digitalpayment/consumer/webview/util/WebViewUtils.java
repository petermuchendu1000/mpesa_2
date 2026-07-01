package com.huawei.digitalpayment.consumer.webview.util;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.webkit.internal.AssetHelper;
import com.dynatrace.android.agent.Global;
import com.huawei.common.safe.SafeUri;
import com.huawei.common.util.L;
import com.huawei.digitalpayment.consumer.baselib.util.UriUtils;
import com.huawei.digitalpayment.consumer.scan.viewmodel.BaseScanViewModel;
import com.huawei.digitalpayment.consumer.webview.R;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang3.BooleanUtils;

public class WebViewUtils {
    private static int component1 = 1;
    private static int copydefault;

    public static String getAppendUrl(String str, Map<String, String> map) {
        int i = 2 % 2;
        int i2 = component1 + 59;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 5 / 0;
            if (!(!TextUtils.isEmpty(str))) {
                return null;
            }
        } else if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.contains(Global.QUESTION)) {
            int i4 = component1 + 61;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            String str2 = str.split("\\?")[0];
            component1(str, map);
            str = str2;
        }
        return UriUtils.getAppendUrl(str, map);
    }

    private static void component1(String str, Map<String, String> map) {
        String next;
        int i = 2 % 2;
        int i2 = component1 + 87;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        if (map == null || map.isEmpty()) {
            return;
        }
        Uri uri = SafeUri.parse(str.replace(BaseScanViewModel.QR_FLAG, ""));
        Set<String> queryParameterNames = SafeUri.getQueryParameterNames(uri);
        if (queryParameterNames.size() == 0) {
            int i4 = copydefault + 19;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        Iterator<String> it = queryParameterNames.iterator();
        int i6 = component1 + 15;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        while (it.hasNext()) {
            int i8 = copydefault + 99;
            component1 = i8 % 128;
            if (i8 % 2 == 0) {
                next = it.next();
                int i9 = 41 / 0;
                if (!map.containsKey(next)) {
                    map.put(next, SafeUri.getQueryParameter(uri, next));
                }
            } else {
                next = it.next();
                if (!map.containsKey(next)) {
                    map.put(next, SafeUri.getQueryParameter(uri, next));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (r6 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        r1 = com.huawei.digitalpayment.consumer.webview.util.WebViewUtils.copydefault + 95;
        com.huawei.digitalpayment.consumer.webview.util.WebViewUtils.component1 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if ((r1 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (org.apache.commons.lang3.BooleanUtils.TRUE.equalsIgnoreCase(r6.getQueryParameter("notoolbar")) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.webview.util.WebViewUtils.copydefault + 49;
        com.huawei.digitalpayment.consumer.webview.util.WebViewUtils.component1 = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        if ((r6 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        org.apache.commons.lang3.BooleanUtils.TRUE.equalsIgnoreCase(r6.getQueryParameter("notoolbar"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r6 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r6 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        r6 = android.net.Uri.parse(filterUrl(r6));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean showToolbar(java.lang.String r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.webview.util.WebViewUtils.component1
            int r1 = r1 + 125
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.webview.util.WebViewUtils.copydefault = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L16
            r1 = 51
            int r1 = r1 / r2
            if (r6 != 0) goto L19
            goto L18
        L16:
            if (r6 != 0) goto L19
        L18:
            return r3
        L19:
            java.lang.String r6 = filterUrl(r6)
            android.net.Uri r6 = android.net.Uri.parse(r6)
            if (r6 == 0) goto L52
            int r1 = com.huawei.digitalpayment.consumer.webview.util.WebViewUtils.copydefault
            int r1 = r1 + 95
            int r4 = r1 % 128
            com.huawei.digitalpayment.consumer.webview.util.WebViewUtils.component1 = r4
            int r1 = r1 % r0
            java.lang.String r4 = "true"
            java.lang.String r5 = "notoolbar"
            if (r1 == 0) goto L49
            java.lang.String r6 = r6.getQueryParameter(r5)
            boolean r6 = r4.equalsIgnoreCase(r6)
            if (r6 == 0) goto L52
            int r6 = com.huawei.digitalpayment.consumer.webview.util.WebViewUtils.copydefault
            int r6 = r6 + 49
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.webview.util.WebViewUtils.component1 = r1
            int r6 = r6 % r0
            if (r6 != 0) goto L48
            return r3
        L48:
            return r2
        L49:
            java.lang.String r6 = r6.getQueryParameter(r5)
            r4.equalsIgnoreCase(r6)
            r6 = 0
            throw r6
        L52:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.webview.util.WebViewUtils.showToolbar(java.lang.String):boolean");
    }

    public static boolean fullscreen(String str) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 39;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (str == null) {
            int i4 = i2 + 119;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 11 / 0;
            }
            return false;
        }
        Uri uri = Uri.parse(filterUrl(str));
        if (uri == null) {
            return false;
        }
        int i6 = copydefault + 19;
        component1 = i6 % 128;
        if (i6 % 2 != 0) {
            return BooleanUtils.TRUE.equalsIgnoreCase(uri.getQueryParameter("fullscreen"));
        }
        int i7 = 29 / 0;
        return BooleanUtils.TRUE.equalsIgnoreCase(uri.getQueryParameter("fullscreen"));
    }

    public static String filterUrl(String str) {
        int iIndexOf;
        int iIndexOf2;
        int i = 2 % 2;
        int i2 = copydefault + 11;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            iIndexOf = str.indexOf(Global.QUESTION);
            iIndexOf2 = str.indexOf(BaseScanViewModel.QR_FLAG);
            int i3 = 56 / 0;
            if (iIndexOf == -1) {
                return str;
            }
        } else {
            iIndexOf = str.indexOf(Global.QUESTION);
            iIndexOf2 = str.indexOf(BaseScanViewModel.QR_FLAG);
            if (iIndexOf == -1) {
                return str;
            }
        }
        int i4 = component1;
        int i5 = i4 + 35;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        if (iIndexOf2 == -1 || iIndexOf <= iIndexOf2) {
            return str;
        }
        int i6 = i4 + 35;
        copydefault = i6 % 128;
        if (i6 % 2 == 0) {
            return str.replaceFirst(BaseScanViewModel.QR_FLAG, "");
        }
        str.replaceFirst(BaseScanViewModel.QR_FLAG, "");
        throw null;
    }

    public static void shareToSelectPage(Activity activity, String str) {
        int i = 2 % 2;
        int i2 = copydefault + 105;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        if (!TextUtils.isEmpty(str)) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
            intent.putExtra("android.intent.extra.TEXT", str);
            activity.startActivity(Intent.createChooser(intent, activity.getResources().getString(R.string.webview_share)));
            return;
        }
        int i4 = copydefault + 11;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        L.e("WebViewUtils", "shareToSelectPage: content is null");
    }
}
