package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.mpin.model.DefaultChangePinOtpModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class ChangePinOtpViewModel_Factory implements Factory<ChangePinOtpViewModel> {
    private static int ShareDataUIState = 1;
    private static int component2;
    private final Provider<DefaultChangePinOtpModel> component1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 57;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ChangePinOtpViewModel changePinOtpViewModel = get();
        int i4 = component2 + 119;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return changePinOtpViewModel;
    }

    public ChangePinOtpViewModel_Factory(Provider<DefaultChangePinOtpModel> provider) {
        this.component1 = provider;
    }

    @Override
    public ChangePinOtpViewModel get() {
        ChangePinOtpViewModel changePinOtpViewModelNewInstance;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            changePinOtpViewModelNewInstance = newInstance(this.component1.get());
            int i3 = 94 / 0;
        } else {
            changePinOtpViewModelNewInstance = newInstance(this.component1.get());
        }
        int i4 = ShareDataUIState + 55;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return changePinOtpViewModelNewInstance;
    }

    public static ChangePinOtpViewModel_Factory create(javax.inject.Provider<DefaultChangePinOtpModel> provider) {
        int i = 2 % 2;
        ChangePinOtpViewModel_Factory changePinOtpViewModel_Factory = new ChangePinOtpViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = component2 + 49;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return changePinOtpViewModel_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ChangePinOtpViewModel_Factory create(Provider<DefaultChangePinOtpModel> provider) {
        int i = 2 % 2;
        ChangePinOtpViewModel_Factory changePinOtpViewModel_Factory = new ChangePinOtpViewModel_Factory(provider);
        int i2 = component2 + 1;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return changePinOtpViewModel_Factory;
    }

    public static ChangePinOtpViewModel newInstance(DefaultChangePinOtpModel defaultChangePinOtpModel) {
        int i = 2 % 2;
        ChangePinOtpViewModel changePinOtpViewModel = new ChangePinOtpViewModel(defaultChangePinOtpModel);
        int i2 = ShareDataUIState + 125;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return changePinOtpViewModel;
    }
}
