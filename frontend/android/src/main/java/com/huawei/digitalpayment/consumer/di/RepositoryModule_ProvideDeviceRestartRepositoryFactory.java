package com.huawei.digitalpayment.consumer.di;

import com.huawei.digitalpayment.consumer.base.database.daos.DeviceRestartCacheDao;
import com.huawei.digitalpayment.consumer.base.repository.DeviceRestartRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class RepositoryModule_ProvideDeviceRestartRepositoryFactory implements Factory<DeviceRestartRepository> {
    private static int component2 = 1;
    private static int component3;
    private final Provider<DeviceRestartCacheDao> ShareDataUIState;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 87;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DeviceRestartRepository deviceRestartRepository = get();
        int i4 = component2 + 115;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 18 / 0;
        }
        return deviceRestartRepository;
    }

    public RepositoryModule_ProvideDeviceRestartRepositoryFactory(Provider<DeviceRestartCacheDao> provider) {
        this.ShareDataUIState = provider;
    }

    @Override
    public DeviceRestartRepository get() {
        int i = 2 % 2;
        int i2 = component3 + 99;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DeviceRestartCacheDao deviceRestartCacheDao = this.ShareDataUIState.get();
        if (i3 != 0) {
            return provideDeviceRestartRepository(deviceRestartCacheDao);
        }
        provideDeviceRestartRepository(deviceRestartCacheDao);
        throw null;
    }

    public static RepositoryModule_ProvideDeviceRestartRepositoryFactory create(javax.inject.Provider<DeviceRestartCacheDao> provider) {
        int i = 2 % 2;
        RepositoryModule_ProvideDeviceRestartRepositoryFactory repositoryModule_ProvideDeviceRestartRepositoryFactory = new RepositoryModule_ProvideDeviceRestartRepositoryFactory(Providers.asDaggerProvider(provider));
        int i2 = component2 + 113;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return repositoryModule_ProvideDeviceRestartRepositoryFactory;
    }

    public static RepositoryModule_ProvideDeviceRestartRepositoryFactory create(Provider<DeviceRestartCacheDao> provider) {
        int i = 2 % 2;
        RepositoryModule_ProvideDeviceRestartRepositoryFactory repositoryModule_ProvideDeviceRestartRepositoryFactory = new RepositoryModule_ProvideDeviceRestartRepositoryFactory(provider);
        int i2 = component3 + 29;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return repositoryModule_ProvideDeviceRestartRepositoryFactory;
    }

    public static DeviceRestartRepository provideDeviceRestartRepository(DeviceRestartCacheDao deviceRestartCacheDao) {
        int i = 2 % 2;
        int i2 = component2 + 47;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DeviceRestartRepository deviceRestartRepository = (DeviceRestartRepository) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideDeviceRestartRepository(deviceRestartCacheDao));
        int i4 = component2 + 69;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return deviceRestartRepository;
    }
}
