package com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents;

import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class FrequentsRepositoryImpl_Factory implements Factory<FrequentsRepositoryImpl> {
    private static int component1 = 1;
    private static int copydefault;
    private final Provider<FrequentTransactionRepository> ShareDataUIState;
    private final Provider<FrequentMiniAppRepository> component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 111;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return get();
        }
        int i3 = 2 / 0;
        return get();
    }

    public FrequentsRepositoryImpl_Factory(Provider<FrequentTransactionRepository> provider, Provider<FrequentMiniAppRepository> provider2) {
        this.ShareDataUIState = provider;
        this.component3 = provider2;
    }

    @Override
    public FrequentsRepositoryImpl get() {
        int i = 2 % 2;
        int i2 = component1 + 101;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FrequentsRepositoryImpl frequentsRepositoryImplNewInstance = newInstance(this.ShareDataUIState.get(), this.component3.get());
        int i4 = copydefault + 33;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return frequentsRepositoryImplNewInstance;
        }
        throw null;
    }

    public static FrequentsRepositoryImpl_Factory create(javax.inject.Provider<FrequentTransactionRepository> provider, javax.inject.Provider<FrequentMiniAppRepository> provider2) {
        int i = 2 % 2;
        FrequentsRepositoryImpl_Factory frequentsRepositoryImpl_Factory = new FrequentsRepositoryImpl_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
        int i2 = component1 + 113;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return frequentsRepositoryImpl_Factory;
        }
        throw null;
    }

    public static FrequentsRepositoryImpl_Factory create(Provider<FrequentTransactionRepository> provider, Provider<FrequentMiniAppRepository> provider2) {
        int i = 2 % 2;
        FrequentsRepositoryImpl_Factory frequentsRepositoryImpl_Factory = new FrequentsRepositoryImpl_Factory(provider, provider2);
        int i2 = component1 + 21;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return frequentsRepositoryImpl_Factory;
    }

    public static FrequentsRepositoryImpl newInstance(FrequentTransactionRepository frequentTransactionRepository, FrequentMiniAppRepository frequentMiniAppRepository) {
        int i = 2 % 2;
        FrequentsRepositoryImpl frequentsRepositoryImpl = new FrequentsRepositoryImpl(frequentTransactionRepository, frequentMiniAppRepository);
        int i2 = component1 + 9;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return frequentsRepositoryImpl;
    }
}
