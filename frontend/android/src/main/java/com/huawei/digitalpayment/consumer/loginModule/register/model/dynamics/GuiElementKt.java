package com.huawei.digitalpayment.consumer.loginModule.register.model.dynamics;

import com.huawei.digitalpayment.customer.dynamics.model.DynamicsSelectInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001¨\u0006\u0004"}, d2 = {"toDynamicsSelectInfiList", "", "Lcom/huawei/digitalpayment/customer/dynamics/model/DynamicsSelectInfo;", "Lcom/huawei/digitalpayment/consumer/loginModule/register/model/dynamics/GuiSelectInfo;", "ConsumerLoginModule_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class GuiElementKt {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;

    public static final List<DynamicsSelectInfo> toDynamicsSelectInfiList(List<GuiSelectInfo> list) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            int i2 = component2 + 105;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                for (GuiSelectInfo guiSelectInfo : list) {
                    arrayList.add(new DynamicsSelectInfo(guiSelectInfo.getKey(), guiSelectInfo.getLabel()));
                    int i3 = ShareDataUIState + 111;
                    component2 = i3 % 128;
                    int i4 = i3 % 2;
                }
            } else {
                list.iterator();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        return arrayList;
    }
}
