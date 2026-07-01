package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.mpin.data.ChangePinModel;
import javax.inject.Inject;

public class ChangePinViewModel extends BaseChangePinViewModel<ChangePinModel> {
    @Inject
    public ChangePinViewModel(ChangePinModel changePinModel) {
        super(changePinModel);
    }
}
