package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.http;

import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.http.utils.IByteList;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

public class HttpBuilder {
    private static int component1 = 1;
    private static int component2;

    public static String httpRequest(String str, String str2, IByteList iByteList, HashMap<String, String> map) throws UnsupportedEncodingException {
        int i = 2 % 2;
        HttpVersion httpVersion = new HttpVersion(1, 1);
        if (!map.containsKey("Content-Length")) {
            int i2 = component1 + 39;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            if (iByteList.getBytes().length != 0) {
                int i4 = component2 + 61;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                map.put("Content-Length", String.valueOf(iByteList.getBytes().length));
            }
        }
        String string = new HttpFrame(str, httpVersion, map, str2, iByteList).toString();
        int i6 = component1 + 57;
        component2 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 14 / 0;
        }
        return string;
    }
}
