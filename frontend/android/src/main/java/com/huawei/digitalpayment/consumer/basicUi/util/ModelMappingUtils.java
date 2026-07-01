package com.huawei.digitalpayment.consumer.basicUi.util;

import android.text.TextUtils;
import com.huawei.digitalpayment.consumer.basicUi.response.ExtResponse;
import com.huawei.digitalpayment.consumer.basicUi.response.LocalQueryLoginType;
import com.huawei.digitalpayment.consumer.basicUi.response.NetworkQueryLoginType;

public class ModelMappingUtils {
    private static int ShareDataUIState = 1;
    private static int copydefault;

    public static LocalQueryLoginType toLocalQueryLoginType(NetworkQueryLoginType networkQueryLoginType) {
        boolean z;
        int i = 2 % 2;
        if (networkQueryLoginType == null) {
            return new LocalQueryLoginType();
        }
        boolean z2 = false;
        try {
            z = Boolean.parseBoolean(networkQueryLoginType.getSupportPinLogin());
        } catch (Exception unused) {
            z = false;
        }
        LocalQueryLoginType localQueryLoginType = new LocalQueryLoginType();
        localQueryLoginType.setExecute(networkQueryLoginType.getForward());
        localQueryLoginType.setActive(networkQueryLoginType.isActive());
        localQueryLoginType.setAsyncRegisterDesc(networkQueryLoginType.getAsyncRegisterDesc());
        localQueryLoginType.setOneStepRegisterTag(networkQueryLoginType.getOneStepRegisterTag());
        localQueryLoginType.setLoginType(networkQueryLoginType.getLoginType());
        if (!TextUtils.isEmpty(networkQueryLoginType.getForward())) {
            int i2 = ShareDataUIState + 99;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            if (networkQueryLoginType.getForward().contains("/new/")) {
                int i4 = ShareDataUIState + 33;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                z2 = true;
            }
        }
        localQueryLoginType.setNewProcess(Boolean.valueOf(z2));
        localQueryLoginType.setSupportPin(Boolean.valueOf(z));
        localQueryLoginType.setSupportFaceLogin(networkQueryLoginType.getSupportFaceLogin());
        localQueryLoginType.setSupportFingerprintLogin(networkQueryLoginType.getSupportFingerprintLogin());
        ExtResponse extResponse = networkQueryLoginType.getExtResponse();
        if (extResponse != null) {
            int i6 = copydefault + 105;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            localQueryLoginType.setSupportPin(Boolean.valueOf(Boolean.parseBoolean(extResponse.getSupportPin())));
            localQueryLoginType.setSupportOtpLogin(Boolean.valueOf(Boolean.parseBoolean(extResponse.getSupportOtp())));
            localQueryLoginType.setSupportFaceLogin(Boolean.valueOf(Boolean.parseBoolean(extResponse.getSupportFace())));
            localQueryLoginType.setSupportFingerprintLogin(Boolean.valueOf(Boolean.parseBoolean(extResponse.getSupportFingerprint())));
            localQueryLoginType.setOtpTpe(extResponse.getOtpType());
            if (!TextUtils.isEmpty(extResponse.getSupportForgetPin())) {
                localQueryLoginType.setSupportForgetPin(Boolean.valueOf(Boolean.parseBoolean(extResponse.getSupportForgetPin())));
                int i8 = ShareDataUIState + 29;
                copydefault = i8 % 128;
                int i9 = i8 % 2;
            }
        }
        localQueryLoginType.copyExtension(networkQueryLoginType);
        return localQueryLoginType;
    }
}
