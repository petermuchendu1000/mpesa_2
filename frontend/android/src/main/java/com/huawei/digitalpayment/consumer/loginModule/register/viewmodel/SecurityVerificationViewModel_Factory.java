package com.huawei.digitalpayment.consumer.loginModule.register.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.register.model.DefaultSecurityVerificationModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class SecurityVerificationViewModel_Factory implements Factory<SecurityVerificationViewModel> {
    private static int ShareDataUIState = 1;
    private static int component1;
    private final Provider<DefaultSecurityVerificationModel> component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 51;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        SecurityVerificationViewModel securityVerificationViewModel = get();
        int i4 = component1 + 25;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return securityVerificationViewModel;
    }

    public SecurityVerificationViewModel_Factory(Provider<DefaultSecurityVerificationModel> provider) {
        this.component2 = provider;
    }

    @Override
    public SecurityVerificationViewModel get() {
        int i = 2 % 2;
        int i2 = component1 + 63;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        SecurityVerificationViewModel securityVerificationViewModelNewInstance = newInstance(this.component2.get());
        int i4 = ShareDataUIState + 25;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return securityVerificationViewModelNewInstance;
    }

    public static SecurityVerificationViewModel_Factory create(javax.inject.Provider<DefaultSecurityVerificationModel> provider) {
        int i = 2 % 2;
        SecurityVerificationViewModel_Factory securityVerificationViewModel_Factory = new SecurityVerificationViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = ShareDataUIState + 51;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return securityVerificationViewModel_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static SecurityVerificationViewModel_Factory create(Provider<DefaultSecurityVerificationModel> provider) {
        int i = 2 % 2;
        SecurityVerificationViewModel_Factory securityVerificationViewModel_Factory = new SecurityVerificationViewModel_Factory(provider);
        int i2 = ShareDataUIState + 35;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return securityVerificationViewModel_Factory;
    }

    public static SecurityVerificationViewModel newInstance(DefaultSecurityVerificationModel defaultSecurityVerificationModel) {
        int i = 2 % 2;
        SecurityVerificationViewModel securityVerificationViewModel = new SecurityVerificationViewModel(defaultSecurityVerificationModel);
        int i2 = ShareDataUIState + 99;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return securityVerificationViewModel;
    }
}
