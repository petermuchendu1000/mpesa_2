package com.huawei.digitalpayment.pwa.h5pay;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import com.huawei.arouter.RouteUtils;
import com.huawei.digitalpayment.consumer.baselib.service.ILoginService;
import com.huawei.digitalpayment.consumer.baselib.util.UriUtils;
import com.huawei.digitalpayment.pwa.business.IBusiness;
import com.huawei.digitalpayment.pwa.constant.BusinessType;
import java.util.HashMap;
import java.util.Map;

public class H5Pay implements IBusiness {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private Activity component3;

    public H5Pay(Activity activity) {
        this.component3 = activity;
    }

    @Override
    public void init(Activity activity) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 5;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.component3 = activity;
        int i5 = i3 + 57;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override
    public String getBusinessName() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 103;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 95;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return BusinessType.H5_CHECKOUT;
    }

    @Override
    public void parseUri(Uri uri) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        if (uri == null) {
            return;
        }
        component2(UriUtils.parseQuerys(uri));
        int i4 = component2 + 83;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    private void component2(Map<String, String> map) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        if (((ILoginService) RouteUtils.getService(ILoginService.class)).isLogin()) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("params", new HashMap(map));
            RouteUtils.routeWithExecute(this.component3, "native://app/pwaModule/h5Pay", bundle);
            int i4 = ShareDataUIState + 123;
            component2 = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = ShareDataUIState + 23;
        component2 = i6 % 128;
        int i7 = i6 % 2;
    }
}
