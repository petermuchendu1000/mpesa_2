package com.huawei.digitalpayment.pwa.business;

import android.app.Activity;
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

public class MandatePay implements IBusiness {
    private static int component1 = 1;
    private static int component2;
    private Activity copydefault;

    public MandatePay(Activity activity) {
        this.copydefault = activity;
    }

    @Override
    public void init(Activity activity) {
        int i = 2 % 2;
        int i2 = component1 + 111;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.copydefault = activity;
        if (i3 != 0) {
            int i4 = 34 / 0;
        }
    }

    @Override
    public String getBusinessName() {
        int i = 2 % 2;
        int i2 = component1 + 47;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return BusinessType.MANDATE_AND_PAY;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        component2(com.huawei.digitalpayment.consumer.baselib.util.UriUtils.parseQuerys(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r5 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r5 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r1 = r1 + 65;
        com.huawei.digitalpayment.pwa.business.MandatePay.component1 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if ((r1 % 2) == 0) goto L11;
     */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void parseUri(android.net.Uri r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.pwa.business.MandatePay.component2
            int r2 = r1 + 21
            int r3 = r2 % 128
            com.huawei.digitalpayment.pwa.business.MandatePay.component1 = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L15
            r2 = 21
            int r2 = r2 / 0
            if (r5 != 0) goto L23
            goto L17
        L15:
            if (r5 != 0) goto L23
        L17:
            int r1 = r1 + 65
            int r5 = r1 % 128
            com.huawei.digitalpayment.pwa.business.MandatePay.component1 = r5
            int r1 = r1 % r0
            if (r1 == 0) goto L21
            return
        L21:
            r5 = 0
            throw r5
        L23:
            java.util.HashMap r5 = com.huawei.digitalpayment.consumer.baselib.util.UriUtils.parseQuerys(r5)
            r4.component2(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.pwa.business.MandatePay.parseUri(android.net.Uri):void");
    }

    private void component2(Map<String, String> map) {
        String strOptString;
        JSONObject jSONObject;
        String strOptString2 = "";
        int i = 2 % 2;
        int i2 = component1 + 61;
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
                int i4 = component1 + 107;
                component2 = i4 % 128;
                int i5 = i4 % 2;
            }
            if (TextUtils.isEmpty(strOptString2)) {
                Activity activity = this.copydefault;
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            }
            map.put("thirdAppId", map.get("appId"));
            map.put("appId", strOptString);
            String appendUrl = UriUtils.getAppendUrl("native://app/pwaModule/getAccessToken", map);
            map.put("url", strOptString2);
            RouteUtils.routeWithExecute(this.copydefault, appendUrl, map);
            Activity activity2 = this.copydefault;
            if (activity2 != null) {
                activity2.finish();
            }
        }
    }
}
