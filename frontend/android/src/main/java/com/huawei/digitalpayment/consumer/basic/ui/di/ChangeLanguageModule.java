package com.huawei.digitalpayment.consumer.basic.ui.di;

import com.huawei.digitalpayment.consumer.basicUi.model.ChangeLanguageModel;
import com.huawei.digitalpayment.consumer.basicUi.model.DefaultChangeLanguageModel;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class ChangeLanguageModule {
    @Binds
    public abstract ChangeLanguageModel bindAboutModel(DefaultChangeLanguageModel defaultChangeLanguageModel);
}
