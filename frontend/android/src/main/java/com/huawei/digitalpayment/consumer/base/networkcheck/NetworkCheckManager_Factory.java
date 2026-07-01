package com.huawei.digitalpayment.consumer.base.networkcheck;

import dagger.internal.Factory;

public final class NetworkCheckManager_Factory implements Factory<NetworkCheckManager> {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 19;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return get();
        }
        get();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public NetworkCheckManager get() {
        int i = 2 % 2;
        int i2 = component2 + 63;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        NetworkCheckManager networkCheckManagerNewInstance = newInstance();
        int i4 = component2 + 95;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return networkCheckManagerNewInstance;
        }
        throw null;
    }

    public static NetworkCheckManager_Factory create() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 71;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        NetworkCheckManager_Factory networkCheckManager_Factory = component2.component2;
        int i4 = ShareDataUIState + 45;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return networkCheckManager_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static NetworkCheckManager newInstance() {
        int i = 2 % 2;
        NetworkCheckManager networkCheckManager = new NetworkCheckManager();
        int i2 = component2 + 41;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return networkCheckManager;
    }

    static final class component2 {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        static final NetworkCheckManager_Factory component2 = new NetworkCheckManager_Factory();

        private component2() {
        }

        static {
            int i = component1 + 81;
            ShareDataUIState = i % 128;
            int i2 = i % 2;
        }
    }
}
