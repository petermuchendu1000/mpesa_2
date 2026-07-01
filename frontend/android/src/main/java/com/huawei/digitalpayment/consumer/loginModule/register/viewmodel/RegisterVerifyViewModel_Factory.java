package com.huawei.digitalpayment.consumer.loginModule.register.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.register.data.RegisterKycModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class RegisterVerifyViewModel_Factory implements Factory<RegisterVerifyViewModel> {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private final Provider<RegisterKycModel> component1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 15;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        RegisterVerifyViewModel registerVerifyViewModel = get();
        int i4 = component2 + 81;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return registerVerifyViewModel;
        }
        throw null;
    }

    public RegisterVerifyViewModel_Factory(Provider<RegisterKycModel> provider) {
        this.component1 = provider;
    }

    @Override
    public RegisterVerifyViewModel get() {
        int i = 2 % 2;
        int i2 = component2 + 109;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        RegisterVerifyViewModel registerVerifyViewModelNewInstance = newInstance(this.component1.get());
        int i4 = ShareDataUIState + 9;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return registerVerifyViewModelNewInstance;
        }
        throw null;
    }

    public static RegisterVerifyViewModel_Factory create(javax.inject.Provider<RegisterKycModel> provider) {
        int i = 2 % 2;
        RegisterVerifyViewModel_Factory registerVerifyViewModel_Factory = new RegisterVerifyViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = ShareDataUIState + 29;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return registerVerifyViewModel_Factory;
        }
        throw null;
    }

    public static RegisterVerifyViewModel_Factory create(Provider<RegisterKycModel> provider) {
        int i = 2 % 2;
        RegisterVerifyViewModel_Factory registerVerifyViewModel_Factory = new RegisterVerifyViewModel_Factory(provider);
        int i2 = component2 + 49;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return registerVerifyViewModel_Factory;
        }
        throw null;
    }

    public static RegisterVerifyViewModel newInstance(RegisterKycModel registerKycModel) {
        int i = 2 % 2;
        RegisterVerifyViewModel registerVerifyViewModel = new RegisterVerifyViewModel(registerKycModel);
        int i2 = component2 + 87;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return registerVerifyViewModel;
        }
        throw null;
    }
}
