package com.huawei.digitalpayment.home.viewmodel;

import com.huawei.digitalpayment.home.data.IServiceManagerModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class HomeServiceManagerViewModel_Factory implements Factory<HomeServiceManagerViewModel> {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private final Provider<IServiceManagerModel> component3;

    @Override
    public Object get() {
        HomeServiceManagerViewModel homeServiceManagerViewModel;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            homeServiceManagerViewModel = get();
            int i3 = 92 / 0;
        } else {
            homeServiceManagerViewModel = get();
        }
        int i4 = copydefault + 101;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return homeServiceManagerViewModel;
        }
        throw null;
    }

    public HomeServiceManagerViewModel_Factory(Provider<IServiceManagerModel> provider) {
        this.component3 = provider;
    }

    @Override
    public HomeServiceManagerViewModel get() {
        HomeServiceManagerViewModel homeServiceManagerViewModelNewInstance;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            homeServiceManagerViewModelNewInstance = newInstance(this.component3.get());
            int i3 = 89 / 0;
        } else {
            homeServiceManagerViewModelNewInstance = newInstance(this.component3.get());
        }
        int i4 = ShareDataUIState + 109;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return homeServiceManagerViewModelNewInstance;
    }

    public static HomeServiceManagerViewModel_Factory create(javax.inject.Provider<IServiceManagerModel> provider) {
        int i = 2 % 2;
        HomeServiceManagerViewModel_Factory homeServiceManagerViewModel_Factory = new HomeServiceManagerViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = ShareDataUIState + 81;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 46 / 0;
        }
        return homeServiceManagerViewModel_Factory;
    }

    public static HomeServiceManagerViewModel_Factory create(Provider<IServiceManagerModel> provider) {
        int i = 2 % 2;
        HomeServiceManagerViewModel_Factory homeServiceManagerViewModel_Factory = new HomeServiceManagerViewModel_Factory(provider);
        int i2 = copydefault + 29;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return homeServiceManagerViewModel_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static HomeServiceManagerViewModel newInstance(IServiceManagerModel iServiceManagerModel) {
        int i = 2 % 2;
        HomeServiceManagerViewModel homeServiceManagerViewModel = new HomeServiceManagerViewModel(iServiceManagerModel);
        int i2 = copydefault + 35;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return homeServiceManagerViewModel;
    }
}
