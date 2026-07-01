package com.huawei.digitalpayment.consumer.nfc.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.checkout.model.response.CheckoutResp;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.nfc.model.NfcCodeResp;
import com.huawei.payment.mvvm.Resource;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006J\u001a\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eJ\u001a\u0010\u0011\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/nfc/viewmodel/NfcViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "<init>", "()V", "checkOutData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/checkout/model/response/CheckoutResp;", "resolveNfcCodeData", "Lcom/huawei/digitalpayment/consumer/nfc/model/NfcCodeResp;", "checkOut", "", "params", "", "", "", "resolveNfcCode", "ConsumerNfcUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NfcViewModel extends ViewModel implements BaseModel {
    private static int ShareDataUIState = 1;
    private static int component2;
    private final MutableLiveData<Resource<CheckoutResp>> copydefault = new MutableLiveData<>();
    private final MutableLiveData<Resource<NfcCodeResp>> component1 = new MutableLiveData<>();

    public static final MutableLiveData access$getCheckOutData$p(NfcViewModel nfcViewModel) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<Resource<CheckoutResp>> mutableLiveData = nfcViewModel.copydefault;
        if (i3 == 0) {
            return mutableLiveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final MutableLiveData access$getResolveNfcCodeData$p(NfcViewModel nfcViewModel) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 9;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<NfcCodeResp>> mutableLiveData = nfcViewModel.component1;
        int i5 = i2 + 55;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public final MutableLiveData<Resource<CheckoutResp>> checkOutData() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 25;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<CheckoutResp>> mutableLiveData = this.copydefault;
        int i5 = i2 + 111;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return mutableLiveData;
        }
        throw null;
    }

    public final MutableLiveData<Resource<NfcCodeResp>> resolveNfcCodeData() {
        int i = 2 % 2;
        int i2 = component2 + 17;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<NfcCodeResp>> mutableLiveData = this.component1;
        int i5 = i3 + 35;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public final void checkOut(Map<String, Object> params) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        Object obj = null;
        this.copydefault.setValue(Resource.loading(null));
        PaymentRequest<CheckoutResp> paymentRequest = new PaymentRequest<CheckoutResp>() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component1 + 63;
                int i4 = i3 % 128;
                component3 = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 11;
                component1 = i6 % 128;
                int i7 = i6 % 2;
                return "preP2PTransfer";
            }
        };
        paymentRequest.addParams(params);
        paymentRequest.sendRequest(new ApiCallback<CheckoutResp>() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public void onSuccess(CheckoutResp checkoutResp) {
                int i2 = 2 % 2;
                int i3 = component2 + 33;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(checkoutResp);
                int i5 = ShareDataUIState + 45;
                component2 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            public void onSuccess2(CheckoutResp value) {
                int i2 = 2 % 2;
                int i3 = component2 + 51;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                NfcViewModel.access$getCheckOutData$p(NfcViewModel.this).setValue(Resource.success(value));
                int i5 = component2 + 47;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 39;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                NfcViewModel.access$getCheckOutData$p(NfcViewModel.this).setValue(Resource.error(e, null));
                int i5 = ShareDataUIState + 73;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = component2 + 107;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void resolveNfcCode(Map<String, Object> params) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        this.component1.setValue(Resource.loading(null));
        PaymentRequest<NfcCodeResp> paymentRequest = new PaymentRequest<NfcCodeResp>() {
            private static int ShareDataUIState = 1;
            private static int component2;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component2 + 53;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0) {
                    return "resolveNfcCode";
                }
                throw null;
            }
        };
        paymentRequest.addParams(params);
        paymentRequest.sendRequest(new ApiCallback<NfcCodeResp>() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public void onSuccess(NfcCodeResp nfcCodeResp) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 15;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(nfcCodeResp);
                if (i4 == 0) {
                    throw null;
                }
                int i5 = ShareDataUIState + 103;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }

            public void onSuccess2(NfcCodeResp value) {
                int i2 = 2 % 2;
                int i3 = component2 + 105;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                MutableLiveData mutableLiveDataAccess$getResolveNfcCodeData$p = NfcViewModel.access$getResolveNfcCodeData$p(NfcViewModel.this);
                if (i4 == 0) {
                    mutableLiveDataAccess$getResolveNfcCodeData$p.setValue(Resource.success(value));
                } else {
                    mutableLiveDataAccess$getResolveNfcCodeData$p.setValue(Resource.success(value));
                    throw null;
                }
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = component2 + 41;
                ShareDataUIState = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    NfcViewModel.access$getResolveNfcCodeData$p(NfcViewModel.this).setValue(Resource.error(e, null));
                } else {
                    Intrinsics.checkNotNullParameter(e, "");
                    NfcViewModel.access$getResolveNfcCodeData$p(NfcViewModel.this).setValue(Resource.error(e, null));
                    obj.hashCode();
                    throw null;
                }
            }
        });
        int i2 = ShareDataUIState + 37;
        component2 = i2 % 128;
        int i3 = i2 % 2;
    }
}
