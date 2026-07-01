package com.huawei.digitalpayment.common.theme.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.common.theme.data.ThemeChangeSkinResp;
import com.huawei.digitalpayment.common.theme.data.ThemeQuerySkinResp;
import com.huawei.digitalpayment.common.theme.request.params.LocationReportParams;
import com.huawei.digitalpayment.common.theme.request.params.ThemeDetailParams;
import com.huawei.digitalpayment.common.theme.request.params.ThemeQuerySkinParams;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H&J \u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\n2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007H&J \u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\r2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007H\u0016¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/model/IThemeModel;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "userSwitchableList", "", "params", "Lcom/huawei/digitalpayment/common/theme/request/params/ThemeQuerySkinParams;", "callback", "Lcom/huawei/common/listener/ApiCallback;", "Lcom/huawei/digitalpayment/common/theme/data/ThemeQuerySkinResp;", "switchTheme", "Lcom/huawei/digitalpayment/common/theme/request/params/ThemeDetailParams;", "Lcom/huawei/digitalpayment/common/theme/data/ThemeChangeSkinResp;", "locationReport", "Lcom/huawei/digitalpayment/common/theme/request/params/LocationReportParams;", "Lcom/huawei/http/BaseResp;", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface IThemeModel extends BaseModel {
    void locationReport(LocationReportParams params, ApiCallback<BaseResp> callback);

    void switchTheme(ThemeDetailParams params, ApiCallback<ThemeChangeSkinResp> callback);

    void userSwitchableList(ThemeQuerySkinParams params, ApiCallback<ThemeQuerySkinResp> callback);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;

        public static void locationReport(IThemeModel iThemeModel, LocationReportParams locationReportParams, ApiCallback<BaseResp> apiCallback) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(locationReportParams, "");
            PaymentRequest<BaseResp> paymentRequest = new PaymentRequest<BaseResp>() {
                private static int component1 = 1;
                private static int component3;

                @Override
                public String getApiPath() {
                    int i2 = 2 % 2;
                    int i3 = component3 + 101;
                    int i4 = i3 % 128;
                    component1 = i4;
                    int i5 = i3 % 2;
                    int i6 = i4 + 15;
                    component3 = i6 % 128;
                    int i7 = i6 % 2;
                    return "identityLocation";
                }
            };
            paymentRequest.addParams(locationReportParams);
            iThemeModel.sendRequest(paymentRequest, apiCallback);
            int i2 = ShareDataUIState + 51;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
        }
    }
}
