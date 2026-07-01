package com.huawei.digitalpayment.checkout.viewmodel;

import com.huawei.digitalpayment.checkout.model.IPayModel;
import javax.inject.Inject;

public class CheckoutViewModel extends BaseCheckoutViewModel<IPayModel> {
    @Inject
    public CheckoutViewModel(IPayModel iPayModel) {
        super(iPayModel);
    }
}
