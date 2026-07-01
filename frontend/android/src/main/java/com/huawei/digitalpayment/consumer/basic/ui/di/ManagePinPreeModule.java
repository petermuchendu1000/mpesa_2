package com.huawei.digitalpayment.consumer.basic.ui.di;

import com.huawei.digitalpayment.consumer.basicUi.pinfree.model.DefaultManagePinFreeModel;
import com.huawei.digitalpayment.consumer.basicUi.pinfree.model.ManagePinFreeModel;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class ManagePinPreeModule {
    @Binds
    public abstract ManagePinFreeModel bindScanModel(DefaultManagePinFreeModel defaultManagePinFreeModel);
}
