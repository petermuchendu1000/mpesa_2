package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion;

import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionViewModel_HiltModules;
import dagger.internal.Factory;

public final class WesternUnionViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component2 = 1;
    private static int component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 35;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = component3 + 29;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component3 + 9;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = component3 + 41;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return boolValueOf;
        }
        throw null;
    }

    public static WesternUnionViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component2 + 53;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        WesternUnionViewModel_HiltModules_KeyModule_ProvideFactory westernUnionViewModel_HiltModules_KeyModule_ProvideFactory = component1.component1;
        if (i3 != 0) {
            int i4 = 87 / 0;
        }
        return westernUnionViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component3 + 13;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = WesternUnionViewModel_HiltModules.KeyModule.provide();
        int i4 = component3 + 39;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
        return zProvide;
    }

    static final class component1 {
        private static int ShareDataUIState = 0;
        static final WesternUnionViewModel_HiltModules_KeyModule_ProvideFactory component1 = new WesternUnionViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int copydefault = 1;

        private component1() {
        }

        static {
            int i = copydefault + 125;
            ShareDataUIState = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }
}
