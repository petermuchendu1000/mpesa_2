package com.huawei.digitalpayment.consumer.base.database.di;

import com.huawei.digitalpayment.consumer.base.database.AppDatabase;
import com.huawei.digitalpayment.consumer.base.database.daos.HomeSettingsDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class AppDatabaseModule_ProvideHomeSettingsDao$ConsumerBaseUi_releaseFactory implements Factory<HomeSettingsDao> {
    private static int component2 = 0;
    private static int copydefault = 1;
    private final Provider<AppDatabase> component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 75;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return get();
        }
        get();
        throw null;
    }

    public AppDatabaseModule_ProvideHomeSettingsDao$ConsumerBaseUi_releaseFactory(Provider<AppDatabase> provider) {
        this.component3 = provider;
    }

    @Override
    public HomeSettingsDao get() {
        int i = 2 % 2;
        int i2 = component2 + 7;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        HomeSettingsDao homeSettingsDaoProvideHomeSettingsDao$ConsumerBaseUi_release = provideHomeSettingsDao$ConsumerBaseUi_release(this.component3.get());
        int i4 = component2 + 5;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return homeSettingsDaoProvideHomeSettingsDao$ConsumerBaseUi_release;
    }

    public static AppDatabaseModule_ProvideHomeSettingsDao$ConsumerBaseUi_releaseFactory create(javax.inject.Provider<AppDatabase> provider) {
        int i = 2 % 2;
        AppDatabaseModule_ProvideHomeSettingsDao$ConsumerBaseUi_releaseFactory appDatabaseModule_ProvideHomeSettingsDao$ConsumerBaseUi_releaseFactory = new AppDatabaseModule_ProvideHomeSettingsDao$ConsumerBaseUi_releaseFactory(Providers.asDaggerProvider(provider));
        int i2 = copydefault + 37;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return appDatabaseModule_ProvideHomeSettingsDao$ConsumerBaseUi_releaseFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static AppDatabaseModule_ProvideHomeSettingsDao$ConsumerBaseUi_releaseFactory create(Provider<AppDatabase> provider) {
        int i = 2 % 2;
        AppDatabaseModule_ProvideHomeSettingsDao$ConsumerBaseUi_releaseFactory appDatabaseModule_ProvideHomeSettingsDao$ConsumerBaseUi_releaseFactory = new AppDatabaseModule_ProvideHomeSettingsDao$ConsumerBaseUi_releaseFactory(provider);
        int i2 = copydefault + 15;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 89 / 0;
        }
        return appDatabaseModule_ProvideHomeSettingsDao$ConsumerBaseUi_releaseFactory;
    }

    public static HomeSettingsDao provideHomeSettingsDao$ConsumerBaseUi_release(AppDatabase appDatabase) {
        int i = 2 % 2;
        int i2 = component2 + 111;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        HomeSettingsDao homeSettingsDao = (HomeSettingsDao) Preconditions.checkNotNullFromProvides(AppDatabaseModule.INSTANCE.provideHomeSettingsDao$ConsumerBaseUi_release(appDatabase));
        int i4 = copydefault + 121;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return homeSettingsDao;
        }
        throw null;
    }
}
