package com.huawei.digitalpayment.consumer.webview.interaction.function;

import android.text.TextUtils;
import com.huawei.digitalpayment.consumer.baselib.config.CurrencyConfigManager;
import com.huawei.digitalpayment.consumer.baselib.util.AppInfoUtils;
import com.huawei.digitalpayment.consumer.webview.constants.WebViewConstants;
import com.huawei.digitalpayment.consumer.webview.interaction.JavascriptFunction;
import java.util.Map;
import org.json.JSONObject;

public class GetAppInfoFunction extends JavascriptFunction {
    private static int component2 = 1;
    private static int component3;

    @Override
    public String getFunctionName() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 9;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 68 / 0;
        }
        int i5 = i2 + 67;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return WebViewConstants.JS_FUN_GET_APP_INFO;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void execute(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = component2 + 81;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ShareDataUIState();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void ShareDataUIState() {
        int i = 2 % 2;
        int i2 = component3 + 31;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            if (TextUtils.isEmpty(this.callbackFuncName)) {
                return;
            }
            Map<String, Object> basicInfo2 = AppInfoUtils.getBasicInfo2();
            String currentCurrencyCode = CurrencyConfigManager.INSTANCE.getCurrentCurrencyCode();
            Object currencySymbolByLanguage = CurrencyConfigManager.INSTANCE.getCurrencySymbolByLanguage(currentCurrencyCode);
            basicInfo2.put("currency", currentCurrencyCode);
            basicInfo2.put("symbol", currencySymbolByLanguage);
            callMapObjectJs(this.callbackFuncName, basicInfo2);
            int i3 = component2 + 77;
            component3 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 33 / 0;
                return;
            }
            return;
        }
        TextUtils.isEmpty(this.callbackFuncName);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
