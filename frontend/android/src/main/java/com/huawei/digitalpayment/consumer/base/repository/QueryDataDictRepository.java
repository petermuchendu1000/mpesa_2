package com.huawei.digitalpayment.consumer.base.repository;

import com.google.gson.JsonObject;
import com.huawei.digitalpayment.consumer.base.resp.DataDictResp;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.baselib.util.sort.SortUtils;
import java.util.Map;

public class QueryDataDictRepository extends PaymentRequest<DataDictResp> {
    private static int component2 = 1;
    private static int copydefault;

    @Override
    public Object convert(JsonObject jsonObject) {
        int i = 2 % 2;
        int i2 = copydefault + 57;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            convert(jsonObject);
            throw null;
        }
        DataDictResp dataDictRespConvert = convert(jsonObject);
        int i3 = component2 + 85;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 38 / 0;
        }
        return dataDictRespConvert;
    }

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = component2 + 51;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return "queryDataDict";
        }
        int i3 = 64 / 0;
        return "queryDataDict";
    }

    @Override
    public DataDictResp convert(JsonObject jsonObject) {
        int i = 2 % 2;
        DataDictResp dataDictResp = (DataDictResp) super.convert(jsonObject);
        if (dataDictResp != null) {
            int i2 = copydefault + 113;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            if (dataDictResp.getDictMap() != null && !dataDictResp.getDictMap().isEmpty()) {
                int i4 = component2 + 63;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                for (Map.Entry<String, Map<String, String>> entry : dataDictResp.getDictMap().entrySet()) {
                    entry.setValue(SortUtils.sortMapByKey(entry.getValue()));
                }
            }
        }
        return dataDictResp;
    }
}
