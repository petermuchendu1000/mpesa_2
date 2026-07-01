package com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel;

import android.os.SystemClock;
import com.huawei.digitalpayment.consumer.base.http.GsmEndpoints;
import com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse;
import com.huawei.digitalpayment.consumer.base.util.HaProxyRequest;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.Home5gPromoOffer;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\u0001J\b\u0010\u0005\u001a\u00020\u0006H\u0014¨\u0006\u0007"}, d2 = {"com/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/FiveGIncentiveViewModel$checkFiveGIncentiveEligibilty$request$1", "Lcom/huawei/digitalpayment/consumer/base/util/HaProxyRequest;", "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/Home5gPromoOffer;", "getApiPath", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FiveGIncentiveViewModel$checkFiveGIncentiveEligibilty$request$1 extends HaProxyRequest<HaProxyResponse<List<? extends Home5gPromoOffer>>> {
    public static int component1 = 0;
    public static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault;

    FiveGIncentiveViewModel$checkFiveGIncentiveEligibilty$request$1() {
    }

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = copydefault + 49;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return GsmEndpoints.GSM_5G_INCENTIVE_ELIGIBILITY;
        }
        throw null;
    }

    public static int component3() {
        int i = component2;
        int i2 = i % 6224786;
        component2 = i + 1;
        if (i2 != 0) {
            return component1;
        }
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        component1 = iUptimeMillis;
        return iUptimeMillis;
    }
}
