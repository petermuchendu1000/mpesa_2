package com.huawei.digitalpayment.consumer.sfcui.buybundles.repository;

import com.huawei.digitalpayment.consumer.sfcui.api.FavouriteBundlesService;
import com.huawei.digitalpayment.consumer.sfcui.local.FavouriteBundlesLocalDataSource;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class FavouriteBundlesRepositoryImpl_Factory implements Factory<FavouriteBundlesRepositoryImpl> {
    private static int component2 = 0;
    private static int copydefault = 1;
    private final Provider<FavouriteBundlesLocalDataSource> ShareDataUIState;
    private final Provider<FavouriteBundlesService> component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 121;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            get();
            throw null;
        }
        FavouriteBundlesRepositoryImpl favouriteBundlesRepositoryImpl = get();
        int i3 = component2 + 95;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return favouriteBundlesRepositoryImpl;
    }

    public FavouriteBundlesRepositoryImpl_Factory(Provider<FavouriteBundlesService> provider, Provider<FavouriteBundlesLocalDataSource> provider2) {
        this.component3 = provider;
        this.ShareDataUIState = provider2;
    }

    @Override
    public FavouriteBundlesRepositoryImpl get() {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FavouriteBundlesRepositoryImpl favouriteBundlesRepositoryImplNewInstance = newInstance(this.component3.get(), this.ShareDataUIState.get());
        int i4 = component2 + 65;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 32 / 0;
        }
        return favouriteBundlesRepositoryImplNewInstance;
    }

    public static FavouriteBundlesRepositoryImpl_Factory create(javax.inject.Provider<FavouriteBundlesService> provider, javax.inject.Provider<FavouriteBundlesLocalDataSource> provider2) {
        int i = 2 % 2;
        FavouriteBundlesRepositoryImpl_Factory favouriteBundlesRepositoryImpl_Factory = new FavouriteBundlesRepositoryImpl_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
        int i2 = copydefault + 37;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return favouriteBundlesRepositoryImpl_Factory;
    }

    public static FavouriteBundlesRepositoryImpl_Factory create(Provider<FavouriteBundlesService> provider, Provider<FavouriteBundlesLocalDataSource> provider2) {
        int i = 2 % 2;
        FavouriteBundlesRepositoryImpl_Factory favouriteBundlesRepositoryImpl_Factory = new FavouriteBundlesRepositoryImpl_Factory(provider, provider2);
        int i2 = copydefault + 75;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return favouriteBundlesRepositoryImpl_Factory;
    }

    public static FavouriteBundlesRepositoryImpl newInstance(FavouriteBundlesService favouriteBundlesService, FavouriteBundlesLocalDataSource favouriteBundlesLocalDataSource) {
        int i = 2 % 2;
        FavouriteBundlesRepositoryImpl favouriteBundlesRepositoryImpl = new FavouriteBundlesRepositoryImpl(favouriteBundlesService, favouriteBundlesLocalDataSource);
        int i2 = component2 + 45;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return favouriteBundlesRepositoryImpl;
        }
        throw null;
    }
}
