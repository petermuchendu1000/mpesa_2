package com.huawei.digitalpayment.home.theme.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.home.request.HomeThemePreviewParams;
import com.huawei.digitalpayment.home.request.HomeThemePreviewRequest;
import com.huawei.digitalpayment.home.theme.data.local.LocalHomeThemeData;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/home/theme/model/ThemePreviewModel;", "Lcom/huawei/digitalpayment/home/theme/model/IThemePreviewModel;", "<init>", "()V", "previewTheme", "", "params", "Lcom/huawei/digitalpayment/home/request/HomeThemePreviewParams;", "callback", "Lcom/huawei/common/listener/ApiCallback;", "Lcom/huawei/digitalpayment/home/theme/data/local/LocalHomeThemeData;", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ThemePreviewModel implements IThemePreviewModel {
    private static int component1 = 0;
    private static int copydefault = 1;

    @Inject
    public ThemePreviewModel() {
    }

    @Override
    public void previewTheme(HomeThemePreviewParams params, ApiCallback<LocalHomeThemeData> callback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        new HomeThemePreviewRequest(params).sendRequest(callback);
        int i2 = copydefault + 35;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }
}
