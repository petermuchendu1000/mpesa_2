package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import com.huawei.digitalpayment.consumer.basicUi.model.AboutModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class AboutViewModel_Factory implements Factory<AboutViewModel> {
    private static int ShareDataUIState = 1;
    private static int component1;
    private final Provider<AboutModel> component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 59;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            get();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        AboutViewModel aboutViewModel = get();
        int i3 = ShareDataUIState + 79;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 68 / 0;
        }
        return aboutViewModel;
    }

    public AboutViewModel_Factory(Provider<AboutModel> provider) {
        this.component2 = provider;
    }

    @Override
    public AboutViewModel get() {
        int i = 2 % 2;
        int i2 = component1 + 1;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        AboutModel aboutModel = this.component2.get();
        if (i3 != 0) {
            return newInstance(aboutModel);
        }
        newInstance(aboutModel);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static AboutViewModel_Factory create(javax.inject.Provider<AboutModel> provider) {
        int i = 2 % 2;
        AboutViewModel_Factory aboutViewModel_Factory = new AboutViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = ShareDataUIState + 121;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return aboutViewModel_Factory;
    }

    public static AboutViewModel_Factory create(Provider<AboutModel> provider) {
        int i = 2 % 2;
        AboutViewModel_Factory aboutViewModel_Factory = new AboutViewModel_Factory(provider);
        int i2 = ShareDataUIState + 113;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return aboutViewModel_Factory;
    }

    public static AboutViewModel newInstance(AboutModel aboutModel) {
        int i = 2 % 2;
        AboutViewModel aboutViewModel = new AboutViewModel(aboutModel);
        int i2 = component1 + 77;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return aboutViewModel;
        }
        throw null;
    }
}
