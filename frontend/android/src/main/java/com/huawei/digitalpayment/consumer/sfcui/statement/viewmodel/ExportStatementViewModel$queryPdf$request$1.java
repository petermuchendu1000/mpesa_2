package com.huawei.digitalpayment.consumer.sfcui.statement.viewmodel;

import com.huawei.digitalpayment.consumer.base.http.GsmEndpoints;
import com.huawei.digitalpayment.consumer.base.util.HaProxyRequest;
import com.huawei.digitalpayment.consumer.sfcui.statement.resp.ExportStatementResp;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0014¨\u0006\u0005"}, d2 = {"com/huawei/digitalpayment/consumer/sfcui/statement/viewmodel/ExportStatementViewModel$queryPdf$request$1", "Lcom/huawei/digitalpayment/consumer/base/util/HaProxyRequest;", "Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/ExportStatementResp;", "getApiPath", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExportStatementViewModel$queryPdf$request$1 extends HaProxyRequest<ExportStatementResp> {
    public static int ShareDataUIState = 0;
    private static int component1 = 0;
    public static int component3 = 0;
    private static int copydefault = 1;

    ExportStatementViewModel$queryPdf$request$1() {
    }

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 45;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 46 / 0;
        }
        int i5 = i2 + 95;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return GsmEndpoints.MPESA_QUERY_PDF;
        }
        throw null;
    }

    public static int ShareDataUIState() {
        int i = component3;
        int i2 = i % 6400118;
        component3 = i + 1;
        if (i2 != 0) {
            return ShareDataUIState;
        }
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        ShareDataUIState = iMaxMemory;
        return iMaxMemory;
    }
}
