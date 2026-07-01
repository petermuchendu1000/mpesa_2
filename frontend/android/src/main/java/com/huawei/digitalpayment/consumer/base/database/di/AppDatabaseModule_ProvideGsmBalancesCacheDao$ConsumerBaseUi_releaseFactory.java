package com.huawei.digitalpayment.consumer.base.database.di;

import com.huawei.digitalpayment.consumer.base.database.AppDatabase;
import com.huawei.digitalpayment.consumer.base.database.daos.GsmBalancesCacheDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class AppDatabaseModule_ProvideGsmBalancesCacheDao$ConsumerBaseUi_releaseFactory implements Factory<GsmBalancesCacheDao> {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    private final Provider<AppDatabase> component3;

    @Override
    public Object get() {
        GsmBalancesCacheDao gsmBalancesCacheDao;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 95;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            gsmBalancesCacheDao = get();
            int i3 = 14 / 0;
        } else {
            gsmBalancesCacheDao = get();
        }
        int i4 = copydefault + 7;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return gsmBalancesCacheDao;
    }

    public AppDatabaseModule_ProvideGsmBalancesCacheDao$ConsumerBaseUi_releaseFactory(Provider<AppDatabase> provider) {
        this.component3 = provider;
    }

    @Override
    public GsmBalancesCacheDao get() {
        int i = 2 % 2;
        int i2 = copydefault + 13;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        GsmBalancesCacheDao gsmBalancesCacheDaoProvideGsmBalancesCacheDao$ConsumerBaseUi_release = provideGsmBalancesCacheDao$ConsumerBaseUi_release(this.component3.get());
        int i4 = ShareDataUIState + 123;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 69 / 0;
        }
        return gsmBalancesCacheDaoProvideGsmBalancesCacheDao$ConsumerBaseUi_release;
    }

    public static AppDatabaseModule_ProvideGsmBalancesCacheDao$ConsumerBaseUi_releaseFactory create(javax.inject.Provider<AppDatabase> provider) {
        int i = 2 % 2;
        AppDatabaseModule_ProvideGsmBalancesCacheDao$ConsumerBaseUi_releaseFactory appDatabaseModule_ProvideGsmBalancesCacheDao$ConsumerBaseUi_releaseFactory = new AppDatabaseModule_ProvideGsmBalancesCacheDao$ConsumerBaseUi_releaseFactory(Providers.asDaggerProvider(provider));
        int i2 = copydefault + 61;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return appDatabaseModule_ProvideGsmBalancesCacheDao$ConsumerBaseUi_releaseFactory;
    }

    public static AppDatabaseModule_ProvideGsmBalancesCacheDao$ConsumerBaseUi_releaseFactory create(Provider<AppDatabase> provider) {
        int i = 2 % 2;
        AppDatabaseModule_ProvideGsmBalancesCacheDao$ConsumerBaseUi_releaseFactory appDatabaseModule_ProvideGsmBalancesCacheDao$ConsumerBaseUi_releaseFactory = new AppDatabaseModule_ProvideGsmBalancesCacheDao$ConsumerBaseUi_releaseFactory(provider);
        int i2 = copydefault + 29;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return appDatabaseModule_ProvideGsmBalancesCacheDao$ConsumerBaseUi_releaseFactory;
        }
        throw null;
    }

    public static GsmBalancesCacheDao provideGsmBalancesCacheDao$ConsumerBaseUi_release(AppDatabase appDatabase) {
        GsmBalancesCacheDao gsmBalancesCacheDao;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 99;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            gsmBalancesCacheDao = (GsmBalancesCacheDao) Preconditions.checkNotNullFromProvides(AppDatabaseModule.INSTANCE.provideGsmBalancesCacheDao$ConsumerBaseUi_release(appDatabase));
            int i3 = 90 / 0;
        } else {
            gsmBalancesCacheDao = (GsmBalancesCacheDao) Preconditions.checkNotNullFromProvides(AppDatabaseModule.INSTANCE.provideGsmBalancesCacheDao$ConsumerBaseUi_release(appDatabase));
        }
        int i4 = copydefault + 61;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return gsmBalancesCacheDao;
    }
}
