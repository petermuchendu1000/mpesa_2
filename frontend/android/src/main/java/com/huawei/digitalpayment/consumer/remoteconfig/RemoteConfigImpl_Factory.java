package com.huawei.digitalpayment.consumer.remoteconfig;

import dagger.internal.Factory;

public final class RemoteConfigImpl_Factory implements Factory<RemoteConfigImpl> {
    private static int component1 = 0;
    private static int component3 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 25;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        RemoteConfigImpl remoteConfigImpl = get();
        int i4 = component3 + 81;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return remoteConfigImpl;
    }

    @Override
    public RemoteConfigImpl get() {
        int i = 2 % 2;
        int i2 = component1 + 91;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        RemoteConfigImpl remoteConfigImplNewInstance = newInstance();
        int i4 = component3 + 3;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
        return remoteConfigImplNewInstance;
    }

    public static RemoteConfigImpl_Factory create() {
        int i = 2 % 2;
        int i2 = component1 + 93;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        RemoteConfigImpl_Factory remoteConfigImpl_Factory = ShareDataUIState.component2;
        int i4 = component3 + 11;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return remoteConfigImpl_Factory;
    }

    public static RemoteConfigImpl newInstance() {
        int i = 2 % 2;
        RemoteConfigImpl remoteConfigImpl = new RemoteConfigImpl();
        int i2 = component1 + 69;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return remoteConfigImpl;
        }
        throw null;
    }

    static final class ShareDataUIState {
        private static int ShareDataUIState = 1;
        private static int component1;
        static final RemoteConfigImpl_Factory component2 = new RemoteConfigImpl_Factory();

        private ShareDataUIState() {
        }

        static {
            int i = component1 + 87;
            ShareDataUIState = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }
}
