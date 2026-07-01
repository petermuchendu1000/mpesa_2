package com.huawei.digitalpayment.consumer.scan.ui.di;

import com.huawei.digitalpayment.consumer.scan.model.DefaultScanModel;
import com.huawei.digitalpayment.consumer.scan.model.ScanModel;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class ScanModeModule {
    @Binds
    public abstract ScanModel bindScanModel(DefaultScanModel defaultScanModel);
}
