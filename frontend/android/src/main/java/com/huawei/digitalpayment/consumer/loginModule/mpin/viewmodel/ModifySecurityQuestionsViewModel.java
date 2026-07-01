package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.mpin.model.DefaultSecurityQuestionModel;
import javax.inject.Inject;

public class ModifySecurityQuestionsViewModel extends BaseModifySecurityQuestionsViewModel<DefaultSecurityQuestionModel> {
    @Inject
    public ModifySecurityQuestionsViewModel(DefaultSecurityQuestionModel defaultSecurityQuestionModel) {
        super(defaultSecurityQuestionModel);
    }
}
