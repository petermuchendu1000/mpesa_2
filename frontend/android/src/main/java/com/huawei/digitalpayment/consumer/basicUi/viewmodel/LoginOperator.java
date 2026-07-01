package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/basicUi/viewmodel/LoginOperator;", "", "<init>", "(Ljava/lang/String;I)V", "OPEN_FACE_ID_LOGIN", "CLOSE_FACE_ID_LOGIN", "OPEN_FINGERPRINT_LOGIN", "CLOSE_FINGERPRINT_LOGIN", "ConsumerBasicUiModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LoginOperator {
    private static final EnumEntries $ENTRIES;
    private static final LoginOperator[] $VALUES;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;
    public static final LoginOperator OPEN_FACE_ID_LOGIN = new LoginOperator("OPEN_FACE_ID_LOGIN", 0);
    public static final LoginOperator CLOSE_FACE_ID_LOGIN = new LoginOperator("CLOSE_FACE_ID_LOGIN", 1);
    public static final LoginOperator OPEN_FINGERPRINT_LOGIN = new LoginOperator("OPEN_FINGERPRINT_LOGIN", 2);
    public static final LoginOperator CLOSE_FINGERPRINT_LOGIN = new LoginOperator("CLOSE_FINGERPRINT_LOGIN", 3);

    private LoginOperator(String str, int i) {
    }

    static {
        LoginOperator[] loginOperatorArr$values = $values();
        $VALUES = loginOperatorArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(loginOperatorArr$values);
        int i = component1 + 125;
        component2 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static LoginOperator valueOf(String str) {
        int i = 2 % 2;
        int i2 = component3 + 83;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        LoginOperator loginOperator = (LoginOperator) Enum.valueOf(LoginOperator.class, str);
        int i4 = component3 + 125;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return loginOperator;
        }
        throw null;
    }

    public static LoginOperator[] values() {
        int i = 2 % 2;
        int i2 = component3 + 21;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return (LoginOperator[]) $VALUES.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final LoginOperator[] $values() {
        int i = 2 % 2;
        int i2 = component3 + 95;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        LoginOperator loginOperator = OPEN_FACE_ID_LOGIN;
        if (i3 != 0) {
            return new LoginOperator[]{loginOperator, CLOSE_FACE_ID_LOGIN, OPEN_FINGERPRINT_LOGIN, CLOSE_FINGERPRINT_LOGIN};
        }
        LoginOperator loginOperator2 = CLOSE_FACE_ID_LOGIN;
        LoginOperator loginOperator3 = OPEN_FINGERPRINT_LOGIN;
        LoginOperator loginOperator4 = CLOSE_FINGERPRINT_LOGIN;
        LoginOperator[] loginOperatorArr = new LoginOperator[3];
        loginOperatorArr[1] = loginOperator;
        loginOperatorArr[1] = loginOperator2;
        loginOperatorArr[5] = loginOperator3;
        loginOperatorArr[5] = loginOperator4;
        return loginOperatorArr;
    }

    public static EnumEntries<LoginOperator> getEntries() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 59;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<LoginOperator> enumEntries = $ENTRIES;
        int i5 = i2 + 113;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }
}
