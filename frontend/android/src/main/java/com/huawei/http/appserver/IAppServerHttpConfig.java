package com.huawei.http.appserver;

import java.util.List;
import okhttp3.Interceptor;

public interface IAppServerHttpConfig {
    String getBaseUrl();

    List<Interceptor> getInterceptors();
}
