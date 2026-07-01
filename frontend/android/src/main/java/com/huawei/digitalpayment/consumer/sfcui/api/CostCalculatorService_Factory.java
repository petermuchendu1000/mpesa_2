package com.huawei.digitalpayment.consumer.sfcui.api;

import dagger.internal.Factory;

public final class CostCalculatorService_Factory implements Factory<CostCalculatorService> {
    private static int component3 = 0;
    private static int copydefault = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 31;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        CostCalculatorService costCalculatorService = get();
        int i4 = copydefault + 67;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return costCalculatorService;
    }

    @Override
    public CostCalculatorService get() {
        CostCalculatorService costCalculatorServiceNewInstance;
        int i = 2 % 2;
        int i2 = component3 + 75;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            costCalculatorServiceNewInstance = newInstance();
            int i3 = 6 / 0;
        } else {
            costCalculatorServiceNewInstance = newInstance();
        }
        int i4 = component3 + 59;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return costCalculatorServiceNewInstance;
    }

    public static CostCalculatorService_Factory create() {
        CostCalculatorService_Factory costCalculatorService_Factory;
        int i = 2 % 2;
        int i2 = component3 + 17;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            costCalculatorService_Factory = ShareDataUIState.component3;
            int i3 = 64 / 0;
        } else {
            costCalculatorService_Factory = ShareDataUIState.component3;
        }
        int i4 = copydefault + 93;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return costCalculatorService_Factory;
    }

    public static CostCalculatorService newInstance() {
        int i = 2 % 2;
        CostCalculatorService costCalculatorService = new CostCalculatorService();
        int i2 = copydefault + 29;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return costCalculatorService;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class ShareDataUIState {
        private static int component1 = 1;
        private static int component2;
        static final CostCalculatorService_Factory component3 = new CostCalculatorService_Factory();

        private ShareDataUIState() {
        }

        static {
            int i = component2 + 117;
            component1 = i % 128;
            int i2 = i % 2;
        }
    }
}
