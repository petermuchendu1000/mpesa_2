package com.huawei.digitalpayment.common.theme.viewmodel;

import com.huawei.digitalpayment.common.theme.viewmodel.TipsThemeViewModel_HiltModules;
import dagger.internal.Factory;

public final class TipsThemeViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component1 = 0;
    private static int component2 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 97;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            get();
            throw null;
        }
        Boolean bool = get();
        int i3 = component2 + 109;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component1 + 103;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            Boolean.valueOf(provide());
            throw null;
        }
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i3 = component1 + 75;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return boolValueOf;
    }

    public static TipsThemeViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component1 + 61;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        TipsThemeViewModel_HiltModules_KeyModule_ProvideFactory tipsThemeViewModel_HiltModules_KeyModule_ProvideFactory = component1.component2;
        int i4 = component1 + 111;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return tipsThemeViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component1 + 117;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return TipsThemeViewModel_HiltModules.KeyModule.provide();
        }
        TipsThemeViewModel_HiltModules.KeyModule.provide();
        throw null;
    }

    static final class component1 {
        private static int component1 = 0;
        static final TipsThemeViewModel_HiltModules_KeyModule_ProvideFactory component2 = new TipsThemeViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int copydefault = 1;

        private component1() {
        }

        static {
            int i = copydefault + 73;
            component1 = i % 128;
            int i2 = i % 2;
        }
    }
}
