package com.huawei.digitalpayment.home.viewmodel;

import com.huawei.digitalpayment.home.viewmodel.TipsViewModel_HiltModules;
import dagger.internal.Factory;

public final class TipsViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component3 = 0;
    private static int copydefault = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 1;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = copydefault + 5;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = copydefault + 81;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = component3 + 111;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }

    public static TipsViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = copydefault + 89;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        TipsViewModel_HiltModules_KeyModule_ProvideFactory tipsViewModel_HiltModules_KeyModule_ProvideFactory = component2.component1;
        if (i3 == 0) {
            return tipsViewModel_HiltModules_KeyModule_ProvideFactory;
        }
        throw null;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component3 + 63;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            TipsViewModel_HiltModules.KeyModule.provide();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zProvide = TipsViewModel_HiltModules.KeyModule.provide();
        int i3 = component3 + 41;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return zProvide;
    }

    static final class component2 {
        private static int ShareDataUIState = 1;
        static final TipsViewModel_HiltModules_KeyModule_ProvideFactory component1 = new TipsViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component2;

        private component2() {
        }

        static {
            int i = component2 + 123;
            ShareDataUIState = i % 128;
            if (i % 2 == 0) {
                int i2 = 52 / 0;
            }
        }
    }
}
