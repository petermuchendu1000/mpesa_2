package com.huawei.digitalpayment.consumer.sfcui.profile.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.http.BaseResp;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH&J\u001a\u0010\f\u001a\u00020\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\u001a\u0010\u000f\u001a\u00020\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH&J\"\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH&¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/model/IBiometricsSettingModel;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "isShowFingerprintPay", "", "isOpenFingerprintPay", "openFingerprintPay", "", "pin", "", "callback", "Lcom/huawei/common/listener/ApiCallback;", "Lcom/huawei/http/BaseResp;", "closeFingerprintPay", "isShowFingerprintLogin", "isOpenFingerprintLogin", "closeFingerprintLogin", "openFingerprintLogin", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IBiometricsSettingModel extends BaseModel {
    void closeFingerprintLogin(ApiCallback<BaseResp> callback);

    void closeFingerprintPay(ApiCallback<BaseResp> callback);

    boolean isOpenFingerprintLogin();

    boolean isOpenFingerprintPay();

    boolean isShowFingerprintLogin();

    boolean isShowFingerprintPay();

    void openFingerprintLogin(String pin, ApiCallback<BaseResp> callback);

    void openFingerprintPay(String pin, ApiCallback<BaseResp> callback);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        private static int component1 = 1;
        private static int copydefault;

        /* JADX WARN: Multi-variable type inference failed */
        public static void openFingerprintPay$default(IBiometricsSettingModel iBiometricsSettingModel, String str, ApiCallback apiCallback, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = copydefault + 99;
            int i4 = i3 % 128;
            component1 = i4;
            Object obj2 = null;
            if (i3 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openFingerprintPay");
            }
            if ((i & 2) != 0) {
                int i5 = i4 + 81;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                apiCallback = null;
            }
            iBiometricsSettingModel.openFingerprintPay(str, apiCallback);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static void closeFingerprintPay$default(IBiometricsSettingModel iBiometricsSettingModel, ApiCallback apiCallback, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component1;
            int i4 = i3 + 49;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: closeFingerprintPay");
            }
            int i6 = i3 + 31;
            int i7 = i6 % 128;
            copydefault = i7;
            if (i6 % 2 == 0 && (i & 1) != 0) {
                int i8 = i7 + 117;
                component1 = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 18 / 0;
                }
                apiCallback = null;
            }
            iBiometricsSettingModel.closeFingerprintPay(apiCallback);
            int i10 = component1 + 93;
            copydefault = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static void closeFingerprintLogin$default(IBiometricsSettingModel iBiometricsSettingModel, ApiCallback apiCallback, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = copydefault;
            int i4 = i3 + 23;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: closeFingerprintLogin");
            }
            int i6 = i3 + 85;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            if ((i & 1) != 0) {
                apiCallback = null;
            }
            iBiometricsSettingModel.closeFingerprintLogin(apiCallback);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static void openFingerprintLogin$default(IBiometricsSettingModel iBiometricsSettingModel, String str, ApiCallback apiCallback, int i, Object obj) {
            int i2 = 2 % 2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openFingerprintLogin");
            }
            int i3 = component1;
            int i4 = i3 + 37;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            if ((i & 2) != 0) {
                int i6 = i3 + 81;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                apiCallback = null;
            }
            iBiometricsSettingModel.openFingerprintLogin(str, apiCallback);
        }
    }
}
