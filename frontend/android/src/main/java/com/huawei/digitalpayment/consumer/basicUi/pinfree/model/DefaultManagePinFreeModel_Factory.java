package com.huawei.digitalpayment.consumer.basicUi.pinfree.model;

import dagger.internal.Factory;

public final class DefaultManagePinFreeModel_Factory implements Factory<DefaultManagePinFreeModel> {
    private static int component2 = 1;
    private static int component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 45;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DefaultManagePinFreeModel defaultManagePinFreeModel = get();
        int i4 = component3 + 67;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return defaultManagePinFreeModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public DefaultManagePinFreeModel get() {
        int i = 2 % 2;
        int i2 = component2 + 105;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return newInstance();
        }
        newInstance();
        throw null;
    }

    public static DefaultManagePinFreeModel_Factory create() {
        int i = 2 % 2;
        int i2 = component2 + 115;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DefaultManagePinFreeModel_Factory defaultManagePinFreeModel_Factory = ShareDataUIState.component2;
        int i4 = component2 + 19;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return defaultManagePinFreeModel_Factory;
    }

    public static DefaultManagePinFreeModel newInstance() {
        int i = 2 % 2;
        DefaultManagePinFreeModel defaultManagePinFreeModel = new DefaultManagePinFreeModel();
        int i2 = component2 + 89;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return defaultManagePinFreeModel;
    }

    static final class ShareDataUIState {
        private static int ShareDataUIState = 1;
        private static int component1;
        static final DefaultManagePinFreeModel_Factory component2 = new DefaultManagePinFreeModel_Factory();

        private ShareDataUIState() {
        }

        static {
            int i = ShareDataUIState + 81;
            component1 = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
