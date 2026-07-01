package com.huawei.digitalpayment.checkout.model;

import dagger.internal.Factory;

public final class PayResultModel_Factory implements Factory<PayResultModel> {
    private static int component1 = 1;
    private static int copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 5;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return get();
        }
        get();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public PayResultModel get() {
        int i = 2 % 2;
        int i2 = copydefault + 37;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        PayResultModel payResultModelNewInstance = newInstance();
        int i4 = component1 + 67;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return payResultModelNewInstance;
    }

    public static PayResultModel_Factory create() {
        int i = 2 % 2;
        int i2 = copydefault + 85;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        PayResultModel_Factory payResultModel_Factory = component2.ShareDataUIState;
        int i4 = component1 + 51;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return payResultModel_Factory;
        }
        throw null;
    }

    public static PayResultModel newInstance() {
        int i = 2 % 2;
        PayResultModel payResultModel = new PayResultModel();
        int i2 = component1 + 103;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return payResultModel;
        }
        throw null;
    }

    static final class component2 {
        static final PayResultModel_Factory ShareDataUIState = new PayResultModel_Factory();
        private static int component2 = 1;
        private static int component3;

        private component2() {
        }

        static {
            int i = component3 + 51;
            component2 = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
