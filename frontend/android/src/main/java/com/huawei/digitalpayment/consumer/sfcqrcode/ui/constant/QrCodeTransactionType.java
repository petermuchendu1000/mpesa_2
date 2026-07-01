package com.huawei.digitalpayment.consumer.sfcqrcode.ui.constant;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcqrcode/ui/constant/QrCodeTransactionType;", "", "<init>", "()V", "BUY_GOODS", "", "WITHDRAW_AGENT", "PAY_BILL", "SEND_MONEY", "SEND_TO_BUSINESS", "ConsumerSfcQrCodeUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QrCodeTransactionType {
    public static final int $stable = 0;
    public static final String BUY_GOODS = "01";
    public static final QrCodeTransactionType INSTANCE = new QrCodeTransactionType();
    public static final String PAY_BILL = "03";
    public static final String SEND_MONEY = "04";
    public static final String SEND_TO_BUSINESS = "05";
    private static int ShareDataUIState = 0;
    public static final String WITHDRAW_AGENT = "02";
    private static int component1 = 1;

    private QrCodeTransactionType() {
    }

    static {
        int i = ShareDataUIState + 53;
        component1 = i % 128;
        int i2 = i % 2;
    }
}
