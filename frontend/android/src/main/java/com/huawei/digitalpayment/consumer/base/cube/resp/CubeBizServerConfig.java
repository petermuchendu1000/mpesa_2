package com.huawei.digitalpayment.consumer.base.cube.resp;

import com.huawei.common.util.image.UrlUtils;
import com.huawei.http.BaseResp;
import java.util.List;
import java.util.Map;

public class CubeBizServerConfig extends BaseResp {
    private static int ShareDataUIState = 1;
    private static int component3;
    private String appId;
    private String cubeAuthUrl;
    private String cubeBaseUrl;
    private List<String> cubePrefixPath;
    private String loginUrl;
    private String logoutUrl;
    private Map<String, CubeMiniApp> miniAppConfig;
    private String pinKey;
    private String signKey;
    private String tenantId;

    public String getLogoutUrl() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 105;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.logoutUrl;
        int i5 = i2 + 95;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setLogoutUrl(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.logoutUrl = str;
        int i5 = i3 + 43;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public String getPinKey() {
        int i = 2 % 2;
        int i2 = component3 + 13;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.pinKey;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setPinKey(String str) {
        int i = 2 % 2;
        int i2 = component3 + 21;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        this.pinKey = str;
        if (i3 == 0) {
            throw null;
        }
    }

    public Map<String, CubeMiniApp> getMiniAppConfig() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 83;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Map<String, CubeMiniApp> map = this.miniAppConfig;
        int i5 = i2 + 71;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 29 / 0;
        }
        return map;
    }

    public void setMiniAppConfig(Map<String, CubeMiniApp> map) {
        int i = 2 % 2;
        int i2 = component3 + 125;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.miniAppConfig = map;
        int i5 = i3 + 23;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 83 / 0;
        }
    }

    public String getTenantId() {
        String str;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 107;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.tenantId;
            int i4 = 91 / 0;
        } else {
            str = this.tenantId;
        }
        int i5 = i2 + 83;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setTenantId(String str) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 47;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.tenantId = str;
        int i5 = i2 + 69;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 32 / 0;
        }
    }

    public String getCubeAuthUrl() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 51;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.cubeAuthUrl;
        int i5 = i2 + 95;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public void setCubeAuthUrl(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 125;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.cubeAuthUrl = str;
        int i5 = i2 + 29;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getAppId() {
        int i = 2 % 2;
        int i2 = component3 + 15;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.appId;
        if (i3 == 0) {
            int i4 = 68 / 0;
        }
        return str;
    }

    public void setAppId(String str) {
        int i = 2 % 2;
        int i2 = component3 + 77;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        this.appId = str;
        if (i3 == 0) {
            int i4 = 77 / 0;
        }
    }

    public String getBaseUrl() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 77;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.cubeBaseUrl;
        int i5 = i2 + 47;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setBaseUrl(String str) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 83;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.cubeBaseUrl = str;
        int i5 = i2 + 111;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getLoginUrl() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 55;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.loginUrl;
        int i5 = i3 + 7;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 99 / 0;
        }
        return str;
    }

    public void setLoginUrl(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 111;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.loginUrl = str;
        int i5 = i3 + 81;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getSignKey() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 41;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.signKey;
        int i5 = i2 + 117;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public void setSignKey(String str) {
        int i = 2 % 2;
        int i2 = component3 + 67;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.signKey = str;
        int i5 = i3 + 81;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public List<String> getCubePrefixPath() {
        int i = 2 % 2;
        int i2 = component3 + 95;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.cubePrefixPath;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setCubePrefixPath(List<String> list) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 119;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.cubePrefixPath = list;
        int i5 = i3 + 85;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getFullUrl(String str) {
        int i = 2 % 2;
        int i2 = component3 + 47;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String fullUrl = UrlUtils.getFullUrl(this.cubeBaseUrl, str);
        int i4 = ShareDataUIState + 121;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return fullUrl;
    }
}
