package com.huawei.digitalpayment.consumer.loginModule.register.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.register.viewmodel.SetPinViewModel_HiltModules;
import dagger.internal.Factory;

public final class SetPinViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component2 = 1;
    private static int component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 93;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = component2 + 5;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component2 + 61;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = component2 + 113;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }

    public static SetPinViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component3 + 45;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        SetPinViewModel_HiltModules_KeyModule_ProvideFactory setPinViewModel_HiltModules_KeyModule_ProvideFactory = copydefault.ShareDataUIState;
        if (i3 != 0) {
            return setPinViewModel_HiltModules_KeyModule_ProvideFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component2 + 37;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = SetPinViewModel_HiltModules.KeyModule.provide();
        if (i3 != 0) {
            int i4 = 33 / 0;
        }
        return zProvide;
    }

    static final class copydefault {
        static final SetPinViewModel_HiltModules_KeyModule_ProvideFactory ShareDataUIState = new SetPinViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component2 = 1;
        private static int component3;

        private copydefault() {
        }

        static {
            int i = component3 + 109;
            component2 = i % 128;
            if (i % 2 == 0) {
                int i2 = 73 / 0;
            }
        }
    }
}
