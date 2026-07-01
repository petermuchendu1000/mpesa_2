package com.huawei.digitalpayment.checkout.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.checkout.constants.TradeTypeEnum;
import com.huawei.digitalpayment.checkout.model.request.CancelPayOrderRequest;
import com.huawei.digitalpayment.checkout.model.request.H5CheckoutRequest;
import com.huawei.digitalpayment.checkout.model.request.PayRequest;
import com.huawei.digitalpayment.checkout.model.request.SubscribeOdRequest;
import com.huawei.digitalpayment.checkout.model.request.TransferRequest;
import com.huawei.digitalpayment.checkout.model.response.CheckoutResp;
import com.huawei.digitalpayment.checkout.model.response.SubscribeOdResp;
import com.huawei.digitalpayment.checkout.model.response.TransferResp;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.http.BaseResp;
import java.util.Map;

public interface IPayModel extends BaseModel {
    void cancelPayOrder(CancelPayOrderRequest cancelPayOrderRequest, ApiCallback<BaseResp> apiCallback);

    void checkOut(H5CheckoutRequest h5CheckoutRequest, ApiCallback<CheckoutResp> apiCallback);

    void checkOut(Map<String, Object> map, ApiCallback<CheckoutResp> apiCallback);

    void payOrder(TradeTypeEnum tradeTypeEnum, PayRequest payRequest, ApiCallback<TransferResp> apiCallback);

    void preOrder(TradeTypeEnum tradeTypeEnum, Map<String, Object> map, ApiCallback<CheckoutResp> apiCallback);

    void subscribe(SubscribeOdRequest subscribeOdRequest, ApiCallback<SubscribeOdResp> apiCallback);

    void transfer(String str, TransferRequest transferRequest, ApiCallback<TransferResp> apiCallback);
}
