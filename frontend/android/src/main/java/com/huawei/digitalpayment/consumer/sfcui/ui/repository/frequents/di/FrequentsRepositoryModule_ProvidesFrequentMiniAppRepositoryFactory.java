package com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.di;

import com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentMiniAppRepository;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentsLocalDatasource;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class FrequentsRepositoryModule_ProvidesFrequentMiniAppRepositoryFactory implements Factory<FrequentMiniAppRepository> {
    private static int component1 = 1;
    private static int component2;
    private final Provider<FrequentsLocalDatasource> copydefault;

    @Override
    public Object get() {
        FrequentMiniAppRepository frequentMiniAppRepository;
        int i = 2 % 2;
        int i2 = component2 + 55;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            frequentMiniAppRepository = get();
            int i3 = 16 / 0;
        } else {
            frequentMiniAppRepository = get();
        }
        int i4 = component1 + 57;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return frequentMiniAppRepository;
    }

    public FrequentsRepositoryModule_ProvidesFrequentMiniAppRepositoryFactory(Provider<FrequentsLocalDatasource> provider) {
        this.copydefault = provider;
    }

    @Override
    public FrequentMiniAppRepository get() {
        int i = 2 % 2;
        int i2 = component1 + 63;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FrequentsLocalDatasource frequentsLocalDatasource = this.copydefault.get();
        if (i3 == 0) {
            return providesFrequentMiniAppRepository(frequentsLocalDatasource);
        }
        providesFrequentMiniAppRepository(frequentsLocalDatasource);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static FrequentsRepositoryModule_ProvidesFrequentMiniAppRepositoryFactory create(javax.inject.Provider<FrequentsLocalDatasource> provider) {
        int i = 2 % 2;
        FrequentsRepositoryModule_ProvidesFrequentMiniAppRepositoryFactory frequentsRepositoryModule_ProvidesFrequentMiniAppRepositoryFactory = new FrequentsRepositoryModule_ProvidesFrequentMiniAppRepositoryFactory(Providers.asDaggerProvider(provider));
        int i2 = component1 + 121;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return frequentsRepositoryModule_ProvidesFrequentMiniAppRepositoryFactory;
    }

    public static FrequentsRepositoryModule_ProvidesFrequentMiniAppRepositoryFactory create(Provider<FrequentsLocalDatasource> provider) {
        int i = 2 % 2;
        FrequentsRepositoryModule_ProvidesFrequentMiniAppRepositoryFactory frequentsRepositoryModule_ProvidesFrequentMiniAppRepositoryFactory = new FrequentsRepositoryModule_ProvidesFrequentMiniAppRepositoryFactory(provider);
        int i2 = component2 + 83;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 42 / 0;
        }
        return frequentsRepositoryModule_ProvidesFrequentMiniAppRepositoryFactory;
    }

    public static FrequentMiniAppRepository providesFrequentMiniAppRepository(FrequentsLocalDatasource frequentsLocalDatasource) {
        int i = 2 % 2;
        int i2 = component1 + 9;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FrequentMiniAppRepository frequentMiniAppRepository = (FrequentMiniAppRepository) Preconditions.checkNotNullFromProvides(FrequentsRepositoryModule.INSTANCE.providesFrequentMiniAppRepository(frequentsLocalDatasource));
        int i4 = component2 + 47;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return frequentMiniAppRepository;
    }
}
