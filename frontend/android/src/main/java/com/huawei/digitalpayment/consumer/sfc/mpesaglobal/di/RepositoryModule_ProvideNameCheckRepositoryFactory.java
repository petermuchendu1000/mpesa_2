package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.di;

import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.NameCheckApiService;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionNameCheckRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlinx.coroutines.CoroutineDispatcher;

public final class RepositoryModule_ProvideNameCheckRepositoryFactory implements Factory<TransactionNameCheckRepository> {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private final Provider<CoroutineDispatcher> component2;
    private final Provider<NameCheckApiService> component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 65;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return get();
        }
        get();
        throw null;
    }

    public RepositoryModule_ProvideNameCheckRepositoryFactory(Provider<NameCheckApiService> provider, Provider<CoroutineDispatcher> provider2) {
        this.component3 = provider;
        this.component2 = provider2;
    }

    @Override
    public TransactionNameCheckRepository get() {
        int i = 2 % 2;
        int i2 = copydefault + 17;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        NameCheckApiService nameCheckApiService = this.component3.get();
        if (i3 == 0) {
            return provideNameCheckRepository(nameCheckApiService, this.component2.get());
        }
        int i4 = 7 / 0;
        return provideNameCheckRepository(nameCheckApiService, this.component2.get());
    }

    public static RepositoryModule_ProvideNameCheckRepositoryFactory create(javax.inject.Provider<NameCheckApiService> provider, javax.inject.Provider<CoroutineDispatcher> provider2) {
        int i = 2 % 2;
        RepositoryModule_ProvideNameCheckRepositoryFactory repositoryModule_ProvideNameCheckRepositoryFactory = new RepositoryModule_ProvideNameCheckRepositoryFactory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
        int i2 = ShareDataUIState + 71;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return repositoryModule_ProvideNameCheckRepositoryFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static RepositoryModule_ProvideNameCheckRepositoryFactory create(Provider<NameCheckApiService> provider, Provider<CoroutineDispatcher> provider2) {
        int i = 2 % 2;
        RepositoryModule_ProvideNameCheckRepositoryFactory repositoryModule_ProvideNameCheckRepositoryFactory = new RepositoryModule_ProvideNameCheckRepositoryFactory(provider, provider2);
        int i2 = copydefault + 15;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return repositoryModule_ProvideNameCheckRepositoryFactory;
    }

    public static TransactionNameCheckRepository provideNameCheckRepository(NameCheckApiService nameCheckApiService, CoroutineDispatcher coroutineDispatcher) {
        TransactionNameCheckRepository transactionNameCheckRepository;
        int i = 2 % 2;
        int i2 = copydefault + 85;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            transactionNameCheckRepository = (TransactionNameCheckRepository) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideNameCheckRepository(nameCheckApiService, coroutineDispatcher));
            int i3 = 79 / 0;
        } else {
            transactionNameCheckRepository = (TransactionNameCheckRepository) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideNameCheckRepository(nameCheckApiService, coroutineDispatcher));
        }
        int i4 = copydefault + 101;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return transactionNameCheckRepository;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
