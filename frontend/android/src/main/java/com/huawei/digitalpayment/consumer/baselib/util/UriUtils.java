package com.huawei.digitalpayment.consumer.baselib.util;

import android.net.Uri;
import android.text.TextUtils;
import com.dynatrace.android.agent.Global;
import com.huawei.common.safe.SafeUri;
import com.huawei.common.util.L;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UriUtils {
    private static int ShareDataUIState = 1;
    private static int copydefault;

    public static HashMap<String, String> parseQuerys(Uri uri) {
        int i = 2 % 2;
        HashMap<String, String> map = new HashMap<>();
        Iterator<String> it = SafeUri.getQueryParameterNames(uri).iterator();
        int i2 = ShareDataUIState + 115;
        copydefault = i2 % 128;
        while (true) {
            int i3 = i2 % 2;
            if (!it.hasNext()) {
                return map;
            }
            String next = it.next();
            map.put(next, SafeUri.getQueryParameter(uri, next));
            i2 = copydefault + 65;
            ShareDataUIState = i2 % 128;
        }
    }

    public static String getAppendUrl(String str, Map<String, String> map) {
        String str2;
        int i = 2 % 2;
        if (str == null) {
            int i2 = copydefault + 107;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            str = "";
        }
        StringBuilder sb = new StringBuilder(str);
        if (map == null || map.isEmpty()) {
            return sb.toString();
        }
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            int i4 = ShareDataUIState + 99;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                TextUtils.isEmpty(it.next().getValue());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Map.Entry<String, String> next = it.next();
            try {
                if (TextUtils.isEmpty(next.getValue())) {
                    int i5 = copydefault + 125;
                    ShareDataUIState = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    if (sb.toString().contains(Global.QUESTION)) {
                        int i7 = copydefault + 63;
                        ShareDataUIState = i7 % 128;
                        int i8 = i7 % 2;
                        str2 = "&";
                    } else {
                        str2 = Global.QUESTION;
                    }
                    sb.append(str2);
                    sb.append(next.getKey());
                    sb.append("=");
                    sb.append(URLEncoder.encode(next.getValue(), StandardCharsets.UTF_8.name()));
                }
            } catch (UnsupportedEncodingException e) {
                L.d("=====", e.getMessage());
            }
            L.d("=====", e.getMessage());
        }
        return sb.toString();
    }
}
