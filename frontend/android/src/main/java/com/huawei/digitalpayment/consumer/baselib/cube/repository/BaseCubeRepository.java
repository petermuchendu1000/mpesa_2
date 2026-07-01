package com.huawei.digitalpayment.consumer.baselib.cube.repository;

import com.huawei.digitalpayment.consumer.baselib.cube.resp.CubeBaseResp;
import com.huawei.digitalpayment.consumer.baselib.cube.utils.CubeUtils;
import com.huawei.http.BaseRequest;
import java.util.List;
import okhttp3.Interceptor;

public class BaseCubeRepository<T extends CubeBaseResp> extends BaseRequest<T> {
    private static int ShareDataUIState = 1;
    private static int component3;

    @Override
    public List<Interceptor> getInterceptors() {
        int i = 2 % 2;
        int i2 = component3 + 47;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            CubeUtils.getCubeInterceptor();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<Interceptor> cubeInterceptor = CubeUtils.getCubeInterceptor();
        int i3 = ShareDataUIState + 51;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 99 / 0;
        }
        return cubeInterceptor;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040 A[PHI: r1 r3
  0x0040: PHI (r1v7 java.lang.String) = (r1v4 java.lang.String), (r1v8 java.lang.String) binds: [B:8:0x003b, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0040: PHI (r3v2 com.huawei.digitalpayment.consumer.baselib.cube.resp.CubeBizServerConfig) = 
  (r3v1 com.huawei.digitalpayment.consumer.baselib.cube.resp.CubeBizServerConfig)
  (r3v7 com.huawei.digitalpayment.consumer.baselib.cube.resp.CubeBizServerConfig)
 binds: [B:8:0x003b, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d A[PHI: r1
  0x003d: PHI (r1v5 java.lang.String) = (r1v4 java.lang.String), (r1v8 java.lang.String) binds: [B:8:0x003b, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getUrl() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.baselib.cube.repository.BaseCubeRepository.ShareDataUIState
            int r1 = r1 + 37
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.cube.repository.BaseCubeRepository.component3 = r2
            int r1 = r1 % r0
            r2 = 1
            if (r1 == 0) goto L28
            java.lang.String r1 = super.getUrl()
            com.huawei.digitalpayment.consumer.baselib.cube.utils.CubeUnionFetchHelper r3 = com.huawei.digitalpayment.consumer.baselib.cube.utils.CubeUnionFetchHelper.INSTANCE
            com.huawei.digitalpayment.consumer.baselib.cube.resp.CubeBizServerConfig r3 = r3.getCubeUnionFetchConfig()
            java.lang.String r4 = r3.getBaseUrl()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            r5 = 7
            int r5 = r5 / 0
            r4 = r4 ^ r2
            if (r4 == r2) goto L40
            goto L3d
        L28:
            java.lang.String r1 = super.getUrl()
            com.huawei.digitalpayment.consumer.baselib.cube.utils.CubeUnionFetchHelper r3 = com.huawei.digitalpayment.consumer.baselib.cube.utils.CubeUnionFetchHelper.INSTANCE
            com.huawei.digitalpayment.consumer.baselib.cube.resp.CubeBizServerConfig r3 = r3.getCubeUnionFetchConfig()
            java.lang.String r4 = r3.getBaseUrl()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            r4 = r4 ^ r2
            if (r4 == r2) goto L40
        L3d:
            java.lang.String r0 = ""
            goto L4e
        L40:
            java.lang.String r2 = r3.getBaseUrl()
            int r3 = com.huawei.digitalpayment.consumer.baselib.cube.repository.BaseCubeRepository.component3
            int r3 = r3 + 67
            int r4 = r3 % 128
            com.huawei.digitalpayment.consumer.baselib.cube.repository.BaseCubeRepository.ShareDataUIState = r4
            int r3 = r3 % r0
            r0 = r2
        L4e:
            java.lang.String r0 = com.huawei.common.util.image.UrlUtils.getFullUrl(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.cube.repository.BaseCubeRepository.getUrl():java.lang.String");
    }
}
