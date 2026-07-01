package com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.di;

import com.huawei.digitalpayment.consumer.sfcui.ui.repository.homesettings.HomeSettingsLocalDataSource;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.homesettings.HomeSettingsRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class FrequentsRepositoryModule_ProvidesHomeSettingsRepositoryFactory implements Factory<HomeSettingsRepository> {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private final Provider<HomeSettingsLocalDataSource> component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            get();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        HomeSettingsRepository homeSettingsRepository = get();
        int i3 = component2 + 37;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 87 / 0;
        }
        return homeSettingsRepository;
    }

    public FrequentsRepositoryModule_ProvidesHomeSettingsRepositoryFactory(Provider<HomeSettingsLocalDataSource> provider) {
        this.component3 = provider;
    }

    @Override
    public HomeSettingsRepository get() {
        int i = 2 % 2;
        int i2 = component2 + 99;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        HomeSettingsRepository homeSettingsRepositoryProvidesHomeSettingsRepository = providesHomeSettingsRepository(this.component3.get());
        int i4 = component2 + 115;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 1 / 0;
        }
        return homeSettingsRepositoryProvidesHomeSettingsRepository;
    }

    public static FrequentsRepositoryModule_ProvidesHomeSettingsRepositoryFactory create(javax.inject.Provider<HomeSettingsLocalDataSource> provider) {
        int i = 2 % 2;
        FrequentsRepositoryModule_ProvidesHomeSettingsRepositoryFactory frequentsRepositoryModule_ProvidesHomeSettingsRepositoryFactory = new FrequentsRepositoryModule_ProvidesHomeSettingsRepositoryFactory(Providers.asDaggerProvider(provider));
        int i2 = ShareDataUIState + 125;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 51 / 0;
        }
        return frequentsRepositoryModule_ProvidesHomeSettingsRepositoryFactory;
    }

    public static FrequentsRepositoryModule_ProvidesHomeSettingsRepositoryFactory create(Provider<HomeSettingsLocalDataSource> provider) {
        int i = 2 % 2;
        FrequentsRepositoryModule_ProvidesHomeSettingsRepositoryFactory frequentsRepositoryModule_ProvidesHomeSettingsRepositoryFactory = new FrequentsRepositoryModule_ProvidesHomeSettingsRepositoryFactory(provider);
        int i2 = ShareDataUIState + 93;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return frequentsRepositoryModule_ProvidesHomeSettingsRepositoryFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static HomeSettingsRepository providesHomeSettingsRepository(HomeSettingsLocalDataSource homeSettingsLocalDataSource) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 1;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        HomeSettingsRepository homeSettingsRepository = (HomeSettingsRepository) Preconditions.checkNotNullFromProvides(FrequentsRepositoryModule.INSTANCE.providesHomeSettingsRepository(homeSettingsLocalDataSource));
        int i4 = ShareDataUIState + 25;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return homeSettingsRepository;
        }
        throw null;
    }
}
