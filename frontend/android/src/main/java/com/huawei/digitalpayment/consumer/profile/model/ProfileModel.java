package com.huawei.digitalpayment.consumer.profile.model;

import com.blankj.utilcode.util.CollectionUtils;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.loginModule.register.request.RegisterKycParamsKt;
import com.huawei.digitalpayment.consumer.profile.model.local.LocalCustomer;
import com.huawei.digitalpayment.consumer.profile.model.local.LocalKycGroup;
import com.huawei.digitalpayment.consumer.profile.model.remote.RemoteChangeProfile;
import com.huawei.digitalpayment.consumer.profile.model.request.ChangeProfileParams;
import com.huawei.digitalpayment.consumer.profile.util.ModelMappingUtils;
import com.huawei.digitalpayment.consumer.profile.util.ProfileHelper;
import com.huawei.digitalpayment.customer.dynamics.model.DynamicsElement;
import com.huawei.digitalpayment.customer.dynamics.resp.GuiGroup;
import com.huawei.digitalpayment.customer.dynamics.resp.KycInfoResp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;

public class ProfileModel implements IProfileModel {
    private static int component3 = 0;
    private static int copydefault = 1;

    @Inject
    public ProfileModel() {
    }

    @Override
    public void getKycInfo(final ApiCallback<Map<String, List<DynamicsElement>>> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<KycInfoResp> paymentRequest = new PaymentRequest<KycInfoResp>(this) {
            private static int component1 = 1;
            private static int component2;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component1;
                int i4 = i3 + 27;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 35 / 0;
                }
                int i6 = i3 + 27;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                return "getKycInfo";
            }
        };
        paymentRequest.addParams("portletCode", RegisterKycParamsKt.REGISTER_CODE);
        sendRequest(paymentRequest, new ApiCallback<KycInfoResp>(this) {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public void onSuccess(KycInfoResp kycInfoResp) {
                int i2 = 2 % 2;
                int i3 = component1 + 39;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(kycInfoResp);
                int i5 = ShareDataUIState + 13;
                component1 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 61 / 0;
                }
            }

            public void onSuccess2(KycInfoResp kycInfoResp) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 3;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    apiCallback.onSuccess(ProfileModel.m10860$$Nest$smgetKycInfoMap(kycInfoResp));
                } else {
                    apiCallback.onSuccess(ProfileModel.m10860$$Nest$smgetKycInfoMap(kycInfoResp));
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 115;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                apiCallback.onError(baseException);
                int i5 = component1 + 69;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = copydefault + 123;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static Map<String, List<DynamicsElement>> getKycInfoMap(KycInfoResp kycInfoResp) {
        int i = 2 % 2;
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        Object obj = null;
        if (kycInfoResp != null) {
            int i2 = component3 + 117;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                CollectionUtils.isNotEmpty(kycInfoResp.getGroups());
                obj.hashCode();
                throw null;
            }
            if (CollectionUtils.isNotEmpty(kycInfoResp.getGroups())) {
                int i3 = copydefault + 77;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                for (GuiGroup guiGroup : kycInfoResp.getGroups()) {
                    arrayList.add(new LocalKycGroup(guiGroup.getGroupCode(), guiGroup.getGroupLabel()));
                    map.put(guiGroup.getGroupCode(), ModelMappingUtils.toLocalElements(guiGroup));
                }
            }
        }
        ProfileHelper.updateDynamicsKycs(arrayList, map);
        int i5 = component3 + 53;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return map;
        }
        throw null;
    }

    @Override
    public void changeProfile(ChangeProfileParams changeProfileParams, final ApiCallback<LocalCustomer> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<RemoteChangeProfile> paymentRequest = new PaymentRequest<RemoteChangeProfile>(this) {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = copydefault + 123;
                int i4 = i3 % 128;
                component3 = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 7;
                copydefault = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 30 / 0;
                }
                return "changeProfile";
            }
        };
        paymentRequest.addParams(changeProfileParams);
        sendRequest(paymentRequest, new ApiCallback<RemoteChangeProfile>(this) {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public void onSuccess(RemoteChangeProfile remoteChangeProfile) {
                int i2 = 2 % 2;
                int i3 = component1 + 75;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(remoteChangeProfile);
                int i5 = component1 + 105;
                component2 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            public void onSuccess2(RemoteChangeProfile remoteChangeProfile) {
                int i2 = 2 % 2;
                int i3 = component2 + 13;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                apiCallback.onSuccess(ModelMappingUtils.toLocalCustomer(remoteChangeProfile.getCustomerInfo().getCustomer()));
                if (i4 != 0) {
                    int i5 = 15 / 0;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component2 + 31;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                apiCallback.onError(baseException);
                int i5 = component1 + 99;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = component3 + 69;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void verifyMsisdn(String str, ApiCallback<String> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<String> paymentRequest = new PaymentRequest<String>(this) {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public Object convert(JsonObject jsonObject) {
                int i2 = 2 % 2;
                int i3 = copydefault + 123;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                String strConvert = convert(jsonObject);
                int i5 = copydefault + 15;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                return strConvert;
            }

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState;
                int i4 = i3 + 33;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 125;
                copydefault = i6 % 128;
                if (i6 % 2 != 0) {
                    return "verifyP2PTransfer";
                }
                throw null;
            }

            @Override
            public String convert(JsonObject jsonObject) {
                int i2 = 2 % 2;
                int i3 = copydefault + 113;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                JsonElement jsonElement = jsonObject.get("customerType");
                if (i4 != 0) {
                    jsonElement.getAsString();
                    throw null;
                }
                String asString = jsonElement.getAsString();
                int i5 = ShareDataUIState + 21;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    return asString;
                }
                throw null;
            }
        };
        paymentRequest.addParams("receiverMsisdn", str);
        sendRequest(paymentRequest, apiCallback);
        int i2 = component3 + 67;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    static Map m10860$$Nest$smgetKycInfoMap(KycInfoResp kycInfoResp) {
        int i = 2 % 2;
        int i2 = component3 + 59;
        copydefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            getKycInfoMap(kycInfoResp);
            obj.hashCode();
            throw null;
        }
        Map<String, List<DynamicsElement>> kycInfoMap = getKycInfoMap(kycInfoResp);
        int i3 = component3 + 67;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            return kycInfoMap;
        }
        obj.hashCode();
        throw null;
    }
}
