package com.huawei.digitalpayment.consumer.base.sim;

import com.huawei.digitalpayment.consumer.base.repository.DeviceRestartRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class DeviceRestartManager_Factory implements Factory<DeviceRestartManager> {
    private static int ShareDataUIState = 1;
    private static int component1;
    private final Provider<DeviceRestartRepository> component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 75;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DeviceRestartManager deviceRestartManager = get();
        if (i3 != 0) {
            int i4 = 43 / 0;
        }
        return deviceRestartManager;
    }

    public DeviceRestartManager_Factory(Provider<DeviceRestartRepository> provider) {
        this.component3 = provider;
    }

    @Override
    public DeviceRestartManager get() {
        DeviceRestartManager deviceRestartManagerNewInstance;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 7;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            deviceRestartManagerNewInstance = newInstance(this.component3.get());
            int i3 = 5 / 0;
        } else {
            deviceRestartManagerNewInstance = newInstance(this.component3.get());
        }
        int i4 = ShareDataUIState + 55;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return deviceRestartManagerNewInstance;
    }

    public static DeviceRestartManager_Factory create(javax.inject.Provider<DeviceRestartRepository> provider) {
        int i = 2 % 2;
        DeviceRestartManager_Factory deviceRestartManager_Factory = new DeviceRestartManager_Factory(Providers.asDaggerProvider(provider));
        int i2 = ShareDataUIState + 59;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 36 / 0;
        }
        return deviceRestartManager_Factory;
    }

    public static DeviceRestartManager_Factory create(Provider<DeviceRestartRepository> provider) {
        int i = 2 % 2;
        DeviceRestartManager_Factory deviceRestartManager_Factory = new DeviceRestartManager_Factory(provider);
        int i2 = component1 + 11;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return deviceRestartManager_Factory;
    }

    public static DeviceRestartManager newInstance(DeviceRestartRepository deviceRestartRepository) {
        int i = 2 % 2;
        DeviceRestartManager deviceRestartManager = new DeviceRestartManager(deviceRestartRepository);
        int i2 = ShareDataUIState + 29;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return deviceRestartManager;
    }
}
