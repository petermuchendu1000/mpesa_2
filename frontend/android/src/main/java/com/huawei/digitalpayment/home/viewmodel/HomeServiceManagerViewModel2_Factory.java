package com.huawei.digitalpayment.home.viewmodel;

import com.huawei.digitalpayment.home.data.IServiceManagerModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class HomeServiceManagerViewModel2_Factory implements Factory<HomeServiceManagerViewModel2> {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private final Provider<IServiceManagerModel> copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 23;
        component2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            get();
            obj.hashCode();
            throw null;
        }
        HomeServiceManagerViewModel2 homeServiceManagerViewModel2 = get();
        int i3 = ShareDataUIState + 57;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            return homeServiceManagerViewModel2;
        }
        throw null;
    }

    public HomeServiceManagerViewModel2_Factory(Provider<IServiceManagerModel> provider) {
        this.copydefault = provider;
    }

    @Override
    public HomeServiceManagerViewModel2 get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 15;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        HomeServiceManagerViewModel2 homeServiceManagerViewModel2NewInstance = newInstance(this.copydefault.get());
        int i4 = ShareDataUIState + 107;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return homeServiceManagerViewModel2NewInstance;
    }

    public static HomeServiceManagerViewModel2_Factory create(javax.inject.Provider<IServiceManagerModel> provider) {
        int i = 2 % 2;
        HomeServiceManagerViewModel2_Factory homeServiceManagerViewModel2_Factory = new HomeServiceManagerViewModel2_Factory(Providers.asDaggerProvider(provider));
        int i2 = ShareDataUIState + 69;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return homeServiceManagerViewModel2_Factory;
    }

    public static HomeServiceManagerViewModel2_Factory create(Provider<IServiceManagerModel> provider) {
        int i = 2 % 2;
        HomeServiceManagerViewModel2_Factory homeServiceManagerViewModel2_Factory = new HomeServiceManagerViewModel2_Factory(provider);
        int i2 = ShareDataUIState + 97;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return homeServiceManagerViewModel2_Factory;
    }

    public static HomeServiceManagerViewModel2 newInstance(IServiceManagerModel iServiceManagerModel) {
        int i = 2 % 2;
        HomeServiceManagerViewModel2 homeServiceManagerViewModel2 = new HomeServiceManagerViewModel2(iServiceManagerModel);
        int i2 = ShareDataUIState + 121;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return homeServiceManagerViewModel2;
    }
}
