package com.huawei.digitalpayment.consumer.base.repository;

import dagger.internal.Factory;

public final class SimCardRemovalRepository_Factory implements Factory<SimCardRemovalRepository> {
    private static int component3 = 0;
    private static int copydefault = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 69;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        SimCardRemovalRepository simCardRemovalRepository = get();
        int i4 = copydefault + 9;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return simCardRemovalRepository;
    }

    @Override
    public SimCardRemovalRepository get() {
        int i = 2 % 2;
        int i2 = component3 + 13;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        SimCardRemovalRepository simCardRemovalRepositoryNewInstance = newInstance();
        int i4 = copydefault + 99;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return simCardRemovalRepositoryNewInstance;
    }

    public static SimCardRemovalRepository_Factory create() {
        int i = 2 % 2;
        int i2 = copydefault + 65;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        SimCardRemovalRepository_Factory simCardRemovalRepository_Factory = ShareDataUIState.copydefault;
        int i4 = component3 + 93;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return simCardRemovalRepository_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static SimCardRemovalRepository newInstance() {
        int i = 2 % 2;
        SimCardRemovalRepository simCardRemovalRepository = new SimCardRemovalRepository();
        int i2 = copydefault + 97;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return simCardRemovalRepository;
        }
        throw null;
    }

    static final class ShareDataUIState {
        private static int component1 = 1;
        private static int component3;
        static final SimCardRemovalRepository_Factory copydefault = new SimCardRemovalRepository_Factory();

        private ShareDataUIState() {
        }

        static {
            int i = component3 + 87;
            component1 = i % 128;
            int i2 = i % 2;
        }
    }
}
