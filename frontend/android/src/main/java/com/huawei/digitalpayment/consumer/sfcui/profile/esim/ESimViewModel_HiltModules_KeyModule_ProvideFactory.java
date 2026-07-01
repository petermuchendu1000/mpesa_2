package com.huawei.digitalpayment.consumer.sfcui.profile.esim;

import com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel_HiltModules;
import dagger.internal.Factory;

public final class ESimViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int ShareDataUIState = 1;
    private static int component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 81;
        ShareDataUIState = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            get();
            throw null;
        }
        Boolean bool = get();
        int i3 = ShareDataUIState + 45;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            return bool;
        }
        obj.hashCode();
        throw null;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = component2 + 19;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }

    public static ESimViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 3;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ESimViewModel_HiltModules_KeyModule_ProvideFactory eSimViewModel_HiltModules_KeyModule_ProvideFactory = component3.copydefault;
        int i4 = component2 + 35;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 15 / 0;
        }
        return eSimViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component2 + 121;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = ESimViewModel_HiltModules.KeyModule.provide();
        int i4 = ShareDataUIState + 31;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 84 / 0;
        }
        return zProvide;
    }

    static final class component3 {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        static final ESimViewModel_HiltModules_KeyModule_ProvideFactory copydefault = new ESimViewModel_HiltModules_KeyModule_ProvideFactory();

        private component3() {
        }

        static {
            int i = ShareDataUIState + 21;
            component1 = i % 128;
            int i2 = i % 2;
        }
    }
}
