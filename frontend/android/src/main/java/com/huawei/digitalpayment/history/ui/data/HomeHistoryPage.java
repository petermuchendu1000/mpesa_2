package com.huawei.digitalpayment.history.ui.data;

import com.huawei.http.BaseResp;

public class HomeHistoryPage extends BaseResp {
    public static final String HORIZONTAL = "horizontal";
    public static final String VERTICAL = "vertical";
    private static int component2 = 1;
    private static int component3 = 0;
    private static final long serialVersionUID = 4418197126631017762L;
    private Integer backgroundColor;
    private String backgroundUrl;
    private String componentType;
    private Integer itemBackgroundColor;
    private int itemRoundCorner;
    private int marginBottom;
    private int marginEnd;
    private int marginStart;
    private int marginTop;
    private int maxCount;
    private String style;
    private String subTitle;
    private Integer subTitleColor;
    private String subTitleExecute;
    private String title;

    public String getBackgroundUrl() {
        int i = 2 % 2;
        int i2 = component2 + 83;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.backgroundUrl;
        int i5 = i3 + 17;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 99 / 0;
        }
        return str;
    }

    public void setBackgroundUrl(String str) {
        int i = 2 % 2;
        int i2 = component2 + 37;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.backgroundUrl = str;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 29;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 31 / 0;
        }
    }

    public String getComponentType() {
        int i = 2 % 2;
        int i2 = component3 + 29;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.componentType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setComponentType(String str) {
        int i = 2 % 2;
        int i2 = component2 + 119;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.componentType = str;
        int i5 = i3 + 89;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 92 / 0;
        }
    }

    public String getTitle() {
        int i = 2 % 2;
        int i2 = component2 + 61;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 47;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setTitle(String str) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 9;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.title = str;
        int i5 = i2 + 109;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getSubTitle() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 125;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.subTitle;
        int i5 = i2 + 119;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setSubTitle(String str) {
        int i = 2 % 2;
        int i2 = component3 + 11;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.subTitle = str;
        if (i3 == 0) {
            throw null;
        }
    }

    public Integer getSubTitleColor() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 5;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.subTitleColor;
        int i5 = i2 + 85;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public void setSubTitleColor(Integer num) {
        int i = 2 % 2;
        int i2 = component3 + 11;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.subTitleColor = num;
        int i5 = i3 + 5;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getSubTitleExecute() {
        int i = 2 % 2;
        int i2 = component2 + 103;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.subTitleExecute;
        int i5 = i3 + 85;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setSubTitleExecute(String str) {
        int i = 2 % 2;
        int i2 = component2 + 7;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.subTitleExecute = str;
        int i5 = i3 + 93;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public Integer getBackgroundColor() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 101;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.backgroundColor;
        int i5 = i2 + 71;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public void setBackgroundColor(Integer num) {
        int i = 2 % 2;
        int i2 = component3 + 11;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.backgroundColor = num;
        int i5 = i3 + 83;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getStyle() {
        int i = 2 % 2;
        int i2 = component2 + 41;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.style;
        if (i3 != 0) {
            int i4 = 18 / 0;
        }
        return str;
    }

    public void setStyle(String str) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 73;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.style = str;
        if (i4 == 0) {
            int i5 = 6 / 0;
        }
        int i6 = i2 + 123;
        component2 = i6 % 128;
        int i7 = i6 % 2;
    }

    public Integer getItemBackgroundColor() {
        int i = 2 % 2;
        int i2 = component2 + 5;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer num = this.itemBackgroundColor;
        int i4 = i3 + 97;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    public void setItemBackgroundColor(Integer num) {
        int i = 2 % 2;
        int i2 = component2 + 9;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.itemBackgroundColor = num;
        int i5 = i3 + 67;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public int getMarginTop() {
        int i = 2 % 2;
        int i2 = component2 + 51;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = this.marginTop;
        int i6 = i3 + 95;
        component2 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 56 / 0;
        }
        return i5;
    }

    public void setMarginTop(int i) {
        int i2 = 2 % 2;
        int i3 = component3 + 113;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.marginTop = i;
        if (i4 == 0) {
            throw null;
        }
    }

    public int getMarginBottom() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 115;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.marginBottom;
        int i6 = i2 + 87;
        component3 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 38 / 0;
        }
        return i5;
    }

    public void setMarginBottom(int i) {
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 115;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        this.marginBottom = i;
        if (i5 != 0) {
            int i6 = 85 / 0;
        }
        int i7 = i3 + 79;
        component3 = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    public int getMarginStart() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 77;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.marginStart;
        int i6 = i2 + 17;
        component2 = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setMarginStart(int i) {
        int i2 = 2 % 2;
        int i3 = component2 + 77;
        int i4 = i3 % 128;
        component3 = i4;
        int i5 = i3 % 2;
        this.marginStart = i;
        int i6 = i4 + 65;
        component2 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 28 / 0;
        }
    }

    public int getMarginEnd() {
        int i = 2 % 2;
        int i2 = component3 + 65;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = this.marginEnd;
        int i6 = i3 + 49;
        component3 = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setMarginEnd(int i) {
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 57;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        this.marginEnd = i;
        int i6 = i3 + 51;
        component3 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 52 / 0;
        }
    }

    public int getMaxCount() {
        int i = 2 % 2;
        int i2 = component2 + 123;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.maxCount;
        int i5 = i3 + 47;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 85 / 0;
        }
        return i4;
    }

    public void setMaxCount(int i) {
        int i2 = 2 % 2;
        int i3 = component3 + 97;
        int i4 = i3 % 128;
        component2 = i4;
        int i5 = i3 % 2;
        this.maxCount = i;
        int i6 = i4 + 115;
        component3 = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getItemRoundCorner() {
        int i = 2 % 2;
        int i2 = component3 + 5;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.itemRoundCorner;
        }
        throw null;
    }

    public void setItemRoundCorner(int i) {
        int i2 = 2 % 2;
        int i3 = component2 + 11;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.itemRoundCorner = i;
        if (i4 != 0) {
            int i5 = 13 / 0;
        }
    }
}
