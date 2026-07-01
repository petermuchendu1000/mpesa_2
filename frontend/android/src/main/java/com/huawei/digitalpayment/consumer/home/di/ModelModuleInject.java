package com.huawei.digitalpayment.consumer.home.di;

import com.huawei.digitalpayment.home.data.DefaultHomeModel;
import com.huawei.digitalpayment.home.data.HomeModel;
import com.huawei.digitalpayment.home.data.IServiceManagerModel;
import com.huawei.digitalpayment.home.data.ITipsModel;
import com.huawei.digitalpayment.home.data.ServiceManagerModel;
import com.huawei.digitalpayment.home.data.TipsModel;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class ModelModuleInject {
    @Binds
    public abstract HomeModel bindHomeModel(DefaultHomeModel defaultHomeModel);

    @Binds
    public abstract IServiceManagerModel bindServiceManagerModel(ServiceManagerModel serviceManagerModel);

    @Binds
    public abstract ITipsModel bindTipsModel(TipsModel tipsModel);
}
