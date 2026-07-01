package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.di;

import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionConfigRepositoryImpl;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionLimitsRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class RepositoryModule_ProvideTransactionLimitsRepositoryFactory implements Factory<TransactionLimitsRepository> {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private final Provider<TransactionConfigRepositoryImpl> component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 121;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        TransactionLimitsRepository transactionLimitsRepository = get();
        if (i3 == 0) {
            int i4 = 1 / 0;
        }
        return transactionLimitsRepository;
    }

    public RepositoryModule_ProvideTransactionLimitsRepositoryFactory(Provider<TransactionConfigRepositoryImpl> provider) {
        this.component2 = provider;
    }

    @Override
    public TransactionLimitsRepository get() {
        int i = 2 % 2;
        int i2 = copydefault + 13;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        TransactionLimitsRepository transactionLimitsRepositoryProvideTransactionLimitsRepository = provideTransactionLimitsRepository(this.component2.get());
        int i4 = ShareDataUIState + 17;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return transactionLimitsRepositoryProvideTransactionLimitsRepository;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static RepositoryModule_ProvideTransactionLimitsRepositoryFactory create(javax.inject.Provider<TransactionConfigRepositoryImpl> provider) {
        int i = 2 % 2;
        RepositoryModule_ProvideTransactionLimitsRepositoryFactory repositoryModule_ProvideTransactionLimitsRepositoryFactory = new RepositoryModule_ProvideTransactionLimitsRepositoryFactory(Providers.asDaggerProvider(provider));
        int i2 = ShareDataUIState + 19;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return repositoryModule_ProvideTransactionLimitsRepositoryFactory;
    }

    public static RepositoryModule_ProvideTransactionLimitsRepositoryFactory create(Provider<TransactionConfigRepositoryImpl> provider) {
        int i = 2 % 2;
        RepositoryModule_ProvideTransactionLimitsRepositoryFactory repositoryModule_ProvideTransactionLimitsRepositoryFactory = new RepositoryModule_ProvideTransactionLimitsRepositoryFactory(provider);
        int i2 = ShareDataUIState + 105;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return repositoryModule_ProvideTransactionLimitsRepositoryFactory;
        }
        throw null;
    }

    public static TransactionLimitsRepository provideTransactionLimitsRepository(TransactionConfigRepositoryImpl transactionConfigRepositoryImpl) {
        int i = 2 % 2;
        int i2 = copydefault + 99;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        TransactionLimitsRepository transactionLimitsRepository = (TransactionLimitsRepository) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideTransactionLimitsRepository(transactionConfigRepositoryImpl));
        int i4 = ShareDataUIState + 7;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return transactionLimitsRepository;
    }
}
