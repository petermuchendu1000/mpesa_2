package com.huawei.digitalpayment.home.theme.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.home.theme.data.remote.MyServicesResp;
import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH&¨\u0006\r"}, d2 = {"Lcom/huawei/digitalpayment/home/theme/model/IMyServicesModel;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "getMyServices", "", "maxCount", "", "isLightIcon", "", "params", "Lcom/huawei/http/BaseRequestParams;", "callback", "Lcom/huawei/common/listener/ApiCallback;", "Lcom/huawei/digitalpayment/home/theme/data/remote/MyServicesResp;", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface IMyServicesModel extends BaseModel {
    void getMyServices(int maxCount, boolean isLightIcon, BaseRequestParams params, ApiCallback<MyServicesResp> callback);
}
