package com.huawei.digitalpayment.checkout.model;

import dagger.internal.Factory;

public final class EasyCheckoutModel_Factory implements Factory<EasyCheckoutModel> {
    private static int component3 = 0;
    private static int copydefault = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 21;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        EasyCheckoutModel easyCheckoutModel = get();
        int i4 = component3 + 87;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return easyCheckoutModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public EasyCheckoutModel get() {
        int i = 2 % 2;
        int i2 = component3 + 21;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        EasyCheckoutModel easyCheckoutModelNewInstance = newInstance();
        int i4 = component3 + 121;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 72 / 0;
        }
        return easyCheckoutModelNewInstance;
    }

    public static EasyCheckoutModel_Factory create() {
        int i = 2 % 2;
        int i2 = copydefault + 9;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        EasyCheckoutModel_Factory easyCheckoutModel_Factory = component3.copydefault;
        if (i3 != 0) {
            int i4 = 36 / 0;
        }
        return easyCheckoutModel_Factory;
    }

    public static EasyCheckoutModel newInstance() {
        int i = 2 % 2;
        EasyCheckoutModel easyCheckoutModel = new EasyCheckoutModel();
        int i2 = copydefault + 53;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 91 / 0;
        }
        return easyCheckoutModel;
    }

    static final class component3 {
        private static int component1 = 0;
        private static int component3 = 1;
        static final EasyCheckoutModel_Factory copydefault = new EasyCheckoutModel_Factory();

        private component3() {
        }

        static {
            int i = component3 + 27;
            component1 = i % 128;
            int i2 = i % 2;
        }
    }
}
