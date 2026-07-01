package com.huawei.digitalpayment.history.model.request;

import com.huawei.http.BaseRequestParams;
import java.util.List;

public class TransChannelAndTypesRequest extends BaseRequestParams {
    private static int component3 = 1;
    private static int copydefault;
    private List<String> configTypes;

    public List<String> getConfigTypes() {
        int i = 2 % 2;
        int i2 = component3 + 45;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.configTypes;
        }
        throw null;
    }

    public void setConfigTypes(List<String> list) {
        int i = 2 % 2;
        int i2 = copydefault + 89;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.configTypes = list;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 61;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 91 / 0;
        }
    }
}
