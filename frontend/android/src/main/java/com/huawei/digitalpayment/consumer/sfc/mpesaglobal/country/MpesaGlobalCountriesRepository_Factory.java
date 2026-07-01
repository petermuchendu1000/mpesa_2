package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country;

import com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao;
import com.huawei.digitalpayment.consumer.base.database.daos.CountryCacheMetaDao;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class MpesaGlobalCountriesRepository_Factory implements Factory<MpesaGlobalCountriesRepository> {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private final Provider<CountryCacheMetaDao> component1;
    private final Provider<CountriesDao> component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        MpesaGlobalCountriesRepository mpesaGlobalCountriesRepository = get();
        int i4 = copydefault + 29;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
        return mpesaGlobalCountriesRepository;
    }

    public MpesaGlobalCountriesRepository_Factory(Provider<CountriesDao> provider, Provider<CountryCacheMetaDao> provider2) {
        this.component3 = provider;
        this.component1 = provider2;
    }

    @Override
    public MpesaGlobalCountriesRepository get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 59;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        CountriesDao countriesDao = this.component3.get();
        if (i3 != 0) {
            return newInstance(countriesDao, this.component1.get());
        }
        newInstance(countriesDao, this.component1.get());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static MpesaGlobalCountriesRepository_Factory create(javax.inject.Provider<CountriesDao> provider, javax.inject.Provider<CountryCacheMetaDao> provider2) {
        int i = 2 % 2;
        MpesaGlobalCountriesRepository_Factory mpesaGlobalCountriesRepository_Factory = new MpesaGlobalCountriesRepository_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
        int i2 = copydefault + 125;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return mpesaGlobalCountriesRepository_Factory;
    }

    public static MpesaGlobalCountriesRepository_Factory create(Provider<CountriesDao> provider, Provider<CountryCacheMetaDao> provider2) {
        int i = 2 % 2;
        MpesaGlobalCountriesRepository_Factory mpesaGlobalCountriesRepository_Factory = new MpesaGlobalCountriesRepository_Factory(provider, provider2);
        int i2 = ShareDataUIState + 73;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return mpesaGlobalCountriesRepository_Factory;
    }

    public static MpesaGlobalCountriesRepository newInstance(CountriesDao countriesDao, CountryCacheMetaDao countryCacheMetaDao) {
        int i = 2 % 2;
        MpesaGlobalCountriesRepository mpesaGlobalCountriesRepository = new MpesaGlobalCountriesRepository(countriesDao, countryCacheMetaDao);
        int i2 = copydefault + 71;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return mpesaGlobalCountriesRepository;
    }
}
