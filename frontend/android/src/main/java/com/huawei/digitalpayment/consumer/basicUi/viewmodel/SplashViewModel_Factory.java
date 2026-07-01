package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import com.huawei.digitalpayment.consumer.basicUi.model.DefaultSplashModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class SplashViewModel_Factory implements Factory<SplashViewModel> {
    private static int component3 = 1;
    private static int copydefault;
    private final Provider<DefaultSplashModel> component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 81;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return get();
        }
        get();
        throw null;
    }

    public SplashViewModel_Factory(Provider<DefaultSplashModel> provider) {
        this.component2 = provider;
    }

    @Override
    public SplashViewModel get() {
        int i = 2 % 2;
        int i2 = component3 + 67;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DefaultSplashModel defaultSplashModel = this.component2.get();
        if (i3 == 0) {
            return newInstance(defaultSplashModel);
        }
        newInstance(defaultSplashModel);
        throw null;
    }

    public static SplashViewModel_Factory create(javax.inject.Provider<DefaultSplashModel> provider) {
        int i = 2 % 2;
        SplashViewModel_Factory splashViewModel_Factory = new SplashViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = copydefault + 97;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return splashViewModel_Factory;
        }
        throw null;
    }

    public static SplashViewModel_Factory create(Provider<DefaultSplashModel> provider) {
        int i = 2 % 2;
        SplashViewModel_Factory splashViewModel_Factory = new SplashViewModel_Factory(provider);
        int i2 = copydefault + 69;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return splashViewModel_Factory;
    }

    public static SplashViewModel newInstance(DefaultSplashModel defaultSplashModel) {
        int i = 2 % 2;
        SplashViewModel splashViewModel = new SplashViewModel(defaultSplashModel);
        int i2 = copydefault + 109;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return splashViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
