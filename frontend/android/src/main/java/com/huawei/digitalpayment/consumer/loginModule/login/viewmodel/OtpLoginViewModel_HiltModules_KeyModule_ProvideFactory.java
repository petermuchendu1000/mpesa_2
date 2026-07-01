package com.huawei.digitalpayment.consumer.loginModule.login.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.login.viewmodel.OtpLoginViewModel_HiltModules;
import dagger.internal.Factory;

public final class OtpLoginViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component3 = 0;
    private static int copydefault = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 55;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = component3 + 69;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return bool;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = copydefault + 63;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            Boolean.valueOf(provide());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i3 = component3 + 7;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return boolValueOf;
    }

    public static OtpLoginViewModel_HiltModules_KeyModule_ProvideFactory create() {
        OtpLoginViewModel_HiltModules_KeyModule_ProvideFactory otpLoginViewModel_HiltModules_KeyModule_ProvideFactory;
        int i = 2 % 2;
        int i2 = copydefault + 29;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            otpLoginViewModel_HiltModules_KeyModule_ProvideFactory = copydefault.component1;
            int i3 = 92 / 0;
        } else {
            otpLoginViewModel_HiltModules_KeyModule_ProvideFactory = copydefault.component1;
        }
        int i4 = copydefault + 25;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 9 / 0;
        }
        return otpLoginViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = copydefault + 87;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = OtpLoginViewModel_HiltModules.KeyModule.provide();
        int i4 = component3 + 113;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 39 / 0;
        }
        return zProvide;
    }

    static final class copydefault {
        static final OtpLoginViewModel_HiltModules_KeyModule_ProvideFactory component1 = new OtpLoginViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component2 = 1;
        private static int component3;

        private copydefault() {
        }

        static {
            int i = component2 + 51;
            component3 = i % 128;
            int i2 = i % 2;
        }
    }
}
