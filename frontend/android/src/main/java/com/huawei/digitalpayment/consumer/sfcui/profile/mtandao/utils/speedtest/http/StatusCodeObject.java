package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.http;

public class StatusCodeObject {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    public int code;
    public String reasonPhrase;

    public StatusCodeObject(int i, String str) {
        this.code = i;
        this.reasonPhrase = str;
    }

    public String toString() {
        int i = 2 % 2;
        String str = this.code + " " + this.reasonPhrase;
        int i2 = copydefault + 49;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
