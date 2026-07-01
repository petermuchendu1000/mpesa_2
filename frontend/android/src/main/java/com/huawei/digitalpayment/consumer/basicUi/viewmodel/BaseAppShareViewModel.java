package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.basicUi.model.IAppShareModel;
import com.huawei.digitalpayment.consumer.basicUi.request.SendMessageParams;
import com.huawei.http.BaseResp;
import com.huawei.payment.mvvm.Resource;

public class BaseAppShareViewModel<Model extends IAppShareModel> extends ViewModel {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private final MutableLiveData<Resource<BaseResp>> component3 = new MutableLiveData<>();
    protected final Model model;

    public BaseAppShareViewModel(Model model) {
        this.model = model;
    }

    public LiveData<Resource<BaseResp>> getData() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 27;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<BaseResp>> mutableLiveData = this.component3;
        int i5 = i2 + 77;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return mutableLiveData;
        }
        throw null;
    }

    @Deprecated
    public void sendMessage(String str) {
        int i = 2 % 2;
        sendMessage(new SendMessageParams(str));
        int i2 = copydefault + 107;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public void sendMessage(SendMessageParams sendMessageParams) {
        int i = 2 % 2;
        this.component3.setValue(Resource.loading(null));
        this.model.sendMessage(sendMessageParams, new ApiCallback<BaseResp>() {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 97;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                ShareDataUIState(baseResp);
                int i5 = component1 + 65;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }

            public void ShareDataUIState(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = component1 + 75;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                BaseAppShareViewModel.component3(BaseAppShareViewModel.this).setValue(Resource.success(baseResp));
                int i5 = component1 + 19;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 89;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                BaseAppShareViewModel.component3(BaseAppShareViewModel.this).setValue(Resource.error(baseException, null));
                int i5 = component1 + 47;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = ShareDataUIState + 95;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    static MutableLiveData component3(BaseAppShareViewModel baseAppShareViewModel) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 57;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<BaseResp>> mutableLiveData = baseAppShareViewModel.component3;
        int i5 = i3 + 45;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return mutableLiveData;
        }
        throw null;
    }
}
