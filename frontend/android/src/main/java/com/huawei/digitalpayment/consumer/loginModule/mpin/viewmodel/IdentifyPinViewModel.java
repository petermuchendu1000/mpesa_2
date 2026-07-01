package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.mpin.data.ChangePinModel;
import javax.inject.Inject;

public class IdentifyPinViewModel extends BaseIdentifyPinViewModel<ChangePinModel> {
    @Inject
    public IdentifyPinViewModel(ChangePinModel changePinModel) {
        super(changePinModel);
    }
}
