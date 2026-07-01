package com.huawei.digitalpayment.consumer.baselib.session;

import android.R;
import android.app.Activity;
import android.view.ViewGroup;
import com.blankj.utilcode.util.ThreadUtils;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.util.L;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.baselib.constants.SPConstant;
import com.huawei.digitalpayment.consumer.baselib.init.TokenHelper;
import com.huawei.digitalpayment.consumer.baselib.service.ILoginService;

public final class SessionOutManager implements Runnable {
    private static final SessionOutManager ShareDataUIState = new SessionOutManager();
    private static int component2 = 1;
    private static int component3 = 0;
    private static final String copydefault = "SessionOutManager";
    private static int equals = 1;
    private static int getAsAtTimestamp;
    private SessionManagerView component1;

    static {
        int i = component2 + 13;
        component3 = i % 128;
        int i2 = i % 2;
    }

    private SessionOutManager() {
    }

    public static SessionOutManager getInstance() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 49;
        equals = i3 % 128;
        int i4 = i3 % 2;
        SessionOutManager sessionOutManager = ShareDataUIState;
        int i5 = i2 + 19;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return sessionOutManager;
        }
        throw null;
    }

    @Override
    public void run() {
        int i = 2 % 2;
        L.d(copydefault, "计时结束 用户是否已登录: " + ((ILoginService) RouteUtils.getService(ILoginService.class)).isLogin());
        L.d(copydefault, "计时结束，自动登出到PIN页面");
        if (((ILoginService) RouteUtils.getService(ILoginService.class)).isLogin()) {
            int i2 = getAsAtTimestamp + 11;
            equals = i2 % 128;
            int i3 = i2 % 2;
            TokenHelper.INSTANCE.clearToken();
            SPUtils.getInstance().put(SPConstant.LOGOUT2PIN, true);
            RouteUtils.routeWithExecute(RoutePathConstants.PIN_LOGIN);
            int i4 = equals + 63;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public void onActivityResumed(Activity activity) {
        int i = 2 % 2;
        int i2 = equals + 79;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            onUserInteraction();
            if (this.component1 == null) {
                this.component1 = new SessionManagerView(activity.getApplicationContext());
            }
            ViewGroup viewGroup = (ViewGroup) this.component1.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.component1);
            }
            ((ViewGroup) activity.findViewById(R.id.content)).addView(this.component1, new ViewGroup.LayoutParams(-1, -1));
            int i3 = equals + 87;
            getAsAtTimestamp = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        onUserInteraction();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onUserInteraction() {
        int i = 2 % 2;
        boolean zIsLogin = ((ILoginService) RouteUtils.getService(ILoginService.class)).isLogin();
        L.d(copydefault, "onUserInteraction: " + zIsLogin);
        if (!(!zIsLogin)) {
            int i2 = equals + 115;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            startTimer();
        }
        int i4 = equals + 75;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    public void startTimer() {
        int i = 2 % 2;
        stopTimer();
        L.d(copydefault, "用户已登录，开始计时 " + getSessionTimeout());
        ThreadUtils.runOnUiThreadDelayed(this, getSessionTimeout() * 1000);
        int i2 = getAsAtTimestamp + 123;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    public void stopTimer() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 105;
        equals = i2 % 128;
        int i3 = i2 % 2;
        L.d(copydefault, "停止上次计时: ");
        ThreadUtils.getMainHandler().removeCallbacks(this);
        int i4 = getAsAtTimestamp + 11;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    public static long getSessionTimeout() {
        int i = 2 % 2;
        int i2 = equals + 19;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        try {
            long j = Long.parseLong(SPUtils.getInstance(AppConfigManager.SP_APP).getString(AppConfigManager.SESSION_TIME_OUT_SECOND));
            int i4 = equals + 13;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 42 / 0;
            }
            return j;
        } catch (NumberFormatException unused) {
            return AppConfigManager.getAppConfig().getSessionOutTimeSecond();
        }
    }
}
