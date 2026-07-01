package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import com.huawei.digitalpayment.consumer.basicUi.viewmodel.ChangeLanguageViewModel_HiltModules;
import dagger.internal.Factory;

public final class ChangeLanguageViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component2 = 1;
    private static int component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 107;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return get();
        }
        get();
        throw null;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component2 + 49;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = provide();
        if (i3 == 0) {
            return Boolean.valueOf(zProvide);
        }
        Boolean.valueOf(zProvide);
        throw null;
    }

    public static ChangeLanguageViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component2 + 79;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ChangeLanguageViewModel_HiltModules_KeyModule_ProvideFactory changeLanguageViewModel_HiltModules_KeyModule_ProvideFactory = copydefault.copydefault;
        if (i3 == 0) {
            return changeLanguageViewModel_HiltModules_KeyModule_ProvideFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component3 + 95;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = ChangeLanguageViewModel_HiltModules.KeyModule.provide();
        int i4 = component3 + 117;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return zProvide;
    }

    static final class copydefault {
        private static int component1 = 1;
        private static int component3;
        static final ChangeLanguageViewModel_HiltModules_KeyModule_ProvideFactory copydefault = new ChangeLanguageViewModel_HiltModules_KeyModule_ProvideFactory();

        private copydefault() {
        }

        static {
            int i = component1 + 119;
            component3 = i % 128;
            int i2 = i % 2;
        }
    }
}
