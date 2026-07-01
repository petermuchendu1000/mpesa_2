package com.huawei.digitalpayment.consumer.sfcui.ui.repository;

import com.huawei.digitalpayment.consumer.base.util.AppFabricRequest;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.loginModule.register.request.RegisterKycParamsKt;
import com.huawei.digitalpayment.consumer.sfcui.ui.resp.UnregisterSendResp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0004H\u0014¨\u0006\t"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/UnregisterSendMoneyRepository;", "Lcom/huawei/digitalpayment/consumer/base/util/AppFabricRequest;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/UnregisterSendResp;", "receiverMsisdn", "", "amount", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getApiPath", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UnregisterSendMoneyRepository extends AppFabricRequest<UnregisterSendResp> {
    public static final int $stable = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;

    public UnregisterSendMoneyRepository(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        addParams("receiverMsisdn", str);
        addParams("appType", RegisterKycParamsKt.REGISTER_CODE);
        addParams("amount", str2);
        addParams("currency", AppConfigManager.getAppConfig().getCurrency());
        addParams("tradeType", "NativeApp");
    }

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 101;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 65;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return "/MiniappToPayment/sendOtherNetwork";
        }
        throw null;
    }

    static {
        int i = 1 + 109;
        component3 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
