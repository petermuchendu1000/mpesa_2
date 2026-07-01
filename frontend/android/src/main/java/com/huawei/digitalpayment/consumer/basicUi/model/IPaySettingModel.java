package com.huawei.digitalpayment.consumer.basicUi.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.http.BaseResp;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH&J\u001a\u0010\u000e\u001a\u00020\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH&J\"\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH&J\u001a\u0010\u0010\u001a\u00020\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH&J\u001a\u0010\u0011\u001a\u00020\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH&¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/basicUi/model/IPaySettingModel;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "isShowFaceIdPay", "", "isOpenFaceIdPay", "isShowFingerprintPay", "isOpenFingerprintPay", "openFaceIdPay", "", "pin", "", "callback", "Lcom/huawei/common/listener/ApiCallback;", "Lcom/huawei/http/BaseResp;", "closeFaceIdPay", "openFingerprintPay", "closeFingerprintPay", "closeBiometricPay", "ConsumerBasicUiModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface IPaySettingModel extends BaseModel {
    void closeBiometricPay(ApiCallback<BaseResp> callback);

    void closeFaceIdPay(ApiCallback<BaseResp> callback);

    void closeFingerprintPay(ApiCallback<BaseResp> callback);

    boolean isOpenFaceIdPay();

    boolean isOpenFingerprintPay();

    boolean isShowFaceIdPay();

    boolean isShowFingerprintPay();

    void openFaceIdPay(String pin, ApiCallback<BaseResp> callback);

    void openFingerprintPay(String pin, ApiCallback<BaseResp> callback);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        private static int component1 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Multi-variable type inference failed */
        public static void openFaceIdPay$default(IPaySettingModel iPaySettingModel, String str, ApiCallback apiCallback, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component1 + 75;
            int i4 = i3 % 128;
            copydefault = i4;
            int i5 = i3 % 2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openFaceIdPay");
            }
            int i6 = i4 + 47;
            int i7 = i6 % 128;
            component1 = i7;
            int i8 = i6 % 2;
            if ((i & 2) != 0) {
                int i9 = i7 + 35;
                copydefault = i9 % 128;
                int i10 = i9 % 2;
                apiCallback = null;
            }
            iPaySettingModel.openFaceIdPay(str, apiCallback);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static void closeFaceIdPay$default(IPaySettingModel iPaySettingModel, ApiCallback apiCallback, int i, Object obj) {
            int i2 = 2 % 2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: closeFaceIdPay");
            }
            int i3 = component1 + 23;
            int i4 = i3 % 128;
            copydefault = i4;
            int i5 = i3 % 2;
            if ((i & 1) != 0) {
                int i6 = i4 + 75;
                component1 = i6 % 128;
                int i7 = i6 % 2;
                apiCallback = null;
            }
            iPaySettingModel.closeFaceIdPay(apiCallback);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static void openFingerprintPay$default(IPaySettingModel iPaySettingModel, String str, ApiCallback apiCallback, int i, Object obj) {
            int i2 = 2 % 2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openFingerprintPay");
            }
            int i3 = copydefault + 43;
            component1 = i3 % 128;
            if (i3 % 2 == 0 ? (i & 2) != 0 : (i & 5) != 0) {
                apiCallback = null;
            }
            iPaySettingModel.openFingerprintPay(str, apiCallback);
            int i4 = component1 + 33;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 93 / 0;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static void closeFingerprintPay$default(IPaySettingModel iPaySettingModel, ApiCallback apiCallback, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = copydefault;
            int i4 = i3 + 17;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: closeFingerprintPay");
            }
            if ((i & 1) != 0) {
                int i6 = i3 + 85;
                component1 = i6 % 128;
                int i7 = i6 % 2;
                apiCallback = null;
            }
            iPaySettingModel.closeFingerprintPay(apiCallback);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static void closeBiometricPay$default(IPaySettingModel iPaySettingModel, ApiCallback apiCallback, int i, Object obj) {
            int i2 = 2 % 2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: closeBiometricPay");
            }
            int i3 = component1;
            int i4 = i3 + 59;
            copydefault = i4 % 128;
            if (i4 % 2 != 0 && (i & 1) != 0) {
                int i5 = i3 + 101;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                apiCallback = null;
            }
            iPaySettingModel.closeBiometricPay(apiCallback);
        }
    }
}
