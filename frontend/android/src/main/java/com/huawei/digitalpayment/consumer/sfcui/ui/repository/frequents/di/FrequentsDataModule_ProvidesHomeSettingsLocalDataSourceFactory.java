package com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.di;

import com.huawei.digitalpayment.consumer.base.database.daos.HomeSettingsDao;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.homesettings.HomeSettingsLocalDataSource;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class FrequentsDataModule_ProvidesHomeSettingsLocalDataSourceFactory implements Factory<HomeSettingsLocalDataSource> {
    private static int component2 = 1;
    private static int component3;
    private final Provider<HomeSettingsDao> ShareDataUIState;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 65;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        HomeSettingsLocalDataSource homeSettingsLocalDataSource = get();
        int i4 = component3 + 29;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return homeSettingsLocalDataSource;
    }

    public FrequentsDataModule_ProvidesHomeSettingsLocalDataSourceFactory(Provider<HomeSettingsDao> provider) {
        this.ShareDataUIState = provider;
    }

    @Override
    public HomeSettingsLocalDataSource get() {
        int i = 2 % 2;
        int i2 = component3 + 89;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        HomeSettingsDao homeSettingsDao = this.ShareDataUIState.get();
        if (i3 != 0) {
            return providesHomeSettingsLocalDataSource(homeSettingsDao);
        }
        int i4 = 82 / 0;
        return providesHomeSettingsLocalDataSource(homeSettingsDao);
    }

    public static FrequentsDataModule_ProvidesHomeSettingsLocalDataSourceFactory create(javax.inject.Provider<HomeSettingsDao> provider) {
        int i = 2 % 2;
        FrequentsDataModule_ProvidesHomeSettingsLocalDataSourceFactory frequentsDataModule_ProvidesHomeSettingsLocalDataSourceFactory = new FrequentsDataModule_ProvidesHomeSettingsLocalDataSourceFactory(Providers.asDaggerProvider(provider));
        int i2 = component3 + 107;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return frequentsDataModule_ProvidesHomeSettingsLocalDataSourceFactory;
    }

    public static FrequentsDataModule_ProvidesHomeSettingsLocalDataSourceFactory create(Provider<HomeSettingsDao> provider) {
        int i = 2 % 2;
        FrequentsDataModule_ProvidesHomeSettingsLocalDataSourceFactory frequentsDataModule_ProvidesHomeSettingsLocalDataSourceFactory = new FrequentsDataModule_ProvidesHomeSettingsLocalDataSourceFactory(provider);
        int i2 = component2 + 113;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return frequentsDataModule_ProvidesHomeSettingsLocalDataSourceFactory;
    }

    public static HomeSettingsLocalDataSource providesHomeSettingsLocalDataSource(HomeSettingsDao homeSettingsDao) {
        int i = 2 % 2;
        int i2 = component2 + 45;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        HomeSettingsLocalDataSource homeSettingsLocalDataSource = (HomeSettingsLocalDataSource) Preconditions.checkNotNullFromProvides(FrequentsDataModule.INSTANCE.providesHomeSettingsLocalDataSource(homeSettingsDao));
        int i4 = component2 + 23;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return homeSettingsLocalDataSource;
        }
        throw null;
    }
}
