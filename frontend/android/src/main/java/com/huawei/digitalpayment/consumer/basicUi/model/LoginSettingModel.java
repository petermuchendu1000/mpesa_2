package com.huawei.digitalpayment.consumer.basicUi.model;

import com.huawei.arouter.RouteUtils;
import com.huawei.biometric.BiometricUtil;
import com.huawei.biometric.LocalAuthenticationUtils;
import com.huawei.biometric.model.BiometricType;
import com.huawei.biometric.service.IBiometricService;
import com.huawei.biometric.util.BiometricHelper2;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.http.BaseResp;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0016J \u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0016J\u0018\u0010\u0011\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0016J \u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0016¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/basicUi/model/LoginSettingModel;", "Lcom/huawei/digitalpayment/consumer/basicUi/model/ILoginSettingModel;", "<init>", "()V", "isShowFaceIdLogin", "", "isOpenFaceIdLogin", "isShowFingerprintLogin", "isOpenFingerprintLogin", "closeFaceIdLogin", "", "callback", "Lcom/huawei/common/listener/ApiCallback;", "Lcom/huawei/http/BaseResp;", "openFaceIdLogin", "pin", "", "closeFingerprintLogin", "openFingerprintLogin", "ConsumerBasicUiModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class LoginSettingModel implements ILoginSettingModel {
    private static int component1 = 0;
    private static int component3 = 1;

    @Inject
    public LoginSettingModel() {
    }

    @Override
    public boolean isShowFaceIdLogin() {
        int i = 2 % 2;
        int i2 = component1 + 41;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsSupport = LocalAuthenticationUtils.isSupport();
        int i4 = component3 + 21;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return zIsSupport;
        }
        throw null;
    }

    @Override
    public boolean isOpenFaceIdLogin() {
        boolean zIsOpenFaceIdLogin;
        int i = 2 % 2;
        int i2 = component3 + 121;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            zIsOpenFaceIdLogin = BiometricHelper2.getInstance().isOpenFaceIdLogin();
            int i3 = 28 / 0;
        } else {
            zIsOpenFaceIdLogin = BiometricHelper2.getInstance().isOpenFaceIdLogin();
        }
        int i4 = component3 + 13;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return zIsOpenFaceIdLogin;
    }

    @Override
    public boolean isShowFingerprintLogin() {
        int i = 2 % 2;
        int i2 = component1 + 31;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return BiometricUtil.isSupportBiometric();
        }
        BiometricUtil.isSupportBiometric();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public boolean isOpenFingerprintLogin() {
        int i = 2 % 2;
        int i2 = component1 + 109;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        BiometricHelper2 biometricHelper2 = BiometricHelper2.getInstance();
        if (i3 != 0) {
            return biometricHelper2.isOpenFingerprintLogin();
        }
        biometricHelper2.isOpenFingerprintLogin();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void closeFaceIdLogin(ApiCallback<BaseResp> callback) {
        int i = 2 % 2;
        int i2 = component3 + 115;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        BiometricHelper2.getInstance().closeFaceIdLogin();
        if (callback != null) {
            callback.onSuccess(new BaseResp());
        }
        int i4 = component3 + 81;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 18 / 0;
        }
    }

    @Override
    public void openFaceIdLogin(String pin, final ApiCallback<BaseResp> callback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(pin, "");
        ((IBiometricService) RouteUtils.getService(IBiometricService.class)).guideOpenBiometricLogin(pin, BiometricType.FACE_ID, false, new ApiCallback<Boolean>() {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public void onSuccess(Boolean bool) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 25;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess(bool.booleanValue());
                int i5 = component1 + 11;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }

            public void onSuccess(boolean value) {
                int i2 = 2 % 2;
                int i3 = component1 + 33;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                ApiCallback<BaseResp> apiCallback = callback;
                if (apiCallback != null) {
                    apiCallback.onSuccess(new BaseResp());
                    int i5 = ShareDataUIState + 33;
                    component1 = i5 % 128;
                    int i6 = i5 % 2;
                }
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 123;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                ApiCallback<BaseResp> apiCallback = callback;
                if (apiCallback != null) {
                    int i5 = component1 + 69;
                    ShareDataUIState = i5 % 128;
                    int i6 = i5 % 2;
                    apiCallback.onError(e);
                    if (i6 != 0) {
                        int i7 = 91 / 0;
                    }
                }
            }
        });
        int i2 = component3 + 15;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void closeFingerprintLogin(ApiCallback<BaseResp> callback) {
        int i = 2 % 2;
        int i2 = component1 + 89;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            BiometricHelper2.getInstance().closeFingerprintLogin();
            throw null;
        }
        BiometricHelper2.getInstance().closeFingerprintLogin();
        if (callback != null) {
            callback.onSuccess(new BaseResp());
            int i3 = component3 + 1;
            component1 = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    @Override
    public void openFingerprintLogin(String pin, final ApiCallback<BaseResp> callback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(pin, "");
        ((IBiometricService) RouteUtils.getService(IBiometricService.class)).guideOpenBiometricLogin(pin, BiometricType.FINGERPRINT, false, new ApiCallback<Boolean>() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public void onSuccess(Boolean bool) {
                int i2 = 2 % 2;
                int i3 = component1 + 49;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess(bool.booleanValue());
                int i5 = component1 + 9;
                component2 = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void onSuccess(boolean value) {
                int i2 = 2 % 2;
                int i3 = component2 + 1;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                ApiCallback<BaseResp> apiCallback = callback;
                if (apiCallback != null) {
                    apiCallback.onSuccess(new BaseResp());
                }
                int i5 = component2 + 27;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                ApiCallback<BaseResp> apiCallback = callback;
                if (apiCallback != null) {
                    int i3 = component2 + 67;
                    component1 = i3 % 128;
                    int i4 = i3 % 2;
                    apiCallback.onError(e);
                }
                int i5 = component1 + 57;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = component1 + 57;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }
}
