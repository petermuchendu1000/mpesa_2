package com.huawei.digitalpayment.consumer.baselib.http.interceptor;

import android.text.TextUtils;
import com.huawei.digitalpayment.consumer.baselib.http.HttpErrorUtils;
import com.huawei.digitalpayment.consumer.baselib.util.TimeUtils;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import okhttp3.Interceptor;
import okhttp3.Response;
import okio.BufferedSource;
import org.json.JSONObject;

public class ExceptionTransferInterceptor implements Interceptor {
    private static final String component2 = "ExceptionTransferInterceptor";
    private static int component3 = 0;
    private static int copydefault = 1;
    private boolean component1 = true;

    @Override
    public Response intercept(Interceptor.Chain chain) throws IOException {
        int i = 2 % 2;
        try {
            Response responseProceed = chain.proceed(chain.request());
            BufferedSource bufferedSourceSource = responseProceed.body().getSource();
            bufferedSourceSource.request(Long.MAX_VALUE);
            String string = bufferedSourceSource.getBuffer().clone().readString(StandardCharsets.UTF_8);
            JSONObject jSONObject = new JSONObject(string);
            String strOptString = jSONObject.optString("serverTimestamp");
            if (!TextUtils.isEmpty(strOptString)) {
                int i2 = component3 + 3;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                TimeUtils.saveServerDiffUTC(strOptString);
            }
            if (!this.component1) {
                return responseProceed;
            }
            if (!"SYS00000".equals(jSONObject.optString("responseCode"))) {
                throw HttpErrorUtils.bodyToException(string);
            }
            int i4 = component3 + 31;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                return responseProceed;
            }
            throw null;
        } catch (Exception e) {
            throw HttpErrorUtils.transferException(e);
        }
    }

    public void setTransferOnBusinessFail(boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 7;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.component1 = z;
        int i5 = i3 + 119;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }
}
