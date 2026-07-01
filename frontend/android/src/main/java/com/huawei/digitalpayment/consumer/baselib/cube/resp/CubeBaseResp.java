package com.huawei.digitalpayment.consumer.baselib.cube.resp;

import com.google.gson.annotations.SerializedName;
import com.huawei.http.BaseResp;

public class CubeBaseResp extends BaseResp {
    private static int ShareDataUIState = 1;
    private static int component3;

    @SerializedName("errorMessage")
    private String msg;
    private String resCode;

    @SerializedName("responseMessage")
    private String resMsg;
    private String status;

    public String getMsg() {
        int i = 2 % 2;
        int i2 = component3 + 37;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.msg;
        int i5 = i3 + 43;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setMsg(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 39;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.msg = str;
        int i5 = i3 + 57;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 63 / 0;
        }
    }

    public String getStatus() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 1;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            str = this.status;
            int i4 = 68 / 0;
        } else {
            str = this.status;
        }
        int i5 = i3 + 55;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public void setStatus(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 5;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.status = str;
        if (i4 != 0) {
            int i5 = 98 / 0;
        }
        int i6 = i3 + 45;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public String getResCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.resCode;
        }
        throw null;
    }

    public void setResCode(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 93;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.resCode = str;
        int i5 = i2 + 7;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getResMsg() {
        int i = 2 % 2;
        int i2 = component3 + 25;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.resMsg;
        if (i3 == 0) {
            int i4 = 23 / 0;
        }
        return str;
    }

    public void setResMsg(String str) {
        int i = 2 % 2;
        int i2 = component3 + 119;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.resMsg = str;
        int i5 = i3 + 93;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
