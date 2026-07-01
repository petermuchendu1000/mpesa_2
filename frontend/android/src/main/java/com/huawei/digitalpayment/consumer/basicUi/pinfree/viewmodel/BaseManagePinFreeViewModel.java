package com.huawei.digitalpayment.consumer.basicUi.pinfree.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.basicUi.pinfree.model.ManagePinFreeModel;
import com.huawei.digitalpayment.consumer.basicUi.pinfree.model.PinFreeInfo;
import com.huawei.digitalpayment.consumer.basicUi.response.FreePinResponse;
import com.huawei.digitalpayment.consumer.basicUi.util.PinFreeManager;
import com.huawei.http.BaseResp;
import com.huawei.payment.mvvm.Resource;

public class BaseManagePinFreeViewModel<Model extends ManagePinFreeModel> extends ViewModel {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private final MutableLiveData<Resource<BaseResp>> component1 = new MutableLiveData<>();
    private final MutableLiveData<Resource<FreePinResponse>> component2 = new MutableLiveData<>();
    protected final Model managePinFreeModel;

    public MutableLiveData<Resource<FreePinResponse>> getPinFreeData() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 75;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<FreePinResponse>> mutableLiveData = this.component2;
        int i5 = i2 + 55;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public BaseManagePinFreeViewModel(Model model) {
        this.managePinFreeModel = model;
    }

    public LiveData<Resource<BaseResp>> getData() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 101;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        MutableLiveData<Resource<BaseResp>> mutableLiveData = this.component1;
        int i4 = i3 + 55;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return mutableLiveData;
    }

    public void managePinFreePayment(String str, String str2, String str3) {
        int i = 2 % 2;
        this.managePinFreeModel.managePinFreePayment(str, str2, str3, new ApiCallback<BaseResp>() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = component1 + 61;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                component1(baseResp);
                if (i4 == 0) {
                    int i5 = 70 / 0;
                }
            }

            public void component1(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = component1 + 55;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                BaseManagePinFreeViewModel.ShareDataUIState(BaseManagePinFreeViewModel.this).setValue(Resource.success(baseResp));
                int i5 = ShareDataUIState + 33;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 65;
                component1 = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    BaseManagePinFreeViewModel.ShareDataUIState(BaseManagePinFreeViewModel.this).setValue(Resource.error(baseException, null));
                    obj.hashCode();
                    throw null;
                }
                BaseManagePinFreeViewModel.ShareDataUIState(BaseManagePinFreeViewModel.this).setValue(Resource.error(baseException, null));
                int i4 = component1 + 117;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        int i2 = ShareDataUIState + 57;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    public void queryFreePin() {
        int i = 2 % 2;
        this.component2.setValue(Resource.loading(null));
        this.managePinFreeModel.queryFreePin(new ApiCallback<FreePinResponse>() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(FreePinResponse freePinResponse) {
                int i2 = 2 % 2;
                int i3 = component1 + 15;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                Object obj = null;
                component2(freePinResponse);
                if (i4 != 0) {
                    obj.hashCode();
                    throw null;
                }
                int i5 = component1 + 111;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }

            public void component2(FreePinResponse freePinResponse) {
                int i2 = 2 % 2;
                int i3 = copydefault + 79;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    BaseManagePinFreeViewModel.component3(BaseManagePinFreeViewModel.this).setValue(Resource.success(freePinResponse));
                    throw null;
                }
                BaseManagePinFreeViewModel.component3(BaseManagePinFreeViewModel.this).setValue(Resource.success(freePinResponse));
                int i4 = component1 + 113;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component1 + 43;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                Object obj = null;
                BaseManagePinFreeViewModel.component3(BaseManagePinFreeViewModel.this).setValue(Resource.error(baseException, null));
                int i5 = copydefault + 63;
                component1 = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        });
        int i2 = copydefault + 103;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public LiveData<PinFreeInfo> getCustomerInfoMutableLiveData() {
        int i = 2 % 2;
        int i2 = copydefault + 27;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        LiveData<PinFreeInfo> liveDataPinFreeInfoLiveData = PinFreeManager.INSTANCE.pinFreeInfoLiveData();
        int i4 = copydefault + 103;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 49 / 0;
        }
        return liveDataPinFreeInfoLiveData;
    }

    public void update(boolean z, String str) {
        int i = 2 % 2;
        int i2 = copydefault + 115;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        PinFreeManager.INSTANCE.update(z, str);
        int i4 = copydefault + 117;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static MutableLiveData ShareDataUIState(BaseManagePinFreeViewModel baseManagePinFreeViewModel) {
        int i = 2 % 2;
        int i2 = copydefault + 29;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<BaseResp>> mutableLiveData = baseManagePinFreeViewModel.component1;
        int i5 = i3 + 93;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 59 / 0;
        }
        return mutableLiveData;
    }

    static MutableLiveData component3(BaseManagePinFreeViewModel baseManagePinFreeViewModel) {
        int i = 2 % 2;
        int i2 = copydefault + 1;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<Resource<FreePinResponse>> mutableLiveData = baseManagePinFreeViewModel.component2;
        if (i3 != 0) {
            int i4 = 48 / 0;
        }
        return mutableLiveData;
    }
}
