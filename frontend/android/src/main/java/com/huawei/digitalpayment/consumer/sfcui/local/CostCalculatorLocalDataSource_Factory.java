package com.huawei.digitalpayment.consumer.sfcui.local;

import dagger.internal.Factory;

public final class CostCalculatorLocalDataSource_Factory implements Factory<CostCalculatorLocalDataSource> {
    private static int component1 = 0;
    private static int copydefault = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 117;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        CostCalculatorLocalDataSource costCalculatorLocalDataSource = get();
        int i4 = copydefault + 117;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return costCalculatorLocalDataSource;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public CostCalculatorLocalDataSource get() {
        int i = 2 % 2;
        int i2 = copydefault + 1;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        CostCalculatorLocalDataSource costCalculatorLocalDataSourceNewInstance = newInstance();
        if (i3 != 0) {
            int i4 = 24 / 0;
        }
        return costCalculatorLocalDataSourceNewInstance;
    }

    public static CostCalculatorLocalDataSource_Factory create() {
        int i = 2 % 2;
        int i2 = component1 + 55;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        CostCalculatorLocalDataSource_Factory costCalculatorLocalDataSource_Factory = component1.component3;
        if (i3 == 0) {
            int i4 = 98 / 0;
        }
        return costCalculatorLocalDataSource_Factory;
    }

    public static CostCalculatorLocalDataSource newInstance() {
        int i = 2 % 2;
        CostCalculatorLocalDataSource costCalculatorLocalDataSource = new CostCalculatorLocalDataSource();
        int i2 = component1 + 63;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return costCalculatorLocalDataSource;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class component1 {
        private static int component1 = 0;
        static final CostCalculatorLocalDataSource_Factory component3 = new CostCalculatorLocalDataSource_Factory();
        private static int copydefault = 1;

        private component1() {
        }

        static {
            int i = component1 + 85;
            copydefault = i % 128;
            int i2 = i % 2;
        }
    }
}
