package com.huawei.digitalpayment.consumer.base.database.di;

import com.huawei.digitalpayment.consumer.base.database.AppDatabase;
import com.huawei.digitalpayment.consumer.base.database.daos.productcatalog.TunukiwaBundleDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class AppDatabaseModule_ProvideTunukiwaBundleDao$ConsumerBaseUi_releaseFactory implements Factory<TunukiwaBundleDao> {
    private static int component2 = 0;
    private static int copydefault = 1;
    private final Provider<AppDatabase> component1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 27;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        TunukiwaBundleDao tunukiwaBundleDao = get();
        int i4 = copydefault + 65;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 32 / 0;
        }
        return tunukiwaBundleDao;
    }

    public AppDatabaseModule_ProvideTunukiwaBundleDao$ConsumerBaseUi_releaseFactory(Provider<AppDatabase> provider) {
        this.component1 = provider;
    }

    @Override
    public TunukiwaBundleDao get() {
        int i = 2 % 2;
        int i2 = component2 + 121;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            provideTunukiwaBundleDao$ConsumerBaseUi_release(this.component1.get());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TunukiwaBundleDao tunukiwaBundleDaoProvideTunukiwaBundleDao$ConsumerBaseUi_release = provideTunukiwaBundleDao$ConsumerBaseUi_release(this.component1.get());
        int i3 = copydefault + 49;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return tunukiwaBundleDaoProvideTunukiwaBundleDao$ConsumerBaseUi_release;
    }

    public static AppDatabaseModule_ProvideTunukiwaBundleDao$ConsumerBaseUi_releaseFactory create(javax.inject.Provider<AppDatabase> provider) {
        int i = 2 % 2;
        AppDatabaseModule_ProvideTunukiwaBundleDao$ConsumerBaseUi_releaseFactory appDatabaseModule_ProvideTunukiwaBundleDao$ConsumerBaseUi_releaseFactory = new AppDatabaseModule_ProvideTunukiwaBundleDao$ConsumerBaseUi_releaseFactory(Providers.asDaggerProvider(provider));
        int i2 = component2 + 71;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return appDatabaseModule_ProvideTunukiwaBundleDao$ConsumerBaseUi_releaseFactory;
    }

    public static AppDatabaseModule_ProvideTunukiwaBundleDao$ConsumerBaseUi_releaseFactory create(Provider<AppDatabase> provider) {
        int i = 2 % 2;
        AppDatabaseModule_ProvideTunukiwaBundleDao$ConsumerBaseUi_releaseFactory appDatabaseModule_ProvideTunukiwaBundleDao$ConsumerBaseUi_releaseFactory = new AppDatabaseModule_ProvideTunukiwaBundleDao$ConsumerBaseUi_releaseFactory(provider);
        int i2 = component2 + 79;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 42 / 0;
        }
        return appDatabaseModule_ProvideTunukiwaBundleDao$ConsumerBaseUi_releaseFactory;
    }

    public static TunukiwaBundleDao provideTunukiwaBundleDao$ConsumerBaseUi_release(AppDatabase appDatabase) {
        TunukiwaBundleDao tunukiwaBundleDao;
        int i = 2 % 2;
        int i2 = copydefault + 113;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            tunukiwaBundleDao = (TunukiwaBundleDao) Preconditions.checkNotNullFromProvides(AppDatabaseModule.INSTANCE.provideTunukiwaBundleDao$ConsumerBaseUi_release(appDatabase));
            int i3 = 81 / 0;
        } else {
            tunukiwaBundleDao = (TunukiwaBundleDao) Preconditions.checkNotNullFromProvides(AppDatabaseModule.INSTANCE.provideTunukiwaBundleDao$ConsumerBaseUi_release(appDatabase));
        }
        int i4 = copydefault + 83;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return tunukiwaBundleDao;
    }
}
