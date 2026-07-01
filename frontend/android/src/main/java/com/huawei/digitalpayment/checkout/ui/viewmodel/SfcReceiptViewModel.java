package com.huawei.digitalpayment.checkout.ui.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.checkout.resp.MpesaReceiptReq;
import com.huawei.digitalpayment.checkout.resp.MpesaReceiptResponse;
import com.huawei.digitalpayment.consumer.base.http.GsmEndpoints;
import com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse;
import com.huawei.digitalpayment.consumer.base.util.ExtensionsKt;
import com.huawei.digitalpayment.consumer.base.util.HaProxyRequest;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.http.BaseRequest;
import com.huawei.payment.mvvm.Resource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u0018\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR,\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/checkout/ui/viewmodel/SfcReceiptViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "<init>", "()V", "TAG", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "receiptResponse", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", "Lcom/huawei/digitalpayment/checkout/resp/MpesaReceiptResponse;", "getReceiptResponse", "()Landroidx/lifecycle/MutableLiveData;", "setReceiptResponse", "(Landroidx/lifecycle/MutableLiveData;)V", "getMpesaReceipt", "", "receiptReq", "Lcom/huawei/digitalpayment/checkout/resp/MpesaReceiptReq;", "ConsumerCheckOutUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SfcReceiptViewModel extends ViewModel implements BaseModel {
    public static final int $stable = 8;
    private static int component2 = 53 % 128;
    private static int component3 = 0;
    private static int component4 = 1;
    private static int copydefault;
    private final String ShareDataUIState = "SfcReceiptViewModel";
    private MutableLiveData<Resource<HaProxyResponse<MpesaReceiptResponse>>> component1 = new MutableLiveData<>();

    public final MutableLiveData<Resource<HaProxyResponse<MpesaReceiptResponse>>> getReceiptResponse() {
        int i = 2 % 2;
        int i2 = copydefault + 83;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setReceiptResponse(MutableLiveData<Resource<HaProxyResponse<MpesaReceiptResponse>>> mutableLiveData) {
        int i = 2 % 2;
        int i2 = component4 + 11;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(mutableLiveData, "");
            this.component1 = mutableLiveData;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        this.component1 = mutableLiveData;
        int i3 = copydefault + 125;
        component4 = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void getMpesaReceipt(MpesaReceiptReq receiptReq) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(receiptReq, "");
        this.component1.setValue(Resource.loading(null));
        HaProxyRequest<HaProxyResponse<MpesaReceiptResponse>> haProxyRequest = new HaProxyRequest<HaProxyResponse<MpesaReceiptResponse>>() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = copydefault + 41;
                component3 = i3 % 128;
                if (i3 % 2 != 0) {
                    return GsmEndpoints.M_PESA_RECEIPT_DOWNLOAD;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        haProxyRequest.method(BaseRequest.Method.POST);
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest, (String) null, (String) null, false, 7, (Object) null);
        haProxyRequest.addParams(receiptReq);
        sendRequest(haProxyRequest, new ApiCallback<HaProxyResponse<MpesaReceiptResponse>>() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public void onSuccess(HaProxyResponse<MpesaReceiptResponse> haProxyResponse) {
                int i2 = 2 % 2;
                int i3 = component2 + 43;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(haProxyResponse);
                int i5 = component2 + 69;
                component1 = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void onSuccess2(HaProxyResponse<MpesaReceiptResponse> value) {
                int i2 = 2 % 2;
                int i3 = component1 + 57;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(value, "");
                super.onSuccess(value);
                SfcReceiptViewModel.this.getReceiptResponse().setValue(Resource.success(value));
                int i5 = component2 + 37;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = component1 + 59;
                component2 = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    super.onError(e);
                    SfcReceiptViewModel.this.getReceiptResponse().setValue(Resource.error(e, null));
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(e, "");
                super.onError(e);
                SfcReceiptViewModel.this.getReceiptResponse().setValue(Resource.error(e, null));
                int i4 = component2 + 43;
                component1 = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        int i2 = component4 + 19;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    static {
        if (53 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
