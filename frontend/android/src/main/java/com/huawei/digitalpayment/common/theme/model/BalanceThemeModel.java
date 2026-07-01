package com.huawei.digitalpayment.common.theme.model;

import com.google.gson.JsonObject;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SecureGsonUtils;
import com.huawei.digitalpayment.common.theme.data.BalanceResp;
import com.huawei.digitalpayment.common.theme.data.CommissionResp;
import com.huawei.digitalpayment.common.theme.data.QueryMultiBalanceResp;
import com.huawei.digitalpayment.common.theme.request.params.BalanceRequestParams;
import com.huawei.digitalpayment.common.theme.request.params.ChangeCurrencyParams;
import com.huawei.digitalpayment.common.theme.request.params.CommissionRequestParams;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.http.BaseRequestParams;
import com.huawei.http.BaseResp;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0016J \u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\f2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\tH\u0016J \u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000f2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\tH\u0016J \u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00122\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\tH\u0016¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/model/BalanceThemeModel;", "Lcom/huawei/digitalpayment/common/theme/model/IThemeBalanceModel;", "<init>", "()V", "refreshBalance", "", "params", "Lcom/huawei/digitalpayment/common/theme/request/params/BalanceRequestParams;", "callback", "Lcom/huawei/common/listener/ApiCallback;", "Lcom/huawei/digitalpayment/common/theme/data/BalanceResp;", "refreshCommission", "Lcom/huawei/digitalpayment/common/theme/request/params/CommissionRequestParams;", "Lcom/huawei/digitalpayment/common/theme/data/CommissionResp;", "changeCurrency", "Lcom/huawei/digitalpayment/common/theme/request/params/ChangeCurrencyParams;", "Lcom/huawei/http/BaseResp;", "queryMultiBalance", "Lcom/huawei/http/BaseRequestParams;", "Lcom/huawei/digitalpayment/common/theme/data/QueryMultiBalanceResp;", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class BalanceThemeModel implements IThemeBalanceModel {
    private static int component1 = 1;
    private static int copydefault;

    @Inject
    public BalanceThemeModel() {
    }

    @Override
    public void refreshBalance(BalanceRequestParams params, ApiCallback<BalanceResp> callback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        sendRequest(new PaymentRequest<BalanceResp>(params) {
            private static int component1 = 1;
            private static int component3;

            {
                super("queryBalance", params);
            }

            @Override
            public Object convert(JsonObject jsonObject) {
                int i2 = 2 % 2;
                int i3 = component3 + 85;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                BalanceResp balanceRespConvert = convert(jsonObject);
                int i5 = component3 + 55;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 64 / 0;
                }
                return balanceRespConvert;
            }

            @Override
            public BalanceResp convert(JsonObject origin) {
                int i2 = 2 % 2;
                int i3 = component3 + 85;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(origin, "");
                BalanceResp balanceResp = (BalanceResp) SecureGsonUtils.fromJson(origin.toString(), BalanceResp.class);
                if (balanceResp != null) {
                    return balanceResp;
                }
                BalanceResp balanceResp2 = new BalanceResp(null, null, null, null, null, 31, null);
                int i5 = component1 + 7;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                return balanceResp2;
            }
        }, callback);
        int i2 = component1 + 49;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override
    public void refreshCommission(CommissionRequestParams params, ApiCallback<CommissionResp> callback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        sendRequest(new PaymentRequest<CommissionResp>(params) {
            private static int component2 = 1;
            private static int component3;

            @Override
            public Object convert(JsonObject jsonObject) {
                int i2 = 2 % 2;
                int i3 = component3 + 89;
                component2 = i3 % 128;
                if (i3 % 2 != 0) {
                    return convert(jsonObject);
                }
                convert(jsonObject);
                throw null;
            }

            {
                super("queryTotalCommission", params);
            }

            @Override
            public CommissionResp convert(JsonObject origin) {
                int i2 = 2 % 2;
                int i3 = component3 + 45;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(origin, "");
                CommissionResp commissionResp = (CommissionResp) SecureGsonUtils.fromJson(origin.toString(), CommissionResp.class);
                if (commissionResp == null) {
                    commissionResp = new CommissionResp(null, null, null, null, null, 31, null);
                }
                int i5 = component2 + 31;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    return commissionResp;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, callback);
        int i2 = component1 + 51;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void changeCurrency(ChangeCurrencyParams params, ApiCallback<BaseResp> callback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        sendRequest(new PaymentRequest<BaseResp>(params) {
            {
                super("staff/changeCurrency", params);
            }
        }, callback);
        int i2 = copydefault + 31;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void queryMultiBalance(BaseRequestParams params, ApiCallback<QueryMultiBalanceResp> callback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        sendRequest(new PaymentRequest<QueryMultiBalanceResp>(params) {
        }, callback);
        int i2 = component1 + 99;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
