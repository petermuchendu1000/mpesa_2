package com.huawei.common.util.permission;

public interface IPermissionListenerWrap {

    public interface IPermissionListener {
        void onAccepted(boolean z);

        default void onException(Throwable th) {
        }
    }
}
