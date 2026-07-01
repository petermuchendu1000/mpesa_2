package com.huawei.digitalpayment.consumer.loginModule.login.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.login.viewmodel.LoginViewModel_HiltModules;
import dagger.internal.Factory;

public final class LoginViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component3 = 1;
    private static int copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 43;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = component3 + 57;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return bool;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = copydefault + 55;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            Boolean.valueOf(provide());
            throw null;
        }
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i3 = component3 + 23;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 54 / 0;
        }
        return boolValueOf;
    }

    public static LoginViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component3 + 75;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        LoginViewModel_HiltModules_KeyModule_ProvideFactory loginViewModel_HiltModules_KeyModule_ProvideFactory = ShareDataUIState.component3;
        int i4 = component3 + 41;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return loginViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = copydefault + 99;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            LoginViewModel_HiltModules.KeyModule.provide();
            throw null;
        }
        boolean zProvide = LoginViewModel_HiltModules.KeyModule.provide();
        int i3 = component3 + 5;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return zProvide;
    }

    static final class ShareDataUIState {
        private static int component2 = 1;
        static final LoginViewModel_HiltModules_KeyModule_ProvideFactory component3 = new LoginViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int copydefault;

        private ShareDataUIState() {
        }

        static {
            int i = copydefault + 27;
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
