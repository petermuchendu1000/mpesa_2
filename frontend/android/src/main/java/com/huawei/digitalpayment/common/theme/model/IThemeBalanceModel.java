package com.huawei.digitalpayment.common.theme.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.common.theme.data.BalanceResp;
import com.huawei.digitalpayment.common.theme.data.CommissionResp;
import com.huawei.digitalpayment.common.theme.data.QueryMultiBalanceResp;
import com.huawei.digitalpayment.common.theme.request.params.BalanceRequestParams;
import com.huawei.digitalpayment.common.theme.request.params.ChangeCurrencyParams;
import com.huawei.digitalpayment.common.theme.request.params.CommissionRequestParams;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.http.BaseRequestParams;
import com.huawei.http.BaseResp;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H&J \u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\n2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007H&J \u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\r2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007H&J \u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00102\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0007H&¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/model/IThemeBalanceModel;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "refreshBalance", "", "params", "Lcom/huawei/digitalpayment/common/theme/request/params/BalanceRequestParams;", "callback", "Lcom/huawei/common/listener/ApiCallback;", "Lcom/huawei/digitalpayment/common/theme/data/BalanceResp;", "refreshCommission", "Lcom/huawei/digitalpayment/common/theme/request/params/CommissionRequestParams;", "Lcom/huawei/digitalpayment/common/theme/data/CommissionResp;", "changeCurrency", "Lcom/huawei/digitalpayment/common/theme/request/params/ChangeCurrencyParams;", "Lcom/huawei/http/BaseResp;", "queryMultiBalance", "Lcom/huawei/http/BaseRequestParams;", "Lcom/huawei/digitalpayment/common/theme/data/QueryMultiBalanceResp;", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface IThemeBalanceModel extends BaseModel {
    void changeCurrency(ChangeCurrencyParams params, ApiCallback<BaseResp> callback);

    void queryMultiBalance(BaseRequestParams params, ApiCallback<QueryMultiBalanceResp> callback);

    void refreshBalance(BalanceRequestParams params, ApiCallback<BalanceResp> callback);

    void refreshCommission(CommissionRequestParams params, ApiCallback<CommissionResp> callback);
}
