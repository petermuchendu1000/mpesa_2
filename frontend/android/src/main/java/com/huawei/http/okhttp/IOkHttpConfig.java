package com.huawei.http.okhttp;

import com.blankj.utilcode.util.Utils;
import com.huawei.common.util.encrypt.SecurityRandomUtil;
import com.huawei.secure.android.common.ssl.SSFCompatiableSystemCA;
import com.huawei.secure.android.common.ssl.SSFSecureX509SingleInstance;
import com.huawei.secure.android.common.ssl.hostname.StrictHostnameVerifier;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Interceptor;

public interface IOkHttpConfig {
    public static final long DEFAULT_TIMEOUT = 30;

    default long getConnectTimeoutSeconds() {
        return 30L;
    }

    default long getReadTimeoutSeconds() {
        return 30L;
    }

    default long getWriteTimeoutSeconds() {
        return 30L;
    }

    default Interceptor providerHttpLoggingInterceptor() {
        return null;
    }

    default boolean retryOnConnectionFailure() {
        return true;
    }

    default HostnameVerifier getHostnameVerifier() {
        return new StrictHostnameVerifier();
    }

    default SSLSocketFactory getSSLSocketFactory() {
        try {
            return SSFCompatiableSystemCA.getInstance(Utils.getApp(), SecurityRandomUtil.genSecureRandom());
        } catch (Exception unused) {
            return null;
        }
    }

    default X509TrustManager getTrustAllManager() {
        try {
            return SSFSecureX509SingleInstance.getInstance(Utils.getApp());
        } catch (Exception unused) {
            return null;
        }
    }
}
