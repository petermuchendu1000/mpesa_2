package com.huawei.digitalpayment.consumer.sfcqrcode.ui.resp;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcqrcode/ui/resp/QrCodeTypeItems;", "", "<init>", "()V", "PAY_MECHANT", "", "WITHDRAW_CASH", "PAY_BILL", "SEND_MONEY", "SEND_TO_BUSINESS", "TBC", "ConsumerSfcQrCodeUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QrCodeTypeItems {
    public static final int $stable = 0;
    public static final QrCodeTypeItems INSTANCE = new QrCodeTypeItems();
    public static final String PAY_BILL = "3";
    public static final String PAY_MECHANT = "1";
    public static final String SEND_MONEY = "4";
    public static final String SEND_TO_BUSINESS = "5";
    public static final String TBC = "6";
    public static final String WITHDRAW_CASH = "2";
    private static int component1 = 0;
    private static int component3 = 1;

    private QrCodeTypeItems() {
    }

    static {
        int i = component1 + 111;
        component3 = i % 128;
        if (i % 2 == 0) {
            int i2 = 81 / 0;
        }
    }
}
