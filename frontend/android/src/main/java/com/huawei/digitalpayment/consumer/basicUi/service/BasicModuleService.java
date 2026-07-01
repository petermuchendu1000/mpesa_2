package com.huawei.digitalpayment.consumer.basicUi.service;

import com.huawei.common.language.LanguageUtils;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.basicUi.request.ChangeLangRequest;
import com.huawei.digitalpayment.consumer.service.IBasicModuleService;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/huawei/digitalpayment/consumer/basicUi/service/BasicModuleService;", "Lcom/huawei/digitalpayment/consumer/service/IBasicModuleService;", "<init>", "()V", "changeLanguage", "", "callbacks", "Lcom/huawei/common/listener/ApiCallback;", "Lcom/huawei/http/BaseResp;", "ConsumerBasicUiModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class BasicModuleService implements IBasicModuleService {
    private static int component3 = 0;
    private static int copydefault = 1;

    @Override
    public void changeLanguage(ApiCallback<BaseResp> callbacks) {
        int i = 2 % 2;
        String currentLang = LanguageUtils.getInstance().getCurrentLang();
        Intrinsics.checkNotNullExpressionValue(currentLang, "");
        String string = SPUtils.getInstance().getString("recent_login_phone_number");
        Intrinsics.checkNotNullExpressionValue(string, "");
        ChangeLangRequest changeLangRequest = new ChangeLangRequest(currentLang, string);
        PaymentRequest<BaseResp> paymentRequest = new PaymentRequest<BaseResp>() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component3 + 67;
                copydefault = i3 % 128;
                if (i3 % 2 != 0) {
                    return "changeLanguage";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        paymentRequest.addParams(changeLangRequest);
        paymentRequest.sendRequest(callbacks);
        int i2 = copydefault + 107;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }
}
