package com.huawei.digitalpayment.home.theme.viewmodel;

import com.huawei.digitalpayment.home.theme.model.ThemePreviewModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class HomeThemeViewModel_Factory implements Factory<HomeThemeViewModel> {
    private static int component1 = 1;
    private static int component3;
    private final Provider<ThemePreviewModel> copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 15;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        HomeThemeViewModel homeThemeViewModel = get();
        int i4 = component3 + 115;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return homeThemeViewModel;
        }
        throw null;
    }

    public HomeThemeViewModel_Factory(Provider<ThemePreviewModel> provider) {
        this.copydefault = provider;
    }

    @Override
    public HomeThemeViewModel get() {
        int i = 2 % 2;
        int i2 = component1 + 79;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        HomeThemeViewModel homeThemeViewModelNewInstance = newInstance(this.copydefault.get());
        int i4 = component3 + 57;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return homeThemeViewModelNewInstance;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static HomeThemeViewModel_Factory create(javax.inject.Provider<ThemePreviewModel> provider) {
        int i = 2 % 2;
        HomeThemeViewModel_Factory homeThemeViewModel_Factory = new HomeThemeViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = component1 + 7;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return homeThemeViewModel_Factory;
    }

    public static HomeThemeViewModel_Factory create(Provider<ThemePreviewModel> provider) {
        int i = 2 % 2;
        HomeThemeViewModel_Factory homeThemeViewModel_Factory = new HomeThemeViewModel_Factory(provider);
        int i2 = component1 + 113;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return homeThemeViewModel_Factory;
        }
        throw null;
    }

    public static HomeThemeViewModel newInstance(ThemePreviewModel themePreviewModel) {
        int i = 2 % 2;
        HomeThemeViewModel homeThemeViewModel = new HomeThemeViewModel(themePreviewModel);
        int i2 = component3 + 31;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return homeThemeViewModel;
    }
}
