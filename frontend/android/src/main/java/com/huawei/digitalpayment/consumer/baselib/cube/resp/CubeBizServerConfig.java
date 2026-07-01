package com.huawei.digitalpayment.consumer.baselib.cube.resp;

import com.huawei.common.util.image.UrlUtils;
import com.huawei.http.BaseResp;
import java.util.List;
import java.util.Map;

public class CubeBizServerConfig extends BaseResp {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
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
        int i2 = ShareDataUIState;
        int i3 = i2 + 45;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.logoutUrl;
        int i5 = i2 + 71;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 56 / 0;
        }
        return str;
    }

    public void setLogoutUrl(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.logoutUrl = str;
        int i5 = i3 + 49;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getPinKey() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 17;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.pinKey;
        int i5 = i2 + 59;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setPinKey(String str) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 75;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.pinKey = str;
        int i5 = i2 + 81;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public Map<String, CubeMiniApp> getMiniAppConfig() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 65;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Map<String, CubeMiniApp> map = this.miniAppConfig;
        int i5 = i3 + 37;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public void setMiniAppConfig(Map<String, CubeMiniApp> map) {
        int i = 2 % 2;
        int i2 = copydefault + 5;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        this.miniAppConfig = map;
        if (i3 != 0) {
            int i4 = 7 / 0;
        }
    }

    public String getTenantId() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 61;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.tenantId;
        int i5 = i2 + 21;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public void setTenantId(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 47;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        this.tenantId = str;
        if (i3 != 0) {
            throw null;
        }
    }

    public String getCubeAuthUrl() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 61;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.cubeAuthUrl;
        int i5 = i2 + 47;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setCubeAuthUrl(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 65;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.cubeAuthUrl = str;
        if (i3 == 0) {
            int i4 = 44 / 0;
        }
    }

    public String getAppId() {
        int i = 2 % 2;
        int i2 = copydefault + 109;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.appId;
        }
        throw null;
    }

    public void setAppId(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 81;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.appId = str;
        int i5 = i3 + 9;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public String getBaseUrl() {
        int i = 2 % 2;
        int i2 = copydefault + 93;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.cubeBaseUrl;
        int i5 = i3 + 119;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setBaseUrl(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 41;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        this.cubeBaseUrl = str;
        if (i3 != 0) {
            throw null;
        }
    }

    public String getLoginUrl() {
        int i = 2 % 2;
        int i2 = copydefault + 113;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.loginUrl;
        int i5 = i3 + 17;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setLoginUrl(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 7;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.loginUrl = str;
        int i5 = i2 + 97;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getSignKey() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 19;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.signKey;
        int i5 = i2 + 93;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setSignKey(String str) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 49;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.signKey = str;
        int i5 = i2 + 73;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public List<String> getCubePrefixPath() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 115;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        List<String> list = this.cubePrefixPath;
        int i4 = i2 + 123;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public void setCubePrefixPath(List<String> list) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 103;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.cubePrefixPath = list;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 73;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public String getFullUrl(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 95;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String fullUrl = UrlUtils.getFullUrl(this.cubeBaseUrl, str);
        int i4 = ShareDataUIState + 9;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return fullUrl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
