package com.huawei.digitalpayment.consumer.base.database.di;

import com.huawei.digitalpayment.consumer.base.database.AppDatabase;
import com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class AppDatabaseModule_ProvideCountriesDao$ConsumerBaseUi_releaseFactory implements Factory<CountriesDao> {
    private static int ShareDataUIState = 1;
    private static int component1;
    private final Provider<AppDatabase> copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 61;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        CountriesDao countriesDao = get();
        if (i3 != 0) {
            int i4 = 95 / 0;
        }
        return countriesDao;
    }

    public AppDatabaseModule_ProvideCountriesDao$ConsumerBaseUi_releaseFactory(Provider<AppDatabase> provider) {
        this.copydefault = provider;
    }

    @Override
    public CountriesDao get() {
        int i = 2 % 2;
        int i2 = component1 + 1;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        CountriesDao countriesDaoProvideCountriesDao$ConsumerBaseUi_release = provideCountriesDao$ConsumerBaseUi_release(this.copydefault.get());
        int i4 = ShareDataUIState + 81;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return countriesDaoProvideCountriesDao$ConsumerBaseUi_release;
    }

    public static AppDatabaseModule_ProvideCountriesDao$ConsumerBaseUi_releaseFactory create(javax.inject.Provider<AppDatabase> provider) {
        int i = 2 % 2;
        AppDatabaseModule_ProvideCountriesDao$ConsumerBaseUi_releaseFactory appDatabaseModule_ProvideCountriesDao$ConsumerBaseUi_releaseFactory = new AppDatabaseModule_ProvideCountriesDao$ConsumerBaseUi_releaseFactory(Providers.asDaggerProvider(provider));
        int i2 = ShareDataUIState + 91;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return appDatabaseModule_ProvideCountriesDao$ConsumerBaseUi_releaseFactory;
        }
        throw null;
    }

    public static AppDatabaseModule_ProvideCountriesDao$ConsumerBaseUi_releaseFactory create(Provider<AppDatabase> provider) {
        int i = 2 % 2;
        AppDatabaseModule_ProvideCountriesDao$ConsumerBaseUi_releaseFactory appDatabaseModule_ProvideCountriesDao$ConsumerBaseUi_releaseFactory = new AppDatabaseModule_ProvideCountriesDao$ConsumerBaseUi_releaseFactory(provider);
        int i2 = ShareDataUIState + 99;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return appDatabaseModule_ProvideCountriesDao$ConsumerBaseUi_releaseFactory;
    }

    public static CountriesDao provideCountriesDao$ConsumerBaseUi_release(AppDatabase appDatabase) {
        int i = 2 % 2;
        int i2 = component1 + 103;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        CountriesDao countriesDao = (CountriesDao) Preconditions.checkNotNullFromProvides(AppDatabaseModule.INSTANCE.provideCountriesDao$ConsumerBaseUi_release(appDatabase));
        int i4 = ShareDataUIState + 87;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
        return countriesDao;
    }
}
