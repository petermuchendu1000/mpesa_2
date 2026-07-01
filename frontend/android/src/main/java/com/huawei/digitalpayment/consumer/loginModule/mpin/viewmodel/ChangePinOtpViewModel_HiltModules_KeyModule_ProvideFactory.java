package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.ChangePinOtpViewModel_HiltModules;
import dagger.internal.Factory;

public final class ChangePinOtpViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component2 = 1;
    private static int copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = component2 + 107;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 3 / 0;
        }
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = copydefault + 51;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        if (i3 == 0) {
            int i4 = 75 / 0;
        }
        return boolValueOf;
    }

    public static ChangePinOtpViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = copydefault + 53;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ChangePinOtpViewModel_HiltModules_KeyModule_ProvideFactory changePinOtpViewModel_HiltModules_KeyModule_ProvideFactory = component1.copydefault;
        int i4 = copydefault + 69;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return changePinOtpViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = copydefault + 71;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = ChangePinOtpViewModel_HiltModules.KeyModule.provide();
        int i4 = component2 + 27;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return zProvide;
    }

    static final class component1 {
        private static int ShareDataUIState = 1;
        private static int component2;
        static final ChangePinOtpViewModel_HiltModules_KeyModule_ProvideFactory copydefault = new ChangePinOtpViewModel_HiltModules_KeyModule_ProvideFactory();

        private component1() {
        }

        static {
            int i = ShareDataUIState + 103;
            component2 = i % 128;
            int i2 = i % 2;
        }
    }
}
