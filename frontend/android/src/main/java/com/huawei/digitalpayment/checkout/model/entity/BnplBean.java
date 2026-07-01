package com.huawei.digitalpayment.checkout.model.entity;

import com.huawei.http.BaseResp;

public class BnplBean extends BaseResp {
    private static int component3 = 0;
    private static int copydefault = 1;
    private String feeDispaly;
    private boolean isSelected;
    private String principalDispaly;
    private String productId;
    private String productName;

    public String getProductName() {
        int i = 2 % 2;
        int i2 = component3 + 83;
        int i3 = i2 % 128;
        copydefault = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.productName;
        int i4 = i3 + 33;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public void setProductName(String str) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 49;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.productName = str;
        if (i4 != 0) {
            int i5 = 53 / 0;
        }
        int i6 = i2 + 9;
        component3 = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getProductId() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault + 115;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            str = this.productId;
            int i4 = 45 / 0;
        } else {
            str = this.productId;
        }
        int i5 = i3 + 55;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public void setProductId(String str) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 123;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.productId = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 75;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public boolean isSelected() {
        int i = 2 % 2;
        int i2 = component3 + 69;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.isSelected;
        }
        throw null;
    }

    public void setSelected(boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 55;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.isSelected = z;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 101;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 46 / 0;
        }
    }

    public String getPrincipalDispaly() {
        int i = 2 % 2;
        int i2 = copydefault + 25;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.principalDispaly;
        if (i3 != 0) {
            int i4 = 26 / 0;
        }
        return str;
    }

    public void setPrincipalDispaly(String str) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 95;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.principalDispaly = str;
        if (i4 == 0) {
            int i5 = 72 / 0;
        }
        int i6 = i2 + 29;
        copydefault = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getFeeDispaly() {
        int i = 2 % 2;
        int i2 = copydefault + 77;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.feeDispaly;
        }
        throw null;
    }

    public void setFeeDispaly(String str) {
        int i = 2 % 2;
        int i2 = component3 + 29;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.feeDispaly = str;
        int i5 = i3 + 61;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }
}
