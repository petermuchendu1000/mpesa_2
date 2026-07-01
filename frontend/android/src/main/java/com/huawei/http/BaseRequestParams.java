package com.huawei.http;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class BaseRequestParams implements Serializable {
    private static final long serialVersionUID = 9134740115331648295L;

    @Extension
    private Map<String, Object> extension;

    public Map<String, Object> getExtension() {
        return this.extension;
    }

    public void setExtension(Map<String, Object> map) {
        this.extension = map;
    }

    public BaseRequestParams addParams(String str, String str2) {
        return addParams(str, (Object) str2);
    }

    public BaseRequestParams addParams(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            if (this.extension == null) {
                this.extension = new HashMap();
            }
            this.extension.put(str, obj);
        }
        return this;
    }
}
