package com.huawei.digitalpayment.checkout.model.entity;

import com.huawei.http.BaseResp;
import java.util.List;

public class BankCardElementParams extends BaseResp {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    protected BankCardElementEnum bankCardElementEnum;
    protected boolean canVerifyByPayment;
    protected String key;
    protected String label;
    protected String oriValue;
    protected List<SelectInfo> selectList;
    protected String type;
    protected String value;

    public boolean isCanVerifyByPayment() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 83;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.canVerifyByPayment;
        int i4 = i2 + 63;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 0;
        }
        return z;
    }

    public void setCanVerifyByPayment(boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 123;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        this.canVerifyByPayment = z;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getValue() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 87;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.value;
        int i5 = i3 + 61;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setValue(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 29;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.value = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getKey() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 123;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.key;
        if (i3 != 0) {
            int i4 = 46 / 0;
        }
        return str;
    }

    public void setKey(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        this.key = str;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getLabel() {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.label;
        int i5 = i3 + 17;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setLabel(String str) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 49;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.label = str;
        int i5 = i2 + 13;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getType() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 117;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.type;
        int i5 = i3 + 55;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setType(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 3;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.type = str;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 39;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public String getOriValue() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.oriValue;
        int i5 = i3 + 41;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 88 / 0;
        }
        return str;
    }

    public void setOriValue(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 39;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.oriValue = str;
        if (i3 != 0) {
            int i4 = 85 / 0;
        }
    }

    public List<SelectInfo> getSelectList() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 77;
        copydefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        List<SelectInfo> list = this.selectList;
        int i4 = i2 + 73;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return list;
        }
        obj.hashCode();
        throw null;
    }

    public void setSelectList(List<SelectInfo> list) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 29;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.selectList = list;
        int i5 = i2 + 81;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public BankCardElementEnum getBankCardElementEnum() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 3;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        BankCardElementEnum bankCardElementEnum = this.bankCardElementEnum;
        int i5 = i2 + 89;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return bankCardElementEnum;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setBankCardElementEnum(BankCardElementEnum bankCardElementEnum) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 19;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.bankCardElementEnum = bankCardElementEnum;
        int i5 = i2 + 5;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }
}
