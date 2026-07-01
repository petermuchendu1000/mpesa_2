package com.huawei.digitalpayment.home.viewmodel;

import com.huawei.digitalpayment.home.viewmodel.HomeServiceManagerViewModel_HiltModules;
import dagger.internal.Factory;

public final class HomeServiceManagerViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component3 = 0;
    private static int copydefault = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 79;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = copydefault + 119;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 12 / 0;
        }
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component3 + 87;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = component3 + 7;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return boolValueOf;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static HomeServiceManagerViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = copydefault + 13;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        HomeServiceManagerViewModel_HiltModules_KeyModule_ProvideFactory homeServiceManagerViewModel_HiltModules_KeyModule_ProvideFactory = component3.component3;
        int i4 = component3 + 7;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return homeServiceManagerViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component3 + 101;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            HomeServiceManagerViewModel_HiltModules.KeyModule.provide();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zProvide = HomeServiceManagerViewModel_HiltModules.KeyModule.provide();
        int i3 = component3 + 33;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 21 / 0;
        }
        return zProvide;
    }

    static final class component3 {
        private static int component1 = 0;
        static final HomeServiceManagerViewModel_HiltModules_KeyModule_ProvideFactory component3 = new HomeServiceManagerViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int copydefault = 1;

        private component3() {
        }

        static {
            int i = component1 + 57;
            copydefault = i % 128;
            int i2 = i % 2;
        }
    }
}
