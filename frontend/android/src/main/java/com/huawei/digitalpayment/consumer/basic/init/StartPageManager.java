package com.huawei.digitalpayment.consumer.basic.init;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.blankj.utilcode.util.ActivityUtils;
import com.blankj.utilcode.util.Utils;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SecureGsonUtils;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigListener;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.config.BasicConfigRepository;
import com.huawei.digitalpayment.consumer.baselib.constants.SPConstant;
import com.huawei.digitalpayment.consumer.baselib.init.DefaultActivityLifecycleCallbacks;
import com.huawei.digitalpayment.consumer.basic.ui.dialog.AdDialog;
import com.huawei.digitalpayment.consumer.basicUi.response.local.LocalAdInfo;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0002J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\u0013\u001a\u00020\rJ\u000e\u0010\u0014\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/huawei/digitalpayment/consumer/basic/init/StartPageManager;", "", "<init>", "()V", "pendingAdPage", "Lcom/huawei/digitalpayment/consumer/basicUi/response/local/LocalAdInfo;", "getPendingAdPage", "()Lcom/huawei/digitalpayment/consumer/basicUi/response/local/LocalAdInfo;", "setPendingAdPage", "(Lcom/huawei/digitalpayment/consumer/basicUi/response/local/LocalAdInfo;)V", "isShowAdPage", "", "updatePendingAdpage", "", "obj", "showAdPage", "activity", "Landroidx/fragment/app/FragmentActivity;", "setShowAdPage", "onAfterLogin", "refreshAd", "ConsumerBasicUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StartPageManager {
    public static final int $stable;
    public static final StartPageManager INSTANCE = new StartPageManager();
    private static boolean ShareDataUIState = false;
    private static int component1 = 0;
    private static LocalAdInfo component2 = null;
    private static int component3 = 1;
    private static int copydefault = 0;
    private static int equals = 1;

    private StartPageManager() {
    }

    public static final void access$showAdPage(StartPageManager startPageManager, FragmentActivity fragmentActivity) {
        int i = 2 % 2;
        int i2 = copydefault + 51;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        startPageManager.component2(fragmentActivity);
        int i4 = component3 + 99;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final void access$updatePendingAdpage(StartPageManager startPageManager, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 93;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        startPageManager.component2(obj);
        int i4 = copydefault + 13;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final LocalAdInfo getPendingAdPage() {
        int i = 2 % 2;
        int i2 = component3 + 117;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return component2;
        }
        throw null;
    }

    public final void setPendingAdPage(LocalAdInfo localAdInfo) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 41;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        component2 = localAdInfo;
        int i5 = i2 + 35;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    static {
        AppConfigManager.INSTANCE.addConfigListener(new AppConfigListener() {
            private static int component2 = 1;
            private static int component3;

            @Override
            public final void onAppConfig(Object obj) {
                int i = 2 % 2;
                int i2 = component3 + 91;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                StartPageManager.$r8$lambda$Bnj_SmIwhvqvR_H72f5Oe1waG6s(obj);
                if (i3 == 0) {
                    int i4 = 8 / 0;
                }
                int i5 = component3 + 13;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        Utils.getApp().registerActivityLifecycleCallbacks(new DefaultActivityLifecycleCallbacks() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public void onActivityResumed(Activity activity) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(activity, "");
                super.onActivityResumed(activity);
                if (StartPageManager.INSTANCE.getPendingAdPage() != null) {
                    int i2 = component3 + 91;
                    int i3 = i2 % 128;
                    ShareDataUIState = i3;
                    int i4 = i2 % 2;
                    if (activity instanceof FragmentActivity) {
                        int i5 = i3 + 11;
                        component3 = i5 % 128;
                        int i6 = i5 % 2;
                        StartPageManager startPageManager = StartPageManager.INSTANCE;
                        FragmentActivity fragmentActivity = (FragmentActivity) activity;
                        if (i6 != 0) {
                            StartPageManager.access$showAdPage(startPageManager, fragmentActivity);
                        } else {
                            StartPageManager.access$showAdPage(startPageManager, fragmentActivity);
                            int i7 = 66 / 0;
                        }
                    }
                }
            }
        });
        $stable = 8;
        int i = equals + 95;
        component1 = i % 128;
        int i2 = i % 2;
    }

    private static final void component1(Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 65;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        INSTANCE.component2(obj);
        int i4 = copydefault + 51;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void component2(Object obj) {
        int i = 2 % 2;
        try {
            component2 = (LocalAdInfo) SecureGsonUtils.fromJson(new JSONObject(String.valueOf(obj)).optString(SPConstant.START_PAGE_CONFIG), LocalAdInfo.class);
            Activity topActivity = ActivityUtils.getTopActivity();
            Intrinsics.checkNotNull(topActivity, "");
            component2((FragmentActivity) topActivity);
            int i2 = component3 + 73;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 4 / 4;
            }
        } catch (Exception unused) {
        }
    }

    private final void component2(FragmentActivity fragmentActivity) {
        int i = 2 % 2;
        int i2 = copydefault + 81;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            if (ShareDataUIState && component2 != null) {
                int i4 = i3 + 13;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                String name = fragmentActivity.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "");
                if (StringsKt.contains$default((CharSequence) name, (CharSequence) "HomeActivity", false, 2, (Object) null)) {
                    ShareDataUIState = false;
                    AdDialog adDialogBuild = new AdDialog.Builder().params(component2).build();
                    Intrinsics.checkNotNullExpressionValue(adDialogBuild, "");
                    adDialogBuild.show(fragmentActivity.getSupportFragmentManager(), "AdDialog");
                    component2 = null;
                }
            }
            int i6 = copydefault + 121;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        throw null;
    }

    public final void setShowAdPage(boolean isShowAdPage) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 59;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        ShareDataUIState = isShowAdPage;
        int i5 = i2 + 29;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final void onAfterLogin() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 25;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        if (component2 == null) {
            refreshAd(ShareDataUIState);
            return;
        }
        int i5 = i2 + 115;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final void refreshAd(boolean isShowAdPage) {
        int i = 2 % 2;
        ShareDataUIState = isShowAdPage;
        ArrayList arrayList = new ArrayList();
        arrayList.add(SPConstant.START_PAGE_CONFIG);
        new BasicConfigRepository(arrayList).sendRequest(new ApiCallback<Object>() {
            private static int ShareDataUIState = 1;
            private static int component2;

            @Override
            public void onSuccess(Object obj) {
                int i2 = 2 % 2;
                int i3 = component2 + 13;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 == 0) {
                    super.onSuccess(obj);
                    StartPageManager.access$updatePendingAdpage(StartPageManager.INSTANCE, obj);
                    int i4 = 94 / 0;
                } else {
                    super.onSuccess(obj);
                    StartPageManager.access$updatePendingAdpage(StartPageManager.INSTANCE, obj);
                }
                int i5 = component2 + 87;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = component3 + 125;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 4 / 0;
        }
    }

    public static void $r8$lambda$Bnj_SmIwhvqvR_H72f5Oe1waG6s(Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 37;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        component1(obj);
        int i4 = component3 + 5;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
