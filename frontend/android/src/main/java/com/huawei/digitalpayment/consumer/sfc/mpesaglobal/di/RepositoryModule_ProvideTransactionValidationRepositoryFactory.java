package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.di;

import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.ValidationApiService;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionValidationRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlinx.coroutines.CoroutineDispatcher;

public final class RepositoryModule_ProvideTransactionValidationRepositoryFactory implements Factory<TransactionValidationRepository> {
    private static int component2 = 0;
    private static int copydefault = 1;
    private final Provider<CoroutineDispatcher> ShareDataUIState;
    private final Provider<ValidationApiService> component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 121;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        TransactionValidationRepository transactionValidationRepository = get();
        int i4 = component2 + 87;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return transactionValidationRepository;
    }

    public RepositoryModule_ProvideTransactionValidationRepositoryFactory(Provider<ValidationApiService> provider, Provider<CoroutineDispatcher> provider2) {
        this.component3 = provider;
        this.ShareDataUIState = provider2;
    }

    @Override
    public TransactionValidationRepository get() {
        int i = 2 % 2;
        int i2 = component2 + 33;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        TransactionValidationRepository transactionValidationRepositoryProvideTransactionValidationRepository = provideTransactionValidationRepository(this.component3.get(), this.ShareDataUIState.get());
        int i4 = component2 + 109;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
        return transactionValidationRepositoryProvideTransactionValidationRepository;
    }

    public static RepositoryModule_ProvideTransactionValidationRepositoryFactory create(javax.inject.Provider<ValidationApiService> provider, javax.inject.Provider<CoroutineDispatcher> provider2) {
        int i = 2 % 2;
        RepositoryModule_ProvideTransactionValidationRepositoryFactory repositoryModule_ProvideTransactionValidationRepositoryFactory = new RepositoryModule_ProvideTransactionValidationRepositoryFactory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
        int i2 = component2 + 31;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return repositoryModule_ProvideTransactionValidationRepositoryFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static RepositoryModule_ProvideTransactionValidationRepositoryFactory create(Provider<ValidationApiService> provider, Provider<CoroutineDispatcher> provider2) {
        int i = 2 % 2;
        RepositoryModule_ProvideTransactionValidationRepositoryFactory repositoryModule_ProvideTransactionValidationRepositoryFactory = new RepositoryModule_ProvideTransactionValidationRepositoryFactory(provider, provider2);
        int i2 = component2 + 125;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return repositoryModule_ProvideTransactionValidationRepositoryFactory;
        }
        throw null;
    }

    public static TransactionValidationRepository provideTransactionValidationRepository(ValidationApiService validationApiService, CoroutineDispatcher coroutineDispatcher) {
        int i = 2 % 2;
        int i2 = component2 + 119;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        TransactionValidationRepository transactionValidationRepository = (TransactionValidationRepository) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideTransactionValidationRepository(validationApiService, coroutineDispatcher));
        int i4 = copydefault + 13;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return transactionValidationRepository;
        }
        throw null;
    }
}
