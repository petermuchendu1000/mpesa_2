package com.huawei.digitalpayment.consumer.sfcui.profile.pinmanage.security;

import androidx.fragment.app.FragmentActivity;
import com.huawei.digitalpayment.consumer.base.service.ISecurityServer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/pinmanage/security/SecurityServerIml;", "Lcom/huawei/digitalpayment/consumer/base/service/ISecurityServer;", "<init>", "()V", "checkSecurityQuestion", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SecurityServerIml implements ISecurityServer {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component3 = 1;
    private static int copydefault;

    @Override
    public void checkSecurityQuestion(FragmentActivity activity) {
        int i = 2 % 2;
        int i2 = component3 + 113;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(activity, "");
            SecurityUtils.INSTANCE.checkSecurityQuestion(activity);
        } else {
            Intrinsics.checkNotNullParameter(activity, "");
            SecurityUtils.INSTANCE.checkSecurityQuestion(activity);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = 1 + 69;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }
}
