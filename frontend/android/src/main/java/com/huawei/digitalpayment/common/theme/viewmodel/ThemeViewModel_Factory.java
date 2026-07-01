package com.huawei.digitalpayment.common.theme.viewmodel;

import com.huawei.digitalpayment.common.theme.model.ThemeModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class ThemeViewModel_Factory implements Factory<ThemeViewModel> {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private final Provider<ThemeModel> component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 61;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            get();
            throw null;
        }
        ThemeViewModel themeViewModel = get();
        int i3 = ShareDataUIState + 77;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return themeViewModel;
    }

    public ThemeViewModel_Factory(Provider<ThemeModel> provider) {
        this.component3 = provider;
    }

    @Override
    public ThemeViewModel get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 117;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ThemeViewModel themeViewModelNewInstance = newInstance(this.component3.get());
        int i4 = component1 + 39;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 35 / 0;
        }
        return themeViewModelNewInstance;
    }

    public static ThemeViewModel_Factory create(javax.inject.Provider<ThemeModel> provider) {
        int i = 2 % 2;
        ThemeViewModel_Factory themeViewModel_Factory = new ThemeViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = component1 + 119;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return themeViewModel_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ThemeViewModel_Factory create(Provider<ThemeModel> provider) {
        int i = 2 % 2;
        ThemeViewModel_Factory themeViewModel_Factory = new ThemeViewModel_Factory(provider);
        int i2 = component1 + 93;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return themeViewModel_Factory;
    }

    public static ThemeViewModel newInstance(ThemeModel themeModel) {
        int i = 2 % 2;
        ThemeViewModel themeViewModel = new ThemeViewModel(themeModel);
        int i2 = component1 + 9;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return themeViewModel;
    }
}
