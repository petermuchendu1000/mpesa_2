package com.huawei.digitalpayment.consumer.basic.util;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.basicUi.constants.BasicUiConstants;

public class BasicModuleUtils {
    private static int ShareDataUIState = 1;
    private static int component1;

    public static CharSequence getAppShareContent() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 121;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String string = SPUtils.getInstance(BasicUiConstants.SP_NAME).getString(BasicUiConstants.KEY_SHARE_APP_MSG, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        Spanned spannedFromHtml = Html.fromHtml(string.replaceFirst("h5:/", AppConfigManager.getAppConfig().getH5BaseUrl()), 0);
        int i4 = component1 + 83;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return spannedFromHtml;
    }
}
