package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import com.huawei.digitalpayment.consumer.basicUi.model.IPaySettingModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class PaySettingViewModel_Factory implements Factory<PaySettingViewModel> {
    private static int component1 = 0;
    private static int copydefault = 1;
    private final Provider<IPaySettingModel> component2;

    @Override
    public Object get() {
        PaySettingViewModel paySettingViewModel;
        int i = 2 % 2;
        int i2 = copydefault + 55;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            paySettingViewModel = get();
            int i3 = 11 / 0;
        } else {
            paySettingViewModel = get();
        }
        int i4 = component1 + 25;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return paySettingViewModel;
    }

    public PaySettingViewModel_Factory(Provider<IPaySettingModel> provider) {
        this.component2 = provider;
    }

    @Override
    public PaySettingViewModel get() {
        int i = 2 % 2;
        int i2 = component1 + 5;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        PaySettingViewModel paySettingViewModelNewInstance = newInstance(this.component2.get());
        int i4 = copydefault + 41;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 92 / 0;
        }
        return paySettingViewModelNewInstance;
    }

    public static PaySettingViewModel_Factory create(javax.inject.Provider<IPaySettingModel> provider) {
        int i = 2 % 2;
        PaySettingViewModel_Factory paySettingViewModel_Factory = new PaySettingViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = component1 + 75;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return paySettingViewModel_Factory;
    }

    public static PaySettingViewModel_Factory create(Provider<IPaySettingModel> provider) {
        int i = 2 % 2;
        PaySettingViewModel_Factory paySettingViewModel_Factory = new PaySettingViewModel_Factory(provider);
        int i2 = copydefault + 93;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return paySettingViewModel_Factory;
        }
        throw null;
    }

    public static PaySettingViewModel newInstance(IPaySettingModel iPaySettingModel) {
        int i = 2 % 2;
        PaySettingViewModel paySettingViewModel = new PaySettingViewModel(iPaySettingModel);
        int i2 = component1 + 59;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 23 / 0;
        }
        return paySettingViewModel;
    }
}
