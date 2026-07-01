package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.http;

public class HttpVersion {
    private static int ShareDataUIState = 1;
    private static int component1;
    public int versionDigit1;
    public int versionDigit2;

    public HttpVersion(int i, int i2) {
        this.versionDigit1 = i;
        this.versionDigit2 = i2;
    }

    public HttpVersion(String str) {
        if (str.startsWith("HTTP/") && str.length() > 7) {
            int i = Integer.parseInt(str.substring(str.indexOf(47) + 1, str.indexOf(47) + 2));
            int i2 = Integer.parseInt(str.substring(str.indexOf(47) + 3, str.indexOf(47) + 4));
            this.versionDigit1 = i;
            this.versionDigit2 = i2;
            int i3 = component1 + 51;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        }
        int i6 = component1 + 51;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "HTTP/" + this.versionDigit1 + "." + this.versionDigit2;
        int i2 = component1 + 1;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
