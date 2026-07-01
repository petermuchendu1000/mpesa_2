package com.huawei.biometric;

import android.content.Context;
import android.content.Intent;
import androidx.core.hardware.fingerprint.FingerprintManagerCompat;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.RomUtils;
import com.blankj.utilcode.util.Utils;

public class BiometricUtil {
    public static boolean isSupportBiometric(Context context) {
        return FingerprintManagerCompat.from(context).isHardwareDetected();
    }

    public static boolean isNoneEnrolledBiometric(Context context) {
        return !FingerprintManagerCompat.from(context).hasEnrolledFingerprints();
    }

    public static boolean isSupportBiometric() {
        return FingerprintManagerCompat.from(Utils.getApp()).isHardwareDetected();
    }

    public static boolean isEnrolledBiometric() {
        return FingerprintManagerCompat.from(Utils.getApp()).hasEnrolledFingerprints();
    }

    public static void jumpSystemBiometricSetting(boolean z) {
        String str;
        if (!z) {
            str = "android.settings.SETTINGS";
        } else if (!RomUtils.isSamsung()) {
            str = "android.settings.BIOMETRIC_ENROLL";
        } else {
            str = "android.settings.FINGERPRINT_ENROLL";
        }
        try {
            Intent intent = new Intent(str);
            intent.addFlags(268435456);
            Utils.getApp().startActivity(intent);
        } catch (Exception unused) {
            AppUtils.launchAppDetailsSettings();
        }
    }
}
