package com.huawei.digitalpayment.consumer.base.util;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.browser.customtabs.CustomTabsIntent;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u001b\u0010\f\u001a\u00020\u0005*\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/util/ContextExtensions;", "", "<init>", "()V", "launchCustomWebView", "", "Landroid/content/Context;", "url", "", "brandColor", "", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;)V", "startPermissionSettingsScreen", "requestCode", "(Landroid/content/Context;Ljava/lang/Integer;)V", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ContextExtensions {
    public static final ContextExtensions INSTANCE = new ContextExtensions();
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    private ContextExtensions() {
    }

    public static void launchCustomWebView$default(ContextExtensions contextExtensions, Context context, String str, Integer num, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 99;
        copydefault = i4 % 128;
        if (i4 % 2 != 0 ? (i & 2) != 0 : (i & 3) != 0) {
            int i5 = i3 + 115;
            copydefault = i5 % 128;
            num = null;
            if (i5 % 2 == 0) {
                throw null;
            }
        }
        contextExtensions.launchCustomWebView(context, str, num);
    }

    public final void launchCustomWebView(Context context, String str, Integer num) {
        boolean z;
        int i = 2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Uri uri = Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(uri, "");
        try {
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
                int i3 = ShareDataUIState + 119;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                z = true;
            } else {
                z = false;
            }
            if (num != null) {
                CustomTabColorSchemeParams customTabColorSchemeParamsBuild = new CustomTabColorSchemeParams.Builder().setToolbarColor(num.intValue()).build();
                Intrinsics.checkNotNullExpressionValue(customTabColorSchemeParamsBuild, "");
                builder.setDefaultColorSchemeParams(customTabColorSchemeParamsBuild);
            }
            if (!z) {
                i = 1;
            } else {
                int i5 = copydefault + 47;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }
            builder.setColorScheme(i);
            builder.setShowTitle(true);
            CustomTabsIntent customTabsIntentBuild = builder.build();
            Intrinsics.checkNotNullExpressionValue(customTabsIntentBuild, "");
            customTabsIntentBuild.launchUrl(context, uri);
        } catch (ActivityNotFoundException e) {
            Log.e("ContextExtensions", "Error launching custom web view", e);
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            intent.addFlags(268435456);
            try {
                context.startActivity(intent);
                Unit unit = Unit.INSTANCE;
            } catch (ActivityNotFoundException unused) {
                Log.e("ContextExtensions", "No app can open this URL");
            }
        }
    }

    public static void startPermissionSettingsScreen$default(ContextExtensions contextExtensions, Context context, Integer num, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 41;
        int i4 = i3 % 128;
        copydefault = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 49;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            num = null;
        }
        contextExtensions.startPermissionSettingsScreen(context, num);
        int i8 = ShareDataUIState + 71;
        copydefault = i8 % 128;
        int i9 = i8 % 2;
    }

    public final void startPermissionSettingsScreen(Context context, Integer num) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Activity activity = null;
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts(WiseOpenHianalyticsData.UNION_PACKAGE, context.getPackageName(), null));
        if (num == null) {
            int i2 = copydefault + 71;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            context.startActivity(intent);
        } else {
            if (context instanceof Activity) {
                activity = (Activity) context;
                int i4 = copydefault + 113;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
            }
            if (activity != null) {
                activity.startActivityForResult(intent, num.intValue());
            }
        }
        int i6 = copydefault + 1;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
    }

    static {
        int i = component3 + 37;
        component1 = i % 128;
        int i2 = i % 2;
    }
}
