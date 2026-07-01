package com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel;

import com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentsRepository;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.homesettings.HomeSettingsRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class FrequentsViewModel_Factory implements Factory<FrequentsViewModel> {
    private static int component2 = 1;
    private static int copydefault;
    private final Provider<HomeSettingsRepository> component1;
    private final Provider<FrequentsRepository> component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 113;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FrequentsViewModel frequentsViewModel = get();
        int i4 = copydefault + 31;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return frequentsViewModel;
        }
        throw null;
    }

    public FrequentsViewModel_Factory(Provider<HomeSettingsRepository> provider, Provider<FrequentsRepository> provider2) {
        this.component1 = provider;
        this.component3 = provider2;
    }

    @Override
    public FrequentsViewModel get() {
        int i = 2 % 2;
        int i2 = copydefault + 105;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        HomeSettingsRepository homeSettingsRepository = this.component1.get();
        if (i3 != 0) {
            return newInstance(homeSettingsRepository, this.component3.get());
        }
        newInstance(homeSettingsRepository, this.component3.get());
        throw null;
    }

    public static FrequentsViewModel_Factory create(javax.inject.Provider<HomeSettingsRepository> provider, javax.inject.Provider<FrequentsRepository> provider2) {
        int i = 2 % 2;
        FrequentsViewModel_Factory frequentsViewModel_Factory = new FrequentsViewModel_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
        int i2 = component2 + 87;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 4 / 0;
        }
        return frequentsViewModel_Factory;
    }

    public static FrequentsViewModel_Factory create(Provider<HomeSettingsRepository> provider, Provider<FrequentsRepository> provider2) {
        int i = 2 % 2;
        FrequentsViewModel_Factory frequentsViewModel_Factory = new FrequentsViewModel_Factory(provider, provider2);
        int i2 = component2 + 13;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return frequentsViewModel_Factory;
    }

    public static FrequentsViewModel newInstance(HomeSettingsRepository homeSettingsRepository, FrequentsRepository frequentsRepository) {
        int i = 2 % 2;
        FrequentsViewModel frequentsViewModel = new FrequentsViewModel(homeSettingsRepository, frequentsRepository);
        int i2 = copydefault + 111;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return frequentsViewModel;
    }
}
