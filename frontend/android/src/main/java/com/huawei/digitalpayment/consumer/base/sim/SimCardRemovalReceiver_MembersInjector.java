package com.huawei.digitalpayment.consumer.base.sim;

import com.huawei.digitalpayment.consumer.base.repository.DeviceInfoRepository;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class SimCardRemovalReceiver_MembersInjector implements MembersInjector<SimCardRemovalReceiver> {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private final Provider<SimCardRemovalManager> component2;
    private final Provider<DeviceInfoRepository> copydefault;

    @Override
    public void injectMembers(SimCardRemovalReceiver simCardRemovalReceiver) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 77;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        injectMembers2(simCardRemovalReceiver);
        int i4 = ShareDataUIState + 25;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public SimCardRemovalReceiver_MembersInjector(Provider<DeviceInfoRepository> provider, Provider<SimCardRemovalManager> provider2) {
        this.copydefault = provider;
        this.component2 = provider2;
    }

    public static MembersInjector<SimCardRemovalReceiver> create(Provider<DeviceInfoRepository> provider, Provider<SimCardRemovalManager> provider2) {
        int i = 2 % 2;
        SimCardRemovalReceiver_MembersInjector simCardRemovalReceiver_MembersInjector = new SimCardRemovalReceiver_MembersInjector(provider, provider2);
        int i2 = ShareDataUIState + 37;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 22 / 0;
        }
        return simCardRemovalReceiver_MembersInjector;
    }

    public static MembersInjector<SimCardRemovalReceiver> create(javax.inject.Provider<DeviceInfoRepository> provider, javax.inject.Provider<SimCardRemovalManager> provider2) {
        int i = 2 % 2;
        SimCardRemovalReceiver_MembersInjector simCardRemovalReceiver_MembersInjector = new SimCardRemovalReceiver_MembersInjector(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
        int i2 = ShareDataUIState + 49;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return simCardRemovalReceiver_MembersInjector;
        }
        throw null;
    }

    public void injectMembers2(SimCardRemovalReceiver simCardRemovalReceiver) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 3;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            injectDeviceInfoRepository(simCardRemovalReceiver, this.copydefault.get());
            injectSimCardRemovalManager(simCardRemovalReceiver, this.component2.get());
        } else {
            injectDeviceInfoRepository(simCardRemovalReceiver, this.copydefault.get());
            injectSimCardRemovalManager(simCardRemovalReceiver, this.component2.get());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static void injectDeviceInfoRepository(SimCardRemovalReceiver simCardRemovalReceiver, DeviceInfoRepository deviceInfoRepository) {
        int i = 2 % 2;
        int i2 = component1 + 43;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        simCardRemovalReceiver.deviceInfoRepository = deviceInfoRepository;
        int i4 = ShareDataUIState + 59;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static void injectSimCardRemovalManager(SimCardRemovalReceiver simCardRemovalReceiver, SimCardRemovalManager simCardRemovalManager) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 101;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        simCardRemovalReceiver.simCardRemovalManager = simCardRemovalManager;
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = ShareDataUIState + 43;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 62 / 0;
        }
    }
}
