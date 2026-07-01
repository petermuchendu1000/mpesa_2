package com.huawei.digitalpayment.common.theme.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.common.theme.data.HomeThemeResp;
import com.huawei.digitalpayment.common.theme.request.params.ThemePreviewParams;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H&¨\u0006\t"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/model/IThemePreviewModel;", "", "previewTheme", "", "params", "Lcom/huawei/digitalpayment/common/theme/request/params/ThemePreviewParams;", "callback", "Lcom/huawei/common/listener/ApiCallback;", "Lcom/huawei/digitalpayment/common/theme/data/HomeThemeResp;", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface IThemePreviewModel {
    void previewTheme(ThemePreviewParams params, ApiCallback<HomeThemeResp> callback);
}
