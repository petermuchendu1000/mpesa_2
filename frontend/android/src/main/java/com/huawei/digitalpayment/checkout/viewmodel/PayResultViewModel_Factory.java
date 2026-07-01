package com.huawei.digitalpayment.checkout.viewmodel;

import com.huawei.digitalpayment.checkout.model.PayResultModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class PayResultViewModel_Factory implements Factory<PayResultViewModel> {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    private final Provider<PayResultModel> component1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 55;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return get();
        }
        get();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public PayResultViewModel_Factory(Provider<PayResultModel> provider) {
        this.component1 = provider;
    }

    @Override
    public PayResultViewModel get() {
        int i = 2 % 2;
        int i2 = copydefault + 119;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        PayResultViewModel payResultViewModelNewInstance = newInstance(this.component1.get());
        int i4 = copydefault + 95;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return payResultViewModelNewInstance;
        }
        throw null;
    }

    public static PayResultViewModel_Factory create(javax.inject.Provider<PayResultModel> provider) {
        int i = 2 % 2;
        PayResultViewModel_Factory payResultViewModel_Factory = new PayResultViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = ShareDataUIState + 23;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return payResultViewModel_Factory;
    }

    public static PayResultViewModel_Factory create(Provider<PayResultModel> provider) {
        int i = 2 % 2;
        PayResultViewModel_Factory payResultViewModel_Factory = new PayResultViewModel_Factory(provider);
        int i2 = copydefault + 37;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return payResultViewModel_Factory;
    }

    public static PayResultViewModel newInstance(PayResultModel payResultModel) {
        int i = 2 % 2;
        PayResultViewModel payResultViewModel = new PayResultViewModel(payResultModel);
        int i2 = copydefault + 3;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return payResultViewModel;
    }
}
