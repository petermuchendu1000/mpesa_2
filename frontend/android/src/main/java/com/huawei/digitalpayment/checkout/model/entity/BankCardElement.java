package com.huawei.digitalpayment.checkout.model.entity;

import android.text.TextUtils;
import java.util.List;

public class BankCardElement extends BankCardElementParams {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    private String regular = "";
    private String errorMessage = "";

    public BankCardElement(BankCardElementParams bankCardElementParams, BankCardElementEnum bankCardElementEnum, List<SelectInfo> list) {
        this.key = bankCardElementParams.getKey();
        this.label = bankCardElementParams.getLabel();
        this.value = bankCardElementParams.getValue();
        this.bankCardElementEnum = bankCardElementEnum;
        this.canVerifyByPayment = bankCardElementParams.isCanVerifyByPayment();
        this.selectList = list;
        this.oriValue = bankCardElementParams.getOriValue();
        this.type = bankCardElementParams.getType();
    }

    @Override
    public String getOriValue() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 91;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        if (this.oriValue == null) {
            int i4 = copydefault + 53;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                this.oriValue = "";
                int i5 = 94 / 0;
            } else {
                this.oriValue = "";
            }
            int i6 = copydefault + 59;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
        }
        return this.oriValue;
    }

    public List<SelectInfo> getSelectInfos() {
        int i = 2 % 2;
        int i2 = copydefault + 5;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        List<SelectInfo> list = this.selectList;
        int i4 = copydefault + 93;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public void setSelectInfos(List<SelectInfo> list) {
        int i = 2 % 2;
        int i2 = copydefault + 87;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        this.selectList = list;
        if (i3 == 0) {
            int i4 = 87 / 0;
        }
        int i5 = copydefault + 65;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getRegular() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 117;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.regular;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setRegular(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 91;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.regular = str;
        int i5 = i2 + 51;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getErrorMessage() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 49;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.errorMessage;
            int i4 = 79 / 0;
        } else {
            str = this.errorMessage;
        }
        int i5 = i2 + 47;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setErrorMessage(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 117;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.errorMessage = str;
        int i5 = i3 + 119;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override
    public BankCardElementEnum getBankCardElementEnum() {
        int i;
        int i2;
        int i3 = 2 % 2;
        try {
            if (TextUtils.isEmpty(this.type)) {
                this.bankCardElementEnum = BankCardElementEnum.INPUT;
                i = ShareDataUIState + 115;
                i2 = i % 128;
            } else {
                this.bankCardElementEnum = BankCardElementEnum.valueOf(this.type);
                i = ShareDataUIState + 29;
                i2 = i % 128;
            }
            copydefault = i2;
            int i4 = i % 2;
        } catch (IllegalArgumentException unused) {
            this.bankCardElementEnum = BankCardElementEnum.INPUT;
        }
        return this.bankCardElementEnum;
    }

    public String getLbel() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault + 99;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            str = this.label;
            int i3 = 3 / 0;
        } else {
            str = this.label;
        }
        int i4 = copydefault + 77;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 24 / 0;
        }
        return str;
    }

    public List<SelectInfo> getSelectItems() {
        int i = 2 % 2;
        int i2 = copydefault + 47;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            List<SelectInfo> list = this.selectList;
            throw null;
        }
        List<SelectInfo> list2 = this.selectList;
        int i3 = ShareDataUIState + 123;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return list2;
    }

    public void setSelectItems(List<SelectInfo> list) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.selectList = list;
        if (i3 != 0) {
            int i4 = 36 / 0;
        }
        int i5 = copydefault + 73;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }
}
