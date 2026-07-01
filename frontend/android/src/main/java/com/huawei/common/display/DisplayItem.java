package com.huawei.common.display;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class DisplayItem implements Serializable {
    private static final long serialVersionUID = 3620372832327940234L;

    @SerializedName(alternate = {"value"}, value = "content")
    private String content;
    private String key = "";

    @SerializedName(alternate = {"label"}, value = "title")
    private String title;

    public DisplayItem(String str, String str2) {
        this.title = str;
        this.content = str2;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String str) {
        this.key = str;
    }
}
