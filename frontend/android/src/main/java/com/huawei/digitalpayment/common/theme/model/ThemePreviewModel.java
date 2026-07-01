package com.huawei.digitalpayment.common.theme.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.common.theme.data.HomeThemeResp;
import com.huawei.digitalpayment.common.theme.request.ThemePreviewRequest;
import com.huawei.digitalpayment.common.theme.request.params.ThemePreviewParams;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/model/ThemePreviewModel;", "Lcom/huawei/digitalpayment/common/theme/model/IThemePreviewModel;", "<init>", "()V", "previewTheme", "", "params", "Lcom/huawei/digitalpayment/common/theme/request/params/ThemePreviewParams;", "callback", "Lcom/huawei/common/listener/ApiCallback;", "Lcom/huawei/digitalpayment/common/theme/data/HomeThemeResp;", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ThemePreviewModel implements IThemePreviewModel {
    private static int ShareDataUIState = 1;
    private static int copydefault;

    @Inject
    public ThemePreviewModel() {
    }

    @Override
    public void previewTheme(ThemePreviewParams params, ApiCallback<HomeThemeResp> callback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        new ThemePreviewRequest(params).sendRequest(callback);
        int i2 = ShareDataUIState + 69;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }
}
