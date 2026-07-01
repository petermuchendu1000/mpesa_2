package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import com.huawei.digitalpayment.consumer.basicUi.model.AboutModel;
import javax.inject.Inject;

public class AboutViewModel extends BaseAboutViewModel<AboutModel> {
    @Inject
    public AboutViewModel(AboutModel aboutModel) {
        super(aboutModel);
    }
}
