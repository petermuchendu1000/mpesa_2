package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.mpin.model.DefaultSecurityQuestionModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class ModifySecurityQuestionsViewModel_Factory implements Factory<ModifySecurityQuestionsViewModel> {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private final Provider<DefaultSecurityQuestionModel> copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 107;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return get();
        }
        get();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ModifySecurityQuestionsViewModel_Factory(Provider<DefaultSecurityQuestionModel> provider) {
        this.copydefault = provider;
    }

    @Override
    public ModifySecurityQuestionsViewModel get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 91;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ModifySecurityQuestionsViewModel modifySecurityQuestionsViewModelNewInstance = newInstance(this.copydefault.get());
        int i4 = component3 + 125;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return modifySecurityQuestionsViewModelNewInstance;
    }

    public static ModifySecurityQuestionsViewModel_Factory create(javax.inject.Provider<DefaultSecurityQuestionModel> provider) {
        int i = 2 % 2;
        ModifySecurityQuestionsViewModel_Factory modifySecurityQuestionsViewModel_Factory = new ModifySecurityQuestionsViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = ShareDataUIState + 37;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return modifySecurityQuestionsViewModel_Factory;
        }
        throw null;
    }

    public static ModifySecurityQuestionsViewModel_Factory create(Provider<DefaultSecurityQuestionModel> provider) {
        int i = 2 % 2;
        ModifySecurityQuestionsViewModel_Factory modifySecurityQuestionsViewModel_Factory = new ModifySecurityQuestionsViewModel_Factory(provider);
        int i2 = component3 + 117;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return modifySecurityQuestionsViewModel_Factory;
    }

    public static ModifySecurityQuestionsViewModel newInstance(DefaultSecurityQuestionModel defaultSecurityQuestionModel) {
        int i = 2 % 2;
        ModifySecurityQuestionsViewModel modifySecurityQuestionsViewModel = new ModifySecurityQuestionsViewModel(defaultSecurityQuestionModel);
        int i2 = component3 + 119;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 45 / 0;
        }
        return modifySecurityQuestionsViewModel;
    }
}
