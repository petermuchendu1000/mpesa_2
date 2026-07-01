package com.huawei.digitalpayment.consumer.sfcui.costcalculator;

import com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorViewModel_HiltModules;
import dagger.internal.Factory;

public final class CostCalculatorViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int ShareDataUIState = 1;
    private static int component1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 7;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = component1 + 117;
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
        int i2 = component1 + 77;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = ShareDataUIState + 67;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }

    public static CostCalculatorViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 3;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        CostCalculatorViewModel_HiltModules_KeyModule_ProvideFactory costCalculatorViewModel_HiltModules_KeyModule_ProvideFactory = component3.ShareDataUIState;
        if (i3 == 0) {
            return costCalculatorViewModel_HiltModules_KeyModule_ProvideFactory;
        }
        throw null;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 119;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = CostCalculatorViewModel_HiltModules.KeyModule.provide();
        if (i3 != 0) {
            int i4 = 99 / 0;
        }
        return zProvide;
    }

    static final class component3 {
        static final CostCalculatorViewModel_HiltModules_KeyModule_ProvideFactory ShareDataUIState = new CostCalculatorViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component1 = 1;
        private static int component3;

        private component3() {
        }

        static {
            int i = component1 + 115;
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
