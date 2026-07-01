package com.huawei.digitalpayment.consumer.loginModule.register.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.register.viewmodel.RegisterOtpViewModel_HiltModules;
import dagger.internal.Factory;

public final class RegisterOtpViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component2 = 1;
    private static int copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 77;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = copydefault + 7;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = copydefault + 107;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = provide();
        if (i3 != 0) {
            return Boolean.valueOf(zProvide);
        }
        Boolean.valueOf(zProvide);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static RegisterOtpViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component2 + 125;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        RegisterOtpViewModel_HiltModules_KeyModule_ProvideFactory registerOtpViewModel_HiltModules_KeyModule_ProvideFactory = component1.component1;
        if (i3 == 0) {
            return registerOtpViewModel_HiltModules_KeyModule_ProvideFactory;
        }
        throw null;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component2 + 71;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = RegisterOtpViewModel_HiltModules.KeyModule.provide();
        int i4 = copydefault + 97;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return zProvide;
    }

    static final class component1 {
        static final RegisterOtpViewModel_HiltModules_KeyModule_ProvideFactory component1 = new RegisterOtpViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component3 = 0;
        private static int copydefault = 1;

        private component1() {
        }

        static {
            int i = copydefault + 123;
            component3 = i % 128;
            int i2 = i % 2;
        }
    }
}
