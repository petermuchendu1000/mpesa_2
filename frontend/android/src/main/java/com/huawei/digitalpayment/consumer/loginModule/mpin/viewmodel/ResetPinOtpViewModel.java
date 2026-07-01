package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.register.data.ResetOtpModel;
import javax.inject.Inject;

public class ResetPinOtpViewModel extends BaseResetPinOtpViewModel<ResetOtpModel> {
    @Inject
    public ResetPinOtpViewModel(ResetOtpModel resetOtpModel) {
        super(resetOtpModel);
    }
}
