package com.huawei.digitalpayment.consumer.fixeddata.data;

import dagger.internal.Factory;

public final class ManageAccountRepositoryImpl_Factory implements Factory<ManageAccountRepositoryImpl> {
    private static int component1 = 1;
    private static int component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 71;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            get();
            throw null;
        }
        ManageAccountRepositoryImpl manageAccountRepositoryImpl = get();
        int i3 = component2 + 17;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            return manageAccountRepositoryImpl;
        }
        obj.hashCode();
        throw null;
    }

    @Override
    public ManageAccountRepositoryImpl get() {
        int i = 2 % 2;
        int i2 = component1 + 117;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ManageAccountRepositoryImpl manageAccountRepositoryImplNewInstance = newInstance();
        int i4 = component1 + 75;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return manageAccountRepositoryImplNewInstance;
        }
        throw null;
    }

    public static ManageAccountRepositoryImpl_Factory create() {
        int i = 2 % 2;
        int i2 = component1 + 109;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ManageAccountRepositoryImpl_Factory manageAccountRepositoryImpl_Factory = ShareDataUIState.copydefault;
        if (i3 != 0) {
            int i4 = 84 / 0;
        }
        return manageAccountRepositoryImpl_Factory;
    }

    public static ManageAccountRepositoryImpl newInstance() {
        int i = 2 % 2;
        ManageAccountRepositoryImpl manageAccountRepositoryImpl = new ManageAccountRepositoryImpl();
        int i2 = component1 + 105;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return manageAccountRepositoryImpl;
    }

    static final class ShareDataUIState {
        private static int component1 = 0;
        private static int component2 = 1;
        static final ManageAccountRepositoryImpl_Factory copydefault = new ManageAccountRepositoryImpl_Factory();

        private ShareDataUIState() {
        }

        static {
            int i = component1 + 105;
            component2 = i % 128;
            if (i % 2 == 0) {
                int i2 = 34 / 0;
            }
        }
    }
}
