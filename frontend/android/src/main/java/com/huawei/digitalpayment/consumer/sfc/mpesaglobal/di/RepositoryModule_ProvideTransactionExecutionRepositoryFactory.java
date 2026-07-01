package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.di;

import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionExecutionRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlinx.coroutines.CoroutineDispatcher;

public final class RepositoryModule_ProvideTransactionExecutionRepositoryFactory implements Factory<TransactionExecutionRepository> {
    private static int ShareDataUIState = 1;
    private static int component2;
    private final Provider<CoroutineDispatcher> copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 35;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            get();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TransactionExecutionRepository transactionExecutionRepository = get();
        int i3 = ShareDataUIState + 121;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return transactionExecutionRepository;
    }

    public RepositoryModule_ProvideTransactionExecutionRepositoryFactory(Provider<CoroutineDispatcher> provider) {
        this.copydefault = provider;
    }

    @Override
    public TransactionExecutionRepository get() {
        int i = 2 % 2;
        int i2 = component2 + 99;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        CoroutineDispatcher coroutineDispatcher = this.copydefault.get();
        if (i3 != 0) {
            return provideTransactionExecutionRepository(coroutineDispatcher);
        }
        provideTransactionExecutionRepository(coroutineDispatcher);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static RepositoryModule_ProvideTransactionExecutionRepositoryFactory create(javax.inject.Provider<CoroutineDispatcher> provider) {
        int i = 2 % 2;
        RepositoryModule_ProvideTransactionExecutionRepositoryFactory repositoryModule_ProvideTransactionExecutionRepositoryFactory = new RepositoryModule_ProvideTransactionExecutionRepositoryFactory(Providers.asDaggerProvider(provider));
        int i2 = component2 + 103;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 61 / 0;
        }
        return repositoryModule_ProvideTransactionExecutionRepositoryFactory;
    }

    public static RepositoryModule_ProvideTransactionExecutionRepositoryFactory create(Provider<CoroutineDispatcher> provider) {
        int i = 2 % 2;
        RepositoryModule_ProvideTransactionExecutionRepositoryFactory repositoryModule_ProvideTransactionExecutionRepositoryFactory = new RepositoryModule_ProvideTransactionExecutionRepositoryFactory(provider);
        int i2 = component2 + 61;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return repositoryModule_ProvideTransactionExecutionRepositoryFactory;
    }

    public static TransactionExecutionRepository provideTransactionExecutionRepository(CoroutineDispatcher coroutineDispatcher) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        TransactionExecutionRepository transactionExecutionRepositoryProvideTransactionExecutionRepository = RepositoryModule.INSTANCE.provideTransactionExecutionRepository(coroutineDispatcher);
        if (i3 == 0) {
            return (TransactionExecutionRepository) Preconditions.checkNotNullFromProvides(transactionExecutionRepositoryProvideTransactionExecutionRepository);
        }
        throw null;
    }
}
