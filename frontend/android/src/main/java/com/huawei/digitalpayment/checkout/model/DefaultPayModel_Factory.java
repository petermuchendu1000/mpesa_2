package com.huawei.digitalpayment.checkout.model;

import dagger.internal.Factory;

public final class DefaultPayModel_Factory implements Factory<DefaultPayModel> {
    private static int ShareDataUIState = 1;
    private static int component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 13;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DefaultPayModel defaultPayModel = get();
        int i4 = component3 + 73;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return defaultPayModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public DefaultPayModel get() {
        int i = 2 % 2;
        int i2 = component3 + 111;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DefaultPayModel defaultPayModelNewInstance = newInstance();
        int i4 = ShareDataUIState + 99;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return defaultPayModelNewInstance;
    }

    public static DefaultPayModel_Factory create() {
        int i = 2 % 2;
        int i2 = component3 + 95;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DefaultPayModel_Factory defaultPayModel_Factory = component1.component2;
        if (i3 != 0) {
            return defaultPayModel_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static DefaultPayModel newInstance() {
        int i = 2 % 2;
        DefaultPayModel defaultPayModel = new DefaultPayModel();
        int i2 = ShareDataUIState + 87;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return defaultPayModel;
    }

    static final class component1 {
        private static int component1 = 0;
        static final DefaultPayModel_Factory component2 = new DefaultPayModel_Factory();
        private static int copydefault = 1;

        private component1() {
        }

        static {
            int i = component1 + 3;
            copydefault = i % 128;
            int i2 = i % 2;
        }
    }
}
