package com.huawei.digitalpayment.consumer.sfcui.profile.model;

import com.huawei.arouter.RouteUtils;
import com.huawei.baselibs2.utils.encrypt.EncryptManager;
import com.huawei.biometric.BiometricUtil;
import com.huawei.biometric.constants.BiometricConstants;
import com.huawei.biometric.model.BiometricType;
import com.huawei.biometric.service.IBiometricService;
import com.huawei.biometric.util.BiometricHelper2;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SPUtils;
import com.huawei.http.BaseResp;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0002J\u0018\u0010\u000f\u001a\u00020\b2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0016J\b\u0010\u0010\u001a\u00020\u0005H\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\u0018\u0010\u0012\u001a\u00020\b2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0016J \u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0016¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/model/BiometricsSettingModel;", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/model/IBiometricsSettingModel;", "<init>", "()V", "isShowFingerprintPay", "", "isOpenFingerprintPay", "openFingerprintPay", "", "pin", "", "callback", "Lcom/huawei/common/listener/ApiCallback;", "Lcom/huawei/http/BaseResp;", "getExtraKey", "closeFingerprintPay", "isShowFingerprintLogin", "isOpenFingerprintLogin", "closeFingerprintLogin", "openFingerprintLogin", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BiometricsSettingModel implements IBiometricsSettingModel {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;

    @Inject
    public BiometricsSettingModel() {
    }

    public static final String access$getExtraKey(BiometricsSettingModel biometricsSettingModel) {
        int i = 2 % 2;
        int i2 = component2 + 101;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return biometricsSettingModel.ShareDataUIState();
        }
        biometricsSettingModel.ShareDataUIState();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public boolean isShowFingerprintPay() {
        int i = 2 % 2;
        int i2 = component2 + 69;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return BiometricUtil.isSupportBiometric();
        }
        BiometricUtil.isSupportBiometric();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public boolean isOpenFingerprintPay() {
        boolean zIsOpenFingerprintPay;
        int i = 2 % 2;
        int i2 = component2 + 19;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            zIsOpenFingerprintPay = BiometricHelper2.getInstance().isOpenFingerprintPay();
            int i3 = 51 / 0;
        } else {
            zIsOpenFingerprintPay = BiometricHelper2.getInstance().isOpenFingerprintPay();
        }
        int i4 = component2 + 49;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return zIsOpenFingerprintPay;
        }
        throw null;
    }

    @Override
    public void openFingerprintPay(String pin, final ApiCallback<BaseResp> callback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(pin, "");
        BiometricHelper2.getInstance().openFingerprintPay(pin, new ApiCallback<Boolean>() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public void onSuccess(Boolean bool) {
                int i2 = 2 % 2;
                int i3 = copydefault + 1;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(bool);
                int i5 = copydefault + 29;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }

            public void onSuccess2(Boolean value) {
                int i2 = 2 % 2;
                int i3 = component1 + 61;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                super.onSuccess(value);
                ApiCallback<BaseResp> apiCallback = callback;
                if (apiCallback != null) {
                    apiCallback.onSuccess(new BaseResp());
                }
                int i5 = copydefault + 119;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = component1 + 3;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                super.onError(e);
                ApiCallback<BaseResp> apiCallback = callback;
                if (apiCallback != null) {
                    int i5 = copydefault + 111;
                    component1 = i5 % 128;
                    int i6 = i5 % 2;
                    apiCallback.onError(e);
                    if (i6 != 0) {
                        int i7 = 92 / 0;
                    }
                }
            }
        });
        int i2 = ShareDataUIState + 3;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private final String ShareDataUIState() {
        int i = 2 % 2;
        String str = "_" + SPUtils.getInstance().getString(BiometricConstants.CURRENT_ACCOUNT);
        int i2 = component2 + 47;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void closeFingerprintPay(ApiCallback<BaseResp> callback) {
        int i = 2 % 2;
        int i2 = component2 + 123;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            BiometricHelper2.getInstance().closeFingerprintPay();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        BiometricHelper2.getInstance().closeFingerprintPay();
        if (callback != null) {
            callback.onSuccess(new BaseResp());
        }
        int i3 = component2 + 67;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override
    public boolean isShowFingerprintLogin() {
        int i = 2 % 2;
        int i2 = component2 + 113;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsSupportBiometric = BiometricUtil.isSupportBiometric();
        if (i3 != 0) {
            int i4 = 51 / 0;
        }
        return zIsSupportBiometric;
    }

    @Override
    public boolean isOpenFingerprintLogin() {
        int i = 2 % 2;
        int i2 = component2 + 7;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsOpenFingerprintLogin = BiometricHelper2.getInstance().isOpenFingerprintLogin();
        int i4 = component2 + 19;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return zIsOpenFingerprintLogin;
    }

    @Override
    public void closeFingerprintLogin(ApiCallback<BaseResp> callback) {
        int i = 2 % 2;
        BiometricHelper2.getInstance().closeFingerprintLogin();
        if (callback != null) {
            callback.onSuccess(new BaseResp());
            int i2 = component2 + 23;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
        }
        SPUtils.getInstance(BiometricConstants.BIOMETRIC_SP_NAME).remove(ShareDataUIState() + "_encryptPin2");
        int i4 = ShareDataUIState + 51;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void openFingerprintLogin(final String pin, final ApiCallback<BaseResp> callback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(pin, "");
        ((IBiometricService) RouteUtils.getService(IBiometricService.class)).guideOpenBiometricLogin(pin, BiometricType.FINGERPRINT, false, new ApiCallback<Boolean>() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public void onSuccess(Boolean bool) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 49;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                onSuccess(bool.booleanValue());
                int i5 = ShareDataUIState + 111;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }

            public void onSuccess(boolean value) {
                int i2 = 2 % 2;
                int i3 = copydefault + 103;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                ApiCallback<BaseResp> apiCallback = callback;
                if (apiCallback != null) {
                    apiCallback.onSuccess(new BaseResp());
                }
                SPUtils.getInstance(BiometricConstants.BIOMETRIC_SP_NAME).put(BiometricsSettingModel.access$getExtraKey(this) + "_encryptPin2", EncryptManager.INSTANCE.encrypt(pin));
                int i5 = copydefault + 33;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = copydefault + 59;
                ShareDataUIState = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(e, "");
                ApiCallback<BaseResp> apiCallback = callback;
                if (apiCallback != null) {
                    apiCallback.onError(e);
                    int i4 = ShareDataUIState + 63;
                    copydefault = i4 % 128;
                    int i5 = i4 % 2;
                }
                int i6 = ShareDataUIState + 115;
                copydefault = i6 % 128;
                if (i6 % 2 != 0) {
                    throw null;
                }
            }
        });
        int i2 = ShareDataUIState + 121;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = 1 + 65;
        component1 = i % 128;
        int i2 = i % 2;
    }
}
