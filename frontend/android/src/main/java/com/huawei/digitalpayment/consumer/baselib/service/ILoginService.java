package com.huawei.digitalpayment.consumer.baselib.service;

import android.app.Activity;
import com.huawei.common.listener.ApiCallback;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bH&J\"\u0010\u0006\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\n2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bH&J\u0018\u0010\u000b\u001a\u00020\u00052\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bH&J\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016¨\u0006\u000e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/service/ILoginService;", "", "isLogin", "", "logout", "", "resetPin", "callback", "Lcom/huawei/common/listener/ApiCallback;", "activity", "Landroid/app/Activity;", "inactiveResetPin", "dealResetPinSuccessResult", "dealInactiveResetPinSuccessResult", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ILoginService {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        private static int component1 = 0;
        private static int copydefault = 1;

        public static boolean dealInactiveResetPinSuccessResult(ILoginService iLoginService) {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 81;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 71;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static boolean dealResetPinSuccessResult(ILoginService iLoginService) {
            int i = 2 % 2;
            int i2 = component1 + 91;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 11;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 92 / 0;
            }
            return false;
        }
    }

    boolean dealInactiveResetPinSuccessResult();

    boolean dealResetPinSuccessResult();

    void inactiveResetPin(ApiCallback<Boolean> callback);

    boolean isLogin();

    void logout();

    void resetPin(Activity activity, ApiCallback<Boolean> callback);

    void resetPin(ApiCallback<Boolean> callback);
}
