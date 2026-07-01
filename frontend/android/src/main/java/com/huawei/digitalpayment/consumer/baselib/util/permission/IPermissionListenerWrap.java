package com.huawei.digitalpayment.consumer.baselib.util.permission;

public interface IPermissionListenerWrap {

    public interface IPermissionListener {
        void onAccepted(boolean z);

        default void onException(Throwable th) {
            int i = 2 % 2;
        }
    }
}
