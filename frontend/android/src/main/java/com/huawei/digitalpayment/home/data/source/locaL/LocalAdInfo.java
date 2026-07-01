package com.huawei.digitalpayment.home.data.source.locaL;

import java.io.Serializable;

public class LocalAdInfo implements Serializable {
    private static int component1 = 1;
    private static int copydefault = 0;
    private static final long serialVersionUID = 1768972802511320702L;
    private String execute;
    private String height;
    private String imgUrl;
    private int showInterval;
    private int showSeconds;
    private String width;

    public int getShowInterval() {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        int i5 = this.showInterval;
        int i6 = i3 + 69;
        copydefault = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setShowInterval(int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 51;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.showInterval = i;
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getShowSeconds() {
        int i = 2 % 2;
        int i2 = component1 + 119;
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
        int i3 = copydefault + 7;
        int i4 = i3 % 128;
        component1 = i4;
        int i5 = i3 % 2;
        this.showSeconds = i;
        int i6 = i4 + 101;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
    }

    public String getWidth() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 3;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.width;
        int i5 = i2 + 99;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setWidth(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 47;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.width = str;
        int i5 = i3 + 103;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getHeight() {
        int i = 2 % 2;
        int i2 = component1 + 123;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.height;
        int i5 = i3 + 31;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setHeight(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 7;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.height = str;
        int i5 = i3 + 91;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 76 / 0;
        }
    }

    public String getImgUrl() {
        int i = 2 % 2;
        int i2 = component1 + 125;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.imgUrl;
        int i5 = i3 + 65;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setImgUrl(String str) {
        int i = 2 % 2;
        int i2 = component1 + 95;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.imgUrl = str;
        if (i3 != 0) {
            int i4 = 48 / 0;
        }
    }

    public String getExecute() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 25;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.execute;
        int i5 = i2 + 1;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setExecute(String str) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 41;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.execute = str;
        int i5 = i2 + 65;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }
}
