package com.huawei.digitalpayment.consumer.webviewui.di;

import com.huawei.digitalpayment.consumer.webview.model.IWebViewModel;
import com.huawei.digitalpayment.consumer.webview.model.WebDispatcherModel;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class WebModule {
    @Binds
    public abstract IWebViewModel bindIWebDispatcherModel(WebDispatcherModel webDispatcherModel);
}
