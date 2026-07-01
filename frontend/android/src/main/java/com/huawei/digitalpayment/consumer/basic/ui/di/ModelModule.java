package com.huawei.digitalpayment.consumer.basic.ui.di;

import com.huawei.digitalpayment.consumer.basicUi.model.AboutModel;
import com.huawei.digitalpayment.consumer.basicUi.model.DefaultAboutModel;
import com.huawei.digitalpayment.consumer.basicUi.model.DefaultAppShareModel;
import com.huawei.digitalpayment.consumer.basicUi.model.DefaultSplashModel;
import com.huawei.digitalpayment.consumer.basicUi.model.IAppShareModel;
import com.huawei.digitalpayment.consumer.basicUi.model.ILoginSettingModel;
import com.huawei.digitalpayment.consumer.basicUi.model.IPaySettingModel;
import com.huawei.digitalpayment.consumer.basicUi.model.ISplashModel;
import com.huawei.digitalpayment.consumer.basicUi.model.LoginSettingModel;
import com.huawei.digitalpayment.consumer.basicUi.model.PaySettingModel;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class ModelModule {
    @Binds
    public abstract AboutModel bindAboutModel(DefaultAboutModel defaultAboutModel);

    @Binds
    public abstract IAppShareModel bindAppShareModel(DefaultAppShareModel defaultAppShareModel);

    @Binds
    public abstract ILoginSettingModel bindLoginSettingModel(LoginSettingModel loginSettingModel);

    @Binds
    public abstract IPaySettingModel bindPaySettingModel(PaySettingModel paySettingModel);

    @Binds
    public abstract ISplashModel bindSplashModel(DefaultSplashModel defaultSplashModel);
}
