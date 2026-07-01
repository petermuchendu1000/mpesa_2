package com.huawei.digitalpayment.checkout.resp;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/huawei/digitalpayment/checkout/resp/ReceiptTypes;", "", "<init>", "()V", "WITHDRAW", "", "SENDMONEY", "PAYBILL", "BUYGOODS", "POCHI", "WITHDRAW_NAME", "", "SENDMONEY_NAME", "PAYBILL_NAME", "BUYGOODS_NAME", "POCHI_NAME", "BUYAIRTIME_NAME", "RECEIPT_NAME", "STATEMENT_NAME", "WITHDRAWAL_ALT_NAME", "BUYGOODS_ALT_NAME", "ConsumerCheckOutUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReceiptTypes {
    public static final int $stable = 0;
    public static final String BUYAIRTIME_NAME = "Buy Airtime";
    public static final int BUYGOODS = 20010;
    public static final String BUYGOODS_ALT_NAME = "Customer Merchant Payment";
    public static final String BUYGOODS_NAME = "Buy Goods";
    public static final ReceiptTypes INSTANCE = new ReceiptTypes();
    public static final int PAYBILL = 20009;
    public static final String PAYBILL_NAME = "Pay Bill";
    public static final int POCHI = 20030;
    public static final String POCHI_NAME = "Pochi La Biashara";
    public static final String RECEIPT_NAME = "mpesa_receipt";
    public static final int SENDMONEY = 20020;
    public static final String SENDMONEY_NAME = "Send Money";
    public static final String STATEMENT_NAME = "mpesa_statement";
    private static int ShareDataUIState = 0;
    public static final int WITHDRAW = 20008;
    public static final String WITHDRAWAL_ALT_NAME = "Withdrawal";
    public static final String WITHDRAW_NAME = "Cash Out";
    private static int copydefault = 1;

    private ReceiptTypes() {
    }

    static {
        int i = ShareDataUIState + 97;
        copydefault = i % 128;
        int i2 = i % 2;
    }
}
