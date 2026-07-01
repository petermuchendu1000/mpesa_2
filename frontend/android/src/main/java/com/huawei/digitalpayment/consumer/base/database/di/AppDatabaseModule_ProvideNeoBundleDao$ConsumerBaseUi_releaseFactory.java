package com.huawei.digitalpayment.consumer.base.database.di;

import com.huawei.digitalpayment.consumer.base.database.AppDatabase;
import com.huawei.digitalpayment.consumer.base.database.daos.neobundles.NeoBundlesDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class AppDatabaseModule_ProvideNeoBundleDao$ConsumerBaseUi_releaseFactory implements Factory<NeoBundlesDao> {
    private static int component1 = 0;
    private static int copydefault = 1;
    private final Provider<AppDatabase> ShareDataUIState;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 5;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        NeoBundlesDao neoBundlesDao = get();
        int i4 = copydefault + 75;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return neoBundlesDao;
        }
        throw null;
    }

    public AppDatabaseModule_ProvideNeoBundleDao$ConsumerBaseUi_releaseFactory(Provider<AppDatabase> provider) {
        this.ShareDataUIState = provider;
    }

    @Override
    public NeoBundlesDao get() {
        int i = 2 % 2;
        int i2 = component1 + 89;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        NeoBundlesDao neoBundlesDaoProvideNeoBundleDao$ConsumerBaseUi_release = provideNeoBundleDao$ConsumerBaseUi_release(this.ShareDataUIState.get());
        if (i3 == 0) {
            int i4 = 43 / 0;
        }
        return neoBundlesDaoProvideNeoBundleDao$ConsumerBaseUi_release;
    }

    public static AppDatabaseModule_ProvideNeoBundleDao$ConsumerBaseUi_releaseFactory create(javax.inject.Provider<AppDatabase> provider) {
        int i = 2 % 2;
        AppDatabaseModule_ProvideNeoBundleDao$ConsumerBaseUi_releaseFactory appDatabaseModule_ProvideNeoBundleDao$ConsumerBaseUi_releaseFactory = new AppDatabaseModule_ProvideNeoBundleDao$ConsumerBaseUi_releaseFactory(Providers.asDaggerProvider(provider));
        int i2 = copydefault + 105;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return appDatabaseModule_ProvideNeoBundleDao$ConsumerBaseUi_releaseFactory;
        }
        throw null;
    }

    public static AppDatabaseModule_ProvideNeoBundleDao$ConsumerBaseUi_releaseFactory create(Provider<AppDatabase> provider) {
        int i = 2 % 2;
        AppDatabaseModule_ProvideNeoBundleDao$ConsumerBaseUi_releaseFactory appDatabaseModule_ProvideNeoBundleDao$ConsumerBaseUi_releaseFactory = new AppDatabaseModule_ProvideNeoBundleDao$ConsumerBaseUi_releaseFactory(provider);
        int i2 = copydefault + 33;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return appDatabaseModule_ProvideNeoBundleDao$ConsumerBaseUi_releaseFactory;
        }
        throw null;
    }

    public static NeoBundlesDao provideNeoBundleDao$ConsumerBaseUi_release(AppDatabase appDatabase) {
        int i = 2 % 2;
        int i2 = copydefault + 31;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        NeoBundlesDao neoBundlesDao = (NeoBundlesDao) Preconditions.checkNotNullFromProvides(AppDatabaseModule.INSTANCE.provideNeoBundleDao$ConsumerBaseUi_release(appDatabase));
        int i4 = component1 + 9;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return neoBundlesDao;
        }
        throw null;
    }
}
