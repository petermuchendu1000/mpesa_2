package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout;

import dagger.internal.Factory;

public final class RoamingCashoutFeeCalculator_Factory implements Factory<RoamingCashoutFeeCalculator> {
    private static int component3 = 1;
    private static int copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 71;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return get();
        }
        get();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public RoamingCashoutFeeCalculator get() {
        int i = 2 % 2;
        int i2 = component3 + 55;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        RoamingCashoutFeeCalculator roamingCashoutFeeCalculatorNewInstance = newInstance();
        int i4 = copydefault + 55;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return roamingCashoutFeeCalculatorNewInstance;
        }
        throw null;
    }

    public static RoamingCashoutFeeCalculator_Factory create() {
        int i = 2 % 2;
        int i2 = component3 + 57;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        RoamingCashoutFeeCalculator_Factory roamingCashoutFeeCalculator_Factory = component1.component2;
        int i4 = copydefault + 109;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return roamingCashoutFeeCalculator_Factory;
        }
        throw null;
    }

    public static RoamingCashoutFeeCalculator newInstance() {
        int i = 2 % 2;
        RoamingCashoutFeeCalculator roamingCashoutFeeCalculator = new RoamingCashoutFeeCalculator();
        int i2 = copydefault + 21;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return roamingCashoutFeeCalculator;
    }

    static final class component1 {
        private static int ShareDataUIState = 1;
        static final RoamingCashoutFeeCalculator_Factory component2 = new RoamingCashoutFeeCalculator_Factory();
        private static int copydefault;

        private component1() {
        }

        static {
            int i = copydefault + 67;
            ShareDataUIState = i % 128;
            int i2 = i % 2;
        }
    }
}
