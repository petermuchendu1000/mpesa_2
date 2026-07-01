package com.huawei.digitalpayment.consumer.baselib.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.http.BaseRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public interface BaseModel {
    public static final List<BaseRequest<?>> repositoryLists = new ArrayList();

    default <T> void sendRequest(BaseRequest<T> baseRequest, ApiCallback<T> apiCallback) throws Throwable {
        int i = 2 % 2;
        baseRequest.sendRequest(apiCallback);
        repositoryLists.add(baseRequest);
    }

    default <V> V sendSyncRequest(BaseRequest<V> baseRequest) throws Exception {
        int i = 2 % 2;
        repositoryLists.add(baseRequest);
        return baseRequest.sendSyncRequest();
    }

    default void cancel() {
        int i = 2 % 2;
        Iterator<BaseRequest<?>> it = repositoryLists.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    default void cancel(BaseRequest<?> baseRequest) {
        int i = 2 % 2;
        if (!repositoryLists.contains(baseRequest)) {
            return;
        }
        baseRequest.cancel();
    }
}
