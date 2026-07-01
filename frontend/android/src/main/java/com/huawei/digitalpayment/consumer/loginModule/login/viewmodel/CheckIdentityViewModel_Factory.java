package com.huawei.digitalpayment.consumer.loginModule.login.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.login.data.NewDeviceModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class CheckIdentityViewModel_Factory implements Factory<CheckIdentityViewModel> {
    private static int component1 = 1;
    private static int copydefault;
    private final Provider<NewDeviceModel> component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 123;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        CheckIdentityViewModel checkIdentityViewModel = get();
        int i4 = component1 + 113;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return checkIdentityViewModel;
    }

    public CheckIdentityViewModel_Factory(Provider<NewDeviceModel> provider) {
        this.component3 = provider;
    }

    @Override
    public CheckIdentityViewModel get() {
        int i = 2 % 2;
        int i2 = component1 + 91;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        CheckIdentityViewModel checkIdentityViewModelNewInstance = newInstance(this.component3.get());
        int i4 = component1 + 13;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return checkIdentityViewModelNewInstance;
    }

    public static CheckIdentityViewModel_Factory create(javax.inject.Provider<NewDeviceModel> provider) {
        int i = 2 % 2;
        CheckIdentityViewModel_Factory checkIdentityViewModel_Factory = new CheckIdentityViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = copydefault + 103;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return checkIdentityViewModel_Factory;
    }

    public static CheckIdentityViewModel_Factory create(Provider<NewDeviceModel> provider) {
        int i = 2 % 2;
        CheckIdentityViewModel_Factory checkIdentityViewModel_Factory = new CheckIdentityViewModel_Factory(provider);
        int i2 = component1 + 41;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return checkIdentityViewModel_Factory;
    }

    public static CheckIdentityViewModel newInstance(NewDeviceModel newDeviceModel) {
        int i = 2 % 2;
        CheckIdentityViewModel checkIdentityViewModel = new CheckIdentityViewModel(newDeviceModel);
        int i2 = component1 + 11;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return checkIdentityViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
