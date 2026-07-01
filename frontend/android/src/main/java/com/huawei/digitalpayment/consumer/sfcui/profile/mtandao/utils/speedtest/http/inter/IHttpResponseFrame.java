package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.http.inter;

import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.http.HttpVersion;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.http.StatusCodeObject;
import java.util.HashMap;

public interface IHttpResponseFrame {
    HashMap<String, String> getHeaders();

    HttpVersion getHttpVersion();

    StatusCodeObject getReturnCode();
}
