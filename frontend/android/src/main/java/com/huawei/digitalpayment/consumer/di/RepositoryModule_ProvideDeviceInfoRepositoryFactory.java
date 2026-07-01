package com.huawei.digitalpayment.consumer.di;

import android.content.Context;
import com.huawei.digitalpayment.consumer.base.framework.PhoneNetworkInformationProvider;
import com.huawei.digitalpayment.consumer.base.repository.DeviceInfoRepository;
import com.huawei.digitalpayment.consumer.base.sim.SimStateValidator;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class RepositoryModule_ProvideDeviceInfoRepositoryFactory implements Factory<DeviceInfoRepository> {
    private static int component3 = 1;
    private static int copydefault;
    private final Provider<SimStateValidator> ShareDataUIState;
    private final Provider<PhoneNetworkInformationProvider> component1;
    private final Provider<Context> component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 77;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return get();
        }
        get();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public RepositoryModule_ProvideDeviceInfoRepositoryFactory(Provider<Context> provider, Provider<PhoneNetworkInformationProvider> provider2, Provider<SimStateValidator> provider3) {
        this.component2 = provider;
        this.component1 = provider2;
        this.ShareDataUIState = provider3;
    }

    @Override
    public DeviceInfoRepository get() {
        int i = 2 % 2;
        int i2 = component3 + 111;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DeviceInfoRepository deviceInfoRepositoryProvideDeviceInfoRepository = provideDeviceInfoRepository(this.component2.get(), this.component1.get(), this.ShareDataUIState.get());
        int i4 = component3 + 1;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 10 / 0;
        }
        return deviceInfoRepositoryProvideDeviceInfoRepository;
    }

    public static RepositoryModule_ProvideDeviceInfoRepositoryFactory create(javax.inject.Provider<Context> provider, javax.inject.Provider<PhoneNetworkInformationProvider> provider2, javax.inject.Provider<SimStateValidator> provider3) {
        int i = 2 % 2;
        RepositoryModule_ProvideDeviceInfoRepositoryFactory repositoryModule_ProvideDeviceInfoRepositoryFactory = new RepositoryModule_ProvideDeviceInfoRepositoryFactory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3));
        int i2 = copydefault + 77;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return repositoryModule_ProvideDeviceInfoRepositoryFactory;
    }

    public static RepositoryModule_ProvideDeviceInfoRepositoryFactory create(Provider<Context> provider, Provider<PhoneNetworkInformationProvider> provider2, Provider<SimStateValidator> provider3) {
        int i = 2 % 2;
        RepositoryModule_ProvideDeviceInfoRepositoryFactory repositoryModule_ProvideDeviceInfoRepositoryFactory = new RepositoryModule_ProvideDeviceInfoRepositoryFactory(provider, provider2, provider3);
        int i2 = copydefault + 117;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return repositoryModule_ProvideDeviceInfoRepositoryFactory;
    }

    public static DeviceInfoRepository provideDeviceInfoRepository(Context context, PhoneNetworkInformationProvider phoneNetworkInformationProvider, SimStateValidator simStateValidator) {
        int i = 2 % 2;
        int i2 = component3 + 123;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DeviceInfoRepository deviceInfoRepositoryProvideDeviceInfoRepository = RepositoryModule.INSTANCE.provideDeviceInfoRepository(context, phoneNetworkInformationProvider, simStateValidator);
        if (i3 == 0) {
            return (DeviceInfoRepository) Preconditions.checkNotNullFromProvides(deviceInfoRepositoryProvideDeviceInfoRepository);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
