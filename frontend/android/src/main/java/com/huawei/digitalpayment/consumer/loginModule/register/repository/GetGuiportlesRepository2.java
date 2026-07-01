package com.huawei.digitalpayment.consumer.loginModule.register.repository;

import com.blankj.utilcode.util.CollectionUtils;
import com.google.gson.JsonObject;
import com.huawei.common.util.SecureGsonUtils;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.loginModule.register.request.RegisterKycParamsKt;
import com.huawei.digitalpayment.customer.dynamics.model.DynamicsElement;
import com.huawei.digitalpayment.customer.dynamics.resp.GuiElements;
import com.huawei.digitalpayment.customer.dynamics.resp.GuiGroup;
import com.huawei.digitalpayment.customer.dynamics.resp.KycInfoResp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GetGuiportlesRepository2 extends PaymentRequest<List<DynamicsElement>> {
    private static int component1 = 0;
    private static int copydefault = 1;

    @Override
    public Object convert(JsonObject jsonObject) {
        int i = 2 % 2;
        int i2 = component1 + 33;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        List<DynamicsElement> listConvert = convert(jsonObject);
        int i4 = component1 + 51;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return listConvert;
    }

    public GetGuiportlesRepository2() {
        addParams("portletCode", RegisterKycParamsKt.REGISTER_CODE);
    }

    @Override
    public List<DynamicsElement> convert(JsonObject jsonObject) {
        GuiElements next;
        int i = 2 % 2;
        KycInfoResp kycInfoResp = (KycInfoResp) SecureGsonUtils.fromJson(jsonObject.toString(), KycInfoResp.class);
        if (kycInfoResp != null) {
            int i2 = component1 + 103;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            if (!CollectionUtils.isEmpty(kycInfoResp.getGroups())) {
                ArrayList arrayList = new ArrayList();
                for (GuiGroup guiGroup : kycInfoResp.getGroups()) {
                    if (guiGroup != null) {
                        int i4 = copydefault + 21;
                        component1 = i4 % 128;
                        if (i4 % 2 != 0) {
                            CollectionUtils.isEmpty(guiGroup.getGuiElements());
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        if (!CollectionUtils.isEmpty(guiGroup.getGuiElements())) {
                            Iterator<GuiElements> it = guiGroup.getGuiElements().iterator();
                            while (it.hasNext()) {
                                int i5 = copydefault + 5;
                                component1 = i5 % 128;
                                if (i5 % 2 != 0) {
                                    next = it.next();
                                    if (GuiElements.INSTANCE.showVisibly(true, next)) {
                                        arrayList.add(GuiElements.INSTANCE.toElement(false, next));
                                    }
                                } else {
                                    next = it.next();
                                    if (GuiElements.INSTANCE.showVisibly(false, next)) {
                                        arrayList.add(GuiElements.INSTANCE.toElement(false, next));
                                    }
                                }
                            }
                        }
                    }
                }
                int i6 = component1 + 9;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                return arrayList;
            }
        }
        return new ArrayList();
    }

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = component1 + 31;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 93;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return "guiportlets";
    }
}
