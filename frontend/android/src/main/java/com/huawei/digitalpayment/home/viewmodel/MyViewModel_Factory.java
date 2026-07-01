package com.huawei.digitalpayment.home.viewmodel;

import com.huawei.digitalpayment.home.data.HomeModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class MyViewModel_Factory implements Factory<MyViewModel> {
    private static int ShareDataUIState = 1;
    private static int component1;
    private final Provider<HomeModel> component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 115;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        MyViewModel myViewModel = get();
        int i4 = ShareDataUIState + 117;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return myViewModel;
    }

    public MyViewModel_Factory(Provider<HomeModel> provider) {
        this.component2 = provider;
    }

    @Override
    public MyViewModel get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 95;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        MyViewModel myViewModelNewInstance = newInstance(this.component2.get());
        int i4 = ShareDataUIState + 3;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return myViewModelNewInstance;
        }
        throw null;
    }

    public static MyViewModel_Factory create(javax.inject.Provider<HomeModel> provider) {
        int i = 2 % 2;
        MyViewModel_Factory myViewModel_Factory = new MyViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = ShareDataUIState + 79;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return myViewModel_Factory;
    }

    public static MyViewModel_Factory create(Provider<HomeModel> provider) {
        int i = 2 % 2;
        MyViewModel_Factory myViewModel_Factory = new MyViewModel_Factory(provider);
        int i2 = ShareDataUIState + 81;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return myViewModel_Factory;
    }

    public static MyViewModel newInstance(HomeModel homeModel) {
        int i = 2 % 2;
        MyViewModel myViewModel = new MyViewModel(homeModel);
        int i2 = component1 + 19;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return myViewModel;
    }
}
