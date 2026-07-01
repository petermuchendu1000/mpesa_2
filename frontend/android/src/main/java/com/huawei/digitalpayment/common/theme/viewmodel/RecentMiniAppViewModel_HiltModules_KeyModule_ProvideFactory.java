package com.huawei.digitalpayment.common.theme.viewmodel;

import com.huawei.digitalpayment.common.theme.viewmodel.RecentMiniAppViewModel_HiltModules;
import dagger.internal.Factory;

public final class RecentMiniAppViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int ShareDataUIState = 1;
    private static int component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 119;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = component3 + 51;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return bool;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 87;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = component3 + 73;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return boolValueOf;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static RecentMiniAppViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 79;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        RecentMiniAppViewModel_HiltModules_KeyModule_ProvideFactory recentMiniAppViewModel_HiltModules_KeyModule_ProvideFactory = component2.component3;
        int i4 = component3 + 91;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return recentMiniAppViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component3 + 79;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = RecentMiniAppViewModel_HiltModules.KeyModule.provide();
        if (i3 == 0) {
            int i4 = 87 / 0;
        }
        return zProvide;
    }

    static final class component2 {
        private static int ShareDataUIState = 1;
        private static int component2;
        static final RecentMiniAppViewModel_HiltModules_KeyModule_ProvideFactory component3 = new RecentMiniAppViewModel_HiltModules_KeyModule_ProvideFactory();

        private component2() {
        }

        static {
            int i = component2 + 101;
            ShareDataUIState = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }
}
