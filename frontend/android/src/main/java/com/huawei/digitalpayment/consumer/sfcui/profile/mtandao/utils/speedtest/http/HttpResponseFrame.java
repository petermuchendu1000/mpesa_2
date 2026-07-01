package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.http;

import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.http.inter.IHttpResponseFrame;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

public class HttpResponseFrame implements IHttpResponseFrame {
    private static int ShareDataUIState = 0;
    private static int copy = 1;
    private byte[] component1;
    private StatusCodeObject component2;
    private HttpVersion component3;
    private HashMap<String, String> copydefault;

    public HttpResponseFrame(StatusCodeObject statusCodeObject, HttpVersion httpVersion, HashMap<String, String> map, byte[] bArr) {
        new HashMap();
        this.component2 = statusCodeObject;
        this.component3 = httpVersion;
        this.copydefault = map;
        this.component1 = bArr;
    }

    public String toString() {
        int i = 2 % 2;
        String str = this.component3.toString() + " " + this.component2.toString() + "\r\n";
        if (!this.copydefault.containsKey("Content-Length")) {
            int i2 = ShareDataUIState + 63;
            int i3 = i2 % 128;
            copy = i3;
            int i4 = i2 % 2;
            byte[] bArr = this.component1;
            if (bArr.length > 0) {
                int i5 = i3 + 125;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 != 0) {
                    this.copydefault.put("Content-Length", String.valueOf(bArr.length));
                    int i6 = 0 / 0;
                } else {
                    this.copydefault.put("Content-Length", String.valueOf(bArr.length));
                }
            }
        }
        for (String str2 : this.copydefault.keySet()) {
            str = str + str2.toString() + ":  " + this.copydefault.get(str2).toString() + "\r\n";
        }
        if (this.component1.length <= 0) {
            return str + "\r\n";
        }
        String str3 = str + "\r\n";
        try {
            str3 = str3 + new String(this.component1, "UTF-8");
            int i7 = ShareDataUIState + 49;
            copy = i7 % 128;
            int i8 = i7 % 2;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return str3 + "\r\n";
    }

    @Override
    public StatusCodeObject getReturnCode() {
        int i = 2 % 2;
        int i2 = copy + 85;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        StatusCodeObject statusCodeObject = this.component2;
        int i5 = i3 + 47;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            return statusCodeObject;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public HttpVersion getHttpVersion() {
        int i = 2 % 2;
        int i2 = copy + 21;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        HttpVersion httpVersion = this.component3;
        if (i3 != 0) {
            int i4 = 54 / 0;
        }
        return httpVersion;
    }

    @Override
    public HashMap<String, String> getHeaders() {
        int i = 2 % 2;
        int i2 = copy + 7;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        HashMap<String, String> map = this.copydefault;
        if (i3 != 0) {
            int i4 = 41 / 0;
        }
        return map;
    }

    public byte[] getBody() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 97;
        copy = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArr = this.component1;
        int i5 = i2 + 67;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 60 / 0;
        }
        return bArr;
    }
}
