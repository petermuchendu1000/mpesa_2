package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator;

import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorViewModel_HiltModules;
import dagger.internal.Factory;

public final class CostEstimatorViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 61;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = ShareDataUIState + 45;
        component2 = i4 % 128;
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
        int i2 = ShareDataUIState + 19;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = provide();
        if (i3 != 0) {
            return Boolean.valueOf(zProvide);
        }
        Boolean.valueOf(zProvide);
        throw null;
    }

    public static CostEstimatorViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        CostEstimatorViewModel_HiltModules_KeyModule_ProvideFactory costEstimatorViewModel_HiltModules_KeyModule_ProvideFactory = component2.component1;
        int i4 = component2 + 121;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return costEstimatorViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        boolean zProvide;
        int i = 2 % 2;
        int i2 = component2 + 65;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            zProvide = CostEstimatorViewModel_HiltModules.KeyModule.provide();
            int i3 = 70 / 0;
        } else {
            zProvide = CostEstimatorViewModel_HiltModules.KeyModule.provide();
        }
        int i4 = component2 + 7;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return zProvide;
        }
        throw null;
    }

    static final class component2 {
        private static int ShareDataUIState = 1;
        static final CostEstimatorViewModel_HiltModules_KeyModule_ProvideFactory component1 = new CostEstimatorViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component3;

        private component2() {
        }

        static {
            int i = ShareDataUIState + 63;
            component3 = i % 128;
            int i2 = i % 2;
        }
    }
}
