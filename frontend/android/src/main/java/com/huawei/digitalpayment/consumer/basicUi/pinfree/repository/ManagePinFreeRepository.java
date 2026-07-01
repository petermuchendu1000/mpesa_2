package com.huawei.digitalpayment.consumer.basicUi.pinfree.repository;

import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.baselib.util.AmountUtils;
import com.huawei.http.BaseResp;

public class ManagePinFreeRepository extends PaymentRequest<BaseResp> {
    private static int ShareDataUIState = 1;
    private static int component3;

    public ManagePinFreeRepository(String str, String str2, String str3) {
        addParams("initiatorPin", str3);
        addParams("pinVersion", AppConfigManager.getAppConfig().getPinKeyVersion());
        addParams(KeysConstants.KEY_PIN_FREE_STATUS, str);
        addParams(KeysConstants.KEY_PIN_FREE_AMOUNT, AmountUtils.INSTANCE.formatAmount(str2));
    }

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 77;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 16 / 0;
        }
        int i5 = i2 + 47;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return "managePinFreePayment";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
