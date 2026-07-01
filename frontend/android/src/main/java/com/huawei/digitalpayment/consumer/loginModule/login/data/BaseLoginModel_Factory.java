package com.huawei.digitalpayment.consumer.loginModule.login.data;

import dagger.internal.Factory;

public final class BaseLoginModel_Factory implements Factory<BaseLoginModel> {
    private static int component2 = 0;
    private static int component3 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 65;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return get();
        }
        get();
        throw null;
    }

    @Override
    public BaseLoginModel get() {
        int i = 2 % 2;
        int i2 = component3 + 1;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            newInstance();
            throw null;
        }
        BaseLoginModel baseLoginModelNewInstance = newInstance();
        int i3 = component3 + 121;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            return baseLoginModelNewInstance;
        }
        throw null;
    }

    public static BaseLoginModel_Factory create() {
        int i = 2 % 2;
        int i2 = component3 + 55;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        BaseLoginModel_Factory baseLoginModel_Factory = component1.copydefault;
        int i4 = component2 + 79;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return baseLoginModel_Factory;
    }

    public static BaseLoginModel newInstance() {
        int i = 2 % 2;
        BaseLoginModel baseLoginModel = new BaseLoginModel();
        int i2 = component3 + 31;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 3 / 0;
        }
        return baseLoginModel;
    }

    static final class component1 {
        private static int ShareDataUIState = 1;
        private static int component2;
        static final BaseLoginModel_Factory copydefault = new BaseLoginModel_Factory();

        private component1() {
        }

        static {
            int i = ShareDataUIState + 67;
            component2 = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
