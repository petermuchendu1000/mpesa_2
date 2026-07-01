package com.huawei.digitalpayment.consumer.base.session;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.blankj.utilcode.util.ThreadUtils;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.constants.SPConstant;
import com.huawei.digitalpayment.consumer.baselib.init.TokenHelper;
import com.huawei.digitalpayment.consumer.baselib.service.ILoginService;
import com.safaricom.mpesa.logging.L;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\fJ\u0006\u0010\u0010\u001a\u00020\fJ\b\u0010\u0011\u001a\u00020\fH\u0002J\b\u0010\u0012\u001a\u00020\fH\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/session/SFCSessionOutManager;", "Ljava/lang/Runnable;", "<init>", "()V", "sessionManagerView", "Lcom/huawei/digitalpayment/consumer/base/session/SfcSessionManagerView;", "isMiniApp", "", "()Z", "setMiniApp", "(Z)V", "onActivityResumed", "", "activity", "Landroid/app/Activity;", "onUserInteraction", "startTimer", "stopTimer", "run", "getSessionTimeout", "", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SFCSessionOutManager implements Runnable {
    public static final SFCSessionOutManager INSTANCE = new SFCSessionOutManager();
    private static boolean ShareDataUIState = false;
    private static int component1 = 1;
    private static SfcSessionManagerView component2 = null;
    private static int component3 = 0;
    private static int copydefault = 0;
    private static int getRequestBeneficiariesState = 1;

    private SFCSessionOutManager() {
    }

    public final boolean isMiniApp() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 27;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        boolean z = ShareDataUIState;
        int i5 = i3 + 115;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final void setMiniApp(boolean z) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 121;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        ShareDataUIState = z;
        if (i4 != 0) {
            int i5 = 0 / 0;
        }
        int i6 = i2 + 119;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void onActivityResumed(Activity activity) {
        ViewParent parent;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        onUserInteraction();
        if (component2 == null) {
            Context applicationContext = activity.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            component2 = new SfcSessionManagerView(applicationContext);
        }
        SfcSessionManagerView sfcSessionManagerView = component2;
        Object obj = null;
        if (sfcSessionManagerView != null) {
            int i2 = copydefault + 45;
            getRequestBeneficiariesState = i2 % 128;
            if (i2 % 2 == 0) {
                parent = sfcSessionManagerView.getParent();
                int i3 = 59 / 0;
            } else {
                parent = sfcSessionManagerView.getParent();
            }
        } else {
            parent = null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        if (viewGroup != null) {
            int i4 = getRequestBeneficiariesState + 45;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                viewGroup.removeView(component2);
                obj.hashCode();
                throw null;
            }
            viewGroup.removeView(component2);
        }
        View viewFindViewById = activity.findViewById(R.id.content);
        Intrinsics.checkNotNull(viewFindViewById, "");
        ((ViewGroup) viewFindViewById).addView(component2, new ViewGroup.LayoutParams(-1, -1));
    }

    public final void onUserInteraction() {
        int i = 2 % 2;
        L.INSTANCE.d("SFCSessionOutManager", "Is mini app -> " + ShareDataUIState, new Object[0]);
        if (ShareDataUIState) {
            return;
        }
        boolean zIsLogin = ((ILoginService) RouteUtils.getService(ILoginService.class)).isLogin();
        L.INSTANCE.d("SFCSessionOutManager", "onUserInteraction: " + zIsLogin, new Object[0]);
        if (!zIsLogin) {
            return;
        }
        int i2 = copydefault + 31;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        startTimer();
        if (i3 == 0) {
            throw null;
        }
        int i4 = getRequestBeneficiariesState + 69;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void startTimer() {
        int i = 2 % 2;
        component2();
        L.INSTANCE.d("SFCSessionOutManager", "startTimer " + component3(), new Object[0]);
        ThreadUtils.runOnUiThreadDelayed(this, component3() * 1000);
        int i2 = getRequestBeneficiariesState + 5;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void component2() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 41;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        L.INSTANCE.d("SFCSessionOutManager", "stopTimer: ", new Object[0]);
        ThreadUtils.getMainHandler().removeCallbacks(this);
        int i4 = getRequestBeneficiariesState + 87;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void run() {
        int i = 2 % 2;
        if (!ShareDataUIState) {
            L.INSTANCE.d("SFCSessionOutManager", "stopTimer, isLogin: " + ((ILoginService) RouteUtils.getService(ILoginService.class)).isLogin(), new Object[0]);
            L.INSTANCE.d("SFCSessionOutManager", "stopTimer, logout2PIN", new Object[0]);
            if (((ILoginService) RouteUtils.getService(ILoginService.class)).isLogin()) {
                int i2 = getRequestBeneficiariesState + 113;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                SPUtils.getInstance().put(SPConstant.LOGOUT2PIN, true);
                TokenHelper.INSTANCE.clearToken();
                Object service = RouteUtils.getService(ILoginService.class);
                Intrinsics.checkNotNull(service, "");
                ((ILoginService) service).logout();
            }
        }
        int i4 = copydefault + 63;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    private final long component3() {
        long sessionOutTimeSecond;
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 19;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String string = SPUtils.getInstance(AppConfigManager.SP_APP).getString(AppConfigManager.SESSION_TIME_OUT_SECOND);
        try {
            Intrinsics.checkNotNull(string);
            sessionOutTimeSecond = Long.parseLong(string);
            int i4 = copydefault + 115;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
        } catch (NumberFormatException unused) {
            sessionOutTimeSecond = AppConfigManager.getAppConfig().getSessionOutTimeSecond();
        }
        int i6 = copydefault + 11;
        getRequestBeneficiariesState = i6 % 128;
        if (i6 % 2 != 0) {
            return sessionOutTimeSecond;
        }
        throw null;
    }

    static {
        int i = component1 + 11;
        component3 = i % 128;
        int i2 = i % 2;
    }
}
