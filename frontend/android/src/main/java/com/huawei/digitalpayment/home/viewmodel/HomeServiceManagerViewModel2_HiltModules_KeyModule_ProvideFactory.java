package com.huawei.digitalpayment.home.viewmodel;

import com.huawei.digitalpayment.home.viewmodel.HomeServiceManagerViewModel2_HiltModules;
import dagger.internal.Factory;

public final class HomeServiceManagerViewModel2_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int ShareDataUIState = 1;
    private static int component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 43;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            get();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Boolean bool = get();
        int i3 = ShareDataUIState + 27;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component2 + 43;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = provide();
        if (i3 != 0) {
            return Boolean.valueOf(zProvide);
        }
        Boolean.valueOf(zProvide);
        throw null;
    }

    public static HomeServiceManagerViewModel2_HiltModules_KeyModule_ProvideFactory create() {
        HomeServiceManagerViewModel2_HiltModules_KeyModule_ProvideFactory homeServiceManagerViewModel2_HiltModules_KeyModule_ProvideFactory;
        int i = 2 % 2;
        int i2 = component2 + 37;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            homeServiceManagerViewModel2_HiltModules_KeyModule_ProvideFactory = component2.component3;
            int i3 = 91 / 0;
        } else {
            homeServiceManagerViewModel2_HiltModules_KeyModule_ProvideFactory = component2.component3;
        }
        int i4 = component2 + 75;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
        return homeServiceManagerViewModel2_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component2 + 27;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = HomeServiceManagerViewModel2_HiltModules.KeyModule.provide();
        int i4 = ShareDataUIState + 93;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return zProvide;
        }
        throw null;
    }

    static final class component2 {
        private static int component2 = 1;
        static final HomeServiceManagerViewModel2_HiltModules_KeyModule_ProvideFactory component3 = new HomeServiceManagerViewModel2_HiltModules_KeyModule_ProvideFactory();
        private static int copydefault;

        private component2() {
        }

        static {
            int i = component2 + 105;
            copydefault = i % 128;
            if (i % 2 != 0) {
                int i2 = 4 / 0;
            }
        }
    }
}
