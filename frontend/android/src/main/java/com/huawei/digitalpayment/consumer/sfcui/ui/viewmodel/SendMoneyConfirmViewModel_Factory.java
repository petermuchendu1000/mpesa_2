package com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel;

import com.huawei.digitalpayment.consumer.sfcui.ui.model.SendMoneyModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class SendMoneyConfirmViewModel_Factory implements Factory<SendMoneyConfirmViewModel> {
    private static int component3 = 0;
    private static int copydefault = 1;
    private final Provider<SendMoneyModel> ShareDataUIState;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 31;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        SendMoneyConfirmViewModel sendMoneyConfirmViewModel = get();
        int i4 = component3 + 91;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 96 / 0;
        }
        return sendMoneyConfirmViewModel;
    }

    public SendMoneyConfirmViewModel_Factory(Provider<SendMoneyModel> provider) {
        this.ShareDataUIState = provider;
    }

    @Override
    public SendMoneyConfirmViewModel get() {
        int i = 2 % 2;
        int i2 = component3 + 3;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        SendMoneyConfirmViewModel sendMoneyConfirmViewModelNewInstance = newInstance(this.ShareDataUIState.get());
        int i4 = component3 + 45;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return sendMoneyConfirmViewModelNewInstance;
    }

    public static SendMoneyConfirmViewModel_Factory create(javax.inject.Provider<SendMoneyModel> provider) {
        int i = 2 % 2;
        SendMoneyConfirmViewModel_Factory sendMoneyConfirmViewModel_Factory = new SendMoneyConfirmViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = copydefault + 17;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return sendMoneyConfirmViewModel_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static SendMoneyConfirmViewModel_Factory create(Provider<SendMoneyModel> provider) {
        int i = 2 % 2;
        SendMoneyConfirmViewModel_Factory sendMoneyConfirmViewModel_Factory = new SendMoneyConfirmViewModel_Factory(provider);
        int i2 = copydefault + 31;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return sendMoneyConfirmViewModel_Factory;
    }

    public static SendMoneyConfirmViewModel newInstance(SendMoneyModel sendMoneyModel) {
        int i = 2 % 2;
        SendMoneyConfirmViewModel sendMoneyConfirmViewModel = new SendMoneyConfirmViewModel(sendMoneyModel);
        int i2 = component3 + 103;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return sendMoneyConfirmViewModel;
    }
}
