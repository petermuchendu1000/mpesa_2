package com.huawei.digitalpayment.common.theme.data;

import android.os.Bundle;
import com.huawei.arouter.RouteUtils;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0003"}, d2 = {"executeFun", "", "Lcom/huawei/digitalpayment/common/theme/data/FunctionResp;", "CommonHomeThemeModule_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class FunctionRespKt {
    private static int ShareDataUIState = 1;
    private static int component2;

    public static final void executeFun(FunctionResp functionResp) {
        int i = 2 % 2;
        int i2 = component2 + 75;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (functionResp != null) {
            int i4 = i3 + 7;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                String execute = functionResp.getExecute();
                if (execute != null) {
                    Bundle bundle = new Bundle(2);
                    bundle.putString(KeysConstants.FUNCTION_ICON, functionResp.getIcon());
                    bundle.putString(KeysConstants.FUNCTION_NAME, ThemeExtKt.parseThemeString(functionResp.getFuncName()));
                    RouteUtils.routeWithExecute(execute, bundle);
                    return;
                }
                return;
            }
            functionResp.getExecute();
            throw null;
        }
    }
}
