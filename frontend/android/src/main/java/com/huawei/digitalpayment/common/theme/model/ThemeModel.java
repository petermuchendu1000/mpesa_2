package com.huawei.digitalpayment.common.theme.model;

import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.L;
import com.huawei.digitalpayment.common.theme.ThemeManager;
import com.huawei.digitalpayment.common.theme.data.HomeThemeResp;
import com.huawei.digitalpayment.common.theme.data.ThemeChangeSkinResp;
import com.huawei.digitalpayment.common.theme.data.ThemeQuerySkinResp;
import com.huawei.digitalpayment.common.theme.model.IThemeModel;
import com.huawei.digitalpayment.common.theme.request.ThemeDetailRequest;
import com.huawei.digitalpayment.common.theme.request.params.LocationReportParams;
import com.huawei.digitalpayment.common.theme.request.params.ThemeDetailParams;
import com.huawei.digitalpayment.common.theme.request.params.ThemeQuerySkinParams;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.http.BaseResp;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0016J \u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\f2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\tH\u0016J(\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\f2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\rH\u0002¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/model/ThemeModel;", "Lcom/huawei/digitalpayment/common/theme/model/IThemeModel;", "<init>", "()V", "userSwitchableList", "", "params", "Lcom/huawei/digitalpayment/common/theme/request/params/ThemeQuerySkinParams;", "callback", "Lcom/huawei/common/listener/ApiCallback;", "Lcom/huawei/digitalpayment/common/theme/data/ThemeQuerySkinResp;", "switchTheme", "Lcom/huawei/digitalpayment/common/theme/request/params/ThemeDetailParams;", "Lcom/huawei/digitalpayment/common/theme/data/ThemeChangeSkinResp;", "getThemeDetail", "changeSkinResp", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ThemeModel implements IThemeModel {
    private static int component1 = 0;
    private static int copydefault = 1;

    @Inject
    public ThemeModel() {
    }

    public static final void access$getThemeDetail(ThemeModel themeModel, ThemeDetailParams themeDetailParams, ApiCallback apiCallback, ThemeChangeSkinResp themeChangeSkinResp) {
        int i = 2 % 2;
        int i2 = copydefault + 57;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        themeModel.ShareDataUIState(themeDetailParams, apiCallback, themeChangeSkinResp);
        int i4 = component1 + 27;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void locationReport(LocationReportParams locationReportParams, ApiCallback<BaseResp> apiCallback) {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        IThemeModel.DefaultImpls.locationReport(this, locationReportParams, apiCallback);
        int i4 = component1 + 19;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void userSwitchableList(ThemeQuerySkinParams params, ApiCallback<ThemeQuerySkinResp> callback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        PaymentRequest<ThemeQuerySkinResp> paymentRequest = new PaymentRequest<ThemeQuerySkinResp>() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component3;
                int i4 = i3 + 11;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = i3 + 7;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 41 / 0;
                }
                return "theme/userSwitchablelist";
            }
        };
        paymentRequest.addParams(params);
        sendRequest(paymentRequest, callback);
        int i2 = component1 + 7;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void switchTheme(final ThemeDetailParams params, final ApiCallback<ThemeChangeSkinResp> callback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        PaymentRequest<ThemeChangeSkinResp> paymentRequest = new PaymentRequest<ThemeChangeSkinResp>() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component1 + 7;
                component3 = i3 % 128;
                if (i3 % 2 != 0) {
                    return "theme/switchTheme";
                }
                throw null;
            }
        };
        paymentRequest.addParams("themeId", params.getThemeId());
        paymentRequest.addParams("themeVersion", String.valueOf(params.getThemeVersion()));
        sendRequest(paymentRequest, new ApiCallback<ThemeChangeSkinResp>() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(ThemeChangeSkinResp themeChangeSkinResp) {
                int i2 = 2 % 2;
                int i3 = copydefault + 95;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(themeChangeSkinResp);
                int i5 = copydefault + 119;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }

            public void onSuccess2(ThemeChangeSkinResp value) {
                int i2 = 2 % 2;
                int i3 = copydefault + 61;
                component2 = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(value, "");
                    ThemeModel.access$getThemeDetail(ThemeModel.this, params, callback, value);
                } else {
                    Intrinsics.checkNotNullParameter(value, "");
                    ThemeModel.access$getThemeDetail(ThemeModel.this, params, callback, value);
                    throw null;
                }
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                ApiCallback<ThemeChangeSkinResp> apiCallback = callback;
                if (apiCallback != null) {
                    int i3 = copydefault + 27;
                    component2 = i3 % 128;
                    int i4 = i3 % 2;
                    apiCallback.onError(e);
                    int i5 = component2 + 33;
                    copydefault = i5 % 128;
                    int i6 = i5 % 2;
                }
            }
        });
        int i2 = component1 + 107;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void ShareDataUIState(final ThemeDetailParams themeDetailParams, final ApiCallback<ThemeChangeSkinResp> apiCallback, final ThemeChangeSkinResp themeChangeSkinResp) {
        int i = 2 % 2;
        new ThemeDetailRequest(themeDetailParams).sendRequest(new ApiCallback<HomeThemeResp>() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(HomeThemeResp homeThemeResp) {
                int i2 = 2 % 2;
                int i3 = component3 + 5;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(homeThemeResp);
                if (i4 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = component3 + 63;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }

            public void onSuccess2(HomeThemeResp value) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(value, "");
                L.d("主题包下载成功->" + System.currentTimeMillis());
                ThemeManager.INSTANCE.getThemeInterface().saveThemeInfo(themeDetailParams);
                ThemeManager.INSTANCE.updateTheme(value);
                ApiCallback<ThemeChangeSkinResp> apiCallback2 = apiCallback;
                if (apiCallback2 != null) {
                    int i3 = ShareDataUIState + 109;
                    component3 = i3 % 128;
                    int i4 = i3 % 2;
                    apiCallback2.onSuccess(themeChangeSkinResp);
                    if (i4 == 0) {
                        int i5 = 75 / 0;
                    }
                }
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                ApiCallback<ThemeChangeSkinResp> apiCallback2 = apiCallback;
                if (apiCallback2 != null) {
                    int i3 = ShareDataUIState + 37;
                    component3 = i3 % 128;
                    int i4 = i3 % 2;
                    apiCallback2.onError(e);
                    if (i4 == 0) {
                        throw null;
                    }
                    int i5 = component3 + 69;
                    ShareDataUIState = i5 % 128;
                    int i6 = i5 % 2;
                }
                int i7 = ShareDataUIState + 45;
                component3 = i7 % 128;
                if (i7 % 2 == 0) {
                    throw null;
                }
            }
        });
        int i2 = component1 + 105;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }
}
