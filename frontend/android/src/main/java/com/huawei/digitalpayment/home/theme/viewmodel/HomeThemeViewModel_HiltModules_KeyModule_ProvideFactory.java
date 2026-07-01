package com.huawei.digitalpayment.home.theme.viewmodel;

import com.huawei.digitalpayment.home.theme.viewmodel.HomeThemeViewModel_HiltModules;
import dagger.internal.Factory;

public final class HomeThemeViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component2 = 1;
    private static int component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 101;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = component2 + 103;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component3 + 75;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            Boolean.valueOf(provide());
            throw null;
        }
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i3 = component2 + 5;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return boolValueOf;
    }

    public static HomeThemeViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component2 + 27;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        HomeThemeViewModel_HiltModules_KeyModule_ProvideFactory homeThemeViewModel_HiltModules_KeyModule_ProvideFactory = component1.component2;
        int i4 = component2 + 35;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return homeThemeViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component3 + 15;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = HomeThemeViewModel_HiltModules.KeyModule.provide();
        int i4 = component2 + 35;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return zProvide;
    }

    static final class component1 {
        static final HomeThemeViewModel_HiltModules_KeyModule_ProvideFactory component2 = new HomeThemeViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component3 = 0;
        private static int copydefault = 1;

        private component1() {
        }

        static {
            int i = copydefault + 43;
            component3 = i % 128;
            if (i % 2 != 0) {
                int i2 = 34 / 0;
            }
        }
    }
}
