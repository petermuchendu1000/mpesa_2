package com.huawei.digitalpayment.checkout.viewmodel;

import com.huawei.digitalpayment.checkout.model.EasyCheckoutModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class EasyCheckoutViewModel_Factory implements Factory<EasyCheckoutViewModel> {
    private static int component3 = 0;
    private static int copydefault = 1;
    private final Provider<EasyCheckoutModel> component1;

    @Override
    public Object get() {
        EasyCheckoutViewModel easyCheckoutViewModel;
        int i = 2 % 2;
        int i2 = copydefault + 51;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            easyCheckoutViewModel = get();
            int i3 = 97 / 0;
        } else {
            easyCheckoutViewModel = get();
        }
        int i4 = component3 + 125;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 5 / 0;
        }
        return easyCheckoutViewModel;
    }

    public EasyCheckoutViewModel_Factory(Provider<EasyCheckoutModel> provider) {
        this.component1 = provider;
    }

    @Override
    public EasyCheckoutViewModel get() {
        EasyCheckoutViewModel easyCheckoutViewModelNewInstance;
        int i = 2 % 2;
        int i2 = component3 + 69;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            easyCheckoutViewModelNewInstance = newInstance(this.component1.get());
            int i3 = 72 / 0;
        } else {
            easyCheckoutViewModelNewInstance = newInstance(this.component1.get());
        }
        int i4 = component3 + 119;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 41 / 0;
        }
        return easyCheckoutViewModelNewInstance;
    }

    public static EasyCheckoutViewModel_Factory create(javax.inject.Provider<EasyCheckoutModel> provider) {
        int i = 2 % 2;
        EasyCheckoutViewModel_Factory easyCheckoutViewModel_Factory = new EasyCheckoutViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = copydefault + 19;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return easyCheckoutViewModel_Factory;
    }

    public static EasyCheckoutViewModel_Factory create(Provider<EasyCheckoutModel> provider) {
        int i = 2 % 2;
        EasyCheckoutViewModel_Factory easyCheckoutViewModel_Factory = new EasyCheckoutViewModel_Factory(provider);
        int i2 = component3 + 101;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return easyCheckoutViewModel_Factory;
    }

    public static EasyCheckoutViewModel newInstance(EasyCheckoutModel easyCheckoutModel) {
        int i = 2 % 2;
        EasyCheckoutViewModel easyCheckoutViewModel = new EasyCheckoutViewModel(easyCheckoutModel);
        int i2 = copydefault + 67;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return easyCheckoutViewModel;
    }
}
