package com.huawei.digitalpayment.home.viewmodel;

import com.huawei.digitalpayment.home.viewmodel.LifeViewModel_HiltModules;
import dagger.internal.Factory;

public final class LifeViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component1 = 0;
    private static int component3 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 75;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            get();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Boolean bool = get();
        int i3 = component3 + 7;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 80 / 0;
        }
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component3 + 23;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = component3 + 31;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }

    public static LifeViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component3 + 117;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        LifeViewModel_HiltModules_KeyModule_ProvideFactory lifeViewModel_HiltModules_KeyModule_ProvideFactory = component3.ShareDataUIState;
        if (i3 == 0) {
            return lifeViewModel_HiltModules_KeyModule_ProvideFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component3 + 89;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = LifeViewModel_HiltModules.KeyModule.provide();
        int i4 = component3 + 13;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return zProvide;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class component3 {
        static final LifeViewModel_HiltModules_KeyModule_ProvideFactory ShareDataUIState = new LifeViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component3 = 1;
        private static int copydefault;

        private component3() {
        }

        static {
            int i = copydefault + 15;
            component3 = i % 128;
            int i2 = i % 2;
        }
    }
}
