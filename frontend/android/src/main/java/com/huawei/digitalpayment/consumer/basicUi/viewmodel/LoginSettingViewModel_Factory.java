package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import com.huawei.digitalpayment.consumer.basicUi.model.ILoginSettingModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class LoginSettingViewModel_Factory implements Factory<LoginSettingViewModel> {
    private static int component1 = 0;
    private static int component2 = 1;
    private final Provider<ILoginSettingModel> copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 61;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            get();
            throw null;
        }
        LoginSettingViewModel loginSettingViewModel = get();
        int i3 = component2 + 83;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return loginSettingViewModel;
    }

    public LoginSettingViewModel_Factory(Provider<ILoginSettingModel> provider) {
        this.copydefault = provider;
    }

    @Override
    public LoginSettingViewModel get() {
        int i = 2 % 2;
        int i2 = component1 + 83;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        LoginSettingViewModel loginSettingViewModelNewInstance = newInstance(this.copydefault.get());
        int i4 = component2 + 1;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return loginSettingViewModelNewInstance;
        }
        throw null;
    }

    public static LoginSettingViewModel_Factory create(javax.inject.Provider<ILoginSettingModel> provider) {
        int i = 2 % 2;
        LoginSettingViewModel_Factory loginSettingViewModel_Factory = new LoginSettingViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = component1 + 9;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return loginSettingViewModel_Factory;
    }

    public static LoginSettingViewModel_Factory create(Provider<ILoginSettingModel> provider) {
        int i = 2 % 2;
        LoginSettingViewModel_Factory loginSettingViewModel_Factory = new LoginSettingViewModel_Factory(provider);
        int i2 = component2 + 41;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return loginSettingViewModel_Factory;
        }
        throw null;
    }

    public static LoginSettingViewModel newInstance(ILoginSettingModel iLoginSettingModel) {
        int i = 2 % 2;
        LoginSettingViewModel loginSettingViewModel = new LoginSettingViewModel(iLoginSettingModel);
        int i2 = component1 + 73;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return loginSettingViewModel;
    }
}
