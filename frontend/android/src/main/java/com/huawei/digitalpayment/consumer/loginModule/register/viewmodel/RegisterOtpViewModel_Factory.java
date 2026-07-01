package com.huawei.digitalpayment.consumer.loginModule.register.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.register.data.RegisterOtpModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class RegisterOtpViewModel_Factory implements Factory<RegisterOtpViewModel> {
    private static int component1 = 1;
    private static int copydefault;
    private final Provider<RegisterOtpModel> ShareDataUIState;

    @Override
    public Object get() {
        RegisterOtpViewModel registerOtpViewModel;
        int i = 2 % 2;
        int i2 = component1 + 93;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            registerOtpViewModel = get();
            int i3 = 12 / 0;
        } else {
            registerOtpViewModel = get();
        }
        int i4 = copydefault + 113;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return registerOtpViewModel;
    }

    public RegisterOtpViewModel_Factory(Provider<RegisterOtpModel> provider) {
        this.ShareDataUIState = provider;
    }

    @Override
    public RegisterOtpViewModel get() {
        int i = 2 % 2;
        int i2 = copydefault + 55;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        RegisterOtpViewModel registerOtpViewModelNewInstance = newInstance(this.ShareDataUIState.get());
        if (i3 == 0) {
            int i4 = 99 / 0;
        }
        return registerOtpViewModelNewInstance;
    }

    public static RegisterOtpViewModel_Factory create(javax.inject.Provider<RegisterOtpModel> provider) {
        int i = 2 % 2;
        RegisterOtpViewModel_Factory registerOtpViewModel_Factory = new RegisterOtpViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = component1 + 95;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return registerOtpViewModel_Factory;
    }

    public static RegisterOtpViewModel_Factory create(Provider<RegisterOtpModel> provider) {
        int i = 2 % 2;
        RegisterOtpViewModel_Factory registerOtpViewModel_Factory = new RegisterOtpViewModel_Factory(provider);
        int i2 = copydefault + 29;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return registerOtpViewModel_Factory;
    }

    public static RegisterOtpViewModel newInstance(RegisterOtpModel registerOtpModel) {
        int i = 2 % 2;
        RegisterOtpViewModel registerOtpViewModel = new RegisterOtpViewModel(registerOtpModel);
        int i2 = component1 + 89;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return registerOtpViewModel;
    }
}
