package com.huawei.digitalpayment.consumer.ootb;

public final class BuildConfig {
    public static final String APPLICATION_ID = "com.safaricom.mpesa.lifestyle";
    public static final String APP_NAME = "My OneApp";
    public static final String BASE_URL = "https://myoneapp.safaricom.co.ke/appgateway/consumer/appserver/consumer/v1/";
    public static final String BUILD_TYPE = "release";
    public static final boolean DEBUG = false;
    public static final String FLAVOR = "prod";
    public static final String PIN_KEY_VERSION = "00";
    public static final String PIN_TRANSFORMATION = "RSA/ECB/PKCS1Padding";
    public static final String SIGN_KEY_VERSION = "00";
    public static final String SIGN_TRANSFORMATION = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding";
    public static final int VERSION_CODE = 50031;
    public static final String VERSION_NAME = "5.1.9";
    private static int component1 = 0;
    private static int copydefault = 1;
    public static final Boolean LOGS_ENABLED = false;
    public static final Boolean SECURITY_DETECT = true;

    static {
        int i = component1 + 101;
        copydefault = i % 128;
        int i2 = i % 2;
    }
}
