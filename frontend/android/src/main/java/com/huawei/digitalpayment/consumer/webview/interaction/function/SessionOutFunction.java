package com.huawei.digitalpayment.consumer.webview.interaction.function;

import android.text.TextUtils;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.util.ToastUtils;
import com.huawei.digitalpayment.consumer.baselib.service.ILoginService;
import com.huawei.digitalpayment.consumer.webview.constants.WebViewConstants;
import com.huawei.digitalpayment.consumer.webview.interaction.BaseFunction;
import org.json.JSONObject;

public class SessionOutFunction extends BaseFunction {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;

    @Override
    public String getFunctionName() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 73;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return WebViewConstants.JS_FUN_SESSION_OUT;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void execute(JSONObject jSONObject) {
        int i = 2 % 2;
        if (!this.interactionView.checkPermission(getFunctionName())) {
            int i2 = ShareDataUIState + 19;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            notifyFail("3", "No permission");
            return;
        }
        String strOptString = jSONObject.optString("message");
        if (!TextUtils.isEmpty(strOptString)) {
            int i4 = component1 + 73;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                ToastUtils.showLong(strOptString);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ToastUtils.showLong(strOptString);
        }
        ((ILoginService) RouteUtils.getService(ILoginService.class)).logout();
    }
}
