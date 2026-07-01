package com.huawei.http.appserver;

import android.text.TextUtils;
import com.blankj.utilcode.util.JsonUtils;
import com.blankj.utilcode.util.NetworkUtils;
import com.blankj.utilcode.util.StringUtils;
import com.google.gson.JsonParseException;
import com.huawei.common.exception.BaseException;
import com.huawei.http.R;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.text.ParseException;
import javax.net.ssl.SSLHandshakeException;
import org.json.JSONException;
import retrofit2.HttpException;

public class HttpErrorUtils {
    public static String getParseErrorMsg() {
        return StringUtils.getString(R.string.base_network_error_tips3);
    }

    public static String getBadNetworkMsg() {
        return StringUtils.getString(R.string.base_network_error_tips2);
    }

    public static String getConnectErrorMsg() {
        return StringUtils.getString(R.string.base_network_error_tips4);
    }

    public static String getConnectTimeoutMsg() {
        return StringUtils.getString(R.string.base_network_error_tips5);
    }

    public static String getOtherMsg() {
        return StringUtils.getString(R.string.base_network_error_tips6);
    }

    public static String getErrorMessage(String str) {
        String string = JsonUtils.getString(str, "responseDesc", "");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String string2 = JsonUtils.getString(str, "errorMessage", "");
        return !TextUtils.isEmpty(string2) ? string2 : StringUtils.getString(R.string.base_network_error_tips6);
    }

    public static String getResponseCode(String str) {
        String string = JsonUtils.getString(str, "responseCode", "");
        return !TextUtils.isEmpty(string) ? string : JsonUtils.getString(str, "errorCode", "");
    }

    public static String getMsgByCode(int i) {
        return StringUtils.getString(R.string.base_network_error_tips3);
    }

    public static String getSSLHandshakeExceptionMessage() {
        return StringUtils.getString(R.string.base_network_error_tips1);
    }

    public static BaseException transferException(Exception exc) {
        BaseException baseException;
        if (exc != null) {
            if (exc instanceof BaseException) {
                return (BaseException) exc;
            }
            if (!NetworkUtils.isConnected()) {
                return new BaseException(getBadNetworkMsg());
            }
            if (exc instanceof HttpException) {
                baseException = new BaseException(getBadNetworkMsg(), exc);
            } else if (exc instanceof ConnectException) {
                baseException = new BaseException(getConnectErrorMsg(), exc);
            } else {
                if (exc instanceof InterruptedIOException) {
                    return new BaseException("timeout", getConnectTimeoutMsg());
                }
                if ((exc instanceof JsonParseException) || (exc instanceof JSONException) || (exc instanceof ParseException)) {
                    baseException = new BaseException(getParseErrorMsg(), exc);
                } else if (exc instanceof SSLHandshakeException) {
                    baseException = new BaseException(getSSLHandshakeExceptionMessage(), exc);
                } else {
                    baseException = new BaseException(getOtherMsg(), exc);
                }
            }
            return baseException;
        }
        return new BaseException(getOtherMsg());
    }
}
