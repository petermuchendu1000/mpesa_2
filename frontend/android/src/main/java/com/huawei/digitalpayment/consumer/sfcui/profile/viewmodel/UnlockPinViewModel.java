package com.huawei.digitalpayment.consumer.sfcui.profile.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.identity.ui.activity.CheckIdentityActivity;
import com.huawei.http.BaseResp;
import com.huawei.payment.mvvm.Resource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/viewmodel/UnlockPinViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "<init>", "()V", "data", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/http/BaseResp;", "getData", "unlockPin", "", CheckIdentityActivity.ID_NUMBER, "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UnlockPinViewModel extends ViewModel implements BaseModel {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 83 % 128;
    private static int copydefault;
    private final MutableLiveData<Resource<BaseResp>> component3 = new MutableLiveData<>();

    public static final MutableLiveData access$getData$p(UnlockPinViewModel unlockPinViewModel) {
        int i = 2 % 2;
        int i2 = component1 + 33;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<BaseResp>> mutableLiveData = unlockPinViewModel.component3;
        int i5 = i3 + 47;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public final MutableLiveData<Resource<BaseResp>> getData() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 19;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<BaseResp>> mutableLiveData = this.component3;
        int i5 = i2 + 113;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public final void unlockPin(String idNumber) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(idNumber, "");
        this.component3.setValue(Resource.loading(null));
        PaymentRequest<BaseResp> paymentRequest = new PaymentRequest<BaseResp>() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState;
                int i4 = i3 + 13;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 101;
                component1 = i6 % 128;
                if (i6 % 2 == 0) {
                    return "unlockPIN";
                }
                throw null;
            }
        };
        paymentRequest.addParams("idNo", idNumber);
        sendRequest(paymentRequest, new ApiCallback<BaseResp>() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = component3 + 43;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(baseResp);
                if (i4 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = component3 + 121;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }

            public void onSuccess2(BaseResp value) {
                int i2 = 2 % 2;
                int i3 = component3 + 45;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                UnlockPinViewModel.access$getData$p(UnlockPinViewModel.this).setValue(Resource.success(value));
                int i5 = component3 + 49;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = component3 + 69;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                UnlockPinViewModel.access$getData$p(UnlockPinViewModel.this).setValue(Resource.error(e, null));
                int i5 = ShareDataUIState + 13;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = copydefault + 73;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    static {
        if (83 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
