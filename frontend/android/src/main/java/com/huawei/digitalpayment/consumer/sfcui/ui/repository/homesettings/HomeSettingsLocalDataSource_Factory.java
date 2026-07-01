package com.huawei.digitalpayment.consumer.sfcui.ui.repository.homesettings;

import com.huawei.digitalpayment.consumer.base.database.daos.HomeSettingsDao;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class HomeSettingsLocalDataSource_Factory implements Factory<HomeSettingsLocalDataSource> {
    private static int component1 = 1;
    private static int copydefault;
    private final Provider<HomeSettingsDao> component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 71;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        HomeSettingsLocalDataSource homeSettingsLocalDataSource = get();
        int i4 = component1 + 71;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
        return homeSettingsLocalDataSource;
    }

    public HomeSettingsLocalDataSource_Factory(Provider<HomeSettingsDao> provider) {
        this.component2 = provider;
    }

    @Override
    public HomeSettingsLocalDataSource get() {
        int i = 2 % 2;
        int i2 = component1 + 115;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        HomeSettingsLocalDataSource homeSettingsLocalDataSourceNewInstance = newInstance(this.component2.get());
        int i4 = component1 + 51;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return homeSettingsLocalDataSourceNewInstance;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static HomeSettingsLocalDataSource_Factory create(javax.inject.Provider<HomeSettingsDao> provider) {
        int i = 2 % 2;
        HomeSettingsLocalDataSource_Factory homeSettingsLocalDataSource_Factory = new HomeSettingsLocalDataSource_Factory(Providers.asDaggerProvider(provider));
        int i2 = copydefault + 55;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return homeSettingsLocalDataSource_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static HomeSettingsLocalDataSource_Factory create(Provider<HomeSettingsDao> provider) {
        int i = 2 % 2;
        HomeSettingsLocalDataSource_Factory homeSettingsLocalDataSource_Factory = new HomeSettingsLocalDataSource_Factory(provider);
        int i2 = copydefault + 9;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return homeSettingsLocalDataSource_Factory;
    }

    public static HomeSettingsLocalDataSource newInstance(HomeSettingsDao homeSettingsDao) {
        int i = 2 % 2;
        HomeSettingsLocalDataSource homeSettingsLocalDataSource = new HomeSettingsLocalDataSource(homeSettingsDao);
        int i2 = copydefault + 59;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 96 / 0;
        }
        return homeSettingsLocalDataSource;
    }
}
