package com.huawei.digitalpayment.consumer.basicUi.model;

import dagger.internal.Factory;

public final class DefaultAboutModel_Factory implements Factory<DefaultAboutModel> {
    private static int component1 = 0;
    private static int component3 = 1;

    @Override
    public Object get() {
        DefaultAboutModel defaultAboutModel;
        int i = 2 % 2;
        int i2 = component3 + 79;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            defaultAboutModel = get();
            int i3 = 62 / 0;
        } else {
            defaultAboutModel = get();
        }
        int i4 = component1 + 47;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return defaultAboutModel;
    }

    @Override
    public DefaultAboutModel get() {
        int i = 2 % 2;
        int i2 = component1 + 83;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return newInstance();
        }
        newInstance();
        throw null;
    }

    public static DefaultAboutModel_Factory create() {
        int i = 2 % 2;
        int i2 = component1 + 89;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DefaultAboutModel_Factory defaultAboutModel_Factory = copydefault.component2;
        if (i3 == 0) {
            int i4 = 16 / 0;
        }
        return defaultAboutModel_Factory;
    }

    public static DefaultAboutModel newInstance() {
        int i = 2 % 2;
        DefaultAboutModel defaultAboutModel = new DefaultAboutModel();
        int i2 = component3 + 49;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 82 / 0;
        }
        return defaultAboutModel;
    }

    static final class copydefault {
        static final DefaultAboutModel_Factory component2 = new DefaultAboutModel_Factory();
        private static int component3 = 1;
        private static int copydefault;

        private copydefault() {
        }

        static {
            int i = copydefault + 95;
            component3 = i % 128;
            int i2 = i % 2;
        }
    }
}
