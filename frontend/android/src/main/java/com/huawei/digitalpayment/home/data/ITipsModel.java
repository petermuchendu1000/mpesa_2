package com.huawei.digitalpayment.home.data;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.home.data.source.locaL.LocalHomeTips;
import com.huawei.http.BaseRequestParams;
import java.util.List;

public interface ITipsModel extends BaseModel {
    void getTips(BaseRequestParams baseRequestParams, ApiCallback<List<LocalHomeTips>> apiCallback);
}
