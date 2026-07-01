package com.huawei.digitalpayment.consumer.home.ui.viewmodel;

import com.huawei.digitalpayment.consumer.home.ui.viewmodel.BalancesViewModel_HiltModules;
import dagger.internal.Factory;

public final class BalancesViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component1 = 1;
    private static int component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 87;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            get();
            throw null;
        }
        Boolean bool = get();
        int i3 = component1 + 15;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 77 / 0;
        }
        return bool;
    }

    @Override
    public Boolean get() {
        Boolean boolValueOf;
        int i = 2 % 2;
        int i2 = component3 + 29;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            boolValueOf = Boolean.valueOf(provide());
            int i3 = 97 / 0;
        } else {
            boolValueOf = Boolean.valueOf(provide());
        }
        int i4 = component1 + 81;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return boolValueOf;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static BalancesViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component3 + 81;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        BalancesViewModel_HiltModules_KeyModule_ProvideFactory balancesViewModel_HiltModules_KeyModule_ProvideFactory = copydefault.ShareDataUIState;
        int i4 = component3 + 37;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return balancesViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component1 + 125;
        component3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            BalancesViewModel_HiltModules.KeyModule.provide();
            obj.hashCode();
            throw null;
        }
        boolean zProvide = BalancesViewModel_HiltModules.KeyModule.provide();
        int i3 = component3 + 125;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            return zProvide;
        }
        obj.hashCode();
        throw null;
    }

    static final class copydefault {
        static final BalancesViewModel_HiltModules_KeyModule_ProvideFactory ShareDataUIState = new BalancesViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component1 = 0;
        private static int component3 = 1;

        private copydefault() {
        }

        static {
            int i = component1 + 33;
            component3 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }
}
