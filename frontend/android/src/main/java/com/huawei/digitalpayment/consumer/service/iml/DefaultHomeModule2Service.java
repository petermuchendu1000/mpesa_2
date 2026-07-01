package com.huawei.digitalpayment.consumer.service.iml;

import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.service.IHomeModule2Service;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/service/iml/DefaultHomeModule2Service;", "Lcom/huawei/digitalpayment/consumer/service/IHomeModule2Service;", "<init>", "()V", "refreshTheme", "", KeysConstants.KEY_LOGIN_INFO, "", "ServiceModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultHomeModule2Service implements IHomeModule2Service {
    private static int ShareDataUIState = 1;
    private static int component1;

    @Override
    public String getMiniAppIconById(String str, String str2, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 45;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            IHomeModule2Service.DefaultImpls.getMiniAppIconById(this, str, str2, z);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String miniAppIconById = IHomeModule2Service.DefaultImpls.getMiniAppIconById(this, str, str2, z);
        int i3 = ShareDataUIState + 41;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return miniAppIconById;
    }

    @Override
    public String getMiniAppNameById(String str, String str2) {
        int i = 2 % 2;
        int i2 = component1 + 91;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String miniAppNameById = IHomeModule2Service.DefaultImpls.getMiniAppNameById(this, str, str2);
        if (i3 == 0) {
            int i4 = 41 / 0;
        }
        return miniAppNameById;
    }

    @Override
    public void refreshBalance() {
        int i = 2 % 2;
        int i2 = component1 + 65;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        IHomeModule2Service.DefaultImpls.refreshBalance(this);
        int i4 = component1 + 3;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void refreshTheme(String loginInfo) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 19;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }
}
