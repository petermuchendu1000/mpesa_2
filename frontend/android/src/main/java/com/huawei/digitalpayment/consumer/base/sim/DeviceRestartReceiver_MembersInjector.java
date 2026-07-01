package com.huawei.digitalpayment.consumer.base.sim;

import dagger.MembersInjector;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class DeviceRestartReceiver_MembersInjector implements MembersInjector<DeviceRestartReceiver> {
    private static int component1 = 0;
    private static int component3 = 1;
    private final Provider<DeviceRestartManager> ShareDataUIState;

    @Override
    public void injectMembers(DeviceRestartReceiver deviceRestartReceiver) {
        int i = 2 % 2;
        int i2 = component1 + 119;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        injectMembers2(deviceRestartReceiver);
        if (i3 == 0) {
            throw null;
        }
        int i4 = component1 + 125;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    public DeviceRestartReceiver_MembersInjector(Provider<DeviceRestartManager> provider) {
        this.ShareDataUIState = provider;
    }

    public static MembersInjector<DeviceRestartReceiver> create(Provider<DeviceRestartManager> provider) {
        int i = 2 % 2;
        DeviceRestartReceiver_MembersInjector deviceRestartReceiver_MembersInjector = new DeviceRestartReceiver_MembersInjector(provider);
        int i2 = component3 + 77;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return deviceRestartReceiver_MembersInjector;
    }

    public static MembersInjector<DeviceRestartReceiver> create(javax.inject.Provider<DeviceRestartManager> provider) {
        int i = 2 % 2;
        DeviceRestartReceiver_MembersInjector deviceRestartReceiver_MembersInjector = new DeviceRestartReceiver_MembersInjector(Providers.asDaggerProvider(provider));
        int i2 = component3 + 15;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return deviceRestartReceiver_MembersInjector;
    }

    public void injectMembers2(DeviceRestartReceiver deviceRestartReceiver) {
        int i = 2 % 2;
        int i2 = component3 + 15;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        injectDeviceRestartManager(deviceRestartReceiver, this.ShareDataUIState.get());
        int i4 = component3 + 49;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static void injectDeviceRestartManager(DeviceRestartReceiver deviceRestartReceiver, DeviceRestartManager deviceRestartManager) {
        int i = 2 % 2;
        int i2 = component1 + 107;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        deviceRestartReceiver.deviceRestartManager = deviceRestartManager;
        int i4 = component1 + 29;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }
}
