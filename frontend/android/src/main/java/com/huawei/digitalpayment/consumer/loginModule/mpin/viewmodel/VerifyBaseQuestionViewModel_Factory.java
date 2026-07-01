package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.mpin.model.DefaultBaseQuestionModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class VerifyBaseQuestionViewModel_Factory implements Factory<VerifyBaseQuestionViewModel> {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    private final Provider<DefaultBaseQuestionModel> component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        VerifyBaseQuestionViewModel verifyBaseQuestionViewModel = get();
        int i4 = copydefault + 43;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return verifyBaseQuestionViewModel;
    }

    public VerifyBaseQuestionViewModel_Factory(Provider<DefaultBaseQuestionModel> provider) {
        this.component2 = provider;
    }

    @Override
    public VerifyBaseQuestionViewModel get() {
        int i = 2 % 2;
        int i2 = copydefault + 119;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        VerifyBaseQuestionViewModel verifyBaseQuestionViewModelNewInstance = newInstance(this.component2.get());
        int i4 = ShareDataUIState + 47;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return verifyBaseQuestionViewModelNewInstance;
        }
        throw null;
    }

    public static VerifyBaseQuestionViewModel_Factory create(javax.inject.Provider<DefaultBaseQuestionModel> provider) {
        int i = 2 % 2;
        VerifyBaseQuestionViewModel_Factory verifyBaseQuestionViewModel_Factory = new VerifyBaseQuestionViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = ShareDataUIState + 73;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return verifyBaseQuestionViewModel_Factory;
        }
        throw null;
    }

    public static VerifyBaseQuestionViewModel_Factory create(Provider<DefaultBaseQuestionModel> provider) {
        int i = 2 % 2;
        VerifyBaseQuestionViewModel_Factory verifyBaseQuestionViewModel_Factory = new VerifyBaseQuestionViewModel_Factory(provider);
        int i2 = ShareDataUIState + 119;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return verifyBaseQuestionViewModel_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static VerifyBaseQuestionViewModel newInstance(DefaultBaseQuestionModel defaultBaseQuestionModel) {
        int i = 2 % 2;
        VerifyBaseQuestionViewModel verifyBaseQuestionViewModel = new VerifyBaseQuestionViewModel(defaultBaseQuestionModel);
        int i2 = copydefault + 47;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return verifyBaseQuestionViewModel;
        }
        throw null;
    }
}
