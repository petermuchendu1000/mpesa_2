package com.huawei.digitalpayment.common.theme.viewmodel;

import com.huawei.digitalpayment.common.theme.model.MyServicesModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class MyServicesViewModel_Factory implements Factory<MyServicesViewModel> {
    private static int ShareDataUIState = 1;
    private static int component1;
    private final Provider<MyServicesModel> component2;

    @Override
    public Object get() {
        MyServicesViewModel myServicesViewModel;
        int i = 2 % 2;
        int i2 = component1 + 15;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            myServicesViewModel = get();
            int i3 = 80 / 0;
        } else {
            myServicesViewModel = get();
        }
        int i4 = ShareDataUIState + 35;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 38 / 0;
        }
        return myServicesViewModel;
    }

    public MyServicesViewModel_Factory(Provider<MyServicesModel> provider) {
        this.component2 = provider;
    }

    @Override
    public MyServicesViewModel get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 33;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        MyServicesViewModel myServicesViewModelNewInstance = newInstance(this.component2.get());
        int i4 = component1 + 97;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return myServicesViewModelNewInstance;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static MyServicesViewModel_Factory create(javax.inject.Provider<MyServicesModel> provider) {
        int i = 2 % 2;
        MyServicesViewModel_Factory myServicesViewModel_Factory = new MyServicesViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = ShareDataUIState + 109;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 28 / 0;
        }
        return myServicesViewModel_Factory;
    }

    public static MyServicesViewModel_Factory create(Provider<MyServicesModel> provider) {
        int i = 2 % 2;
        MyServicesViewModel_Factory myServicesViewModel_Factory = new MyServicesViewModel_Factory(provider);
        int i2 = ShareDataUIState + 37;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return myServicesViewModel_Factory;
    }

    public static MyServicesViewModel newInstance(MyServicesModel myServicesModel) {
        int i = 2 % 2;
        MyServicesViewModel myServicesViewModel = new MyServicesViewModel(myServicesModel);
        int i2 = component1 + 47;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 60 / 0;
        }
        return myServicesViewModel;
    }
}
