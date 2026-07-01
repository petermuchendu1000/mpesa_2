package com.huawei.biometric;

import com.huawei.common.listener.ApiCallback;

public interface IBiometricInterface {
    void closeFaceIdLogin();

    void closeFaceIdPay();

    void closeFingerprintLogin();

    void closeFingerprintPay();

    boolean isOpenFaceIdLogin();

    boolean isOpenFaceIdPay();

    boolean isOpenFingerprintLogin();

    boolean isOpenFingerprintPay();

    void loginWithFaceId(ApiCallback<String> apiCallback);

    void loginWithFingerprint(ApiCallback<String> apiCallback);

    default boolean onlySupport3D() {
        return false;
    }

    void openFaceIdLogin(String str, ApiCallback<Boolean> apiCallback);

    void openFaceIdPay(String str, ApiCallback<Boolean> apiCallback);

    void openFingerprintLogin(String str, ApiCallback<Boolean> apiCallback);

    void openFingerprintPay(String str, ApiCallback<Boolean> apiCallback);

    void payWithFaceId(ApiCallback<String> apiCallback);

    void payWithFingerprint(ApiCallback<String> apiCallback);

    default boolean replaceFingerprintText() {
        return false;
    }

    default boolean isOpenBiometricLogin() {
        return isOpenFingerprintLogin() || isOpenFaceIdLogin();
    }

    default boolean isOpenBiometricPay() {
        return isOpenFaceIdPay() || isOpenFingerprintPay();
    }

    default String getBiometricAlias(String str) {
        return "";
    }
}
