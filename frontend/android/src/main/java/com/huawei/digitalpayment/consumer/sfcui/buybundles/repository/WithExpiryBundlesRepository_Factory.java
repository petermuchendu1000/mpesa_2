package com.huawei.digitalpayment.consumer.sfcui.buybundles.repository;

import com.huawei.digitalpayment.consumer.base.database.daos.productcatalog.WithExpiryBundleDao;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class WithExpiryBundlesRepository_Factory implements Factory<WithExpiryBundlesRepository> {
    private static int ShareDataUIState = 1;
    private static int component2;
    private final Provider<WithExpiryBundleDao> component1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 91;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        WithExpiryBundlesRepository withExpiryBundlesRepository = get();
        int i4 = ShareDataUIState + 119;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return withExpiryBundlesRepository;
    }

    public WithExpiryBundlesRepository_Factory(Provider<WithExpiryBundleDao> provider) {
        this.component1 = provider;
    }

    @Override
    public WithExpiryBundlesRepository get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 113;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            newInstance(this.component1.get());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        WithExpiryBundlesRepository withExpiryBundlesRepositoryNewInstance = newInstance(this.component1.get());
        int i3 = component2 + 87;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return withExpiryBundlesRepositoryNewInstance;
    }

    public static WithExpiryBundlesRepository_Factory create(javax.inject.Provider<WithExpiryBundleDao> provider) {
        int i = 2 % 2;
        WithExpiryBundlesRepository_Factory withExpiryBundlesRepository_Factory = new WithExpiryBundlesRepository_Factory(Providers.asDaggerProvider(provider));
        int i2 = ShareDataUIState + 41;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 73 / 0;
        }
        return withExpiryBundlesRepository_Factory;
    }

    public static WithExpiryBundlesRepository_Factory create(Provider<WithExpiryBundleDao> provider) {
        int i = 2 % 2;
        WithExpiryBundlesRepository_Factory withExpiryBundlesRepository_Factory = new WithExpiryBundlesRepository_Factory(provider);
        int i2 = ShareDataUIState + 11;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return withExpiryBundlesRepository_Factory;
        }
        throw null;
    }

    public static WithExpiryBundlesRepository newInstance(WithExpiryBundleDao withExpiryBundleDao) {
        int i = 2 % 2;
        WithExpiryBundlesRepository withExpiryBundlesRepository = new WithExpiryBundlesRepository(withExpiryBundleDao);
        int i2 = ShareDataUIState + 119;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return withExpiryBundlesRepository;
    }
}
