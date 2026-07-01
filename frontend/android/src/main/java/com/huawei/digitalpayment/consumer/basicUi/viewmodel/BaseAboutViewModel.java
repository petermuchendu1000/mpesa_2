package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.baselib.util.update.UpdateBean;
import com.huawei.digitalpayment.consumer.basicUi.model.AboutModel;
import com.huawei.digitalpayment.consumer.basicUi.request.VersionVerifyRequest;
import com.huawei.payment.mvvm.Resource;

public class BaseAboutViewModel<Model extends AboutModel> extends ViewModel {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private final MutableLiveData<Resource<UpdateBean>> component3 = new MutableLiveData<>();
    protected final Model model;

    public BaseAboutViewModel(Model model) {
        this.model = model;
    }

    public LiveData<Resource<UpdateBean>> getData() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 109;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<UpdateBean>> mutableLiveData = this.component3;
        int i5 = i2 + 27;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public void versionVerify(VersionVerifyRequest versionVerifyRequest) {
        int i = 2 % 2;
        this.component3.setValue(Resource.loading(null));
        this.model.versionVerify(versionVerifyRequest, new ApiCallback<UpdateBean>() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(UpdateBean updateBean) {
                int i2 = 2 % 2;
                int i3 = copydefault + 61;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                component3(updateBean);
                if (i4 == 0) {
                    throw null;
                }
            }

            public void component3(UpdateBean updateBean) {
                int i2 = 2 % 2;
                int i3 = copydefault + 23;
                component3 = i3 % 128;
                if (i3 % 2 == 0) {
                    BaseAboutViewModel.copydefault(BaseAboutViewModel.this).setValue(Resource.success(updateBean));
                    throw null;
                }
                BaseAboutViewModel.copydefault(BaseAboutViewModel.this).setValue(Resource.success(updateBean));
                int i4 = copydefault + 97;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component3 + 103;
                copydefault = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    BaseAboutViewModel.copydefault(BaseAboutViewModel.this).setValue(Resource.error(baseException, null));
                } else {
                    BaseAboutViewModel.copydefault(BaseAboutViewModel.this).setValue(Resource.error(baseException, null));
                    obj.hashCode();
                    throw null;
                }
            }
        });
        int i2 = copydefault + 75;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
    }

    public void versionVerify() {
        int i = 2 % 2;
        versionVerify(new VersionVerifyRequest(SPUtils.getInstance().getString("recent_login_phone_number")));
        int i2 = copydefault + 41;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
    }

    static MutableLiveData copydefault(BaseAboutViewModel baseAboutViewModel) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 117;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<UpdateBean>> mutableLiveData = baseAboutViewModel.component3;
        int i5 = i3 + 45;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }
}
