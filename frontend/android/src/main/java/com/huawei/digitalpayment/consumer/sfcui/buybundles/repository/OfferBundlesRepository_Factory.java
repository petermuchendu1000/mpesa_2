package com.huawei.digitalpayment.consumer.sfcui.buybundles.repository;

import com.huawei.digitalpayment.consumer.base.database.daos.productcatalog.OfferBundleDao;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class OfferBundlesRepository_Factory implements Factory<OfferBundlesRepository> {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private final Provider<OfferBundleDao> component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 37;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        OfferBundlesRepository offerBundlesRepository = get();
        int i4 = copydefault + 41;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return offerBundlesRepository;
    }

    public OfferBundlesRepository_Factory(Provider<OfferBundleDao> provider) {
        this.component3 = provider;
    }

    @Override
    public OfferBundlesRepository get() {
        int i = 2 % 2;
        int i2 = copydefault + 115;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        OfferBundlesRepository offerBundlesRepositoryNewInstance = newInstance(this.component3.get());
        int i4 = copydefault + 101;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return offerBundlesRepositoryNewInstance;
    }

    public static OfferBundlesRepository_Factory create(javax.inject.Provider<OfferBundleDao> provider) {
        int i = 2 % 2;
        OfferBundlesRepository_Factory offerBundlesRepository_Factory = new OfferBundlesRepository_Factory(Providers.asDaggerProvider(provider));
        int i2 = copydefault + 51;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 79 / 0;
        }
        return offerBundlesRepository_Factory;
    }

    public static OfferBundlesRepository_Factory create(Provider<OfferBundleDao> provider) {
        int i = 2 % 2;
        OfferBundlesRepository_Factory offerBundlesRepository_Factory = new OfferBundlesRepository_Factory(provider);
        int i2 = copydefault + 75;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return offerBundlesRepository_Factory;
    }

    public static OfferBundlesRepository newInstance(OfferBundleDao offerBundleDao) {
        int i = 2 % 2;
        OfferBundlesRepository offerBundlesRepository = new OfferBundlesRepository(offerBundleDao);
        int i2 = copydefault + 109;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return offerBundlesRepository;
    }
}
