package com.huawei.digitalpayment.consumer.manageandviewdata.ui.usage.viewmodels;

import com.huawei.digitalpayment.consumer.manageandviewdata.di.DataUsageInitializer;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class DeviceDataUsageViewModel_Factory implements Factory<DeviceDataUsageViewModel> {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private final Provider<DataUsageInitializer> component1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 9;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DeviceDataUsageViewModel deviceDataUsageViewModel = get();
        int i4 = component3 + 73;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return deviceDataUsageViewModel;
    }

    public DeviceDataUsageViewModel_Factory(Provider<DataUsageInitializer> provider) {
        this.component1 = provider;
    }

    @Override
    public DeviceDataUsageViewModel get() {
        int i = 2 % 2;
        int i2 = component3 + 113;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DeviceDataUsageViewModel deviceDataUsageViewModelNewInstance = newInstance(this.component1.get());
        int i4 = ShareDataUIState + 95;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return deviceDataUsageViewModelNewInstance;
    }

    public static DeviceDataUsageViewModel_Factory create(javax.inject.Provider<DataUsageInitializer> provider) {
        int i = 2 % 2;
        DeviceDataUsageViewModel_Factory deviceDataUsageViewModel_Factory = new DeviceDataUsageViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = component3 + 73;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return deviceDataUsageViewModel_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static DeviceDataUsageViewModel_Factory create(Provider<DataUsageInitializer> provider) {
        int i = 2 % 2;
        DeviceDataUsageViewModel_Factory deviceDataUsageViewModel_Factory = new DeviceDataUsageViewModel_Factory(provider);
        int i2 = component3 + 113;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return deviceDataUsageViewModel_Factory;
    }

    public static DeviceDataUsageViewModel newInstance(DataUsageInitializer dataUsageInitializer) {
        int i = 2 % 2;
        DeviceDataUsageViewModel deviceDataUsageViewModel = new DeviceDataUsageViewModel(dataUsageInitializer);
        int i2 = component3 + 91;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return deviceDataUsageViewModel;
        }
        throw null;
    }
}
