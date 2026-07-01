package com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.checkout.model.request.PayRequest;
import com.huawei.digitalpayment.checkout.model.response.TransferResp;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.PayOrderRepository;
import com.huawei.payment.mvvm.Resource;

public class PinPayViewModel extends ViewModel implements BaseModel {
    private static int component3 = 1;
    private static int copydefault;
    private final MutableLiveData<Resource<TransferResp>> component1 = new MutableLiveData<>();

    public MutableLiveData<Resource<TransferResp>> getTransferData() {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<TransferResp>> mutableLiveData = this.component1;
        int i5 = i3 + 95;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return mutableLiveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void payOrder(PayRequest payRequest, int i) {
        int i2 = 2 % 2;
        this.component1.setValue(Resource.loading(null));
        sendRequest(new PayOrderRepository(payRequest), new ApiCallback<TransferResp>() {
            private static int component2 = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(TransferResp transferResp) {
                int i3 = 2 % 2;
                int i4 = component2 + 71;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                component2(transferResp);
                int i6 = component3 + 9;
                component2 = i6 % 128;
                if (i6 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void component2(TransferResp transferResp) {
                int i3 = 2 % 2;
                int i4 = component2 + 125;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                PinPayViewModel.component1(PinPayViewModel.this).setValue(Resource.success(transferResp));
                int i6 = component3 + 61;
                component2 = i6 % 128;
                int i7 = i6 % 2;
            }

            @Override
            public void onError(BaseException baseException) {
                int i3 = 2 % 2;
                int i4 = component2 + 13;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                PinPayViewModel.component1(PinPayViewModel.this).setValue(Resource.error(baseException, null));
                int i6 = component3 + 29;
                component2 = i6 % 128;
                int i7 = i6 % 2;
            }
        });
        int i3 = component3 + 97;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
    }

    static MutableLiveData component1(PinPayViewModel pinPayViewModel) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 79;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<TransferResp>> mutableLiveData = pinPayViewModel.component1;
        int i5 = i2 + 55;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }
}
