package com.huawei.digitalpayment.home.data.source;

import android.content.Context;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.huawei.common.module.UserLifecycle;
import com.huawei.common.util.L;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.home.data.HomeConfigManager;
import com.huawei.digitalpayment.home.util.MyServicesManager;
import com.huawei.digitalpayment.home.viewmodel.BaseBannerViewModel;
import com.huawei.digitalpayment.home.viewmodel.BaseTipsViewModel;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/home/data/source/HomeUserLifecycle;", "Lcom/huawei/common/module/UserLifecycle;", "<init>", "()V", "onAfterLogin", "", "context", "Landroid/content/Context;", KeysConstants.KEY_LOGIN_INFO, "", "isAutoLogin", "", "loginFail", "onLogout", "getPriority", "", "Companion", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HomeUserLifecycle implements UserLifecycle {

    public static final Companion INSTANCE = new Companion(null);
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static final String copydefault = "HomeUserLifecycle";

    @Override
    public void onAfterLogin(Context context, final String loginInfo, boolean isAutoLogin) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(loginInfo, "");
        ThreadUtils.executeByCached(new ThreadUtils.SimpleTask<Void>() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public Object doInBackground() throws Throwable {
                int i2 = 2 % 2;
                int i3 = component1 + 75;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                Void voidDoInBackground = doInBackground();
                int i5 = component1 + 27;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 != 0) {
                    return voidDoInBackground;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public void onSuccess(Object obj) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 75;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess((Void) obj);
                if (i4 != 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                int i5 = component1 + 67;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public Void doInBackground() throws Throwable {
                String string;
                int i2 = 2 % 2;
                try {
                    JSONObject jSONObjectOptJSONObject = new JSONObject(loginInfo).optJSONObject("homeConfig");
                    HomeConfigManager homeConfigManager = HomeConfigManager.INSTANCE;
                    if (jSONObjectOptJSONObject != null) {
                        int i3 = ShareDataUIState + 13;
                        component1 = i3 % 128;
                        if (i3 % 2 != 0) {
                            string = jSONObjectOptJSONObject.toString();
                            int i4 = 48 / 0;
                        } else {
                            string = jSONObjectOptJSONObject.toString();
                        }
                    } else {
                        string = null;
                    }
                    homeConfigManager.saveHomeConfig(string);
                    int i5 = ShareDataUIState + 29;
                    component1 = i5 % 128;
                    int i6 = i5 % 2;
                } catch (Exception e) {
                    L.e(HomeUserLifecycle.copydefault, "home menu init error: " + e.getMessage());
                }
                MyServicesManager.INSTANCE.reset();
                return null;
            }

            public void onSuccess(Void result) {
                int i2 = 2 % 2;
                int i3 = component1 + 125;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
            }
        });
        int i2 = ShareDataUIState + 13;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void onLogout(Context context) {
        int i = 2 % 2;
        int i2 = component1 + 3;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            SPUtils.getInstance("homeModuleNoCache").clear();
            BaseBannerViewModel.INSTANCE.setHomeBanner(CollectionsKt.emptyList());
            BaseTipsViewModel.INSTANCE.setTips(CollectionsKt.emptyList());
            MyServicesManager.INSTANCE.reset();
            return;
        }
        Intrinsics.checkNotNullParameter(context, "");
        SPUtils.getInstance("homeModuleNoCache").clear();
        BaseBannerViewModel.INSTANCE.setHomeBanner(CollectionsKt.emptyList());
        BaseTipsViewModel.INSTANCE.setTips(CollectionsKt.emptyList());
        MyServicesManager.INSTANCE.reset();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component3 + 41;
        component2 = i % 128;
        int i2 = i % 2;
    }

    @Override
    public int getPriority() {
        int i = 2 % 2;
        int i2 = component1 + 89;
        ShareDataUIState = i2 % 128;
        return i2 % 2 == 0 ? 5950 : 9999;
    }

    @Override
    public void loginFail(Context context, boolean isAutoLogin) {
        int i = 2 % 2;
        int i2 = component1 + 51;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        if (i3 == 0) {
            throw null;
        }
        int i4 = ShareDataUIState + 109;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/home/data/source/HomeUserLifecycle$Companion;", "", "<init>", "()V", "TAG", "", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
