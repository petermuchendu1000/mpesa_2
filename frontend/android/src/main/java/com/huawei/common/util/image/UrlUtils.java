package com.huawei.common.util.image;

import android.text.TextUtils;
import com.huawei.secure.android.common.webview.UriUtil;

public class UrlUtils {
    public static String getURL(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (str2.startsWith("/")) {
                return str + str2;
            }
            if (str2.startsWith("h5://")) {
                return str + str2.replace("h5:/", "");
            }
        }
        return str2;
    }

    public static String getFullUrl(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return str2;
        }
        if (str2.startsWith("/")) {
            str2 = str + str2;
        } else if (str2.startsWith("h5://")) {
            str2 = str + str2.replace("h5:/", "");
        } else if (!str2.startsWith("http")) {
            str2 = str + "/" + str2;
        }
        return fixUrl(str2);
    }

    public static String fixUrl(String str) {
        try {
            String hostByURI = UriUtil.getHostByURI(str);
            if (TextUtils.isEmpty(hostByURI)) {
                return str;
            }
            String strSubstring = str.substring(0, str.indexOf(hostByURI) + hostByURI.length());
            return strSubstring + str.replace(strSubstring, "").replaceAll("/+", "/");
        } catch (Exception unused) {
            return str;
        }
    }
}
