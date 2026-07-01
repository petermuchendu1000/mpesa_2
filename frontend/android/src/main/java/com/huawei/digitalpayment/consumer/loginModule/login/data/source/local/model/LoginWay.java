package com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.model;

import com.blankj.utilcode.util.StringUtils;
import com.huawei.biometric.LocalAuthenticationUtils;
import com.huawei.biometric.util.BiometricHelper2;
import com.huawei.digitalpayment.consumer.loginModule.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
public final class LoginWay {
    private static final LoginWay[] $VALUES;
    public static final LoginWay FACE;
    public static final LoginWay FINGERPRINT;
    public static final String KEY_FACE_ID = "FaceId";
    public static final String KEY_FINGERPRINT = "Fingerprint";
    public static final String KEY_PIN = "PIN";
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;
    private final int icon;
    private final int resId;
    public static final String KEY_OTP = "OTP";
    public static final LoginWay OTP = new LoginWay(KEY_OTP, 0, R.mipmap.login_ic_otp_login, R.string.onboarding_pinlogin_button5);
    public static final LoginWay PIN = new LoginWay("PIN", 1, R.mipmap.login_ic_pin_login, R.string.onboarding_pinlogin_button8);

    private static LoginWay[] $values() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 19;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        LoginWay[] loginWayArr = {OTP, PIN, FINGERPRINT, FACE};
        int i5 = i2 + 57;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return loginWayArr;
        }
        throw null;
    }

    public static LoginWay valueOf(String str) {
        int i = 2 % 2;
        int i2 = component1 + 43;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        LoginWay loginWay = (LoginWay) Enum.valueOf(LoginWay.class, str);
        if (i3 == 0) {
            int i4 = 14 / 0;
        }
        int i5 = component2 + 33;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return loginWay;
    }

    public static LoginWay[] values() {
        int i = 2 % 2;
        int i2 = component1 + 43;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        LoginWay[] loginWayArr = (LoginWay[]) $VALUES.clone();
        int i4 = component2 + 35;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return loginWayArr;
    }

    static {
        int i;
        int i2 = R.mipmap.login_ic_fingerprint_login;
        if (isReplace()) {
            int i3 = component3 + 39;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            i = R.string.onboarding_pinlogin_button17;
            int i5 = copydefault + 93;
            component3 = i5 % 128;
            int i6 = i5 % 2;
        } else {
            i = R.string.onboarding_pinlogin_button7;
        }
        int i7 = 2 % 2;
        FINGERPRINT = new LoginWay("FINGERPRINT", 2, i2, i);
        FACE = new LoginWay("FACE", 3, R.mipmap.login_ic_face_id_login, R.string.onboarding_pinlogin_button6);
        $VALUES = $values();
    }

    private LoginWay(String str, int i, int i2, int i3) {
        this.resId = i3;
        this.icon = i2;
    }

    public String getSelectWayDisplayText() {
        int i = 2 % 2;
        int i2 = component1 + 15;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String string = StringUtils.getString(this.resId);
        int i4 = component1 + 83;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    public int getIcon() {
        int i = 2 % 2;
        int i2 = component1 + 47;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = this.icon;
        int i6 = i3 + 3;
        component1 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 78 / 0;
        }
        return i5;
    }

    private static boolean isReplace() {
        int i = 2 % 2;
        int i2 = component1 + 25;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            if (!LocalAuthenticationUtils.isSupport()) {
                int i3 = component2 + 97;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                if (BiometricHelper2.getInstance().replaceFingerprintText()) {
                    return true;
                }
            }
            return false;
        }
        LocalAuthenticationUtils.isSupport();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
