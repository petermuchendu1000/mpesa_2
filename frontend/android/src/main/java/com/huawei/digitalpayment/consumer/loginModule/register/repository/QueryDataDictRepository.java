package com.huawei.digitalpayment.consumer.loginModule.register.repository;

import com.blankj.utilcode.util.GsonUtils;
import com.google.gson.JsonObject;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.loginModule.login.model.DataDictInfoRemote;
import com.huawei.digitalpayment.consumer.loginModule.register.model.LocalIdType;
import java.util.List;

public class QueryDataDictRepository extends PaymentRequest<List<LocalIdType>> {
    private static int ShareDataUIState = 1;
    private static int component3;

    @Override
    public Object convert(JsonObject jsonObject) {
        int i = 2 % 2;
        int i2 = component3 + 121;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return convert(jsonObject);
        }
        convert(jsonObject);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public QueryDataDictRepository(List<String> list) {
        addParams("dictName", list);
    }

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 121;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 7;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return "queryDataDict";
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<com.huawei.digitalpayment.consumer.loginModule.register.model.LocalIdType> component2(com.huawei.digitalpayment.consumer.loginModule.login.model.DataDictInfoRemote r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r6 != 0) goto Lb
            return r1
        Lb:
            java.util.Map r6 = r6.getDictMap()
            java.lang.String r2 = "IDTYPE"
            java.lang.Object r6 = r6.get(r2)
            java.util.Map r6 = (java.util.Map) r6
            if (r6 == 0) goto L66
            int r2 = com.huawei.digitalpayment.consumer.loginModule.register.repository.QueryDataDictRepository.ShareDataUIState
            int r2 = r2 + 23
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.loginModule.register.repository.QueryDataDictRepository.component3 = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L2f
            boolean r2 = r6.isEmpty()
            r3 = 30
            int r3 = r3 / 0
            if (r2 == 0) goto L36
            goto L66
        L2f:
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L36
            goto L66
        L36:
            java.util.Map r6 = com.huawei.digitalpayment.consumer.baselib.util.sort.SortUtils.sortMapByKey(r6)
            java.util.Set r2 = r6.keySet()
            java.util.Iterator r2 = r2.iterator()
            int r3 = com.huawei.digitalpayment.consumer.loginModule.register.repository.QueryDataDictRepository.ShareDataUIState
            int r3 = r3 + 61
            int r4 = r3 % 128
            com.huawei.digitalpayment.consumer.loginModule.register.repository.QueryDataDictRepository.component3 = r4
            int r3 = r3 % r0
        L4b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L66
            java.lang.Object r0 = r2.next()
            java.lang.String r0 = (java.lang.String) r0
            com.huawei.digitalpayment.consumer.loginModule.register.model.LocalIdType r3 = new com.huawei.digitalpayment.consumer.loginModule.register.model.LocalIdType
            java.lang.Object r4 = r6.get(r0)
            java.lang.String r4 = (java.lang.String) r4
            r3.<init>(r0, r4)
            r1.add(r3)
            goto L4b
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.register.repository.QueryDataDictRepository.component2(com.huawei.digitalpayment.consumer.loginModule.login.model.DataDictInfoRemote):java.util.List");
    }

    @Override
    public List<LocalIdType> convert(JsonObject jsonObject) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 5;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String string = jsonObject.toString();
        if (i3 == 0) {
            return component2((DataDictInfoRemote) GsonUtils.fromJson(string, DataDictInfoRemote.class));
        }
        component2((DataDictInfoRemote) GsonUtils.fromJson(string, DataDictInfoRemote.class));
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
