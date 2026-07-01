package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.di;

import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionConfigRepositoryImpl;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionFeaturesRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class RepositoryModule_ProvideTransactionFeaturesRepositoryFactory implements Factory<TransactionFeaturesRepository> {
    private static int component1 = 1;
    private static int component2;
    private final Provider<TransactionConfigRepositoryImpl> component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 19;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        TransactionFeaturesRepository transactionFeaturesRepository = get();
        int i4 = component2 + 91;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return transactionFeaturesRepository;
    }

    public RepositoryModule_ProvideTransactionFeaturesRepositoryFactory(Provider<TransactionConfigRepositoryImpl> provider) {
        this.component3 = provider;
    }

    @Override
    public TransactionFeaturesRepository get() {
        TransactionFeaturesRepository transactionFeaturesRepositoryProvideTransactionFeaturesRepository;
        int i = 2 % 2;
        int i2 = component2 + 7;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            transactionFeaturesRepositoryProvideTransactionFeaturesRepository = provideTransactionFeaturesRepository(this.component3.get());
            int i3 = 12 / 0;
        } else {
            transactionFeaturesRepositoryProvideTransactionFeaturesRepository = provideTransactionFeaturesRepository(this.component3.get());
        }
        int i4 = component2 + 21;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return transactionFeaturesRepositoryProvideTransactionFeaturesRepository;
    }

    public static RepositoryModule_ProvideTransactionFeaturesRepositoryFactory create(javax.inject.Provider<TransactionConfigRepositoryImpl> provider) {
        int i = 2 % 2;
        RepositoryModule_ProvideTransactionFeaturesRepositoryFactory repositoryModule_ProvideTransactionFeaturesRepositoryFactory = new RepositoryModule_ProvideTransactionFeaturesRepositoryFactory(Providers.asDaggerProvider(provider));
        int i2 = component1 + 105;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return repositoryModule_ProvideTransactionFeaturesRepositoryFactory;
    }

    public static RepositoryModule_ProvideTransactionFeaturesRepositoryFactory create(Provider<TransactionConfigRepositoryImpl> provider) {
        int i = 2 % 2;
        RepositoryModule_ProvideTransactionFeaturesRepositoryFactory repositoryModule_ProvideTransactionFeaturesRepositoryFactory = new RepositoryModule_ProvideTransactionFeaturesRepositoryFactory(provider);
        int i2 = component1 + 83;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return repositoryModule_ProvideTransactionFeaturesRepositoryFactory;
    }

    public static TransactionFeaturesRepository provideTransactionFeaturesRepository(TransactionConfigRepositoryImpl transactionConfigRepositoryImpl) {
        TransactionFeaturesRepository transactionFeaturesRepository;
        int i = 2 % 2;
        int i2 = component2 + 31;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            transactionFeaturesRepository = (TransactionFeaturesRepository) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideTransactionFeaturesRepository(transactionConfigRepositoryImpl));
            int i3 = 3 / 0;
        } else {
            transactionFeaturesRepository = (TransactionFeaturesRepository) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideTransactionFeaturesRepository(transactionConfigRepositoryImpl));
        }
        int i4 = component2 + 125;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return transactionFeaturesRepository;
        }
        throw null;
    }
}
