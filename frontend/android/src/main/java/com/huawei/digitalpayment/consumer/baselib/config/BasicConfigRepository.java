package com.huawei.digitalpayment.consumer.baselib.config;

import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import java.util.List;

public class BasicConfigRepository extends PaymentRequest<Object> {
    private static int ShareDataUIState = 1;
    private static int copydefault;

    public BasicConfigRepository(List<String> list) {
        addParams("configTypes", list);
    }

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 117;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 99;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 12 / 0;
        }
        return "basicConfig";
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r5 = r5.get("jsonContent");
        r1 = com.huawei.digitalpayment.consumer.baselib.config.BasicConfigRepository.copydefault + 9;
        com.huawei.digitalpayment.consumer.baselib.config.BasicConfigRepository.ShareDataUIState = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if ((r1 % 2) == 0) goto L11;
     */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object convert(com.google.gson.JsonObject r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.baselib.config.BasicConfigRepository.ShareDataUIState
            int r1 = r1 + 27
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.config.BasicConfigRepository.copydefault = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L16
            r1 = 89
            int r1 = r1 / 0
            if (r5 == 0) goto L2b
            goto L18
        L16:
            if (r5 == 0) goto L2b
        L18:
            java.lang.String r1 = "jsonContent"
            com.google.gson.JsonElement r5 = r5.get(r1)
            int r1 = com.huawei.digitalpayment.consumer.baselib.config.BasicConfigRepository.copydefault
            int r1 = r1 + 9
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.config.BasicConfigRepository.ShareDataUIState = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L2a
            return r5
        L2a:
            throw r2
        L2b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.config.BasicConfigRepository.convert(com.google.gson.JsonObject):java.lang.Object");
    }
}
