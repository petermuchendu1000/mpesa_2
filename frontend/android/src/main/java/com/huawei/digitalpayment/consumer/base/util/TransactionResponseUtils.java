package com.huawei.digitalpayment.consumer.base.util;

import com.huawei.http.BaseResp;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/util/TransactionResponseUtils;", "", "<init>", "()V", "extractResponseInfo", "Lcom/huawei/digitalpayment/consumer/base/util/ResponseInfo;", "responseData", "extractFromJson", "jsonObject", "Lorg/json/JSONObject;", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TransactionResponseUtils {
    public static final TransactionResponseUtils INSTANCE = new TransactionResponseUtils();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3;

    private TransactionResponseUtils() {
    }

    public final ResponseInfo extractResponseInfo(Object responseData) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 67;
        component3 = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                boolean z = responseData instanceof BaseResp;
                throw null;
            }
            if (responseData instanceof BaseResp) {
                String responseCode = ((BaseResp) responseData).getResponseCode();
                if (responseCode == null) {
                    responseCode = "N/A";
                }
                String responseDesc = ((BaseResp) responseData).getResponseDesc();
                if (responseDesc == null) {
                    responseDesc = "N/A";
                }
                return new ResponseInfo(responseDesc, responseCode);
            }
            if (responseData instanceof String) {
                return component2(new JSONObject((String) responseData));
            }
            if (responseData instanceof JSONObject) {
                int i4 = i2 + 29;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return component2((JSONObject) responseData);
            }
            ResponseInfo responseInfo = new ResponseInfo("N/A", "N/A");
            int i6 = component2 + 67;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return responseInfo;
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseInfo("N/A", "N/A");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[PHI: r6
  0x002b: PHI (r6v7 org.json.JSONObject) = (r6v1 org.json.JSONObject), (r6v2 org.json.JSONObject), (r6v8 org.json.JSONObject) binds: [B:8:0x0021, B:10:0x0029, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[PHI: r6
  0x0023: PHI (r6v2 org.json.JSONObject) = (r6v1 org.json.JSONObject), (r6v8 org.json.JSONObject) binds: [B:8:0x0021, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.huawei.digitalpayment.consumer.base.util.ResponseInfo component2(org.json.JSONObject r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.base.util.TransactionResponseUtils.component2
            int r1 = r1 + 7
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.base.util.TransactionResponseUtils.component3 = r2
            int r1 = r1 % r0
            java.lang.String r2 = "header"
            java.lang.String r3 = "N/A"
            if (r1 == 0) goto L1d
            org.json.JSONObject r6 = r6.optJSONObject(r2)
            r1 = 11
            int r1 = r1 / 0
            if (r6 == 0) goto L2b
            goto L23
        L1d:
            org.json.JSONObject r6 = r6.optJSONObject(r2)
            if (r6 == 0) goto L2b
        L23:
            java.lang.String r1 = "customerMessage"
            java.lang.String r1 = r6.optString(r1, r3)
            if (r1 != 0) goto L2c
        L2b:
            r1 = r3
        L2c:
            if (r6 == 0) goto L49
            int r2 = com.huawei.digitalpayment.consumer.base.util.TransactionResponseUtils.component3
            int r2 = r2 + 99
            int r4 = r2 % 128
            com.huawei.digitalpayment.consumer.base.util.TransactionResponseUtils.component2 = r4
            int r2 = r2 % r0
            java.lang.String r0 = "responseCode"
            if (r2 == 0) goto L44
            java.lang.String r6 = r6.optString(r0, r3)
            if (r6 != 0) goto L42
            goto L49
        L42:
            r3 = r6
            goto L49
        L44:
            r6.optString(r0, r3)
            r6 = 0
            throw r6
        L49:
            com.huawei.digitalpayment.consumer.base.util.ResponseInfo r6 = new com.huawei.digitalpayment.consumer.base.util.ResponseInfo
            r6.<init>(r1, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.util.TransactionResponseUtils.component2(org.json.JSONObject):com.huawei.digitalpayment.consumer.base.util.ResponseInfo");
    }

    static {
        int i = component1 + 11;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
