package com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel;

import com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class ManageFavouriteViewModel_Factory implements Factory<ManageFavouriteViewModel> {
    private static int ShareDataUIState = 1;
    private static int component2;
    private final Provider<MpesaFavoritesRepository> component1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 107;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return get();
        }
        get();
        throw null;
    }

    public ManageFavouriteViewModel_Factory(Provider<MpesaFavoritesRepository> provider) {
        this.component1 = provider;
    }

    @Override
    public ManageFavouriteViewModel get() {
        int i = 2 % 2;
        int i2 = component2 + 93;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ManageFavouriteViewModel manageFavouriteViewModelNewInstance = newInstance(this.component1.get());
        int i4 = ShareDataUIState + 23;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return manageFavouriteViewModelNewInstance;
    }

    public static ManageFavouriteViewModel_Factory create(javax.inject.Provider<MpesaFavoritesRepository> provider) {
        int i = 2 % 2;
        ManageFavouriteViewModel_Factory manageFavouriteViewModel_Factory = new ManageFavouriteViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = ShareDataUIState + 15;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return manageFavouriteViewModel_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ManageFavouriteViewModel_Factory create(Provider<MpesaFavoritesRepository> provider) {
        int i = 2 % 2;
        ManageFavouriteViewModel_Factory manageFavouriteViewModel_Factory = new ManageFavouriteViewModel_Factory(provider);
        int i2 = component2 + 111;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return manageFavouriteViewModel_Factory;
    }

    public static ManageFavouriteViewModel newInstance(MpesaFavoritesRepository mpesaFavoritesRepository) {
        int i = 2 % 2;
        ManageFavouriteViewModel manageFavouriteViewModel = new ManageFavouriteViewModel(mpesaFavoritesRepository);
        int i2 = component2 + 113;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return manageFavouriteViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
