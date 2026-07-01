package com.huawei.digitalpayment.consumer.loginModule.login.model;

import dagger.internal.Factory;

public final class LoginInfoRemote_Factory implements Factory<LoginInfoRemote> {
    private static int component1 = 0;
    private static int copydefault = 1;

    @Override
    public Object get() {
        LoginInfoRemote loginInfoRemote;
        int i = 2 % 2;
        int i2 = component1 + 35;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            loginInfoRemote = get();
            int i3 = 68 / 0;
        } else {
            loginInfoRemote = get();
        }
        int i4 = copydefault + 57;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return loginInfoRemote;
    }

    @Override
    public LoginInfoRemote get() {
        int i = 2 % 2;
        int i2 = copydefault + 11;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        LoginInfoRemote loginInfoRemoteNewInstance = newInstance();
        if (i3 != 0) {
            int i4 = 82 / 0;
        }
        return loginInfoRemoteNewInstance;
    }

    public static LoginInfoRemote_Factory create() {
        int i = 2 % 2;
        int i2 = component1 + 107;
        copydefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            LoginInfoRemote_Factory loginInfoRemote_Factory = component1.component2;
            obj.hashCode();
            throw null;
        }
        LoginInfoRemote_Factory loginInfoRemote_Factory2 = component1.component2;
        int i3 = copydefault + 63;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            return loginInfoRemote_Factory2;
        }
        obj.hashCode();
        throw null;
    }

    public static LoginInfoRemote newInstance() {
        int i = 2 % 2;
        LoginInfoRemote loginInfoRemote = new LoginInfoRemote();
        int i2 = component1 + 95;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return loginInfoRemote;
        }
        throw null;
    }

    static final class component1 {
        private static int ShareDataUIState = 1;
        static final LoginInfoRemote_Factory component2 = new LoginInfoRemote_Factory();
        private static int component3;

        private component1() {
        }

        static {
            int i = component3 + 3;
            ShareDataUIState = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }
}
