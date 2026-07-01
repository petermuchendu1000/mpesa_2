package com.huawei.digitalpayment.consumer.basicUi.model;

import dagger.internal.Factory;

public final class PaySettingModel_Factory implements Factory<PaySettingModel> {
    private static int component2 = 1;
    private static int copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 41;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return get();
        }
        get();
        throw null;
    }

    @Override
    public PaySettingModel get() {
        int i = 2 % 2;
        int i2 = component2 + 71;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return newInstance();
        }
        newInstance();
        throw null;
    }

    public static PaySettingModel_Factory create() {
        int i = 2 % 2;
        int i2 = copydefault + 101;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        PaySettingModel_Factory paySettingModel_Factory = ShareDataUIState.component1;
        if (i3 != 0) {
            return paySettingModel_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static PaySettingModel newInstance() {
        int i = 2 % 2;
        PaySettingModel paySettingModel = new PaySettingModel();
        int i2 = component2 + 97;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return paySettingModel;
    }

    static final class ShareDataUIState {
        private static int ShareDataUIState = 0;
        static final PaySettingModel_Factory component1 = new PaySettingModel_Factory();
        private static int component3 = 1;

        private ShareDataUIState() {
        }

        static {
            int i = ShareDataUIState + 107;
            component3 = i % 128;
            int i2 = i % 2;
        }
    }
}
