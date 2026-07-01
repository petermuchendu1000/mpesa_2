package com.huawei.digitalpayment.consumer.sfcui.profile.esim;

import android.os.Process;
import com.huawei.digitalpayment.consumer.base.util.HaProxyRequest;
import com.huawei.digitalpayment.consumer.sfcui.profile.esim.api.ESimApiUrl;
import com.huawei.digitalpayment.consumer.sfcui.profile.esim.api.model.ESimQueryResponseDto;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0014¨\u0006\u0005"}, d2 = {"com/huawei/digitalpayment/consumer/sfcui/profile/esim/ESimViewModel$queryEsimReservation$1$request$1", "Lcom/huawei/digitalpayment/consumer/base/util/HaProxyRequest;", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/api/model/ESimQueryResponseDto;", "getApiPath", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ESimViewModel$queryEsimReservation$1$request$1 extends HaProxyRequest<ESimQueryResponseDto> {
    public static int component1 = 0;
    private static int component2 = 1;
    private static int component3;
    public static int copydefault;

    ESimViewModel$queryEsimReservation$1$request$1() {
    }

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = component2 + 73;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = i3 + 43;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return ESimApiUrl.E_SIM_RESERVATION_QUERY;
    }

    public static int ShareDataUIState() {
        int i = copydefault;
        int i2 = i % 9622965;
        copydefault = i + 1;
        if (i2 != 0) {
            return component1;
        }
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        component1 = startElapsedRealtime;
        return startElapsedRealtime;
    }
}
