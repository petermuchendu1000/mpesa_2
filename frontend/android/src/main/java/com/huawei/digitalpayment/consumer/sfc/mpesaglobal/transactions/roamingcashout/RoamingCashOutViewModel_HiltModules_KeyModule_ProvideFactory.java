package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout;

import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel_HiltModules;
import dagger.internal.Factory;

public final class RoamingCashOutViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int ShareDataUIState = 1;
    private static int copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 49;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = copydefault + 47;
        ShareDataUIState = i4 % 128;
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
        int i2 = ShareDataUIState + 83;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = ShareDataUIState + 11;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }

    public static RoamingCashOutViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 67;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        RoamingCashOutViewModel_HiltModules_KeyModule_ProvideFactory roamingCashOutViewModel_HiltModules_KeyModule_ProvideFactory = component1.copydefault;
        int i4 = ShareDataUIState + 111;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return roamingCashOutViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = copydefault + 97;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return RoamingCashOutViewModel_HiltModules.KeyModule.provide();
        }
        RoamingCashOutViewModel_HiltModules.KeyModule.provide();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class component1 {
        private static int component2 = 0;
        private static int component3 = 1;
        static final RoamingCashOutViewModel_HiltModules_KeyModule_ProvideFactory copydefault = new RoamingCashOutViewModel_HiltModules_KeyModule_ProvideFactory();

        private component1() {
        }

        static {
            int i = component3 + 43;
            component2 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }
}
