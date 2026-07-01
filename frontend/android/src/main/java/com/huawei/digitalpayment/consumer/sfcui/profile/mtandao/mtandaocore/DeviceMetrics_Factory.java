package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore;

import com.huawei.digitalpayment.consumer.base.database.repository.mtandao.PhoneDataRepository;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.ConnectionLiveData;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class DeviceMetrics_Factory implements Factory<DeviceMetrics> {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private final Provider<PhoneDataRepository> component3;
    private final Provider<ConnectionLiveData> copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 55;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            get();
            throw null;
        }
        DeviceMetrics deviceMetrics = get();
        int i3 = component1 + 7;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            return deviceMetrics;
        }
        throw null;
    }

    public DeviceMetrics_Factory(Provider<PhoneDataRepository> provider, Provider<ConnectionLiveData> provider2) {
        this.component3 = provider;
        this.copydefault = provider2;
    }

    @Override
    public DeviceMetrics get() {
        int i = 2 % 2;
        int i2 = component1 + 45;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DeviceMetrics deviceMetricsNewInstance = newInstance(this.component3.get(), this.copydefault.get());
        int i4 = ShareDataUIState + 23;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return deviceMetricsNewInstance;
    }

    public static DeviceMetrics_Factory create(javax.inject.Provider<PhoneDataRepository> provider, javax.inject.Provider<ConnectionLiveData> provider2) {
        int i = 2 % 2;
        DeviceMetrics_Factory deviceMetrics_Factory = new DeviceMetrics_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
        int i2 = component1 + 21;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return deviceMetrics_Factory;
        }
        throw null;
    }

    public static DeviceMetrics_Factory create(Provider<PhoneDataRepository> provider, Provider<ConnectionLiveData> provider2) {
        int i = 2 % 2;
        DeviceMetrics_Factory deviceMetrics_Factory = new DeviceMetrics_Factory(provider, provider2);
        int i2 = ShareDataUIState + 13;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return deviceMetrics_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static DeviceMetrics newInstance(PhoneDataRepository phoneDataRepository, ConnectionLiveData connectionLiveData) {
        int i = 2 % 2;
        DeviceMetrics deviceMetrics = new DeviceMetrics(phoneDataRepository, connectionLiveData);
        int i2 = component1 + 27;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return deviceMetrics;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
