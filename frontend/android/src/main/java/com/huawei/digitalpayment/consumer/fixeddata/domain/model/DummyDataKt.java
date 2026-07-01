package com.huawei.digitalpayment.consumer.fixeddata.domain.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"sampleWifiList", "", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/WifiUiModel;", "getSampleWifiList", "()Ljava/util/List;", "ConsumerSfcFixedData_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DummyDataKt {
    private static final List<WifiUiModel> ShareDataUIState = CollectionsKt.listOf((Object[]) new WifiUiModel[]{new WifiUiModel("Home-Fiber-2.4G", "InternetGatewayDevice.LANDevice.1.WLANConfiguration.1.SSID", true), new WifiUiModel("Home-Fiber-5G", "InternetGatewayDevice.LANDevice.1.WLANConfiguration.5.SSID", false)});
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    public static final List<WifiUiModel> getSampleWifiList() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 29;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        List<WifiUiModel> list = ShareDataUIState;
        int i5 = i2 + 69;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    static {
        int i = copydefault + 49;
        component1 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
