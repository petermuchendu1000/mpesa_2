package com.huawei.digitalpayment.common.theme.viewmodel;

import com.huawei.digitalpayment.common.theme.viewmodel.ThemeViewModel_HiltModules;
import dagger.internal.Factory;

public final class ThemeViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component2 = 0;
    private static int component3 = 1;

    @Override
    public Object get() {
        Boolean bool;
        int i = 2 % 2;
        int i2 = component3 + 69;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            bool = get();
            int i3 = 46 / 0;
        } else {
            bool = get();
        }
        int i4 = component3 + 93;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component2 + 33;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = component3 + 31;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return boolValueOf;
        }
        throw null;
    }

    public static ThemeViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component2 + 1;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ThemeViewModel_HiltModules_KeyModule_ProvideFactory themeViewModel_HiltModules_KeyModule_ProvideFactory = component3.ShareDataUIState;
        if (i3 != 0) {
            return themeViewModel_HiltModules_KeyModule_ProvideFactory;
        }
        throw null;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component2 + 39;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            ThemeViewModel_HiltModules.KeyModule.provide();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zProvide = ThemeViewModel_HiltModules.KeyModule.provide();
        int i3 = component3 + 21;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return zProvide;
    }

    static final class component3 {
        static final ThemeViewModel_HiltModules_KeyModule_ProvideFactory ShareDataUIState = new ThemeViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component2 = 0;
        private static int component3 = 1;

        private component3() {
        }

        static {
            int i = component2 + 123;
            component3 = i % 128;
            int i2 = i % 2;
        }
    }
}
