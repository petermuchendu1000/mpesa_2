package com.huawei.digitalpayment.consumer.nfc;

import com.huawei.digitalpayment.consumer.base.service.INfcServer;
import com.huawei.digitalpayment.consumer.nfc.utils.NfcUtils;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/nfc/NfcServerIml;", "Lcom/huawei/digitalpayment/consumer/base/service/INfcServer;", "<init>", "()V", "checkNfc", "", "ConsumerNfcUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NfcServerIml implements INfcServer {
    private static int component1 = 1;
    private static int component2;

    @Override
    public void checkNfc() {
        int i = 2 % 2;
        int i2 = component1 + 69;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            NfcUtils.INSTANCE.startNfc();
            throw null;
        }
        NfcUtils.INSTANCE.startNfc();
        int i3 = component2 + 57;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }
}
