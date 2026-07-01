package com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
public final class SmsCodeType {
    private static int ShareDataUIState = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;
    private String smsCode;
    public static final SmsCodeType LOGIN_SMS_CODE = new SmsCodeType("LOGIN_SMS_CODE", 0, "LoginSms");
    public static final SmsCodeType REGISTER_SMS_CODE = new SmsCodeType("REGISTER_SMS_CODE", 1, "RegisterSmsCode");
    public static final SmsCodeType FORGOT_PIN_SMS_CODE = new SmsCodeType("FORGOT_PIN_SMS_CODE", 2, "ForgetPinSms");
    public static final SmsCodeType NEW_DEVICE_SMS_CODE = new SmsCodeType("NEW_DEVICE_SMS_CODE", 3, "NewDeviceSms");
    private static final SmsCodeType[] $VALUES = $values();

    private static SmsCodeType[] $values() {
        int i = 2 % 2;
        int i2 = component3 + 47;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        SmsCodeType[] smsCodeTypeArr = {LOGIN_SMS_CODE, REGISTER_SMS_CODE, FORGOT_PIN_SMS_CODE, NEW_DEVICE_SMS_CODE};
        int i5 = i3 + 35;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return smsCodeTypeArr;
    }

    public static SmsCodeType valueOf(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 33;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        SmsCodeType smsCodeType = (SmsCodeType) Enum.valueOf(SmsCodeType.class, str);
        if (i3 == 0) {
            throw null;
        }
        int i4 = component3 + 125;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return smsCodeType;
        }
        obj.hashCode();
        throw null;
    }

    public static SmsCodeType[] values() {
        int i = 2 % 2;
        int i2 = component3 + 35;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        SmsCodeType[] smsCodeTypeArr = (SmsCodeType[]) $VALUES.clone();
        int i3 = component3 + 73;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 40 / 0;
        }
        return smsCodeTypeArr;
    }

    static {
        int i = copydefault + 45;
        component2 = i % 128;
        int i2 = i % 2;
    }

    private SmsCodeType(String str, int i, String str2) {
        this.smsCode = str2;
    }

    public void setSmsCode(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 69;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.smsCode = str;
        int i5 = i2 + 35;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 19 / 0;
        }
    }

    public String getSmsCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        int i3 = i2 % 128;
        component3 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.smsCode;
        int i4 = i3 + 83;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
