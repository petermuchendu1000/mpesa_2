package com.huawei.digitalpayment.home.viewmodel;

import com.huawei.digitalpayment.home.viewmodel.RecentMiniAppViewModel_HiltModules;
import dagger.internal.Factory;

public final class RecentMiniAppViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component1 = 1;
    private static int copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 99;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = component1 + 123;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 42 / 0;
        }
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = copydefault + 23;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = component1 + 49;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return boolValueOf;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static RecentMiniAppViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = copydefault + 37;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        RecentMiniAppViewModel_HiltModules_KeyModule_ProvideFactory recentMiniAppViewModel_HiltModules_KeyModule_ProvideFactory = component2.component3;
        if (i3 == 0) {
            int i4 = 76 / 0;
        }
        return recentMiniAppViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = copydefault + 29;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = RecentMiniAppViewModel_HiltModules.KeyModule.provide();
        int i4 = component1 + 67;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return zProvide;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class component2 {
        private static int ShareDataUIState = 0;
        static final RecentMiniAppViewModel_HiltModules_KeyModule_ProvideFactory component3 = new RecentMiniAppViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int copydefault = 1;

        private component2() {
        }

        static {
            int i = ShareDataUIState + 79;
            copydefault = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
