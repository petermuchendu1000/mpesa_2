package com.huawei.digitalpayment.consumer.sfcui.ui.repository.homesettings;

import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class HomeSettingsRepositoryImpl_Factory implements Factory<HomeSettingsRepositoryImpl> {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    private final Provider<HomeSettingsLocalDataSource> component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return get();
        }
        get();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public HomeSettingsRepositoryImpl_Factory(Provider<HomeSettingsLocalDataSource> provider) {
        this.component3 = provider;
    }

    @Override
    public HomeSettingsRepositoryImpl get() {
        int i = 2 % 2;
        int i2 = copydefault + 79;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        HomeSettingsLocalDataSource homeSettingsLocalDataSource = this.component3.get();
        if (i3 != 0) {
            return newInstance(homeSettingsLocalDataSource);
        }
        int i4 = 48 / 0;
        return newInstance(homeSettingsLocalDataSource);
    }

    public static HomeSettingsRepositoryImpl_Factory create(javax.inject.Provider<HomeSettingsLocalDataSource> provider) {
        int i = 2 % 2;
        HomeSettingsRepositoryImpl_Factory homeSettingsRepositoryImpl_Factory = new HomeSettingsRepositoryImpl_Factory(Providers.asDaggerProvider(provider));
        int i2 = copydefault + 9;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return homeSettingsRepositoryImpl_Factory;
    }

    public static HomeSettingsRepositoryImpl_Factory create(Provider<HomeSettingsLocalDataSource> provider) {
        int i = 2 % 2;
        HomeSettingsRepositoryImpl_Factory homeSettingsRepositoryImpl_Factory = new HomeSettingsRepositoryImpl_Factory(provider);
        int i2 = copydefault + 69;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return homeSettingsRepositoryImpl_Factory;
    }

    public static HomeSettingsRepositoryImpl newInstance(HomeSettingsLocalDataSource homeSettingsLocalDataSource) {
        int i = 2 % 2;
        HomeSettingsRepositoryImpl homeSettingsRepositoryImpl = new HomeSettingsRepositoryImpl(homeSettingsLocalDataSource);
        int i2 = copydefault + 123;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return homeSettingsRepositoryImpl;
    }
}
