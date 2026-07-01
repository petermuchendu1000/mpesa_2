package com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.di;

import com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentMiniAppRepository;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentTransactionRepository;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentsRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class FrequentsRepositoryModule_ProvidesFrequentsRepositoryFactory implements Factory<FrequentsRepository> {
    private static int component2 = 0;
    private static int component3 = 1;
    private final Provider<FrequentTransactionRepository> ShareDataUIState;
    private final Provider<FrequentMiniAppRepository> copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 9;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return get();
        }
        get();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public FrequentsRepositoryModule_ProvidesFrequentsRepositoryFactory(Provider<FrequentTransactionRepository> provider, Provider<FrequentMiniAppRepository> provider2) {
        this.ShareDataUIState = provider;
        this.copydefault = provider2;
    }

    @Override
    public FrequentsRepository get() {
        int i = 2 % 2;
        int i2 = component2 + 47;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FrequentsRepository frequentsRepositoryProvidesFrequentsRepository = providesFrequentsRepository(this.ShareDataUIState.get(), this.copydefault.get());
        int i4 = component2 + 101;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return frequentsRepositoryProvidesFrequentsRepository;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static FrequentsRepositoryModule_ProvidesFrequentsRepositoryFactory create(javax.inject.Provider<FrequentTransactionRepository> provider, javax.inject.Provider<FrequentMiniAppRepository> provider2) {
        int i = 2 % 2;
        FrequentsRepositoryModule_ProvidesFrequentsRepositoryFactory frequentsRepositoryModule_ProvidesFrequentsRepositoryFactory = new FrequentsRepositoryModule_ProvidesFrequentsRepositoryFactory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
        int i2 = component3 + 119;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 65 / 0;
        }
        return frequentsRepositoryModule_ProvidesFrequentsRepositoryFactory;
    }

    public static FrequentsRepositoryModule_ProvidesFrequentsRepositoryFactory create(Provider<FrequentTransactionRepository> provider, Provider<FrequentMiniAppRepository> provider2) {
        int i = 2 % 2;
        FrequentsRepositoryModule_ProvidesFrequentsRepositoryFactory frequentsRepositoryModule_ProvidesFrequentsRepositoryFactory = new FrequentsRepositoryModule_ProvidesFrequentsRepositoryFactory(provider, provider2);
        int i2 = component2 + 81;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return frequentsRepositoryModule_ProvidesFrequentsRepositoryFactory;
    }

    public static FrequentsRepository providesFrequentsRepository(FrequentTransactionRepository frequentTransactionRepository, FrequentMiniAppRepository frequentMiniAppRepository) {
        int i = 2 % 2;
        int i2 = component3 + 31;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FrequentsRepository frequentsRepository = (FrequentsRepository) Preconditions.checkNotNullFromProvides(FrequentsRepositoryModule.INSTANCE.providesFrequentsRepository(frequentTransactionRepository, frequentMiniAppRepository));
        int i4 = component3 + 29;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return frequentsRepository;
    }
}
