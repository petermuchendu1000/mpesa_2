package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import com.huawei.digitalpayment.consumer.basicUi.model.DefaultSplashModel;
import com.huawei.digitalpayment.consumer.basicUi.model.ISplashModel;
import javax.inject.Inject;

public class SplashViewModel extends BaseSplashViewModel<ISplashModel> {
    @Inject
    public SplashViewModel(DefaultSplashModel defaultSplashModel) {
        super(defaultSplashModel);
    }
}
