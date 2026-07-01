package com.huawei.digitalpayment.consumer.loginModule.register.data;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.loginModule.register.model.LocalIdType;
import com.huawei.digitalpayment.consumer.loginModule.register.repository.QueryDataDictRepository;
import com.huawei.digitalpayment.consumer.loginModule.register.util.DataDictMapUtils;
import java.util.ArrayList;
import java.util.List;

public interface QueryIdTypesModel extends BaseModel {
    default void queryIdTypes(ApiCallback<List<LocalIdType>> apiCallback) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(DataDictMapUtils.IDTYPE);
        sendRequest(new QueryDataDictRepository(arrayList), apiCallback);
    }
}
