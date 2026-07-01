package com.huawei.digitalpayment.common.theme.viewmodel;

import com.huawei.digitalpayment.common.theme.model.ThemePreviewModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class ThemePreviewViewModel_Factory implements Factory<ThemePreviewViewModel> {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private final Provider<ThemePreviewModel> component2;

    @Override
    public Object get() {
        ThemePreviewViewModel themePreviewViewModel;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 75;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            themePreviewViewModel = get();
            int i3 = 32 / 0;
        } else {
            themePreviewViewModel = get();
        }
        int i4 = ShareDataUIState + 1;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return themePreviewViewModel;
    }

    public ThemePreviewViewModel_Factory(Provider<ThemePreviewModel> provider) {
        this.component2 = provider;
    }

    @Override
    public ThemePreviewViewModel get() {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ThemePreviewViewModel themePreviewViewModelNewInstance = newInstance(this.component2.get());
        int i4 = ShareDataUIState + 43;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return themePreviewViewModelNewInstance;
    }

    public static ThemePreviewViewModel_Factory create(javax.inject.Provider<ThemePreviewModel> provider) {
        int i = 2 % 2;
        ThemePreviewViewModel_Factory themePreviewViewModel_Factory = new ThemePreviewViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = ShareDataUIState + 61;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return themePreviewViewModel_Factory;
    }

    public static ThemePreviewViewModel_Factory create(Provider<ThemePreviewModel> provider) {
        int i = 2 % 2;
        ThemePreviewViewModel_Factory themePreviewViewModel_Factory = new ThemePreviewViewModel_Factory(provider);
        int i2 = copydefault + 71;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return themePreviewViewModel_Factory;
        }
        throw null;
    }

    public static ThemePreviewViewModel newInstance(ThemePreviewModel themePreviewModel) {
        int i = 2 % 2;
        ThemePreviewViewModel themePreviewViewModel = new ThemePreviewViewModel(themePreviewModel);
        int i2 = copydefault + 41;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return themePreviewViewModel;
        }
        throw null;
    }
}
