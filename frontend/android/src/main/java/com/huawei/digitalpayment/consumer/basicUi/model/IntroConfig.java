package com.huawei.digitalpayment.consumer.basicUi.model;

import com.huawei.http.BaseResp;

public class IntroConfig extends BaseResp {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private String imageContent;
    private int imageContentRes;
    private String imageUrl;
    private int imageUrlRes;

    public String getImageContent() {
        int i = 2 % 2;
        int i2 = component2 + 79;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.imageContent;
        int i5 = i3 + 95;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 38 / 0;
        }
        return str;
    }

    public void setImageContent(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 107;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.imageContent = str;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 25;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getImageUrl() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 95;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.imageUrl;
        int i5 = i3 + 3;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setImageUrl(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 37;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.imageUrl = str;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getImageContentRes() {
        int i;
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 35;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            i = this.imageContentRes;
            int i5 = 7 / 0;
        } else {
            i = this.imageContentRes;
        }
        int i6 = i3 + 71;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public void setImageContentRes(int i) {
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 103;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        this.imageContentRes = i;
        int i6 = i3 + 49;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public int getImageUrlRes() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 119;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.imageUrlRes;
        int i6 = i2 + 41;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public void setImageUrlRes(int i) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 1;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.imageUrlRes = i;
        if (i4 == 0) {
            throw null;
        }
    }
}
