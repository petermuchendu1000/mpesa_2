package com.huawei.digitalpayment.consumer.loginModule.register.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.register.viewmodel.RegisterVerifyViewModel_HiltModules;
import dagger.internal.Factory;

public final class RegisterVerifyViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int ShareDataUIState = 1;
    private static int copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 3;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return get();
        }
        get();
        throw null;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = copydefault + 17;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = copydefault + 81;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return boolValueOf;
        }
        throw null;
    }

    public static RegisterVerifyViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = copydefault + 9;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        RegisterVerifyViewModel_HiltModules_KeyModule_ProvideFactory registerVerifyViewModel_HiltModules_KeyModule_ProvideFactory = component1.ShareDataUIState;
        if (i3 != 0) {
            return registerVerifyViewModel_HiltModules_KeyModule_ProvideFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 3;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = RegisterVerifyViewModel_HiltModules.KeyModule.provide();
        int i4 = ShareDataUIState + 35;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return zProvide;
        }
        throw null;
    }

    static final class component1 {
        static final RegisterVerifyViewModel_HiltModules_KeyModule_ProvideFactory ShareDataUIState = new RegisterVerifyViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component1 = 1;
        private static int component3;

        private component1() {
        }

        static {
            int i = component1 + 101;
            component3 = i % 128;
            int i2 = i % 2;
        }
    }
}
