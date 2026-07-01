package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import com.huawei.digitalpayment.consumer.basicUi.model.ChangeLanguageModel;
import javax.inject.Inject;

public class ChangeLanguageViewModel extends BaseChangeLanguageViewModel<ChangeLanguageModel> {
    @Inject
    public ChangeLanguageViewModel(ChangeLanguageModel changeLanguageModel) {
        super(changeLanguageModel);
    }
}
