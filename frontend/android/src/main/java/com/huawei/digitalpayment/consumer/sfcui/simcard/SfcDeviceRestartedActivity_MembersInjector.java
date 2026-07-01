package com.huawei.digitalpayment.consumer.sfcui.simcard;

import com.huawei.digitalpayment.consumer.base.sim.DeviceRestartManager;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class SfcDeviceRestartedActivity_MembersInjector implements MembersInjector<SfcDeviceRestartedActivity> {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private final Provider<DeviceRestartManager> copydefault;

    @Override
    public void injectMembers(SfcDeviceRestartedActivity sfcDeviceRestartedActivity) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        injectMembers2(sfcDeviceRestartedActivity);
        int i4 = ShareDataUIState + 3;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 1 / 0;
        }
    }

    public SfcDeviceRestartedActivity_MembersInjector(Provider<DeviceRestartManager> provider) {
        this.copydefault = provider;
    }

    public static MembersInjector<SfcDeviceRestartedActivity> create(Provider<DeviceRestartManager> provider) {
        int i = 2 % 2;
        SfcDeviceRestartedActivity_MembersInjector sfcDeviceRestartedActivity_MembersInjector = new SfcDeviceRestartedActivity_MembersInjector(provider);
        int i2 = ShareDataUIState + 39;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return sfcDeviceRestartedActivity_MembersInjector;
        }
        throw null;
    }

    public static MembersInjector<SfcDeviceRestartedActivity> create(javax.inject.Provider<DeviceRestartManager> provider) {
        int i = 2 % 2;
        SfcDeviceRestartedActivity_MembersInjector sfcDeviceRestartedActivity_MembersInjector = new SfcDeviceRestartedActivity_MembersInjector(Providers.asDaggerProvider(provider));
        int i2 = component3 + 117;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return sfcDeviceRestartedActivity_MembersInjector;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void injectMembers2(SfcDeviceRestartedActivity sfcDeviceRestartedActivity) {
        int i = 2 % 2;
        int i2 = component3 + 39;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        injectDeviceRestartManager(sfcDeviceRestartedActivity, this.copydefault.get());
        int i4 = ShareDataUIState + 19;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void injectDeviceRestartManager(SfcDeviceRestartedActivity sfcDeviceRestartedActivity, DeviceRestartManager deviceRestartManager) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        sfcDeviceRestartedActivity.deviceRestartManager = deviceRestartManager;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
