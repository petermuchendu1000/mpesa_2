package com.huawei.digitalpayment.common.theme.viewmodel;

import com.huawei.digitalpayment.common.theme.model.BalanceThemeModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class BalanceThemeViewModel_Factory implements Factory<BalanceThemeViewModel> {
    private static int ShareDataUIState = 1;
    private static int component3;
    private final Provider<BalanceThemeModel> copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 61;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return get();
        }
        get();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public BalanceThemeViewModel_Factory(Provider<BalanceThemeModel> provider) {
        this.copydefault = provider;
    }

    @Override
    public BalanceThemeViewModel get() {
        int i = 2 % 2;
        int i2 = component3 + 25;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        BalanceThemeModel balanceThemeModel = this.copydefault.get();
        if (i3 != 0) {
            return newInstance(balanceThemeModel);
        }
        newInstance(balanceThemeModel);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static BalanceThemeViewModel_Factory create(javax.inject.Provider<BalanceThemeModel> provider) {
        int i = 2 % 2;
        BalanceThemeViewModel_Factory balanceThemeViewModel_Factory = new BalanceThemeViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = component3 + 25;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return balanceThemeViewModel_Factory;
    }

    public static BalanceThemeViewModel_Factory create(Provider<BalanceThemeModel> provider) {
        int i = 2 % 2;
        BalanceThemeViewModel_Factory balanceThemeViewModel_Factory = new BalanceThemeViewModel_Factory(provider);
        int i2 = component3 + 105;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return balanceThemeViewModel_Factory;
    }

    public static BalanceThemeViewModel newInstance(BalanceThemeModel balanceThemeModel) {
        int i = 2 % 2;
        BalanceThemeViewModel balanceThemeViewModel = new BalanceThemeViewModel(balanceThemeModel);
        int i2 = component3 + 63;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return balanceThemeViewModel;
    }
}
