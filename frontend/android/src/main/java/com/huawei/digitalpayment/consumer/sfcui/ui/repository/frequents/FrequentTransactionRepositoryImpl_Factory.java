package com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents;

import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class FrequentTransactionRepositoryImpl_Factory implements Factory<FrequentTransactionRepositoryImpl> {
    private static int component1 = 1;
    private static int copydefault;
    private final Provider<FrequentsLocalDatasource> component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 105;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FrequentTransactionRepositoryImpl frequentTransactionRepositoryImpl = get();
        int i4 = copydefault + 55;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return frequentTransactionRepositoryImpl;
        }
        throw null;
    }

    public FrequentTransactionRepositoryImpl_Factory(Provider<FrequentsLocalDatasource> provider) {
        this.component2 = provider;
    }

    @Override
    public FrequentTransactionRepositoryImpl get() {
        int i = 2 % 2;
        int i2 = copydefault + 17;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FrequentTransactionRepositoryImpl frequentTransactionRepositoryImplNewInstance = newInstance(this.component2.get());
        int i4 = component1 + 11;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return frequentTransactionRepositoryImplNewInstance;
    }

    public static FrequentTransactionRepositoryImpl_Factory create(javax.inject.Provider<FrequentsLocalDatasource> provider) {
        int i = 2 % 2;
        FrequentTransactionRepositoryImpl_Factory frequentTransactionRepositoryImpl_Factory = new FrequentTransactionRepositoryImpl_Factory(Providers.asDaggerProvider(provider));
        int i2 = component1 + 71;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 46 / 0;
        }
        return frequentTransactionRepositoryImpl_Factory;
    }

    public static FrequentTransactionRepositoryImpl_Factory create(Provider<FrequentsLocalDatasource> provider) {
        int i = 2 % 2;
        FrequentTransactionRepositoryImpl_Factory frequentTransactionRepositoryImpl_Factory = new FrequentTransactionRepositoryImpl_Factory(provider);
        int i2 = copydefault + 121;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 79 / 0;
        }
        return frequentTransactionRepositoryImpl_Factory;
    }

    public static FrequentTransactionRepositoryImpl newInstance(FrequentsLocalDatasource frequentsLocalDatasource) {
        int i = 2 % 2;
        FrequentTransactionRepositoryImpl frequentTransactionRepositoryImpl = new FrequentTransactionRepositoryImpl(frequentsLocalDatasource);
        int i2 = component1 + 63;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 45 / 0;
        }
        return frequentTransactionRepositoryImpl;
    }
}
