package com.huawei.digitalpayment.checkout.model.entity;

import com.huawei.http.BaseResp;

public class HomeBannerBean extends BaseResp {
    private static int component3 = 1;
    private static int copydefault;
    private String bulletin;
    private String endTime;
    private String execute;
    private String imgUrl;
    private String order;
    private int showSeconds;
    private String startTime;

    public String getImgUrl() {
        int i = 2 % 2;
        int i2 = component3 + 49;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.imgUrl;
        int i4 = i3 + 23;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public void setImgUrl(String str) {
        int i = 2 % 2;
        int i2 = component3 + 29;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.imgUrl = str;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 69;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public int getShowSeconds() {
        int i = 2 % 2;
        int i2 = component3 + 83;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.showSeconds;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setShowSeconds(int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 71;
        int i4 = i3 % 128;
        component3 = i4;
        int i5 = i3 % 2;
        this.showSeconds = i;
        int i6 = i4 + 79;
        copydefault = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getStartTime() {
        int i = 2 % 2;
        int i2 = component3 + 97;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.startTime;
        if (i3 != 0) {
            int i4 = 89 / 0;
        }
        return str;
    }

    public void setStartTime(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 85;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.startTime = str;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getEndTime() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 59;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.endTime;
        int i5 = i2 + 121;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setEndTime(String str) {
        int i = 2 % 2;
        int i2 = component3 + 95;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.endTime = str;
        int i5 = i3 + 61;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getExecute() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 81;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.execute;
        int i5 = i2 + 15;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setExecute(String str) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 63;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.execute = str;
        int i5 = i2 + 1;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getBulletin() {
        int i = 2 % 2;
        int i2 = component3 + 121;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.bulletin;
        if (i3 != 0) {
            int i4 = 89 / 0;
        }
        return str;
    }

    public void setBulletin(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 35;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.bulletin = str;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 71;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 12 / 0;
        }
    }

    public String getOrder() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 101;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.order;
        int i5 = i2 + 61;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public void setOrder(String str) {
        int i = 2 % 2;
        int i2 = component3 + 105;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.order = str;
        int i5 = i3 + 13;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 80 / 0;
        }
    }
}
