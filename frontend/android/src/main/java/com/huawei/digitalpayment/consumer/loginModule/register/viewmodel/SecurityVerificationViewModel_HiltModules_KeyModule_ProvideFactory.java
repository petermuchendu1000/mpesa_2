package com.huawei.digitalpayment.consumer.loginModule.register.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.register.viewmodel.SecurityVerificationViewModel_HiltModules;
import dagger.internal.Factory;

public final class SecurityVerificationViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component2 = 1;
    private static int copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = component2 + 13;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return bool;
        }
        throw null;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component2 + 37;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = provide();
        if (i3 == 0) {
            return Boolean.valueOf(zProvide);
        }
        Boolean.valueOf(zProvide);
        throw null;
    }

    public static SecurityVerificationViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = copydefault + 39;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        SecurityVerificationViewModel_HiltModules_KeyModule_ProvideFactory securityVerificationViewModel_HiltModules_KeyModule_ProvideFactory = component1.ShareDataUIState;
        if (i3 != 0) {
            return securityVerificationViewModel_HiltModules_KeyModule_ProvideFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = copydefault + 121;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = SecurityVerificationViewModel_HiltModules.KeyModule.provide();
        int i4 = copydefault + 69;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return zProvide;
    }

    static final class component1 {
        static final SecurityVerificationViewModel_HiltModules_KeyModule_ProvideFactory ShareDataUIState = new SecurityVerificationViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component3 = 1;
        private static int copydefault;

        private component1() {
        }

        static {
            int i = copydefault + 49;
            component3 = i % 128;
            if (i % 2 == 0) {
                int i2 = 82 / 0;
            }
        }
    }
}
