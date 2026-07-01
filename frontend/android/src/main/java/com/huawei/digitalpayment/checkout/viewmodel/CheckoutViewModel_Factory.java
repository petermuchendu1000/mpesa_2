package com.huawei.digitalpayment.checkout.viewmodel;

import com.huawei.digitalpayment.checkout.model.IPayModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class CheckoutViewModel_Factory implements Factory<CheckoutViewModel> {
    private static int component1 = 0;
    private static int component3 = 1;
    private final Provider<IPayModel> copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 13;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        CheckoutViewModel checkoutViewModel = get();
        int i4 = component3 + 43;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return checkoutViewModel;
        }
        throw null;
    }

    public CheckoutViewModel_Factory(Provider<IPayModel> provider) {
        this.copydefault = provider;
    }

    @Override
    public CheckoutViewModel get() {
        int i = 2 % 2;
        int i2 = component1 + 125;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        IPayModel iPayModel = this.copydefault.get();
        if (i3 != 0) {
            return newInstance(iPayModel);
        }
        newInstance(iPayModel);
        throw null;
    }

    public static CheckoutViewModel_Factory create(javax.inject.Provider<IPayModel> provider) {
        int i = 2 % 2;
        CheckoutViewModel_Factory checkoutViewModel_Factory = new CheckoutViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = component1 + 53;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return checkoutViewModel_Factory;
    }

    public static CheckoutViewModel_Factory create(Provider<IPayModel> provider) {
        int i = 2 % 2;
        CheckoutViewModel_Factory checkoutViewModel_Factory = new CheckoutViewModel_Factory(provider);
        int i2 = component3 + 19;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return checkoutViewModel_Factory;
        }
        throw null;
    }

    public static CheckoutViewModel newInstance(IPayModel iPayModel) {
        int i = 2 % 2;
        CheckoutViewModel checkoutViewModel = new CheckoutViewModel(iPayModel);
        int i2 = component1 + 105;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return checkoutViewModel;
    }
}
