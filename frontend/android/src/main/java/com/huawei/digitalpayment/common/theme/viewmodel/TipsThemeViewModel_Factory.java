package com.huawei.digitalpayment.common.theme.viewmodel;

import com.huawei.digitalpayment.common.theme.model.TipsThemeModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class TipsThemeViewModel_Factory implements Factory<TipsThemeViewModel> {
    private static int ShareDataUIState = 1;
    private static int component2;
    private final Provider<TipsThemeModel> component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 97;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        TipsThemeViewModel tipsThemeViewModel = get();
        int i4 = ShareDataUIState + 75;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return tipsThemeViewModel;
    }

    public TipsThemeViewModel_Factory(Provider<TipsThemeModel> provider) {
        this.component3 = provider;
    }

    @Override
    public TipsThemeViewModel get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 71;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        TipsThemeViewModel tipsThemeViewModelNewInstance = newInstance(this.component3.get());
        int i4 = ShareDataUIState + 103;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return tipsThemeViewModelNewInstance;
    }

    public static TipsThemeViewModel_Factory create(javax.inject.Provider<TipsThemeModel> provider) {
        int i = 2 % 2;
        TipsThemeViewModel_Factory tipsThemeViewModel_Factory = new TipsThemeViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = component2 + 9;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return tipsThemeViewModel_Factory;
    }

    public static TipsThemeViewModel_Factory create(Provider<TipsThemeModel> provider) {
        int i = 2 % 2;
        TipsThemeViewModel_Factory tipsThemeViewModel_Factory = new TipsThemeViewModel_Factory(provider);
        int i2 = ShareDataUIState + 35;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return tipsThemeViewModel_Factory;
    }

    public static TipsThemeViewModel newInstance(TipsThemeModel tipsThemeModel) {
        int i = 2 % 2;
        TipsThemeViewModel tipsThemeViewModel = new TipsThemeViewModel(tipsThemeModel);
        int i2 = component2 + 23;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 51 / 0;
        }
        return tipsThemeViewModel;
    }
}
