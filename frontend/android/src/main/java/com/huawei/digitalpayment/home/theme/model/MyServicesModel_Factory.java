package com.huawei.digitalpayment.home.theme.model;

import dagger.internal.Factory;

public final class MyServicesModel_Factory implements Factory<MyServicesModel> {
    private static int ShareDataUIState = 1;
    private static int component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 77;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        MyServicesModel myServicesModel = get();
        int i4 = ShareDataUIState + 85;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return myServicesModel;
        }
        throw null;
    }

    @Override
    public MyServicesModel get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return newInstance();
        }
        newInstance();
        throw null;
    }

    public static MyServicesModel_Factory create() {
        int i = 2 % 2;
        int i2 = component3 + 77;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        MyServicesModel_Factory myServicesModel_Factory = component2.copydefault;
        if (i3 == 0) {
            int i4 = 65 / 0;
        }
        return myServicesModel_Factory;
    }

    public static MyServicesModel newInstance() {
        int i = 2 % 2;
        MyServicesModel myServicesModel = new MyServicesModel();
        int i2 = ShareDataUIState + 93;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return myServicesModel;
    }

    static final class component2 {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;
        static final MyServicesModel_Factory copydefault = new MyServicesModel_Factory();

        private component2() {
        }

        static {
            int i = component2 + 21;
            ShareDataUIState = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
