package com.huawei.digitalpayment.consumer.baselib.util.encrypt;

public class RSAEncrypt implements IEncrypt {
    private static int component1 = 1;
    private static int copydefault;

    @Override
    public String encryptWithPinKey(String str) {
        int i = 2 % 2;
        int i2 = component1 + 101;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String strRsaEncryptPin = EncryptUtils.rsaEncryptPin(str);
        int i4 = copydefault + 71;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return strRsaEncryptPin;
    }
}
