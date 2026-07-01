package com.huawei.digitalpayment.consumer.scan.model;

import dagger.internal.Factory;

public final class DefaultScanModel_Factory implements Factory<DefaultScanModel> {
    private static int component2 = 0;
    private static int component3 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 41;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DefaultScanModel defaultScanModel = get();
        int i4 = component2 + 99;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return defaultScanModel;
    }

    @Override
    public DefaultScanModel get() {
        int i = 2 % 2;
        int i2 = component2 + 21;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DefaultScanModel defaultScanModelNewInstance = newInstance();
        int i4 = component2 + 19;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return defaultScanModelNewInstance;
    }

    public static DefaultScanModel_Factory create() {
        int i = 2 % 2;
        int i2 = component2 + 1;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DefaultScanModel_Factory defaultScanModel_Factory = ShareDataUIState.component1;
        int i4 = component3 + 99;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return defaultScanModel_Factory;
    }

    public static DefaultScanModel newInstance() {
        int i = 2 % 2;
        DefaultScanModel defaultScanModel = new DefaultScanModel();
        int i2 = component2 + 3;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return defaultScanModel;
    }

    static final class ShareDataUIState {
        static final DefaultScanModel_Factory component1 = new DefaultScanModel_Factory();
        private static int component2 = 1;
        private static int copydefault;

        private ShareDataUIState() {
        }

        static {
            int i = copydefault + 81;
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
