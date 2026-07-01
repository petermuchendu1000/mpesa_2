package com.huawei.digitalpayment.checkout.viewmodel;

import com.huawei.digitalpayment.checkout.model.PayResultModel;
import javax.inject.Inject;

public class PayResultViewModel extends BasePayResultViewModel<PayResultModel> {
    @Inject
    public PayResultViewModel(PayResultModel payResultModel) {
        super(payResultModel);
    }
}
