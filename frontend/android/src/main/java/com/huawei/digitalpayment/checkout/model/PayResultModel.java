package com.huawei.digitalpayment.checkout.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.checkout.model.request.QueryAsyncRequest;
import com.huawei.digitalpayment.checkout.model.request.QueryBannerRequest;
import com.huawei.digitalpayment.checkout.model.request.TransDetailsRequest;
import com.huawei.digitalpayment.checkout.model.response.QueryBannerResp;
import com.huawei.digitalpayment.checkout.model.response.TransRecordDetailResponse;
import com.huawei.digitalpayment.checkout.model.response.TransferResp;
import com.huawei.digitalpayment.checkout.repository.BannerRepository;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import javax.inject.Inject;

public class PayResultModel implements IPayResultModel {
    private static int component1 = 0;
    private static int component3 = 1;
    private BannerRepository component2;

    @Inject
    public PayResultModel() {
    }

    @Override
    public void queryBanners(QueryBannerRequest queryBannerRequest, ApiCallback<QueryBannerResp> apiCallback) {
        int i = 2 % 2;
        BannerRepository bannerRepository = new BannerRepository();
        this.component2 = bannerRepository;
        bannerRepository.addParams(queryBannerRequest);
        this.component2.sendRequest(apiCallback);
        int i2 = component3 + 113;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 29 / 0;
        }
    }

    @Override
    public void queryTransDetails(TransDetailsRequest transDetailsRequest, ApiCallback<TransRecordDetailResponse> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<TransRecordDetailResponse> paymentRequest = new PaymentRequest<TransRecordDetailResponse>(this) {
            private static int component2 = 1;
            private static int component3;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component2;
                int i4 = i3 + 39;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = i3 + 21;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                return "queryTransDetails";
            }
        };
        paymentRequest.addParams(transDetailsRequest);
        paymentRequest.sendRequest(apiCallback);
        int i2 = component3 + 31;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void queryTransRecordDetails(TransDetailsRequest transDetailsRequest, ApiCallback<TransRecordDetailResponse> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<TransRecordDetailResponse> paymentRequest = new PaymentRequest<TransRecordDetailResponse>(this) {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = copydefault;
                int i4 = i3 + 53;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 57 / 0;
                }
                int i6 = i3 + 29;
                component3 = i6 % 128;
                if (i6 % 2 != 0) {
                    return "queryTransRecordDetails";
                }
                throw null;
            }
        };
        paymentRequest.addParams(transDetailsRequest);
        paymentRequest.sendRequest(apiCallback);
        int i2 = component3 + 73;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void queryAsyncTransDetails(QueryAsyncRequest queryAsyncRequest, ApiCallback<TransferResp> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<TransferResp> paymentRequest = new PaymentRequest<TransferResp>(this) {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component3;
                int i4 = i3 + 7;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 45 / 0;
                }
                int i6 = i3 + 91;
                ShareDataUIState = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 88 / 0;
                }
                return "queryAsyncTransDetails";
            }
        };
        paymentRequest.addParams(queryAsyncRequest);
        paymentRequest.sendRequest(apiCallback);
        int i2 = component3 + 61;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
