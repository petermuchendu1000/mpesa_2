package com.huawei.digitalpayment.consumer.di;

import android.app.Application;
import com.huawei.digitalpayment.consumer.base.framework.PhoneNetworkInformationProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class DeviceModule_ProvidePhoneNetworkInformationProviderFactory implements Factory<PhoneNetworkInformationProvider> {
    private static int component1 = 1;
    private static int component2;
    private final Provider<Application> copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 51;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return get();
        }
        get();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public DeviceModule_ProvidePhoneNetworkInformationProviderFactory(Provider<Application> provider) {
        this.copydefault = provider;
    }

    @Override
    public PhoneNetworkInformationProvider get() {
        int i = 2 % 2;
        int i2 = component1 + 31;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        PhoneNetworkInformationProvider phoneNetworkInformationProviderProvidePhoneNetworkInformationProvider = providePhoneNetworkInformationProvider(this.copydefault.get());
        int i4 = component1 + 113;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 46 / 0;
        }
        return phoneNetworkInformationProviderProvidePhoneNetworkInformationProvider;
    }

    public static DeviceModule_ProvidePhoneNetworkInformationProviderFactory create(javax.inject.Provider<Application> provider) {
        int i = 2 % 2;
        DeviceModule_ProvidePhoneNetworkInformationProviderFactory deviceModule_ProvidePhoneNetworkInformationProviderFactory = new DeviceModule_ProvidePhoneNetworkInformationProviderFactory(Providers.asDaggerProvider(provider));
        int i2 = component1 + 103;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return deviceModule_ProvidePhoneNetworkInformationProviderFactory;
    }

    public static DeviceModule_ProvidePhoneNetworkInformationProviderFactory create(Provider<Application> provider) {
        int i = 2 % 2;
        DeviceModule_ProvidePhoneNetworkInformationProviderFactory deviceModule_ProvidePhoneNetworkInformationProviderFactory = new DeviceModule_ProvidePhoneNetworkInformationProviderFactory(provider);
        int i2 = component1 + 71;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return deviceModule_ProvidePhoneNetworkInformationProviderFactory;
    }

    public static PhoneNetworkInformationProvider providePhoneNetworkInformationProvider(Application application) {
        int i = 2 % 2;
        int i2 = component1 + 103;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        PhoneNetworkInformationProvider phoneNetworkInformationProvider = (PhoneNetworkInformationProvider) Preconditions.checkNotNullFromProvides(DeviceModule.INSTANCE.providePhoneNetworkInformationProvider(application));
        if (i3 != 0) {
            int i4 = 53 / 0;
        }
        return phoneNetworkInformationProvider;
    }
}
