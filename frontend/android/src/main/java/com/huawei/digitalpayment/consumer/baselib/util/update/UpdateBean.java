package com.huawei.digitalpayment.consumer.baselib.util.update;

import com.huawei.http.BaseResp;

public class UpdateBean extends BaseResp {
    private static int component2 = 1;
    private static int copydefault = 0;
    private static final long serialVersionUID = 4740377747090957887L;
    private String description;
    private String downloadUrl;
    private long laterTime = 0;
    private String latestVersion;
    private String updateMode;

    public String getUpdateMode() {
        int i = 2 % 2;
        int i2 = copydefault + 63;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.updateMode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setUpdateMode(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 103;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.updateMode = str;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getDescription() {
        int i = 2 % 2;
        int i2 = component2 + 93;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.description;
        int i4 = i3 + 47;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public void setDescription(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 123;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.description = str;
        int i5 = i3 + 119;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getLatestVersion() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 99;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.latestVersion;
        int i5 = i2 + 1;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setLatestVersion(String str) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 9;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.latestVersion = str;
        int i5 = i2 + 93;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 51 / 0;
        }
    }

    public String getDownloadUrl() {
        int i = 2 % 2;
        int i2 = component2 + 41;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.downloadUrl;
        int i5 = i3 + 57;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setDownloadUrl(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 87;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.downloadUrl = str;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public long getLaterTime() {
        int i = 2 % 2;
        int i2 = copydefault + 17;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        long j = this.laterTime;
        int i5 = i3 + 17;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public void setLaterTime(long j) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 113;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.laterTime = j;
        int i5 = i2 + 31;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 73 / 0;
        }
    }
}
