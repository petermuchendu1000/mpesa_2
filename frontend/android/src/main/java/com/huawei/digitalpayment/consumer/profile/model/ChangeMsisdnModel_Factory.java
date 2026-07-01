package com.huawei.digitalpayment.consumer.profile.model;

import dagger.internal.Factory;

public final class ChangeMsisdnModel_Factory implements Factory<ChangeMsisdnModel> {
    private static int component1 = 0;
    private static int component3 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 101;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ChangeMsisdnModel changeMsisdnModel = get();
        int i4 = component1 + 93;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return changeMsisdnModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public ChangeMsisdnModel get() {
        int i = 2 % 2;
        int i2 = component3 + 121;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ChangeMsisdnModel changeMsisdnModelNewInstance = newInstance();
        int i4 = component1 + 65;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return changeMsisdnModelNewInstance;
        }
        throw null;
    }

    public static ChangeMsisdnModel_Factory create() {
        int i = 2 % 2;
        int i2 = component3 + 101;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ChangeMsisdnModel_Factory changeMsisdnModel_Factory = InstanceHolder.INSTANCE;
        int i4 = component3 + 49;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return changeMsisdnModel_Factory;
        }
        throw null;
    }

    public static ChangeMsisdnModel newInstance() {
        int i = 2 % 2;
        ChangeMsisdnModel changeMsisdnModel = new ChangeMsisdnModel();
        int i2 = component1 + 109;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return changeMsisdnModel;
    }

    static final class InstanceHolder {
        static final ChangeMsisdnModel_Factory INSTANCE = new ChangeMsisdnModel_Factory();
        private static int component1 = 0;
        private static int component2 = 1;

        private InstanceHolder() {
        }

        static {
            int i = component2 + 109;
            component1 = i % 128;
            int i2 = i % 2;
        }
    }
}
