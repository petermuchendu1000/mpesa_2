package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.ResetPinTempPinViewModel_HiltModules;
import dagger.internal.Factory;

public final class ResetPinTempPinViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component3 = 0;
    private static int copydefault = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 105;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        if (i3 != 0) {
            int i4 = 32 / 0;
        }
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component3 + 61;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = component3 + 89;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return boolValueOf;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ResetPinTempPinViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component3 + 115;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ResetPinTempPinViewModel_HiltModules_KeyModule_ProvideFactory resetPinTempPinViewModel_HiltModules_KeyModule_ProvideFactory = ShareDataUIState.component2;
        int i4 = component3 + 89;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 0 / 0;
        }
        return resetPinTempPinViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component3 + 119;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return ResetPinTempPinViewModel_HiltModules.KeyModule.provide();
        }
        ResetPinTempPinViewModel_HiltModules.KeyModule.provide();
        throw null;
    }

    static final class ShareDataUIState {
        static final ResetPinTempPinViewModel_HiltModules_KeyModule_ProvideFactory component2 = new ResetPinTempPinViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component3 = 0;
        private static int copydefault = 1;

        private ShareDataUIState() {
        }

        static {
            int i = copydefault + 83;
            component3 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }
}
