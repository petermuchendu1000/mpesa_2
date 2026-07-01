package com.huawei.digitalpayment.consumer.qrcode.viewmodel;

import com.huawei.digitalpayment.consumer.qrcode.model.PayCodeModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class PayViewCodeModel_Factory implements Factory<PayViewCodeModel> {
    private static int component2 = 0;
    private static int component3 = 1;
    private final Provider<PayCodeModel> ShareDataUIState;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 17;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return get();
        }
        get();
        throw null;
    }

    public PayViewCodeModel_Factory(Provider<PayCodeModel> provider) {
        this.ShareDataUIState = provider;
    }

    @Override
    public PayViewCodeModel get() {
        int i = 2 % 2;
        int i2 = component2 + 43;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        PayViewCodeModel payViewCodeModelNewInstance = newInstance(this.ShareDataUIState.get());
        int i4 = component2 + 91;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return payViewCodeModelNewInstance;
        }
        throw null;
    }

    public static PayViewCodeModel_Factory create(javax.inject.Provider<PayCodeModel> provider) {
        int i = 2 % 2;
        PayViewCodeModel_Factory payViewCodeModel_Factory = new PayViewCodeModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = component2 + 81;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return payViewCodeModel_Factory;
    }

    public static PayViewCodeModel_Factory create(Provider<PayCodeModel> provider) {
        int i = 2 % 2;
        PayViewCodeModel_Factory payViewCodeModel_Factory = new PayViewCodeModel_Factory(provider);
        int i2 = component3 + 101;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return payViewCodeModel_Factory;
    }

    public static PayViewCodeModel newInstance(PayCodeModel payCodeModel) {
        int i = 2 % 2;
        PayViewCodeModel payViewCodeModel = new PayViewCodeModel(payCodeModel);
        int i2 = component2 + 59;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return payViewCodeModel;
    }
}
