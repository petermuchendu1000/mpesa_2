package com.huawei.digitalpayment.consumer.loginModule.register.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.register.data.SetPinModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class SetPinViewModel_Factory implements Factory<SetPinViewModel> {
    private static int component2 = 1;
    private static int component3;
    private final Provider<SetPinModel> copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 63;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        SetPinViewModel setPinViewModel = get();
        int i4 = component3 + 7;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return setPinViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public SetPinViewModel_Factory(Provider<SetPinModel> provider) {
        this.copydefault = provider;
    }

    @Override
    public SetPinViewModel get() {
        int i = 2 % 2;
        int i2 = component2 + 33;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        SetPinViewModel setPinViewModelNewInstance = newInstance(this.copydefault.get());
        int i4 = component3 + 53;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return setPinViewModelNewInstance;
    }

    public static SetPinViewModel_Factory create(javax.inject.Provider<SetPinModel> provider) {
        int i = 2 % 2;
        SetPinViewModel_Factory setPinViewModel_Factory = new SetPinViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = component2 + 13;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return setPinViewModel_Factory;
    }

    public static SetPinViewModel_Factory create(Provider<SetPinModel> provider) {
        int i = 2 % 2;
        SetPinViewModel_Factory setPinViewModel_Factory = new SetPinViewModel_Factory(provider);
        int i2 = component3 + 79;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return setPinViewModel_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static SetPinViewModel newInstance(SetPinModel setPinModel) {
        int i = 2 % 2;
        SetPinViewModel setPinViewModel = new SetPinViewModel(setPinModel);
        int i2 = component3 + 35;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return setPinViewModel;
    }
}
