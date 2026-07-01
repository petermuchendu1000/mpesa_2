package com.huawei.common.util.share;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.webkit.internal.AssetHelper;
import com.blankj.utilcode.util.ActivityUtils;
import com.blankj.utilcode.util.AppUtils;
import com.huawei.common.util.L;

public class AppShareUtils {
    private static final String component2 = "AppShareUtils";

    public static void shareText(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            L.d(component2, "content is null: ");
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
            intent.putExtra("android.intent.extra.TEXT", str2);
            Activity topActivity = ActivityUtils.getTopActivity();
            if (topActivity == null) {
                L.d(component2, "topActivity is null: ");
            } else {
                topActivity.startActivity(Intent.createChooser(intent, str));
            }
        } catch (Exception e) {
            L.d(component2, "share error: " + e.getMessage());
        }
    }

    public static boolean shareToSocialNetwork(Activity activity, String str, String str2, int i) {
        if (!AppUtils.isAppInstalled(str2)) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setPackage(str2);
        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        intent.putExtra("android.intent.extra.TEXT", str);
        activity.startActivityForResult(intent, i);
        return true;
    }
}
