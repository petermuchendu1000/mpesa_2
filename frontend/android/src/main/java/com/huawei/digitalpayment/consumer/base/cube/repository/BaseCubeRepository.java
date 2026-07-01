package com.huawei.digitalpayment.consumer.base.cube.repository;

import android.text.TextUtils;
import com.huawei.common.util.image.UrlUtils;
import com.huawei.digitalpayment.consumer.base.cube.resp.CubeBaseResp;
import com.huawei.digitalpayment.consumer.base.cube.resp.CubeBizServerConfig;
import com.huawei.digitalpayment.consumer.base.cube.utils.CubeUnionFetchHelper;
import com.huawei.digitalpayment.consumer.base.cube.utils.CubeUtils;
import com.huawei.http.BaseRequest;
import java.util.List;
import okhttp3.Interceptor;

public class BaseCubeRepository<T extends CubeBaseResp> extends BaseRequest<T> {
    private static int component2 = 0;
    private static int component3 = 1;

    @Override
    public List<Interceptor> getInterceptors() {
        int i = 2 % 2;
        int i2 = component3 + 45;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        List<Interceptor> cubeInterceptor = CubeUtils.getCubeInterceptor();
        int i4 = component2 + 69;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return cubeInterceptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public String getUrl() {
        String baseUrl;
        int i = 2 % 2;
        int i2 = component2 + 11;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String url = super.getUrl();
        CubeBizServerConfig cubeUnionFetchConfig = CubeUnionFetchHelper.INSTANCE.getCubeUnionFetchConfig();
        if (!TextUtils.isEmpty(cubeUnionFetchConfig.getBaseUrl())) {
            baseUrl = cubeUnionFetchConfig.getBaseUrl();
        } else {
            baseUrl = "";
        }
        String fullUrl = UrlUtils.getFullUrl(baseUrl, url);
        int i4 = component2 + 105;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return fullUrl;
    }
}
