package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import com.huawei.digitalpayment.consumer.basicUi.viewmodel.AboutViewModel_HiltModules;
import dagger.internal.Factory;

public final class AboutViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component1 = 1;
    private static int component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 115;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = component1 + 103;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component3 + 49;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = component1 + 71;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 83 / 0;
        }
        return boolValueOf;
    }

    public static AboutViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component3 + 57;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            AboutViewModel_HiltModules_KeyModule_ProvideFactory aboutViewModel_HiltModules_KeyModule_ProvideFactory = copydefault.ShareDataUIState;
            throw null;
        }
        AboutViewModel_HiltModules_KeyModule_ProvideFactory aboutViewModel_HiltModules_KeyModule_ProvideFactory2 = copydefault.ShareDataUIState;
        int i3 = component3 + 89;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return aboutViewModel_HiltModules_KeyModule_ProvideFactory2;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component3 + 31;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = AboutViewModel_HiltModules.KeyModule.provide();
        int i4 = component3 + 41;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return zProvide;
        }
        throw null;
    }

    static final class copydefault {
        static final AboutViewModel_HiltModules_KeyModule_ProvideFactory ShareDataUIState = new AboutViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component1 = 1;
        private static int component2;

        private copydefault() {
        }

        static {
            int i = component1 + 29;
            component2 = i % 128;
            int i2 = i % 2;
        }
    }
}
