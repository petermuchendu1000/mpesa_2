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
import com.huawei.digitalpayment.checkout.repository.CheckOutRepository;
import com.huawei.digitalpayment.checkout.repository.ExplorePaymentChannelRepository;
import com.huawei.digitalpayment.checkout.repository.PayOrderRepository;
import com.huawei.digitalpayment.checkout.repository.PreOrderRepository;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.http.BaseRequest;
import com.huawei.http.BaseResp;
import java.util.Map;
import javax.inject.Inject;

public class DefaultPayModel implements IPayModel {
    private static int component1 = 0;
    private static int getRequestBeneficiariesState = 1;
    private PreOrderRepository ShareDataUIState;
    private ExplorePaymentChannelRepository component2;
    private CheckOutRepository component3;
    private PayOrderRepository copydefault;

    @Inject
    public DefaultPayModel() {
    }

    @Override
    public void preOrder(TradeTypeEnum tradeTypeEnum, Map<String, Object> map, ApiCallback<CheckoutResp> apiCallback) {
        int i = 2 % 2;
        PreOrderRepository preOrderRepository = new PreOrderRepository(tradeTypeEnum, map);
        this.ShareDataUIState = preOrderRepository;
        preOrderRepository.sendRequest(apiCallback);
        int i2 = getRequestBeneficiariesState + 11;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void checkOut(H5CheckoutRequest h5CheckoutRequest, ApiCallback<CheckoutResp> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<CheckoutResp> paymentRequest = new PaymentRequest<CheckoutResp>(this) {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component1;
                int i4 = i3 + 27;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 19;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                return "h5Checkout";
            }
        };
        paymentRequest.addParams(h5CheckoutRequest);
        sendRequest(paymentRequest, apiCallback);
        int i2 = getRequestBeneficiariesState + 99;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void checkOut(Map<String, Object> map, ApiCallback<CheckoutResp> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<CheckoutResp> paymentRequest = new PaymentRequest<CheckoutResp>(this) {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component2;
                int i4 = i3 + 33;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 37;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                return "h5Checkout";
            }
        };
        paymentRequest.addParams(map);
        sendRequest(paymentRequest, apiCallback);
        int i2 = component1 + 21;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 99 / 0;
        }
    }

    @Override
    public void payOrder(TradeTypeEnum tradeTypeEnum, PayRequest payRequest, ApiCallback<TransferResp> apiCallback) {
        int i = 2 % 2;
        PayOrderRepository payOrderRepository = new PayOrderRepository(tradeTypeEnum, payRequest);
        this.copydefault = payOrderRepository;
        payOrderRepository.sendRequest(apiCallback);
        int i2 = getRequestBeneficiariesState + 57;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void transfer(final String str, TransferRequest transferRequest, ApiCallback<TransferResp> apiCallback) throws Throwable {
        int i = 2 % 2;
        BaseRequest<TransferResp> baseRequest = new BaseRequest<TransferResp>(this) {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = copydefault;
                int i4 = i3 + 63;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                String str2 = str;
                int i6 = i3 + 37;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                return str2;
            }
        };
        baseRequest.addParams(transferRequest);
        baseRequest.sendRequest(apiCallback);
        int i2 = component1 + 77;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void cancelPayOrder(CancelPayOrderRequest cancelPayOrderRequest, ApiCallback<BaseResp> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<BaseResp> paymentRequest = new PaymentRequest<BaseResp>(this) {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = copydefault;
                int i4 = i3 + 87;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 21;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                return "cancelPayOrder";
            }
        };
        paymentRequest.addParams(cancelPayOrderRequest);
        sendRequest(paymentRequest, apiCallback);
        int i2 = getRequestBeneficiariesState + 7;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 26 / 0;
        }
    }

    @Override
    public void subscribe(SubscribeOdRequest subscribeOdRequest, ApiCallback<SubscribeOdResp> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<SubscribeOdResp> paymentRequest = new PaymentRequest<SubscribeOdResp>(this) {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component2;
                int i4 = i3 + 125;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
                int i5 = i3 + 71;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    return "subscribe";
                }
                throw null;
            }
        };
        paymentRequest.addParams(subscribeOdRequest);
        sendRequest(paymentRequest, apiCallback);
        int i2 = component1 + 89;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }
}
