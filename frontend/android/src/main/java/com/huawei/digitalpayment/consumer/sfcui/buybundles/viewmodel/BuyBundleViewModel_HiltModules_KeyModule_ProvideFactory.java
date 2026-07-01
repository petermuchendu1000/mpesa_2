package com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel;

import com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.BuyBundleViewModel_HiltModules;
import dagger.internal.Factory;

public final class BuyBundleViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component2 = 1;
    private static int component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 89;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = component3 + 79;
        component2 = i4 % 128;
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
        int i2 = component2 + 51;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = component3 + 19;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 33 / 0;
        }
        return boolValueOf;
    }

    public static BuyBundleViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component3 + 97;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        BuyBundleViewModel_HiltModules_KeyModule_ProvideFactory buyBundleViewModel_HiltModules_KeyModule_ProvideFactory = component1.component3;
        if (i3 == 0) {
            int i4 = 46 / 0;
        }
        return buyBundleViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component3 + 25;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            BuyBundleViewModel_HiltModules.KeyModule.provide();
            throw null;
        }
        boolean zProvide = BuyBundleViewModel_HiltModules.KeyModule.provide();
        int i3 = component3 + 119;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return zProvide;
    }

    static final class component1 {
        private static int component2 = 0;
        static final BuyBundleViewModel_HiltModules_KeyModule_ProvideFactory component3 = new BuyBundleViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int copydefault = 1;

        private component1() {
        }

        static {
            int i = component2 + 95;
            copydefault = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }
}
