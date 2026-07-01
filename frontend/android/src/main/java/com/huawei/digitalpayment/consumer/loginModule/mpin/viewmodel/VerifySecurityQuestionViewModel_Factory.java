package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.mpin.model.DefaultSecurityQuestionModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class VerifySecurityQuestionViewModel_Factory implements Factory<VerifySecurityQuestionViewModel> {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private final Provider<DefaultSecurityQuestionModel> copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 17;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        VerifySecurityQuestionViewModel verifySecurityQuestionViewModel = get();
        int i4 = component2 + 49;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return verifySecurityQuestionViewModel;
    }

    public VerifySecurityQuestionViewModel_Factory(Provider<DefaultSecurityQuestionModel> provider) {
        this.copydefault = provider;
    }

    @Override
    public VerifySecurityQuestionViewModel get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 63;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            newInstance(this.copydefault.get());
            throw null;
        }
        VerifySecurityQuestionViewModel verifySecurityQuestionViewModelNewInstance = newInstance(this.copydefault.get());
        int i3 = component2 + 25;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            return verifySecurityQuestionViewModelNewInstance;
        }
        throw null;
    }

    public static VerifySecurityQuestionViewModel_Factory create(javax.inject.Provider<DefaultSecurityQuestionModel> provider) {
        int i = 2 % 2;
        VerifySecurityQuestionViewModel_Factory verifySecurityQuestionViewModel_Factory = new VerifySecurityQuestionViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = component2 + 103;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return verifySecurityQuestionViewModel_Factory;
        }
        throw null;
    }

    public static VerifySecurityQuestionViewModel_Factory create(Provider<DefaultSecurityQuestionModel> provider) {
        int i = 2 % 2;
        VerifySecurityQuestionViewModel_Factory verifySecurityQuestionViewModel_Factory = new VerifySecurityQuestionViewModel_Factory(provider);
        int i2 = ShareDataUIState + 39;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 67 / 0;
        }
        return verifySecurityQuestionViewModel_Factory;
    }

    public static VerifySecurityQuestionViewModel newInstance(DefaultSecurityQuestionModel defaultSecurityQuestionModel) {
        int i = 2 % 2;
        VerifySecurityQuestionViewModel verifySecurityQuestionViewModel = new VerifySecurityQuestionViewModel(defaultSecurityQuestionModel);
        int i2 = component2 + 31;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 63 / 0;
        }
        return verifySecurityQuestionViewModel;
    }
}
