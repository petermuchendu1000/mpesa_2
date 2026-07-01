package com.huawei.digitalpayment.common.theme.viewmodel;

import com.huawei.digitalpayment.common.theme.viewmodel.BalanceThemeViewModel_HiltModules;
import dagger.internal.Factory;

public final class BalanceThemeViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component2 = 0;
    private static int component3 = 1;

    @Override
    public Object get() {
        Boolean bool;
        int i = 2 % 2;
        int i2 = component3 + 53;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            bool = get();
            int i3 = 60 / 0;
        } else {
            bool = get();
        }
        int i4 = component2 + 125;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 98 / 0;
        }
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component3 + 29;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = provide();
        if (i3 == 0) {
            return Boolean.valueOf(zProvide);
        }
        Boolean.valueOf(zProvide);
        throw null;
    }

    public static BalanceThemeViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component2 + 87;
        component3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            BalanceThemeViewModel_HiltModules_KeyModule_ProvideFactory balanceThemeViewModel_HiltModules_KeyModule_ProvideFactory = component2.copydefault;
            throw null;
        }
        BalanceThemeViewModel_HiltModules_KeyModule_ProvideFactory balanceThemeViewModel_HiltModules_KeyModule_ProvideFactory2 = component2.copydefault;
        int i3 = component2 + 55;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            return balanceThemeViewModel_HiltModules_KeyModule_ProvideFactory2;
        }
        obj.hashCode();
        throw null;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component3 + 87;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return BalanceThemeViewModel_HiltModules.KeyModule.provide();
        }
        BalanceThemeViewModel_HiltModules.KeyModule.provide();
        throw null;
    }

    static final class component2 {
        private static int ShareDataUIState = 1;
        private static int component3;
        static final BalanceThemeViewModel_HiltModules_KeyModule_ProvideFactory copydefault = new BalanceThemeViewModel_HiltModules_KeyModule_ProvideFactory();

        private component2() {
        }

        static {
            int i = ShareDataUIState + 13;
            component3 = i % 128;
            int i2 = i % 2;
        }
    }
}
