package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.di;

import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionConfigRepositoryImpl;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionFeeRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class RepositoryModule_ProvideTransactionFeeRepositoryFactory implements Factory<TransactionFeeRepository> {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private final Provider<TransactionConfigRepositoryImpl> copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        TransactionFeeRepository transactionFeeRepository = get();
        int i4 = ShareDataUIState + 103;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return transactionFeeRepository;
        }
        throw null;
    }

    public RepositoryModule_ProvideTransactionFeeRepositoryFactory(Provider<TransactionConfigRepositoryImpl> provider) {
        this.copydefault = provider;
    }

    @Override
    public TransactionFeeRepository get() {
        int i = 2 % 2;
        int i2 = component2 + 73;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        TransactionFeeRepository transactionFeeRepositoryProvideTransactionFeeRepository = provideTransactionFeeRepository(this.copydefault.get());
        int i4 = component2 + 47;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return transactionFeeRepositoryProvideTransactionFeeRepository;
    }

    public static RepositoryModule_ProvideTransactionFeeRepositoryFactory create(javax.inject.Provider<TransactionConfigRepositoryImpl> provider) {
        int i = 2 % 2;
        RepositoryModule_ProvideTransactionFeeRepositoryFactory repositoryModule_ProvideTransactionFeeRepositoryFactory = new RepositoryModule_ProvideTransactionFeeRepositoryFactory(Providers.asDaggerProvider(provider));
        int i2 = ShareDataUIState + 53;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return repositoryModule_ProvideTransactionFeeRepositoryFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static RepositoryModule_ProvideTransactionFeeRepositoryFactory create(Provider<TransactionConfigRepositoryImpl> provider) {
        int i = 2 % 2;
        RepositoryModule_ProvideTransactionFeeRepositoryFactory repositoryModule_ProvideTransactionFeeRepositoryFactory = new RepositoryModule_ProvideTransactionFeeRepositoryFactory(provider);
        int i2 = component2 + 85;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return repositoryModule_ProvideTransactionFeeRepositoryFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static TransactionFeeRepository provideTransactionFeeRepository(TransactionConfigRepositoryImpl transactionConfigRepositoryImpl) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 71;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        TransactionFeeRepository transactionFeeRepositoryProvideTransactionFeeRepository = RepositoryModule.INSTANCE.provideTransactionFeeRepository(transactionConfigRepositoryImpl);
        if (i3 != 0) {
            return (TransactionFeeRepository) Preconditions.checkNotNullFromProvides(transactionFeeRepositoryProvideTransactionFeeRepository);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
