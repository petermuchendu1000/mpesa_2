package com.huawei.digitalpayment.checkout.viewmodel;

import com.huawei.digitalpayment.checkout.viewmodel.EasyCheckoutViewModel_HiltModules;
import dagger.internal.Factory;

public final class EasyCheckoutViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 73;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            get();
            throw null;
        }
        Boolean bool = get();
        int i3 = component3 + 79;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component3 + 35;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            Boolean.valueOf(provide());
            throw null;
        }
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i3 = ShareDataUIState + 119;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return boolValueOf;
    }

    public static EasyCheckoutViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        EasyCheckoutViewModel_HiltModules_KeyModule_ProvideFactory easyCheckoutViewModel_HiltModules_KeyModule_ProvideFactory = component1.component3;
        int i4 = ShareDataUIState + 117;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return easyCheckoutViewModel_HiltModules_KeyModule_ProvideFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = EasyCheckoutViewModel_HiltModules.KeyModule.provide();
        int i4 = ShareDataUIState + 61;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return zProvide;
    }

    static final class component1 {
        private static int ShareDataUIState = 1;
        private static int component1;
        static final EasyCheckoutViewModel_HiltModules_KeyModule_ProvideFactory component3 = new EasyCheckoutViewModel_HiltModules_KeyModule_ProvideFactory();

        private component1() {
        }

        static {
            int i = ShareDataUIState + 79;
            component1 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }
}
