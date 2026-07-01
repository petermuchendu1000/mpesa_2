package com.huawei.digitalpayment.consumer.fixeddata.data;

import dagger.internal.Factory;

public final class FixedDataRepositoryImpl_Factory implements Factory<FixedDataRepositoryImpl> {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 63;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FixedDataRepositoryImpl fixedDataRepositoryImpl = get();
        int i4 = ShareDataUIState + 63;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return fixedDataRepositoryImpl;
    }

    @Override
    public FixedDataRepositoryImpl get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 107;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return newInstance();
        }
        newInstance();
        throw null;
    }

    public static FixedDataRepositoryImpl_Factory create() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 121;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            FixedDataRepositoryImpl_Factory fixedDataRepositoryImpl_Factory = component2.component2;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        FixedDataRepositoryImpl_Factory fixedDataRepositoryImpl_Factory2 = component2.component2;
        int i3 = ShareDataUIState + 9;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return fixedDataRepositoryImpl_Factory2;
    }

    public static FixedDataRepositoryImpl newInstance() {
        int i = 2 % 2;
        FixedDataRepositoryImpl fixedDataRepositoryImpl = new FixedDataRepositoryImpl();
        int i2 = ShareDataUIState + 31;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return fixedDataRepositoryImpl;
        }
        throw null;
    }

    static final class component2 {
        private static int ShareDataUIState = 1;
        static final FixedDataRepositoryImpl_Factory component2 = new FixedDataRepositoryImpl_Factory();
        private static int copydefault;

        private component2() {
        }

        static {
            int i = ShareDataUIState + 93;
            copydefault = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
