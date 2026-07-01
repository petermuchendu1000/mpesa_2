package com.huawei.digitalpayment.consumer.fixeddata.data;

import dagger.internal.Factory;

public final class HomeWirelessRepositoryImpl_Factory implements Factory<HomeWirelessRepositoryImpl> {
    private static int ShareDataUIState = 1;
    private static int component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 125;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        HomeWirelessRepositoryImpl homeWirelessRepositoryImpl = get();
        int i4 = component2 + 81;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return homeWirelessRepositoryImpl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public HomeWirelessRepositoryImpl get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 27;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        HomeWirelessRepositoryImpl homeWirelessRepositoryImplNewInstance = newInstance();
        int i4 = component2 + 69;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 9 / 0;
        }
        return homeWirelessRepositoryImplNewInstance;
    }

    public static HomeWirelessRepositoryImpl_Factory create() {
        int i = 2 % 2;
        int i2 = component2 + 123;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        HomeWirelessRepositoryImpl_Factory homeWirelessRepositoryImpl_Factory = copydefault.component1;
        int i4 = component2 + 71;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return homeWirelessRepositoryImpl_Factory;
    }

    public static HomeWirelessRepositoryImpl newInstance() {
        int i = 2 % 2;
        HomeWirelessRepositoryImpl homeWirelessRepositoryImpl = new HomeWirelessRepositoryImpl();
        int i2 = component2 + 53;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return homeWirelessRepositoryImpl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class copydefault {
        static final HomeWirelessRepositoryImpl_Factory component1 = new HomeWirelessRepositoryImpl_Factory();
        private static int component2 = 0;
        private static int copydefault = 1;

        private copydefault() {
        }

        static {
            int i = component2 + 37;
            copydefault = i % 128;
            int i2 = i % 2;
        }
    }
}
