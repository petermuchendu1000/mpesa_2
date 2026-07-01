package com.huawei.digitalpayment.consumer.loginModule.mpin.data;

import dagger.internal.Factory;

public final class GetTokenModel_Factory implements Factory<GetTokenModel> {
    private static int component2 = 1;
    private static int component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 119;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        GetTokenModel getTokenModel = get();
        if (i3 != 0) {
            int i4 = 93 / 0;
        }
        return getTokenModel;
    }

    @Override
    public GetTokenModel get() {
        int i = 2 % 2;
        int i2 = component3 + 51;
        component2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            newInstance();
            obj.hashCode();
            throw null;
        }
        GetTokenModel getTokenModelNewInstance = newInstance();
        int i3 = component2 + 59;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            return getTokenModelNewInstance;
        }
        throw null;
    }

    public static GetTokenModel_Factory create() {
        int i = 2 % 2;
        int i2 = component3 + 15;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        GetTokenModel_Factory getTokenModel_Factory = component3.copydefault;
        int i4 = component3 + 13;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return getTokenModel_Factory;
    }

    public static GetTokenModel newInstance() {
        int i = 2 % 2;
        GetTokenModel getTokenModel = new GetTokenModel();
        int i2 = component3 + 91;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return getTokenModel;
    }

    static final class component3 {
        private static int component1 = 0;
        private static int component2 = 1;
        static final GetTokenModel_Factory copydefault = new GetTokenModel_Factory();

        private component3() {
        }

        static {
            int i = component1 + 47;
            component2 = i % 128;
            int i2 = i % 2;
        }
    }
}
