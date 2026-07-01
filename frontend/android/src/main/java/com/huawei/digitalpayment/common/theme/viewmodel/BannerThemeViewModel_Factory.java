package com.huawei.digitalpayment.common.theme.viewmodel;

import com.huawei.digitalpayment.common.theme.model.BannerThemeModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class BannerThemeViewModel_Factory implements Factory<BannerThemeViewModel> {
    private static int component2 = 0;
    private static int copydefault = 1;
    private final Provider<BannerThemeModel> component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 45;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        BannerThemeViewModel bannerThemeViewModel = get();
        int i4 = component2 + 99;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return bannerThemeViewModel;
    }

    public BannerThemeViewModel_Factory(Provider<BannerThemeModel> provider) {
        this.component3 = provider;
    }

    @Override
    public BannerThemeViewModel get() {
        int i = 2 % 2;
        int i2 = copydefault + 19;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            newInstance(this.component3.get());
            throw null;
        }
        BannerThemeViewModel bannerThemeViewModelNewInstance = newInstance(this.component3.get());
        int i3 = copydefault + 65;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return bannerThemeViewModelNewInstance;
    }

    public static BannerThemeViewModel_Factory create(javax.inject.Provider<BannerThemeModel> provider) {
        int i = 2 % 2;
        BannerThemeViewModel_Factory bannerThemeViewModel_Factory = new BannerThemeViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = component2 + 81;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return bannerThemeViewModel_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static BannerThemeViewModel_Factory create(Provider<BannerThemeModel> provider) {
        int i = 2 % 2;
        BannerThemeViewModel_Factory bannerThemeViewModel_Factory = new BannerThemeViewModel_Factory(provider);
        int i2 = copydefault + 77;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return bannerThemeViewModel_Factory;
        }
        throw null;
    }

    public static BannerThemeViewModel newInstance(BannerThemeModel bannerThemeModel) {
        int i = 2 % 2;
        BannerThemeViewModel bannerThemeViewModel = new BannerThemeViewModel(bannerThemeModel);
        int i2 = copydefault + 101;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return bannerThemeViewModel;
    }
}
