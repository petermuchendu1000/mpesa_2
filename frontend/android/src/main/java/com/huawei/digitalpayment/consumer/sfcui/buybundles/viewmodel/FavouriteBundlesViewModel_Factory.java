package com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel;

import com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.FavouriteBundlesRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class FavouriteBundlesViewModel_Factory implements Factory<FavouriteBundlesViewModel> {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private final Provider<FavouriteBundlesRepository> copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            get();
            throw null;
        }
        FavouriteBundlesViewModel favouriteBundlesViewModel = get();
        int i3 = component1 + 97;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            return favouriteBundlesViewModel;
        }
        obj.hashCode();
        throw null;
    }

    public FavouriteBundlesViewModel_Factory(Provider<FavouriteBundlesRepository> provider) {
        this.copydefault = provider;
    }

    @Override
    public FavouriteBundlesViewModel get() {
        int i = 2 % 2;
        int i2 = component1 + 45;
        ShareDataUIState = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            newInstance(this.copydefault.get());
            throw null;
        }
        FavouriteBundlesViewModel favouriteBundlesViewModelNewInstance = newInstance(this.copydefault.get());
        int i3 = ShareDataUIState + 33;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            return favouriteBundlesViewModelNewInstance;
        }
        obj.hashCode();
        throw null;
    }

    public static FavouriteBundlesViewModel_Factory create(javax.inject.Provider<FavouriteBundlesRepository> provider) {
        int i = 2 % 2;
        FavouriteBundlesViewModel_Factory favouriteBundlesViewModel_Factory = new FavouriteBundlesViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = component1 + 5;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return favouriteBundlesViewModel_Factory;
    }

    public static FavouriteBundlesViewModel_Factory create(Provider<FavouriteBundlesRepository> provider) {
        int i = 2 % 2;
        FavouriteBundlesViewModel_Factory favouriteBundlesViewModel_Factory = new FavouriteBundlesViewModel_Factory(provider);
        int i2 = ShareDataUIState + 57;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return favouriteBundlesViewModel_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static FavouriteBundlesViewModel newInstance(FavouriteBundlesRepository favouriteBundlesRepository) {
        int i = 2 % 2;
        FavouriteBundlesViewModel favouriteBundlesViewModel = new FavouriteBundlesViewModel(favouriteBundlesRepository);
        int i2 = ShareDataUIState + 67;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return favouriteBundlesViewModel;
        }
        throw null;
    }
}
