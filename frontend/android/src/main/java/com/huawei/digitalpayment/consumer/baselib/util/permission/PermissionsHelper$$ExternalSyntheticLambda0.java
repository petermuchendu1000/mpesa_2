package com.huawei.digitalpayment.consumer.baselib.util.permission;

import com.huawei.common.util.permission.IPermissionListenerWrap;
import com.huawei.digitalpayment.consumer.baselib.util.permission.IPermissionListenerWrap;

public final class PermissionsHelper$$ExternalSyntheticLambda0 implements IPermissionListenerWrap.IPermissionListener {
    private static int component3 = 0;
    private static int copydefault = 1;
    public final IPermissionListenerWrap.IPermissionListener f$0;

    @Override
    public final void onAccepted(boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 37;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.f$0.onAccepted(z);
        int i4 = component3 + 57;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }
}
