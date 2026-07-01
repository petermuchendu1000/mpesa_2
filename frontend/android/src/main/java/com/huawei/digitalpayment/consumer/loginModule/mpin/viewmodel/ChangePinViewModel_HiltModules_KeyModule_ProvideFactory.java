package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.ChangePinViewModel_HiltModules;
import dagger.internal.Factory;

public final class ChangePinViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 13;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return get();
        }
        get();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 71;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = ShareDataUIState + 35;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return boolValueOf;
        }
        throw null;
    }

    public static ChangePinViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component1 + 31;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ChangePinViewModel_HiltModules_KeyModule_ProvideFactory changePinViewModel_HiltModules_KeyModule_ProvideFactory = component1.component2;
        if (i3 != 0) {
            int i4 = 24 / 0;
        }
        return changePinViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        boolean zProvide;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 13;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            zProvide = ChangePinViewModel_HiltModules.KeyModule.provide();
            int i3 = 37 / 0;
        } else {
            zProvide = ChangePinViewModel_HiltModules.KeyModule.provide();
        }
        int i4 = component1 + 91;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
        return zProvide;
    }

    static final class component1 {
        private static int component1 = 0;
        static final ChangePinViewModel_HiltModules_KeyModule_ProvideFactory component2 = new ChangePinViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component3 = 1;

        private component1() {
        }

        static {
            int i = component1 + 119;
            component3 = i % 128;
            int i2 = i % 2;
        }
    }
}
