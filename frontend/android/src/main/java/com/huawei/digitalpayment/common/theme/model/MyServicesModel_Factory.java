package com.huawei.digitalpayment.common.theme.model;

import dagger.internal.Factory;

public final class MyServicesModel_Factory implements Factory<MyServicesModel> {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 79;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        MyServicesModel myServicesModel = get();
        int i4 = component2 + 85;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return myServicesModel;
    }

    @Override
    public MyServicesModel get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 15;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        MyServicesModel myServicesModelNewInstance = newInstance();
        int i4 = component2 + 121;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return myServicesModelNewInstance;
        }
        throw null;
    }

    public static MyServicesModel_Factory create() {
        int i = 2 % 2;
        int i2 = component2 + 11;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        MyServicesModel_Factory myServicesModel_Factory = ShareDataUIState.component3;
        int i4 = component2 + 115;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return myServicesModel_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static MyServicesModel newInstance() {
        int i = 2 % 2;
        MyServicesModel myServicesModel = new MyServicesModel();
        int i2 = ShareDataUIState + 3;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 31 / 0;
        }
        return myServicesModel;
    }

    static final class ShareDataUIState {
        private static int component1 = 0;
        private static int component2 = 1;
        static final MyServicesModel_Factory component3 = new MyServicesModel_Factory();

        private ShareDataUIState() {
        }

        static {
            int i = component1 + 119;
            component2 = i % 128;
            int i2 = i % 2;
        }
    }
}
