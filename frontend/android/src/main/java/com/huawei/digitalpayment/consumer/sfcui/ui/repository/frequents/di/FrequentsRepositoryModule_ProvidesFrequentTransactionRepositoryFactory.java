package com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.di;

import com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentTransactionRepository;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentsLocalDatasource;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class FrequentsRepositoryModule_ProvidesFrequentTransactionRepositoryFactory implements Factory<FrequentTransactionRepository> {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private final Provider<FrequentsLocalDatasource> copydefault;

    @Override
    public Object get() {
        FrequentTransactionRepository frequentTransactionRepository;
        int i = 2 % 2;
        int i2 = component1 + 67;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            frequentTransactionRepository = get();
            int i3 = 52 / 0;
        } else {
            frequentTransactionRepository = get();
        }
        int i4 = component1 + 91;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return frequentTransactionRepository;
    }

    public FrequentsRepositoryModule_ProvidesFrequentTransactionRepositoryFactory(Provider<FrequentsLocalDatasource> provider) {
        this.copydefault = provider;
    }

    @Override
    public FrequentTransactionRepository get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 91;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FrequentsLocalDatasource frequentsLocalDatasource = this.copydefault.get();
        if (i3 != 0) {
            return providesFrequentTransactionRepository(frequentsLocalDatasource);
        }
        providesFrequentTransactionRepository(frequentsLocalDatasource);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static FrequentsRepositoryModule_ProvidesFrequentTransactionRepositoryFactory create(javax.inject.Provider<FrequentsLocalDatasource> provider) {
        int i = 2 % 2;
        FrequentsRepositoryModule_ProvidesFrequentTransactionRepositoryFactory frequentsRepositoryModule_ProvidesFrequentTransactionRepositoryFactory = new FrequentsRepositoryModule_ProvidesFrequentTransactionRepositoryFactory(Providers.asDaggerProvider(provider));
        int i2 = component1 + 75;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return frequentsRepositoryModule_ProvidesFrequentTransactionRepositoryFactory;
    }

    public static FrequentsRepositoryModule_ProvidesFrequentTransactionRepositoryFactory create(Provider<FrequentsLocalDatasource> provider) {
        int i = 2 % 2;
        FrequentsRepositoryModule_ProvidesFrequentTransactionRepositoryFactory frequentsRepositoryModule_ProvidesFrequentTransactionRepositoryFactory = new FrequentsRepositoryModule_ProvidesFrequentTransactionRepositoryFactory(provider);
        int i2 = component1 + 87;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return frequentsRepositoryModule_ProvidesFrequentTransactionRepositoryFactory;
    }

    public static FrequentTransactionRepository providesFrequentTransactionRepository(FrequentsLocalDatasource frequentsLocalDatasource) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 51;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        FrequentTransactionRepository frequentTransactionRepository = (FrequentTransactionRepository) Preconditions.checkNotNullFromProvides(FrequentsRepositoryModule.INSTANCE.providesFrequentTransactionRepository(frequentsLocalDatasource));
        int i3 = ShareDataUIState + 33;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            return frequentTransactionRepository;
        }
        throw null;
    }
}
