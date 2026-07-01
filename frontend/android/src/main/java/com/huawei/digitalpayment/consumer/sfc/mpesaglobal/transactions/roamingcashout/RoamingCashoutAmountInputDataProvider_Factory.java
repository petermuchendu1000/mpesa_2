package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout;

import dagger.internal.Factory;

public final class RoamingCashoutAmountInputDataProvider_Factory implements Factory<RoamingCashoutAmountInputDataProvider> {
    private static int component1 = 0;
    private static int component2 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 5;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        RoamingCashoutAmountInputDataProvider roamingCashoutAmountInputDataProvider = get();
        int i4 = component2 + 83;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return roamingCashoutAmountInputDataProvider;
    }

    @Override
    public RoamingCashoutAmountInputDataProvider get() {
        int i = 2 % 2;
        int i2 = component1 + 25;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        RoamingCashoutAmountInputDataProvider roamingCashoutAmountInputDataProviderNewInstance = newInstance();
        int i4 = component2 + 65;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 42 / 0;
        }
        return roamingCashoutAmountInputDataProviderNewInstance;
    }

    public static RoamingCashoutAmountInputDataProvider_Factory create() {
        int i = 2 % 2;
        int i2 = component2 + 55;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        RoamingCashoutAmountInputDataProvider_Factory roamingCashoutAmountInputDataProvider_Factory = copydefault.component1;
        int i4 = component1 + 45;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 6 / 0;
        }
        return roamingCashoutAmountInputDataProvider_Factory;
    }

    public static RoamingCashoutAmountInputDataProvider newInstance() {
        int i = 2 % 2;
        RoamingCashoutAmountInputDataProvider roamingCashoutAmountInputDataProvider = new RoamingCashoutAmountInputDataProvider();
        int i2 = component1 + 93;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return roamingCashoutAmountInputDataProvider;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class copydefault {
        private static int ShareDataUIState = 1;
        static final RoamingCashoutAmountInputDataProvider_Factory component1 = new RoamingCashoutAmountInputDataProvider_Factory();
        private static int component3;

        private copydefault() {
        }

        static {
            int i = ShareDataUIState + 57;
            component3 = i % 128;
            int i2 = i % 2;
        }
    }
}
