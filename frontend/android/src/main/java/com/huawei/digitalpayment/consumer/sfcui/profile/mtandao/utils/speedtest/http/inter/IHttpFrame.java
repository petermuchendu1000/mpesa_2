package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.http.inter;

import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.http.HttpReader;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.http.HttpVersion;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.http.utils.IByteList;
import java.util.HashMap;

public interface IHttpFrame {
    IByteList getBody();

    HashMap<String, String> getHeaders();

    String getHost();

    HttpVersion getHttpVersion();

    String getMethod();

    String getQueryString();

    HttpReader getReader();

    String getReasonPhrase();

    int getStatusCode();

    String getUri();

    boolean isChunked();

    boolean isHttpRequestFrame();

    boolean isHttpResponseFrame();
}
