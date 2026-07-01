package com.huawei.digitalpayment.home.viewmodel;

import com.huawei.digitalpayment.home.data.HomeModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class BannerViewModel_Factory implements Factory<BannerViewModel> {
    private static int component1 = 1;
    private static int component3;
    private final Provider<HomeModel> component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 89;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            get();
            throw null;
        }
        BannerViewModel bannerViewModel = get();
        int i3 = component3 + 75;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            return bannerViewModel;
        }
        throw null;
    }

    public BannerViewModel_Factory(Provider<HomeModel> provider) {
        this.component2 = provider;
    }

    @Override
    public BannerViewModel get() {
        int i = 2 % 2;
        int i2 = component1 + 101;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        BannerViewModel bannerViewModelNewInstance = newInstance(this.component2.get());
        int i4 = component1 + 101;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return bannerViewModelNewInstance;
    }

    public static BannerViewModel_Factory create(javax.inject.Provider<HomeModel> provider) {
        int i = 2 % 2;
        BannerViewModel_Factory bannerViewModel_Factory = new BannerViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = component3 + 25;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return bannerViewModel_Factory;
    }

    public static BannerViewModel_Factory create(Provider<HomeModel> provider) {
        int i = 2 % 2;
        BannerViewModel_Factory bannerViewModel_Factory = new BannerViewModel_Factory(provider);
        int i2 = component3 + 103;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return bannerViewModel_Factory;
    }

    public static BannerViewModel newInstance(HomeModel homeModel) {
        int i = 2 % 2;
        BannerViewModel bannerViewModel = new BannerViewModel(homeModel);
        int i2 = component3 + 121;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return bannerViewModel;
    }
}
