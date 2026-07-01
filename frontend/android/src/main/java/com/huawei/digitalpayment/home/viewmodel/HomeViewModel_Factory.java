package com.huawei.digitalpayment.home.viewmodel;

import com.huawei.digitalpayment.home.data.HomeModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
    private static int component2 = 1;
    private static int component3;
    private final Provider<HomeModel> ShareDataUIState;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 45;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        HomeViewModel homeViewModel = get();
        int i4 = component3 + 43;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return homeViewModel;
    }

    public HomeViewModel_Factory(Provider<HomeModel> provider) {
        this.ShareDataUIState = provider;
    }

    @Override
    public HomeViewModel get() {
        int i = 2 % 2;
        int i2 = component3 + 73;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            newInstance(this.ShareDataUIState.get());
            throw null;
        }
        HomeViewModel homeViewModelNewInstance = newInstance(this.ShareDataUIState.get());
        int i3 = component2 + 87;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return homeViewModelNewInstance;
    }

    public static HomeViewModel_Factory create(javax.inject.Provider<HomeModel> provider) {
        int i = 2 % 2;
        HomeViewModel_Factory homeViewModel_Factory = new HomeViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = component2 + 123;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return homeViewModel_Factory;
    }

    public static HomeViewModel_Factory create(Provider<HomeModel> provider) {
        int i = 2 % 2;
        HomeViewModel_Factory homeViewModel_Factory = new HomeViewModel_Factory(provider);
        int i2 = component3 + 123;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 61 / 0;
        }
        return homeViewModel_Factory;
    }

    public static HomeViewModel newInstance(HomeModel homeModel) {
        int i = 2 % 2;
        HomeViewModel homeViewModel = new HomeViewModel(homeModel);
        int i2 = component2 + 1;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return homeViewModel;
    }
}
