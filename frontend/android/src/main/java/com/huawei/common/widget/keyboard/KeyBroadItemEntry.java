package com.huawei.common.widget.keyboard;

import androidx.core.content.ContextCompat;
import com.alibaba.ariver.kernel.RVParams;
import com.blankj.utilcode.util.Utils;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.google.gson.annotations.SerializedName;
import com.huawei.common.R;
import com.iap.ac.android.region.cdp.util.CdpConstants;
import java.io.Serializable;

public class KeyBroadItemEntry implements MultiItemEntity, Serializable {
    private static final long serialVersionUID = 3620372836407940234L;

    @SerializedName(RVParams.AROME_BG_COLOR)
    private int bgColor;

    @SerializedName("heightWeight")
    private int heightWeight;

    @SerializedName("keyCode")
    private int keyCode;

    @SerializedName(CdpConstants.CONTENT_TEXT_COLOR)
    private int textColor;

    @SerializedName("type")
    private int type;

    @SerializedName("value")
    private String value;

    @SerializedName("widthWeight")
    private int widthWeight;

    @Override
    public int getItemType() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    public KeyBroadItemEntry(int i, String str, int i2) {
        this(i, str, i2, 1, 1);
    }

    public KeyBroadItemEntry(int i, String str, int i2, int i3, int i4) {
        this(i, str, i2, i3, i4, ContextCompat.getColor(Utils.getApp(), R.color.colorGround), ContextCompat.getColor(Utils.getApp(), R.color.colorMainText));
    }

    public KeyBroadItemEntry(int i, String str, int i2, int i3, int i4, int i5, int i6) {
        this.value = str;
        this.type = i;
        this.keyCode = i2;
        this.widthWeight = i3;
        this.heightWeight = i4;
        this.bgColor = i5;
        this.textColor = i6;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int i) {
        this.type = i;
    }

    public int getWidthWeight() {
        return this.widthWeight;
    }

    public void setWidthWeight(int i) {
        this.widthWeight = i;
    }

    public int getHeightWeight() {
        return this.heightWeight;
    }

    public void setHeightWeight(int i) {
        this.heightWeight = i;
    }

    public int getBgColor() {
        return this.bgColor;
    }

    public int getTextColor() {
        return this.textColor;
    }

    public int getKeyCode() {
        return this.keyCode;
    }

    public void setKeyCode(int i) {
        this.keyCode = i;
    }

    public void setBgColor(int i) {
        this.bgColor = i;
    }

    public void setTextColor(int i) {
        this.textColor = i;
    }
}
