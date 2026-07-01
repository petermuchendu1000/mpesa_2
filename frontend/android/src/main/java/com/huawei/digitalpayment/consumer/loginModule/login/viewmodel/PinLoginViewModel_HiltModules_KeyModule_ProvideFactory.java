package com.huawei.digitalpayment.consumer.loginModule.login.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.login.viewmodel.PinLoginViewModel_HiltModules;
import dagger.internal.Factory;

public final class PinLoginViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;

    @Override
    public Object get() {
        Boolean bool;
        int i = 2 % 2;
        int i2 = copydefault + 33;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            bool = get();
            int i3 = 3 / 0;
        } else {
            bool = get();
        }
        int i4 = ShareDataUIState + 83;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 111;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = copydefault + 53;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }

    public static PinLoginViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = copydefault + 5;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        PinLoginViewModel_HiltModules_KeyModule_ProvideFactory pinLoginViewModel_HiltModules_KeyModule_ProvideFactory = component3.component3;
        if (i3 != 0) {
            int i4 = 6 / 0;
        }
        return pinLoginViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 55;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = PinLoginViewModel_HiltModules.KeyModule.provide();
        int i4 = ShareDataUIState + 43;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return zProvide;
    }

    static final class component3 {
        private static int component1 = 1;
        private static int component2;
        static final PinLoginViewModel_HiltModules_KeyModule_ProvideFactory component3 = new PinLoginViewModel_HiltModules_KeyModule_ProvideFactory();

        private component3() {
        }

        static {
            int i = component2 + 63;
            component1 = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
