package com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites;

import com.huawei.digitalpayment.consumer.base.database.daos.favorite.MpesaFavoriteDao;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class MpesaFavoritesRepository_Factory implements Factory<MpesaFavoritesRepository> {
    private static int component3 = 0;
    private static int copydefault = 1;
    private final Provider<MpesaFavoriteDao> ShareDataUIState;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 23;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return get();
        }
        get();
        throw null;
    }

    public MpesaFavoritesRepository_Factory(Provider<MpesaFavoriteDao> provider) {
        this.ShareDataUIState = provider;
    }

    @Override
    public MpesaFavoritesRepository get() {
        int i = 2 % 2;
        int i2 = copydefault + 55;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        MpesaFavoritesRepository mpesaFavoritesRepositoryNewInstance = newInstance(this.ShareDataUIState.get());
        int i4 = copydefault + 95;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return mpesaFavoritesRepositoryNewInstance;
    }

    public static MpesaFavoritesRepository_Factory create(javax.inject.Provider<MpesaFavoriteDao> provider) {
        int i = 2 % 2;
        MpesaFavoritesRepository_Factory mpesaFavoritesRepository_Factory = new MpesaFavoritesRepository_Factory(Providers.asDaggerProvider(provider));
        int i2 = component3 + 69;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return mpesaFavoritesRepository_Factory;
    }

    public static MpesaFavoritesRepository_Factory create(Provider<MpesaFavoriteDao> provider) {
        int i = 2 % 2;
        MpesaFavoritesRepository_Factory mpesaFavoritesRepository_Factory = new MpesaFavoritesRepository_Factory(provider);
        int i2 = component3 + 21;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return mpesaFavoritesRepository_Factory;
    }

    public static MpesaFavoritesRepository newInstance(MpesaFavoriteDao mpesaFavoriteDao) {
        int i = 2 % 2;
        MpesaFavoritesRepository mpesaFavoritesRepository = new MpesaFavoritesRepository(mpesaFavoriteDao);
        int i2 = copydefault + 117;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return mpesaFavoritesRepository;
    }
}
