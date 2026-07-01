package com.huawei.digitalpayment.consumer.basicUi.model;

import com.huawei.biometric.BiometricUtil;
import com.huawei.biometric.LocalAuthenticationUtils;
import com.huawei.biometric.util.BiometricHelper2;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.checkout.viewmodel.CheckoutViewModel;
import com.huawei.http.BaseResp;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0016J\u0018\u0010\u0010\u001a\u00020\n2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0016J \u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\n2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0016J\u0018\u0010\u0013\u001a\u00020\n2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0016¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/basicUi/model/PaySettingModel;", "Lcom/huawei/digitalpayment/consumer/basicUi/model/IPaySettingModel;", "<init>", "()V", "isShowFaceIdPay", "", "isOpenFaceIdPay", "isShowFingerprintPay", "isOpenFingerprintPay", "openFaceIdPay", "", "pin", "", "callback", "Lcom/huawei/common/listener/ApiCallback;", "Lcom/huawei/http/BaseResp;", "closeFaceIdPay", "openFingerprintPay", "closeFingerprintPay", "closeBiometricPay", "ConsumerBasicUiModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class PaySettingModel implements IPaySettingModel {
    private static int component2 = 1;
    private static int copydefault;

    @Inject
    public PaySettingModel() {
    }

    @Override
    public boolean isShowFaceIdPay() {
        int i = 2 % 2;
        int i2 = component2 + 3;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsSupport = LocalAuthenticationUtils.isSupport();
        int i4 = copydefault + 13;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return zIsSupport;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public boolean isOpenFaceIdPay() {
        int i = 2 % 2;
        int i2 = component2 + 33;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsOpenFaceIdPay = BiometricHelper2.getInstance().isOpenFaceIdPay();
        int i4 = copydefault + 3;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return zIsOpenFaceIdPay;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public boolean isShowFingerprintPay() {
        int i = 2 % 2;
        int i2 = component2 + 123;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsSupportBiometric = BiometricUtil.isSupportBiometric();
        int i4 = copydefault + 29;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 61 / 0;
        }
        return zIsSupportBiometric;
    }

    @Override
    public boolean isOpenFingerprintPay() {
        int i = 2 % 2;
        int i2 = component2 + 117;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsOpenFingerprintPay = BiometricHelper2.getInstance().isOpenFingerprintPay();
        if (i3 != 0) {
            int i4 = 3 / 0;
        }
        return zIsOpenFingerprintPay;
    }

    @Override
    public void openFaceIdPay(String pin, final ApiCallback<BaseResp> callback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(pin, "");
        BiometricHelper2.getInstance().openFaceIdPay(pin, new ApiCallback<Boolean>() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public void onSuccess(Boolean bool) {
                int i2 = 2 % 2;
                int i3 = component3 + 101;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(bool);
                int i5 = component3 + 83;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }

            public void onSuccess2(Boolean value) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 23;
                component3 = i3 % 128;
                if (i3 % 2 == 0) {
                    super.onSuccess(value);
                    PaySettingModel.this.closeFingerprintPay(null);
                    ApiCallback<BaseResp> apiCallback = callback;
                    if (apiCallback != null) {
                        apiCallback.onSuccess(new BaseResp());
                        int i4 = ShareDataUIState + 63;
                        component3 = i4 % 128;
                        int i5 = i4 % 2;
                        return;
                    }
                    return;
                }
                super.onSuccess(value);
                PaySettingModel.this.closeFingerprintPay(null);
                throw null;
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = component3 + 9;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                super.onError(e);
                ApiCallback<BaseResp> apiCallback = callback;
                if (apiCallback != null) {
                    apiCallback.onError(e);
                    int i5 = component3 + 95;
                    ShareDataUIState = i5 % 128;
                    int i6 = i5 % 2;
                }
                int i7 = component3 + 17;
                ShareDataUIState = i7 % 128;
                int i8 = i7 % 2;
            }
        });
        int i2 = component2 + 85;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void closeFaceIdPay(ApiCallback<BaseResp> callback) {
        int i = 2 % 2;
        int i2 = component2 + 53;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        BiometricHelper2.getInstance().closeFaceIdPay();
        if (callback != null) {
            callback.onSuccess(new BaseResp());
            int i4 = copydefault + 35;
            component2 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override
    public void openFingerprintPay(String pin, final ApiCallback<BaseResp> callback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(pin, "");
        BiometricHelper2.getInstance().openFingerprintPay(pin, new ApiCallback<Boolean>() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(Boolean bool) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 63;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(bool);
                int i5 = component3 + 117;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }

            public void onSuccess2(Boolean value) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 107;
                component3 = i3 % 128;
                if (i3 % 2 != 0) {
                    super.onSuccess(value);
                    PaySettingModel.this.closeFaceIdPay(null);
                    ApiCallback<BaseResp> apiCallback = callback;
                    if (apiCallback != null) {
                        apiCallback.onSuccess(new BaseResp());
                        int i4 = ShareDataUIState + 63;
                        component3 = i4 % 128;
                        int i5 = i4 % 2;
                        return;
                    }
                    return;
                }
                super.onSuccess(value);
                PaySettingModel.this.closeFaceIdPay(null);
                throw null;
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 79;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                super.onError(e);
                ApiCallback<BaseResp> apiCallback = callback;
                if (apiCallback != null) {
                    int i5 = component3 + 87;
                    ShareDataUIState = i5 % 128;
                    int i6 = i5 % 2;
                    apiCallback.onError(e);
                }
                int i7 = ShareDataUIState + 99;
                component3 = i7 % 128;
                int i8 = i7 % 2;
            }
        });
        int i2 = copydefault + 31;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void closeFingerprintPay(ApiCallback<BaseResp> callback) {
        int i = 2 % 2;
        int i2 = component2 + 17;
        copydefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            BiometricHelper2.getInstance().closeFingerprintPay();
            if (callback != null) {
                callback.onSuccess(new BaseResp());
                int i3 = component2 + 93;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
            }
            int i5 = copydefault + 87;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            return;
        }
        BiometricHelper2.getInstance().closeFingerprintPay();
        obj.hashCode();
        throw null;
    }

    @Override
    public void closeBiometricPay(ApiCallback<BaseResp> callback) {
        int i = 2 % 2;
        int i2 = copydefault + 67;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        closeFingerprintPay(null);
        closeFaceIdPay(null);
        CheckoutViewModel.setCurrentPayWay(0);
        if (callback != null) {
            callback.onSuccess(new BaseResp());
            int i4 = copydefault + 7;
            component2 = i4 % 128;
            int i5 = i4 % 2;
        }
    }
}
