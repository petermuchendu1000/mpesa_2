package com.huawei.digitalpayment.consumer.base.cube.utils;

import android.text.TextUtils;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.base.cube.intercept.CubePostParamsInterceptor;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.http.interceptor.CommonExceptionTransferInterceptor;
import com.huawei.digitalpayment.consumer.baselib.http.interceptor.ExceptionTransferInterceptor;
import com.huawei.digitalpayment.consumer.baselib.http.interceptor.PostParamsInterceptor;
import com.huawei.http.appserver.IAppServerHttpConfig;
import java.util.List;
import okhttp3.Interceptor;

public class CubeUtils {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;

    public static boolean isCubeTokenInvalid(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 117;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            "405230602".equals(str);
            throw null;
        }
        if ("405230602".equals(str) || "405230603".equals(str)) {
            return true;
        }
        int i3 = copydefault + 57;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public static List<Interceptor> getCubeInterceptor() {
        int i = 2 % 2;
        List<Interceptor> interceptors = ((IAppServerHttpConfig) RouteUtils.getService(IAppServerHttpConfig.class)).getInterceptors();
        for (int i2 = 0; i2 < interceptors.size(); i2++) {
            int i3 = copydefault + 93;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                Interceptor interceptor = interceptors.get(i2);
                if (interceptor instanceof ExceptionTransferInterceptor) {
                    ((ExceptionTransferInterceptor) interceptor).setTransferOnBusinessFail(false);
                }
                if (interceptor instanceof PostParamsInterceptor) {
                    interceptors.set(i2, new CubePostParamsInterceptor());
                }
                if (interceptor instanceof CommonExceptionTransferInterceptor) {
                    int i4 = ShareDataUIState + 71;
                    copydefault = i4 % 128;
                    int i5 = i4 % 2;
                    interceptors.remove(interceptor);
                }
            } else {
                boolean z = interceptors.get(i2) instanceof ExceptionTransferInterceptor;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        return interceptors;
    }

    public static String getCubeBizTokenKey() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 55;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            String string = SPUtils.getInstance().getString("recent_login_phone_number");
            if (TextUtils.isEmpty(string)) {
                string = SPUtils.getInstance().getString(KeysConstants.RECENT_LOGIN_SHORT_CODE) + "_" + SPUtils.getInstance().getString(KeysConstants.RECENT_LOGIN_OPERATOR_CODE);
            }
            String str = string + "cubeBizToken";
            int i3 = ShareDataUIState + 15;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 28 / 0;
            }
            return str;
        }
        TextUtils.isEmpty(SPUtils.getInstance().getString("recent_login_phone_number"));
        throw null;
    }
}
