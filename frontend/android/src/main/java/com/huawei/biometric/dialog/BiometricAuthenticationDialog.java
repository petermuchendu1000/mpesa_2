package com.huawei.biometric.dialog;

import androidx.biometric.BiometricPrompt;
import androidx.fragment.app.FragmentActivity;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import javax.crypto.Cipher;

public class BiometricAuthenticationDialog {
    private final FragmentActivity ShareDataUIState;
    private ApiCallback<Cipher> component1;
    private final Cipher component3;

    protected void onAuthenticationFailed() {
    }

    public BiometricAuthenticationDialog(FragmentActivity fragmentActivity, Cipher cipher) {
        this.ShareDataUIState = fragmentActivity;
        this.component3 = cipher;
    }

    public void setCallBack(ApiCallback<Cipher> apiCallback) {
        this.component1 = apiCallback;
    }

    public void show(int i, int i2) {
        BiometricPrompt.CryptoObject cryptoObject = new BiometricPrompt.CryptoObject(this.component3);
        new BiometricPrompt(this.ShareDataUIState, new BiometricPrompt.AuthenticationCallback() {
            @Override
            public void onAuthenticationError(int i3, CharSequence charSequence) {
                BiometricAuthenticationDialog.this.onAuthenticationError(i3, charSequence);
            }

            @Override
            public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
                BiometricAuthenticationDialog.this.component3(authenticationResult);
            }

            @Override
            public void onAuthenticationFailed() {
                BiometricAuthenticationDialog.this.onAuthenticationFailed();
            }
        }).authenticate(new BiometricPrompt.PromptInfo.Builder().setConfirmationRequired(false).setTitle(this.ShareDataUIState.getString(i)).setNegativeButtonText(this.ShareDataUIState.getString(i2)).build(), cryptoObject);
    }

    public void component3(BiometricPrompt.AuthenticationResult authenticationResult) {
        if (this.component1 == null || authenticationResult == null || authenticationResult.getCryptoObject() == null || authenticationResult.getCryptoObject().getCipher() == null) {
            return;
        }
        this.component1.onSuccess(authenticationResult.getCryptoObject().getCipher());
    }

    protected void onAuthenticationError(int i, CharSequence charSequence) {
        ApiCallback<Cipher> apiCallback = this.component1;
        if (apiCallback != null) {
            apiCallback.onError(new BaseException(String.valueOf(i), charSequence.toString()));
        }
    }
}
