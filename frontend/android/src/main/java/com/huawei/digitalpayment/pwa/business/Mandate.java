package com.huawei.digitalpayment.pwa.business;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.util.L;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.service.ILoginService;
import com.huawei.digitalpayment.consumer.baselib.util.UriUtils;
import com.huawei.digitalpayment.pwa.constant.BusinessType;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class Mandate implements IBusiness {
    private static int component2 = 1;
    private static int copydefault;
    private Activity component3;

    public Mandate(Activity activity) {
        this.component3 = activity;
    }

    @Override
    public void init(Activity activity) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 113;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.component3 = activity;
        int i5 = i2 + 103;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public String getBusinessName() {
        int i = 2 % 2;
        int i2 = copydefault + 57;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 9;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return BusinessType.MANDATE;
        }
        throw null;
    }

    @Override
    public void parseUri(Uri uri) {
        int i = 2 % 2;
        int i2 = component2 + 77;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (uri == null) {
            return;
        }
        component3(UriUtils.parseQuerys(uri));
        int i3 = copydefault + 99;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 78 / 0;
        }
    }

    private void component3(Map<String, String> map) {
        String strOptString;
        JSONObject jSONObject;
        String strOptString2 = "";
        int i = 2 % 2;
        int i2 = copydefault + 29;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        if (((ILoginService) RouteUtils.getService(ILoginService.class)).isLogin()) {
            try {
                jSONObject = new JSONObject(SPUtils.getInstance(AppConfigManager.SP_APP).getString(AppConfigManager.MERCHANT_APP_ID_CONFIG)).getJSONObject(KeysConstants.KEY_FEED_BACK_URL);
                strOptString = jSONObject.optString("appId");
            } catch (JSONException e) {
                e = e;
                strOptString = "";
            }
            try {
                strOptString2 = jSONObject.optString("h5Url");
            } catch (JSONException e2) {
                e = e2;
                L.e(e.getMessage());
                int i4 = copydefault + 9;
                component2 = i4 % 128;
                int i5 = i4 % 2;
            }
            if (!TextUtils.isEmpty(strOptString2)) {
                map.put("appId", strOptString);
                String appendUrl = UriUtils.getAppendUrl("native://app/pwaModule/getAccessToken", map);
                map.put("url", strOptString2);
                RouteUtils.routeWithExecute(this.component3, appendUrl, map);
                Activity activity = this.component3;
                if (activity != null) {
                    int i6 = component2 + 61;
                    copydefault = i6 % 128;
                    if (i6 % 2 == 0) {
                        activity.finish();
                        return;
                    } else {
                        activity.finish();
                        throw null;
                    }
                }
                return;
            }
            int i7 = copydefault + 81;
            int i8 = i7 % 128;
            component2 = i8;
            if (i7 % 2 == 0) {
                throw null;
            }
            Activity activity2 = this.component3;
            if (activity2 != null) {
                int i9 = i8 + 55;
                copydefault = i9 % 128;
                if (i9 % 2 == 0) {
                    activity2.finish();
                } else {
                    activity2.finish();
                    int i10 = 16 / 0;
                }
            }
        }
    }
}
