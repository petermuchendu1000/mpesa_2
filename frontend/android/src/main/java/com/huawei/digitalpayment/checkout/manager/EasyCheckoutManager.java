package com.huawei.digitalpayment.checkout.manager;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.huawei.arouter.RouteUtils;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import java.util.HashMap;
import java.util.Map;

public class EasyCheckoutManager {
    private static int component2 = 1;
    private static int component3;

    public static void easyPay(FragmentActivity fragmentActivity, Map<String, Object> map) {
        int i = 2 % 2;
        HashMap map2 = new HashMap(map);
        Bundle bundle = new Bundle(1);
        bundle.putSerializable("params", map2);
        RouteUtils.routeWithExecute(fragmentActivity, RoutePathConstants.EASY_CHECKOUT, bundle, null, map2, -1, -1, null);
        int i2 = component3 + 29;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 15 / 0;
        }
    }
}
