package com.huawei.digitalpayment.consumer.loginModule.register.data;

import dagger.internal.Factory;

public final class DefaultRegisterKycModel_Factory implements Factory<DefaultRegisterKycModel> {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;

    @Override
    public Object get() {
        DefaultRegisterKycModel defaultRegisterKycModel;
        int i = 2 % 2;
        int i2 = component3 + 61;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            defaultRegisterKycModel = get();
            int i3 = 86 / 0;
        } else {
            defaultRegisterKycModel = get();
        }
        int i4 = ShareDataUIState + 53;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return defaultRegisterKycModel;
    }

    @Override
    public DefaultRegisterKycModel get() {
        int i = 2 % 2;
        int i2 = component3 + 63;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return newInstance();
        }
        newInstance();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static DefaultRegisterKycModel_Factory create() {
        int i = 2 % 2;
        int i2 = component3 + 123;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DefaultRegisterKycModel_Factory defaultRegisterKycModel_Factory = ShareDataUIState.component2;
        int i4 = ShareDataUIState + 79;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return defaultRegisterKycModel_Factory;
    }

    public static DefaultRegisterKycModel newInstance() {
        int i = 2 % 2;
        DefaultRegisterKycModel defaultRegisterKycModel = new DefaultRegisterKycModel();
        int i2 = ShareDataUIState + 21;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return defaultRegisterKycModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class ShareDataUIState {
        private static int ShareDataUIState = 1;
        static final DefaultRegisterKycModel_Factory component2 = new DefaultRegisterKycModel_Factory();
        private static int copydefault;

        private ShareDataUIState() {
        }

        static {
            int i = ShareDataUIState + 119;
            copydefault = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }
}
