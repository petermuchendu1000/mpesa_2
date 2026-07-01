package com.huawei.digitalpayment.consumer.home.ui.resp;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\u001ah\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¨\u0006\u000e"}, d2 = {"createSecureCallPayload", "Lcom/huawei/digitalpayment/consumer/home/ui/resp/SecureCallRequest;", "initiatorPin", "", "callResp", "Lcom/huawei/digitalpayment/consumer/home/ui/resp/SecurityCallResp;", "deviceToken", "appId", "serviceId", "msisdn", "headers", "", "payload", "queryString", "ConsumerHomeUi_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SecureCallJsonPayloadsKt {
    private static int component1 = 0;
    private static int component3 = 1;

    public static SecureCallRequest createSecureCallPayload$default(String str, SecurityCallResp securityCallResp, String str2, String str3, String str4, String str5, Map map, String str6, String str7, int i, Object obj) {
        String str8;
        String str9;
        int i2 = 2 % 2;
        Object obj2 = null;
        String str10 = (i & 1) != 0 ? null : str;
        Map mapEmptyMap = (i & 64) != 0 ? MapsKt.emptyMap() : map;
        if ((i & 128) != 0) {
            int i3 = component1 + 65;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            str8 = "";
        } else {
            str8 = str6;
        }
        if ((i & 256) != 0) {
            int i5 = component3 + 13;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            str9 = null;
        } else {
            str9 = str7;
        }
        return createSecureCallPayload(str10, securityCallResp, str2, str3, str4, str5, mapEmptyMap, str8, str9);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.huawei.digitalpayment.consumer.home.ui.resp.SecureCallRequest createSecureCallPayload(java.lang.String r16, com.huawei.digitalpayment.consumer.home.ui.resp.SecurityCallResp r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.util.Map<java.lang.String, java.lang.String> r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.resp.SecureCallJsonPayloadsKt.createSecureCallPayload(java.lang.String, com.huawei.digitalpayment.consumer.home.ui.resp.SecurityCallResp, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.lang.String):com.huawei.digitalpayment.consumer.home.ui.resp.SecureCallRequest");
    }
}
