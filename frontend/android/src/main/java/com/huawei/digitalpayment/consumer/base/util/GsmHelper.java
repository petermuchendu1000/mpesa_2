package com.huawei.digitalpayment.consumer.base.util;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/util/GsmHelper;", "", "<init>", "()V", "gsmLogin", "", "gsmLoginRequest", "getGsmLoginRequest", "()Z", "setGsmLoginRequest", "(Z)V", "setGsmLogin", "", "login", "isGsmLogin", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GsmHelper {
    public static final GsmHelper INSTANCE = new GsmHelper();
    private static int ShareDataUIState = 1;
    private static boolean component1 = false;
    private static boolean component2 = false;
    private static int component3 = 0;
    private static int copydefault = 0;
    private static int equals = 1;

    private GsmHelper() {
    }

    public final boolean getGsmLoginRequest() {
        int i = 2 % 2;
        int i2 = equals + 67;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        boolean z = component2;
        int i5 = i3 + 3;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final void setGsmLoginRequest(boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 7;
        equals = i2 % 128;
        int i3 = i2 % 2;
        component2 = z;
        if (i3 == 0) {
            throw null;
        }
    }

    public final void setGsmLogin(boolean login) {
        int i = 2 % 2;
        int i2 = equals + 61;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        component1 = login;
        if (i3 != 0) {
            int i4 = 94 / 0;
        }
    }

    public final boolean isGsmLogin() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 77;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = component1;
        int i5 = i2 + 41;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    static {
        int i = copydefault + 101;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }
}
