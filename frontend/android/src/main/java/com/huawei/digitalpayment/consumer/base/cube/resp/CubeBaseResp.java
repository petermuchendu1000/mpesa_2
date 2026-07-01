package com.huawei.digitalpayment.consumer.base.cube.resp;

import com.google.gson.annotations.SerializedName;
import com.huawei.http.BaseResp;

public class CubeBaseResp extends BaseResp {
    private static int component1 = 1;
    private static int component2;

    @SerializedName("errorMessage")
    private String msg;
    private String resCode;

    @SerializedName("responseMessage")
    private String resMsg;
    private String status;

    public String getMsg() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 85;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.msg;
        int i4 = i2 + 31;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public void setMsg(String str) {
        int i = 2 % 2;
        int i2 = component2 + 45;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.msg = str;
        if (i3 == 0) {
            int i4 = 24 / 0;
        }
    }

    public String getStatus() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 79;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.status;
        int i5 = i2 + 35;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 48 / 0;
        }
        return str;
    }

    public void setStatus(String str) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 91;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.status = str;
        int i5 = i2 + 123;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 32 / 0;
        }
    }

    public String getResCode() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 57;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.resCode;
        int i4 = i2 + 79;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 12 / 0;
        }
        return str;
    }

    public void setResCode(String str) {
        int i = 2 % 2;
        int i2 = component1 + 67;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.resCode = str;
        int i5 = i3 + 21;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getResMsg() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 21;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.resMsg;
        int i5 = i2 + 107;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 34 / 0;
        }
        return str;
    }

    public void setResMsg(String str) {
        int i = 2 % 2;
        int i2 = component1 + 125;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.resMsg = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
