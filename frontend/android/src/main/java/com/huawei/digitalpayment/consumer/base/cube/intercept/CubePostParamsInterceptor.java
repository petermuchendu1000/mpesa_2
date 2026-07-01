package com.huawei.digitalpayment.consumer.base.cube.intercept;

import android.text.TextUtils;
import com.huawei.common.util.encrypt.EncryptUtils;
import com.huawei.common.util.encrypt.HMacSha256Utils;
import com.safaricom.mpesa.logging.L;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.Buffer;
import org.json.JSONException;
import org.json.JSONObject;

public class CubePostParamsInterceptor implements Interceptor {
    public static final String RANDOM_KEY = "randomKey";
    public static final String SIGN = "sign";
    private static int ShareDataUIState = 0;
    public static final String TIME_STAMP = "timestamp";
    private static int component2 = 1;
    private static final String component3 = "application/json";

    @Override
    public Response intercept(Interceptor.Chain chain) throws IOException {
        JSONObject jSONObject;
        int i = 2 % 2;
        int i2 = component2 + 99;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Request request = chain.request();
        RequestBody requestBodyBody = request.body();
        if (requestBodyBody != null) {
            Buffer buffer = new Buffer();
            requestBodyBody.writeTo(buffer);
            String string = buffer.readString(StandardCharsets.UTF_8);
            try {
                if (!TextUtils.isEmpty(string)) {
                    jSONObject = new JSONObject(string);
                    int i4 = ShareDataUIState + 113;
                    component2 = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 2 / 5;
                    }
                } else {
                    jSONObject = new JSONObject();
                }
                String str = request.headers().get("cubeSingKey");
                String strCreateRandomDynamicIv = EncryptUtils.createRandomDynamicIv();
                long jCurrentTimeMillis = System.currentTimeMillis();
                return chain.proceed(request.newBuilder().addHeader("sign", getSign(jSONObject.toString().replace("\\/", "/"), jCurrentTimeMillis + strCreateRandomDynamicIv)).addHeader("timestamp", String.valueOf(jCurrentTimeMillis)).addHeader("randomKey", encryptRandomDynamicIv(strCreateRandomDynamicIv, str)).post(RequestBody.create(jSONObject.toString().replace("\\/", "/"), MediaType.parse("application/json"))).build());
            } catch (JSONException e) {
                if (e.getMessage() != null) {
                    L.INSTANCE.e(e.getMessage(), new Object[0]);
                }
            }
        }
        return chain.proceed(request);
    }

    public String getSign(String str, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = component2 + 107;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String strHashMacSha256 = HMacSha256Utils.hashMacSha256(str, str2);
        int i4 = ShareDataUIState + 55;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return strHashMacSha256;
        }
        throw null;
    }

    public String encryptRandomDynamicIv(String str, String str2) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            EncryptUtils.rsaEncrypt(str2, "RSA/ECB/PKCS1Padding", str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String strRsaEncrypt = EncryptUtils.rsaEncrypt(str2, "RSA/ECB/PKCS1Padding", str);
        int i3 = ShareDataUIState + 75;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return strRsaEncrypt;
    }
}
