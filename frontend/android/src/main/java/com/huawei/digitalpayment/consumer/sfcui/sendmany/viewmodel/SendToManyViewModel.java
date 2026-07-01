package com.huawei.digitalpayment.consumer.sfcui.sendmany.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.checkout.resp.BatchTransferQueryPreOrderResp;
import com.huawei.digitalpayment.checkout.resp.QueryCheckoutResp;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.scan.model.request.VerifyTransferRequest;
import com.huawei.digitalpayment.consumer.scan.model.response.VerifyNumberResp;
import com.huawei.digitalpayment.consumer.scan.repository.VerifyP2PTransferRepository;
import com.huawei.digitalpayment.consumer.sfcui.sendmany.data.BatchTransferCheckOutResp;
import com.huawei.digitalpayment.consumer.sfcui.sendmany.data.BatchTransferPreResp;
import com.huawei.digitalpayment.consumer.sfcui.sendmany.data.QueryPayOrderResp;
import com.huawei.payment.mvvm.Resource;
import com.iap.ac.android.acs.operation.log.LogConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006J\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u0006J\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00070\u0006J\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00070\u0006J\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00070\u0006J\u001a\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017J\u001a\u0010\u001a\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017J\u001a\u0010\u001b\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017J\u001a\u0010\u001c\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017J\u001a\u0010\u001d\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017J\u0010\u0010\u001e\u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u0018R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sendmany/viewmodel/SendToManyViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "<init>", "()V", "preData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/sfcui/sendmany/data/BatchTransferPreResp;", "queryPreData", "Lcom/huawei/digitalpayment/checkout/resp/BatchTransferQueryPreOrderResp;", "checkData", "Lcom/huawei/digitalpayment/consumer/sfcui/sendmany/data/BatchTransferCheckOutResp;", "queryCheckData", "Lcom/huawei/digitalpayment/checkout/resp/QueryCheckoutResp;", "queryPayOrderData", "Lcom/huawei/digitalpayment/consumer/sfcui/sendmany/data/QueryPayOrderResp;", "verifyData", "Lcom/huawei/digitalpayment/consumer/scan/model/response/VerifyNumberResp;", "preOrderData", LogConstants.Mpm.EndNodeType.PREORDER, "", "params", "", "", "", "queryPreOrder", "checkout", "queryCheckout", "queryPayOrder", "verifyP2PTransfer", "receiverMsisdn", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SendToManyViewModel extends ViewModel implements BaseModel {
    public static final int $stable = 8;
    private static int component4 = 1;
    private static int equals = 0;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState;
    private final MutableLiveData<Resource<BatchTransferPreResp>> component1 = new MutableLiveData<>();
    private final MutableLiveData<Resource<BatchTransferQueryPreOrderResp>> ShareDataUIState = new MutableLiveData<>();
    private final MutableLiveData<Resource<BatchTransferCheckOutResp>> copydefault = new MutableLiveData<>();
    private final MutableLiveData<Resource<QueryCheckoutResp>> component2 = new MutableLiveData<>();
    private final MutableLiveData<Resource<QueryPayOrderResp>> component3 = new MutableLiveData<>();
    private final MutableLiveData<Resource<VerifyNumberResp>> copy = new MutableLiveData<>();

    public static final MutableLiveData access$getCheckData$p(SendToManyViewModel sendToManyViewModel) {
        int i = 2 % 2;
        int i2 = equals + 3;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<Resource<BatchTransferCheckOutResp>> mutableLiveData = sendToManyViewModel.copydefault;
        if (i3 == 0) {
            int i4 = 1 / 0;
        }
        return mutableLiveData;
    }

    public static final MutableLiveData access$getPreData$p(SendToManyViewModel sendToManyViewModel) {
        int i = 2 % 2;
        int i2 = component4 + 51;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<BatchTransferPreResp>> mutableLiveData = sendToManyViewModel.component1;
        int i5 = i3 + 17;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 67 / 0;
        }
        return mutableLiveData;
    }

    public static final MutableLiveData access$getQueryCheckData$p(SendToManyViewModel sendToManyViewModel) {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 83;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<QueryCheckoutResp>> mutableLiveData = sendToManyViewModel.component2;
        int i5 = i2 + 81;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            return mutableLiveData;
        }
        throw null;
    }

    public static final MutableLiveData access$getQueryPayOrderData$p(SendToManyViewModel sendToManyViewModel) {
        int i = 2 % 2;
        int i2 = component4 + 63;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<QueryPayOrderResp>> mutableLiveData = sendToManyViewModel.component3;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 61;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            return mutableLiveData;
        }
        throw null;
    }

    public static final MutableLiveData access$getQueryPreData$p(SendToManyViewModel sendToManyViewModel) {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 113;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<BatchTransferQueryPreOrderResp>> mutableLiveData = sendToManyViewModel.ShareDataUIState;
        if (i4 == 0) {
            int i5 = 43 / 0;
        }
        int i6 = i2 + 87;
        component4 = i6 % 128;
        int i7 = i6 % 2;
        return mutableLiveData;
    }

    public static final MutableLiveData access$getVerifyData$p(SendToManyViewModel sendToManyViewModel) {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 73;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<VerifyNumberResp>> mutableLiveData = sendToManyViewModel.copy;
        int i5 = i2 + 7;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 24 / 0;
        }
        return mutableLiveData;
    }

    public final MutableLiveData<Resource<BatchTransferPreResp>> preOrderData() {
        int i = 2 % 2;
        int i2 = component4 + 1;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<BatchTransferPreResp>> mutableLiveData = this.component1;
        int i5 = i3 + 15;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public final MutableLiveData<Resource<BatchTransferQueryPreOrderResp>> queryPreData() {
        int i = 2 % 2;
        int i2 = component4 + 107;
        equals = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<Resource<BatchTransferQueryPreOrderResp>> mutableLiveData = this.ShareDataUIState;
        if (i3 != 0) {
            int i4 = 33 / 0;
        }
        return mutableLiveData;
    }

    public final MutableLiveData<Resource<BatchTransferCheckOutResp>> checkData() {
        int i = 2 % 2;
        int i2 = component4 + 105;
        int i3 = i2 % 128;
        equals = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        MutableLiveData<Resource<BatchTransferCheckOutResp>> mutableLiveData = this.copydefault;
        int i4 = i3 + 31;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return mutableLiveData;
    }

    public final MutableLiveData<Resource<QueryCheckoutResp>> queryCheckData() {
        int i = 2 % 2;
        int i2 = component4 + 85;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<QueryCheckoutResp>> mutableLiveData = this.component2;
        int i5 = i3 + 17;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public final MutableLiveData<Resource<QueryPayOrderResp>> queryPayOrderData() {
        int i = 2 % 2;
        int i2 = equals + 125;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<QueryPayOrderResp>> mutableLiveData = this.component3;
        int i5 = i3 + 19;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            return mutableLiveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final MutableLiveData<Resource<VerifyNumberResp>> verifyData() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 45;
        equals = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<VerifyNumberResp>> mutableLiveData = this.copy;
        int i5 = i2 + 87;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public final void preOrder(Map<String, Object> params) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        this.component1.setValue(Resource.loading(null));
        PaymentRequest<BatchTransferPreResp> paymentRequest = new PaymentRequest<BatchTransferPreResp>() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component3;
                int i4 = i3 + 75;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 7;
                ShareDataUIState = i6 % 128;
                if (i6 % 2 != 0) {
                    return "batchTransfer/preOrder";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        paymentRequest.addParams(params);
        sendRequest(paymentRequest, new ApiCallback<BatchTransferPreResp>() {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public void onSuccess(BatchTransferPreResp batchTransferPreResp) {
                int i2 = 2 % 2;
                int i3 = component2 + 53;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(batchTransferPreResp);
                if (i4 == 0) {
                    int i5 = 0 / 0;
                }
            }

            public void onSuccess2(BatchTransferPreResp value) {
                int i2 = 2 % 2;
                int i3 = component2 + 59;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(value, "");
                SendToManyViewModel.access$getPreData$p(SendToManyViewModel.this).setValue(Resource.success(value));
                int i5 = component2 + 73;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = component2 + 37;
                copydefault = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    SendToManyViewModel.access$getPreData$p(SendToManyViewModel.this).setValue(Resource.error(e, null));
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(e, "");
                SendToManyViewModel.access$getPreData$p(SendToManyViewModel.this).setValue(Resource.error(e, null));
                int i4 = component2 + 87;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        int i2 = equals + 101;
        component4 = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void queryPreOrder(Map<String, Object> params) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        this.ShareDataUIState.setValue(Resource.loading(null));
        PaymentRequest<BatchTransferQueryPreOrderResp> paymentRequest = new PaymentRequest<BatchTransferQueryPreOrderResp>() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component3 + 3;
                int i4 = i3 % 128;
                ShareDataUIState = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 75;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                return "batchTransfer/queryPreOrder";
            }
        };
        paymentRequest.addParams(params);
        sendRequest(paymentRequest, new ApiCallback<BatchTransferQueryPreOrderResp>() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public void onSuccess(BatchTransferQueryPreOrderResp batchTransferQueryPreOrderResp) {
                int i2 = 2 % 2;
                int i3 = component2 + 121;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(batchTransferQueryPreOrderResp);
                if (i4 != 0) {
                    throw null;
                }
            }

            public void onSuccess2(BatchTransferQueryPreOrderResp value) {
                int i2 = 2 % 2;
                int i3 = component2 + 87;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(value, "");
                    SendToManyViewModel.access$getQueryPreData$p(SendToManyViewModel.this).setValue(Resource.success(value));
                } else {
                    Intrinsics.checkNotNullParameter(value, "");
                    SendToManyViewModel.access$getQueryPreData$p(SendToManyViewModel.this).setValue(Resource.success(value));
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = component2 + 21;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    SendToManyViewModel.access$getQueryPreData$p(SendToManyViewModel.this).setValue(Resource.error(e, null));
                } else {
                    Intrinsics.checkNotNullParameter(e, "");
                    SendToManyViewModel.access$getQueryPreData$p(SendToManyViewModel.this).setValue(Resource.error(e, null));
                    int i4 = 51 / 0;
                }
            }
        });
        int i2 = equals + 93;
        component4 = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void checkout(Map<String, Object> params) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        this.copydefault.setValue(Resource.loading(null));
        PaymentRequest<BatchTransferCheckOutResp> paymentRequest = new PaymentRequest<BatchTransferCheckOutResp>() {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState;
                int i4 = i3 + 125;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 35;
                component1 = i6 % 128;
                if (i6 % 2 != 0) {
                    return "batchTransfer/checkout";
                }
                throw null;
            }
        };
        paymentRequest.addParams(params);
        sendRequest(paymentRequest, new ApiCallback<BatchTransferCheckOutResp>() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public void onSuccess(BatchTransferCheckOutResp batchTransferCheckOutResp) {
                int i2 = 2 % 2;
                int i3 = copydefault + 29;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(batchTransferCheckOutResp);
                if (i4 != 0) {
                    int i5 = 82 / 0;
                }
                int i6 = copydefault + 27;
                ShareDataUIState = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 98 / 0;
                }
            }

            public void onSuccess2(BatchTransferCheckOutResp value) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 87;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(value, "");
                SendToManyViewModel.access$getCheckData$p(SendToManyViewModel.this).setValue(Resource.success(value));
                int i5 = ShareDataUIState + 109;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = copydefault + 53;
                ShareDataUIState = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    SendToManyViewModel.access$getCheckData$p(SendToManyViewModel.this).setValue(Resource.error(e, null));
                } else {
                    Intrinsics.checkNotNullParameter(e, "");
                    SendToManyViewModel.access$getCheckData$p(SendToManyViewModel.this).setValue(Resource.error(e, null));
                    obj.hashCode();
                    throw null;
                }
            }
        });
        int i2 = equals + 73;
        component4 = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void queryCheckout(Map<String, Object> params) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        this.component2.setValue(Resource.loading(null));
        PaymentRequest<QueryCheckoutResp> paymentRequest = new PaymentRequest<QueryCheckoutResp>() {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState;
                int i4 = i3 + 15;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 84 / 0;
                }
                int i6 = i3 + 63;
                component1 = i6 % 128;
                int i7 = i6 % 2;
                return "batchTransfer/queryCheckout";
            }
        };
        paymentRequest.addParams(params);
        sendRequest(paymentRequest, new ApiCallback<QueryCheckoutResp>() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public void onSuccess(QueryCheckoutResp queryCheckoutResp) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 1;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(queryCheckoutResp);
                int i5 = component2 + 67;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 93 / 0;
                }
            }

            public void onSuccess2(QueryCheckoutResp value) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 21;
                component2 = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(value, "");
                    SendToManyViewModel.access$getQueryCheckData$p(SendToManyViewModel.this).setValue(Resource.success(value));
                } else {
                    Intrinsics.checkNotNullParameter(value, "");
                    SendToManyViewModel.access$getQueryCheckData$p(SendToManyViewModel.this).setValue(Resource.success(value));
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = component2 + 103;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    SendToManyViewModel.access$getQueryCheckData$p(SendToManyViewModel.this).setValue(Resource.error(e, null));
                    int i4 = 21 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(e, "");
                    SendToManyViewModel.access$getQueryCheckData$p(SendToManyViewModel.this).setValue(Resource.error(e, null));
                }
                int i5 = ShareDataUIState + 7;
                component2 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }
        });
        int i2 = component4 + 73;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 97 / 0;
        }
    }

    public final void queryPayOrder(Map<String, Object> params) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        this.component3.setValue(Resource.loading(null));
        PaymentRequest<QueryPayOrderResp> paymentRequest = new PaymentRequest<QueryPayOrderResp>() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component2 + 69;
                int i4 = i3 % 128;
                component1 = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 99;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                return "batchTransfer/queryPayOrder";
            }
        };
        paymentRequest.addParams(params);
        sendRequest(paymentRequest, new ApiCallback<QueryPayOrderResp>() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public void onSuccess(QueryPayOrderResp queryPayOrderResp) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 93;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(queryPayOrderResp);
                int i5 = ShareDataUIState + 55;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void onSuccess2(QueryPayOrderResp value) {
                int i2 = 2 % 2;
                int i3 = copydefault + 45;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(value, "");
                SendToManyViewModel.access$getQueryPayOrderData$p(SendToManyViewModel.this).setValue(Resource.success(value));
                int i5 = ShareDataUIState + 81;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 7;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    SendToManyViewModel.access$getQueryPayOrderData$p(SendToManyViewModel.this).setValue(Resource.error(e, null));
                    int i4 = 78 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(e, "");
                    SendToManyViewModel.access$getQueryPayOrderData$p(SendToManyViewModel.this).setValue(Resource.error(e, null));
                }
                int i5 = ShareDataUIState + 35;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = equals + 87;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 92 / 0;
        }
    }

    public final void verifyP2PTransfer(String receiverMsisdn) {
        int i = 2 % 2;
        Object obj = null;
        this.copy.setValue(Resource.loading(null));
        sendRequest(new VerifyP2PTransferRepository(new VerifyTransferRequest(receiverMsisdn)), new ApiCallback<VerifyNumberResp>() {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public void onSuccess(VerifyNumberResp verifyNumberResp) {
                int i2 = 2 % 2;
                int i3 = component2 + 61;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(verifyNumberResp);
                if (i4 == 0) {
                    int i5 = 96 / 0;
                }
            }

            public void onSuccess2(VerifyNumberResp value) {
                int i2 = 2 % 2;
                int i3 = component2 + 119;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(value, "");
                SendToManyViewModel.access$getVerifyData$p(SendToManyViewModel.this).setValue(Resource.success(value));
                int i5 = component2 + 61;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = component2 + 55;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                SendToManyViewModel.access$getVerifyData$p(SendToManyViewModel.this).setValue(Resource.error(e, null));
                int i5 = copydefault + 55;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = component4 + 103;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static {
        int i = 1 + 121;
        getRequestBeneficiariesState = i % 128;
        if (i % 2 != 0) {
            int i2 = 21 / 0;
        }
    }
}
