package com.huawei.digitalpayment.consumer.sfcui.reportfraud;

import com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse;
import com.huawei.digitalpayment.consumer.base.util.HaProxyRequest;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0014¨\u0006\u0005"}, d2 = {"com/huawei/digitalpayment/consumer/sfcui/reportfraud/ReportFraudViewModel$makeRequest$1", "Lcom/huawei/digitalpayment/consumer/base/util/HaProxyRequest;", "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", "getApiPath", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReportFraudViewModel$makeRequest$1<T> extends HaProxyRequest<HaProxyResponse<T>> {
    private static int component2 = 0;
    private static int component3 = 1;
    final String component1;

    public ReportFraudViewModel$makeRequest$1(String str) {
        this.component1 = str;
    }

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 111;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.component1;
        int i4 = i2 + 81;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
