package com.huawei.digitalpayment.consumer.loginModule.login.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.login.data.PinLoginModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class PinLoginViewModel_Factory implements Factory<PinLoginViewModel> {
    private static int component1 = 1;
    private static int component2;
    private final Provider<PinLoginModel> copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 11;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return get();
        }
        get();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public PinLoginViewModel_Factory(Provider<PinLoginModel> provider) {
        this.copydefault = provider;
    }

    @Override
    public PinLoginViewModel get() {
        int i = 2 % 2;
        int i2 = component1 + 23;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        PinLoginViewModel pinLoginViewModelNewInstance = newInstance(this.copydefault.get());
        int i4 = component2 + 85;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return pinLoginViewModelNewInstance;
    }

    public static PinLoginViewModel_Factory create(javax.inject.Provider<PinLoginModel> provider) {
        int i = 2 % 2;
        PinLoginViewModel_Factory pinLoginViewModel_Factory = new PinLoginViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = component1 + 15;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return pinLoginViewModel_Factory;
    }

    public static PinLoginViewModel_Factory create(Provider<PinLoginModel> provider) {
        int i = 2 % 2;
        PinLoginViewModel_Factory pinLoginViewModel_Factory = new PinLoginViewModel_Factory(provider);
        int i2 = component2 + 45;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 65 / 0;
        }
        return pinLoginViewModel_Factory;
    }

    public static PinLoginViewModel newInstance(PinLoginModel pinLoginModel) {
        int i = 2 % 2;
        PinLoginViewModel pinLoginViewModel = new PinLoginViewModel(pinLoginModel);
        int i2 = component2 + 121;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return pinLoginViewModel;
    }
}
