package com.huawei.digitalpayment.consumer.qrcode.ui.di;

import com.huawei.digitalpayment.consumer.qrcode.model.DefaultPayCodeModel;
import com.huawei.digitalpayment.consumer.qrcode.model.DefaultReceiveCodeModel;
import com.huawei.digitalpayment.consumer.qrcode.model.PayCodeModel;
import com.huawei.digitalpayment.consumer.qrcode.model.ReceiveCodeModel;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class ModelModule {
    @Binds
    public abstract PayCodeModel bindPayCodeModel(DefaultPayCodeModel defaultPayCodeModel);

    @Binds
    public abstract ReceiveCodeModel bindReceiveCodeModel(DefaultReceiveCodeModel defaultReceiveCodeModel);
}
