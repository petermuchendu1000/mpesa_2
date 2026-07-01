package com.huawei.digitalpayment.consumer.sfcui.buybundles.repository;

import com.huawei.digitalpayment.consumer.base.database.AppDatabase;
import com.huawei.digitalpayment.consumer.base.database.daos.neobundles.NeoBundlesDao;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class NeoBundlesRepository_Factory implements Factory<NeoBundlesRepository> {
    private static int component1 = 1;
    private static int component3;
    private final Provider<NeoBundlesDao> ShareDataUIState;
    private final Provider<AppDatabase> component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 43;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        NeoBundlesRepository neoBundlesRepository = get();
        int i4 = component1 + 99;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return neoBundlesRepository;
    }

    public NeoBundlesRepository_Factory(Provider<NeoBundlesDao> provider, Provider<AppDatabase> provider2) {
        this.ShareDataUIState = provider;
        this.component2 = provider2;
    }

    @Override
    public NeoBundlesRepository get() {
        int i = 2 % 2;
        int i2 = component1 + 9;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        NeoBundlesRepository neoBundlesRepositoryNewInstance = newInstance(this.ShareDataUIState.get(), this.component2.get());
        int i4 = component3 + 71;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return neoBundlesRepositoryNewInstance;
    }

    public static NeoBundlesRepository_Factory create(javax.inject.Provider<NeoBundlesDao> provider, javax.inject.Provider<AppDatabase> provider2) {
        int i = 2 % 2;
        NeoBundlesRepository_Factory neoBundlesRepository_Factory = new NeoBundlesRepository_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
        int i2 = component1 + 111;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 71 / 0;
        }
        return neoBundlesRepository_Factory;
    }

    public static NeoBundlesRepository_Factory create(Provider<NeoBundlesDao> provider, Provider<AppDatabase> provider2) {
        int i = 2 % 2;
        NeoBundlesRepository_Factory neoBundlesRepository_Factory = new NeoBundlesRepository_Factory(provider, provider2);
        int i2 = component1 + 107;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return neoBundlesRepository_Factory;
        }
        throw null;
    }

    public static NeoBundlesRepository newInstance(NeoBundlesDao neoBundlesDao, AppDatabase appDatabase) {
        int i = 2 % 2;
        NeoBundlesRepository neoBundlesRepository = new NeoBundlesRepository(neoBundlesDao, appDatabase);
        int i2 = component1 + 99;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return neoBundlesRepository;
    }
}
