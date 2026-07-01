package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import com.huawei.digitalpayment.consumer.basicUi.model.ChangeLanguageModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class ChangeLanguageViewModel_Factory implements Factory<ChangeLanguageViewModel> {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private final Provider<ChangeLanguageModel> component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 57;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ChangeLanguageViewModel changeLanguageViewModel = get();
        int i4 = component3 + 79;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 27 / 0;
        }
        return changeLanguageViewModel;
    }

    public ChangeLanguageViewModel_Factory(Provider<ChangeLanguageModel> provider) {
        this.component2 = provider;
    }

    @Override
    public ChangeLanguageViewModel get() {
        int i = 2 % 2;
        int i2 = component3 + 11;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ChangeLanguageModel changeLanguageModel = this.component2.get();
        if (i3 == 0) {
            return newInstance(changeLanguageModel);
        }
        int i4 = 81 / 0;
        return newInstance(changeLanguageModel);
    }

    public static ChangeLanguageViewModel_Factory create(javax.inject.Provider<ChangeLanguageModel> provider) {
        int i = 2 % 2;
        ChangeLanguageViewModel_Factory changeLanguageViewModel_Factory = new ChangeLanguageViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = ShareDataUIState + 29;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return changeLanguageViewModel_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ChangeLanguageViewModel_Factory create(Provider<ChangeLanguageModel> provider) {
        int i = 2 % 2;
        ChangeLanguageViewModel_Factory changeLanguageViewModel_Factory = new ChangeLanguageViewModel_Factory(provider);
        int i2 = component3 + 35;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return changeLanguageViewModel_Factory;
    }

    public static ChangeLanguageViewModel newInstance(ChangeLanguageModel changeLanguageModel) {
        int i = 2 % 2;
        ChangeLanguageViewModel changeLanguageViewModel = new ChangeLanguageViewModel(changeLanguageModel);
        int i2 = component3 + 113;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 39 / 0;
        }
        return changeLanguageViewModel;
    }
}
