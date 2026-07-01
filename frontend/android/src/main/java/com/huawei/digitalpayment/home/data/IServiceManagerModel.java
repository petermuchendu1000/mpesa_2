package com.huawei.digitalpayment.home.data;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/home/data/IServiceManagerModel;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "updateMyService", "", "myServiceFunctions", "", "Lcom/huawei/digitalpayment/home/data/source/locaL/LocalHomeFunction;", "callback", "Lcom/huawei/common/listener/ApiCallback;", "", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface IServiceManagerModel extends BaseModel {
    void updateMyService(List<LocalHomeFunction> myServiceFunctions, ApiCallback<Boolean> callback);
}
