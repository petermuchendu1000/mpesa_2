package com.huawei.digitalpayment.consumer.base.database.di;

import com.huawei.digitalpayment.consumer.base.database.AppDatabase;
import com.huawei.digitalpayment.consumer.base.database.daos.CountryCacheMetaDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class AppDatabaseModule_ProvideCountryCacheMetaDao$ConsumerBaseUi_releaseFactory implements Factory<CountryCacheMetaDao> {
    private static int component1 = 0;
    private static int component3 = 1;
    private final Provider<AppDatabase> ShareDataUIState;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 49;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        CountryCacheMetaDao countryCacheMetaDao = get();
        int i4 = component1 + 67;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return countryCacheMetaDao;
    }

    public AppDatabaseModule_ProvideCountryCacheMetaDao$ConsumerBaseUi_releaseFactory(Provider<AppDatabase> provider) {
        this.ShareDataUIState = provider;
    }

    @Override
    public CountryCacheMetaDao get() {
        int i = 2 % 2;
        int i2 = component1 + 65;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        CountryCacheMetaDao countryCacheMetaDaoProvideCountryCacheMetaDao$ConsumerBaseUi_release = provideCountryCacheMetaDao$ConsumerBaseUi_release(this.ShareDataUIState.get());
        int i4 = component3 + 13;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return countryCacheMetaDaoProvideCountryCacheMetaDao$ConsumerBaseUi_release;
    }

    public static AppDatabaseModule_ProvideCountryCacheMetaDao$ConsumerBaseUi_releaseFactory create(javax.inject.Provider<AppDatabase> provider) {
        int i = 2 % 2;
        AppDatabaseModule_ProvideCountryCacheMetaDao$ConsumerBaseUi_releaseFactory appDatabaseModule_ProvideCountryCacheMetaDao$ConsumerBaseUi_releaseFactory = new AppDatabaseModule_ProvideCountryCacheMetaDao$ConsumerBaseUi_releaseFactory(Providers.asDaggerProvider(provider));
        int i2 = component1 + 31;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 60 / 0;
        }
        return appDatabaseModule_ProvideCountryCacheMetaDao$ConsumerBaseUi_releaseFactory;
    }

    public static AppDatabaseModule_ProvideCountryCacheMetaDao$ConsumerBaseUi_releaseFactory create(Provider<AppDatabase> provider) {
        int i = 2 % 2;
        AppDatabaseModule_ProvideCountryCacheMetaDao$ConsumerBaseUi_releaseFactory appDatabaseModule_ProvideCountryCacheMetaDao$ConsumerBaseUi_releaseFactory = new AppDatabaseModule_ProvideCountryCacheMetaDao$ConsumerBaseUi_releaseFactory(provider);
        int i2 = component3 + 45;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return appDatabaseModule_ProvideCountryCacheMetaDao$ConsumerBaseUi_releaseFactory;
    }

    public static CountryCacheMetaDao provideCountryCacheMetaDao$ConsumerBaseUi_release(AppDatabase appDatabase) {
        int i = 2 % 2;
        int i2 = component3 + 27;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        CountryCacheMetaDao countryCacheMetaDao = (CountryCacheMetaDao) Preconditions.checkNotNullFromProvides(AppDatabaseModule.INSTANCE.provideCountryCacheMetaDao$ConsumerBaseUi_release(appDatabase));
        int i3 = component3 + 79;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            return countryCacheMetaDao;
        }
        obj.hashCode();
        throw null;
    }
}
