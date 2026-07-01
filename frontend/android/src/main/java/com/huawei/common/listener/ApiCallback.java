package com.huawei.common.listener;

import com.huawei.common.exception.BaseException;

public interface ApiCallback<T> {
    default void onComplete() {
    }

    default void onError(BaseException baseException) {
    }

    default void onLoading(T t) {
    }

    default void onSuccess(T t) {
    }
}
