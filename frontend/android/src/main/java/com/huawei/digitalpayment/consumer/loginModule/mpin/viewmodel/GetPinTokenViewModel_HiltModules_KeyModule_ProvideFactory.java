package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.GetPinTokenViewModel_HiltModules;
import dagger.internal.Factory;

public final class GetPinTokenViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component2 = 1;
    private static int component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 87;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            get();
            throw null;
        }
        Boolean bool = get();
        int i3 = component3 + 121;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component3 + 13;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            Boolean.valueOf(provide());
            throw null;
        }
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i3 = component2 + 103;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 86 / 0;
        }
        return boolValueOf;
    }

    public static GetPinTokenViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component2 + 43;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        GetPinTokenViewModel_HiltModules_KeyModule_ProvideFactory getPinTokenViewModel_HiltModules_KeyModule_ProvideFactory = component3.ShareDataUIState;
        int i4 = component3 + 41;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return getPinTokenViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        boolean zProvide;
        int i = 2 % 2;
        int i2 = component2 + 49;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            zProvide = GetPinTokenViewModel_HiltModules.KeyModule.provide();
            int i3 = 88 / 0;
        } else {
            zProvide = GetPinTokenViewModel_HiltModules.KeyModule.provide();
        }
        int i4 = component3 + 115;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return zProvide;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class component3 {
        static final GetPinTokenViewModel_HiltModules_KeyModule_ProvideFactory ShareDataUIState = new GetPinTokenViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component1 = 1;
        private static int copydefault;

        private component3() {
        }

        static {
            int i = copydefault + 65;
            component1 = i % 128;
            int i2 = i % 2;
        }
    }
}
