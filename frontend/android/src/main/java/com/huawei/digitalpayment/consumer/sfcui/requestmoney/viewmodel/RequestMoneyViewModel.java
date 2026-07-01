package com.huawei.digitalpayment.consumer.sfcui.requestmoney.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.scan.model.request.VerifyTransferRequest;
import com.huawei.digitalpayment.consumer.scan.model.response.VerifyNumberResp;
import com.huawei.digitalpayment.consumer.scan.repository.VerifyP2PTransferRepository;
import com.huawei.digitalpayment.consumer.sfcui.requestmoney.RequestMoneyConfigHelper;
import com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.RequestMoneyConfig;
import com.huawei.payment.mvvm.Resource;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0010\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0006\u0010\u000f\u001a\u00020\fR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/viewmodel/RequestMoneyViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "<init>", "()V", "verifyData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/scan/model/response/VerifyNumberResp;", "configData", "Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/data/RequestMoneyConfig;", "verifyP2PTransfer", "", "receiverMsisdn", "", "requestConfig", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RequestMoneyViewModel extends ViewModel implements BaseModel {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int equals = 1;
    private final MutableLiveData<Resource<VerifyNumberResp>> component1 = new MutableLiveData<>();
    private final MutableLiveData<Resource<RequestMoneyConfig>> copydefault = new MutableLiveData<>();

    public static final MutableLiveData access$getConfigData$p(RequestMoneyViewModel requestMoneyViewModel) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 69;
        equals = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<RequestMoneyConfig>> mutableLiveData = requestMoneyViewModel.copydefault;
        int i5 = i2 + 19;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 29 / 0;
        }
        return mutableLiveData;
    }

    public static final MutableLiveData access$getVerifyData$p(RequestMoneyViewModel requestMoneyViewModel) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 27;
        equals = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<Resource<VerifyNumberResp>> mutableLiveData = requestMoneyViewModel.component1;
        if (i3 == 0) {
            int i4 = 54 / 0;
        }
        return mutableLiveData;
    }

    public final MutableLiveData<Resource<VerifyNumberResp>> verifyData() {
        int i = 2 % 2;
        int i2 = equals + 75;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<VerifyNumberResp>> mutableLiveData = this.component1;
        int i5 = i3 + 3;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return mutableLiveData;
        }
        throw null;
    }

    public final void verifyP2PTransfer(String receiverMsisdn) {
        int i = 2 % 2;
        this.component1.setValue(Resource.loading(null));
        sendRequest(new VerifyP2PTransferRepository(new VerifyTransferRequest(receiverMsisdn)), new ApiCallback<VerifyNumberResp>() {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public void onSuccess(VerifyNumberResp verifyNumberResp) {
                int i2 = 2 % 2;
                int i3 = component2 + 51;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(verifyNumberResp);
                if (i4 == 0) {
                    int i5 = 33 / 0;
                }
                int i6 = copydefault + 3;
                component2 = i6 % 128;
                int i7 = i6 % 2;
            }

            public void onSuccess2(VerifyNumberResp value) {
                int i2 = 2 % 2;
                int i3 = component2 + 123;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(value, "");
                    RequestMoneyViewModel.access$getVerifyData$p(RequestMoneyViewModel.this).setValue(Resource.success(value));
                    throw null;
                }
                Intrinsics.checkNotNullParameter(value, "");
                RequestMoneyViewModel.access$getVerifyData$p(RequestMoneyViewModel.this).setValue(Resource.success(value));
                int i4 = copydefault + 83;
                component2 = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = component2 + 119;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    RequestMoneyViewModel.access$getVerifyData$p(RequestMoneyViewModel.this).setValue(Resource.error(e, null));
                    int i4 = 91 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(e, "");
                    RequestMoneyViewModel.access$getVerifyData$p(RequestMoneyViewModel.this).setValue(Resource.error(e, null));
                }
                int i5 = component2 + 21;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 49 / 0;
                }
            }
        });
        int i2 = equals + 109;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 9 / 0;
        }
    }

    public final void requestConfig() {
        int i = 2 % 2;
        this.copydefault.setValue(Resource.loading(null));
        PaymentRequest<RequestMoneyConfig> paymentRequest = new PaymentRequest<RequestMoneyConfig>() {
            private static int component2 = 1;
            private static int component3;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component3 + 23;
                component2 = i3 % 128;
                if (i3 % 2 != 0) {
                    return "getConfig";
                }
                throw null;
            }
        };
        HashMap map = new HashMap();
        map.put("app.consumer.request.money.max.amount", "Integer");
        map.put("app.consumer.request.money.min.amount", "Integer");
        map.put("app.consumer.request.money.amount.validate.enable", "Boolean");
        paymentRequest.addParams(UserMetadata.KEYDATA_FILENAME, map);
        sendRequest(paymentRequest, new ApiCallback<RequestMoneyConfig>() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public void onSuccess(RequestMoneyConfig requestMoneyConfig) {
                int i2 = 2 % 2;
                int i3 = component2 + 107;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(requestMoneyConfig);
                if (i4 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void onSuccess2(RequestMoneyConfig value) {
                int i2 = 2 % 2;
                int i3 = component1 + 111;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(value, "");
                RequestMoneyConfigHelper.INSTANCE.updateRequestConfig(value);
                RequestMoneyViewModel.access$getConfigData$p(RequestMoneyViewModel.this).setValue(Resource.success(value));
                int i5 = component2 + 75;
                component1 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 83 / 0;
                }
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = component1 + 49;
                component2 = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    RequestMoneyViewModel.access$getVerifyData$p(RequestMoneyViewModel.this).setValue(Resource.error(e, null));
                    int i4 = 81 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(e, "");
                    RequestMoneyViewModel.access$getVerifyData$p(RequestMoneyViewModel.this).setValue(Resource.error(e, null));
                }
                int i5 = component1 + 73;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = ShareDataUIState + 67;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    static {
        int i = 1 + 65;
        component2 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
