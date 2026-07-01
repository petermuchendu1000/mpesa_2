package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseViewModel;
import com.huawei.digitalpayment.consumer.loginModule.register.data.IResetPinModel;
import com.huawei.digitalpayment.consumer.loginModule.register.model.LocalIdType;
import com.huawei.digitalpayment.consumer.loginModule.register.repository.QueryDataDictRepository;
import com.huawei.digitalpayment.consumer.loginModule.register.request.ReSetPinParams;
import com.huawei.digitalpayment.consumer.loginModule.register.util.DataDictMapUtils;
import com.huawei.http.BaseResp;
import com.huawei.payment.mvvm.Resource;
import java.util.ArrayList;
import java.util.List;

public class BaseResetPinVerifyIdViewModel<Model extends IResetPinModel> extends BaseViewModel<Model> {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private QueryDataDictRepository component2;
    private final MutableLiveData<Resource<BaseResp>> component1 = new MutableLiveData<>();
    private final MutableLiveData<Resource<List<LocalIdType>>> copydefault = new MutableLiveData<>();

    public LiveData<Resource<BaseResp>> getData() {
        int i = 2 % 2;
        int i2 = component3 + 31;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<BaseResp>> mutableLiveData = this.component1;
        int i5 = i3 + 85;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public LiveData<Resource<List<LocalIdType>>> getQueryDataDict() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        throw null;
    }

    @Deprecated
    public void resetPin(String str, String str2) {
        int i = 2 % 2;
        resetPin(new ReSetPinParams(str, str2, null));
        int i2 = component3 + 65;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 67 / 0;
        }
    }

    public void resetPin(ReSetPinParams reSetPinParams) {
        int i = 2 % 2;
        this.component1.setValue(Resource.loading(null));
        ((IResetPinModel) this.model).resetPin(reSetPinParams, new ApiCallback<BaseResp>() {
            private static int component2 = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = component2 + 27;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                copydefault(baseResp);
                if (i4 == 0) {
                    throw null;
                }
            }

            public void copydefault(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = component2 + 19;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                BaseResetPinVerifyIdViewModel.ShareDataUIState(BaseResetPinVerifyIdViewModel.this).setValue(Resource.success(baseResp));
                int i5 = component3 + 79;
                component2 = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component2 + 41;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                BaseResetPinVerifyIdViewModel.ShareDataUIState(BaseResetPinVerifyIdViewModel.this).setValue(Resource.error(baseException, null));
                int i5 = component2 + 123;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = component3 + 7;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
    }

    public void queryDataDict() {
        int i = 2 % 2;
        cancelQueryDataDict();
        ArrayList arrayList = new ArrayList();
        arrayList.add(DataDictMapUtils.IDTYPE);
        this.copydefault.setValue(Resource.loading(null));
        QueryDataDictRepository queryDataDictRepository = new QueryDataDictRepository(arrayList);
        this.component2 = queryDataDictRepository;
        queryDataDictRepository.sendRequest(new ApiCallback<List<LocalIdType>>() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(List<LocalIdType> list) {
                int i2 = 2 % 2;
                int i3 = component3 + 3;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                component1(list);
                int i5 = component1 + 53;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }

            public void component1(List<LocalIdType> list) {
                int i2 = 2 % 2;
                int i3 = component3 + 37;
                component1 = i3 % 128;
                if (i3 % 2 != 0) {
                    BaseResetPinVerifyIdViewModel.copydefault(BaseResetPinVerifyIdViewModel.this).setValue(Resource.success(list));
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                BaseResetPinVerifyIdViewModel.copydefault(BaseResetPinVerifyIdViewModel.this).setValue(Resource.success(list));
                int i4 = component1 + 57;
                component3 = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component3 + 93;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    BaseResetPinVerifyIdViewModel.copydefault(BaseResetPinVerifyIdViewModel.this).setValue(Resource.error(baseException, null));
                } else {
                    BaseResetPinVerifyIdViewModel.copydefault(BaseResetPinVerifyIdViewModel.this).setValue(Resource.error(baseException, null));
                    throw null;
                }
            }
        });
        int i2 = component3 + 95;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override
    public void onCleared() {
        int i = 2 % 2;
        int i2 = component3 + 7;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        super.onCleared();
        cancelQueryDataDict();
        int i4 = component3 + 39;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public void cancelQueryDataDict() {
        QueryDataDictRepository queryDataDictRepository;
        int i = 2 % 2;
        int i2 = component3 + 77;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            queryDataDictRepository = this.component2;
            int i3 = 4 / 0;
            if (queryDataDictRepository == null) {
                return;
            }
        } else {
            queryDataDictRepository = this.component2;
            if (queryDataDictRepository == null) {
                return;
            }
        }
        queryDataDictRepository.cancel();
        int i4 = component3 + 69;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    static MutableLiveData copydefault(BaseResetPinVerifyIdViewModel baseResetPinVerifyIdViewModel) {
        int i = 2 % 2;
        int i2 = component3 + 9;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<List<LocalIdType>>> mutableLiveData = baseResetPinVerifyIdViewModel.copydefault;
        int i5 = i3 + 117;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return mutableLiveData;
        }
        throw null;
    }

    static MutableLiveData ShareDataUIState(BaseResetPinVerifyIdViewModel baseResetPinVerifyIdViewModel) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 57;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<Resource<BaseResp>> mutableLiveData = baseResetPinVerifyIdViewModel.component1;
        if (i3 != 0) {
            return mutableLiveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
