package com.huawei.digitalpayment.consumer.risk.vm;

import com.huawei.digitalpayment.consumer.risk.vm.RiskViewModel_HiltModules;
import dagger.internal.Factory;

public final class RiskViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component3 = 0;
    private static int copydefault = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = component3 + 31;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = copydefault + 55;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = provide();
        if (i3 == 0) {
            return Boolean.valueOf(zProvide);
        }
        Boolean.valueOf(zProvide);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static RiskViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = copydefault + 93;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            RiskViewModel_HiltModules_KeyModule_ProvideFactory riskViewModel_HiltModules_KeyModule_ProvideFactory = component1.copydefault;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        RiskViewModel_HiltModules_KeyModule_ProvideFactory riskViewModel_HiltModules_KeyModule_ProvideFactory2 = component1.copydefault;
        int i3 = copydefault + 119;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return riskViewModel_HiltModules_KeyModule_ProvideFactory2;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = RiskViewModel_HiltModules.KeyModule.provide();
        int i4 = component3 + 107;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 76 / 0;
        }
        return zProvide;
    }

    static final class component1 {
        private static int ShareDataUIState = 1;
        private static int component3;
        static final RiskViewModel_HiltModules_KeyModule_ProvideFactory copydefault = new RiskViewModel_HiltModules_KeyModule_ProvideFactory();

        private component1() {
        }

        static {
            int i = ShareDataUIState + 81;
            component3 = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
