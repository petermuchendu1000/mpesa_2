package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.di;

import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.BalanceRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlinx.coroutines.CoroutineDispatcher;

public final class RepositoryModule_ProvideBalanceRepositoryFactory implements Factory<BalanceRepository> {
    private static int component2 = 0;
    private static int copydefault = 1;
    private final Provider<CoroutineDispatcher> component1;

    @Override
    public Object get() {
        BalanceRepository balanceRepository;
        int i = 2 % 2;
        int i2 = copydefault + 77;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            balanceRepository = get();
            int i3 = 75 / 0;
        } else {
            balanceRepository = get();
        }
        int i4 = copydefault + 53;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return balanceRepository;
    }

    public RepositoryModule_ProvideBalanceRepositoryFactory(Provider<CoroutineDispatcher> provider) {
        this.component1 = provider;
    }

    @Override
    public BalanceRepository get() {
        int i = 2 % 2;
        int i2 = copydefault + 75;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            provideBalanceRepository(this.component1.get());
            throw null;
        }
        BalanceRepository balanceRepositoryProvideBalanceRepository = provideBalanceRepository(this.component1.get());
        int i3 = copydefault + 65;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return balanceRepositoryProvideBalanceRepository;
    }

    public static RepositoryModule_ProvideBalanceRepositoryFactory create(javax.inject.Provider<CoroutineDispatcher> provider) {
        int i = 2 % 2;
        RepositoryModule_ProvideBalanceRepositoryFactory repositoryModule_ProvideBalanceRepositoryFactory = new RepositoryModule_ProvideBalanceRepositoryFactory(Providers.asDaggerProvider(provider));
        int i2 = component2 + 41;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return repositoryModule_ProvideBalanceRepositoryFactory;
        }
        throw null;
    }

    public static RepositoryModule_ProvideBalanceRepositoryFactory create(Provider<CoroutineDispatcher> provider) {
        int i = 2 % 2;
        RepositoryModule_ProvideBalanceRepositoryFactory repositoryModule_ProvideBalanceRepositoryFactory = new RepositoryModule_ProvideBalanceRepositoryFactory(provider);
        int i2 = component2 + 17;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 89 / 0;
        }
        return repositoryModule_ProvideBalanceRepositoryFactory;
    }

    public static BalanceRepository provideBalanceRepository(CoroutineDispatcher coroutineDispatcher) {
        int i = 2 % 2;
        int i2 = component2 + 75;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        BalanceRepository balanceRepository = (BalanceRepository) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideBalanceRepository(coroutineDispatcher));
        int i4 = component2 + 33;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return balanceRepository;
    }
}
