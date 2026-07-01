package com.huawei.digitalpayment.consumer.sfcui.ui.di;

import com.huawei.digitalpayment.consumer.sfcui.profile.model.BiometricsSettingModel;
import com.huawei.digitalpayment.consumer.sfcui.profile.model.IBiometricsSettingModel;
import com.huawei.digitalpayment.consumer.sfcui.ui.model.ISendMoneyModel;
import com.huawei.digitalpayment.consumer.sfcui.ui.model.SendMoneyModel;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class SFCModuleInject {
    @Binds
    public abstract IBiometricsSettingModel bindBiometricsSettingModel(BiometricsSettingModel biometricsSettingModel);

    @Binds
    public abstract ISendMoneyModel bindSendMoneyModel(SendMoneyModel sendMoneyModel);
}
