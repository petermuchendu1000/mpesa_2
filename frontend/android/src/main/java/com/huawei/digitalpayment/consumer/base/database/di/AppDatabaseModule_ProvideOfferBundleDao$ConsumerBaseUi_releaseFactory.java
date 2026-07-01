package com.huawei.digitalpayment.consumer.base.database.di;

import com.huawei.digitalpayment.consumer.base.database.AppDatabase;
import com.huawei.digitalpayment.consumer.base.database.daos.productcatalog.OfferBundleDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class AppDatabaseModule_ProvideOfferBundleDao$ConsumerBaseUi_releaseFactory implements Factory<OfferBundleDao> {
    private static int component1 = 1;
    private static int component3;
    private final Provider<AppDatabase> ShareDataUIState;

    @Override
    public Object get() {
        OfferBundleDao offerBundleDao;
        int i = 2 % 2;
        int i2 = component1 + 75;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            offerBundleDao = get();
            int i3 = 74 / 0;
        } else {
            offerBundleDao = get();
        }
        int i4 = component1 + 73;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return offerBundleDao;
    }

    public AppDatabaseModule_ProvideOfferBundleDao$ConsumerBaseUi_releaseFactory(Provider<AppDatabase> provider) {
        this.ShareDataUIState = provider;
    }

    @Override
    public OfferBundleDao get() {
        int i = 2 % 2;
        int i2 = component1 + 31;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        OfferBundleDao offerBundleDaoProvideOfferBundleDao$ConsumerBaseUi_release = provideOfferBundleDao$ConsumerBaseUi_release(this.ShareDataUIState.get());
        if (i3 != 0) {
            int i4 = 93 / 0;
        }
        return offerBundleDaoProvideOfferBundleDao$ConsumerBaseUi_release;
    }

    public static AppDatabaseModule_ProvideOfferBundleDao$ConsumerBaseUi_releaseFactory create(javax.inject.Provider<AppDatabase> provider) {
        int i = 2 % 2;
        AppDatabaseModule_ProvideOfferBundleDao$ConsumerBaseUi_releaseFactory appDatabaseModule_ProvideOfferBundleDao$ConsumerBaseUi_releaseFactory = new AppDatabaseModule_ProvideOfferBundleDao$ConsumerBaseUi_releaseFactory(Providers.asDaggerProvider(provider));
        int i2 = component3 + 19;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 90 / 0;
        }
        return appDatabaseModule_ProvideOfferBundleDao$ConsumerBaseUi_releaseFactory;
    }

    public static AppDatabaseModule_ProvideOfferBundleDao$ConsumerBaseUi_releaseFactory create(Provider<AppDatabase> provider) {
        int i = 2 % 2;
        AppDatabaseModule_ProvideOfferBundleDao$ConsumerBaseUi_releaseFactory appDatabaseModule_ProvideOfferBundleDao$ConsumerBaseUi_releaseFactory = new AppDatabaseModule_ProvideOfferBundleDao$ConsumerBaseUi_releaseFactory(provider);
        int i2 = component3 + 33;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return appDatabaseModule_ProvideOfferBundleDao$ConsumerBaseUi_releaseFactory;
        }
        throw null;
    }

    public static OfferBundleDao provideOfferBundleDao$ConsumerBaseUi_release(AppDatabase appDatabase) {
        int i = 2 % 2;
        int i2 = component3 + 9;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        OfferBundleDao offerBundleDao = (OfferBundleDao) Preconditions.checkNotNullFromProvides(AppDatabaseModule.INSTANCE.provideOfferBundleDao$ConsumerBaseUi_release(appDatabase));
        if (i3 != 0) {
            return offerBundleDao;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
