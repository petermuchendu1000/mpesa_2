package com.huawei.digitalpayment.consumer.base.database.di;

import com.huawei.digitalpayment.consumer.base.database.AppDatabase;
import com.huawei.digitalpayment.consumer.base.database.daos.productcatalog.WithExpiryBundleDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class AppDatabaseModule_ProvideWithExpiryBundleDao$ConsumerBaseUi_releaseFactory implements Factory<WithExpiryBundleDao> {
    private static int component1 = 0;
    private static int copydefault = 1;
    private final Provider<AppDatabase> component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 17;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        WithExpiryBundleDao withExpiryBundleDao = get();
        int i4 = copydefault + 107;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return withExpiryBundleDao;
        }
        throw null;
    }

    public AppDatabaseModule_ProvideWithExpiryBundleDao$ConsumerBaseUi_releaseFactory(Provider<AppDatabase> provider) {
        this.component2 = provider;
    }

    @Override
    public WithExpiryBundleDao get() {
        int i = 2 % 2;
        int i2 = component1 + 117;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        WithExpiryBundleDao withExpiryBundleDaoProvideWithExpiryBundleDao$ConsumerBaseUi_release = provideWithExpiryBundleDao$ConsumerBaseUi_release(this.component2.get());
        int i4 = copydefault + 77;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return withExpiryBundleDaoProvideWithExpiryBundleDao$ConsumerBaseUi_release;
    }

    public static AppDatabaseModule_ProvideWithExpiryBundleDao$ConsumerBaseUi_releaseFactory create(javax.inject.Provider<AppDatabase> provider) {
        int i = 2 % 2;
        AppDatabaseModule_ProvideWithExpiryBundleDao$ConsumerBaseUi_releaseFactory appDatabaseModule_ProvideWithExpiryBundleDao$ConsumerBaseUi_releaseFactory = new AppDatabaseModule_ProvideWithExpiryBundleDao$ConsumerBaseUi_releaseFactory(Providers.asDaggerProvider(provider));
        int i2 = copydefault + 37;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return appDatabaseModule_ProvideWithExpiryBundleDao$ConsumerBaseUi_releaseFactory;
        }
        throw null;
    }

    public static AppDatabaseModule_ProvideWithExpiryBundleDao$ConsumerBaseUi_releaseFactory create(Provider<AppDatabase> provider) {
        int i = 2 % 2;
        AppDatabaseModule_ProvideWithExpiryBundleDao$ConsumerBaseUi_releaseFactory appDatabaseModule_ProvideWithExpiryBundleDao$ConsumerBaseUi_releaseFactory = new AppDatabaseModule_ProvideWithExpiryBundleDao$ConsumerBaseUi_releaseFactory(provider);
        int i2 = copydefault + 1;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return appDatabaseModule_ProvideWithExpiryBundleDao$ConsumerBaseUi_releaseFactory;
    }

    public static WithExpiryBundleDao provideWithExpiryBundleDao$ConsumerBaseUi_release(AppDatabase appDatabase) {
        int i = 2 % 2;
        int i2 = copydefault + 71;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        WithExpiryBundleDao withExpiryBundleDaoProvideWithExpiryBundleDao$ConsumerBaseUi_release = AppDatabaseModule.INSTANCE.provideWithExpiryBundleDao$ConsumerBaseUi_release(appDatabase);
        if (i3 == 0) {
            return (WithExpiryBundleDao) Preconditions.checkNotNullFromProvides(withExpiryBundleDaoProvideWithExpiryBundleDao$ConsumerBaseUi_release);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
