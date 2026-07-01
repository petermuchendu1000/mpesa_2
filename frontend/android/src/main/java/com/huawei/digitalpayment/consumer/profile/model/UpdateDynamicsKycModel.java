package com.huawei.digitalpayment.consumer.profile.model;

import com.blankj.utilcode.util.GsonUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.loginModule.register.request.RegisterKycParamsKt;
import com.huawei.digitalpayment.consumer.profile.model.remote.IUpdateDynamicsKycModel;
import com.huawei.digitalpayment.consumer.profile.model.request.UpdateKycParams;
import com.huawei.digitalpayment.customer.dynamics.model.DynamicsElement;
import com.huawei.digitalpayment.customer.dynamics.resp.KycInfoResp;
import com.huawei.http.BaseResp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;

public class UpdateDynamicsKycModel implements IUpdateDynamicsKycModel {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    private final IProfileModel model;

    @Inject
    public UpdateDynamicsKycModel(IProfileModel iProfileModel) {
        this.model = iProfileModel;
    }

    @Deprecated
    public void updateKycInfo(HashMap<String, Object> map, String str, ApiCallback<BaseResp> apiCallback) {
        int i = 2 % 2;
        updateKycInfo(new UpdateKycParams(SPUtils.getInstance().getString("recent_login_phone_number"), map, str, AppConfigManager.getAppConfig().getPinKeyVersion()), apiCallback);
        int i2 = copydefault + 77;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public void updateKycInfo(UpdateKycParams updateKycParams, final ApiCallback<BaseResp> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<BaseResp> paymentRequest = new PaymentRequest<BaseResp>(this) {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component2 + 103;
                int i4 = i3 % 128;
                copydefault = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 7;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                return "updateKycInfo";
            }
        };
        if (updateKycParams.getExtProperties() != null) {
            int i2 = ShareDataUIState + 105;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                updateKycParams.getExtProperties().isEmpty();
                throw null;
            }
            if (!updateKycParams.getExtProperties().isEmpty()) {
                paymentRequest.addParams("extProperties", GsonUtils.toJson(updateKycParams.getExtProperties()));
            }
        }
        paymentRequest.addParams(updateKycParams.removeExtProperties());
        sendRequest(paymentRequest, new ApiCallback<BaseResp>() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i3 = 2 % 2;
                int i4 = component2 + 63;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                Object obj = null;
                onSuccess2(baseResp);
                if (i5 != 0) {
                    obj.hashCode();
                    throw null;
                }
                int i6 = component2 + 115;
                copydefault = i6 % 128;
                if (i6 % 2 != 0) {
                    throw null;
                }
            }

            public void onSuccess2(BaseResp baseResp) {
                int i3 = 2 % 2;
                int i4 = copydefault + 99;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                UpdateDynamicsKycModel.m10861$$Nest$mgetKycInfo(UpdateDynamicsKycModel.this, baseResp, apiCallback);
                int i6 = copydefault + 3;
                component2 = i6 % 128;
                int i7 = i6 % 2;
            }

            @Override
            public void onError(BaseException baseException) {
                int i3 = 2 % 2;
                int i4 = component2 + 37;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                apiCallback.onError(baseException);
                int i6 = component2 + 31;
                copydefault = i6 % 128;
                if (i6 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i3 = ShareDataUIState + 87;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
    }

    private void getKycInfo(final BaseResp baseResp, final ApiCallback<BaseResp> apiCallback) {
        int i = 2 % 2;
        this.model.getKycInfo(new ApiCallback<Map<String, List<DynamicsElement>>>(this) {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(Map<String, List<DynamicsElement>> map) {
                int i2 = 2 % 2;
                int i3 = component3 + 13;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(map);
                if (i4 != 0) {
                    throw null;
                }
            }

            public void onSuccess2(Map<String, List<DynamicsElement>> map) {
                int i2 = 2 % 2;
                int i3 = component3 + 13;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                apiCallback.onSuccess(baseResp);
                int i5 = component1 + 45;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component1 + 111;
                component3 = i3 % 128;
                if (i3 % 2 == 0) {
                    apiCallback.onSuccess(baseResp);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                apiCallback.onSuccess(baseResp);
                int i4 = component3 + 43;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 93 / 0;
                }
            }
        });
        int i2 = ShareDataUIState + 57;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void getKycInfo(ApiCallback<KycInfoResp> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<KycInfoResp> paymentRequest = new PaymentRequest<KycInfoResp>(this) {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = copydefault;
                int i4 = i3 + 11;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 57 / 0;
                }
                int i6 = i3 + 13;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                return "getKycInfo";
            }
        };
        paymentRequest.addParams("portletCode", RegisterKycParamsKt.REGISTER_CODE);
        sendRequest(paymentRequest, apiCallback);
        int i2 = copydefault + 15;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
    }

    static void m10861$$Nest$mgetKycInfo(UpdateDynamicsKycModel updateDynamicsKycModel, BaseResp baseResp, ApiCallback apiCallback) {
        int i = 2 % 2;
        int i2 = copydefault + 107;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        updateDynamicsKycModel.getKycInfo(baseResp, apiCallback);
        if (i3 == 0) {
            throw null;
        }
        int i4 = ShareDataUIState + 99;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
