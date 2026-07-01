package com.huawei.digitalpayment.consumer.sfcqrcode.ui.constant;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcqrcode/ui/constant/RoutePathConstant;", "", "<init>", "()V", "SFC_SCAN_TO_PAY", "", "SEND_MONEY", "SFC_PESA", "WITHDRAW", "ConsumerSfcQrCodeUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RoutePathConstant {
    public static final int $stable = 0;
    public static final RoutePathConstant INSTANCE = new RoutePathConstant();
    public static final String SEND_MONEY = "/sfcModule/sendMoney";
    public static final String SFC_PESA = "/sfcModule/mpesaPay";
    public static final String SFC_SCAN_TO_PAY = "/sfcQrCodeModule/scanToPay";
    public static final String WITHDRAW = "/sfcModule/withdraw";
    private static int component2 = 1;
    private static int copydefault;

    private RoutePathConstant() {
    }

    static {
        int i = copydefault + 67;
        component2 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
