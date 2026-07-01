package com.huawei.digitalpayment.consumer.qrcode.viewmodel;

import com.huawei.digitalpayment.consumer.qrcode.model.ReceiveCodeModel;
import javax.inject.Inject;

public class ReceiveCodeViewModel extends BaseReceiveCodeViewModel<ReceiveCodeModel> {
    @Inject
    public ReceiveCodeViewModel(ReceiveCodeModel receiveCodeModel) {
        super(receiveCodeModel);
    }
}
