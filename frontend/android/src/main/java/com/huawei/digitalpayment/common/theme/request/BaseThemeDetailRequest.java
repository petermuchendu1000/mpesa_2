package com.huawei.digitalpayment.common.theme.request;

import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.common.theme.constants.ThemeConstants;
import com.huawei.digitalpayment.common.theme.request.params.QueryI18nResourceParams;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/request/BaseThemeDetailRequest;", "TransferResponse", "Lcom/huawei/digitalpayment/consumer/baselib/http/PaymentRequest;", "<init>", "()V", "getI18nResource", "", "themeId", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class BaseThemeDetailRequest<TransferResponse> extends PaymentRequest<TransferResponse> {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;

    public String getI18nResource(String themeId) {
        int i = 2 % 2;
        String str = themeId;
        if (str == null) {
            return null;
        }
        int i2 = ShareDataUIState + 97;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            str.length();
            throw null;
        }
        if (str.length() != 0) {
            try {
                return new ThemeI18nResourceRequest(SPUtils.getInstance(ThemeConstants.SP_NAME).getString(themeId, null), new QueryI18nResourceParams(null, themeId, 1, null)).sendSyncRequest();
            } catch (Exception unused) {
                return null;
            }
        }
        int i3 = copydefault + 37;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }
}
