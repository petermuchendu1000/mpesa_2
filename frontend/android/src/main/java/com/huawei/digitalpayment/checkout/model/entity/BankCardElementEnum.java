package com.huawei.digitalpayment.checkout.model.entity;

import com.alipay.plus.security.lite.SecureLiteSignatureDefine;
import com.blankj.utilcode.constant.PermissionConstants;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.model.LoginWay;
import com.huawei.digitalpayment.customer.dynamics.model.DynamicsElementTypeConstants;
import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
public final class BankCardElementEnum implements Serializable {
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    public static final BankCardElementEnum INPUT = new BankCardElementEnum(SecureLiteSignatureDefine.OPEN_KEY_SIGN_INPUT, 0);
    public static final BankCardElementEnum PHONE = new BankCardElementEnum(PermissionConstants.PHONE, 1);
    public static final BankCardElementEnum ENUM = new BankCardElementEnum("ENUM", 2);
    public static final BankCardElementEnum OTP = new BankCardElementEnum(LoginWay.KEY_OTP, 3);
    public static final BankCardElementEnum DATE = new BankCardElementEnum(DynamicsElementTypeConstants.DATE, 4);
    public static final BankCardElementEnum EMAIL = new BankCardElementEnum("EMAIL", 5);
    private static final BankCardElementEnum[] $VALUES = $values();

    private static BankCardElementEnum[] $values() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 87;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        BankCardElementEnum[] bankCardElementEnumArr = {INPUT, PHONE, ENUM, OTP, DATE, EMAIL};
        int i5 = i2 + 21;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return bankCardElementEnumArr;
    }

    private BankCardElementEnum(String str, int i) {
    }

    public static BankCardElementEnum valueOf(String str) {
        int i = 2 % 2;
        int i2 = component2 + 55;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        BankCardElementEnum bankCardElementEnum = (BankCardElementEnum) Enum.valueOf(BankCardElementEnum.class, str);
        int i4 = component3 + 15;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return bankCardElementEnum;
    }

    public static BankCardElementEnum[] values() {
        BankCardElementEnum[] bankCardElementEnumArr;
        int i = 2 % 2;
        int i2 = component2 + 115;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            bankCardElementEnumArr = (BankCardElementEnum[]) $VALUES.clone();
            int i3 = 83 / 0;
        } else {
            bankCardElementEnumArr = (BankCardElementEnum[]) $VALUES.clone();
        }
        int i4 = component2 + 31;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return bankCardElementEnumArr;
    }

    static {
        int i = ShareDataUIState + 47;
        component1 = i % 128;
        int i2 = i % 2;
    }
}
