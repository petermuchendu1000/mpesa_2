package com.huawei.digitalpayment.history.viewmodel;

import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.http.BaseResp;
import com.huawei.digitalpayment.consumer.baselib.model.BaseViewModel;
import com.huawei.digitalpayment.consumer.baselib.util.CommonUtils;
import com.huawei.digitalpayment.consumer.baselib.util.TimeUtils;
import com.huawei.digitalpayment.consumer.sfcui.constants.Constants;
import com.huawei.digitalpayment.history.model.ITransactionHistoryModel;
import com.huawei.digitalpayment.history.model.entity.ChannelTypeResponse;
import com.huawei.digitalpayment.history.model.entity.StaffInfoResponse;
import com.huawei.digitalpayment.history.model.entity.TransactionHistoryQueryCondition;
import com.huawei.digitalpayment.history.model.request.CancelOrderRequest;
import com.huawei.digitalpayment.history.model.request.QueryStaffRequest;
import com.huawei.digitalpayment.history.model.request.TransChannelAndTypesRequest;
import com.huawei.digitalpayment.history.model.request.TransRefundRequest;
import com.huawei.digitalpayment.history.model.request.TransactionDetailRequest;
import com.huawei.digitalpayment.history.model.request.TransactionHistoryListRequest;
import com.huawei.digitalpayment.history.model.response.RefundResp;
import com.huawei.digitalpayment.history.model.response.TransactionHistoryDetailResponse;
import com.huawei.digitalpayment.history.model.response.TransactionRecordResponse;
import com.huawei.payment.mvvm.Resource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Map;

public class BaseTransactionHistoryViewModel<Model extends ITransactionHistoryModel> extends BaseViewModel<Model> {
    public static final int PAGE_COUNT = 20;
    private static final int component2 = 100;
    private static int coroutineCreation = 1;
    private static int getShareableDataState;
    private MutableLiveData<Resource<TransactionHistoryDetailResponse>> ShareDataUIState;
    private MutableLiveData<ChannelTypeResponse> component1;
    private MutableLiveData<StaffInfoResponse> getSponsorBeneficiariesState;
    private MutableLiveData<TransactionRecordResponse> hashCode;
    private MutableLiveData<TransactionRecordResponse> toString;
    protected final Model transactionHistoryModel;
    private final MutableLiveData<BaseException> equals = new MutableLiveData<>();
    private final MutableLiveData<Resource<BaseResp>> getAsAtTimestamp = new MutableLiveData<>();
    private final MutableLiveData<Resource<RefundResp>> getRequestBeneficiariesState = new MutableLiveData<>();
    private final MutableLiveData<Resource<com.huawei.http.BaseResp>> copydefault = new MutableLiveData<>();
    private DateFormat component3 = new SimpleDateFormat(Constants.ISO_DATE_FORMAT);
    private final MutableLiveData<Resource<TransactionRecordResponse>> component4 = new MutableLiveData<>();
    private final MutableLiveData<Resource<TransactionRecordResponse>> copy = new MutableLiveData<>();
    private final MutableLiveData<Resource<StaffInfoResponse>> ArtificialStackFrames = new MutableLiveData<>();
    protected boolean refresh = true;

    public BaseTransactionHistoryViewModel(Model model) {
        this.transactionHistoryModel = model;
    }

