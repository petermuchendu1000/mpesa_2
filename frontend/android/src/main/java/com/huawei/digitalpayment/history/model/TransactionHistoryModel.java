package com.huawei.digitalpayment.history.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
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
import com.huawei.digitalpayment.history.repository.TransChannelAndTypesRepository;
import com.huawei.digitalpayment.history.repository.TransactionDetailRepository;
import com.huawei.digitalpayment.history.repository.TransactionHisListRepository;
import com.huawei.http.BaseResp;
import javax.inject.Inject;

public class TransactionHistoryModel implements ITransactionHistoryModel, BaseModel {
    private static int ShareDataUIState = 1;
    private static final int component1 = 100;
    private static int component2;
    private TransactionHisListRepository copydefault;

    @Inject
    public TransactionHistoryModel() {
    }

    @Override
    public void queryTransChannelAndTypes(TransChannelAndTypesRequest transChannelAndTypesRequest, ApiCallback<ChannelTypeResponse> apiCallback) {
        int i = 2 % 2;
        TransChannelAndTypesRepository transChannelAndTypesRepository = new TransChannelAndTypesRepository();
        transChannelAndTypesRepository.addParams(transChannelAndTypesRequest);
        transChannelAndTypesRepository.sendRequest(apiCallback);
        int i2 = ShareDataUIState + 71;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void queryTransactionDetail(TransactionDetailRequest transactionDetailRequest, ApiCallback<TransactionHistoryDetailResponse> apiCallback) {
        int i = 2 % 2;
        TransactionDetailRepository transactionDetailRepository = new TransactionDetailRepository();
        transactionDetailRepository.addParams(transactionDetailRequest);
        transactionDetailRepository.sendRequest(apiCallback);
        int i2 = component2 + 87;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 25 / 0;
        }
    }

    @Override
    public void queryTransRecordDetails(TransactionDetailRequest transactionDetailRequest, ApiCallback<TransactionHistoryDetailResponse> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<TransactionHistoryDetailResponse> paymentRequest = new PaymentRequest<TransactionHistoryDetailResponse>(this) {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = copydefault + 7;
                int i4 = i3 % 128;
                component1 = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 47;
                copydefault = i6 % 128;
                if (i6 % 2 == 0) {
                    return "queryTransRecordDetails";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        paymentRequest.addParams(transactionDetailRequest);
        sendRequest(paymentRequest, apiCallback);
        int i2 = ShareDataUIState + 121;
        component2 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void queryTransactionHistoryList(TransactionHistoryListRequest transactionHistoryListRequest, ApiCallback<TransactionRecordResponse> apiCallback) {
        int i = 2 % 2;
        TransactionHisListRepository transactionHisListRepository = new TransactionHisListRepository();
        this.copydefault = transactionHisListRepository;
        transactionHisListRepository.addParams(transactionHistoryListRequest);
        this.copydefault.sendRequest(apiCallback);
        int i2 = ShareDataUIState + 105;
        component2 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void refund(TransRefundRequest transRefundRequest, ApiCallback<RefundResp> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<RefundResp> paymentRequest = new PaymentRequest<RefundResp>(this) {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = copydefault + 125;
                int i4 = i3 % 128;
                ShareDataUIState = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 43;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                return "transRefund";
            }
        };
        paymentRequest.addParams(transRefundRequest);
        sendRequest(paymentRequest, apiCallback);
        int i2 = component2 + 31;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public void cancelRiskTransaction(CancelOrderRequest cancelOrderRequest, ApiCallback<BaseResp> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<BaseResp> paymentRequest = new PaymentRequest<BaseResp>(this) {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component2;
                int i4 = i3 + 33;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = i3 + 125;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                return "cancelRiskTransaction";
            }
        };
        paymentRequest.addParams(cancelOrderRequest);
        sendRequest(paymentRequest, apiCallback);
        int i2 = ShareDataUIState + 1;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void queryStaffInfoList(QueryStaffRequest queryStaffRequest, ApiCallback<StaffInfoResponse> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<StaffInfoResponse> paymentRequest = new PaymentRequest<StaffInfoResponse>(this) {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component3 + 83;
                int i4 = i3 % 128;
                copydefault = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 17;
                component3 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 2 / 0;
                }
                return "queryStaffInfoList";
            }
        };
        paymentRequest.addParams("initiatorShortCode", SPUtils.getInstance().getString(KeysConstants.RECENT_LOGIN_SHORT_CODE));
        paymentRequest.addParams("initiatorOperatorCode", SPUtils.getInstance().getString(KeysConstants.RECENT_LOGIN_OPERATOR_CODE));
        paymentRequest.addParams(queryStaffRequest);
        sendRequest(paymentRequest, apiCallback);
        int i2 = component2 + 21;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }
}
