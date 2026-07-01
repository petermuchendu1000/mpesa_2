package com.huawei.digitalpayment.consumer.baselib.config;

import com.blankj.utilcode.util.CollectionUtils;
import com.huawei.common.util.L;
import com.huawei.digitalpayment.consumer.baselib.config.model.SecurityConfig;
import com.huawei.digitalpayment.consumer.baselib.config.model.SslPinningInfo;
import com.huawei.http.okhttp.DefaultOkHttpCertificatePinner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.CertificatePinner;

public class OkHttpCertificatePinner extends DefaultOkHttpCertificatePinner {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;

    @Override
    public CertificatePinner getCertificatePinner() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 29;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        SecurityConfig securityConfig = AppConfigManager.INSTANCE.getSecurityConfig();
        if (securityConfig == null) {
            return null;
        }
        int i4 = component2 + 83;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        if (CollectionUtils.isEmpty(securityConfig.getSslPinning())) {
            return null;
        }
        CertificatePinner.Builder builder = new CertificatePinner.Builder();
        List<SslPinningInfo> sslPinning = securityConfig.getSslPinning();
        HashMap map = new HashMap();
        for (SslPinningInfo sslPinningInfo : sslPinning) {
            if (map.containsKey(sslPinningInfo.getDomain())) {
                int i6 = ShareDataUIState + 63;
                component2 = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 89 / 0;
                    if (map.get(sslPinningInfo.getDomain()) != null) {
                        ((List) map.get(sslPinningInfo.getDomain())).add(sslPinningInfo.getAlgorithm() + "/" + sslPinningInfo.getHash());
                    }
                } else if (map.get(sslPinningInfo.getDomain()) != null) {
                    ((List) map.get(sslPinningInfo.getDomain())).add(sslPinningInfo.getAlgorithm() + "/" + sslPinningInfo.getHash());
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(sslPinningInfo.getAlgorithm() + "/" + sslPinningInfo.getHash());
            map.put(sslPinningInfo.getDomain(), arrayList);
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            L.d("OkHttpCertificatePinner", str);
            builder.add(str, (String[]) list.toArray(new String[0]));
        }
        return builder.build();
    }
}
