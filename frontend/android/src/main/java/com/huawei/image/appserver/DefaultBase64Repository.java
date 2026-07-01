package com.huawei.image.appserver;

import com.huawei.arouter.RouteUtils;
import com.huawei.http.BaseRequest;
import com.huawei.http.appserver.IAppServerHttpConfig;
import com.huawei.image.glide.Base64Mode;
import java.util.List;
import java.util.Map;
import okhttp3.Interceptor;

public class DefaultBase64Repository extends BaseRequest<Base64Mode> {
    @Override
    public List<Interceptor> getInterceptors() {
        return ((IAppServerHttpConfig) RouteUtils.getService(IAppServerHttpConfig.class)).getInterceptors();
    }

    @Override
    public String getUrl() {
        String url = super.getUrl();
        if (url.startsWith("http")) {
            return url;
        }
        return ((IAppServerHttpConfig) RouteUtils.getService(IAppServerHttpConfig.class)).getBaseUrl() + url;
    }

    public DefaultBase64Repository(Map<String, String> map) {
        for (String str : map.keySet()) {
            addParams(str, map.get(str));
        }
    }

    @Override
    public String getApiPath() {
        return "document/download";
    }
}
