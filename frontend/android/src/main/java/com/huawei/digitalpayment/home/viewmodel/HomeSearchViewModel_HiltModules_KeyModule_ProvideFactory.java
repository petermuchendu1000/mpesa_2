package com.huawei.digitalpayment.home.viewmodel;

import com.huawei.digitalpayment.home.viewmodel.HomeSearchViewModel_HiltModules;
import dagger.internal.Factory;

public final class HomeSearchViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component3 = 0;
    private static int copydefault = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 99;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = copydefault + 101;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = copydefault + 33;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = provide();
        if (i3 == 0) {
            return Boolean.valueOf(zProvide);
        }
        Boolean.valueOf(zProvide);
        throw null;
    }

    public static HomeSearchViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = copydefault + 75;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        HomeSearchViewModel_HiltModules_KeyModule_ProvideFactory homeSearchViewModel_HiltModules_KeyModule_ProvideFactory = component1.copydefault;
        int i4 = component3 + 33;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return homeSearchViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = copydefault + 7;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = HomeSearchViewModel_HiltModules.KeyModule.provide();
        if (i3 != 0) {
            int i4 = 40 / 0;
        }
        return zProvide;
    }

    static final class component1 {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        static final HomeSearchViewModel_HiltModules_KeyModule_ProvideFactory copydefault = new HomeSearchViewModel_HiltModules_KeyModule_ProvideFactory();

        private component1() {
        }

        static {
            int i = component1 + 25;
            ShareDataUIState = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }
}
