package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.ResetPinOtpViewModel_HiltModules;
import dagger.internal.Factory;

public final class ResetPinOtpViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 49;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return get();
        }
        get();
        throw null;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 61;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = ShareDataUIState + 83;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }

    public static ResetPinOtpViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 109;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ResetPinOtpViewModel_HiltModules_KeyModule_ProvideFactory resetPinOtpViewModel_HiltModules_KeyModule_ProvideFactory = ShareDataUIState.ShareDataUIState;
        if (i3 == 0) {
            int i4 = 80 / 0;
        }
        return resetPinOtpViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        boolean zProvide;
        int i = 2 % 2;
        int i2 = component2 + 25;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            zProvide = ResetPinOtpViewModel_HiltModules.KeyModule.provide();
            int i3 = 36 / 0;
        } else {
            zProvide = ResetPinOtpViewModel_HiltModules.KeyModule.provide();
        }
        int i4 = ShareDataUIState + 11;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return zProvide;
        }
        throw null;
    }

    static final class ShareDataUIState {
        static final ResetPinOtpViewModel_HiltModules_KeyModule_ProvideFactory ShareDataUIState = new ResetPinOtpViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component2 = 1;
        private static int copydefault;

        private ShareDataUIState() {
        }

        static {
            int i = copydefault + 49;
            component2 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }
}
