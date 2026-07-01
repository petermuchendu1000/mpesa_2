package com.huawei.digitalpayment.checkout.viewmodel;

import com.huawei.digitalpayment.checkout.viewmodel.PayResultViewModel_HiltModules;
import dagger.internal.Factory;

public final class PayResultViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component1 = 0;
    private static int component2 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 9;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = component1 + 37;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return bool;
        }
        throw null;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component2 + 113;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = component1 + 19;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return boolValueOf;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static PayResultViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component2 + 73;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        PayResultViewModel_HiltModules_KeyModule_ProvideFactory payResultViewModel_HiltModules_KeyModule_ProvideFactory = ShareDataUIState.component1;
        int i4 = component1 + 39;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 4 / 0;
        }
        return payResultViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component2 + 9;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = PayResultViewModel_HiltModules.KeyModule.provide();
        if (i3 != 0) {
            int i4 = 32 / 0;
        }
        return zProvide;
    }

    static final class ShareDataUIState {
        static final PayResultViewModel_HiltModules_KeyModule_ProvideFactory component1 = new PayResultViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component3 = 0;
        private static int copydefault = 1;

        private ShareDataUIState() {
        }

        static {
            int i = copydefault + 5;
            component3 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }
}
