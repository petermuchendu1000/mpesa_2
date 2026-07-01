package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.ResetPinVerifyIdViewModel_HiltModules;
import dagger.internal.Factory;

public final class ResetPinVerifyIdViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 25;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = ShareDataUIState + 11;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 68 / 0;
        }
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 115;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = copydefault + 125;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
        return boolValueOf;
    }

    public static ResetPinVerifyIdViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 55;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ResetPinVerifyIdViewModel_HiltModules_KeyModule_ProvideFactory resetPinVerifyIdViewModel_HiltModules_KeyModule_ProvideFactory = copydefault.ShareDataUIState;
        int i4 = ShareDataUIState + 81;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return resetPinVerifyIdViewModel_HiltModules_KeyModule_ProvideFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = copydefault + 13;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = ResetPinVerifyIdViewModel_HiltModules.KeyModule.provide();
        int i4 = ShareDataUIState + 109;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 28 / 0;
        }
        return zProvide;
    }

    static final class copydefault {
        static final ResetPinVerifyIdViewModel_HiltModules_KeyModule_ProvideFactory ShareDataUIState = new ResetPinVerifyIdViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component1 = 0;
        private static int component2 = 1;

        private copydefault() {
        }

        static {
            int i = component1 + 113;
            component2 = i % 128;
            int i2 = i % 2;
        }
    }
}
