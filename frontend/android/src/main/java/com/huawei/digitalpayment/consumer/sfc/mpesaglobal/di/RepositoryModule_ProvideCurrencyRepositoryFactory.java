package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.di;

import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.CurrencyRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class RepositoryModule_ProvideCurrencyRepositoryFactory implements Factory<CurrencyRepository> {
    private static int component2 = 0;
    private static int component3 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 117;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return get();
        }
        get();
        throw null;
    }

    @Override
    public CurrencyRepository get() {
        int i = 2 % 2;
        int i2 = component3 + 79;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            provideCurrencyRepository();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        CurrencyRepository currencyRepositoryProvideCurrencyRepository = provideCurrencyRepository();
        int i3 = component3 + 119;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return currencyRepositoryProvideCurrencyRepository;
    }

    public static RepositoryModule_ProvideCurrencyRepositoryFactory create() {
        int i = 2 % 2;
        int i2 = component3 + 83;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        RepositoryModule_ProvideCurrencyRepositoryFactory repositoryModule_ProvideCurrencyRepositoryFactory = component1.component1;
        int i4 = component3 + 11;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return repositoryModule_ProvideCurrencyRepositoryFactory;
    }

    public static CurrencyRepository provideCurrencyRepository() {
        int i = 2 % 2;
        int i2 = component2 + 67;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        CurrencyRepository currencyRepositoryProvideCurrencyRepository = RepositoryModule.INSTANCE.provideCurrencyRepository();
        if (i3 != 0) {
            return (CurrencyRepository) Preconditions.checkNotNullFromProvides(currencyRepositoryProvideCurrencyRepository);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class component1 {
        static final RepositoryModule_ProvideCurrencyRepositoryFactory component1 = new RepositoryModule_ProvideCurrencyRepositoryFactory();
        private static int component2 = 1;
        private static int component3;

        private component1() {
        }

        static {
            int i = component3 + 19;
            component2 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }
}
