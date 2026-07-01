package com.huawei.digitalpayment.consumer.loginModule.login.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.login.data.LoginModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class LoginViewModel_Factory implements Factory<LoginViewModel> {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private final Provider<LoginModel> component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        LoginViewModel loginViewModel = get();
        int i4 = ShareDataUIState + 85;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return loginViewModel;
    }

    public LoginViewModel_Factory(Provider<LoginModel> provider) {
        this.component2 = provider;
    }

    @Override
    public LoginViewModel get() {
        int i = 2 % 2;
        int i2 = component3 + 73;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        LoginModel loginModel = this.component2.get();
        if (i3 == 0) {
            return newInstance(loginModel);
        }
        newInstance(loginModel);
        throw null;
    }

    public static LoginViewModel_Factory create(javax.inject.Provider<LoginModel> provider) {
        int i = 2 % 2;
        LoginViewModel_Factory loginViewModel_Factory = new LoginViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = component3 + 17;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 60 / 0;
        }
        return loginViewModel_Factory;
    }

    public static LoginViewModel_Factory create(Provider<LoginModel> provider) {
        int i = 2 % 2;
        LoginViewModel_Factory loginViewModel_Factory = new LoginViewModel_Factory(provider);
        int i2 = component3 + 35;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return loginViewModel_Factory;
    }

    public static LoginViewModel newInstance(LoginModel loginModel) {
        int i = 2 % 2;
        LoginViewModel loginViewModel = new LoginViewModel(loginModel);
        int i2 = ShareDataUIState + 45;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return loginViewModel;
    }
}
