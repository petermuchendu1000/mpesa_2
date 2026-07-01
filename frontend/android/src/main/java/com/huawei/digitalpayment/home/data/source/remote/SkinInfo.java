package com.huawei.digitalpayment.home.data.source.remote;

import com.huawei.http.BaseResp;

public class SkinInfo extends BaseResp {
    private static int component1 = 0;
    private static int component3 = 1;
    private String preview;
    private String status;
    private String themeDescription;
    private String themeId;
    private String themeName;
    private int version;

    public int getVersion() {
        int i = 2 % 2;
        int i2 = component3 + 45;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.version;
        }
        throw null;
    }

    public void setVersion(int i) {
        int i2 = 2 % 2;
        int i3 = component1 + 21;
        int i4 = i3 % 128;
        component3 = i4;
        int i5 = i3 % 2;
        this.version = i;
        int i6 = i4 + 27;
        component1 = i6 % 128;
        int i7 = i6 % 2;
    }

    public String getThemeName() {
        int i = 2 % 2;
        int i2 = component1 + 105;
        int i3 = i2 % 128;
        component3 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.themeName;
        int i4 = i3 + 1;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public void setThemeName(String str) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 59;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.themeName = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 89;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getThemeDescription() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 97;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.themeDescription;
        int i4 = i2 + 89;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public void setThemeDescription(String str) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 119;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.themeDescription = str;
        int i5 = i2 + 83;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getStatus() {
        int i = 2 % 2;
        int i2 = component1 + 43;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.status;
        if (i3 == 0) {
            int i4 = 59 / 0;
        }
        return str;
    }

    public void setStatus(String str) {
        int i = 2 % 2;
        int i2 = component1 + 73;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.status = str;
        int i5 = i3 + 81;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public String getPreview() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 39;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.preview;
        int i5 = i2 + 45;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setPreview(String str) {
        int i = 2 % 2;
        int i2 = component3 + 25;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.preview = str;
        int i5 = i3 + 3;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getThemeId() {
        int i = 2 % 2;
        int i2 = component3 + 13;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.themeId;
        if (i3 != 0) {
            int i4 = 67 / 0;
        }
        return str;
    }

    public void setThemeId(String str) {
        int i = 2 % 2;
        int i2 = component3 + 27;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.themeId = str;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 47;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
