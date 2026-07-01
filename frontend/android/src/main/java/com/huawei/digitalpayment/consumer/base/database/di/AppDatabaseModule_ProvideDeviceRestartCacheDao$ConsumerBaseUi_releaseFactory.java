package com.huawei.digitalpayment.consumer.base.database.di;

import com.huawei.digitalpayment.consumer.base.database.AppDatabase;
import com.huawei.digitalpayment.consumer.base.database.daos.DeviceRestartCacheDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class AppDatabaseModule_ProvideDeviceRestartCacheDao$ConsumerBaseUi_releaseFactory implements Factory<DeviceRestartCacheDao> {
    private static int component2 = 0;
    private static int copydefault = 1;
    private final Provider<AppDatabase> ShareDataUIState;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 23;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DeviceRestartCacheDao deviceRestartCacheDao = get();
        int i4 = component2 + 95;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return deviceRestartCacheDao;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public AppDatabaseModule_ProvideDeviceRestartCacheDao$ConsumerBaseUi_releaseFactory(Provider<AppDatabase> provider) {
        this.ShareDataUIState = provider;
    }

    @Override
    public DeviceRestartCacheDao get() {
        int i = 2 % 2;
        int i2 = copydefault + 81;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DeviceRestartCacheDao deviceRestartCacheDaoProvideDeviceRestartCacheDao$ConsumerBaseUi_release = provideDeviceRestartCacheDao$ConsumerBaseUi_release(this.ShareDataUIState.get());
        int i4 = component2 + 5;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return deviceRestartCacheDaoProvideDeviceRestartCacheDao$ConsumerBaseUi_release;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static AppDatabaseModule_ProvideDeviceRestartCacheDao$ConsumerBaseUi_releaseFactory create(javax.inject.Provider<AppDatabase> provider) {
        int i = 2 % 2;
        AppDatabaseModule_ProvideDeviceRestartCacheDao$ConsumerBaseUi_releaseFactory appDatabaseModule_ProvideDeviceRestartCacheDao$ConsumerBaseUi_releaseFactory = new AppDatabaseModule_ProvideDeviceRestartCacheDao$ConsumerBaseUi_releaseFactory(Providers.asDaggerProvider(provider));
        int i2 = component2 + 35;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return appDatabaseModule_ProvideDeviceRestartCacheDao$ConsumerBaseUi_releaseFactory;
    }

    public static AppDatabaseModule_ProvideDeviceRestartCacheDao$ConsumerBaseUi_releaseFactory create(Provider<AppDatabase> provider) {
        int i = 2 % 2;
        AppDatabaseModule_ProvideDeviceRestartCacheDao$ConsumerBaseUi_releaseFactory appDatabaseModule_ProvideDeviceRestartCacheDao$ConsumerBaseUi_releaseFactory = new AppDatabaseModule_ProvideDeviceRestartCacheDao$ConsumerBaseUi_releaseFactory(provider);
        int i2 = copydefault + 21;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return appDatabaseModule_ProvideDeviceRestartCacheDao$ConsumerBaseUi_releaseFactory;
    }

    public static DeviceRestartCacheDao provideDeviceRestartCacheDao$ConsumerBaseUi_release(AppDatabase appDatabase) {
        int i = 2 % 2;
        int i2 = component2 + 111;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        DeviceRestartCacheDao deviceRestartCacheDao = (DeviceRestartCacheDao) Preconditions.checkNotNullFromProvides(AppDatabaseModule.INSTANCE.provideDeviceRestartCacheDao$ConsumerBaseUi_release(appDatabase));
        int i3 = component2 + 43;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return deviceRestartCacheDao;
    }
}
