package com.huawei.digitalpayment.consumer.sfcui.ui.activity;

import com.huawei.digitalpayment.consumer.sfcui.ui.resp.UserScopeResp;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/activity/UserscopesCallback;", "", "kycAllowed", "", "userScopeResp", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/UserScopeResp;", "kycRejected", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface UserscopesCallback {
    void kycAllowed(UserScopeResp userScopeResp);

    void kycRejected();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        private static int ShareDataUIState = 1;
        private static int component3;

        public static void kycAllowed$default(UserscopesCallback userscopesCallback, UserScopeResp userScopeResp, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 93;
            int i4 = i3 % 128;
            component3 = i4;
            int i5 = i3 % 2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: kycAllowed");
            }
            int i6 = i4 + 95;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 != 0 && (i & 1) != 0) {
                userScopeResp = null;
            }
            userscopesCallback.kycAllowed(userScopeResp);
        }
    }
}
