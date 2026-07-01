package com.huawei.digitalpayment.consumer.sfcui.buybundles.repository;

import com.huawei.digitalpayment.consumer.base.database.daos.productcatalog.TunukiwaBundleDao;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class TunukiwaBundlesRepository_Factory implements Factory<TunukiwaBundlesRepository> {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private final Provider<TunukiwaBundleDao> copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 45;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return get();
        }
        get();
        throw null;
    }

    public TunukiwaBundlesRepository_Factory(Provider<TunukiwaBundleDao> provider) {
        this.copydefault = provider;
    }

    @Override
    public TunukiwaBundlesRepository get() {
        int i = 2 % 2;
        int i2 = component2 + 67;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        TunukiwaBundlesRepository tunukiwaBundlesRepositoryNewInstance = newInstance(this.copydefault.get());
        int i4 = component2 + 101;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return tunukiwaBundlesRepositoryNewInstance;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static TunukiwaBundlesRepository_Factory create(javax.inject.Provider<TunukiwaBundleDao> provider) {
        int i = 2 % 2;
        TunukiwaBundlesRepository_Factory tunukiwaBundlesRepository_Factory = new TunukiwaBundlesRepository_Factory(Providers.asDaggerProvider(provider));
        int i2 = component2 + 61;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return tunukiwaBundlesRepository_Factory;
    }

    public static TunukiwaBundlesRepository_Factory create(Provider<TunukiwaBundleDao> provider) {
        int i = 2 % 2;
        TunukiwaBundlesRepository_Factory tunukiwaBundlesRepository_Factory = new TunukiwaBundlesRepository_Factory(provider);
        int i2 = ShareDataUIState + 115;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return tunukiwaBundlesRepository_Factory;
    }

    public static TunukiwaBundlesRepository newInstance(TunukiwaBundleDao tunukiwaBundleDao) {
        int i = 2 % 2;
        TunukiwaBundlesRepository tunukiwaBundlesRepository = new TunukiwaBundlesRepository(tunukiwaBundleDao);
        int i2 = component2 + 83;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return tunukiwaBundlesRepository;
    }
}
