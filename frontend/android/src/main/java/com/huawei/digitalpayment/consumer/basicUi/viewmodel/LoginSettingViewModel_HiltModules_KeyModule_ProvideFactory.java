package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import com.huawei.digitalpayment.consumer.basicUi.viewmodel.LoginSettingViewModel_HiltModules;
import dagger.internal.Factory;

public final class LoginSettingViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component1 = 1;
    private static int copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 39;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = copydefault + 111;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component1 + 17;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = component1 + 111;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }

    public static LoginSettingViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component1 + 107;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        LoginSettingViewModel_HiltModules_KeyModule_ProvideFactory loginSettingViewModel_HiltModules_KeyModule_ProvideFactory = component3.component3;
        int i4 = component1 + 121;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return loginSettingViewModel_HiltModules_KeyModule_ProvideFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component1 + 17;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = LoginSettingViewModel_HiltModules.KeyModule.provide();
        int i4 = copydefault + 89;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return zProvide;
    }

    static final class component3 {
        private static int component1 = 1;
        private static int component2;
        static final LoginSettingViewModel_HiltModules_KeyModule_ProvideFactory component3 = new LoginSettingViewModel_HiltModules_KeyModule_ProvideFactory();

        private component3() {
        }

        static {
            int i = component1 + 79;
            component2 = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
