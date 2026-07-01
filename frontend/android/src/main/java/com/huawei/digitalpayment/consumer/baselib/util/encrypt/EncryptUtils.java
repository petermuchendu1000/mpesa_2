package com.huawei.digitalpayment.consumer.baselib.util.encrypt;

import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import java.security.PublicKey;

public class EncryptUtils {
    private static int ShareDataUIState = 0;
    private static final String component1 = "EncryptUtils2";
    private static final int component2 = 32;
    private static IEncrypt component3 = new RSAEncrypt();
    private static int copy = 1;
    private static final String copydefault = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding";
    private static int equals = 1;
    private static int getAsAtTimestamp;

    static {
        int i = ShareDataUIState + 83;
        equals = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private EncryptUtils() {
    }

    public static void init(IEncrypt iEncrypt) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 9;
        copy = i2 % 128;
        int i3 = i2 % 2;
        component3 = iEncrypt;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static String createRandomDynamicIv() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 63;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return com.huawei.common.util.encrypt.EncryptUtils.createRandomDynamicIv();
        }
        com.huawei.common.util.encrypt.EncryptUtils.createRandomDynamicIv();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static String encryptWithSignKey(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 35;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            String strRsaEncrypt = rsaEncrypt(copydefault(AppConfigManager.getAppConfig().getSignKey()), str, AppConfigManager.getAppConfig().getSignTransformation());
            int i3 = copy + 15;
            getAsAtTimestamp = i3 % 128;
            int i4 = i3 % 2;
            return strRsaEncrypt;
        }
        rsaEncrypt(copydefault(AppConfigManager.getAppConfig().getSignKey()), str, AppConfigManager.getAppConfig().getSignTransformation());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static String encryptWithPinKey(String str) {
        int i = 2 % 2;
        int i2 = copy + 13;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        String strEncryptWithPinKey = component3.encryptWithPinKey(str);
        int i4 = copy + 23;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            return strEncryptWithPinKey;
        }
        throw null;
    }

    public static String rsaEncryptPin(String str) {
        int i = 2 % 2;
        int i2 = copy + 45;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        String strRsaEncrypt = rsaEncrypt(copydefault(AppConfigManager.getAppConfig().getPinKey()), str, AppConfigManager.getAppConfig().getPinTransformation());
        int i4 = copy + 105;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return strRsaEncrypt;
    }

    public static String rsaEncrypt(PublicKey publicKey, String str, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = copy + 73;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return com.huawei.common.util.encrypt.EncryptUtils.rsaEncrypt(publicKey, str, str2);
        }
        com.huawei.common.util.encrypt.EncryptUtils.rsaEncrypt(publicKey, str, str2);
        throw null;
    }

    private static PublicKey copydefault(String str) {
        int i = 2 % 2;
        int i2 = copy + 23;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        PublicKey publicKey = com.huawei.common.util.encrypt.EncryptUtils.getPublicKey(str);
        int i4 = copy + 125;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return publicKey;
    }
}
