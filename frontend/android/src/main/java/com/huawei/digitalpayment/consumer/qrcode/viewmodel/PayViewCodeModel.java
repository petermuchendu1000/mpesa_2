package com.huawei.digitalpayment.consumer.qrcode.viewmodel;

import com.huawei.digitalpayment.consumer.qrcode.model.PayCodeModel;
import javax.inject.Inject;

public class PayViewCodeModel extends BasePayViewCodeModel<PayCodeModel> {
    @Inject
    public PayViewCodeModel(PayCodeModel payCodeModel) {
        super(payCodeModel);
    }
}
