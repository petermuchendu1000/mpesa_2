package com.huawei.digitalpayment.consumer.basicUi.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.http.BaseResp;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u001a\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH&J\"\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH&J\u001a\u0010\u000f\u001a\u00020\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH&J\"\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH&¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/basicUi/model/ILoginSettingModel;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "isShowFaceIdLogin", "", "isOpenFaceIdLogin", "isShowFingerprintLogin", "isOpenFingerprintLogin", "closeFaceIdLogin", "", "callback", "Lcom/huawei/common/listener/ApiCallback;", "Lcom/huawei/http/BaseResp;", "openFaceIdLogin", "pin", "", "closeFingerprintLogin", "openFingerprintLogin", "ConsumerBasicUiModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ILoginSettingModel extends BaseModel {
    void closeFaceIdLogin(ApiCallback<BaseResp> callback);

    void closeFingerprintLogin(ApiCallback<BaseResp> callback);

    boolean isOpenFaceIdLogin();

    boolean isOpenFingerprintLogin();

    boolean isShowFaceIdLogin();

    boolean isShowFingerprintLogin();

    void openFaceIdLogin(String pin, ApiCallback<BaseResp> callback);

    void openFingerprintLogin(String pin, ApiCallback<BaseResp> callback);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        private static int ShareDataUIState = 1;
        private static int component3;

        /* JADX WARN: Multi-variable type inference failed */
        public static void closeFaceIdLogin$default(ILoginSettingModel iLoginSettingModel, ApiCallback apiCallback, int i, Object obj) {
            int i2 = 2 % 2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: closeFaceIdLogin");
            }
            if ((i & 1) != 0) {
                int i3 = component3;
                int i4 = i3 + 35;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 41;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                apiCallback = null;
            }
            iLoginSettingModel.closeFaceIdLogin(apiCallback);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static void openFaceIdLogin$default(ILoginSettingModel iLoginSettingModel, String str, ApiCallback apiCallback, int i, Object obj) {
            int i2 = 2 % 2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openFaceIdLogin");
            }
            int i3 = ShareDataUIState;
            int i4 = i3 + 61;
            component3 = i4 % 128;
            if (i4 % 2 == 0 ? (i & 2) != 0 : (i & 2) != 0) {
                int i5 = i3 + 53;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
                apiCallback = null;
            }
            iLoginSettingModel.openFaceIdLogin(str, apiCallback);
            int i6 = ShareDataUIState + 121;
            component3 = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static void closeFingerprintLogin$default(ILoginSettingModel iLoginSettingModel, ApiCallback apiCallback, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component3 + 45;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            int i5 = i3 % 2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: closeFingerprintLogin");
            }
            int i6 = i4 + 39;
            int i7 = i6 % 128;
            component3 = i7;
            if (i6 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
                int i8 = i7 + 71;
                ShareDataUIState = i8 % 128;
                int i9 = i8 % 2;
                apiCallback = null;
            }
            iLoginSettingModel.closeFingerprintLogin(apiCallback);
            int i10 = ShareDataUIState + 35;
            component3 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
        
            r1 = r1 + 95;
            r6 = r1 % 128;
            com.huawei.digitalpayment.consumer.basicUi.model.ILoginSettingModel.DefaultImpls.component3 = r6;
            r1 = r1 % 2;
            r6 = r6 + 83;
            com.huawei.digitalpayment.consumer.basicUi.model.ILoginSettingModel.DefaultImpls.ShareDataUIState = r6 % 128;
            r6 = r6 % 2;
            r6 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
        
            r4.openFingerprintLogin(r5, r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
        
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openFingerprintLogin");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        
            if (r8 == null) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        
            if (r8 == null) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
        
            if ((r7 & 2) == 0) goto L11;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static void openFingerprintLogin$default(com.huawei.digitalpayment.consumer.basicUi.model.ILoginSettingModel r4, java.lang.String r5, com.huawei.common.listener.ApiCallback r6, int r7, java.lang.Object r8) {
            /*
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.basicUi.model.ILoginSettingModel.DefaultImpls.ShareDataUIState
                int r2 = r1 + 47
                int r3 = r2 % 128
                com.huawei.digitalpayment.consumer.basicUi.model.ILoginSettingModel.DefaultImpls.component3 = r3
                int r2 = r2 % r0
                if (r2 == 0) goto L15
                r2 = 78
                int r2 = r2 / 0
                if (r8 != 0) goto L2d
                goto L17
            L15:
                if (r8 != 0) goto L2d
            L17:
                r7 = r7 & r0
                if (r7 == 0) goto L29
                int r1 = r1 + 95
                int r6 = r1 % 128
                com.huawei.digitalpayment.consumer.basicUi.model.ILoginSettingModel.DefaultImpls.component3 = r6
                int r1 = r1 % r0
                int r6 = r6 + 83
                int r7 = r6 % 128
                com.huawei.digitalpayment.consumer.basicUi.model.ILoginSettingModel.DefaultImpls.ShareDataUIState = r7
                int r6 = r6 % r0
                r6 = 0
            L29:
                r4.openFingerprintLogin(r5, r6)
                return
            L2d:
                java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
                java.lang.String r5 = "Super calls with default arguments not supported in this target, function: openFingerprintLogin"
                r4.<init>(r5)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basicUi.model.ILoginSettingModel.DefaultImpls.openFingerprintLogin$default(com.huawei.digitalpayment.consumer.basicUi.model.ILoginSettingModel, java.lang.String, com.huawei.common.listener.ApiCallback, int, java.lang.Object):void");
        }
    }
}
