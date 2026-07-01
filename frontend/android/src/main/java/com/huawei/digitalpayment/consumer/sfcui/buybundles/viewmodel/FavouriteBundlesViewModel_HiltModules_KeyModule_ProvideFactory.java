package com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel;

import com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.FavouriteBundlesViewModel_HiltModules;
import dagger.internal.Factory;

public final class FavouriteBundlesViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component1 = 1;
    private static int component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 29;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return get();
        }
        get();
        throw null;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component1 + 35;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            Boolean.valueOf(provide());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i3 = component1 + 61;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return boolValueOf;
    }

    public static FavouriteBundlesViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component1 + 105;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FavouriteBundlesViewModel_HiltModules_KeyModule_ProvideFactory favouriteBundlesViewModel_HiltModules_KeyModule_ProvideFactory = component1.component3;
        int i4 = component1 + 35;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return favouriteBundlesViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component1 + 45;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = FavouriteBundlesViewModel_HiltModules.KeyModule.provide();
        int i4 = component3 + 75;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return zProvide;
        }
        throw null;
    }

    static final class component1 {
        private static int component1 = 0;
        private static int component2 = 1;
        static final FavouriteBundlesViewModel_HiltModules_KeyModule_ProvideFactory component3 = new FavouriteBundlesViewModel_HiltModules_KeyModule_ProvideFactory();

        private component1() {
        }

        static {
            int i = component1 + 39;
            component2 = i % 128;
            int i2 = i % 2;
        }
    }
}
