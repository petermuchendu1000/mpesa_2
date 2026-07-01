package com.huawei.digitalpayment.consumer.base.database.di;

import com.huawei.digitalpayment.consumer.base.database.AppDatabase;
import com.huawei.digitalpayment.consumer.base.database.daos.BetaConsentDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class AppDatabaseModule_ProvideConsentDao$ConsumerBaseUi_releaseFactory implements Factory<BetaConsentDao> {
    private static int ShareDataUIState = 1;
    private static int component1;
    private final Provider<AppDatabase> component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 37;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        BetaConsentDao betaConsentDao = get();
        if (i3 != 0) {
            int i4 = 86 / 0;
        }
        return betaConsentDao;
    }

    public AppDatabaseModule_ProvideConsentDao$ConsumerBaseUi_releaseFactory(Provider<AppDatabase> provider) {
        this.component2 = provider;
    }

    @Override
    public BetaConsentDao get() {
        int i = 2 % 2;
        int i2 = component1 + 53;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            provideConsentDao$ConsumerBaseUi_release(this.component2.get());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        BetaConsentDao betaConsentDaoProvideConsentDao$ConsumerBaseUi_release = provideConsentDao$ConsumerBaseUi_release(this.component2.get());
        int i3 = ShareDataUIState + 83;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return betaConsentDaoProvideConsentDao$ConsumerBaseUi_release;
    }

    public static AppDatabaseModule_ProvideConsentDao$ConsumerBaseUi_releaseFactory create(javax.inject.Provider<AppDatabase> provider) {
        int i = 2 % 2;
        AppDatabaseModule_ProvideConsentDao$ConsumerBaseUi_releaseFactory appDatabaseModule_ProvideConsentDao$ConsumerBaseUi_releaseFactory = new AppDatabaseModule_ProvideConsentDao$ConsumerBaseUi_releaseFactory(Providers.asDaggerProvider(provider));
        int i2 = component1 + 93;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return appDatabaseModule_ProvideConsentDao$ConsumerBaseUi_releaseFactory;
    }

    public static AppDatabaseModule_ProvideConsentDao$ConsumerBaseUi_releaseFactory create(Provider<AppDatabase> provider) {
        int i = 2 % 2;
        AppDatabaseModule_ProvideConsentDao$ConsumerBaseUi_releaseFactory appDatabaseModule_ProvideConsentDao$ConsumerBaseUi_releaseFactory = new AppDatabaseModule_ProvideConsentDao$ConsumerBaseUi_releaseFactory(provider);
        int i2 = ShareDataUIState + 17;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return appDatabaseModule_ProvideConsentDao$ConsumerBaseUi_releaseFactory;
    }

    public static BetaConsentDao provideConsentDao$ConsumerBaseUi_release(AppDatabase appDatabase) {
        BetaConsentDao betaConsentDao;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 119;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            betaConsentDao = (BetaConsentDao) Preconditions.checkNotNullFromProvides(AppDatabaseModule.INSTANCE.provideConsentDao$ConsumerBaseUi_release(appDatabase));
            int i3 = 90 / 0;
        } else {
            betaConsentDao = (BetaConsentDao) Preconditions.checkNotNullFromProvides(AppDatabaseModule.INSTANCE.provideConsentDao$ConsumerBaseUi_release(appDatabase));
        }
        int i4 = ShareDataUIState + 59;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return betaConsentDao;
    }
}
