package com.huawei.digitalpayment.consumer.loginModule.register.data;

import com.blankj.utilcode.util.CollectionUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.loginModule.register.repository.GetGuiportlesRepository;
import com.huawei.digitalpayment.consumer.loginModule.register.request.RegisterKycParams;
import com.huawei.digitalpayment.consumer.loginModule.register.request.RegisterKycParamsKt;
import com.huawei.digitalpayment.customer.dynamics.model.DynamicsElement;
import com.huawei.digitalpayment.customer.dynamics.resp.GuiElements;
import com.huawei.digitalpayment.customer.dynamics.resp.GuiGroup;
import com.huawei.digitalpayment.customer.dynamics.resp.KycInfoResp;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;

public interface GetRegisterKycModel extends BaseModel {
    @Deprecated
    default void getRegisterKyc(ApiCallback<KycInfoResp> apiCallback) {
        int i = 2 % 2;
        sendRequest(new GetGuiportlesRepository(new RegisterKycParams(RegisterKycParamsKt.REGISTER_CODE)), apiCallback);
    }

    default void getRegisterDynamicKyc(RegisterKycParams registerKycParams, final ApiCallback<List<DynamicsElement>> apiCallback) {
        int i = 2 % 2;
        sendRequest(new GetGuiportlesRepository(registerKycParams), new ApiCallback<KycInfoResp>() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public void onSuccess(KycInfoResp kycInfoResp) {
                int i2 = 2 % 2;
                int i3 = component1 + 59;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                component2(kycInfoResp);
                if (i4 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = component1 + 47;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }

            public void component2(KycInfoResp kycInfoResp) {
                int i2 = 2 % 2;
                ApiCallback apiCallback2 = apiCallback;
                if (apiCallback2 != null) {
                    int i3 = component1 + 89;
                    component3 = i3 % 128;
                    int i4 = i3 % 2;
                    apiCallback2.onSuccess(GetRegisterKycModel.this.convert(kycInfoResp));
                    int i5 = component1 + 89;
                    component3 = i5 % 128;
                    int i6 = i5 % 2;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component1;
                int i4 = i3 + 77;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                ApiCallback apiCallback2 = apiCallback;
                if (apiCallback2 != null) {
                    int i6 = i3 + 85;
                    component3 = i6 % 128;
                    int i7 = i6 % 2;
                    apiCallback2.onError(baseException);
                    if (i7 == 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
        });
    }

    default List<DynamicsElement> convert(KycInfoResp kycInfoResp) {
        int i = 2 % 2;
        if (kycInfoResp == null || CollectionUtils.isEmpty(kycInfoResp.getGroups())) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (GuiGroup guiGroup : kycInfoResp.getGroups()) {
            if (guiGroup != null && !CollectionUtils.isEmpty(guiGroup.getGuiElements())) {
                for (GuiElements guiElements : guiGroup.getGuiElements()) {
                    if (GuiElements.INSTANCE.showVisibly(false, guiElements)) {
                        arrayList.add(GuiElements.INSTANCE.toElement(false, guiElements));
                    }
                }
            }
        }
        arrayList.sort(Comparator.comparingInt(new ToIntFunction() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public final int applyAsInt(Object obj) {
                int i2 = 2 % 2;
                int i3 = component2 + 73;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                int order = ((DynamicsElement) obj).getOrder();
                if (i4 != 0) {
                    int i5 = 51 / 0;
                }
                int i6 = component2 + 101;
                ShareDataUIState = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 76 / 0;
                }
                return order;
            }
        }));
        return arrayList;
    }
}
