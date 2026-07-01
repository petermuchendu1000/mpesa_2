package com.huawei.digitalpayment.consumer.loginModule.login.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseViewModel;
import com.huawei.digitalpayment.consumer.loginModule.login.data.NewDeviceModel;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.request.IdentityVerifyParams;
import com.huawei.digitalpayment.consumer.loginModule.register.model.LocalIdType;
import com.huawei.payment.mvvm.Resource;
import java.util.List;

public class BaseNewDeviceViewModel<Model extends NewDeviceModel> extends BaseViewModel<Model> {
    private static int component1 = 0;
    private static int component2 = 1;
    private final MutableLiveData<Resource<List<LocalIdType>>> ShareDataUIState;
    private final MutableLiveData<Resource<LocalLoginInfo>> component3;

    public BaseNewDeviceViewModel(Model model) {
        super(model);
        this.component3 = new MutableLiveData<>();
        this.ShareDataUIState = new MutableLiveData<>();
    }

    public LiveData<Resource<LocalLoginInfo>> getData() {
        int i = 2 % 2;
        int i2 = component2 + 9;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<LocalLoginInfo>> mutableLiveData = this.component3;
        int i5 = i3 + 15;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 36 / 0;
        }
        return mutableLiveData;
    }

    public LiveData<Resource<List<LocalIdType>>> getDataDict() {
        int i = 2 % 2;
        int i2 = component2 + 115;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        throw null;
    }

    public void queryDataDict() {
        int i = 2 % 2;
        Object obj = null;
        this.ShareDataUIState.setValue(Resource.loading(null));
        ((NewDeviceModel) this.model).queryIdTypes(new ApiCallback<List<LocalIdType>>() {
            private static int component2 = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(List<LocalIdType> list) {
                int i2 = 2 % 2;
                int i3 = component3 + 109;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                component3(list);
                int i5 = component3 + 37;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }

            public void component3(List<LocalIdType> list) {
                int i2 = 2 % 2;
                int i3 = component2 + 61;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                BaseNewDeviceViewModel.component3(BaseNewDeviceViewModel.this).setValue(Resource.success(list));
                int i5 = component3 + 63;
                component2 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 61 / 0;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component3 + 81;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                BaseNewDeviceViewModel.component3(BaseNewDeviceViewModel.this).setValue(Resource.error(baseException, null));
                int i5 = component3 + 59;
                component2 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 37 / 0;
                }
            }
        });
        int i2 = component1 + 69;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public void identityVerifyAndLogin(String str, String str2) {
        int i = 2 % 2;
        identityVerifyAndLogin(new IdentityVerifyParams(str, str2));
        int i2 = component2 + 67;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }

    public void identityVerifyAndLogin(IdentityVerifyParams identityVerifyParams) {
        int i = 2 % 2;
        Object obj = null;
        this.component3.setValue(Resource.loading(null));
        ((NewDeviceModel) this.model).identityVerifyAndLogin(identityVerifyParams, new ApiCallback<LocalLoginInfo>() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(LocalLoginInfo localLoginInfo) {
                int i2 = 2 % 2;
                int i3 = copydefault + 5;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                ShareDataUIState(localLoginInfo);
                if (i4 == 0) {
                    throw null;
                }
            }

            public void ShareDataUIState(LocalLoginInfo localLoginInfo) {
                int i2 = 2 % 2;
                int i3 = copydefault + 19;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                MutableLiveData mutableLiveDataComponent2 = BaseNewDeviceViewModel.component2(BaseNewDeviceViewModel.this);
                if (i4 != 0) {
                    mutableLiveDataComponent2.setValue(Resource.success(localLoginInfo));
                    return;
                }
                mutableLiveDataComponent2.setValue(Resource.success(localLoginInfo));
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = copydefault + 85;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    BaseNewDeviceViewModel.component2(BaseNewDeviceViewModel.this).setValue(Resource.error(baseException, null));
                    throw null;
                }
                BaseNewDeviceViewModel.component2(BaseNewDeviceViewModel.this).setValue(Resource.error(baseException, null));
                int i4 = component1 + 101;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
            }
        });
        int i2 = component2 + 79;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static MutableLiveData component2(BaseNewDeviceViewModel baseNewDeviceViewModel) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 79;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<LocalLoginInfo>> mutableLiveData = baseNewDeviceViewModel.component3;
        int i5 = i2 + 95;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    static MutableLiveData component3(BaseNewDeviceViewModel baseNewDeviceViewModel) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 47;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<List<LocalIdType>>> mutableLiveData = baseNewDeviceViewModel.ShareDataUIState;
        int i5 = i2 + 17;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }
}
