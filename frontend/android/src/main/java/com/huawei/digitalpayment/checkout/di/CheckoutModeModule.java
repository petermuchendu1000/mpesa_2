package com.huawei.digitalpayment.checkout.di;

import com.huawei.digitalpayment.checkout.model.DefaultPayModel;
import com.huawei.digitalpayment.checkout.model.IPayModel;
import com.huawei.digitalpayment.checkout.model.IPayResultModel;
import com.huawei.digitalpayment.checkout.model.PayResultModel;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class CheckoutModeModule {
    @Binds
    public abstract IPayModel bindPayModel(DefaultPayModel defaultPayModel);

    @Binds
    public abstract IPayResultModel bindPayResultModel(PayResultModel payResultModel);
}
