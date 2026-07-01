package com.huawei.digitalpayment.consumer.baselib.http;

import com.huawei.common.util.encrypt.EncryptUtils;

public class DefaultIvInterfaceImpl implements IvInterface {
    private static int component1 = 0;
    private static int component3 = 1;
    private static final int copydefault = 6;

    @Override
    public String getIv() {
        int i = 2 % 2;
        int i2 = component3 + 79;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String strCreateRandomDynamicIv = EncryptUtils.createRandomDynamicIv(6);
        int i4 = component3 + 77;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return strCreateRandomDynamicIv;
    }
}
