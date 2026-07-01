package com.huawei.digitalpayment.consumer.baselib.http;

@Deprecated
public class BaseResp extends com.huawei.http.BaseResp {
    private static int component1 = 0;
    private static int component2 = 1;

    @Deprecated
    public static BaseResp getBaseResp(com.huawei.http.BaseResp baseResp) {
        int i = 2 % 2;
        BaseResp baseResp2 = new BaseResp();
        if (baseResp != null) {
            int i2 = component2 + 39;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                baseResp2.setResponseCode(baseResp.getResponseCode());
                baseResp2.setResponseDesc(baseResp.getResponseDesc());
                baseResp2.setExtension(baseResp.getExtension());
                baseResp2.setServerTimestamp(baseResp.getServerTimestamp());
                int i3 = 45 / 0;
            } else {
                baseResp2.setResponseCode(baseResp.getResponseCode());
                baseResp2.setResponseDesc(baseResp.getResponseDesc());
                baseResp2.setExtension(baseResp.getExtension());
                baseResp2.setServerTimestamp(baseResp.getServerTimestamp());
            }
            int i4 = component2 + 107;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        }
        return baseResp2;
    }
}
