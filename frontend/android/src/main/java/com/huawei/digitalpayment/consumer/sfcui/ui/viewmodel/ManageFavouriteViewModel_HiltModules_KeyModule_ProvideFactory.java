package com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel;

import com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.ManageFavouriteViewModel_HiltModules;
import dagger.internal.Factory;

public final class ManageFavouriteViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component1 = 1;
    private static int component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 19;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = component2 + 21;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return bool;
        }
        throw null;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component2 + 119;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            Boolean.valueOf(provide());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i3 = component2 + 5;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return boolValueOf;
    }

    public static ManageFavouriteViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component2 + 95;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ManageFavouriteViewModel_HiltModules_KeyModule_ProvideFactory manageFavouriteViewModel_HiltModules_KeyModule_ProvideFactory = component1.copydefault;
        int i4 = component2 + 111;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return manageFavouriteViewModel_HiltModules_KeyModule_ProvideFactory;
        }
        throw null;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component1 + 79;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = ManageFavouriteViewModel_HiltModules.KeyModule.provide();
        if (i3 != 0) {
            int i4 = 72 / 0;
        }
        return zProvide;
    }

    static final class component1 {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;
        static final ManageFavouriteViewModel_HiltModules_KeyModule_ProvideFactory copydefault = new ManageFavouriteViewModel_HiltModules_KeyModule_ProvideFactory();

        private component1() {
        }

        static {
            int i = ShareDataUIState + 85;
            component3 = i % 128;
            if (i % 2 == 0) {
                int i2 = 3 / 0;
            }
        }
    }
}
