package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.mpin.data.IGetTokenModel;
import javax.inject.Inject;

public class GetPinTokenViewModel extends BaseGetPinTokenViewModel<IGetTokenModel> {
    @Inject
    public GetPinTokenViewModel(IGetTokenModel iGetTokenModel) {
        super(iGetTokenModel);
    }
}
