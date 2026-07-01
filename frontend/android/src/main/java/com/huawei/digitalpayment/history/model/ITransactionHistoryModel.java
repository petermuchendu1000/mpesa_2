package com.huawei.digitalpayment.history.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.history.model.entity.ChannelTypeResponse;
import com.huawei.digitalpayment.history.model.entity.StaffInfoResponse;
import com.huawei.digitalpayment.history.model.request.CancelOrderRequest;
import com.huawei.digitalpayment.history.model.request.QueryStaffRequest;
import com.huawei.digitalpayment.history.model.request.TransChannelAndTypesRequest;
import com.huawei.digitalpayment.history.model.request.TransRefundRequest;
import com.huawei.digitalpayment.history.model.request.TransactionDetailRequest;
import com.huawei.digitalpayment.history.model.request.TransactionHistoryListRequest;
import com.huawei.digitalpayment.history.model.response.RefundResp;
import com.huawei.digitalpayment.history.model.response.TransactionHistoryDetailResponse;
import com.huawei.digitalpayment.history.model.response.TransactionRecordResponse;
import com.huawei.http.BaseResp;

public interface ITransactionHistoryModel extends BaseModel {
    void cancelRiskTransaction(CancelOrderRequest cancelOrderRequest, ApiCallback<BaseResp> apiCallback);

    void queryStaffInfoList(QueryStaffRequest queryStaffRequest, ApiCallback<StaffInfoResponse> apiCallback);

    void queryTransChannelAndTypes(TransChannelAndTypesRequest transChannelAndTypesRequest, ApiCallback<ChannelTypeResponse> apiCallback);

    void queryTransRecordDetails(TransactionDetailRequest transactionDetailRequest, ApiCallback<TransactionHistoryDetailResponse> apiCallback);

    void queryTransactionDetail(TransactionDetailRequest transactionDetailRequest, ApiCallback<TransactionHistoryDetailResponse> apiCallback);

    void queryTransactionHistoryList(TransactionHistoryListRequest transactionHistoryListRequest, ApiCallback<TransactionRecordResponse> apiCallback);

    void refund(TransRefundRequest transRefundRequest, ApiCallback<RefundResp> apiCallback);
}
