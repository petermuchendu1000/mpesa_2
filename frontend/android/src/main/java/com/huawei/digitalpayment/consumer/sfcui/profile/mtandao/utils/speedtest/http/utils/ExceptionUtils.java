package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.http.utils;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class ExceptionUtils {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;

    public static String getExceptionMessage(Exception exc) {
        int i = 2 % 2;
        final StringBuilder sb = new StringBuilder();
        exc.printStackTrace(new PrintStream(new OutputStream() {
            private static int ShareDataUIState = 1;
            private static int component2;

            @Override
            public void write(int i2) throws IOException {
                int i3 = 2 % 2;
                int i4 = component2 + 37;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                sb.append((char) i2);
                int i6 = ShareDataUIState + 87;
                component2 = i6 % 128;
                int i7 = i6 % 2;
            }
        }));
        String string = sb.toString();
        int i2 = component1 + 49;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }
}
