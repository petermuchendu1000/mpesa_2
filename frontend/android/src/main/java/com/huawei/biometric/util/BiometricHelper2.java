package com.huawei.biometric.util;

import com.huawei.biometric.DefaultBiometricIml;
import com.huawei.biometric.IBiometricInterface;
import com.huawei.biometric.LocalAuthenticationUtils;
import com.huawei.biometric.R;
import com.huawei.biometric.constants.BiometricConstants;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SPUtils;

public class BiometricHelper2 {
    private static final String component1 = "BiometricHelper2";
    private static final BiometricHelper2 component2 = new BiometricHelper2();
    private IBiometricInterface component3 = new DefaultBiometricIml();

    private BiometricHelper2() {
    }

    public void setBiometricInterface(IBiometricInterface iBiometricInterface) {
        this.component3 = iBiometricInterface;
    }

    public static BiometricHelper2 getInstance() {
        return component2;
    }

    public boolean isOpenFingerprintLogin() {
        return this.component3.isOpenFingerprintLogin();
    }

    public boolean isOpenFaceIdLogin() {
        return this.component3.isOpenFaceIdLogin();
    }

    public boolean isOpenBiometricLogin() {
        return this.component3.isOpenBiometricLogin();
    }

    public boolean isOpenFingerprintPay() {
        return this.component3.isOpenFingerprintPay();
    }

    public boolean isOpenFaceIdPay() {
        return this.component3.isOpenFaceIdPay();
    }

    public boolean isOpenBiometricPay() {
        return this.component3.isOpenBiometricPay();
    }

    public void closeFaceIdLogin() {
        this.component3.closeFaceIdLogin();
    }

    public void closeFaceIdPay() {
        this.component3.closeFaceIdPay();
    }

    public void closeFingerprintLogin() {
        this.component3.closeFingerprintLogin();
    }

    public void closeFingerprintPay() {
        this.component3.closeFingerprintPay();
    }

    public void openFingerprintLogin(String str, ApiCallback<Boolean> apiCallback) {
        this.component3.openFingerprintLogin(str, apiCallback);
    }

    public void openFingerprintPay(String str, ApiCallback<Boolean> apiCallback) {
        this.component3.openFingerprintPay(str, apiCallback);
    }

    public void loginWithFingerprint(ApiCallback<String> apiCallback) {
        this.component3.loginWithFingerprint(apiCallback);
    }

    public void payWithFingerprint(ApiCallback<String> apiCallback) {
        this.component3.payWithFingerprint(apiCallback);
    }

    public void openFaceIdLogin(String str, ApiCallback<Boolean> apiCallback) {
        this.component3.openFaceIdLogin(str, apiCallback);
    }

    public void openFaceIdPay(String str, ApiCallback<Boolean> apiCallback) {
        this.component3.openFaceIdPay(str, apiCallback);
    }

    public void loginWithFaceId(ApiCallback<String> apiCallback) {
        this.component3.loginWithFaceId(apiCallback);
    }

    public void payWithFaceId(ApiCallback<String> apiCallback) {
        this.component3.payWithFaceId(apiCallback);
    }

    public boolean onlySupport3D() {
        return this.component3.onlySupport3D();
    }

    public void setBiometricExtraKey(String str) {
        SPUtils.getInstance().put(BiometricConstants.CURRENT_ACCOUNT, str);
    }

    public String getBiometricAlias(String str) {
        return this.component3.getBiometricAlias(str);
    }

    public boolean replaceFingerprintText() {
        return this.component3.replaceFingerprintText();
    }

    public static int getBiometricTipsId() {
        if (!LocalAuthenticationUtils.isSupport() && getInstance().replaceFingerprintText()) {
            return R.string.biometric_please_verify_your_fingerprint10;
        }
        return R.string.biometric_please_verify_your_fingerprint;
    }
}
