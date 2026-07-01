package com.huawei.digitalpayment.checkout.util;

import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/huawei/digitalpayment/checkout/util/EncryptPinManager;", "", "<init>", "()V", KeysConstants.KEY_ENCRYPT_PIN, "", "getEncryptPin", "setEncryptPin", "", "ConsumerCheckOutUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EncryptPinManager {
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static String component3 = null;
    private static int copydefault = 1;
    public static final EncryptPinManager INSTANCE = new EncryptPinManager();
    public static final int $stable = 8;

    private EncryptPinManager() {
    }

    public final String getEncryptPin() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 97;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = component3;
        int i4 = i2 + 75;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void setEncryptPin(String encryptPin) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 11;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        component3 = encryptPin;
        int i5 = i2 + 123;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 67 / 0;
        }
    }

    static {
        int i = ShareDataUIState + 103;
        component2 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
