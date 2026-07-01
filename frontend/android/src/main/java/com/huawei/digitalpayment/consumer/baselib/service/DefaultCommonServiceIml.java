package com.huawei.digitalpayment.consumer.baselib.service;

import androidx.fragment.app.FragmentActivity;
import com.huawei.common.exception.BaseException;
import com.huawei.digitalpayment.consumer.baselib.service.ICommonService;
import com.huawei.digitalpayment.consumer.baselib.webview.BaseWebViewClient;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/service/DefaultCommonServiceIml;", "Lcom/huawei/digitalpayment/consumer/baselib/service/ICommonService;", "<init>", "()V", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultCommonServiceIml implements ICommonService {
    private static int component1 = 1;
    private static int component3;

    @Override
    public boolean dealError(FragmentActivity fragmentActivity, BaseException baseException) {
        int i = 2 % 2;
        int i2 = component3 + 23;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        boolean zDealError = ICommonService.DefaultImpls.dealError(this, fragmentActivity, baseException);
        int i4 = component1 + 47;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 57 / 0;
        }
        return zDealError;
    }

    @Override
    public BaseWebViewClient getWebViewClient(String[] strArr, BaseWebViewClient.OnReceivedErrorListener onReceivedErrorListener) {
        int i = 2 % 2;
        int i2 = component3 + 69;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        BaseWebViewClient webViewClient = ICommonService.DefaultImpls.getWebViewClient(this, strArr, onReceivedErrorListener);
        if (i3 == 0) {
            int i4 = 24 / 0;
        }
        int i5 = component3 + 13;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return webViewClient;
    }
}
