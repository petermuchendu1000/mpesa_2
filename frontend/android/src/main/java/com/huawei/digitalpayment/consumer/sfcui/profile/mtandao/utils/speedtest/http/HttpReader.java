package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.http;

import java.io.IOException;
import java.io.InputStream;
import java.net.SocketException;

public class HttpReader {
    private static int component1 = 1;
    private static int component2;

    public String readLine(InputStream inputStream) throws IOException {
        int i = 2 % 2;
        int i2 = 0;
        String str = "";
        if (inputStream != null) {
            String str2 = "";
            int i3 = 0;
            while (i2 == 0) {
                int i4 = component1 + 39;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    try {
                        int i5 = inputStream.read();
                        if (i5 < 0) {
                            break;
                        }
                        i3++;
                        char c2 = (char) i5;
                        if ('\n' == c2) {
                            int i6 = component1 + 105;
                            component2 = i6 % 128;
                            int i7 = i6 % 2;
                            i2 = 1;
                        } else if ('\r' != c2) {
                            str2 = str2 + c2;
                        }
                    } catch (SocketException unused) {
                        return null;
                    }
                } else {
                    inputStream.read();
                    throw null;
                }
                return null;
            }
            i2 = i3;
            str = str2;
        }
        if (i2 != 0) {
            return str;
        }
        int i8 = component1 + 111;
        component2 = i8 % 128;
        int i9 = i8 % 2;
        return null;
    }
}
