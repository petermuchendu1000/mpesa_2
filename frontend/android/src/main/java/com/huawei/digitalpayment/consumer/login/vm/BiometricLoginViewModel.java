package com.huawei.digitalpayment.consumer.login.vm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.constants.SPConstant;
import com.huawei.digitalpayment.consumer.login.model.BiometricLoginModel;
import com.huawei.digitalpayment.consumer.login.model.IBiometricLoginModel;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo;
import com.huawei.payment.mvvm.Resource;

public class BiometricLoginViewModel extends ViewModel {
    public static final String FACE_ID = "00";
    public static final String FINGERPRINT = "01";
    private static int component2 = 0;
    private static int component3 = 1;
    private final IBiometricLoginModel component1 = new BiometricLoginModel();
    private final MutableLiveData<Resource<LocalLoginInfo>> ShareDataUIState = new MutableLiveData<>();

    public LiveData<Resource<LocalLoginInfo>> getData() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 23;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<LocalLoginInfo>> mutableLiveData = this.ShareDataUIState;
        int i5 = i2 + 115;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    private void component3(final String str, String str2) {
        int i = 2 % 2;
        this.ShareDataUIState.setValue(Resource.loading(null));
        this.component1.biometricLogin(str, str2, new ApiCallback<LocalLoginInfo>() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public void onSuccess(LocalLoginInfo localLoginInfo) {
                int i2 = 2 % 2;
                int i3 = component1 + 71;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                component1(localLoginInfo);
                int i5 = component2 + 105;
                component1 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 26 / 0;
                }
            }

            public void component1(LocalLoginInfo localLoginInfo) {
                int i2 = 2 % 2;
                int i3 = component2 + 117;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                BiometricLoginViewModel.component2(BiometricLoginViewModel.this, str);
                BiometricLoginViewModel.ShareDataUIState(BiometricLoginViewModel.this).setValue(Resource.success(localLoginInfo));
                int i5 = component2 + 57;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component2 + 67;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                BiometricLoginViewModel.ShareDataUIState(BiometricLoginViewModel.this).setValue(Resource.error(baseException, null));
                int i5 = component2 + 121;
                component1 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 50 / 0;
                }
            }
        });
        int i2 = component3 + 75;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 30 / 0;
        }
    }

    private void copydefault(String str) {
        int i = 2 % 2;
        if (!"00".equals(str)) {
            if ("01".equals(str)) {
                SPUtils.getInstance(AppConfigManager.SP_APP).put(SPConstant.KEY_LAST_LOGIN_TYPE, "1");
            }
        } else {
            int i2 = component2 + 59;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                SPUtils.getInstance(AppConfigManager.SP_APP).put(SPConstant.KEY_LAST_LOGIN_TYPE, "0");
            } else {
                SPUtils.getInstance(AppConfigManager.SP_APP).put(SPConstant.KEY_LAST_LOGIN_TYPE, "0");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        int i3 = component3 + 81;
        component2 = i3 % 128;
        int i4 = i3 % 2;
    }

    public void fingerprintLogin(String str) {
        int i = 2 % 2;
        int i2 = component2 + 51;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        component3("01", str);
        int i4 = component3 + 117;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void faceIdLogin(String str) {
        int i = 2 % 2;
        int i2 = component2 + 123;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        component3("00", str);
        int i4 = component2 + 5;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void cancelRequest() {
        int i = 2 % 2;
        int i2 = component3 + 63;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            this.component1.cancel();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.component1.cancel();
        int i3 = component2 + 5;
        component3 = i3 % 128;
        int i4 = i3 % 2;
    }

    public void clearState() {
        int i = 2 % 2;
        int i2 = component3 + 29;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.ShareDataUIState.setValue(Resource.none());
        int i4 = component3 + 63;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }

    static MutableLiveData ShareDataUIState(BiometricLoginViewModel biometricLoginViewModel) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 121;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<LocalLoginInfo>> mutableLiveData = biometricLoginViewModel.ShareDataUIState;
        if (i4 != 0) {
            int i5 = 21 / 0;
        }
        int i6 = i2 + 25;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        return mutableLiveData;
    }

    static void component2(BiometricLoginViewModel biometricLoginViewModel, String str) {
        int i = 2 % 2;
        int i2 = component3 + 61;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        biometricLoginViewModel.copydefault(str);
        int i4 = component2 + 113;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 1 / 0;
        }
    }
}
