package com.huawei.digitalpayment.home.viewmodel;

import com.huawei.digitalpayment.home.viewmodel.HomeViewModel_HiltModules;
import dagger.internal.Factory;

public final class HomeViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component2 = 1;
    private static int component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 35;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = component2 + 125;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component3 + 117;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = component3 + 33;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }

    public static HomeViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component3 + 73;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        HomeViewModel_HiltModules_KeyModule_ProvideFactory homeViewModel_HiltModules_KeyModule_ProvideFactory = component3.component2;
        int i4 = component3 + 117;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return homeViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component3 + 57;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = HomeViewModel_HiltModules.KeyModule.provide();
        int i4 = component2 + 107;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return zProvide;
    }

    static final class component3 {
        private static int component1 = 0;
        static final HomeViewModel_HiltModules_KeyModule_ProvideFactory component2 = new HomeViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component3 = 1;

        private component3() {
        }

        static {
            int i = component1 + 77;
            component3 = i % 128;
            int i2 = i % 2;
        }
    }
}
