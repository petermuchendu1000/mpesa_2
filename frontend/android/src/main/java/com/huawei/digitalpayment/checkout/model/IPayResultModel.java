package com.huawei.digitalpayment.checkout.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.checkout.model.request.QueryAsyncRequest;
import com.huawei.digitalpayment.checkout.model.request.QueryBannerRequest;
import com.huawei.digitalpayment.checkout.model.request.TransDetailsRequest;
import com.huawei.digitalpayment.checkout.model.response.QueryBannerResp;
import com.huawei.digitalpayment.checkout.model.response.TransRecordDetailResponse;
import com.huawei.digitalpayment.checkout.model.response.TransferResp;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;

public interface IPayResultModel extends BaseModel {
    void queryAsyncTransDetails(QueryAsyncRequest queryAsyncRequest, ApiCallback<TransferResp> apiCallback);

    void queryBanners(QueryBannerRequest queryBannerRequest, ApiCallback<QueryBannerResp> apiCallback);

    void queryTransDetails(TransDetailsRequest transDetailsRequest, ApiCallback<TransRecordDetailResponse> apiCallback);

    void queryTransRecordDetails(TransDetailsRequest transDetailsRequest, ApiCallback<TransRecordDetailResponse> apiCallback);
}
