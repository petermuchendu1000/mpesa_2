package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.di;

import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.DefaultTransactionConfig;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionConfigRepositoryImpl;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class RepositoryModule_ProvideTransactionConfigRepositoryFactory implements Factory<TransactionConfigRepositoryImpl> {
    private static int component1 = 1;
    private static int component3;
    private final Provider<DefaultTransactionConfig> ShareDataUIState;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 55;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            get();
            throw null;
        }
        TransactionConfigRepositoryImpl transactionConfigRepositoryImpl = get();
        int i3 = component3 + 87;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 9 / 0;
        }
        return transactionConfigRepositoryImpl;
    }

    public RepositoryModule_ProvideTransactionConfigRepositoryFactory(Provider<DefaultTransactionConfig> provider) {
        this.ShareDataUIState = provider;
    }

    @Override
    public TransactionConfigRepositoryImpl get() {
        int i = 2 % 2;
        int i2 = component1 + 37;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        TransactionConfigRepositoryImpl transactionConfigRepositoryImplProvideTransactionConfigRepository = provideTransactionConfigRepository(this.ShareDataUIState.get());
        int i4 = component1 + 31;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return transactionConfigRepositoryImplProvideTransactionConfigRepository;
        }
        throw null;
    }

    public static RepositoryModule_ProvideTransactionConfigRepositoryFactory create(javax.inject.Provider<DefaultTransactionConfig> provider) {
        int i = 2 % 2;
        RepositoryModule_ProvideTransactionConfigRepositoryFactory repositoryModule_ProvideTransactionConfigRepositoryFactory = new RepositoryModule_ProvideTransactionConfigRepositoryFactory(Providers.asDaggerProvider(provider));
        int i2 = component1 + 17;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return repositoryModule_ProvideTransactionConfigRepositoryFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static RepositoryModule_ProvideTransactionConfigRepositoryFactory create(Provider<DefaultTransactionConfig> provider) {
        int i = 2 % 2;
        RepositoryModule_ProvideTransactionConfigRepositoryFactory repositoryModule_ProvideTransactionConfigRepositoryFactory = new RepositoryModule_ProvideTransactionConfigRepositoryFactory(provider);
        int i2 = component3 + 115;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return repositoryModule_ProvideTransactionConfigRepositoryFactory;
    }

    public static TransactionConfigRepositoryImpl provideTransactionConfigRepository(DefaultTransactionConfig defaultTransactionConfig) {
        int i = 2 % 2;
        int i2 = component1 + 41;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        TransactionConfigRepositoryImpl transactionConfigRepositoryImpl = (TransactionConfigRepositoryImpl) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideTransactionConfigRepository(defaultTransactionConfig));
        int i4 = component3 + 35;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return transactionConfigRepositoryImpl;
        }
        throw null;
    }
}