    public MutableLiveData<Resource<StaffInfoResponse>> getStaffData() {
        int i = 2 % 2;
        int i2 = coroutineCreation + 97;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        MutableLiveData<Resource<StaffInfoResponse>> mutableLiveData = this.ArtificialStackFrames;
        int i4 = i3 + 65;
        coroutineCreation = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 72 / 0;
        }
        return mutableLiveData;
    }

    public MutableLiveData<Resource<com.huawei.http.BaseResp>> getCancelLiveData() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 23;
        int i3 = i2 % 128;
        coroutineCreation = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<com.huawei.http.BaseResp>> mutableLiveData = this.copydefault;
        int i5 = i3 + 11;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public MutableLiveData<Resource<TransactionRecordResponse>> getListMoreLiveData() {
        MutableLiveData<Resource<TransactionRecordResponse>> mutableLiveData;
        int i = 2 % 2;
        int i2 = coroutineCreation + 107;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        if (i2 % 2 != 0) {
            mutableLiveData = this.copy;
            int i4 = 32 / 0;
        } else {
            mutableLiveData = this.copy;
        }
        int i5 = i3 + 103;
        coroutineCreation = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public MutableLiveData<Resource<TransactionRecordResponse>> getListLiveData() {
        int i = 2 % 2;
        int i2 = coroutineCreation;
        int i3 = i2 + 117;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<TransactionRecordResponse>> mutableLiveData = this.component4;
        int i5 = i2 + 17;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public MutableLiveData<Resource<BaseResp>> getRefundLiveData() {
        MutableLiveData<Resource<BaseResp>> mutableLiveData;
        int i = 2 % 2;
        int i2 = coroutineCreation;
        int i3 = i2 + 41;
        getShareableDataState = i3 % 128;
        if (i3 % 2 != 0) {
            mutableLiveData = this.getAsAtTimestamp;
            int i4 = 64 / 0;
        } else {
            mutableLiveData = this.getAsAtTimestamp;
        }
        int i5 = i2 + 35;
        getShareableDataState = i5 % 128;
        if (i5 % 2 == 0) {
            return mutableLiveData;
        }
        throw null;
    }

    public MutableLiveData<Resource<RefundResp>> getRefundLiveData2() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 113;
        coroutineCreation = i2 % 128;
        if (i2 % 2 != 0) {
            return this.getRequestBeneficiariesState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public MutableLiveData<Resource<TransactionHistoryDetailResponse>> getDetailResponseMutableLiveData() {
        int i = 2 % 2;
        if (this.ShareDataUIState == null) {
            this.ShareDataUIState = new MutableLiveData<>();
            int i2 = getShareableDataState + 15;
            coroutineCreation = i2 % 128;
            int i3 = i2 % 2;
        }
        MutableLiveData<Resource<TransactionHistoryDetailResponse>> mutableLiveData = this.ShareDataUIState;
        int i4 = coroutineCreation + 19;
        getShareableDataState = i4 % 128;
        if (i4 % 2 == 0) {
            return mutableLiveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public MutableLiveData<BaseException> getLoadErrorLiveData() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 119;
        coroutineCreation = i2 % 128;
        if (i2 % 2 != 0) {
            return this.equals;
        }
        throw null;
    }

    @Deprecated
    public MutableLiveData<TransactionRecordResponse> getTransactionRecordRespLiveData() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 75;
        coroutineCreation = i2 % 128;
        int i3 = i2 % 2;
        if (this.toString == null) {
            this.toString = new MutableLiveData<>();
            int i4 = coroutineCreation + 1;
            getShareableDataState = i4 % 128;
            int i5 = i4 % 2;
        }
        return this.toString;
    }

    @Deprecated
    public MutableLiveData<TransactionRecordResponse> getTransactionRecordLoadMoreRespLiveData() {
        int i = 2 % 2;
        int i2 = coroutineCreation + 31;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        if (this.hashCode == null) {
            this.hashCode = new MutableLiveData<>();
            int i4 = coroutineCreation + 15;
            getShareableDataState = i4 % 128;
            int i5 = i4 % 2;
        }
        return this.hashCode;
    }

    public MutableLiveData<ChannelTypeResponse> getChannelTypeResponseMutableLiveData() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 95;
        coroutineCreation = i2 % 128;
        int i3 = i2 % 2;
        if (this.component1 == null) {
            this.component1 = new MutableLiveData<>();
            int i4 = coroutineCreation + 75;
            getShareableDataState = i4 % 128;
            int i5 = i4 % 2;
        }
        return this.component1;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.lifecycle.MutableLiveData<com.huawei.digitalpayment.history.model.entity.StaffInfoResponse> getStaffListResponseMutableLiveData() {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.history.viewmodel.BaseTransactionHistoryViewModel.coroutineCreation
            int r1 = r1 + 47
            int r2 = r1 % 128
            com.huawei.digitalpayment.history.viewmodel.BaseTransactionHistoryViewModel.getShareableDataState = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L16
            androidx.lifecycle.MutableLiveData<com.huawei.digitalpayment.history.model.entity.StaffInfoResponse> r1 = r3.getSponsorBeneficiariesState
            r2 = 3
            int r2 = r2 / 0
            if (r1 != 0) goto L2a
            goto L1a
        L16:
            androidx.lifecycle.MutableLiveData<com.huawei.digitalpayment.history.model.entity.StaffInfoResponse> r1 = r3.getSponsorBeneficiariesState
            if (r1 != 0) goto L2a
        L1a:
            androidx.lifecycle.MutableLiveData r1 = new androidx.lifecycle.MutableLiveData
            r1.<init>()
            r3.getSponsorBeneficiariesState = r1
            int r1 = com.huawei.digitalpayment.history.viewmodel.BaseTransactionHistoryViewModel.getShareableDataState
            int r1 = r1 + 81
            int r2 = r1 % 128
            com.huawei.digitalpayment.history.viewmodel.BaseTransactionHistoryViewModel.coroutineCreation = r2
            int r1 = r1 % r0
        L2a:
            androidx.lifecycle.MutableLiveData<com.huawei.digitalpayment.history.model.entity.StaffInfoResponse> r0 = r3.getSponsorBeneficiariesState
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.history.viewmodel.BaseTransactionHistoryViewModel.getStaffListResponseMutableLiveData():androidx.lifecycle.MutableLiveData");
    }

    @Deprecated
    public void queryTransChannelAndTypes() {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        arrayList.add("tradeTypeConfig");
        TransChannelAndTypesRequest transChannelAndTypesRequest = new TransChannelAndTypesRequest();
        transChannelAndTypesRequest.setConfigTypes(arrayList);
        queryTransChannelAndTypes(transChannelAndTypesRequest);
        int i2 = coroutineCreation + 55;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
    }

    public void queryTransChannelAndTypes(TransChannelAndTypesRequest transChannelAndTypesRequest) {
        int i = 2 % 2;
        this.transactionHistoryModel.queryTransChannelAndTypes(transChannelAndTypesRequest, new ApiCallback<ChannelTypeResponse>() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public void onSuccess(ChannelTypeResponse channelTypeResponse) {
                int i2 = 2 % 2;
                int i3 = component1 + 41;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                component2(channelTypeResponse);
                int i5 = component1 + 37;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 27 / 0;
                }
            }

            public void component2(ChannelTypeResponse channelTypeResponse) {
                int i2 = 2 % 2;
                int i3 = component1 + 101;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0) {
                    super.onSuccess(channelTypeResponse);
                    BaseTransactionHistoryViewModel.this.getChannelTypeResponseMutableLiveData().postValue(channelTypeResponse);
                } else {
                    super.onSuccess(channelTypeResponse);
                    BaseTransactionHistoryViewModel.this.getChannelTypeResponseMutableLiveData().postValue(channelTypeResponse);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
        });
        int i2 = coroutineCreation + 79;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
    }

    public void queryStaffInfoList() {
        int i = 2 % 2;
        QueryStaffRequest queryStaffRequest = new QueryStaffRequest();
        queryStaffRequest.setQueryNum(0);
        queryStaffRequest.setQueryAll("Y");
        queryStaffRequest.setQueryNum(100);
        this.transactionHistoryModel.queryStaffInfoList(queryStaffRequest, new ApiCallback<StaffInfoResponse>() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(StaffInfoResponse staffInfoResponse) {
                int i2 = 2 % 2;
                int i3 = component3 + 29;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                copydefault(staffInfoResponse);
                int i5 = component3 + 19;
                component1 = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }

            public void copydefault(StaffInfoResponse staffInfoResponse) {
                int i2 = 2 % 2;
                int i3 = component1 + 99;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                super.onSuccess(staffInfoResponse);
                BaseTransactionHistoryViewModel.this.getStaffListResponseMutableLiveData().postValue(staffInfoResponse);
                int i5 = component1 + 75;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = getShareableDataState + 103;
        coroutineCreation = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void queryStaffInfoList(QueryStaffRequest queryStaffRequest, boolean z) {
        int i = 2 % 2;
        int i2 = coroutineCreation + 65;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        this.refresh = z;
        if (z) {
            getStaffData().postValue(Resource.loading(null));
            int i4 = getShareableDataState + 45;
            coroutineCreation = i4 % 128;
            int i5 = i4 % 2;
        }
        this.transactionHistoryModel.queryStaffInfoList(queryStaffRequest, new ApiCallback<StaffInfoResponse>() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(StaffInfoResponse staffInfoResponse) {
                int i6 = 2 % 2;
                int i7 = copydefault + 67;
                component3 = i7 % 128;
                int i8 = i7 % 2;
                component2(staffInfoResponse);
                if (i8 == 0) {
                    int i9 = 16 / 0;
                }
                int i10 = copydefault + 73;
                component3 = i10 % 128;
                if (i10 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void component2(StaffInfoResponse staffInfoResponse) {
                int i6 = 2 % 2;
                int i7 = copydefault + 31;
                component3 = i7 % 128;
                if (i7 % 2 != 0) {
                    super.onSuccess(staffInfoResponse);
                    BaseTransactionHistoryViewModel.this.getStaffData().postValue(Resource.success(staffInfoResponse));
                } else {
                    super.onSuccess(staffInfoResponse);
                    BaseTransactionHistoryViewModel.this.getStaffData().postValue(Resource.success(staffInfoResponse));
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i6 = 2 % 2;
                int i7 = component3 + 103;
                copydefault = i7 % 128;
                int i8 = i7 % 2;
                super.onError(baseException);
                BaseTransactionHistoryViewModel.this.getStaffData().postValue(Resource.error(baseException, null));
                int i9 = copydefault + 49;
                component3 = i9 % 128;
                int i10 = i9 % 2;
            }
        });
    }

    public boolean isRefresh() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 67;
        int i3 = i2 % 128;
        coroutineCreation = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.refresh;
        int i4 = i3 + 77;
        getShareableDataState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 79 / 0;
        }
        return z;
    }

    @Deprecated
    public void requestDetailInfo(String str) {
        int i = 2 % 2;
        TransactionDetailRequest transactionDetailRequest = new TransactionDetailRequest();
        transactionDetailRequest.setOrderId(str);
        requestDetailInfo(transactionDetailRequest);
        int i2 = getShareableDataState + 21;
        coroutineCreation = i2 % 128;
        int i3 = i2 % 2;
    }

    public void requestDetailInfo(TransactionDetailRequest transactionDetailRequest) {
        int i = 2 % 2;
        getDetailResponseMutableLiveData().setValue(Resource.loading(null));
        this.transactionHistoryModel.queryTransactionDetail(transactionDetailRequest, new ApiCallback<TransactionHistoryDetailResponse>() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public void onSuccess(TransactionHistoryDetailResponse transactionHistoryDetailResponse) {
                int i2 = 2 % 2;
                int i3 = copydefault + 101;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                component3(transactionHistoryDetailResponse);
                int i5 = copydefault + 89;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void component3(TransactionHistoryDetailResponse transactionHistoryDetailResponse) {
                int i2 = 2 % 2;
                int i3 = copydefault + 21;
                component3 = i3 % 128;
                if (i3 % 2 == 0) {
                    super.onSuccess(transactionHistoryDetailResponse);
                    BaseTransactionHistoryViewModel.this.getDetailResponseMutableLiveData().postValue(Resource.success(transactionHistoryDetailResponse));
                } else {
                    super.onSuccess(transactionHistoryDetailResponse);
                    BaseTransactionHistoryViewModel.this.getDetailResponseMutableLiveData().postValue(Resource.success(transactionHistoryDetailResponse));
                    throw null;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = copydefault + 61;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                super.onError(baseException);
                BaseTransactionHistoryViewModel.this.getDetailResponseMutableLiveData().postValue(Resource.error(baseException, null));
                int i5 = component3 + 109;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 67 / 0;
                }
            }
        });
        int i2 = getShareableDataState + 25;
        coroutineCreation = i2 % 128;
        int i3 = i2 % 2;
    }

    @Deprecated
    public void queryTransRecordDetails(String str) {
        int i = 2 % 2;
        TransactionDetailRequest transactionDetailRequest = new TransactionDetailRequest();
        transactionDetailRequest.setOrderId(str);
        queryTransRecordDetails(transactionDetailRequest);
        int i2 = coroutineCreation + 43;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
    }

    public void queryTransRecordDetails(TransactionDetailRequest transactionDetailRequest) {
        int i = 2 % 2;
        Object obj = null;
        getDetailResponseMutableLiveData().setValue(Resource.loading(null));
        this.transactionHistoryModel.queryTransRecordDetails(transactionDetailRequest, new ApiCallback<TransactionHistoryDetailResponse>() {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public void onSuccess(TransactionHistoryDetailResponse transactionHistoryDetailResponse) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 79;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                Object obj2 = null;
                component1(transactionHistoryDetailResponse);
                if (i4 == 0) {
                    obj2.hashCode();
                    throw null;
                }
                int i5 = component1 + 17;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }

            public void component1(TransactionHistoryDetailResponse transactionHistoryDetailResponse) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 79;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                super.onSuccess(transactionHistoryDetailResponse);
                BaseTransactionHistoryViewModel.this.getDetailResponseMutableLiveData().postValue(Resource.success(transactionHistoryDetailResponse));
                int i5 = ShareDataUIState + 43;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 74 / 0;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 13;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                super.onError(baseException);
                Object obj2 = null;
                BaseTransactionHistoryViewModel.this.getDetailResponseMutableLiveData().postValue(Resource.error(baseException, null));
                int i5 = component1 + 13;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                obj2.hashCode();
                throw null;
            }
        });
        int i2 = getShareableDataState + 63;
        coroutineCreation = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public void queryTransactionHistoryList(TransactionHistoryQueryCondition transactionHistoryQueryCondition, final boolean z) {
        int i = 2 % 2;
        TransactionHistoryListRequest transactionHistoryListRequest = new TransactionHistoryListRequest();
        transactionHistoryListRequest.setIsHomePage(String.valueOf(false));
        transactionHistoryListRequest.setCount(transactionHistoryQueryCondition.getPageSize());
        transactionHistoryListRequest.setStartNum(transactionHistoryQueryCondition.getStartNumber());
        if (TextUtils.isEmpty(transactionHistoryQueryCondition.getDirection())) {
            transactionHistoryListRequest.setFilterTypes(transactionHistoryQueryCondition.getTransactionTypes());
        } else {
            transactionHistoryListRequest.setDirection(transactionHistoryQueryCondition.getDirection());
            ArrayList arrayList = new ArrayList();
            arrayList.add("CashIn_Out");
            arrayList.add("Transfer");
            transactionHistoryListRequest.setFilterTypes(arrayList);
        }
        Calendar endDate = transactionHistoryQueryCondition.getEndDate();
        Calendar startDate = transactionHistoryQueryCondition.getStartDate();
        if (startDate != null) {
            int i2 = coroutineCreation + 51;
            getShareableDataState = i2 % 128;
            int i3 = i2 % 2;
            transactionHistoryListRequest.setStartTime(String.valueOf(TimeUtils.getTimeTodayStart(startDate.getTimeInMillis())));
        }
        if (endDate != null) {
            int i4 = getShareableDataState + 39;
            coroutineCreation = i4 % 128;
            if (i4 % 2 == 0) {
                transactionHistoryListRequest.setEndTime(String.valueOf(TimeUtils.getTimeTodayEnd(endDate.getTimeInMillis())));
                throw null;
            }
            transactionHistoryListRequest.setEndTime(String.valueOf(TimeUtils.getTimeTodayEnd(endDate.getTimeInMillis())));
        }
        this.transactionHistoryModel.queryTransactionHistoryList(transactionHistoryListRequest, new ApiCallback<TransactionRecordResponse>() {
            private static int component2 = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(TransactionRecordResponse transactionRecordResponse) {
                int i5 = 2 % 2;
                int i6 = component2 + 93;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                ShareDataUIState(transactionRecordResponse);
                int i8 = component3 + 13;
                component2 = i8 % 128;
                if (i8 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
            
                if ((r1 % 2) != 0) goto L12;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
            
                r3.component1.getTransactionRecordLoadMoreRespLiveData().postValue(r4);
                r4 = 4 / 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
            
                r3.component1.getTransactionRecordLoadMoreRespLiveData().postValue(r4);
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
            
                r3.component1.getTransactionRecordRespLiveData().postValue(r4);
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
            
                if (r2 != false) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
            
                if (r2 != false) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
            
                r1 = com.huawei.digitalpayment.history.viewmodel.BaseTransactionHistoryViewModel.AnonymousClass7.component2 + 73;
                com.huawei.digitalpayment.history.viewmodel.BaseTransactionHistoryViewModel.AnonymousClass7.component3 = r1 % 128;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void ShareDataUIState(com.huawei.digitalpayment.history.model.response.TransactionRecordResponse r4) {
                /*
                    r3 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = com.huawei.digitalpayment.history.viewmodel.BaseTransactionHistoryViewModel.AnonymousClass7.component3
                    int r1 = r1 + 1
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.history.viewmodel.BaseTransactionHistoryViewModel.AnonymousClass7.component2 = r2
                    int r1 = r1 % r0
                    if (r1 == 0) goto L1a
                    super.onSuccess(r4)
                    boolean r1 = r2
                    r2 = 71
                    int r2 = r2 / 0
                    if (r1 == 0) goto L43
                    goto L21
                L1a:
                    super.onSuccess(r4)
                    boolean r1 = r2
                    if (r1 == 0) goto L43
                L21:
                    int r1 = com.huawei.digitalpayment.history.viewmodel.BaseTransactionHistoryViewModel.AnonymousClass7.component2
                    int r1 = r1 + 73
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.history.viewmodel.BaseTransactionHistoryViewModel.AnonymousClass7.component3 = r2
                    int r1 = r1 % r0
                    if (r1 != 0) goto L39
                    com.huawei.digitalpayment.history.viewmodel.BaseTransactionHistoryViewModel r0 = com.huawei.digitalpayment.history.viewmodel.BaseTransactionHistoryViewModel.this
                    androidx.lifecycle.MutableLiveData r0 = r0.getTransactionRecordLoadMoreRespLiveData()
                    r0.postValue(r4)
                    r4 = 4
                    int r4 = r4 / 0
                    goto L4c
                L39:
                    com.huawei.digitalpayment.history.viewmodel.BaseTransactionHistoryViewModel r0 = com.huawei.digitalpayment.history.viewmodel.BaseTransactionHistoryViewModel.this
                    androidx.lifecycle.MutableLiveData r0 = r0.getTransactionRecordLoadMoreRespLiveData()
                    r0.postValue(r4)
                    goto L4c
                L43:
                    com.huawei.digitalpayment.history.viewmodel.BaseTransactionHistoryViewModel r0 = com.huawei.digitalpayment.history.viewmodel.BaseTransactionHistoryViewModel.this
                    androidx.lifecycle.MutableLiveData r0 = r0.getTransactionRecordRespLiveData()
                    r0.postValue(r4)
                L4c:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.history.viewmodel.BaseTransactionHistoryViewModel.AnonymousClass7.ShareDataUIState(com.huawei.digitalpayment.history.model.response.TransactionRecordResponse):void");
            }

            @Override
            public void onError(BaseException baseException) {
                int i5 = 2 % 2;
                int i6 = component2 + 1;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                super.onError(baseException);
                BaseTransactionHistoryViewModel.this.getLoadErrorLiveData().postValue(baseException);
                int i8 = component2 + 3;
                component3 = i8 % 128;
                int i9 = i8 % 2;
            }
        });
    }

    public void queryTransactionHistoryList(TransactionHistoryListRequest transactionHistoryListRequest, final boolean z) {
        int i = 2 % 2;
        int i2 = coroutineCreation + 73;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        int i4 = i2 % 2;
        if (z) {
            int i5 = i3 + 17;
            coroutineCreation = i5 % 128;
            int i6 = i5 % 2;
            getListMoreLiveData().postValue(Resource.loading(null));
        } else {
            getListLiveData().postValue(Resource.loading(null));
        }
        this.transactionHistoryModel.queryTransactionHistoryList(transactionHistoryListRequest, new ApiCallback<TransactionRecordResponse>() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public void onSuccess(TransactionRecordResponse transactionRecordResponse) {
                int i7 = 2 % 2;
                int i8 = ShareDataUIState + 59;
                component1 = i8 % 128;
                int i9 = i8 % 2;
                copydefault(transactionRecordResponse);
                int i10 = ShareDataUIState + 85;
                component1 = i10 % 128;
                int i11 = i10 % 2;
            }

            public void copydefault(TransactionRecordResponse transactionRecordResponse) {
                int i7 = 2 % 2;
                int i8 = component1 + 91;
                ShareDataUIState = i8 % 128;
                int i9 = i8 % 2;
                super.onSuccess(transactionRecordResponse);
                if (!(!z)) {
                    int i10 = component1 + 59;
                    ShareDataUIState = i10 % 128;
                    int i11 = i10 % 2;
                    BaseTransactionHistoryViewModel.this.getListMoreLiveData().postValue(Resource.success(transactionRecordResponse));
                    int i12 = ShareDataUIState + 1;
                    component1 = i12 % 128;
                    int i13 = i12 % 2;
                } else {
                    BaseTransactionHistoryViewModel.this.getListLiveData().postValue(Resource.success(transactionRecordResponse));
                }
                int i14 = component1 + 27;
                ShareDataUIState = i14 % 128;
                int i15 = i14 % 2;
            }

            @Override
            public void onError(BaseException baseException) {
                int i7 = 2 % 2;
                super.onError(baseException);
                if (z) {
                    BaseTransactionHistoryViewModel.this.getListMoreLiveData().postValue(Resource.error(baseException, null));
                    int i8 = ShareDataUIState + 45;
                    component1 = i8 % 128;
                    int i9 = i8 % 2;
                } else {
                    BaseTransactionHistoryViewModel.this.getListLiveData().postValue(Resource.error(baseException, null));
                }
                int i10 = component1 + 29;
                ShareDataUIState = i10 % 128;
                int i11 = i10 % 2;
            }
        });
    }

    @Deprecated
    public void transRefund(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = coroutineCreation + 69;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        transRefund((TransRefundRequest) CommonUtils.convertMapToObject(map, TransRefundRequest.class));
        int i4 = getShareableDataState + 47;
        coroutineCreation = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public void transRefund(TransRefundRequest transRefundRequest) {
        int i = 2 % 2;
        getRefundLiveData().postValue(Resource.loading(null));
        this.transactionHistoryModel.refund(transRefundRequest, new ApiCallback<RefundResp>() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(RefundResp refundResp) {
                int i2 = 2 % 2;
                int i3 = component1 + 57;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                component2(refundResp);
                int i5 = component1 + 65;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 90 / 0;
                }
            }

            public void component2(RefundResp refundResp) {
                int i2 = 2 % 2;
                int i3 = component3 + 103;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    super.onSuccess(refundResp);
                    BaseTransactionHistoryViewModel.this.getRefundLiveData().postValue(Resource.success(BaseResp.getBaseResp(refundResp)));
                } else {
                    super.onSuccess(refundResp);
                    BaseTransactionHistoryViewModel.this.getRefundLiveData().postValue(Resource.success(BaseResp.getBaseResp(refundResp)));
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component3 + 53;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                super.onError(baseException);
                BaseTransactionHistoryViewModel.this.getRefundLiveData().postValue(Resource.error(baseException, null));
                int i5 = component3 + 15;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = getShareableDataState + 25;
        coroutineCreation = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public void transRefund2(TransRefundRequest transRefundRequest) {
        int i = 2 % 2;
        getRefundLiveData2().postValue(Resource.loading(null));
        this.transactionHistoryModel.refund(transRefundRequest, new ApiCallback<RefundResp>() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(RefundResp refundResp) {
                int i2 = 2 % 2;
                int i3 = component2 + 109;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                copydefault(refundResp);
                if (i4 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = component2 + 37;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }

            public void copydefault(RefundResp refundResp) {
                int i2 = 2 % 2;
                int i3 = component2 + 123;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                super.onSuccess(refundResp);
                BaseTransactionHistoryViewModel.this.getRefundLiveData2().postValue(Resource.success(refundResp));
                int i5 = copydefault + 61;
                component2 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component2 + 13;
                copydefault = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    super.onError(baseException);
                    BaseTransactionHistoryViewModel.this.getRefundLiveData2().postValue(Resource.error(baseException, null));
                    int i4 = copydefault + 81;
                    component2 = i4 % 128;
                    if (i4 % 2 == 0) {
                        throw null;
                    }
                    return;
                }
                super.onError(baseException);
                BaseTransactionHistoryViewModel.this.getRefundLiveData2().postValue(Resource.error(baseException, null));
                obj.hashCode();
                throw null;
            }
        });
        int i2 = coroutineCreation + 121;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
    }

    public void cancelRiskTransaction(CancelOrderRequest cancelOrderRequest) {
        int i = 2 % 2;
        getCancelLiveData().postValue(Resource.loading(null));
        this.transactionHistoryModel.cancelRiskTransaction(cancelOrderRequest, new ApiCallback<com.huawei.http.BaseResp>() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public void onSuccess(com.huawei.http.BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = component1 + 17;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                copydefault(baseResp);
                int i5 = component2 + 91;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }

            public void copydefault(com.huawei.http.BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = component2 + 55;
                component1 = i3 % 128;
                if (i3 % 2 != 0) {
                    super.onSuccess(baseResp);
                    BaseTransactionHistoryViewModel.this.getCancelLiveData().postValue(Resource.success(baseResp));
                } else {
                    super.onSuccess(baseResp);
                    BaseTransactionHistoryViewModel.this.getCancelLiveData().postValue(Resource.success(baseResp));
                    throw null;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component2 + 15;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                super.onError(baseException);
                BaseTransactionHistoryViewModel.this.getCancelLiveData().postValue(Resource.error(baseException, null));
                int i5 = component2 + 121;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = coroutineCreation + 61;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
    }
}
