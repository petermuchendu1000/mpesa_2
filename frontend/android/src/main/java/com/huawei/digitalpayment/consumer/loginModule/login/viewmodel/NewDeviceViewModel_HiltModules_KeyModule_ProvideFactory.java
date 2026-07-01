package com.huawei.digitalpayment.consumer.loginModule.login.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.login.viewmodel.NewDeviceViewModel_HiltModules;
import dagger.internal.Factory;

public final class NewDeviceViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 107;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = ShareDataUIState + 13;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component1 + 35;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = ShareDataUIState + 33;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }

    public static NewDeviceViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component1 + 3;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        NewDeviceViewModel_HiltModules_KeyModule_ProvideFactory newDeviceViewModel_HiltModules_KeyModule_ProvideFactory = component1.copydefault;
        if (i3 == 0) {
            return newDeviceViewModel_HiltModules_KeyModule_ProvideFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component1 + 41;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = NewDeviceViewModel_HiltModules.KeyModule.provide();
        int i4 = ShareDataUIState + 111;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return zProvide;
        }
        throw null;
    }

    static final class component1 {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;
        static final NewDeviceViewModel_HiltModules_KeyModule_ProvideFactory copydefault = new NewDeviceViewModel_HiltModules_KeyModule_ProvideFactory();

        private component1() {
        }

        static {
            int i = ShareDataUIState + 97;
            component2 = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
