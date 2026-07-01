package com.huawei.digitalpayment.home.theme.viewmodel;

import com.huawei.digitalpayment.home.theme.model.MyServicesModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class MyServicesViewModel_Factory implements Factory<MyServicesViewModel> {
    private static int component1 = 0;
    private static int component2 = 1;
    private final Provider<MyServicesModel> component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 75;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        MyServicesViewModel myServicesViewModel = get();
        if (i3 != 0) {
            int i4 = 51 / 0;
        }
        return myServicesViewModel;
    }

    public MyServicesViewModel_Factory(Provider<MyServicesModel> provider) {
        this.component3 = provider;
    }

    @Override
    public MyServicesViewModel get() {
        int i = 2 % 2;
        int i2 = component2 + 55;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        MyServicesViewModel myServicesViewModelNewInstance = newInstance(this.component3.get());
        int i4 = component2 + 89;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 6 / 0;
        }
        return myServicesViewModelNewInstance;
    }

    public static MyServicesViewModel_Factory create(javax.inject.Provider<MyServicesModel> provider) {
        int i = 2 % 2;
        MyServicesViewModel_Factory myServicesViewModel_Factory = new MyServicesViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = component1 + 65;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return myServicesViewModel_Factory;
    }

    public static MyServicesViewModel_Factory create(Provider<MyServicesModel> provider) {
        int i = 2 % 2;
        MyServicesViewModel_Factory myServicesViewModel_Factory = new MyServicesViewModel_Factory(provider);
        int i2 = component2 + 83;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return myServicesViewModel_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static MyServicesViewModel newInstance(MyServicesModel myServicesModel) {
        int i = 2 % 2;
        MyServicesViewModel myServicesViewModel = new MyServicesViewModel(myServicesModel);
        int i2 = component1 + 79;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return myServicesViewModel;
    }
}
