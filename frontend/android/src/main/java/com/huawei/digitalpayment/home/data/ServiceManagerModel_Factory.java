package com.huawei.digitalpayment.home.data;

import dagger.internal.Factory;

public final class ServiceManagerModel_Factory implements Factory<ServiceManagerModel> {
    private static int component1 = 0;
    private static int copydefault = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 65;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            get();
            throw null;
        }
        ServiceManagerModel serviceManagerModel = get();
        int i3 = copydefault + 119;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return serviceManagerModel;
    }

    @Override
    public ServiceManagerModel get() {
        ServiceManagerModel serviceManagerModelNewInstance;
        int i = 2 % 2;
        int i2 = copydefault + 11;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            serviceManagerModelNewInstance = newInstance();
            int i3 = 94 / 0;
        } else {
            serviceManagerModelNewInstance = newInstance();
        }
        int i4 = copydefault + 61;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return serviceManagerModelNewInstance;
    }

    public static ServiceManagerModel_Factory create() {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ServiceManagerModel_Factory serviceManagerModel_Factory = component2.component1;
        int i4 = component1 + 87;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return serviceManagerModel_Factory;
    }

    public static ServiceManagerModel newInstance() {
        int i = 2 % 2;
        ServiceManagerModel serviceManagerModel = new ServiceManagerModel();
        int i2 = copydefault + 5;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 83 / 0;
        }
        return serviceManagerModel;
    }

    static final class component2 {
        static final ServiceManagerModel_Factory component1 = new ServiceManagerModel_Factory();
        private static int component3 = 1;
        private static int copydefault;

        private component2() {
        }

        static {
            int i = copydefault + 125;
            component3 = i % 128;
            int i2 = i % 2;
        }
    }
}
