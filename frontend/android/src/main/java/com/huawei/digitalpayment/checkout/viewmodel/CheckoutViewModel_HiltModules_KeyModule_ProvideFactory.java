package com.huawei.digitalpayment.checkout.viewmodel;

import com.huawei.digitalpayment.checkout.viewmodel.CheckoutViewModel_HiltModules;
import dagger.internal.Factory;

public final class CheckoutViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int ShareDataUIState = 1;
    private static int component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 75;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        if (i3 != 0) {
            int i4 = 46 / 0;
        }
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component3 + 93;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = provide();
        if (i3 != 0) {
            return Boolean.valueOf(zProvide);
        }
        Boolean.valueOf(zProvide);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static CheckoutViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component3 + 95;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        CheckoutViewModel_HiltModules_KeyModule_ProvideFactory checkoutViewModel_HiltModules_KeyModule_ProvideFactory = copydefault.component2;
        int i4 = ShareDataUIState + 119;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return checkoutViewModel_HiltModules_KeyModule_ProvideFactory;
        }
        throw null;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 61;
        component3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            CheckoutViewModel_HiltModules.KeyModule.provide();
            obj.hashCode();
            throw null;
        }
        boolean zProvide = CheckoutViewModel_HiltModules.KeyModule.provide();
        int i3 = ShareDataUIState + 125;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            return zProvide;
        }
        obj.hashCode();
        throw null;
    }

    static final class copydefault {
        static final CheckoutViewModel_HiltModules_KeyModule_ProvideFactory component2 = new CheckoutViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component3 = 1;
        private static int copydefault;

        private copydefault() {
        }

        static {
            int i = copydefault + 21;
            component3 = i % 128;
            int i2 = i % 2;
        }
    }
}
