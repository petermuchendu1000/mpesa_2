package com.huawei.digitalpayment.home.theme.data.remote;

import com.huawei.digitalpayment.home.theme.data.local.LocalI18nResource;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a<\u0010\u0000\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u0003*\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0003¨\u0006\u0005"}, d2 = {"toLocal", "Lcom/huawei/digitalpayment/home/theme/data/local/LocalI18nResource;", "Lcom/huawei/digitalpayment/home/theme/data/remote/RemoteI18nResource;", "", "", "ConsumerHomeModule_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class RemoteI18nResourceKt {
    private static int component3 = 1;
    private static int copydefault;

    public static final LocalI18nResource toLocal(RemoteI18nResource remoteI18nResource) {
        int i = 2 % 2;
        int i2 = component3 + 123;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        if (remoteI18nResource == null) {
            LocalI18nResource localI18nResource = new LocalI18nResource(null, null, null, 7, null);
            int i4 = component3 + 87;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return localI18nResource;
        }
        LocalI18nResource localI18nResource2 = new LocalI18nResource(remoteI18nResource.getCacheTimestamp(), toLocal(remoteI18nResource.getTheme()), toLocal(remoteI18nResource.getCommon()));
        int i6 = copydefault + 57;
        component3 = i6 % 128;
        if (i6 % 2 != 0) {
            return localI18nResource2;
        }
        throw null;
    }

    public static final Map<String, Map<String, String>> toLocal(Map<String, ? extends Map<String, String>> map) {
        int i = 2 % 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            int i2 = copydefault + 23;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            if (!map.isEmpty()) {
                linkedHashMap.putAll(map);
            }
        }
        int i4 = copydefault + 105;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 60 / 0;
        }
        return linkedHashMap;
    }
}
