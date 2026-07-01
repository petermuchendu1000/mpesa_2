package com.huawei.digitalpayment.consumer.sfcui.profile.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.sfcui.profile.resp.PinStatusResp;
import com.huawei.payment.mvvm.Resource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0006\u0010\n\u001a\u00020\u000bR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/viewmodel/ProfileResultViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "<init>", "()V", "pinStatusData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/resp/PinStatusResp;", "getPinStatusData", "queryPinStatus", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProfileResultViewModel extends ViewModel implements BaseModel {
    public static final int $stable = 8;
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component2;
    private static int copydefault;
    private final MutableLiveData<Resource<PinStatusResp>> component3 = new MutableLiveData<>();

    public static final MutableLiveData access$getPinStatusData$p(ProfileResultViewModel profileResultViewModel) {
        int i = 2 % 2;
        int i2 = component1 + 57;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        Object obj = null;
        MutableLiveData<Resource<PinStatusResp>> mutableLiveData = profileResultViewModel.component3;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 85;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return mutableLiveData;
        }
        throw null;
    }

    public final MutableLiveData<Resource<PinStatusResp>> getPinStatusData() {
        int i = 2 % 2;
        int i2 = component2 + 117;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void queryPinStatus() {
        int i = 2 % 2;
        this.component3.setValue(Resource.loading(null));
        sendRequest(new PaymentRequest<PinStatusResp>() {
            private static int component2 = 1;
            private static int component3;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component3;
                int i4 = i3 + 63;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = i3 + 101;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                return "queryPINStatus";
            }
        }, new ApiCallback<PinStatusResp>() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(PinStatusResp pinStatusResp) {
                int i2 = 2 % 2;
                int i3 = component3 + 37;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(pinStatusResp);
                if (i4 != 0) {
                    throw null;
                }
            }

            public void onSuccess2(PinStatusResp value) {
                int i2 = 2 % 2;
                int i3 = component3 + 45;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0) {
                    ProfileResultViewModel.access$getPinStatusData$p(ProfileResultViewModel.this).setValue(Resource.success(value));
                    int i4 = 75 / 0;
                } else {
                    ProfileResultViewModel.access$getPinStatusData$p(ProfileResultViewModel.this).setValue(Resource.success(value));
                }
                int i5 = ShareDataUIState + 27;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = component3 + 27;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                ProfileResultViewModel.access$getPinStatusData$p(ProfileResultViewModel.this).setValue(Resource.error(e, null));
                int i5 = ShareDataUIState + 41;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 91 / 0;
                }
            }
        });
        int i2 = component2 + 107;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 11 / 0;
        }
    }

    static {
        int i = 1 + 5;
        copydefault = i % 128;
        int i2 = i % 2;
    }
}
