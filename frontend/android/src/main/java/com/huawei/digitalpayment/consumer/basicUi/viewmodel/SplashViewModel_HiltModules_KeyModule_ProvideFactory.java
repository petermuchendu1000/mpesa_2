package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import com.huawei.digitalpayment.consumer.basicUi.viewmodel.SplashViewModel_HiltModules;
import dagger.internal.Factory;

public final class SplashViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 47;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = component3 + 123;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return bool;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = component3 + 61;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return boolValueOf;
        }
        throw null;
    }

    public static SplashViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 25;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        SplashViewModel_HiltModules_KeyModule_ProvideFactory splashViewModel_HiltModules_KeyModule_ProvideFactory = component2.component2;
        int i4 = component3 + 19;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return splashViewModel_HiltModules_KeyModule_ProvideFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 99;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = SplashViewModel_HiltModules.KeyModule.provide();
        int i4 = component3 + 83;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 99 / 0;
        }
        return zProvide;
    }

    static final class component2 {
        static final SplashViewModel_HiltModules_KeyModule_ProvideFactory component2 = new SplashViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component3 = 0;
        private static int copydefault = 1;

        private component2() {
        }

        static {
            int i = component3 + 107;
            copydefault = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }
}
