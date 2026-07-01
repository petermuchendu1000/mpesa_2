package com.huawei.digitalpayment.consumer.loginModule.register.data;

import dagger.internal.Factory;

public final class ResetPinModel_Factory implements Factory<ResetPinModel> {
    private static int component1 = 0;
    private static int copydefault = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 123;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return get();
        }
        get();
        throw null;
    }

    @Override
    public ResetPinModel get() {
        int i = 2 % 2;
        int i2 = component1 + 91;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return newInstance();
        }
        newInstance();
        throw null;
    }

    public static ResetPinModel_Factory create() {
        int i = 2 % 2;
        int i2 = component1 + 71;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ResetPinModel_Factory resetPinModel_Factory = copydefault.component2;
        int i4 = component1 + 21;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return resetPinModel_Factory;
    }

    public static ResetPinModel newInstance() {
        int i = 2 % 2;
        ResetPinModel resetPinModel = new ResetPinModel();
        int i2 = component1 + 41;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return resetPinModel;
    }

    static final class copydefault {
        private static int ShareDataUIState = 1;
        static final ResetPinModel_Factory component2 = new ResetPinModel_Factory();
        private static int copydefault;

        private copydefault() {
        }

        static {
            int i = ShareDataUIState + 9;
            copydefault = i % 128;
            int i2 = i % 2;
        }
    }
}
