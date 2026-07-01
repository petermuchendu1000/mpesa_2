package com.huawei.digitalpayment.consumer.baselib.http.interceptor;

import android.text.TextUtils;
import com.huawei.digitalpayment.consumer.baselib.http.HttpErrorUtils;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class CommonExceptionTransferInterceptor implements Interceptor {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;

    @Override
    public Response intercept(Interceptor.Chain chain) throws IOException {
        int i = 2 % 2;
        try {
            Response responseProceed = chain.proceed(chain.request());
            ResponseBody responseBodyBody = responseProceed.body();
            String str = chain.request().headers().get("isCubeSendRequest");
            if (TextUtils.isEmpty(str) || !"isCubeSendRequest".equals(str)) {
                if (responseProceed.isSuccessful()) {
                }
                throw HttpErrorUtils.responseToException(responseProceed);
            }
            int i2 = ShareDataUIState + 29;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            if (responseBodyBody != null) {
                int i4 = component3 + 67;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return responseProceed;
            }
            throw HttpErrorUtils.responseToException(responseProceed);
        } catch (IOException e) {
            HttpErrorUtils.errorReport(chain.request(), null, e);
            throw HttpErrorUtils.transferException(e);
        }
    }
}
