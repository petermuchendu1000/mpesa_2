package com.huawei.digitalpayment.consumer.sfcui.profile.viewmodel;

import com.huawei.digitalpayment.consumer.sfcui.profile.viewmodel.BiometricsViewModel_HiltModules;
import dagger.internal.Factory;

public final class BiometricsViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component1 = 0;
    private static int component2 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 63;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        if (i3 == 0) {
            int i4 = 59 / 0;
        }
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component1 + 89;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = component2 + 21;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }

    public static BiometricsViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component2 + 105;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            BiometricsViewModel_HiltModules_KeyModule_ProvideFactory biometricsViewModel_HiltModules_KeyModule_ProvideFactory = component1.component1;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        BiometricsViewModel_HiltModules_KeyModule_ProvideFactory biometricsViewModel_HiltModules_KeyModule_ProvideFactory2 = component1.component1;
        int i3 = component1 + 75;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 6 / 0;
        }
        return biometricsViewModel_HiltModules_KeyModule_ProvideFactory2;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component2 + 77;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = BiometricsViewModel_HiltModules.KeyModule.provide();
        int i4 = component1 + 115;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return zProvide;
    }

    static final class component1 {
        static final BiometricsViewModel_HiltModules_KeyModule_ProvideFactory component1 = new BiometricsViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component3 = 0;
        private static int copydefault = 1;

        private component1() {
        }

        static {
            int i = component3 + 117;
            copydefault = i % 128;
            int i2 = i % 2;
        }
    }
}
