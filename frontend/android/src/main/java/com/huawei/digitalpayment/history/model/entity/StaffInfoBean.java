package com.huawei.digitalpayment.history.model.entity;

import com.huawei.http.BaseResp;

public class StaffInfoBean extends BaseResp {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private boolean checked;
    private String order;
    private String staffCode;
    private String staffName;

    public String getStaffCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 15;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.staffCode;
        int i5 = i2 + 39;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 42 / 0;
        }
        return str;
    }

    public void setStaffCode(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 95;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.staffCode = str;
        int i5 = i2 + 35;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 43 / 0;
        }
    }

    public String getStaffName() {
        int i = 2 % 2;
        int i2 = copydefault + 31;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.staffName;
        if (i3 != 0) {
            int i4 = 63 / 0;
        }
        return str;
    }

    public void setStaffName(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 41;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        this.staffName = str;
        if (i3 != 0) {
            throw null;
        }
    }

    public String getOrder() {
        int i = 2 % 2;
        int i2 = copydefault + 51;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.order;
        int i5 = i3 + 97;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 75 / 0;
        }
        return str;
    }

    public void setOrder(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.order = str;
        int i5 = i3 + 11;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 11 / 0;
        }
    }

    public boolean isChecked() {
        boolean z;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 123;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            z = this.checked;
            int i4 = 28 / 0;
        } else {
            z = this.checked;
        }
        int i5 = i2 + 45;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setChecked(boolean z) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 103;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        this.checked = z;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 51;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }
}
